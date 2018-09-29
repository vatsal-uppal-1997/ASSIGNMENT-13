import java.util.*;
class NameAndId implements Comparable<NameAndId> {
  String name;
  int id;
  NameAndId() {}
  NameAndId(String name, int id) {
    this.name = name;
    this.id = id;
  }
  void print() {
    System.out.println(this.id+" "+this.name);
  }
  public int compareTo(NameAndId temp) {
    if (this.id > temp.id)
      return 1;
    else if (this.id < temp.id)
      return -1;
    else
      if (this.name.equals(temp.name))
        return 0;
      else if (this.name.compareTo(temp.name) > 0)
        return 1;
      else
        return -1;
  }
}

class SortList {
  public static void main(String[] args) {
    List<NameAndId> ll = new ArrayList<>();
    ll.add(new NameAndId("vatsal",9));
    ll.add(new NameAndId("lamu",9));
    ll.add(new NameAndId("murtaz",1));
    ll.add(new NameAndId("rohit",4));
    ll.add(new NameAndId("sahil",8));
    ll.add(new NameAndId("shub",11));
    
    Collections.sort(ll); // ARRANGE ACCORDING TO CompareTo FUNCTION
    for (NameAndId i: ll)
      i.print();
    System.out.println();
  }
}
