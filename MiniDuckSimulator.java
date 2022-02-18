class MiniDuckSimulator {

  public static void main(String args[]) {

    System.out.println("\n===================");
    Duck rhd = new RedheadDuck();
    rhd.display();
    rhd.performQuack();
    rhd.swim();

    System.out.println("\n===================");
    Duck md = new MallardDuck();
    md.display();
    md.performQuack();
    md.swim();

    System.out.println("\n===================");
    Duck cd = new CanvasbackDuck();
    cd.display();
    cd.performQuack();
    cd.swim();

    System.out.println("\n===================");
    Duck rd = new RubberDuck();
    rd.display();
    rd.performQuack();
    rd.swim();

    System.out.println("\n===================");
    Duck nnd = new NinjaDuck();
    nnd.display();
    nnd.performQuack();
    nnd.swim();

    System.out.println("\n===================");
    Duck rrd = new RageDuck();
    rrd.display();
    rrd.performQuack();
    rrd.swim();

    System.out.println("\n===================");
    Duck gd = new GamerDuck();
    gd.display();
    gd.performQuack();
    gd.swim();


  }
}
