/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.prototype;

import java.io.*;
import java.util.Date;

public class PrototypeBean implements  Cloneable, Serializable {

    private String prototypeName;
    private Date prototypeDate;

    @Override
    protected PrototypeBean clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private PrototypeBean deepClone() {
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            PrototypeBean copy = (PrototypeBean)ois.readObject();
            copy.prototypeDate = new Date();
            bos.close();
            bis.close();
            ois.close();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        } finally {

        }
    }

    public String getPrototypeName() {
        return prototypeName;
    }

    public void setPrototypeName(String prototypeName) {
        this.prototypeName = prototypeName;
    }

    public Date getPrototypeDate() {
        return prototypeDate;
    }

    public void setPrototypeDate(Date prototypeDate) {
        this.prototypeDate = prototypeDate;
    }
}
