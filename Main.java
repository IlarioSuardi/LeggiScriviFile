import java.io.*;

class Main{
    void main(){
        try {
            //lettura da file
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            String nome = br.readLine();
            System.out.println("Ciao " + nome);
            br.close();
            fr.close();

            //scrittura su file
            PrintWriter pr = new PrintWriter(new FileWriter("copia.txt", true));
            pr.println(nome + " scritto su file");
            pr.flush();
            pr.close();

            //file su accesso diretto
            RandomAccessFile raf = new RandomAccessFile("copia.txt", "rw");
            raf.seek(3);
            raf.write('*');
            raf.close();
        } catch (IOException e) {
            System.out.println("errore " + e);
        }
    }
}