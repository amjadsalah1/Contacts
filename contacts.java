

package project2;

import java.util.Scanner;

public class projects {
     public static void main(String[] args) {
         
         Scanner in = new Scanner(System.in);
         String list[][] = new String [200][3]; // [name,type,number]
         int countOfContact = 0;
         while(true){
            System.out.print("Welcome to our Address Book, Please to find what you want\n\t1.Add new contact\n\t2.Search by name\n\t3.Search by number\n\t4.Delete contact by name\n\t5.Delete contact by number\n\t6.Show all contact\n\t7.Exit\nPlease to enter you choice: ");
            int choiceByUser = in.nextInt();
            
            if(choiceByUser == 1){
                System.out.print("Enter the name of new contact: ");
                in.nextLine();
                String nameOfContact = in.nextLine().toLowerCase(); 
                
                System.out.print("Enter the type of new contact (Family/Personal/Work/Other): ");
                String typeOfContact = in.nextLine().toLowerCase();
                if(!(typeOfContact.equals("family") || typeOfContact.equals("personal") || typeOfContact.equals("work") || typeOfContact.equals("other"))){
                    typeOfContact = "other";
                    System.out.println("your enterd no in choices and we storage a type(other)");
                }
                
                System.out.print("Enter the number of new contact: ");
                String numberOfContact = in.nextLine();
                
                boolean numberIsLoop = false; 
                for(int i=0;i<numberOfContact.length();i++){ 
                   if(numberOfContact.equals(list[i][2])){
                     numberIsLoop = true;
                     break;
                   }
                   }
                
                   
                   if(numberIsLoop){
                       System.out.println("The number your enter has already exist, try again");
                   }else{
                     list[countOfContact][0] = nameOfContact;
                     list[countOfContact][1] = typeOfContact;
                     list[countOfContact][2] = numberOfContact;
                     countOfContact++;
                       System.out.println("The add is successful");
                   }
                   
                   
                   
  
                }else if(choiceByUser == 2){
                    System.out.print("Enter the name you need search: ");
                    in.nextLine();
                    String nameSearch = in.nextLine().toLowerCase();
                    boolean nameIsFound = false;
                   
                    for(int i=0;i<countOfContact;i++){ 
                       if(list[i][0].contains(nameSearch)){      
                           System.out.println("("+list[i][0]+"\t"+list[i][1]+"\t"+list[i][2]+")");
                            nameIsFound = true;
                       }
                    }
                    if(!nameIsFound){
                        System.out.println("Not found, try again");
                    }
                    
                   
                    
                }else if(choiceByUser == 3){
                        System.out.print("Enter the number you need search: ");
                        in.nextLine();
                        String numberSearch = in.nextLine();
                        
                        
                        boolean numberIsFound = false;
                        for(int i=0;i<countOfContact;i++){
                           if(numberSearch.equals(list[i][2])){
                               System.out.println("("+list[i][0]+"\t"+list[i][1]+"\t"+list[i][2]+")");
                               numberIsFound = true;
                               break;
                           }
                        }
                        
                        
                        
                    }else if(choiceByUser == 4){
                           System.out.print("Enter the name you need Delete: ");
                           in.nextLine();
                           String nameDelete = in.nextLine().toLowerCase();
                           int countBeletedByName = 0;
                           
                           for(int i=0;i<countOfContact;i++){
                              if(list[i][0].equals(nameDelete)){
                                  for(int j=i;j<countOfContact;j++){
                                    list[j][0] = list[j+1][0];
                                    list[j][1] = list[j+1][1];
                                    list[j][2] = list[j+1][2];
                                    
                                countOfContact--;
                                countBeletedByName++;
                                i--;
                                
                                  }
                              }   
                           }
                           
                           if(countBeletedByName > 0){
                               System.out.println("Correct delete");
                               System.out.println("count of deleted by name :"+countBeletedByName);
                           }else{
                               System.out.println("Not found the name you need delete");
                           }
                           
                           
                           
                    }else if(choiceByUser == 5){
                        System.out.print("Enter the number you need Delete: ");
                        in.nextLine();
                        String numberDelete = in.nextLine();
                        int countOfDeletedByNumebr = 0;
                        
                        for(int i=0;i<countOfContact;i++){
                           if(list[i][2].equals(numberDelete)){
                               for(int j=i;j<countOfContact;j++){
                                  list[j][0] = list[j+1][0];
                                  list[j][1] = list[j+1][1];
                                  list[j][2] = list[j+1][2];
                                          
                               }
                               i--;
                               countOfContact--;
                               countOfDeletedByNumebr++;
                              
                        }
                        }
                        
                        if(countOfDeletedByNumebr > 0){
                            System.out.println("Correct Deleted");
                            System.out.println("count of contacts deleted by number : "+countOfDeletedByNumebr);
                        }else{
                            System.out.println("Not found");
                        }
                         
                         
                         
                    
                     }else if(choiceByUser == 6){

                         for(int i=0;i<countOfContact;i++){
                             System.out.println("("+list[i][0]+"\t"+list[i][1]+"\t"+list[i][2]+")");
                             System.out.println("---------------------------------------------------------------------------------");
                           
                         }
                         
                    
                    }else if(choiceByUser == 7){
                        System.out.println("You choice to exit programe");
                        break;
                    
                    
                     }else{
                        System.out.println("error input");
                    }

                }
                
            }
         }
         
       
    
    

