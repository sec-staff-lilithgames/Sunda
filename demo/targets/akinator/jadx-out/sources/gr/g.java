package gr;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g extends k {
    private final e sessionTracker;

    public g(e eVar) {
        this(UUID.randomUUID(), eVar);
    }

    @Override // gr.k, gr.j
    public void clear() {
        this.sessionTracker.clearTrackingEvents(this);
    }

    @Override // gr.k, gr.j
    public void clearEvent(TrackEventType trackEventType) {
        this.sessionTracker.clearTrackingEvent(this, trackEventType);
    }

    @Override // gr.k, gr.j
    public void eventFinish(TrackEventType trackEventType, AdsType adsType, a aVar, pr.a aVar2) {
        this.sessionTracker.trackEventFinish(this, trackEventType, adsType, aVar2, aVar);
    }

    @Override // gr.k, gr.j
    public /* bridge */ /* synthetic */ void eventStart(TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    public g(Object obj, e eVar) {
        super(obj);
        this.sessionTracker = eVar;
    }

    @Override // gr.k, gr.j
    public void eventStart(TrackEventType trackEventType, i iVar) {
        this.sessionTracker.trackEventStart(this, trackEventType, iVar);
    }
}
