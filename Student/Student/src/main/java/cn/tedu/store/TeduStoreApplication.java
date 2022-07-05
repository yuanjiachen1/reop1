package cn.tedu.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//�������������mapperɨ��Ϳ���ʡ��ÿ�ζ����ɨ���ע����
@MapperScan("cn.tedu.store.mapper")
public class TeduStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeduStoreApplication.class, args);
	}

}
