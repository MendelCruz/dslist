package com.mctech.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
//Digita @Entity e depois pressionar CTRL+ALT+O para importar a linha 6

@Entity 
//vai fazer que a classe Game seja uma tabela no BD relacional

@Table(name = "tb_game")  //para colocar um nome da tabela no BD. (CTR+SPACE)
//CTRL+ALT+O para importar a linha 7

public class Game {
		
		@Id //para colocar o Id como PK. Importar com CTRL+ALT+O) linha 9
		@GeneratedValue (strategy = GenerationType.IDENTITY) // vai definir que o Id sera incremental (import linha 9 e 10) 
		private Long id;
		private String title;
		@Column(name = "game_year") //para renomear a coluna Year no BD. Import linha 5
		private Integer year;
		private String genre;
		private String platforms;
		private Double score;
		private String imgUrl;
		
		@Column(columnDefinition = "TEXT") //alterar a coluna para aceitar textos > 255 caracteres
		private String shortDescription;
		
		@Column(columnDefinition = "TEXT")
		private String longDescription;
		
		public Game() {
		}

		public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
				String shortDescription, String longDescription) {
			this.id = id;
			this.title = title;
			this.year = year;
			this.genre = genre;
			this.platforms = platforms;
			this.score = score;
			this.imgUrl = imgUrl;
			this.shortDescription = shortDescription;
			this.longDescription = longDescription;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getPlatforms() {
			return platforms;
		}

		public void setPlatforms(String platforms) {
			this.platforms = platforms;
		}

		public Double getScore() {
			return score;
		}

		public void setScore(Double score) {
			this.score = score;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getLongDescription() {
			return longDescription;
		}

		public void setLongDescription(String longDescription) {
			this.longDescription = longDescription;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Game other = (Game) obj;
			return Objects.equals(id, other.id);
		}
		
		
		
}
