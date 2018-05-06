package com.test.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.ho.yaml.Yaml;

public class YamlProperties {
    public static void main(String[] args) {
        try {
            Yaml yaml = new Yaml();
            URL url = YamlProperties.class.getClassLoader().getResource("password.yaml");
            if (url != null) {
                //获取test.yaml文件中的配置数据，然后转换为obj，
//                Object obj =yaml.load(new FileInputStream(url.getFile()));
//                System.out.println(obj);
                //也可以将值转换为Map
                Map<String, List<String>> map =(Map<String, List<String>>)yaml.load(new FileInputStream(url.getFile()));
                List<String> regulars = map.get("regulars");
                List<String> messages = map.get("messages");
                System.out.println(regulars);
                System.out.println(messages);
                //通过map我们取值就可以了.
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
