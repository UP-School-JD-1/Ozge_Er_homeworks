Fiyat,Konum ve Ürün olup olmama durumları interface de toplandı.
Beden ölçüleri ve depolar için enum oluşturuldu.
Food ve Cloth class larda kullanıcı girişi kullanıldı.


a.Danışmanlık hizmeti sağlama

ConsultantProduct class eklenmek istenmesi halinde bu yapıda eklenebilir.
Locationable interface i implement etmeden.

b.Kurumdaki eskimiş bilgisayarları satma (Product değil)

Stuff class genel bir sınıf. Subclass ları ürün veya değil. Productable interface i
implement eder veya etmez.

Ürün olmayan şey için stuff classtan nesne üretilebilir.

c.Ürettikleri ürünlerden özel günlerde hediye verme(Product ın fiyatı vardı)


GiftProducts Priceable a sahip değil. Fiyat bilgisi yok.


*****KODUN ÇIKTISI*********

****Gift Product****

Urunun satisi varmi?:false
Urunun iadesi varmi?:false
Bulundugu depo:GEBZE
Depo icinde bulundugu yer:B15200
Kargo durumu:Urununuz bir gun icinde kargoya verilecektir.


****Food Product****

kac kilo salatalik istiyorsunuz?
3 // kullanıcı girişi
Urunun satisi varmi?:true
Urunun iadesi varmi?:false
Bulundugu depo:AVRUPA
Depo icinde bulundugu yer:A002
Fiyat:30
Odeme durumu:odeme gerceklestirildi.
Kargo durumu:Gun icinde kargoya verilecektir.


****Cloth Product****

Sepete kac adet pembe gomlek eklensin?
5 //kullanıcı girişi
Urunun satisi varmi?:true
Urunun iadesi varmi?:true
Bulundugu depo:TUZLA
Beden:XL
Fiyat:375
Odeme durumu:Odemeniz basariyla gerceklesti.
Kargo durumu:Urununuz bir gun icinde kargoya verilecektir.

Process finished with exit code 0





