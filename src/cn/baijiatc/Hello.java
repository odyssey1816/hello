package cn.baijiatc;

import java.util.ArrayList;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        ArrayList<Long> list = new ArrayList<Long>();
        list.add(1l);
        list.add(2l);
        for (Long aLong : list) {
            System.out.println(123+"\t"+list.get(0));
            findUser("柳志鹏");
        }

    }


    public static void findUser(String username){
        System.out.println(username);
    }
}
