package org.kodluyoruz;

/**
 * Bu sınıf bir RAM'i temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her RAM'in Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 8 GB, 16 GB vs.
 *      - Frekansı (frequency) (int türünde) Örnek: 3200 MHz, 3600 Mhz vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class RAM extends Hardware {
    /*
     * Eğer RAM'in hafızası 16 GB'tan fazlaysa, her 4 GB için fiyatı 100 TL artar.
     * Eğer RAM'in frekansı 3600 MHz'den fazlaysa, her 400 MHz için fiyatı 200 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */
    private int memory;
    private int frequency;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public double calculateprice() {
       /* if(memory>16 && frequency>3600) {
            int memorypiece = ((memory - 16) / 4);
            for (int i = 0; i >= memorypiece; i++) {
                price = price + 100;
            }

            int frequencypiece = ((frequency - 3600) / 400);
            for (int i = 0; i >= frequencypiece; i++) {
                price = price + 200;

            }
        }



         if (memory > 16) {
            int memorypiece = ((memory - 16) / 4);
            for (int i = 0; i >memorypiece; i++) {
                price += 100;
            }
        }
        if (frequency > 3600) {
            int frequencypiece = ((frequency - 3600) / 400);
            for (int i = 0; i > frequencypiece; i++) {
                price += 200;

            } */
        
        if (memory>16)
        {
            int memorypiece=(int)((memory-16)/4);
            price+=(memorypiece*100);
        }
        if (frequency>=3600)
        {
            int frequencypiece=(int)((frequency-3600)/400);
            price+=(frequencypiece*200);
        }
        
        
        


        }
        return price;
    }
















}
