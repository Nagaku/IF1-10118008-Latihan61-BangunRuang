/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan61.bangunruang;

/**
 *
 * @author ASUS
 */
public class Bola implements BangunRuang {

	private int jari;	
	private final double phi = 3.14;

	public int getJari() {
		return jari;
	}

	public void setJari(int jari) {
		this.jari = jari;
	}
	
	@Override
	public double hitungVolume() {
		return ((double)(4*this.phi*this.jari*this.jari*this.jari))/3;
	}
	
}
