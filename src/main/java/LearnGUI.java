import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LearnGUI {
    private JButton createArrayBtn;
    private JButton median;
    private JButton mean;
    private JButton max;
    private JButton min;
    private JButton createArrayListBtn;
    private JList<Object> displayList;
    private JTextArea displayText;
    private JPanel panelMain;
    private JList<Object> displayAMA;
    private JButton AMABtn;
    private int size = 6;
    private double[] array = new double[size];
    private double[] ascendingMinimaArray = new double[0];
    private ArrayList<Double> arrayList = new ArrayList<>(size);
    private ArrayList<Double> ascendingMinimaArrayList = new ArrayList<>();
    private boolean arrayValues = true;  // if true then array else arrayList

    private LearnGUI() {
        createArrayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<Object> listModel = new DefaultListModel<>();
                listModel.clear();
                for(int i=0;i<size;i++)
                {
                    array[i] = (Math.random() * 100 - 50);
                    listModel.addElement(array[i]);
                }
                arrayValues = true;
                displayList.setModel(listModel);

            }
        });

        createArrayListBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arrayList.clear();
                for(int i=0;i<size;i++)
                {
                    arrayList.add(Math.random() * 100 - 50);
                }
                arrayValues = false;
                displayList.setListData(arrayList.toArray());
            }
        });

        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (arrayValues){
                    displayText.setText("Min is " + String.valueOf(Statistics.minOfArray(array)));
                } else {
                    displayText.setText("Min is " + String.valueOf(Statistics.minOfArrayList(arrayList)));
                }
            }
        });
        max.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (arrayValues){
                    displayText.setText("Max is " + String.valueOf(Statistics.maxOfArray(array)));
                } else {
                    displayText.setText("Max is " + String.valueOf(Statistics.maxOfArrayList(arrayList)));
                }
            }
        });

        mean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (arrayValues){
                    displayText.setText("Mean is " + String.valueOf(Statistics.meanOfArray(array)));
                } else {
                    displayText.setText("Mean is " + String.valueOf(Statistics.meanOfArrayList(arrayList)));
                }
            }
        });

        median.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (arrayValues){
                    displayText.setText("Median is " + String.valueOf(Statistics.medianOfArray(array)));
                } else {
                    displayText.setText("Median is " + String.valueOf(Statistics.medianOfArrayList(arrayList)));
                }
            }
        });

        AMABtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (arrayValues){
                    ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
                    DefaultListModel<Object> listModel = new DefaultListModel<>();
                    listModel.clear();
                    for (double value: ascendingMinimaArray) {
                        listModel.addElement(value);
                    }
                    displayAMA.setModel(listModel);
                } else {
                    ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
                    displayAMA.setListData(ascendingMinimaArrayList.toArray());
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("LearnGui");
        mainFrame.setContentPane(new LearnGUI().panelMain);
        //mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);


    }
}
