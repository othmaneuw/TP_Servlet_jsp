package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Produit implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ref;
	@Column(length = 20)
	private String des;
	private double prix;
	private int qte;
}
