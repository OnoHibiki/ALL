class SetGetMethod {

    public static void main(String[] args) {
      Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
      person1.printData();
      Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
      person2.printData();
  
      System.out.println("----------------------");
      // person1のmiddleNameフィールドの値を「Claire」にしてください
      person1.setMiddleName("Claire");
      
      System.out.println("ミドルネームを" + person1.getMiddleName() + "に変更しました");
      person1.printData();
    }
    
  }
  