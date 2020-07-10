package org.kodluyoruz;

/**
 * Bu sınıf bir ekran kartını temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her ekran kartının Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 4 GB, 8 GB vs.
 *      - Renk skalası (bits) (int türünde) Örnek: 128 bits, 256 bits vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class GPU extends Hardware
{
private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    private int bits;
    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    /*
     * Eğer ekran kartının hafızası 8 GB'tan fazlaysa, her 2 GB için fiyatı 250 TL artar.
     * Eğer ekran kartının renk skalası 128 bits'ten fazlaysa, her 64 bits için fiyatı 400 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */
    @Override
    public double calculateprice()
    {

        /*if(memory>8 && bits>128)
        {   int memorypiece= ((memory-8)/2);
            for(int i=0; i>=memorypiece; i++)
            {

                int sonuc=((memory-8)/2);
                price+=250;
            }

            int bitspieces=((bits-128)/64);
            for(int i=0;i>=bitspieces;i++)
            {
                price+=400;
            }

        }*/

    if(memory>8)
    {   int memorypiece= ((memory-8)/2);
        for(int i=0; i>memorypiece; i++)
        {

          price+=250;
        }
    }
   else if(bits>128)
   {    int bitspieces=(int)((bits-128)/64);
        price+=(bitspieces*400);


    }
return price;
    }


}
