
public class Cliente {

	private String nome;
	private Long cpf;
	private String cpfFormatado;
	
	
	public String getCpfFormatado() {
		return cpfFormatado;
	}

	public Cliente(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.cpfFormatado = formatarCPF();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public String formatarCPF() {
		if (cpf != null) {
			String sCpf =  cpf.toString();
		    return sCpf.substring(0, 3) + "." + sCpf.substring(3, 6) + "." + sCpf.substring(6, 9) + "-" + sCpf.substring(9, 11);		
		}
		return null;
       
	}

}
