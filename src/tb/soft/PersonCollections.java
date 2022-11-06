package tb.soft;

import java.util.*;

public class PersonCollections {
    private static Set<Person> hashSet1;
    private static Set<Person2> hashSet2;

    private static Set<Person> treeSet1;
    private static Set<Person2> treeSet2;

    private static List<Person> arrayList1;
    private static List<Person2> arrayList2;

    private static List<Person> linkedList1;
    private static List<Person2> linkedList2;

    private static Map<Person, Integer> hashMap1;
    private static Map<Person2, Integer> hashMap2;

    private static Map<Person, Integer> treeMap1;
    private static Map<Person2, Integer> treeMap2;

    public PersonCollections(){
        hashSet1 = new HashSet<>();
        hashSet2 = new HashSet<>();
        treeSet1 = new TreeSet<>();
        treeSet2 = new TreeSet<>();
        arrayList1 = new ArrayList<>();
        arrayList2 = new ArrayList<>();
        linkedList1 = new LinkedList<>();
        linkedList2 = new LinkedList<>();
        hashMap1 = new HashMap<>();
        hashMap2 = new HashMap<>();
        treeMap1 = new TreeMap<>();
        treeMap2 = new TreeMap<>();
    }

    public static void add(Person person) throws PersonException{
        Person2 person2 = new Person2(person);
        hashSet1.add(person);
        hashSet2.add(person2);
        treeSet1.add(person);
        treeSet2.add(person2);
        arrayList1.add(person);
        arrayList2.add(person2);
        linkedList1.add(person);
        linkedList2.add(person2);
        hashMap1.put(person,hashMap1.size()+1 );
        hashMap2.put(person2, hashMap2.size()+1);
        treeMap1.put(person, treeMap1.size()+1);
        treeMap2.put(person2, treeMap2.size()+1);
    }

    public static void remove(Person person) throws PersonException{
        Person2 person2 = new Person2(person);
        hashSet1.remove(person);
        hashSet2.remove(person2);
        treeSet1.remove(person);
        treeSet2.remove(person2);
        arrayList1.remove(person);
        arrayList2.remove(person2);
        linkedList1.remove(person);
        linkedList2.remove(person2);
        hashMap1.remove(person);
        hashMap2.remove(person2);
        treeMap1.remove(person);
        treeMap2.remove(person2);
    }

    public Set<Person> getHashSet1() {
        return hashSet1;
    }

    public Set<Person2> getHashSet2() {
        return hashSet2;
    }

    public Set<Person> getTreeSet1() {
        return treeSet1;
    }

    public Set<Person2> getTreeSet2() {
        return treeSet2;
    }

    public List<Person> getArrayList1() {
        return arrayList1;
    }

    public List<Person2> getArrayList2() {
        return arrayList2;
    }

    public List<Person> getLinkedList1() {
        return linkedList1;
    }

    public List<Person2> getLinkedList2() {
        return linkedList2;
    }

    public Map<Person, Integer> getHashMap1() {
        return hashMap1;
    }

    public Map<Person2, Integer> getHashMap2() {
        return hashMap2;
    }

    public Map<Person, Integer> getTreeMap1() {
        return treeMap1;
    }

    public Map<Person2, Integer> getTreeMap2() {
        return treeMap2;
    }
}