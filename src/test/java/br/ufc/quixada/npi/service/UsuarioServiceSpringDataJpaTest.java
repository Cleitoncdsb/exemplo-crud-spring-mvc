package br.ufc.quixada.npi.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/applicationContextTest.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("spring-data-jpa")
public class UsuarioServiceSpringDataJpaTest extends AbstractUsuarioServiceTest{

}
