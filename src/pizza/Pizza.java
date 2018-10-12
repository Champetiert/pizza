package pizza;

public class Pizza {
	private String code;
	private String désignation;
	private int prix;
	
	public Pizza(String code, String désignation, int prix) {
		super();
		this.code = code;
		this.désignation = désignation;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Pizza code=" + code + "\n désignation=" + désignation + "\n prix=" + prix + "\n\n";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDésignation() {
		return désignation;
	}

	public void setDésignation(String désignation) {
		this.désignation = désignation;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	
}
