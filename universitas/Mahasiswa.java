
package universitas;


public class Mahasiswa {
    String npm, nama, prodi;

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getDetail() {
      System.out.println("nama \t: "+ nama);
      System.out.println("npm \t: "+ npm);
      System.out.println("prodi \t: "+ prodi);
        return null;
        
    }

    
}
