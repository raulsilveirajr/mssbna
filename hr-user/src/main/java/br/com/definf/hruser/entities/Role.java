package br.com.definf.hruser.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_role")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;

 	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	@JsonProperty("id")
	private Long id;

 	@JsonProperty("roleName")
 	private String roleName;
}
