package magacin;

import java.util.List;
import java.util.Objects;

import artikal.Artikal;
import magacinInterface.MagacinInterface;

public class Magacin implements MagacinInterface{

	private List<Artikal> artikli;

	public List<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(List<Artikal> artikli) {
		if (artikli != null)
			this.artikli = artikli;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artikli);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magacin other = (Magacin) obj;
		return Objects.equals(artikli, other.artikli);
	}

	@Override
	public String toString() {
		return "Magacin [artikli=" + artikli + "]";
	}

	
	@Override
	public void dodajArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artikal vratiArtikal(int sifraArtikla) {
		// TODO Auto-generated method stub
		return null;
	}

}
