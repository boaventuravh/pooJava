package model;

public class Media extends Sala {
	
	public Media() {
		this.setQtdeLugares(300);
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
