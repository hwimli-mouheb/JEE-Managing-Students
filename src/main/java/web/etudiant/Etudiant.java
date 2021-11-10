package web.etudiant;

import java.util.ArrayList;

public class Etudiant {
    public  static ArrayList<Etudiant> etudiantList = new ArrayList<>() ;
    public String cin;
    public String name;
    public String lastName;

    public Etudiant(String cin, String name, String lastName) {
        this.cin = cin;
        this.name = name;
        this.lastName = lastName;
    }
    public void remove(String cin) {
    	for(int j=0;j<etudiantList.size();j++) {
    		if (cin ==etudiantList.get(j).cin) {
    			etudiantList.remove(j);
    			break;
    		}
    	}
    }
    public String getCin() {
    	return this.cin;
    }
}
