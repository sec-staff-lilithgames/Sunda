package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.aa;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import com.applovin.impl.h1;
import com.applovin.impl.k7;
import com.applovin.impl.p6;
import com.applovin.impl.r1;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3191e4;
import com.ironsource.Q6;
import j1.o2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", C3191e4.h.f36480e0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final k f15288a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f15289b = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f15288a = kVar;
    }

    private void c(String str, Map map, Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        this.f15288a.r0().a((g5) new p6(this.f15288a, false, a.b.k("track_event:", str), new al.a(13, str, (Object) this, (Object) map, (Object) map2)), b6.b.OTHER);
    }

    private String d() {
        return o2.o(new StringBuilder(), (String) this.f15288a.a(v4.f16024s0), "4.0/pix");
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f15289b.compareAndSet(false, true)) {
            this.f15288a.G().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent("checkout", map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f15288a.O();
        if (o.a()) {
            this.f15288a.O().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        r1 r1Var = new r1(str, new HashMap());
        boolean zContains = this.f15288a.c(v4.f16080z0).contains(r1Var.c());
        Map mapA = a(r1Var, true, zContains);
        HashMap map = new HashMap(r1Var.d());
        if (((Boolean) this.f15288a.a(v4.f16037t5)).booleanValue() || ((Boolean) this.f15288a.a(v4.f15997o5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f15288a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(r1Var, zContains)).c(((Boolean) this.f15288a.a(v4.D5)).booleanValue()).a(((Boolean) this.f15288a.a(v4.f15883a5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th2) {
            o.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th2);
            this.f15288a.E().a("AppLovinEventService", "trackIAP", th2);
        }
        trackEvent("iap", map2);
    }

    private void a(String str, Map map) {
        boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f15288a.r0().a((g5) new p6(this.f15288a, zContains, "submitTrackEventPostback", new aa(this, str, map, zContains, 6)), b6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f15288a.a(v4.f15883a5)).booleanValue()).a(s4.a.a(((Integer) this.f15288a.a(v4.f15973l5)).intValue())).d(false);
        if (this.f15288a.t0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f15288a.f0().e(bVarD.a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f15288a.c(v4.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z10) {
        r1 r1Var = new r1(str, map);
        boolean zContains = this.f15288a.c(v4.f16080z0).contains(r1Var.c());
        Map mapA = a(r1Var, false, zContains);
        HashMap map2 = new HashMap(r1Var.d());
        if (((Boolean) this.f15288a.a(v4.f16037t5)).booleanValue() || ((Boolean) this.f15288a.a(v4.f15997o5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f15288a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(r1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f15288a.a(v4.D5)).booleanValue()).a(((Boolean) this.f15288a.a(v4.f15883a5)).booleanValue()).d(z10).a(s4.a.a(((Integer) this.f15288a.a(v4.f15965k5)).intValue())).a());
    }

    private String b() {
        return o2.o(new StringBuilder(), (String) this.f15288a.a(v4.f16040u0), "v1/app");
    }

    private String c() {
        return o2.o(new StringBuilder(), (String) this.f15288a.a(v4.f16032t0), "4.0/pix");
    }

    private void a(String str) {
        o.h("AppLovinEventService", str);
        if (k7.c(this.f15288a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(r1 r1Var, boolean z10, boolean z11) {
        Map mapA = this.f15288a.B().a((Map) null, z10, false);
        mapA.put("event_id", r1Var.b());
        mapA.put("ts", Long.toString(r1Var.a()));
        if (z11) {
            mapA.put(NotificationCompat.CATEGORY_EVENT, r1Var.c());
        } else {
            mapA.put(NotificationCompat.CATEGORY_EVENT, "postinstall");
            mapA.put("sub_event", r1Var.c());
        }
        return k7.a(mapA);
    }

    private Map a(r1 r1Var, boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put("AppLovin-Event", r1Var.c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", r1Var.c());
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        r1 r1Var = new r1(str, map);
        map3.put("id", r1Var.b());
        map3.put("name", r1Var.c());
        map3.put("data", r1Var.d());
        map3.put("timestamp", h1.a(r1Var.a()));
        Map mapE = this.f15288a.B().E();
        map3.put("app_info", mapE);
        map3.put("device_info", this.f15288a.B().o());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f15288a.r());
        CollectionUtils.putStringIfValid("eventId", this.f15288a.F(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15288a.j0());
        map4.put(Q6.H, this.f15288a.B().y());
        if (((Boolean) this.f15288a.a(v4.G3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f15288a.s(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapE.get("ia_v2"));
        map5.put("lastVisitTs", mapE.get("last_launch_ms"));
        map5.put("visitCount", mapE.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapE.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    private String a() {
        return o2.o(new StringBuilder(), (String) this.f15288a.a(v4.f16048v0), "v1/app");
    }
}
