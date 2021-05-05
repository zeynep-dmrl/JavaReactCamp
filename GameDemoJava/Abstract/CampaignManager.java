package Abstract;

import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("kampanya eklendi: " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� silindi.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " detaylar� g�ncellendi.");
		
	}

}
