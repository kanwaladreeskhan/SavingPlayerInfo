 
package savingplayerinfo;
 import java.io.*;
public class SavingPlayerInfo {
 
    public static void main(String[] args) {
//           Player p1=new Player("Ali Hassan",1,3800);
//          Player p2=new Player("Iqra Sana",2,33400);
//           Player p3=new Player("Ali Hussain",3,36430);
//           Player p4=new Player("Ali Hamza",4,30060);
//          Player p5=new Player("Yameen Ai",5,8700);
//          try{
//              FileOutputStream fileOut=new FileOutputStream("Player.ser");
//               ObjectOutputStream obj=new ObjectOutputStream(fileOut);
//              obj.writeObject(p1);
//                obj.writeObject(p2);
//                 obj.writeObject(p3);
//               obj.writeObject(p4);
//               obj.writeObject(p5);
//              obj.close();
//               fileOut.close();
//                System.out.println("Object has been serialized!");
//           }catch(Exception e){
//             e.printStackTrace();
//          }
         Player p1=null;
         Player p2=null;
        Player p3=null;
        Player p4=null;
        Player p5=null;
      try{
            FileInputStream fileIn=new FileInputStream("Player.ser");
            ObjectInputStream obj=new ObjectInputStream(fileIn);
            p1=(Player)obj.readObject();
            p2=(Player)obj.readObject();
            p3=(Player)obj.readObject();
            p4=(Player)obj.readObject();
            p5=(Player)obj.readObject();
            obj.close();
            fileIn.close();
           System.out.println("Objects have been Deserialized!");
               System.out.println(p1.toString());
               System.out.println(p2.toString());
               System.out.println(p3.toString());
             System.out.println(p4.toString());
               System.out.println(p5.toString());
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    
}
