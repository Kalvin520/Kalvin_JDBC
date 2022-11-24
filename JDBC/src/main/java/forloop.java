public class forloop {
    public static void main(String[] args) {
        String[] friends = {"Mike", "Grace", "Spencer", "Nal", "Abigail" };
        for (int i = 0; i < 5; i++){
            System.out.println(friends[i]+ "is my friend.");
        }
        //for each loop
      for(String i : friends){
            System.out.println(i + "is my friend.");
        }
    }
}
