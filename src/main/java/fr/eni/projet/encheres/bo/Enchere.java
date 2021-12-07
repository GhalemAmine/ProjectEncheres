package fr.eni.projet.encheres.bo;

import java.sql.Date;

/**
 * @author Alexandre Mchich
 *
 */

public class Enchere {
	

	private int idEnchere;
	private Date dateEnchere;
	private int montantEnchere;
	
	public Enchere(int idEnchere, Date dateEnchere, int montantEnchere) {
		super();
		this.idEnchere = idEnchere;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}
	public int getIdEnchere() {
		return idEnchere;
	}
	public void setIdEnchere(int idEnchere) {
		this.idEnchere = idEnchere;
	}
	public Date getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public int getMontantEnchere() {
		return montantEnchere;
	}
	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	
}