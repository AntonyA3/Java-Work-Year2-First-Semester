package main;
import java.util.ArrayList;
import java.util.List;

import lib.adverts.Advert;
import lib.adverts.Billboard;
import lib.adverts.NewspaperAd;
import lib.adverts.TvCommercial;

public class AdDemo {
	
	public static void main(String[] arg) {
		
		//Advert test1 = new Advert(100); //this won't compile
		Advert test2 = new NewspaperAd(100,10,10); // this is OK
		
		
		List<Advert> campaign = new ArrayList<>();
		//campaign.add(new Advert(1000)); causes error - cannot instantiate Advert
		campaign.add(new Billboard(500, 7, 200));
		campaign.add(new NewspaperAd(200, 10, 10));
		campaign.add(new Billboard(500, 6, 50));
		campaign.add(new TvCommercial())
		
          
		for (Advert ad : campaign) {
				System.out.println(ad.toString());
				System.out.println("Cost of advert: " + ad.cost() + "\n");
		}
		
	}
}