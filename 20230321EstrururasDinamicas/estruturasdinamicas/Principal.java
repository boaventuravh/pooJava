package estruturasdinamicas;

import java.util.ArrayList;
import java.util.HashMap;

public class Principal {

 public static void main(String[] args) {
  String lista[]= {"Oi","Olá","Como vai?"};
  
  lista[0]="Uma String qualquer";
  
  for (int i = 0; i < lista.length; i++) {
   String string = lista[i];
   
  }
  

  ArrayList<String> listaDinamica=new ArrayList<String>();
  
  listaDinamica.add("Oi");
  listaDinamica.add("Como vai?");
  listaDinamica.set(1, "Alo");
  listaDinamica.isEmpty();
  listaDinamica.add(0, "Mais um");
  
  
  for (int i = 0; i < listaDinamica.size(); i++) {
   String item = listaDinamica.get(i);
   System.out.println(item);
  }
  
  /*for (String item : listaDinamica) {
   System.out.println(item);
  }*/
  
  HashMap<String, String> arvore=new HashMap<>();
  arvore.put("01A", "A casa e azul");
  arvore.put("01B", "A casa e rosa");
  //arvore.put("01B", "A casa e preta");
  
  String valor=arvore.get("01A");
  
  for (String item : arvore.keySet()) {
   System.out.println(item);
  }
  
 }

}