
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

//import java.util.ArrayList;import java.util.Arrays;
public class Main{

    //main function => principal methods call  to code compilation

    public static void firstProgram(){
        //Print I'AM THE BEST IN VSCODE CONSOLE
        System.out.println("I'AM THE BEST");

        ArrayList<Integer> chaine= new ArrayList<Integer>();
        chaine.add(2);
        System.out.println(chaine);
 
        System.out.println("Bonjour a tous");
 
        boolean val=false;
        System.out.println(val);
 
        Scanner scr =new Scanner(System.in);
        System.out.println("TAPER LE NOMBRE A METTRE AU CARRE");
        int value= scr.nextInt();
        System.out.println("Vous avez saisi : " + value + ". Son carré donne "+ value*value);
        scr.close();
    }
    /*************************************************************************************** */
    //firstUpperCaseV1 est plus solide.
    public static String firstUpperCaseV1(String text){
        //isEmpty permet de basculer d'un mode de remplissage a un autre
        boolean isEmpty= true;
        //result est la variable qui contient le resultat final
        String result= "";
        for(int i = 0 ;  i<text.length() ; i++){
        //Une boucle for pour parcourir chaque caractere du text taper
            //Si le caractere est différent de espace et que isEmpty est true
            if(text.charAt(i)!=' ' && isEmpty){
                //Le premier caractere est mis en majuscule et stocker dans la variable result;
                result+=Character.toUpperCase(text.charAt(i));
                //isEmpty passe a false pour que le code suivant soit exécuter
                isEmpty=false;
            }else{
                //Sinon la variable result est rempli jusqu'a l'apparution du premier caractere d'un nouveau mot
                result+=text.charAt(i);
            }
            //Si le caractere est vide => espace, isEmpty passe a true et la premier structure conditionnelle est exécuter
            if(text.charAt(i)==' '){
                isEmpty=true;
            }
        }
        //la fonction retourne le contenu de la variable result
        return result;
    }

/************************************************************************************** */

    //firstUpperCaseV2 
    public static String firstUpperCaseV2(String text){
        //Transfrmation de la chaine de caractere e un tableau contenant chaque mot
        String[] textSplit= text.split(" ");

        //Déclaration d'un tableau vide pour stocker chaque mot avec la premiere lettre en majuscule
        ArrayList<String> res= new ArrayList<String>();

        /*************************
         * Boucle for Each qui permet de stocker dans le tableau res
         * chacun des mots avec le premier caractere en majuscule
         *************************/
        for (String element : textSplit) {
            res.add(Character.toUpperCase(element.charAt(0)) + element.substring(1));
        }
        /*************************
         *return au final le contenu de la variable res
         *************************/
       return String.join(" ", res);
    }

/**************************************************************************************** */

    public static int LongestWord(String text){
        //Transfrmation de la chaine de caractere e un tableau contenant chaque mot
        String[] textSplit= text.split(" ");
        
        //Déclaration d'un tableau vide pour stocker la taille de chaque mot
        ArrayList<Integer> res= new ArrayList<Integer>();

         /*************************
         * Boucle for Each qui parcours le tableau textSplit et stocke dans ArrayList res
         * le length de chaque mot
         *************************/
        for (String wordLength : textSplit) {
            res.add(wordLength.length());
        }
        /*************************
         * Ala sortie de la boucle, le tableau res contient la taille de chacun
         * des mots de la chaine de caractere
         * On peut donc y accéder tres simplement en l'imprimant
         *************************/

         //Declaration d'un tableau pour stocker le contenu de ArrayList res
        int [] result= new int[textSplit.length];

         /*************************
         * Cette boucle transforme ArrayList res en un tableau
         *************************/
        for (int i = 0 ; i<textSplit.length ; i++) {
            result[i]= res.get(i);
        }

        /*************************
        *result est maintenant un tableau sur qu'on peut arranger avec la methode Arrays.sort(tab)
        NB: Arrays.sort agit directement sur un tableau 
        Toute tentative de stockage de sa valeur de retour dans une variable engendre une erreur 
        *************************/
       Arrays.sort(result);

        return result[textSplit.length-1];
    }

/****************************************************************************************** */
    //methode static LargestNumber
    public static int LargestNumber(int[] tab){
        //Arranger le tableau par ordre croissant
        Arrays.sort(tab);
        //Retourner le dernier element du tableau tab
        return tab[tab.length - 1];
    }

/********************************************************************************** */

