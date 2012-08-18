package com.mycompany.calculonotas.service.test;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.calculonotas.service.NotaService;
import com.mycompany.calculonotas.util.Util;

public class NotaServiceTest {

	
	private NotaService notaService = null;
	
	public NotaServiceTest()
	{
		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.notaService = (NotaService) context.getBean("notaServiceClient");
	}
	
	
	@Test
	public void testCalcularNotaFinalDSD()
    {
		
		double p1=Util.Redondear(
				notaService.calcularNotaFinalDSD(15.0, 12.0,13.5, 9.5, 16.9));
		
		System.out.println(p1);
		
		Assert.assertEquals(12.03, p1,0);
		
		
    }
	
	
	
	
	/*
	@Test
	public void testCalcularTFParaAprobarDSD()
    {
		
		double p1=notaService.calcularNotaFinalDSD(15.0, 12.0,13.5, 9.5, 16.9);
		
		double p2=notaService.calcularTFParaAprobarDSD(15.0, 12.0,13.5, 9.5, 16.9,p1);
		System.out.println(p2);
		
		Assert.assertEquals(13.155000000000001, p2);
		
		
    }
		*/
}
