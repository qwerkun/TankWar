package com.zj.tank;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        TankFrame tf = new TankFrame();

        int initTankCoount = Integer.parseInt((String) PropertyMgr.get("initTankCount"));
        //初始化敌方坦克
        for(int i=0;i<initTankCoount;i++){
            tf.tanks.add(new Tank(50+i*80,200, Dir.DOWN, Group.BAD,tf));
        }
        //需要调repaint刷新
        while (true) {
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
