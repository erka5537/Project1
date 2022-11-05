package day23inheritancepolymorphism;

public class Bird extends Animal{

    /*
        "final" keyword nedir?

        "final" keyword i)Variable'larda kullanılabilir
                            public final int age = 12;
                            a)Atanan değer değiştirilemez
                            b)Değer ataması yapmak zorundasınız.

                        ii)Method'larda kullanılabilir
                            public final int add(){
                                    return a+b;
                            }
                            a)Bir method oluşturulurken "final" olarak oluşturulmuş ise
                              o methodun body'si asla değiştirilemez. Dolayısıyla o method override edilemez.

                        iii)Class'larda kullanılabilir
                            Bir class'ı "final" yaparsanız o Class'ı kısırlaştırmış olursunuz.
                            Bir class "final" ise o Class'a extend edilemez.
                            "final" Class Child olabilir.

                            final variable'lar isimlendirilirken büyük harfler kullanılır, isimlendirmede birden fazla kelime
                            kullanılırsa kelimeler arasina "_" konulur
     */

}
