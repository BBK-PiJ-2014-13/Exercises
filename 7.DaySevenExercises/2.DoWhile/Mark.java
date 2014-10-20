public class Mark {

	private int value;
	public Mark nextMark;

	public Mark(int i) {
		value = i;
		nextMark = null;
	}

	public void addMark(Mark m) {
		if (this.nextMark == null) {
			this.nextMark = m;
		} else {
			this.nextMark.addMark(m);
		}
	}
	
	public int countMarks() {
		if (this.nextMark == null) {
			return 1;
		} else {
			return 1 + this.nextMark.countMarks();
		}
	}

}
