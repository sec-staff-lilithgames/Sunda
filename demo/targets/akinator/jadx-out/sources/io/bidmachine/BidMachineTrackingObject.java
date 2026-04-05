package io.bidmachine;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class BidMachineTrackingObject extends gr.g {
    public BidMachineTrackingObject() {
        super(n1.a().f61922e);
    }

    public void eventFinish(TrackEventType trackEventType, AdsType adsType, n nVar, pr.a aVar) {
        eventFinish(trackEventType, adsType, nVar, aVar, null);
    }

    @Override // gr.g, gr.k, gr.j
    public /* bridge */ /* synthetic */ void eventStart(TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    public void eventFinish(TrackEventType trackEventType, AdsType adsType, n nVar, pr.a aVar, Map<String, Object> map) {
        gr.a price;
        if (nVar != null) {
            price = new gr.a().setNetworkName(((k0) nVar.getAuctionResult()).getNetworkKey()).setPrice(Double.valueOf(nVar.getPrice()));
            if (map != null) {
                price.addCustomParams(map);
            }
            up.a adObject = nVar.getAdObject();
            if (adObject != null) {
                price.addCustomParams(adObject.getCustomParams());
            }
        } else {
            price = null;
        }
        eventFinish(trackEventType, adsType, price, aVar);
    }

    public BidMachineTrackingObject(Object obj) {
        super(obj, n1.a().f61922e);
    }
}
