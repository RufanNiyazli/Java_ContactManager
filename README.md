﻿# Java_ContactManager
# Əlaqə İdarəetmə Sistemi

## Ümumi Baxış

Bu, **Java** dilində yazılmış sadə **Əlaqə İdarəetmə Sistemi**dir. Proqram istifadəçilərə aşağıdakı əməliyyatları yerinə yetirməyə imkan verir:

- **Əlaqələri göstərmək** (Bütün saxlanılan əlaqələri ekranda göstərir)
- **Yeni əlaqə əlavə etmək** (Ad və telefon nömrəsi daxil edərək yeni əlaqə yaratmaq)
- **Əlaqə tapmaq** (Ad əsasında axtarış aparmaq və nömrəni göstərmək)
- **Əlaqəni silmək** (Ad və ya telefon nömrəsinə əsasən əlaqəni silmək)
- **Telefon nömrəsinə görə sıralamaq** (Əlaqələri telefon nömrəsinə əsasən sıralamaq və göstərmək)
- **Ada görə sıralamaq** (Əlaqələri ada əsasən sıralamaq və göstərmək)

## Xüsusiyyətlər

- **ArrayList** istifadə edərək əlaqələri dinamik olaraq saxlayır.
- **Axtarış, sıralama və silmə** funksiyalarını yerinə yetirir.
- **İstifadəçi üçün interaktiv menyu** təqdim edir.

## Proqramın İşə Salınması

1. **Java fayllarını tərtib edin:**
   ```sh
   javac Main.java Contact.java
   ```
2. **Proqramı başladın:**
   ```sh
   java Main
   ```
3. Ekranda göstərilən təlimatlara əməl edərək əlaqə idarəetmə sistemindən istifadə edin.

## Kod Strukturu

### `Main.java`

- Əsas məntiqi və istifadəçi interfeysini özündə cəmləşdirir.
- İstifadəçi ilə davamlı qarşılıqlı əlaqə yaratmaq üçün döngüdən istifadə edir.
- İstifadəçi seçimlərinə əsasən müxtəlif əməliyyatları idarə edir.

### `Contact.java`

- **`Contact`** sinfini təyin edir və aşağıdakı iki **private** atributa malikdir:
  - **`name`**: Əlaqənin adını saxlayır.
  - **`phoneNumber`**: Əlaqənin telefon nömrəsini saxlayır.
- **Getter və setter metodları** vasitəsilə məlumatları oxumaq və dəyişdirmək mümkündür.

## Menyu Seçimləri

| Seçim  | Funksiya                                        |
|--------|-------------------------------------------------|
| `1`    | Bütün əlaqələri göstərmək                      |
| `2`    | Yeni əlaqə əlavə etmək                         |
| `3`    | Ad üzrə əlaqəni axtarmaq                       |
| `4`    | Ad və ya telefon nömrəsinə əsasən əlaqəni silmək |
| `5`    | Əlaqələri telefon nömrəsinə görə sıralamaq      |
| `6`    | Əlaqələri ada görə sıralamaq                   |

## Kodun İzahı

1. **İstifadəçi interfeysi və menyu**:
   - `System.out.println(...)` ilə istifadəçiyə seçimlər göstərilir.
   - `Scanner` obyekti (`scanner.nextInt()` və `scanner.nextLine()`) istifadəçidən giriş almaq üçün istifadə olunur.
   - `while` döngüsü proqramın təkrarlanmasını təmin edir.

2. **Əlaqələrin saxlanılması**:
   - `ArrayList<Contact> contacts = new ArrayList<>();` əlaqələrin dinamik siyahısını yaradır.
   - İstifadəçi **2 düyməsinə** basaraq yeni əlaqə əlavə edə bilər:
     ```java
     Contact newContact = new Contact();
     newContact.setNamePhoneNumber(name, phoneNumber);
     contacts.add(newContact);
     ```

3. **Əlaqəni tapmaq**:
   - İstifadəçi **3 düyməsinə** basaraq adı daxil edir və siyahıda axtarış aparılır:
     ```java
     for (Contact contact : contacts) {
         if (contact.getName().equals(findNumber)) {
             System.out.println(contact.getPhoneNumber());
             break;
         }
     }
     ```

4. **Əlaqəni silmək**:
   - `removeIf()` metodu vasitəsilə əlaqə siyahıdan çıxarılır:
     ```java
     contacts.removeIf(contact -> contact.getName().equals(toRemove) || contact.getPhoneNumber().equals(toRemove));
     ```

5. **Əlaqələri sıralamaq**:
   - Telefon nömrəsinə görə sıralamaq:
     ```java
     contacts.sort((c1, c2) -> c1.getPhoneNumber().compareTo(c2.getPhoneNumber()));
     ```
   - Ada görə sıralamaq:
     ```java
     contacts.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
     ```

## Nümunə İstifadə

```
Welcome, Sir.
Show Contact-->1: Add Contact-->2: Find Contact-->3: Remove Contact-->4: Sort Contacts by Number-->5: Sort Contact by Name -->6
Enter your choice: 2
Enter the name: John Doe
Enter the phone number: 123456789
Contact added successfully.
```

## Mümkün Təkmilləşdirmələr

- Əlaqələri **faylda saxlamaq**, beləliklə proqram bağlandıqda məlumatlar itməsin.
- **Tam uyğunluğu olmayan adlara görə axtarış** funksiyası əlavə etmək.
- **Qrafik istifadəçi interfeysi (GUI)** əlavə edərək daha rahat istifadə etmək.

## Lisenziya

Bu layihə açıq mənbəlidir və hər kəs tərəfindən istifadə və dəyişdirilə bilər.

