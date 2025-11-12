package dianiclassifica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Classifica {
    
    public Squadra[] classifica = new Squadra[30];
    
    public void riempi(){
        boolean isFirstLine = true;
        String filePath = new File("NBA.csv").getAbsolutePath();

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                
                for(int i = 0; i<30; i++){
                    if((line = br.readLine()) != null) {
                        if (isFirstLine) {
                            isFirstLine = false;
                            continue;
                        }
                        
                        String[] columns = line.split(",");
                        int pos = Integer.valueOf(columns[0]);
                        String nome = columns [1];
                        int pg = Integer.valueOf(columns[2]);
                        int pv = Integer.valueOf(columns[3]);
                        int pp = Integer.valueOf(columns[4]);
                        classifica[i] = new Squadra(pos, nome, pg, pv, pp);
                    
                    } else{
                        break;
                    }
                }
            } catch (IOException e) {
                    e.printStackTrace();
                }
    }

    public Classifica() {
        
    }
    
    
           
    
}