package com.hsp.enum_;

/**
 * @version 1.0
 * @Author Cxc
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        //name()输出枚举对象名称
        System.out.println(autumn.name());
        //ordinal()输出该枚举对象次序/编号，从0开始编号
        System.out.println(autumn.ordinal());
        //values(),返回Season2[],含有定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("遍历取出枚举对象");
        for(Season2 season2:values){//增强For循环
            System.out.println(season2);
        }
        //valueof(),将字符串转换成枚举对象，要求字符串必须是已有的常量名，否则报异常
        //根据你输出的"AUTUMN"到Season2的枚举对象中去找
        //如果找到了就返回，没有找到就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        //1、把Season2.AUTUMN和Season2.SUMMER编号进行比较
        //2、Season2.AUTUMN[2]-Season2.SUMMER[3],比较谁前谁后
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
        //toString(),Enum类中是返回name，及对象名，一般应用枚举类中会重写。
//        System.out.println("=====普通for=====");
//        int[] arr ={1,2,3};
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println("====增强for=====");
//        for (int i : arr) {    //快捷键  对象名.for
//            //依次从arr数组中取出数据赋给i
//            System.out.println(i);
//
//        }

    }
}
