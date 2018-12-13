/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_telefonica_2;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author riccardo.donadel
 */
public class Agenda_telefonica_2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Dammi l'indirizzo del file");
		String indirizzo=in.nextLine();
		File agenda = new File(indirizzo);
		try{
			Scanner sc=new Scanner(agenda);
			System.out.println("Dimmi cosa cercare");
			String ricerca=in.nextLine();
			while(sc.hasNextLine()){
				String riga=sc.nextLine();
				if(riga.contains(ricerca)){
					System.out.println(riga);
				}
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File non trovato o non accaessibile");
		}
	}
}
