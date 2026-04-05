package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.o9;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.TokenConfiguration;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n1 {
    public static final AtomicBoolean A = new AtomicBoolean(false);
    public static volatile n1 B;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f61918a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f61919b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f61920c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final gr.d f61921d;

    /* renamed from: e, reason: collision with root package name */
    public final o1 f61922e;

    /* renamed from: f, reason: collision with root package name */
    public final f4 f61923f;

    /* renamed from: g, reason: collision with root package name */
    public final PriceFloorParams f61924g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f61925h;

    /* renamed from: i, reason: collision with root package name */
    public final e2 f61926i;

    /* renamed from: j, reason: collision with root package name */
    public final a4 f61927j;

    /* renamed from: k, reason: collision with root package name */
    public final n2 f61928k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumMap f61929l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f61930m;

    /* renamed from: n, reason: collision with root package name */
    public final h0 f61931n;

    /* renamed from: o, reason: collision with root package name */
    public final c1 f61932o;

    /* renamed from: p, reason: collision with root package name */
    public Context f61933p;

    /* renamed from: q, reason: collision with root package name */
    public String f61934q;

    /* renamed from: r, reason: collision with root package name */
    public TargetingParams f61935r;

    /* renamed from: s, reason: collision with root package name */
    public Publisher f61936s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f61937t;

    /* renamed from: u, reason: collision with root package name */
    public int f61938u;

    /* renamed from: v, reason: collision with root package name */
    public int f61939v;

    /* renamed from: w, reason: collision with root package name */
    public String f61940w;

    /* renamed from: x, reason: collision with root package name */
    public long f61941x;

    /* renamed from: y, reason: collision with root package name */
    public y2 f61942y;

    /* renamed from: z, reason: collision with root package name */
    public final l1 f61943z;

    static {
        nm.a.setEnabledInstance(new k1("BidMachineLog"));
    }

    public n1() {
        gr.d dVar = new gr.d();
        this.f61921d = dVar;
        this.f61922e = new o1(dVar);
        this.f61923f = new f4();
        this.f61924g = new PriceFloorParams().addPriceFloor(UUID.randomUUID().toString(), 0.01d);
        this.f61925h = new i0(new j0());
        this.f61926i = new e2(new w1());
        this.f61927j = new a4();
        this.f61928k = new n2();
        this.f61929l = new EnumMap(TrackEventType.class);
        this.f61930m = new CopyOnWriteArrayList();
        this.f61931n = new h0();
        this.f61932o = new c1();
        this.f61935r = new TargetingParams();
        new CustomParams();
        this.f61938u = 0;
        this.f61939v = 0;
        this.f61941x = 0L;
        this.f61943z = new l1(this);
    }

    public static n1 a() {
        n1 n1Var;
        n1 n1Var2 = B;
        if (n1Var2 != null) {
            return n1Var2;
        }
        synchronized (n1.class) {
            try {
                n1Var = B;
                if (n1Var == null) {
                    n1Var = new n1();
                    B = n1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n1Var;
    }

    public final void b(String str, InitResponse initResponse, String str2) {
        UrlProvider.setAuctionUrlFromInit(initResponse.getEndpoint());
        EnumMap enumMap = this.f61929l;
        enumMap.clear();
        pr.i.prepareEvents(enumMap, initResponse.getEventList());
        this.f61921d.setDefaultEventConfiguration(initResponse.getEventConfiguration());
        SessionManager.get().setSessionResetAfter(initResponse.getSessionResetAfter());
        this.f61938u = initResponse.getAdRequestTmax();
        this.f61939v = initResponse.getAdNetworksLoadingTimeout();
        kotlin.jvm.internal.d0.f71824a = initResponse.getShowWithoutInternet();
        List<TokenConfiguration> tokenConfigurationsList = initResponse.getTokenConfigurationsList();
        ConcurrentHashMap concurrentHashMap = u1.f62027b;
        concurrentHashMap.clear();
        if (tokenConfigurationsList != null) {
            for (TokenConfiguration tokenConfiguration : tokenConfigurationsList) {
                AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(tokenConfiguration.getType());
                if (adsFormatByRemoteName != null) {
                    concurrentHashMap.put(adsFormatByRemoteName, tokenConfiguration);
                }
            }
        }
        Map<String, AdCachePlacementControl> adCachePlacementControlMap = initResponse.getAdCachePlacementControlMap();
        if (adCachePlacementControlMap != null) {
            ConcurrentHashMap concurrentHashMap2 = t.f62016d;
            concurrentHashMap2.clear();
            concurrentHashMap2.putAll(adCachePlacementControlMap);
            AdCachePlacementControl adCachePlacementControl = adCachePlacementControlMap.get(AdsType.Interstitial.getName());
            int maxCacheSize = adCachePlacementControl != null ? adCachePlacementControl.getMaxCacheSize() : 0;
            AdCachePlacementControl adCachePlacementControl2 = adCachePlacementControlMap.get(AdsType.Rewarded.getName());
            if (adCachePlacementControl2 != null) {
                maxCacheSize += adCachePlacementControl2.getMaxCacheSize();
            }
            if (maxCacheSize > 5) {
                io.bidmachine.iab.vast.t.setCacheSize(maxCacheSize);
            }
        }
        tm.d0.f87009e = pr.j.getString(initResponse.getExtras().getInternal(), "mraid_js");
        nm.j.ifNotNull(this.f61933p, new o9(this, str, initResponse, str2));
    }

    public final void c() {
        nm.a.d("Notify initialization finished");
        this.f61920c.set(true);
        this.f61919b.set(false);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f61918a;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            InitializationCallback initializationCallback = (InitializationCallback) it.next();
            if (initializationCallback != null) {
                nm.j.onUiThread(new t0(initializationCallback, 3));
            }
        }
        copyOnWriteArraySet.clear();
    }

    public final String d(Context context) {
        if (!this.f61923f.canSendBmIfv()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        if (!TextUtils.isEmpty(this.f61940w)) {
            return this.f61940w;
        }
        SharedPreferences sharedPreferencesE = jh.i.E(context);
        String strOptString = pr.m.optString(sharedPreferencesE, "bid_machine_ifv", null);
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = UUID.randomUUID().toString();
            pr.m.putString(sharedPreferencesE, "bid_machine_ifv", strOptString);
        }
        this.f61940w = strOptString;
        return strOptString;
    }

    public a4 getSessionParams() {
        return this.f61927j;
    }
}
