package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.h0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveAdSpotManager {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f23490a = new ConcurrentHashMap();

    public static void destroy() {
        ConcurrentHashMap concurrentHashMap = get().f23490a;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) concurrentHashMap.get((String) it.next());
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        concurrentHashMap.clear();
    }

    public static InneractiveAdSpotManager get() {
        return e.f23516a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f23490a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        h0 h0Var = new h0();
        this.f23490a.put(h0Var.f23646a, h0Var);
        return h0Var;
    }

    public InneractiveAdSpot getSpot(String str) {
        return (InneractiveAdSpot) this.f23490a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        ConcurrentHashMap concurrentHashMap = this.f23490a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
