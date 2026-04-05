package gr;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f58405a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f58406b = new ConcurrentHashMap();

    public f(b bVar) {
        this.f58405a = bVar;
    }

    @Override // gr.e
    public void clearTrackingEvent(j jVar, TrackEventType trackEventType) {
        Map map = (Map) this.f58406b.get(jVar.getTrackingKey());
        if (map != null) {
            map.remove(trackEventType);
        }
    }

    @Override // gr.e
    public void clearTrackingEvents(j jVar) {
        this.f58406b.remove(jVar.getTrackingKey());
    }

    @Override // gr.e, gr.b
    public void trackEvent(j jVar, TrackEventType trackEventType, i iVar, AdsType adsType, pr.a aVar, a aVar2) {
        this.f58405a.trackEvent(jVar, trackEventType, iVar, adsType, aVar, aVar2);
    }

    @Override // gr.e
    public void trackEventFinish(j jVar, TrackEventType trackEventType, AdsType adsType, pr.a aVar, a aVar2) {
        i iVar;
        Map map = (Map) this.f58406b.get(jVar.getTrackingKey());
        if (map == null || !map.containsKey(trackEventType)) {
            iVar = null;
        } else {
            iVar = (i) map.get(trackEventType);
            if (iVar != null) {
                iVar.setFinishTimeMs(System.currentTimeMillis());
            }
            map.remove(trackEventType);
            if (map.isEmpty()) {
                clearTrackingEvents(jVar);
            }
        }
        trackEvent(jVar, trackEventType, iVar, adsType, aVar, aVar2);
    }

    @Override // gr.e
    public void trackEventStart(j jVar, TrackEventType trackEventType, i iVar) {
        Object trackingKey = jVar.getTrackingKey();
        ConcurrentHashMap concurrentHashMap = this.f58406b;
        Map enumMap = (Map) concurrentHashMap.get(trackingKey);
        if (enumMap == null) {
            enumMap = new EnumMap(TrackEventType.class);
            concurrentHashMap.put(trackingKey, enumMap);
        }
        if (enumMap.containsKey(trackEventType)) {
            return;
        }
        if (iVar == null) {
            iVar = new i();
        }
        enumMap.put(trackEventType, iVar);
    }
}
