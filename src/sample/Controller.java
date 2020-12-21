package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textnama;
    public TextField textnim;
    public TextField textumur;
    public TextField textjurusan;
    public Label labelPesan;
    private Koneksi koneksi = new Koneksi();

    public void buttontext(ActionEvent actionEvent) {
        String nama = textnama.getText();
        String nim = textnim.getText();
        String umur = textumur.getText();
        String jurusan = textjurusan.getText();
        labelPesan.setText("Terdaftar");

        String query = "INSERT INTO mahasiswa(nama,nim,umur,jurusan) VALUES('" + nama + "','" + nim + "','" + umur + "','" + jurusan + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil di input ke dalam tabel");
        }
    }
}
