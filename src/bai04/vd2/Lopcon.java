package bai04.vd2;

public class Lopcon extends Lopcha {
	
	private String thuoctinhrieng;
	

	public Lopcon(String thuoctinh1, int thuoctinh2, double thuoctinh3, String thuoctinhrieng) {
		super(thuoctinh1, thuoctinh2, thuoctinh3);
		this.thuoctinhrieng = thuoctinhrieng;
	}


	public String getThuoctinhrieng() {
		return thuoctinhrieng;
	}


	public void setThuoctinhrieng(String thuoctinhrieng) {
		this.thuoctinhrieng = thuoctinhrieng;
	}


	@Override
	public String toString() {
		return "Lopcon [thuoctinhrieng=" + thuoctinhrieng + "]";
	}
	
	
}
