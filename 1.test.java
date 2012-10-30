package pr1;
/*
 * Sergej Kaunov, Ramin Mohibi
 */
public class SuchSortierAlg {

	
	/* Das Beispiel gibt den Wert -1 zurueck, 
	 * wenn das gesuchte Element nicht im Array vorhanden ist. 
	 * Ansonsten gibt es die Position des Elementes zurueck.
	 */
	public static int lineareSuche(final int gesucht, final int[] daten) {
	    for (int i = 0; i < daten.length; i++) {
	        if (daten[i] == gesucht) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	/* Die Methode gibt den Index des Zeichens zurueck, 
	 * falls es im Array enthalten ist, anderenfalls −1. 
	 * Damit die Methode funktioniert, muss das gegebene Array sortiert sein. 
	 */
	
	public static int suche(final int zahl, final int[] daten) {
	        int erstes = 0;
	        int letztes = daten.length - 1;
	 
	        while (erstes <= letztes) {
	            final int mitte = erstes + ((letztes - erstes) / 2); 
	            if (daten[mitte] < zahl) {
	                erstes = mitte + 1;                                 // rechts weitersuchen
	            } else if (daten[mitte] > zahl) {
	                letztes = mitte - 1;                                // links weitersuchen
	            } else {
	                return mitte;                                       // Zeichen gefunden
	            }
	        }
	 
	        return -1;
	    }
	
	
	public static int[] minSort(int[] daten){
		  
		int min; 
	      for (int i = 0; i < daten.length-1; i++){     
	    	  min = i;
	         for (int j = i + 1; j < daten.length; j++){ 
	        	 
	        	 if (daten[j] < daten[min])   // Vergleiche das aktuelle Arrayelement mit dem bisher kleinsten
	                                          // falls ein kleineres als bisher gefunden
	              min = j;                    // Merke dir aktuelle Stelle als Stelle des kleinsten Elements
	         }
	        
	       // Tausche die Positionen
	         int max = daten[i];
	         daten[i] = daten[min];
	         daten[min] = max;                                  
	      }
		return daten;
	   }
}
