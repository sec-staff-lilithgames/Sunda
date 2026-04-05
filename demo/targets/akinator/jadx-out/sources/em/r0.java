package em;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class r0 {

    /* renamed from: w, reason: collision with root package name */
    public static final nr.c f54730w = new nr.c();

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f54731a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f54732b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f54733c;

    /* renamed from: d, reason: collision with root package name */
    public final AdsFormat f54734d;

    /* renamed from: e, reason: collision with root package name */
    public final fm.b f54735e;

    /* renamed from: f, reason: collision with root package name */
    public final n f54736f;

    /* renamed from: g, reason: collision with root package name */
    public final d f54737g;

    /* renamed from: h, reason: collision with root package name */
    public final h f54738h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f54739i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedList f54740j = new LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f54741k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f54742l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f54743m = new AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f54744n = new AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    public String f54745o;

    /* renamed from: p, reason: collision with root package name */
    public String f54746p;

    /* renamed from: q, reason: collision with root package name */
    public int f54747q;

    /* renamed from: r, reason: collision with root package name */
    public int f54748r;

    /* renamed from: s, reason: collision with root package name */
    public int f54749s;

    /* renamed from: t, reason: collision with root package name */
    public long f54750t;

    /* renamed from: u, reason: collision with root package name */
    public StringValue f54751u;

    /* renamed from: v, reason: collision with root package name */
    public w0 f54752v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements v0 {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f54753a = new AtomicBoolean(false);

        public a() {
        }

        @Override // em.v0
        public void onAdLoaded() {
            this.f54753a.set(true);
            r0.this.f54744n.set(0);
        }

        @Override // em.v0
        public void onWaterfallLoadCompleted(Queue<Waterfall.Result.AdUnit> queue) {
            ArrayList arrayList;
            r0.this.f54742l.set(false);
            if (!this.f54753a.get()) {
                r0.this.f54744n.incrementAndGet();
            }
            r0 r0Var = r0.this;
            nm.a.d(r0Var.f54731a, new p0(r0Var, 1));
            if (TextUtils.isEmpty(r0Var.f54746p) || !nm.j.isHttpUrl(r0Var.f54746p)) {
                r0Var.b("Request next waterfall failed (refreshUrl is null or empty or incorrect)");
                return;
            }
            Waterfall.Result.Builder builderAddAllAdUnitResults = Waterfall.Result.newBuilder().setFormat(StringValue.newBuilder().setValue(r0Var.f54734d.getRemoteName()).build()).addAllAdUnitResults(queue);
            String str = r0Var.f54745o;
            if (str != null) {
                builderAddAllAdUnitResults.setWaterfallId(str);
            }
            d dVar = r0Var.f54737g;
            AdsFormat adsFormat = r0Var.f54734d;
            synchronized (dVar.f54699c) {
                try {
                    if (dVar.f54698b.isEmpty()) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = dVar.f54698b.iterator();
                        while (it.hasNext()) {
                            u uVar = (u) it.next();
                            if (uVar.getAdsFormat() == adsFormat) {
                                Waterfall.Configuration.AdUnit adUnit = uVar.getAdUnit();
                                Waterfall.Result.CachedAdUnit.Builder frozen = Waterfall.Result.CachedAdUnit.newBuilder().setPrice(adUnit.getPrice()).setFrozen(dVar.e(uVar));
                                if (adUnit.getAdUnitId() != null) {
                                    frozen.setAdUnitId(adUnit.getAdUnitId());
                                }
                                StringValue serverParams = adUnit.getServerParams();
                                if (serverParams != null) {
                                    frozen.setServerParams(serverParams);
                                }
                                x internalAdLoadData = uVar.getInternalAdLoadData();
                                if (internalAdLoadData != null) {
                                    Waterfall.Result.EstimatedPrice price = internalAdLoadData.getPrice();
                                    if (price != null) {
                                        frozen.setEstimatedPrice(price);
                                    }
                                    String adResponse = internalAdLoadData.getAdResponse();
                                    if (!TextUtils.isEmpty(adResponse)) {
                                        frozen.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
                                    }
                                }
                                arrayList2.add(frozen.build());
                            }
                        }
                        arrayList = arrayList2;
                    }
                } finally {
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                builderAddAllAdUnitResults.addAllCachedAdUnits(arrayList);
            }
            Struct ext = r0Var.f54733c.getExt(r0Var.f54732b);
            if (ext != null) {
                builderAddAllAdUnitResults.setExt(ext);
            }
            StringValue stringValue = r0Var.f54751u;
            if (stringValue != null) {
                builderAddAllAdUnitResults.setServerParams(stringValue);
            }
            q0 q0Var = new q0(r0Var);
            z0 z0Var = new z0(r0Var.f54746p, builderAddAllAdUnitResults.build(), (int) r0Var.f54750t);
            z0Var.setCallback(q0Var);
            z0Var.setCancelCallback(q0Var);
            z0Var.request(r0.f54730w);
        }
    }

    public r0(Context context, j0 j0Var, AdsFormat adsFormat, Waterfall.Configuration configuration, fm.b bVar, n nVar, d dVar, h hVar, l0 l0Var) {
        this.f54731a = new pr.n(j0Var.getNetworkName() + "WaterfallController");
        this.f54732b = context.getApplicationContext();
        this.f54733c = j0Var;
        this.f54734d = adsFormat;
        this.f54735e = bVar;
        this.f54736f = nVar;
        this.f54737g = dVar;
        this.f54739i = l0Var;
        this.f54738h = hVar;
        c(configuration);
    }

    public final void a() {
        this.f54743m.set(false);
        this.f54752v = new w0(this.f54732b, this.f54733c, this.f54734d, this.f54735e, this.f54736f, this.f54737g, this.f54738h, this.f54739i, this.f54745o, this.f54740j, this.f54747q, new a());
        long jPow = (long) (Math.pow(this.f54748r, Math.min(this.f54744n.get(), this.f54749s)) * 1000.0d);
        o0 o0Var = new o0(this, jPow, 0);
        pr.n nVar = this.f54731a;
        nm.a.d(nVar, o0Var);
        if (this.f54739i.execute(this.f54752v, jPow)) {
            return;
        }
        nm.a.d(nVar, new p0(this, 0));
        nm.a.d(nVar, new p0(this, 2));
        this.f54752v = null;
        this.f54741k.set(false);
    }

    public final void b(String str) {
        nm.a.d(this.f54731a, new ao.n(14, this, str));
        a();
    }

    public final void c(Waterfall.Configuration configuration) {
        this.f54745o = configuration.getId();
        LinkedList linkedList = this.f54740j;
        linkedList.clear();
        List<Waterfall.Configuration.AdUnit> adUnitsList = configuration.getAdUnitsList();
        if (adUnitsList != null && !adUnitsList.isEmpty()) {
            linkedList.addAll(adUnitsList);
            Collections.sort(linkedList, new af.i(10));
        }
        StringValue refreshUrl = configuration.hasRefreshUrl() ? configuration.getRefreshUrl() : null;
        if (refreshUrl != null) {
            String value = refreshUrl.getValue();
            if (!TextUtils.isEmpty(value) && nm.j.isHttpUrl(value)) {
                this.f54746p = refreshUrl.getValue();
            }
        }
        UInt32Value cacheSize = configuration.hasCacheSize() ? configuration.getCacheSize() : null;
        this.f54747q = cacheSize != null ? cacheSize.getValue() : 1;
        UInt32Value retryBase = configuration.hasRetryBase() ? configuration.getRetryBase() : null;
        this.f54748r = retryBase != null ? retryBase.getValue() : 2;
        UInt32Value maxRetryDegree = configuration.hasMaxRetryDegree() ? configuration.getMaxRetryDegree() : null;
        this.f54749s = maxRetryDegree != null ? maxRetryDegree.getValue() : 5;
        UInt64Value refreshTimeout = configuration.hasRefreshTimeout() ? configuration.getRefreshTimeout() : null;
        this.f54750t = refreshTimeout != null ? refreshTimeout.getValue() : 10000L;
        this.f54751u = configuration.hasServerParams() ? configuration.getServerParams() : null;
    }

    public void load(boolean z10) {
        boolean zCompareAndSet = this.f54741k.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.f54742l;
        if (zCompareAndSet) {
            atomicBoolean.set(true);
            this.f54744n.set(0);
            a();
        } else {
            if (!z10 || atomicBoolean.get()) {
                return;
            }
            this.f54743m.set(true);
        }
    }
}
