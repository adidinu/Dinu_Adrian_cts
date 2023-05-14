package facade.classes;

public class Autobuz {
	private String nrInmatriculare;

	public Autobuz(String nrInmatriculare) {
		super();
		this.nrInmatriculare = nrInmatriculare;
	}
	
	
	public void deschideUsaFata() {
		System.out.println("S-a deschis usa din fata pentru autobuzul cu nr " + nrInmatriculare);
	};
	public void deschideUsaMijloc() {
		System.out.println("S-a deschis usa din mijloc pentru autobuzul cu nr " + nrInmatriculare);

	}
	public void deschideUsaSpate() {
		System.out.println("S-a deschis usa din spate pentru autobuzul cu nr " + nrInmatriculare);

	}
	public void ramaneUsaLiberaFata() {
		System.out.println("Usa din fata poate fi deschisa de calatori pentru autobuzul cu nr " + nrInmatriculare);

	}
	public void ramaneUsaLiberaMijloc() {
		System.out.println("Usa din mijloc poate fi deschisa de calatori pentru autobuzul cu nr " + nrInmatriculare);

	}
	public void ramaneUsaLiberaSpate() {
		System.out.println("Usa din spate poate fi deschisa de calatori pentru autobuzul cu nr " + nrInmatriculare);

	}
	
}
