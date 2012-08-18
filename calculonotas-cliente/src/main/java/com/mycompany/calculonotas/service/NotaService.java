package com.mycompany.calculonotas.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@SuppressWarnings("restriction")
@WebService
public interface NotaService {
	
	public double calcularNotaFinalDSD(@WebParam(name = "pc1") double pc1,
			@WebParam(name = "pc2") double pc2, 
			@WebParam(name = "pa1") double pa1,
			@WebParam(name = "tp") double tp, 
			@WebParam(name = "tf") double tf);
	
	public double calcularTFParaAprobarDSD(@WebParam(name = "pc1") double pc1,
			@WebParam(name = "pc2") double pc2, 
			@WebParam(name = "pa1") double pa1,
			@WebParam(name = "tp") double tp, 
			@WebParam(name = "tf") double tf,
			@WebParam(name = "nf") double nf
			);
	

}
