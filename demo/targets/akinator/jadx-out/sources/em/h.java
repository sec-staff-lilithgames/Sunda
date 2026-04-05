package em;

import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface h extends gr.b {
    @Override // gr.b
    /* synthetic */ void trackEvent(gr.j jVar, TrackEventType trackEventType, gr.i iVar, AdsType adsType, pr.a aVar, gr.a aVar2);

    void trackEvent(TrackEventType trackEventType, AdsFormat adsFormat, gr.a aVar, pr.a aVar2);
}
