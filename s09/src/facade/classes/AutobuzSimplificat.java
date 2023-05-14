package facade.classes;

public class AutobuzSimplificat {
	Autobuz autobuz;

	public AutobuzSimplificat(Autobuz autobuz) {
		super();
		this.autobuz = autobuz;
	}
	
	public AutobuzSimplificat(String numarInmatriculare) {
		this.autobuz=new Autobuz(numarInmatriculare);
	}
	
	public void deschideUsile() {
		autobuz.deschideUsaFata();
		autobuz.deschideUsaMijloc();
		autobuz.deschideUsaSpate();
	}
	
	public void ramanDeschise() {
		autobuz.ramaneUsaLiberaFata();
		autobuz.ramaneUsaLiberaMijloc();
		autobuz.ramaneUsaLiberaSpate();
	}
	
}
