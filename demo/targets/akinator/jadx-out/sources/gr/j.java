package gr;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface j {
    void clear();

    void clearEvent(TrackEventType trackEventType);

    void eventFinish(TrackEventType trackEventType, AdsType adsType, a aVar, pr.a aVar2);

    default void eventStart(TrackEventType trackEventType) {
        eventStart(trackEventType, null);
    }

    void eventStart(TrackEventType trackEventType, i iVar);

    AdExtension.EventConfiguration getEventConfiguration();

    Object getTrackingKey();

    List<String> getTrackingUrls(TrackEventType trackEventType);
}
