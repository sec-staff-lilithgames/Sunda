package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface U4 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f35543a;

        public a(String providerName) {
            kotlin.jvm.internal.e0.checkNotNullParameter(providerName, "providerName");
            this.f35543a = uu.p1.mutableMapOf(tu.e0.to(IronSourceConstants.EVENTS_PROVIDER, providerName), tu.e0.to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(String key, Object value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f35543a.put(key, value);
        }

        public final Map<String, Object> a() {
            return uu.p1.toMutableMap(this.f35543a);
        }
    }

    void a(D5 d52, Be be2);

    void a(D5 d52, String str);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements U4 {

        /* renamed from: a, reason: collision with root package name */
        private final F7 f35544a;

        /* renamed from: b, reason: collision with root package name */
        private final a f35545b;

        public b(F7 eventManager, a eventBaseData) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventManager, "eventManager");
            kotlin.jvm.internal.e0.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.f35544a = eventManager;
            this.f35545b = eventBaseData;
        }

        @Override // com.ironsource.U4
        public void a(D5 eventName, String instanceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventName, "eventName");
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> mapA = this.f35545b.a();
            mapA.put("spId", instanceId);
            this.f35544a.a(new C5(eventName, new JSONObject(uu.p1.toMap(mapA))));
        }

        @Override // com.ironsource.U4
        public void a(D5 eventName, Be be2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventName, "eventName");
            Map<String, Object> mapA = this.f35545b.a();
            if (be2 != null) {
                mapA.put(IronSourceConstants.EVENTS_EXT1, be2.toString());
            }
            this.f35544a.a(new C5(eventName, new JSONObject(uu.p1.toMap(mapA))));
        }
    }
}
