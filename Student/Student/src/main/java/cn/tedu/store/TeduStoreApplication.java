package cn.tedu.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//在启动类中添加mapper扫描就可以省下每次都添加扫描的注解了
@MapperScan("cn.tedu.store.mapper")
public class TeduStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeduStoreApplication.class, args);
	}

}
