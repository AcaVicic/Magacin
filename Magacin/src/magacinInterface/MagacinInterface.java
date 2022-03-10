package magacinInterface;

import artikal.Artikal;

public interface MagacinInterface {
	
	void dodajArtikal(Artikal artikal);
	
	void izbaciArtikal(Artikal artikal);
	
	Artikal vratiArtikal(int sifraArtikla) throws Exception;
}
