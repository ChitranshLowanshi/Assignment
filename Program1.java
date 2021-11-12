package com.technoelevate.advancedjava.mapassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program1 {
    public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap)
    {
        
        Map<K, V> treeMap = new TreeMap<>();
   
        
        treeMap.putAll(hashMap);
   
       
        return treeMap;
    }
   
    public static void main(String args[])
    {
        
        Map<String, String> hashMap = new HashMap<>();
   
       
        hashMap.put("1", "Geeks");
        hashMap.put("2", "forGeeks");
        hashMap.put("3", "A computer Portal");
   
        
        System.out.println("HashMap: " + hashMap);
   
        
        Map<String, String> treeMap = convertToTreeMap(hashMap);
   
        System.out.println("TreeMap: " + treeMap);
    }
}
