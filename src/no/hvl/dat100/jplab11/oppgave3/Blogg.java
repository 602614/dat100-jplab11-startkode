package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] tabell;
	private int nesteLedige;

	public Blogg() {
		tabell = new Innlegg[20];
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		tabell = new Innlegg[lengde];
		nesteLedige = 0;
	}
	
	public int getAntall() {
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return tabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while ( pos < nesteLedige && !funnet) {
			if (Innlegg.erLik(Innlegg.getId()))
				funnet = true;
			else 
				pos++;
		}
		if (funnet)
			return pos;
		else 
			return -1;
			
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = true;
		int pos = finnes(innlegg);
		if (pos >=0)
			return true;
	}

	public boolean ledigPlass() {
		boolean ledig = false; 
		
		if(nesteLedige < tabell.length) {
			ledig = true;
		}
		return ledig;
		}

	
	public boolean leggTil(Innlegg innlegg) {
		boolean ny = true;
		if (ny && nesteLedige < tabell.length) {
			tabell[nesteLedige] = innlegg;
			nesteLedige++;
			return true;
		}
		else
			return false;
		}

	
	public String toString() {
		return nesteLedige + "\nTESKT" + "\n" + Innlegg.getId() + "\n" + Innlegg.getBruker() + "\n" + Innlegg.getDato() + "\n" + Innlegg.getLikes() + "\nen tekst" + "\nBILDE" + Innlegg.getId() + "\n" + Innlegg.getBruker() + "\n" + Innlegg.getDato() + "\n" + Innlegg.getLikes() + "\net bilde" + Bilde.getUrl() + "\n";
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}