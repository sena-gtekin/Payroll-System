// Person sınıfı temel bir kişiyi temsil eder.
class Person {
    private String name;

    // Kişi adıyla birlikte bir Person nesnesi oluşturulur.
    public Person(String name) {
        this.name = name;
    }

    // Kişinin adını döndüren metot.
    public String getName() {
        return name;
    }
}
