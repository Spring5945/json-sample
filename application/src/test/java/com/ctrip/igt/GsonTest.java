package com.ctrip.igt;

import com.ctrip.igt.gson.model.Company;
import com.ctrip.igt.gson.model.Father;
import com.ctrip.igt.gson.model.Student;
import com.ctrip.igt.gson.utils.GsonUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GsonTest {

    @Test
    public void gsonTest(){
        Company company = new Company.Builder().companyName("ctrip").companyDetail("sohu").build();
        Father father = new Father.Builder().company(company).name("father").age(36).build();
        Father father2= new Father.Builder().company(company).name("father2").age(38).build();
        Student student = new Student.Builder().name("student").age(10).father(father)
                .money(BigDecimal.valueOf(10)).salary(0).build();
        Student student2 = new Student.Builder().name("student2").age(12).father(father2)
                .money(BigDecimal.valueOf(10)).salary(0).build();
        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        String toJson = GsonUtils.toGsonString(studentList);
        System.out.println(toJson);

        String studentJson = "[{\"name\":\"student\",\"age\":10,\"salary\":0.0,\"money\":10,\"father\":{\"name\":\"father\",\"age\":36,\"company\":{\"companyName\":\"ctrip\",\"companyDetail\":\"sohu\"}}},{\"name\":\"student2\",\"age\":12,\"salary\":0.0,\"money\":10,\"father\":{\"name\":\"father2\",\"age\":38,\"company\":{\"companyName\":\"ctrip\",\"companyDetail\":\"sohu\"}}}]";
        List<Student> fromJson = GsonUtils.gsonToList(studentJson, Student.class);
        System.out.println(fromJson);
    }

}
