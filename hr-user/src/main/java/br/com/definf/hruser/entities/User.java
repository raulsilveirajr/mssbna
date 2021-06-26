package br.com.definf.hruser.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name="tb_user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

 	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

 	private String name;
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER) // Carrega os dados automaticamente já junto com o usuário
	@JoinTable(
		name="tb_user_role", 
		joinColumns = @JoinColumn(name="user_id"),
		inverseJoinColumns = @JoinColumn(name="role_id")
	)
	private Set<Role> roles = new HashSet<>();

	public User(Long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
}
