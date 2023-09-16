package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("りんご");
        list.add("バナナ");
        list.add("ぶどう");
        list.add("トマト");

        Map<String, String> userMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            userMap.put("食べ物", list.get(i));
            if (i <= 2) {
                System.out.println("山﨑は" + userMap.get("食べ物") + "が好き");
            } else {
                System.out.println("山﨑は" + userMap.get("食べ物") + "が嫌い");
            }
        }
    }
}
