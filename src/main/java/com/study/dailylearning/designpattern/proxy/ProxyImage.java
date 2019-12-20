package com.study.dailylearning.designpattern.proxy;

/**
 * @description
 * @outhor xuhang
 * @create 2019-12-20 16:26
 */
public class ProxyImage implements Image {

    private String imageName;
    private Image realImage;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void disPlay() {
        if (null == realImage) {
            realImage = new RealImage(imageName);
        }
        realImage.disPlay();
    }
}
