package model;

public class Pequena extends Sala {
	
	public Pequena () {
		this.setQtdeLugares(100);
	}

	@Override
	public boolean vendeBilhete() {
		if(this.getQtdeLugares()>0) {
			this.setQtdeLugares(getQtdeLugares() - 1);
			return true;
		}
		return false;
	}

}
