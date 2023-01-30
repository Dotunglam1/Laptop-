/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_Laptop;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Laptop implements Serializable{
    public String dongMay;
    public String series;
    public String CPU;
    public String RAM;
    public String oCung;
    public String manHinh;
    public String doPhanGiai;
    public String cardDoHoa;
    public String Gia;
    public String trongLuong;

    public Laptop(String dongMay, String series, String CPU, String RAM, String oCung, String manHinh, String doPhanGiai, String cardDoHoa, String trongLuong, String gia) {
        this.dongMay = dongMay;
        this.series = series;
        this.CPU = CPU;
        this.RAM = RAM;
        this.oCung = oCung;
        this.manHinh = manHinh;
        this.doPhanGiai = doPhanGiai;
        this.cardDoHoa = cardDoHoa;
        this.trongLuong=trongLuong;
        this.Gia = gia;
    }

    public String getDongMay() {
        return dongMay;
    }

    public void setDongMay(String dongMay) {
        this.dongMay = dongMay;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getoCung() {
        return oCung;
    }

    public void setoCung(String oCung) {
        this.oCung = oCung;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }

    public String getCardDoHoa() {
        return cardDoHoa;
    }

    public void setCardDoHoa(String cardDoHoa) {
        this.cardDoHoa = cardDoHoa;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(String trongLuong) {
        this.trongLuong = trongLuong;
    }
    
    
    
}
