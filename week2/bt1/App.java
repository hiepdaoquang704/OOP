public class App {
    public App() {
      Button btn = new Button("Button");
      btn.setBounds(50, 50, 50, 50);
      add(btn);
      setSize(150, 150);
      setTitle("This is my First AWT example");
      setLayout(new FlowLayout());
      setVisible(true);
      addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent we) {
              dispose();
          }
      });
    }
  
    public static void main(String[] args) {
      new App();
    /*  System.out.println("test");
      testConstructor testCon = new testConstructor();
      System.out.println(testCon.x);
  */
      // Test Book
      /* Book myObj = new Book("a", "b", 2);
      System.out.println(myObj.title);
      Student myStu = new Student();
      myStu.StudentID = "abcd";
      System.out.println(myStu.StudentID); */
  
      // Test Time
      Time myTime = new Time();
      int h = 10;
      myTime.setHour(h);
      System.out.println("vi du ve time, cac ban co the viet them tuy thuoc vao moi sinh vien");
      System.out.println(myTime.stringToScreen()); 
    }
}
  