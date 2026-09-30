import java.util.*;
class solution{

public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int x=sc.nextInt();
int prev=sc.nextInt();
int count=0;

for(int i=1;i<x;i++){
    int curr=sc.nextInt();

    if(curr-prev>=3){
        count++;
    }

    prev=curr;
}

System.out.println(count);
}
}