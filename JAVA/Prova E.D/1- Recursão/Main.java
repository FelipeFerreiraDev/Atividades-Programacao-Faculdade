class Main {

  static int calcula(int x){
    if(x <=2 || x == 0){
      return 1;
    }else{
      return x * x + calcula(x-1) + calcula(x-2);
    }
  }

  public static void main(String[] args) {
    int x = 3;

    System.out.printf("%d\n", calcula(x));
  }
}