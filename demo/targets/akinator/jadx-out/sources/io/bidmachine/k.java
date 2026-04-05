package io.bidmachine;

import io.bidmachine.protobuf.AdExtension;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends BidMachineTrackingObject {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f60571a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, String str) {
        super(str);
        this.f60571a = nVar;
    }

    @Override // io.bidmachine.BidMachineTrackingObject, gr.g, gr.k, gr.j
    public /* bridge */ /* synthetic */ void eventStart(TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    @Override // gr.k, gr.j
    public AdExtension.EventConfiguration getEventConfiguration() {
        return this.f60571a.getEventConfiguration();
    }

    @Override // gr.k, gr.j
    public List<String> getTrackingUrls(TrackEventType trackEventType) {
        return this.f60571a.getTrackUrls(trackEventType);
    }
}
