package magacin;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import artikal.Artikal;
import magacinInterface.MagacinInterface;

public class Magacin implements MagacinInterface {

	private List<Artikal> artikli = new LinkedList<Artikal>();

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

		if (artikal != null) {

			for (Artikal a : artikli) {
				if (artikal.getSifra() == a.getSifra()) {
					a.setKolicina(a.getKolicina() + artikal.getKolicina());
					return;
				}
			}
			artikli.add(artikal);
		}
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		artikli.remove(artikal);
	}

	@Override
	public Artikal vratiArtikal(int sifraArtikla) throws Exception {
		// TODO Auto-generated method stub
		for (Artikal a : artikli) {
			if (a.getSifra() == sifraArtikla)
				return a;
		}
		throw new Exception("Artikal sa datom sifrom ne postoji");
	}

}
