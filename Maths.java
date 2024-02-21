import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Maths {
    public static void main(String[] args){
        Random random =new Random();
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        int score=0;

for(int i=0;i<5;i++){
    int choice=(random.nextInt(5)+1);
    int one=random.nextInt(50)+1;
    int two=random.nextInt(50)+1;
    ArrayList vec=new ArrayList<>();
    vec.add(one);
    vec.add(two);
    if(choice==1){
        System.out.println("the numbers are "+one+"+ "+two);
        int ans=one+two;
        System.out.println("enter your answer");
        int k=sc.nextInt();
if(k==ans){
    score++;
    System.out.println("answer is correct");
}else{
    System.out.println("wrong answer");
}


vec.add(ans);
arr.add(vec);

    }else if(choice==2){
        System.out.println("the numbers are "+one+"- "+two);
        int ans=one-two;
        System.out.println("enter your answer");
        int k=sc.nextInt();

        if(k==ans){
            score++;
            System.out.println("answer is correct");
        }else{
            System.out.println("wrong answer");
        }

        vec.add(ans);
        arr.add(vec);

    }else if(choice==3){
        System.out.println("the numbers are "+one+"* "+two);
        int ans=one*two;
        System.out.println("enter your answer");
        int k=sc.nextInt();


        if(k==ans){
            score++;
            System.out.println("answer is correct");
        }else{
            System.out.println("wrong answer");
        }


        vec.add(ans);
        arr.add(vec);
    }else {
        System.out.println("the numbers are "+one+" / "+two);
        int ans=one/two;
        System.out.println("enter your answer");
        int k=sc.nextInt();
        if(k==ans){
            score++;
            System.out.println("answer is correct");
        }else{
            System.out.println("wrong answer");
        }


        vec.add(ans);
        arr.add(vec);
    }
}


        System.out.println("the numbers along with answers are ");
for(int i=0;i<arr.size();i++){
    for(int j=0;j<3;j++){
        System.out.print(arr.get(i).get(j));
        System.out.print(' ');
    }
    System.out.println();
}
        System.out.println("your final score is "+ score);

    }
}
