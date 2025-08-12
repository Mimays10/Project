import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class eBizCard {
    public static final String DEFAULT_VCF_FILENAME = "template.vcf";
    public static final String DEFAULT_CONTACT_LIST_FILENAME = "contact.txt";

    public static void main(String[] args) throws Exception {

        eBizCard bc = new eBizCard();

        //read VCF file (1)
        String vcf = bc.retrieveVcf();

        //read Contact file (2)
        List<Person> array = bc.retrievePersonList();

        //save VCF file for each Person
        bc.saveVcf(array, vcf);

    }

    public String retrieveVcf() throws Exception{
        return retrieveVcf(DEFAULT_VCF_FILENAME);
    }

    public String retrieveVcf(String fileName) throws Exception{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);
        String vcf = "";

        // Illustrating ready() method 
        if (br.ready()) { 
  
            // Illustrating readLine() method 
            //System.out.println(br.readLine()); 
            String s = br.readLine();
            
            while(s != null ){//&& s.trim().length() > 0
                vcf = vcf + s + "\n";
                s = br.readLine();
            }
            //System.out.println(vcf);
            System.out.println(); 
  
        } 

        br.close();
        return vcf;

    }

    public List<Person> retrievePersonList() throws Exception{
        return retrievePersonList(DEFAULT_CONTACT_LIST_FILENAME);
    }

    public List<Person> retrievePersonList(String fileName)throws Exception{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Person> array = new ArrayList<Person>();

        // Illustrating ready() method 
        if (br.ready()) { 
  
            // Illustrating readLine() method  
            String s = br.readLine();
            
            while(s != null ){
                String[] ss = s.split(",");
                if (ss != null && ss.length == 6){
                    System.out.println(ss[0]); 
                    Person p = new Person();
                    p.familyName = ss[0];
                    p.name = ss[1];
                    p.fullName = ss[2];
                    p.title = ss[3];
                    p.handphone = ss[4];
                    p.email = ss[5];
                    array.add(p);
                    System.out.println(p);
                }
                s = br.readLine();
            }
            
            System.out.println(); 
  
        } 

        br.close();
        return array;
    }

    public void saveVcf(List<Person> array, String vcf) throws Exception{
        for (Person p : array) {
            String tempVcf = vcf;
            tempVcf = tempVcf.replace("{familyName}", p.familyName);
            tempVcf = tempVcf.replace("{name}", p.name);
            tempVcf = tempVcf.replace("{fullName}", p.fullName);
            tempVcf = tempVcf.replace("{title}", p.title);
            tempVcf = tempVcf.replace("{handphone}", p.handphone);
            tempVcf = tempVcf.replace("{email}", p.email);

            FileWriter fw = new FileWriter(p.name + ".vcf");
            fw.write(tempVcf);
            fw.close();
        }
    }
}