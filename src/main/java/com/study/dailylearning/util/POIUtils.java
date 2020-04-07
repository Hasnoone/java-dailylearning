package com.study.dailylearning.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @outhor xuhang
 * @create 2020-03-26 15:03
 */
public class POIUtils {


    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(i);
            user.setName("hhhhh");
            user.setPhone("12345678");
            users.add(user);
        }

        generatExcel(user1,users);
    }


    public static void generatExcel(Object object, List list) throws IOException {
        //获取对象的类对象
        Class<?> aClass = object.getClass();
        //存储对象的get方法名
        List<String> methodList = new ArrayList<>();
        //获取对象的所有属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field item : declaredFields) {
            String name = item.getName();
            String methodName = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
            methodList.add(methodName);
            System.out.println("methodName========"+methodName);
        }


        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = null;
        for (int i = 0; i < declaredFields.length; i++) {
            cell = row.createCell(0);
            cell.setCellValue(declaredFields[i].toString());

        }

        String name = aClass.getName();
        String replace = name.replace(".", "/");
        String[] split = replace.split("/");
        System.out.println(split.length);
        String s = split[split.length-1];
        workbook.write(new FileOutputStream("E:\\"+s+".sql"));

    }

}
