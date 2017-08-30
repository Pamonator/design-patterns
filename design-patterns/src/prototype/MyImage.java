/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author a1402072
 */
public class MyImage implements Cloneable {

    public int imageId;
    public String imageName;
    public byte[] imgeBytes;

    public MyImage(int imageId, String imageName, byte[] imgeBytes) {
        this.imageId = imageId;
        this.imageName = imageName;
        this.imgeBytes = imgeBytes;
    }

    @Override
    public MyImage clone() throws CloneNotSupportedException {
        MyImage clone = null;
        try {
            clone = (MyImage) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
        return clone;

    }

}
