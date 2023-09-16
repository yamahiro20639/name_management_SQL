package org.example;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class Element {
    public static void main(String[] args) {
        try {
            String[] names = {"山田", "酒井", "佐々木", "田中", "佐藤", "高橋"};

            System.out.println(names[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("確認できない要素です");
        } finally {
            System.out.println("処理終了");
        }


        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("無効な値です");
        } finally {
            System.out.println("処理終了");
        }

    }
}

