package gr;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface e extends b {
    void clearTrackingEvent(j jVar, TrackEventType trackEventType);

    void clearTrackingEvents(j jVar);

    @Override // gr.b
    /* synthetic */ void trackEvent(j jVar, TrackEventType trackEventType, i iVar, AdsType adsType, pr.a aVar, a aVar2);

    void trackEventFinish(j jVar, TrackEventType trackEventType, AdsType adsType, pr.a aVar, a aVar2);

    void trackEventStart(j jVar, TrackEventType trackEventType, i iVar);
}
