package com.neuedu.demo.dao;

import com.neuedu.demo.pojo.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PersonMapper {
    //     如果只对单表进行操作,不涉及关联查询，可以使用注解开发
    //    1. 在映射文件中使用的所有的CRUD操作，都可以使用注解的形式完成。
    //    2. 当使用基于注解的映射器接口时，就不再需要映射配置文件了。
    //    3. 在实际开发中，可以单独使用映射文件，也可以单独使用注解，也可以混合使用
    @Select("select * from person where pid=#{pid}")
    public Person queryMessageById(Integer pid);

    @Update("")
    public int updateMessage(Person person);

    @Insert("insert into person(pname,password,sex,birthday) values(#{pname},#{password},#{sex},#{birthday})")
    public int insertMessage(Person person);

    @Delete("delete from person where pid=#{pid}")
    public int deletMessage(Integer pid);



}
