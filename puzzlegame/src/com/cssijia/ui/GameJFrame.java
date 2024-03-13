package com.cssijia.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //游戏的主界面，所有跟游戏有关的代码都写这里
    public GameJFrame(){

        this.setSize(600,680);
//        default invisible
        this.setVisible(true);
        //this就是地址值，本体空参在别的file里面
        //this也可以不写，在本类里没有就会到父类里继续找

        //tital
        this.setTitle("puzzlegame v1.1");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);//居中
        //自动停止
        this.setDefaultCloseOperation(3);//interface-3-close-default-1

       //creat whole menu
        JMenuBar jMenuBar = new JMenuBar();

        //two option button
        JMenu functionJmenu = new JMenu("Function");

        //creat category
        JMenuItem replayItem = new JMenuItem("Replay");
        JMenuItem reLogin = new JMenuItem("Relogin");
        JMenuItem closeItem = new JMenuItem("Close Game");
        JMenuItem accountItem = new JMenuItem("Contact");

        //add item on button
        functionJmenu.add(replayItem);
        functionJmenu.add(reLogin);
        functionJmenu.add(closeItem);
        functionJmenu.add(accountItem);

        //add button to menu
        jMenuBar.add(functionJmenu);

        //整个界面设置菜单
        this.setJMenuBar(jMenuBar);

        this.setVisible(true);




    }


}
