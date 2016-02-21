class Wall {

	private Boolean active = false;

	public boolean isActive() {
		return this.active;
	}

	public boolean isInactive(){
		return !(this.active);
	}

	public void setActive(){
		this.active = true;
	}
}
