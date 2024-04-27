public class Three_darray {

public static void main(String[] args){
    int [] [] [] threedimArray= {{{1,2,3,4},{5,6,7,8},{9,10,11,12}},{{1,2,3,4},{3,5,6,7},{
        1,2,3,4}}};
        System.out.println("3dimensional Array");
        for (int i=0;i<threedimArray.length();i++) { 
            for(int j=0; j<threedimArray[i].length();j++) {
                for (int k=0; k<threedimArray[i][j].length();k++){
                    System.out.println(threedimArray[i][j][k]);
                }
                System.out.println();
            }
                
}
    
}
}

