package com.dns007;

import java.util.HashMap;
import java.util.Map;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/24
 */
public class TeacherFactory {
    private Map<String, Teacher> pool;

    public TeacherFactory(){
        pool = new HashMap<String, Teacher>();
    }

    public Teacher getTeacher(String number){
        Teacher teacher = pool.get(number);
        if(teacher ==null){
            teacher = new Teacher();
            teacher.setNumber(number);
            pool.put(number, teacher);
        }
        return teacher;
    }
}
