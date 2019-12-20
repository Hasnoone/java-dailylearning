package com.study.dailylearning.designpattern.proxy;

/**
 * @description
 * @outhor xuhang
 * @create 2019-12-20 16:23
 */
public class RealImage implements Image {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImageOnDisk(imageName);
    }

    @Override
    public void disPlay() {
        System.out.println("display image " + imageName);
    }

    void loadImageOnDisk(String imageName) {
        System.out.println("loading ···" + imageName);
    }
}
