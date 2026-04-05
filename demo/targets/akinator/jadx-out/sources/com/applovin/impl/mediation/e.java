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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14689a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14690b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f14691c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f14692d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f14693e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f14694f = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: g, reason: collision with root package name */
    private final Map f14695g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f14696h = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements n5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14697a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f14698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f14699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x2 f14700d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f14701e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0034a f14702f;

        public a(long j10, Map map, String str, x2 x2Var, Context context, a.InterfaceC0034a interfaceC0034a) {
            this.f14697a = j10;
            this.f14698b = map;
            this.f14699c = str;
            this.f14700d = x2Var;
            this.f14701e = context;
            this.f14702f = interfaceC0034a;
        }

        @Override // com.applovin.impl.n5.b
        public void a(JSONArray jSONArray) {
            this.f14698b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f14697a));
            this.f14698b.put("calfc", Integer.valueOf(e.this.b(this.f14699c)));
            t5 t5Var = new t5(this.f14700d, jSONArray, this.f14701e, e.this.f14689a, this.f14702f);
            if (((Boolean) e.this.f14689a.a(o3.f14944e8)).booleanValue()) {
                e.this.f14689a.r0().a((g5) t5Var, b6.b.MEDIATION);
            } else {
                e.this.f14689a.r0().a(t5Var);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements a.InterfaceC0034a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f14704a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f14705b;

        /* renamed from: c, reason: collision with root package name */
        private final e f14706c;

        /* renamed from: d, reason: collision with root package name */
        private final c f14707d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f14708e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f14709f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f14710g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f14711h;

        /* renamed from: i, reason: collision with root package name */
        private final int f14712i;

        /* renamed from: j, reason: collision with root package name */
        private long f14713j;

        /* renamed from: k, reason: collision with root package name */
        private long f14714k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, eVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f14706c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f14713j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f14704a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f14714k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && k7.c(this.f14704a) && ((Boolean) this.f14704a.a(v4.f15998o6)).booleanValue();
            if (this.f14704a.a(o3.Y7, this.f14708e) && this.f14707d.f14717c < this.f14712i && !z10) {
                c.e(this.f14707d);
                int iPow = (int) Math.pow(2.0d, this.f14707d.f14717c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new m(this, iPow, str, 1), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f14707d.f14717c = 0;
            this.f14707d.f14716b.set(false);
            if (this.f14707d.f14718d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f14707d.f14715a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                q2.a(this.f14707d.f14718d, str, maxError2);
                this.f14707d.f14718d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            v2 v2Var = (v2) maxAd;
            v2Var.i(this.f14707d.f14715a);
            v2Var.a(SystemClock.elapsedRealtime() - this.f14713j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) v2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f14704a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f14714k, v2Var.getRequestLatencyMillis());
            }
            this.f14706c.a(maxAd.getAdUnitId());
            this.f14707d.f14717c = 0;
            if (this.f14707d.f14718d == null) {
                this.f14706c.a(v2Var);
                this.f14707d.f14716b.set(false);
                int iK = v2Var.K();
                synchronized (this.f14706c.f14693e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f14706c.f14692d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iK) {
                    int i10 = sizeSafely + 1;
                    this.f14704a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14704a.O().a("MediationAdLoadManagerV2", w0.i.a(i10, iK, "Preloading waterfall ", " of "));
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            v2Var.A().c().a(this.f14707d.f14718d);
            this.f14707d.f14718d.onAdLoaded(v2Var);
            this.f14706c.f14694f.put(maxAd.getAdUnitId(), v2Var);
            if (v2Var.N().endsWith("load")) {
                this.f14707d.f14718d.onAdRevenuePaid(v2Var);
            }
            this.f14707d.f14718d = null;
            if ((!this.f14704a.c(o3.U7).contains(maxAd.getAdUnitId()) && !this.f14704a.a(o3.T7, maxAd.getFormat())) || this.f14704a.t0().c() || this.f14704a.t0().d()) {
                this.f14707d.f14716b.set(false);
                return;
            }
            int iK2 = v2Var.K();
            this.f14704a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f14704a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iK2);
            }
            a(maxAd);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f14704a = kVar;
            this.f14705b = new WeakReference(context);
            this.f14706c = eVar;
            this.f14707d = cVar;
            this.f14708e = maxAdFormat;
            this.f14710g = map2;
            this.f14709f = map;
            this.f14711h = map3;
            this.f14713j = j10;
            this.f14714k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f14712i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f14712i = Math.min(2, ((Integer) kVar.a(o3.X7)).intValue());
            } else {
                this.f14712i = ((Integer) kVar.a(o3.X7)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f14705b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f14713j = SystemClock.elapsedRealtime();
            this.f14714k = System.currentTimeMillis();
            this.f14711h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f14706c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f14709f, this.f14710g, this.f14711h, context, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f14710g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f14710g.put("retry_attempt", Integer.valueOf(this.f14707d.f14717c));
            Context contextO = (Context) this.f14705b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f14711h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f14711h.put("era", Integer.valueOf(this.f14707d.f14717c));
            this.f14714k = System.currentTimeMillis();
            this.f14706c.a(str, this.f14708e, this.f14709f, this.f14710g, this.f14711h, context, this);
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
        private final String f14715a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f14716b;

        /* renamed from: c, reason: collision with root package name */
        private int f14717c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0034a f14718d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f14717c;
            cVar.f14717c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f14716b = new AtomicBoolean();
            this.f14715a = str;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f14689a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbU = o2.u(str);
        sbU.append(str2 != null ? "-".concat(str2) : "");
        return sbU.toString();
    }

    private v2 f(String str) {
        synchronized (this.f14693e) {
            try {
                Queue queue = (Queue) this.f14692d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (v2) queue.poll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f14693e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f14692d.get(str));
        }
        return z10;
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        v2 v2Var = (v2) this.f14694f.get(str);
        if (v2Var != null) {
            arrayDeque.add(v2Var);
        }
        synchronized (this.f14691c) {
            try {
                Queue queue = (Queue) this.f14692d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f14696h) {
            try {
                this.f14689a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14689a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f14695g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f14695g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0034a interfaceC0034a) {
        v2 v2VarF = (this.f14689a.t0().d() || k7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (v2VarF != null) {
            v2VarF.i(str2);
            v2VarF.A().c().a(interfaceC0034a);
            interfaceC0034a.onAdLoaded(v2VarF);
            this.f14694f.put(str, v2VarF);
            if (v2VarF.N().endsWith("load")) {
                interfaceC0034a.onAdRevenuePaid(v2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f14716b.compareAndSet(false, true)) {
            if (cVarA.f14718d != null && cVarA.f14718d != interfaceC0034a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f14718d = interfaceC0034a;
            return;
        }
        if (v2VarF == null) {
            cVarA.f14718d = interfaceC0034a;
        }
        Map mapU = a.b.u();
        mapU.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapU.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapU, context, new b(map, map2, mapU, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f14689a, context, null));
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f14696h) {
            try {
                Integer num = (Integer) this.f14695g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void c(String str, String str2) {
        synchronized (this.f14691c) {
            this.f14690b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0034a interfaceC0034a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        x2 x2Var = new x2(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f14689a.r0().a((g5) new n5(x2Var, context, this.f14689a, new a(jElapsedRealtime, map3, str, x2Var, context, interfaceC0034a)), b6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f14689a.a(v4.C4)).booleanValue()) {
            r3 r3VarY = this.f14689a.Y();
            p3 p3Var = p3.f15028e;
            Map mapA = r3VarY.a(p3Var, q3.a(str));
            p3.a aVar = p3.a.SESSION;
            int iA = a(mapA, aVar);
            p3.a aVar2 = p3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f14689a.Y().a(p3Var, q3.a(maxAdFormat));
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
        synchronized (this.f14693e) {
            try {
                Queue arrayDeque = (Queue) this.f14692d.get(v2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f14692d.put(v2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(v2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f14691c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f14690b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f14690b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f14696h) {
            try {
                this.f14689a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14689a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f14695g.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
