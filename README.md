# MVVMShoppingList

Bu proje, Android Studio kullanılarak geliştirilmiş basit bir alışveriş listesi uygulamasıdır. Uygulama, MVVM (Model-View-ViewModel) mimarisi kullanılarak tasarlanmıştır.

## Özellikler

- Alışveriş listesine öğe ekleyebilme.
- Alışveriş listesinden öğe kaldırabilme.
- Alışveriş listesindeki öğelerin miktarını belirleme.

## Teknolojiler ve Kütüphaneler

- Kotlin programlama dili.
- Android Jetpack bileşenleri (ViewModel, Room).
- Coroutines
- RecyclerView kullanarak listeleme.
- Koin kullanarak Dependency Injection.

## Mimari

Uygulama, MVVM mimarisi prensiplerine uygun olarak tasarlanmıştır. Temel bileşenler şunlardır:

- **Model:** Alışveriş öğelerini ve Room veritabanını temsil eder.
- **View:** Kullanıcı arayüzünü oluşturur ve kullanıcının etkileşimine yanıt verir.
- **ViewModel:** View ve Model arasındaki iletişimi yönetir, iş mantığını uygular.

## Kurulum

Proje dosyalarını bilgisayarınıza klonlayın veya ZIP olarak indirin. Android Studio'da açın ve emülatör veya fiziksel bir cihaz üzerinde çalıştırın.

```bash
git clone https://github.com/kullanici/alisveris-listesi-uygulamasi.git
