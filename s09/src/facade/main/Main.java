package facade.main;

import facade.classes.Autobuz;
import facade.classes.AutobuzSimplificat;

public class Main {

	public static void main(String[] args) {
		 Autobuz autobuz=new Autobuz("PH01BUS");
		
//		 autobuz.deschideUsaFata();
//		 autobuz.deschideUsaMijloc();
//		 autobuz.deschideUsaSpate();
		 
		 AutobuzSimplificat autobuzSimplificat=new AutobuzSimplificat(autobuz);
		 autobuzSimplificat.deschideUsile();
	}

}