    // methode static confirmEnd
    public static boolean ConfirmEnd(String chaine, String caract){
        //La valeur de retour est true si endsWith renvoie true ou false sinon
        // return chaine.endsWith(caract);
        //ou 
        return chaine.endsWith(caract)? true:false;
    }

/************************************************************************************** */

    public static String truncate(String words, int number){
        //Déclaration d'une chaine de caractere vide
        String str  = "";

        /* 
         * Boucle for qui parcours de tableau et execute une instructiona divers 
         * niveau
         */
        for(int i = 0 ; i<words.length() ; i++){

            /**
             * Remplisage de la cariable str
             */
            str+=words.charAt(i);

            /**
             * if (condition qui arrete la boucle lorsque i est égale a number)
             */
            if(i == number){
                /*
                 * Remplissage avec ...
                 */
                str+= "...";
                /**
                 * Arret + sortie de la boucle
                 */
                break;
            }
        }
        //valeur de retour 
        return str;
    }

/*************************************************************************************** */
    
    public static int findElement(int[] tab){
        /**************************************************************
         * res => tableau vide pour contenir au final l'élement recherché
        *****************************************************************/
        ArrayList<Integer> res= new  ArrayList<Integer> ();
        for(int i = 0 ; i<tab.length; i++){

            /********************
             * if (condition) verifiant si le chiffre est pair donc => modulo par 2 ==0
             */
            if(tab[i]%2 ==0){
                res.add(tab[i]);
            }
        }
        return res.get(0);
    }

/************************************************************************ */

    public static String repeat(String str, int number){
        String result= "";
        /************************************************************************
         * Declaration d'un compteur a 0 pour le controle de l'execution du code
         * notamment l'arret lorsque le nombre de repetition est atteint
        ******************************************************************* */
        int compt=0;

        /**********************************************************************
         * ***Boucle while qui parcours repete str tant que compte n'est paas 
         * egale a number
        ***************************************************************** *****/

        while(compt<number){
            result+=str;
            /**
             * Incrémentation de la variable compt a 1 
             * a chaque entrée dans la boucle
             */
            compt++;
        }
        return result;
    }

/*********************************************************************** */

    public static int factorize(int number){
        /**************************************
         * Role de la function factorize()
        ********************************************/

        /***
         * factorize() est une fonction mathématique qui calcule en un clic 
         * le factoriel de tout nombre entier comme cela se fait en mathématiques.
         * Elle prend donc comme argument un nombre entier
         */

        /****************************************************************************
          * Details sur les variables déclarées
        *****************************************************************************/
        
        /**
         **compt=>variable qui est incrementer a chaque execution de la boucle jusqu'a ce que celle-ci soit inférieur a number
         */

        int compt=0;

        /**
         *response=> variable contenant le resultat final 
         */

        int response=1;

        /**
         **args=> Multiplicateur a chaque exécution de la boucle while
         */

        int args=1;

        /**
         * Boucle while 
         */
        while(compt<number){
            /**
             * la valeur précedente de response est multiplier par sa nouvelle valeur
             */
            response*=args;
            /**
             * Incrémentation args
             */
            args++;
            /**
             * Incrementation compt
             */
            compt++;
        }
        return response; 
    }

/********************************************************************** */

    public static void frankenSplice(int[]tab1, int[]tab2, int place){

        /**
         * frankenSplice(int[]tab1, int[]tab2, int index) est une fonction qui copie les élements
         * de tab2 a l'index place du tab1
        */
        ArrayList <Integer> val = new ArrayList<Integer>();

        for(int i = 0 ;  i <(tab1.length) ; i++){
            val.add(tab1[i]);
            if(i==place){
                for(int j = 0 ;  j <(tab2.length) ; j++){
                    val.add(tab2[j]);
                }
            }    
        }
        System.out.println(val);
    }

/*************************************************************************/

    
/*Object[] array= new Object[3];
       array[0]= "toto";
       array[1]= true;
       array[2]= 15;
       System.out.println(Arrays.toString(array));*/

/********************************************************************** */

    public static void swap(int a , int b){
        System.out.println("avant : a = " +a);
        System.out.println("avant : b = " +b);

        System.out.println("Apres");

        /**
         * initialisation d'une variable intermédiaire c pour 
         * garder en memoire la valeur de a 
         */
     
        int c = a;

        /**
         * a contient  b
         */
        a=b; 

        /**
         * b contient  c
         */
        b=c;
       
        System.out.println("apres : a = " +a);
        System.out.println("apres : b = " +b);
    }

