package client;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDh(800));
        Compte cpt = proxy.getCompte(2);
        System.out.println(cpt.getCode()+" // "+cpt.getSolde());
        List<Compte> liste=proxy.getList();
        liste.forEach(
                cp->{
                    System.out.print(cp.getCode()+" // ");
                    System.out.println(cp.getSolde());
                }
        );
    }
}
