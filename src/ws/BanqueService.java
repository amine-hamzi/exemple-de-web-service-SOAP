package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(serviceName = "WsBanque")
public class BanqueService {
	@WebMethod
	public double conversionDeEuroAuDh(@WebParam(name = "montant") double mt) {
		return mt*11;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") int code) {
		return new Compte(code, 100.0, new Date() );
	}
	
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> liste = new ArrayList<Compte>();
		liste.add(new Compte(1, 100.0, new Date() ));
		liste.add(new Compte(2, 100.0, new Date() ));
		liste.add(new Compte(3, 100.0, new Date() ));
		liste.add(new Compte(4, 100.0, new Date() ));
		return liste;
	}
	
}
