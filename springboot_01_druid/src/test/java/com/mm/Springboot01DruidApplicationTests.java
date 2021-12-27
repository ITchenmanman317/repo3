package com.mm;

import com.mm.Mapper.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01DruidApplicationTests {
@Autowired
private BookDao bookDao;
	@Test
	void contextLoads() {
		System.out.println(bookDao.getById(1));
	}

}
