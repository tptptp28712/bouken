package dog;
import java.util.Random;

public class Pokemon extends Sample{
    
    // フィールド変数
   
    public String aisatu;
    public String san;
    public String name;
    public String category;
    public String type;
    public String description;
    public String sp;
    public String gd;
    public String saa;
    // Setter
    public Pokemon(String aisatu,String san,String name, String category, String type,String description,String sp,String gd,String saa) {
        this.name = name;
        this.san = san;
        this.category = category;
        this.type = type;
        this.description = description;
        this.aisatu = aisatu;
        this.sp = sp;
        this.gd = gd;
        this.saa = saa;
        // Getter
    }
      public String aisatu2(){
      return this.aisatu;
 } 

    public String san2(){
      return this.san;
 } 
public String name2(){
   return this.name;
 } 
public String category2(){
   return this.category;
 } 
public String type2(){
   return this.type;
 } 
public String description2(){
   return this.description;
 } 
public String sp2(){
   return this.sp;
 } 
public String gd2(){
   return this.gd;
 } 
public String saa2(){
   return this.saa;
 } 

}
class Sample{
    // ランダム数字
 Random rand = new Random();
    public int num = rand.nextInt(1000) + 1;
    public int num2 = rand.nextInt(1000) + 1;
    public int num3 = rand.nextInt(1000) + 1;
    public int num4 = rand.nextInt(1000) + 1;
    public int num5 = rand.nextInt(1000) + 1;
    
  }
