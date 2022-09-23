
*****KOD CIKTISI:*****
--Student class "COMPARABLE" interface i implement etmiş ve compareTo() override edilmiş iken numaralara göre dizilme durumu
Students class içinde override edilen metod. (Yorum satırına alındı)
First name:Taha
Number:555

First name:KORAY
Number:444

First name:Fatma
Number:333

First name:Cemil
Number:222

First name:Feyza
Number:111

--StudentComparator class oluşturuldu. "COMPARATOR" interface i implement etti. Compare i override etti. Ve nesnesi üretildi

   " Comparator<Students> st=new StudentsComparator();
        Collections.sort(students,st);
        students.forEach(System.out::println);"

        Ekran çıktısı:
        First name:Feyza
        Number:111

        First name:Cemil
        Number:222

        First name:Fatma
        Number:333

        First name:KORAY
        Number:444

        First name:Taha
        Number:555



