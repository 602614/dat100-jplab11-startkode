package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {
	private String url;
	
	// TODO - objekt variable
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		setLikes(0);
		setUrl(url);
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setLikes(likes);
		setTekst(tekst);
		setUrl(url);
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	public String getUrl() {
		return url;
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		this.url = url;
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		return "BILDE" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\net bilde" + "\n" + url + "\n";
		//throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
