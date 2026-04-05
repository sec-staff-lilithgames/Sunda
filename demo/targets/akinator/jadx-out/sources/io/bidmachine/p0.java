package io.bidmachine;

import io.bidmachine.protobuf.AdExtension;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 extends BidMachineTrackingObject {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BidMachineAd f61971a;

    public p0(BidMachineAd bidMachineAd) {
        this.f61971a = bidMachineAd;
    }

    @Override // io.bidmachine.BidMachineTrackingObject, gr.g, gr.k, gr.j
    public /* bridge */ /* synthetic */ void eventStart(TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    @Override // gr.k, gr.j
    public AdExtension.EventConfiguration getEventConfiguration() {
        n adResponse = this.f61971a.getAdResponse();
        return adResponse != null ? adResponse.getEventConfiguration() : super.getEventConfiguration();
    }

    @Override // gr.k, gr.j
    public List<String> getTrackingUrls(TrackEventType trackEventType) {
        n adResponse = this.f61971a.getAdResponse();
        if (adResponse != null) {
            return adResponse.getTrackUrls(trackEventType);
        }
        return null;
    }
}
