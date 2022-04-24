package com.course.service;

import com.course.pojo.PointObject;
import com.course.utils.FileUtils;
import com.course.utils.JsonUtils;

/**
 * @author lixuy
 * Created on 2019-04-11
 */
//类名与方法名须与controller层拦截的方法一致
public class TestDesign {

    public void testDesign(){
    	String file = FileUtils.readFile("score");   //读score文件
    	PointObject pointObject = JsonUtils.jsonToPojo(file, PointObject.class);  //json字符串转换成PointObject对象
    	Integer grow = pointObject.getGrowScore();     //取成长积分
    	Integer total = pointObject.getScoreTotal();    //取总积分
    	pointObject.setGrowScore(grow+1);     //成长积分加1
    	pointObject.setScoreTotal(total+1);   //总积分加1
    	String content = JsonUtils.objectToJson(pointObject);  //模拟数据库的写操作，将对象转换成json字符串
    	FileUtils.writeFile("score", content);   //将转好的字符串content写到score文件中
        System.out.println("+++++积分计算方法+++++");
    }

}
