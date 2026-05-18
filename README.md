# 🍽️ Restoran Yönetim Sistemi - Aşama 1

Bu proje, bir restoran yönetim sisteminin ilk aşamasıdır. Sistemin güvenliği ve kullanıcı yönetimi için Java'nın OOP prensipleri (Kalıtım ve Kapsülleme) kullanılarak rol bazlı bir giriş sistemi (Login System) kodlanmıştır.

## 🚀 Özellik: Rol Bazlı Giriş Sistemi (Login System)
* **`Kullanici` (Base Class):** Ortak nitelikleri (ID, Ad-Soyad, Şifre, Rol) barındırır.
* **`Admin` & `Garson` (Subclasses):** `Kullanici` sınıfından miras alarak role özgü nitelikleri (örneğin Garson için performans puanı) yönetir.
* **`Login` (Service Class):** Sisteme kayıtlı kullanıcıları bir listede tutar ve girilen bilgileri (ID ve şifre) kontrol ederek başarılı girişte kullanıcıyı doğru panele yönlendirir.

## 🛠️ Creational (Oluşturucu) Tasarım Kalıbı Uygulaması
**Seçilen Kalıp:** Factory Method (Fabrika Metodu)

**Tasarım Kalıbının Seçim Nedeni:**
Sistemimizde farklı kullanıcı rolleri (Admin, Garson) bulunmaktadır. Nesne oluşturma mantığını ana koddan ayırmak, kodun okunabilirliğini artırmak ve gelecekte yeni roller (örneğin; Kasiyer, Müdür) eklendiğinde mevcut kodda değişiklik yapmadan sistemi esnek bir şekilde genişletebilmek amacıyla **Factory Method** kalıbı tercih edilmiştir.


## 🛠️ Kullanılan Teknolojiler ve Tasarım Kalıpları
* **Dil:** Java
* **Test:** JUnit
* **Tasarım Kalıbı:** Kullanıcı nesnelerinin (Admin, Garson) oluşturulması sürecinde **Factory Tasarım Kalıbı (Creational Pattern)** kullanılmıştır.
