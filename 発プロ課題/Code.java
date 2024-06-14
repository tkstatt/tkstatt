import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Code {

    public void perform(){

        // ウィンドウ（フレーム）を生成する
        JFrame mainFrame = new JFrame("MainMenu");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 50, 575, 400);

        // ボタン1(左上)を作成
        JButton nekoButton = new JButton();
        nekoButton.setBounds(50, 50, 200, 100);
        nekoButton.setHorizontalAlignment(JButton.CENTER);

        // ボタン2(右上)を作成
        JButton foodButton = new JButton();
        foodButton.setBounds(300, 50, 200, 100);
        foodButton.setHorizontalAlignment(JButton.CENTER);

        // ボタン3(左下)を作成
        JButton placeButton = new JButton();
        placeButton.setBounds(50, 200, 200, 100);
        placeButton.setHorizontalAlignment(JButton.CENTER);

        // ボタン4(右下))を作成
        JButton noneButton = new JButton();
        noneButton.setBounds(300, 200, 200, 100);
        noneButton.setHorizontalAlignment(JButton.CENTER);

        // 画像アイコンを作成
        ImageIcon nekoIcon = new ImageIcon("picture/neko.png");
        ImageIcon foodIcon = new ImageIcon("picture/food.png");
        ImageIcon placeIcon = new ImageIcon("picture/place.png");
        ImageIcon noneIcon = new ImageIcon("picture/none.png");


        // 一枚目のアクションを変数に入れる
        ActionListener neko1Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame nekoFrame1 = new JFrame("neko1");
                nekoFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                nekoFrame1.setBounds(110, 60, 1000, 750);
                ImageIcon nekoimg1 = new ImageIcon("picture/neko1.jpg");
                JLabel nekoLabel1 = new JLabel(nekoimg1);
                nekoFrame1.add(nekoLabel1);
                nekoFrame1.setVisible(true);
            }
        };
        ActionListener food1Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame foodFrame1 = new JFrame("food1");
                foodFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                foodFrame1.setBounds(110, 60, 1000, 750);
                ImageIcon foodimg1 = new ImageIcon("picture/food1.jpg");
                JLabel foodLabel1 = new JLabel(foodimg1);
                foodFrame1.add(foodLabel1);
                foodFrame1.setVisible(true);
            }
        };
        ActionListener place1Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame placeFrame1 = new JFrame("place1");
                placeFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                placeFrame1.setBounds(110, 60, 1000, 750);
                ImageIcon placeimg1 = new ImageIcon("picture/place1.jpg");
                JLabel placeLabel1 = new JLabel(placeimg1);
                placeFrame1.add(placeLabel1);
                placeFrame1.setVisible(true);
            }
        };


        // 二枚目のアクションを変数に入れる
        ActionListener neko2Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame nekoFrame2 = new JFrame("neko2");
                nekoFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                nekoFrame2.setBounds(110, 60, 1000, 750);
                ImageIcon nekoimg2 = new ImageIcon("picture/neko2.jpg");
                JLabel nekoLabel2 = new JLabel(nekoimg2);
                nekoFrame2.add(nekoLabel2);
                nekoFrame2.setVisible(true);
            }
        };
        ActionListener food2Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame foodFrame2 = new JFrame("food2");
                foodFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                foodFrame2.setBounds(110, 60, 1000, 750);
                ImageIcon foodimg2 = new ImageIcon("picture/food2.jpg");
                JLabel foodLabel2 = new JLabel(foodimg2);
                foodFrame2.add(foodLabel2);
                foodFrame2.setVisible(true);
            }
        };
        ActionListener place2Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame placeFrame2 = new JFrame("place2");
                placeFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                placeFrame2.setBounds(110, 60, 1000, 750);
                ImageIcon placeimg2 = new ImageIcon("picture/place2.jpg");
                JLabel placeLabel2 = new JLabel(placeimg2);
                placeFrame2.add(placeLabel2);
                placeFrame2.setVisible(true);
            }
        };


        // 三枚目のアクションを変数に入れる
        ActionListener neko3Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame nekoFrame3 = new JFrame("neko3");
                nekoFrame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                nekoFrame3.setBounds(110, 60, 1000, 750);
                ImageIcon nekoimg3 = new ImageIcon("picture/neko3.jpg");
                JLabel nekoLabel3 = new JLabel(nekoimg3);
                nekoFrame3.add(nekoLabel3);
                nekoFrame3.setVisible(true);
            }
        };
        ActionListener food3Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame foodFrame3 = new JFrame("food3");
                foodFrame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                foodFrame3.setBounds(110, 60, 1000, 750);
                ImageIcon foodimg3 = new ImageIcon("picture/food3.jpg");
                JLabel foodLabel3 = new JLabel(foodimg3);
                foodFrame3.add(foodLabel3);
                foodFrame3.setVisible(true);
            }
        };
        ActionListener place3Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame placeFrame3 = new JFrame("place3");
                placeFrame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                placeFrame3.setBounds(110, 60, 1000, 750);
                ImageIcon placeimg3 = new ImageIcon("picture/place3.jpg");
                JLabel placeLabel3 = new JLabel(placeimg3);
                placeFrame3.add(placeLabel3);
                placeFrame3.setVisible(true);
            }
        };


        // 四枚目のアクションを変数に入れる
        ActionListener neko4Action  = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame nekoFrame4 = new JFrame("neko4");
                nekoFrame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                nekoFrame4.setBounds(110, 60, 1000, 750);
                ImageIcon nekoimg4 = new ImageIcon("picture/neko4.jpg");
                JLabel nekoLabel4 = new JLabel(nekoimg4);
                nekoFrame4.add(nekoLabel4);
                nekoFrame4.setVisible(true);
            }
        };
        ActionListener food4Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame foodFrame4 = new JFrame("food4");
                foodFrame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                foodFrame4.setBounds(110, 60, 1000, 750);
                ImageIcon foodimg4 = new ImageIcon("picture/food4.jpg");
                JLabel foodLabel4 = new JLabel(foodimg4);
                foodFrame4.add(foodLabel4);
                foodFrame4.setVisible(true);
            }
        };
        ActionListener place4Action =new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame placeFrame4 = new JFrame("place4");
                placeFrame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                placeFrame4.setBounds(110, 60, 1000, 750);
                ImageIcon placeimg4 = new ImageIcon("picture/place4.jpg");
                JLabel placeLabel4 = new JLabel(placeimg4);
                placeFrame4.add(placeLabel4);
                placeFrame4.setVisible(true);
            }
        };


        // 五枚目のアクションを変数に入れる
        ActionListener neko5Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame nekoFrame5 = new JFrame("neko5");
                nekoFrame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                nekoFrame5.setBounds(110, 60, 1000, 750);
                ImageIcon nekoimg5 = new ImageIcon("picture/neko5.jpg");
                JLabel nekoLabel5 = new JLabel(nekoimg5);
                nekoFrame5.add(nekoLabel5);
                nekoFrame5.setVisible(true);
            }
        };
        ActionListener food5Action = new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame foodFrame5 = new JFrame("food5");
                foodFrame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                foodFrame5.setBounds(110, 60, 1000, 750);
                ImageIcon foodimg5 = new ImageIcon("picture/food5.jpg");
                JLabel foodLabel5 = new JLabel(foodimg5);
                foodFrame5.add(foodLabel5);
                foodFrame5.setVisible(true);
            }
        };
        ActionListener place5Action =new ActionListener() {
            public void actionPerformed(ActionEvent anEvent) {
                JFrame placeFrame5 = new JFrame("place5");
                placeFrame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                placeFrame5.setBounds(110, 60, 1000, 750);
                ImageIcon placeimg5 = new ImageIcon("picture/place5.jpg");
                JLabel placeLabel5 = new JLabel(placeimg5);
                placeFrame5.add(placeLabel5);
                placeFrame5.setVisible(true);
            }
        }; 

        // タイマーを作成
        Timer timer = new Timer(7500, new ActionListener() {
            private int count = 1;

            // 設定時間経過後の動作
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == 1) {


                    // 一枚目の画像
                    nekoButton.removeActionListener(neko5Action);
                    ImageIcon nekoIcon1 = new ImageIcon("picture/neko1_1.jpg");
                    nekoButton.setIcon(nekoIcon1);
                    nekoButton.addActionListener(neko1Action);

                    foodButton.removeActionListener(food5Action);
                    ImageIcon foodIcon1 = new ImageIcon("picture/food1_1.jpg");
                    foodButton.setIcon(foodIcon1);
                    foodButton.addActionListener(food1Action);

                    placeButton.removeActionListener(place5Action);
                    ImageIcon placeIcon1 = new ImageIcon("picture/place1_1.jpg");
                    placeButton.setIcon(placeIcon1);
                    placeButton.addActionListener(place1Action);
                    count = 2;
                } else if(count == 2){


                    // 二枚目の画像
                    nekoButton.removeActionListener(neko1Action);
                    ImageIcon nekoIcon2 = new ImageIcon("picture/neko2_1.jpg");
                    nekoButton.setIcon(nekoIcon2);
                    nekoButton.addActionListener(neko2Action);

                    foodButton.removeActionListener(food1Action);
                    ImageIcon foodIcon2 = new ImageIcon("picture/food2_1.jpg");
                    foodButton.setIcon(foodIcon2);
                    foodButton.addActionListener(food2Action);

                    placeButton.removeActionListener(place1Action);
                    ImageIcon placeIcon2 = new ImageIcon("picture/place2_1.jpg");
                    placeButton.setIcon(placeIcon2);
                    placeButton.addActionListener(place2Action);
                    count = 3;
                }else if(count == 3){


                    // 三枚目の画像
                    nekoButton.removeActionListener(neko2Action);
                    ImageIcon nekoIcon3 = new ImageIcon("picture/neko3_1.jpg");
                    nekoButton.setIcon(nekoIcon3);
                    nekoButton.addActionListener(neko3Action);

                    foodButton.removeActionListener(food2Action);
                    ImageIcon foodIcon3 = new ImageIcon("picture/food3_1.jpg");
                    foodButton.setIcon(foodIcon3);
                    foodButton.addActionListener(food3Action);

                    placeButton.removeActionListener(place2Action);
                    ImageIcon placeIcon3 = new ImageIcon("picture/place3_1.jpg");
                    placeButton.setIcon(placeIcon3);
                    placeButton.addActionListener(place3Action);
                    count = 4;
                }else if(count == 4){


                    // 四枚目の画像
                    nekoButton.removeActionListener(neko3Action);
                    ImageIcon nekoIcon4 = new ImageIcon("picture/neko4_1.jpg");
                    nekoButton.setIcon(nekoIcon4);
                    nekoButton.addActionListener(neko4Action);

                    foodButton.removeActionListener(food3Action);
                    ImageIcon foodIcon4 = new ImageIcon("picture/food4_1.jpg");
                    foodButton.setIcon(foodIcon4);
                    foodButton.addActionListener(food4Action);

                    placeButton.removeActionListener(place3Action);
                    ImageIcon placeIcon4 = new ImageIcon("picture/place4_1.jpg");
                    placeButton.setIcon(placeIcon4);
                    placeButton.addActionListener(place4Action);
                    count = 5;
                }else if(count == 5){


                    // 五枚目の画像
                    nekoButton.removeActionListener(neko4Action);
                    ImageIcon nekoIcon5 = new ImageIcon("picture/neko5_1.jpg");
                    nekoButton.setIcon(nekoIcon5);
                    nekoButton.addActionListener(neko5Action);

                    foodButton.removeActionListener(food4Action);
                    ImageIcon foodIcon5 = new ImageIcon("picture/food5_1.jpg");
                    foodButton.setIcon(foodIcon5);
                    foodButton.addActionListener(food5Action);

                    placeButton.removeActionListener(place4Action);
                    ImageIcon placeIcon5 = new ImageIcon("picture/place5_1.jpg");
                    placeButton.setIcon(placeIcon5);
                    placeButton.addActionListener(place5Action);
                    count = 1;
                }
            }
        });

        // ボタンに初期画像を設定
        nekoButton.setIcon(nekoIcon);
        foodButton.setIcon(foodIcon);
        placeButton.setIcon(placeIcon);
        noneButton.setIcon(noneIcon);

        // フレームにボタンを追加
        mainFrame.add(nekoButton);
        mainFrame.add(foodButton);
        mainFrame.add(placeButton);
        mainFrame.add(noneButton);

        // タイマーを開始
        timer.start();

        // フレームを表示
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
    
}
