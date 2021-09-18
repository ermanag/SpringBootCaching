# SpringBootCaching
Spring caching Example

İlgili işlemin sonucuna caching özelliği verebilmek için "@Cacheable" anotasyonu ile işaretliyoruz.

    @RequestMapping("/getPersonelInformations")
    @Cacheable(value = "getCachePersonel")
    public List<Personel> getPersonelInformations(){

        List<Personel> personelList = Arrays.asList(new Personel(1, "TESTUSER1","TESTUSER1",1111111111,"TESTUSER@TEST.COM"),
                new Personel(2, "TESTUSER2","TESTUSER2",222222222,"TESTUSER2@TEST.COM"),
                new Personel(3, "TESTUSER3","TESTUSER3",333333331,"TESTUSER3@TEST.COM"));

        return personelList;
    }
    
Uygulamamızın main metoduna da caching özelliğini aktif edebilmek için "@EnableCaching" anotasyonunu kullanıyıyoruz.

    @SpringBootApplication
    @EnableCaching
    public class SpringCacheApplication {

      public static void main(String[] args) {
          SpringApplication.run(SpringCacheApplication.class, args);
      }

    }

        