    public static void hyp(double a , double b){
        
        /**
         * initialisation d'une variable c qui contient le carré des deux arguments
         */
        double c = a*a + b*b;
        /**
         * On détermine la racine carré de c avec Math.sqrt()
         */
        double res= Math.sqrt(c);

        /**
         * Imprimer le contenu de chaque variable
         */
        System.out.println("a  = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+res);
    }

    public static void arraySort(int [] tab){
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void getExtremum(String str){
        String [] strSplit= str.split(" ");
        int strSplitInt[]= new int [strSplit.length];
        
        for(int i = 0 ;  i < strSplit.length ; i++){

            // String val = strSplit[i];
            // int k = Integer.valueOf(val).intValue();
            // strSplitInt[i]=k;

            /**
             * Integer.parseInt() permet de convertir une chaine de caractere
             * en string 
             */
            strSplitInt[i]=  Integer.parseInt(strSplit[i]);
        }

        Arrays.sort(strSplitInt);
        System.out.println(Arrays.toString(strSplitInt));
        int [] res=new int[2];
        /**
         * la plus petite et la grande valeur sont stockés dans le tableau 
         * res
         */
        res[0]=strSplitInt[0];
        res[1]= strSplitInt[strSplitInt.length- 1];
        String result = ""; 
        for(int i :res ){
            result += i+" ";
        }
        System.out.println(result);
    }

/******************************************************************** */

    public static void Calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taper le premier nombre");
        int number1 = scanner.nextInt();
        System.out.println("Taper le deuxieme nombre");
        int number2 = scanner.nextInt();
        System.out.println("Taper l'operateur");
        scanner.nextLine();
        char oper = scanner.nextLine().charAt(0);
        if(oper =='+'){
            System.out.println(number1+number2);
        }
        /**
         * fermer le scanner
         */
        scanner.close();
    }

    public static void showUserInfos(){
        

        String option;
        while(true){
            option = JOptionPane.showInputDialog("Calculatrice \n Do you wish to proceed? \n Y for yes and N for No");
        
            switch(option){
                case "Y":
                    String num1 = JOptionPane.showInputDialog("Enter the first number : ");
                    String operation = JOptionPane.showInputDialog("Operations:\n + for addition\n - for subtraction\n * for multiplication\n / for division"
                            + "Enter the operation:");
                    String num2 = JOptionPane.showInputDialog("Enter the second number : ");
                
                    switch(operation){
                        case "+":
                            JOptionPane.showMessageDialog(null,Integer.parseInt(num1) + Integer.parseInt(num2));
                            break;
                        case "-":
                            JOptionPane.showMessageDialog(null, Integer.parseInt(num1) - Integer.parseInt(num2));
                            break;
                        case "*":
                            JOptionPane.showMessageDialog(null,Integer.parseInt(num1) * Integer.parseInt(num2));
                            break;
                        case "/":
                            JOptionPane.showMessageDialog(null, Integer.parseInt(num1) / Integer.parseInt(num2));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Please enter a valid operator\n Operations: + for addition\n - for subtraction\n * for multiplication\n / for division");
                    }break;
                case "N":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"You entered an invalid key!");
                    break;
            }      
        }
    }
 
    static int plusMethod(int x, int y) {
        return x + y;
    }
      
    static int plusMethod(byte x, int y) {
        return x + y;
    }
    /*
     * calculer la difference entre une suite de nombre
     */
    public  int SumDiffArrayV1(int [] array){

        Integer[] tab = new Integer [array.length];

        Arrays.sort(array);

       for(int i =0 ; i<array.length ; i++ ){
            tab[i]= array[i] ; 
       }

       Arrays.sort(tab ,  Collections.reverseOrder());
       
       int response= 0 ;

       for(int i = 0 ; i < tab.length-1 ; i++ ){
        response += (tab[i]-tab[i+1]);
       }

       return array.length > 0 ? response:0;
    }
    public static void main(String args[]) {
        /*
         * création d'un objet
         */
        Main instance = new Main(); 
       int tab1[] = {2,1,10};
    //    int tab2[]= {3,7,5,9};
    //    int response1= instance.SumDiffArray(tab1);
    //    int response2= instance.SumDiffArray(tab2);
    //    System.out.println(response1);
        int res= instance.SumDiffArrayV1(tab1);
        System.out.println(res);
    }
}
