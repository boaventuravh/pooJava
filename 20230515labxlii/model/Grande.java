package model;

public class Grande extends Sala {
	
	public Grande() {
		this.setQtdeLugares(500);
	}

	@Override
	public boolean vendeBilhete() {
		if(this.getQtdeLugares()>50) {
			this.setQtdeLugares(getQtdeLugares() - 1);
			return true;
		}
		return false;
	}

}
