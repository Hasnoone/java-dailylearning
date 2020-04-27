package com.study.dailylearning.sourcecodeanalysis.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapAnalysis {


    public static void main(String[] args) {
        Country india=new Country("India",1000);
        Country japan=new Country("Japan",10000);

        Country france=new Country("France",2000);
        Country russia=new Country("Russia",20000);
        Country sichuan0=new Country("sichuan0",1000);
        Country sichuan1=new Country("sichuan1",1000);
        Country sichuan2=new Country("sichuan2",1000);
        Country sichuan3=new Country("sichuan3",1000);
        Country sichuan4=new Country("sichuan4",1000);
        Country sichuan5=new Country("sichuan5",1000);
        Country sichuan6=new Country("sichuan6",1000);
        Country sichuan7=new Country("sichuan7",1000);
        Country sichuan8=new Country("sichuan8",1000);
        Country sichuan9=new Country("sichuan9",1000);

        HashMap<Country, String> countryCapitalMap=new HashMap<>();
        countryCapitalMap.put(india,"Delhi");
        countryCapitalMap.put(japan,"Tokyo");
        countryCapitalMap.put(france,"Paris");
        countryCapitalMap.put(russia,"Moscow");

//        countryCapitalMap.put(sichuan0,"sichuan0");
//        countryCapitalMap.put(sichuan1,"sichuan1");
//        countryCapitalMap.put(sichuan2,"sichuan2");
//        countryCapitalMap.put(sichuan3,"sichuan3");
//        countryCapitalMap.put(sichuan4,"sichuan4");
//        countryCapitalMap.put(sichuan5,"sichuan5");
//        countryCapitalMap.put(sichuan6,"sichuan6");
//        countryCapitalMap.put(sichuan7,"sichuan7");
//        countryCapitalMap.put(sichuan8,"sichuan8");
//        countryCapitalMap.put(sichuan9,"sichuan9");




        Iterator<Country> countryCapitalIter=countryCapitalMap.keySet().iterator();//put debug point at this line
        while(countryCapitalIter.hasNext())
        {
            Country countryObj= countryCapitalIter.next();
            String capital=countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName()+"----"+capital);
        }
    }


}
