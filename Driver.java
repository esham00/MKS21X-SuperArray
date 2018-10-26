public class Driver {
  public static void main(String[] args) {
    SuperArray sad, happy;
    sad = new SuperArray(5);
    happy = new SuperArray();
    System.out.println(sad.size() + ": 0");
    System.out.println(happy.size() + ": 0");
    sad.add("homework");
    sad.add("more homework");
    sad.add("even more homework");
    happy.add("less homework");
    System.out.println(happy.add("no homework") + ": true");
    System.out.println(sad.size() + ": 3");
    System.out.println(happy.size() + ": 2");
    sad.clear();
    System.out.println(sad.isEmpty() + ": true");
    System.out.println(happy.isEmpty() + ": false");
    sad.add("assigned hw");
    happy.add("found money");
    System.out.println(happy + ": [less homework, no homework, found money]");
    System.out.println(sad + ": [assigned hw]");
    System.out.println(happy.toStringDebug() + ": same as happy but + 7 null values after found money");
    System.out.println(sad.toStringDebug() + ": same as sad");
    System.out.println(happy.get(0) + ": less homework");
    System.out.println(sad.get(3) + ": null");
    System.out.println(happy.set(1, "graduated") + ": no homework");
    System.out.println(sad.add("stuck in stuy") + ": true");
    for (int i = 0; i < 8; i++) {
      sad.add("sad");
    }
    System.out.println(sad + ": should have 10 values");
    System.out.println(sad.contains("sad") + ": true");
    System.out.println(sad.contains("happy") + ": false");
    System.out.println(happy.contains("a") + ": false");
    System.out.println(sad.indexOf("sad") + ": 2");
    System.out.println(sad.indexOf("happy") + ": -1");
    System.out.println(happy.indexOf("a") + ": -1");
    System.out.println(sad.lastIndexOf("sad") + ": 9");
    System.out.println(sad.lastIndexOf("happy") + ": -1");
    System.out.println(happy.lastIndexOf("a") + ": -1");
    sad.add(3, "life");
    System.out.println(sad.size());
    sad.add(10, "life");
    happy.add(2, "life");
    happy.add(1, "life");
    System.out.println(sad);
    System.out.println(happy);
    sad.add(200, "life");
  }
}
