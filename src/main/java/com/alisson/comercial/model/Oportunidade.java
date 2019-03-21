package com.alisson.comercial.model;

import java.math.BigDecimal;

public class Oportunidade {

		private Long id;
		private String nomeProspecto;
		private String descrição;
		private BigDecimal valor;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNomeProspecto() {
			return nomeProspecto;
		}
		public void setNomeProspecto(String nomeProspecto) {
			this.nomeProspecto = nomeProspecto;
		}
		public String getDescrição() {
			return descrição;
		}
		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}
		public BigDecimal getValor() {
			return valor;
		}
		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Oportunidade other = (Oportunidade) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		
}
