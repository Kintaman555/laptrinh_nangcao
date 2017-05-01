/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

/**
 *
 * @author TIE - BREAK
 */
public class Benhnhan {
    private String mabenhnhan;
    private String tenbenhnhan;
    private String tuoi;
    private String gioitinh;
    private String nghenghiep;
    private String diachi;
    private String sdt;
    private String ghichu;
    public Benhnhan(String mabenhnhan, String tenbenhnhan, String tuoi, String gioitinh, String nghenghiep, String diachi, String sdt, String ghichu)
    {
        this.mabenhnhan = mabenhnhan;
        this.tenbenhnhan = tenbenhnhan;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.nghenghiep = nghenghiep;
        this.diachi = diachi;
        this.sdt = sdt;
        this.ghichu = ghichu;
    }
    public String getmabenhnhan()
    {
        return mabenhnhan;
    }
        public String gettenbenhnhan()
    {
        return tenbenhnhan;
    }
    public String gettuoi()
    {
        return tuoi;
    }
    public String getgioitinh()
    {
        return gioitinh;
    }
    public String getnghenghiep()
    {
        return nghenghiep;
    }
    public String getdiachi()
    {
        return diachi;
    }
    public String getsdt()
    {
        return sdt;
    }
    public String getghichu()
    {
        return ghichu;
    }

}
