package artikal;

import java.util.GregorianCalendar;
import java.util.Objects;

public class KucnaHemija extends Artikal {

	private GregorianCalendar rokTrajanja;

	public GregorianCalendar getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(GregorianCalendar rokTrajanja) {
		if (rokTrajanja != null)
			this.rokTrajanja = rokTrajanja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(rokTrajanja);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(rokTrajanja, other.rokTrajanja);
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + getNaziv() + ", sifra=" + getSifra() + ", opis=" + getOpis() + ", kolicina="
				+ getKolicina() + "rokTrajanja=" + rokTrajanja + "]";
	}

}
