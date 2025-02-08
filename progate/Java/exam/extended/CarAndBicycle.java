import java.util.Scanner ;

class CarAndBicycle {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      Bicycle bicycle = new Bicycle("ビアンキ","緑");
      System.out.println("【自転車の情報】");
      bicycle.printData();
      
      System.out.println("-----------------");
      System.out.println("走る距離を入力してください");
      int BicycleRunDistance = scanner.nextInt();
      bicycle.run(BicycleRunDistance);
      
      System.out.println("=================");
      
      Car car = new Car("フェラーリ","赤");
      System.out.println("【車の情報】");
      car.printData();
      
      System.out.println("-----------------");
      System.out.print("走る距離を入力してください:");
      int CarRunDistance = scanner.nextInt();
      car.run(CarRunDistance);
      
      System.out.println("-----------------");
      System.out.print("給油する量を入力してください：");
      int chargeGus = scanner.nextInt();
      car.charge(chargeGus);
      
      scanner.close();
  }
}