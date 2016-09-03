阅读说明:
	src:目录下每一个com.oraclewdp对应一种测试代码
	test:每一个junitTest对应上面一个包
	mybatis.cfg.xml 配置了延迟加载(测试时不要System.out.println(object),因为这个方法也调用了那个属性)
	
	com.oraclewdp  基于xml的增删查改
	com.oraclewdp2   基于注解的增删查改
	com.oraclewdp3   解决属性名与表明冲突问题
	com.oraclewdp4   一对一单边
	com.oraclewdp5   一对一 双边
	com.oraclewdp6   一对多 单边
	com.oraclewdp7   多对多 
	com.oraclewdp8  动态SQL
	com.oraclewdp9 调用存储过程