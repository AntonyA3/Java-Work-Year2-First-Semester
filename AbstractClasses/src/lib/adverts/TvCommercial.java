package lib.adverts;

public class TvCommercial extends Advert{
	private int noOfSec;
	private int ratePerSec;
	private boolean peakTime;
	
	public TvCommercial() {
		super();
		noOfSec = 0;
		ratePerSec = 0;
		peakTime = false;
	}
	
	public TvCommercial(int fee, int noOfSec, int ratePerSec, boolean peakTime) {
		super(fee);
		this.noOfSec = noOfSec;
		this.ratePerSec = ratePerSec;
		this.peakTime = peakTime;
	}

	@Override
	public int cost() {
		int cost = getFee() + noOfSec * ratePerSec;
		if (peakTime) {
			return cost * 2;
		}
		
		return cost;
	}

}
