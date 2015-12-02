package TeamDJG;

public class Flaechen {
	private int a;
	private int h;
	private int b;
	private int c;
	private char posH;
	private int r;
	private int form;
	
	public Flaechen(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		form = 4;
	}

	public Flaechen(int a, int h, int b, int c, char posH) {
		super();
		this.a = a;
		this.h = h;
		this.b = b;
		this.c = c;
		this.posH = posH;
		form = 3;
	}

	
	public Flaechen(int r) {
		super();
		this.r = r;
		form = 0;
	}
	
	
	public void flaechenInhalt(){
	}

	
}
