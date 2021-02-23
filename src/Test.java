import java.text.DecimalFormat;

public class Test {
	private int tentativi = 0;
	private int vincite = 0;
	private double percVincite = 0;
	
	public int generaRisultato() {		
		return (int) (Math.random() * 5.0);		
	}

	public int getTentativi() {
		return tentativi;
	}

	public void setTentativi(int tentativi) {
		this.tentativi = tentativi;
	}
	
	public void incrementaTentativi() {
		this.tentativi++;
	}

	public int getVincite() {
		return vincite;
	}

	public void setVincite(int vincite) {
		this.vincite = vincite;
	}	

	public void incrementaVincite() {
		this.vincite++;
	}
	
	public void setPercVincite() {			
		double perc = (double)vincite / (double)tentativi * 100;
		this.percVincite = perc;
	}
	
	public double getPercVincite() {
		return percVincite;
	}
	
	public String getPercVinciteFormat() {
		double temp = percVincite;
		DecimalFormat df = new DecimalFormat("###.##");
		String string = String.valueOf(df.format(temp));
		return string;
	}	
}
