package pl.edu.mk;

public class DrzewoBinarne {

	private int klucz;
	private DrzewoBinarne prawy;
	private DrzewoBinarne lewy;
	
	
	public DrzewoBinarne(int x) {
		klucz = x;
		prawy = null;
		lewy = null;
	}
	
	
	public void Dodaj(DrzewoBinarne w, int x) {
		
        if (w == null) {
            w = new DrzewoBinarne(x);
        }
        else {
            if (x > w.klucz) {
                if (w.prawy == null) {

                    w.prawy = new DrzewoBinarne(x);
                }
                else {
                    Dodaj(w.prawy, x);
                }
            }
            else {
                if (w.lewy == null) {
                    w.lewy = new DrzewoBinarne(x);
                }
                else {
                	Dodaj(w.lewy, x);
                }
            }
        }
    }

	public void Preorder(DrzewoBinarne w) {
        if (w != null) {
            System.out.print(w.klucz + " | ");
            Preorder(w.lewy);
            Preorder(w.prawy);
        }
    }
	
	public void Postorder(DrzewoBinarne w) {
        if (w != null) {
            Postorder(w.lewy);
            Postorder(w.prawy);
            System.out.print(w.klucz + " | ");
        }
    }
	
	public void Inorder(DrzewoBinarne w) {
        if (w != null) {
        	Inorder(w.lewy);
            System.out.print(w.klucz + " | ");
        	Inorder(w.prawy);
        }
    }

	
	public static void main(String[] args) {
		DrzewoBinarne drzewo = new DrzewoBinarne(6);
		drzewo.Dodaj(drzewo, 2);
		drzewo.Dodaj(drzewo, 7);
		drzewo.Dodaj(drzewo, 1);
		drzewo.Dodaj(drzewo, 4);
		drzewo.Dodaj(drzewo, 3);
		drzewo.Dodaj(drzewo, 5);
		drzewo.Dodaj(drzewo, 9);
		drzewo.Dodaj(drzewo, 8);
		
		System.out.print("Preorder:  | ");
		drzewo.Preorder(drzewo);
		System.out.print("\nPostorder: | ");
		drzewo.Postorder(drzewo);
		System.out.print("\nInorder:   | ");
		drzewo.Inorder(drzewo);
	}
	
	
}
