package com.routemenu.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_detail")
public class DAOUser{
	    @Id
	    @GeneratedValue(generator = "user_generator")
	    @SequenceGenerator(
	            name = "user_generator",
	            sequenceName = "user_sequence",
	            initialValue = 1000
	    )
	    private Long id;

	    @NotBlank
	    @Size(min = 3, max = 100)
	    private String username;

	    @Column(columnDefinition = "text")
	    private String password;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}