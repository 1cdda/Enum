package com.hsp.enum_;

/**
 * @version 1.0
 * @Author Cxc
 */
public class enum03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}
enum Season2 {
//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN= new Season("秋天", "凉爽");

//   1、 使用enum替代class
//   2、public static final Season SPRING = new Season("春天", "温暖");直接使用
//      SPRING("春天", "温暖")解读   常量（实参列表）
//    3、如果有多个常量（对象），使用逗号间隔即可
//    4、如果使用enum来实现枚举，要求将定义常量对象，写在前面，属性写在后面
    SPRING("春天", "温暖"),WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),AUTUMN("秋天", "凉爽");
    private String name;
    private String desc;
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


