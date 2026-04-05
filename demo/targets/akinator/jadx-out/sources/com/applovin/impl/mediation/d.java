package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import com.applovin.impl.k7;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n5;
import com.applovin.impl.o3;
import com.applovin.impl.p3;
import com.applovin.impl.q2;
import com.applovin.impl.q3;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t5;
import com.applovin.impl.v2;
import com.applovin.impl.v4;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14622a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14623b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f14624c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f14625d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f14626e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f14627f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Object f14628g = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements n5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f14630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f14631c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x2 f14632d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f14633e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0034a f14634f;

        public a(long j10, Map map, String str, x2 x2Var, Context context, a.InterfaceC0034a interfaceC0034a) {
            this.f14629a = j10;
            this.f14630b = map;
            this.f14631c = str;
            this.f14632d = x2Var;
            this.f14633e = context;
            this.f14634f = interfaceC0034a;
        }

        @Override // com.applovin.impl.n5.b
        public void a(JSONArray jSONArray) {
            this.f14630b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f14629a));
            this.f14630b.put("calfc", Integer.valueOf(d.this.b(this.f14631c)));
            t5 t5Var = new t5(this.f14632d, jSONArray, this.f14633e, d.this.f14622a, this.f14634f);
            if (((Boolean) d.this.f14622a.a(o3.f14944e8)).booleanValue()) {
                d.this.f14622a.r0().a((g5) t5Var, b6.b.MEDIATION);
            } else {
                d.this.f14622a.r0().a(t5Var);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements a.InterfaceC0034a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f14636a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f14637b;

        /* renamed from: c, reason: collision with root package name */
        private final d f14638c;

        /* renamed from: d, reason: collision with root package name */
        private final c f14639d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f14640e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f14641f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f14642g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f14643h;

        /* renamed from: i, reason: collision with root package name */
        private final int f14644i;

        /* renamed from: j, reason: collision with root package name */
        private long f14645j;

        /* renamed from: k, reason: collision with root package name */
        private long f14646k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, dVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f14638c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f14645j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f14636a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f14646k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && k7.c(this.f14636a) && ((Boolean) this.f14636a.a(v4.f15998o6)).booleanValue();
            if (this.f14636a.a(o3.Y7, this.f14640e) && this.f14639d.f14649c < this.f14644i && !z10) {
                c.e(this.f14639d);
                int iPow = (int) Math.pow(2.0d, this.f14639d.f14649c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new m(this, iPow, str, 0), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f14639d.f14649c = 0;
            this.f14639d.f14648b.set(false);
            if (this.f14639d.f14650d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f14639d.f14647a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                q2.a(this.f14639d.f14650d, str, maxError2);
                this.f14639d.f14650d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            v2 v2Var = (v2) maxAd;
            v2Var.i(this.f14639d.f14647a);
            v2Var.a(SystemClock.elapsedRealtime() - this.f14645j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) v2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f14636a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f14646k, v2Var.getRequestLatencyMillis());
            }
            this.f14638c.a(maxAd.getAdUnitId());
            this.f14639d.f14649c = 0;
            if (this.f14639d.f14650d == null) {
                this.f14638c.a(v2Var);
                this.f14639d.f14648b.set(false);
                return;
            }
            v2Var.A().c().a(this.f14639d.f14650d);
            this.f14639d.f14650d.onAdLoaded(v2Var);
            if (v2Var.N().endsWith("load")) {
                this.f14639d.f14650d.onAdRevenuePaid(v2Var);
            }
            this.f14639d.f14650d = null;
            if ((!this.f14636a.c(o3.U7).contains(maxAd.getAdUnitId()) && !this.f14636a.a(o3.T7, maxAd.getFormat())) || this.f14636a.t0().c() || this.f14636a.t0().d()) {
                this.f14639d.f14648b.set(false);
                return;
            }
            Context contextO = (Context) this.f14637b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f14645j = SystemClock.elapsedRealtime();
            this.f14646k = System.currentTimeMillis();
            this.f14643h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f14638c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f14641f, this.f14642g, this.f14643h, context, this);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f14636a = kVar;
            this.f14637b = new WeakReference(context);
            this.f14638c = dVar;
            this.f14639d = cVar;
            this.f14640e = maxAdFormat;
            this.f14642g = map2;
            this.f14641f = map;
            this.f14643h = map3;
            this.f14645j = j10;
            this.f14646k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f14644i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f14644i = Math.min(2, ((Integer) kVar.a(o3.X7)).intValue());
            } else {
                this.f14644i = ((Integer) kVar.a(o3.X7)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f14642g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f14642g.put("retry_attempt", Integer.valueOf(this.f14639d.f14649c));
            Context contextO = (Context) this.f14637b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f14643h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f14643h.put("era", Integer.valueOf(this.f14639d.f14649c));
            this.f14646k = System.currentTimeMillis();
            this.f14638c.a(str, this.f14640e, this.f14641f, this.f14642g, this.f14643h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f14647a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f14648b;

        /* renamed from: c, reason: collision with root package name */
        private int f14649c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0034a f14650d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f14649c;
            cVar.f14649c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f14648b = new AtomicBoolean();
            this.f14647a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f14622a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbU = o2.u(str);
        sbU.append(str2 != null ? "-".concat(str2) : "");
        return sbU.toString();
    }

    private v2 e(String str) {
        v2 v2Var;
        synchronized (this.f14626e) {
            v2Var = (v2) this.f14625d.get(str);
            this.f14625d.remove(str);
        }
        return v2Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f14624c) {
            this.f14623b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f14626e) {
            z10 = this.f14625d.get(str) != null;
        }
        return z10;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0034a interfaceC0034a) {
        v2 v2VarE = (this.f14622a.t0().d() || k7.h(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (v2VarE != null) {
            v2VarE.i(str2);
            v2VarE.A().c().a(interfaceC0034a);
            interfaceC0034a.onAdLoaded(v2VarE);
            if (v2VarE.N().endsWith("load")) {
                interfaceC0034a.onAdRevenuePaid(v2VarE);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f14648b.compareAndSet(false, true)) {
            if (cVarA.f14650d != null && cVarA.f14650d != interfaceC0034a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f14650d = interfaceC0034a;
            return;
        }
        if (v2VarE == null) {
            cVarA.f14650d = interfaceC0034a;
        }
        Map mapU = a.b.u();
        mapU.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapU.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapU, context, new b(map, map2, mapU, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f14622a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f14628g) {
            try {
                this.f14622a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14622a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f14627f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f14627f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f14628g) {
            try {
                Integer num = (Integer) this.f14627f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0034a interfaceC0034a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        x2 x2Var = new x2(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f14622a.r0().a((g5) new n5(x2Var, context, this.f14622a, new a(jElapsedRealtime, map3, str, x2Var, context, interfaceC0034a)), b6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f14622a.a(v4.C4)).booleanValue()) {
            r3 r3VarY = this.f14622a.Y();
            p3 p3Var = p3.f15028e;
            Map mapA = r3VarY.a(p3Var, q3.a(str));
            p3.a aVar = p3.a.SESSION;
            int iA = a(mapA, aVar);
            p3.a aVar2 = p3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f14622a.Y().a(p3Var, q3.a(maxAdFormat));
            return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, p3.a aVar) {
        Long l9;
        if (map == null || (l9 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l9.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v2 v2Var) {
        synchronized (this.f14626e) {
            try {
                if (this.f14625d.containsKey(v2Var.getAdUnitId())) {
                    com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + v2Var.getAdUnitId());
                }
                this.f14625d.put(v2Var.getAdUnitId(), v2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f14624c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f14623b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f14623b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f14628g) {
            try {
                this.f14622a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14622a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f14627f.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
