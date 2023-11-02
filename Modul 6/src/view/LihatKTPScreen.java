package view;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.KTP;


public class LihatKTPScreen {

    public LihatKTPScreen(KTP ktp) {
        JFrame frame = new JFrame("Lihat KTP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(35, 2));
        frame.add(panel);
        
        // nik
        JLabel nikLabel = new JLabel("NIK");
        JLabel nikValueLabel = new JLabel(ktp.getNik());

        // nama
        JLabel namaLabel = new JLabel("Nama");
        JLabel namaValueLabel = new JLabel(ktp.getNama());

        // tempat lahir
        JLabel tempatLahirLabel = new JLabel("Tempat Lahir");
        JLabel tempatLahirValueLabel = new JLabel(ktp.getTempatLahir());

        // tanggal lahir
        JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir");
        JLabel tanggalLahirValueLabel = new JLabel(ktp.getTanggalLahir());

        // jenis kelamin
        JLabel jenisKelaminLabel = new JLabel("Jenis Kelamin");
        JLabel jenisKelaminValueLabel = new JLabel(ktp.getJenisKelamin());

        // golongan darah
        JLabel golDarahLabel = new JLabel("Golongan Darah");
        JLabel golDarahValueLabel = new JLabel(ktp.getGolDarah());

        // alamat
        JLabel alamatLabel = new JLabel("Alamat");
        JLabel alamatValueLabel = new JLabel(ktp.getAlamat());

        // rt/rw
        JLabel rtRwLabel = new JLabel("RT/RW");
        JLabel rtRwValueLabel = new JLabel(ktp.getRtRw());

        // kel/desa
        JLabel kelDesaLabel = new JLabel("Kel/Desa");
        JLabel kelDesaValueLabel = new JLabel(ktp.getKelDesa());

        // kecamatan
        JLabel kecamatanLabel = new JLabel("Kecamatan");
        JLabel kecamatanValueLabel = new JLabel(ktp.getKecamatan());

        // agama
        JLabel agamaLabel = new JLabel("Agama");
        JLabel agamaValueLabel = new JLabel(ktp.getAgama());

        // status perkawinan
        JLabel statusPerkawinanLabel = new JLabel("Status Perkawinan");
        JLabel statusPerkawinanValueLabel = new JLabel(ktp.getStatusPerkawinan());

        // pekerjaan
        JLabel pekerjaanLabel = new JLabel("Pekerjaan");
        JLabel pekerjaanValueLabel = new JLabel(ktp.getPekerjaan());

        // kewarganegaraan
        JLabel kewarganegaraanLabel = new JLabel("Kewarganegaraan");
        JLabel kewarganegaraanValueLabel = new JLabel(ktp.getKewarganegaraan());

        // foto
        JLabel fotoLabel = new JLabel("Foto");
        ImageIcon imageIcon = new ImageIcon(
                new ImageIcon(ktp.getFoto()).getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));

        // tanda tangan
        JLabel tandaTanganLabel = new JLabel("Tanda tangan");
        ImageIcon tandaTanganIcon = new ImageIcon(
                new ImageIcon(ktp.getTandaTangan()).getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));

        // berlaku hingga
        JLabel provinsiPembuatanLabel = new JLabel("Provinsi Pembuatan");
        JLabel provinsiPembuatanValueLabel = new JLabel(ktp.getProvinsiPembuatan());

        // kota pembuatan
        JLabel kotaPembuatanLabel = new JLabel("Kota Pembuatan");
        JLabel kotaPembuatanValueLabel = new JLabel(ktp.getKotaPembuatan());

        // tanggal pembuatan
        JLabel tanggalPembuatanLabel = new JLabel("Tanggal Pembuatan");
        JLabel tanggalPembuatanValueLabel = new JLabel(ktp.getTanggalPembuatan());

        // provinsi pembuatan
        JLabel provinsiPembuatJLabel = new JLabel("Provinsi Pembuatan");
        JLabel provinsiPembuatValueJLabel = new JLabel(ktp.getProvinsiPembuatan());

        panel.add(nikLabel);
        panel.add(nikValueLabel);
        panel.add(namaLabel);
        panel.add(namaValueLabel);
        panel.add(tempatLahirLabel);
        panel.add(tempatLahirValueLabel);
        panel.add(tanggalLahirLabel);
        panel.add(tanggalLahirValueLabel);
        panel.add(jenisKelaminLabel);
        panel.add(jenisKelaminValueLabel);
        panel.add(golDarahLabel);
        panel.add(golDarahValueLabel);
        panel.add(alamatLabel);
        panel.add(alamatValueLabel);
        panel.add(rtRwLabel);
        panel.add(rtRwValueLabel);
        panel.add(kelDesaLabel);
        panel.add(kelDesaValueLabel);
        panel.add(kecamatanLabel);
        panel.add(kecamatanValueLabel);
        panel.add(agamaLabel);
        panel.add(agamaValueLabel);
        panel.add(statusPerkawinanLabel);
        panel.add(statusPerkawinanValueLabel);
        panel.add(pekerjaanLabel);
        panel.add(pekerjaanValueLabel);
        panel.add(kewarganegaraanLabel);
        panel.add(kewarganegaraanValueLabel);
        panel.add(fotoLabel);
        panel.add(new JLabel(imageIcon));
        panel.add(tandaTanganLabel);
        panel.add(new JLabel(tandaTanganIcon));
        panel.add(kotaPembuatanLabel);
        panel.add(kotaPembuatanValueLabel);
        panel.add(tanggalPembuatanLabel);
        panel.add(tanggalPembuatanValueLabel);
        panel.add(provinsiPembuatJLabel);
        panel.add(provinsiPembuatValueJLabel);

        frame.setVisible(true);
    }
}
