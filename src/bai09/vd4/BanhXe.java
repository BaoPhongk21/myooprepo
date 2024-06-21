package bai09.vd4;

public class BanhXe implements Cloneable {
	
private double bankinh;

public BanhXe(double bankinh) {
	super();
	this.bankinh = bankinh;
}

public double getBankinh() {
	return bankinh;
}

public void setBankinh(double bankinh) {
	this.bankinh = bankinh;
}

@Override
public String toString() {
	return "BanhXe [bankinh=" + bankinh + "]";
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}
