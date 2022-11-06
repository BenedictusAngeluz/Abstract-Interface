public class TestAbstract {
    public static void main(String args[]) {
        // Weapon weapon = new Knife();

        Weapon knife = new Knife();
        Weapon gun = new Gun(10);

        knife.attack();
        gun.attack();
        gun.attack();

        Weapon knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.attack();
        gun2.attack();
        gun2.attack();
    }

    /*
     * PERBAIKAN PADA LINE 3:
     * Hilangkan atau command instansiasi objek, karena variabel objek weapon tidak
     * digunakan dan seharusnya jika ingin digunakan, nama objek harus diganti
     * sesuai dengan nama jenis pisau (menyesuaikan class Knife()), serta tambahkan
     * kode untuk memanggil objek yang telah diinstansiasi.
     */

    /*
     * PERBAIKAN PADA LINE 12:
     * Class Knife diganti ke class Weapon, karena class Weapon merupakan abstract
     * super class yang digunakan untuk mendeskripsikan jenis senjata yang
     * digunakan.
     */
}