package gr;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k implements j {
    private final Object trackingKey;

    public k() {
        this(UUID.randomUUID());
    }

    @Override // gr.j
    public abstract /* synthetic */ void clear();

    @Override // gr.j
    public abstract /* synthetic */ void clearEvent(TrackEventType trackEventType);

    @Override // gr.j
    public abstract /* synthetic */ void eventFinish(TrackEventType trackEventType, AdsType adsType, a aVar, pr.a aVar2);

    @Override // gr.j
    public /* bridge */ /* synthetic */ void eventStart(TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    @Override // gr.j
    public abstract /* synthetic */ void eventStart(TrackEventType trackEventType, i iVar);

    @Override // gr.j
    public AdExtension.EventConfiguration getEventConfiguration() {
        return null;
    }

    @Override // gr.j
    public Object getTrackingKey() {
        return this.trackingKey;
    }

    @Override // gr.j
    public List<String> getTrackingUrls(TrackEventType trackEventType) {
        return null;
    }

    public k(Object obj) {
        this.trackingKey = obj;
    }
}
