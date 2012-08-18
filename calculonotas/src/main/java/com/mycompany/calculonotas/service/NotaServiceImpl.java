package com.mycompany.calculonotas.service;

import javax.jws.WebService;

@SuppressWarnings("restriction")
@WebService(endpointInterface="com.mycompany.calculonotas.service.NotaService")
public class NotaServiceImpl implements NotaService {

	public double calcularNotaFinalDSD(double pc1, double pc2, double pa1,
			double tp, double tf) {
		// NF = 15%PC1 + 15%PC2 + 20%PA1 + 20%TP + 30%TF
		double nf=0.15*pc1+0.15*pc2+0.2*pa1+0.2*tp+0.2*tf;
		
		return nf;
	}

	
	public double calcularTFParaAprobarDSD(double pc1, double pc2, double pa1,
			double tp, double tf,double nf) {
		
		double ntf=(pc1+pc2+pa1+tp+tf+nf)/6;
		return ntf;
	}

}

