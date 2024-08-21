package com.springproject.product_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@AutoConfigureMockMvc
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
//
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired(required = true)
//	private ObjectMapper objectMapper;
//
//	@Autowired
//	private ProductRepository productRepository;
//
//	static {
//		mongoDBContainer.start();
//	}
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dymDynamicPropertyRegistry)
//	{
//		dymDynamicPropertyRegistry.add("spring.data/mongodb.uri",mongoDBContainer::getReplicaSetUrl);
//	}
//	@Test
//	void shouldCreateProduct() throws Exception {
//
//		ProductRequest productRequest = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(productRequestString))
//				.andExpect(status().isCreated());
//
//		Assertions.assertEquals(1, productRepository.findAll().size());
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("iphone13")
//				.description("iphone 13")
//				.price(BigDecimal.valueOf(75000))
//				.build();
//	}

}
