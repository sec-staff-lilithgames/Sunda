package em;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.Waterfall;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class w0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final pr.n f54772b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f54773c;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f54774e;

    /* renamed from: f, reason: collision with root package name */
    public final AdsFormat f54775f;

    /* renamed from: g, reason: collision with root package name */
    public final fm.b f54776g;

    /* renamed from: h, reason: collision with root package name */
    public final d f54777h;

    /* renamed from: i, reason: collision with root package name */
    public final h f54778i;

    /* renamed from: j, reason: collision with root package name */
    public final n f54779j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f54780k;

    /* renamed from: l, reason: collision with root package name */
    public final String f54781l;

    /* renamed from: m, reason: collision with root package name */
    public final ConcurrentLinkedQueue f54782m;

    /* renamed from: o, reason: collision with root package name */
    public final int f54784o;

    /* renamed from: p, reason: collision with root package name */
    public final v0 f54785p;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentLinkedQueue f54783n = new ConcurrentLinkedQueue();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f54786q = new AtomicBoolean(false);

    public w0(Context context, j0 j0Var, AdsFormat adsFormat, fm.b bVar, n nVar, d dVar, h hVar, l0 l0Var, String str, List<Waterfall.Configuration.AdUnit> list, int i10, v0 v0Var) {
        this.f54772b = new pr.n(j0Var.getNetworkName() + "WaterfallLoader");
        this.f54773c = context.getApplicationContext();
        this.f54774e = j0Var;
        this.f54775f = adsFormat;
        this.f54776g = bVar;
        this.f54779j = nVar;
        this.f54777h = dVar;
        this.f54778i = hVar;
        this.f54780k = l0Var;
        this.f54781l = str;
        this.f54782m = new ConcurrentLinkedQueue(list);
        this.f54784o = i10;
        this.f54785p = v0Var;
    }

    public final void a(Waterfall.Configuration.AdUnit adUnit, Waterfall.Result.AdUnit.Status status, x xVar, pr.a aVar) {
        Waterfall.Result.AdUnit.Builder price = Waterfall.Result.AdUnit.newBuilder().setStatus(status).setPrice(adUnit.getPrice());
        if (adUnit.getAdUnitId() != null) {
            price.setAdUnitId(adUnit.getAdUnitId());
        }
        StringValue serverParams = adUnit.getServerParams();
        if (serverParams != null) {
            price.setServerParams(serverParams);
        }
        if (xVar != null) {
            Waterfall.Result.EstimatedPrice price2 = xVar.getPrice();
            if (price2 != null) {
                price.setEstimatedPrice(price2);
            }
            String adResponse = xVar.getAdResponse();
            if (!TextUtils.isEmpty(adResponse)) {
                price.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
            }
        }
        if (aVar != null) {
            price.setError(Waterfall.Result.AdUnit.Error.newBuilder().setCode(aVar.getCode()).setDescription(aVar.getMessage()));
        }
        this.f54783n.add(price.build());
    }

    public final void b(Long l9) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f54782m;
        if (concurrentLinkedQueue.isEmpty()) {
            c();
            return;
        }
        Waterfall.Configuration.AdUnit adUnit = (Waterfall.Configuration.AdUnit) concurrentLinkedQueue.poll();
        if (adUnit == null) {
            b(l9);
            return;
        }
        long value = (adUnit.hasSleepTimeBefore() ? adUnit.getSleepTimeBefore() : null) != null ? r1.getValue() : 0L;
        if (l9 != null) {
            value += l9.longValue();
        }
        nm.a.d(this.f54772b, new o0(this, value, 1));
        if (this.f54780k.execute(new com.ironsource.environment.thread.a(23, this, adUnit), value)) {
            return;
        }
        c();
    }

    public final void c() {
        nm.a.d(this.f54772b, new s0(this, 1));
        d(TrackEventType.WaterfallLoadFinish, null, null, null);
        this.f54786q.set(false);
        this.f54785p.onWaterfallLoadCompleted(this.f54783n);
    }

    public final void d(TrackEventType trackEventType, Waterfall.Configuration.AdUnit adUnit, u uVar, pr.a aVar) {
        gr.a networkName = new gr.a().setNetworkName(this.f54774e.getNetworkKey());
        if (adUnit != null) {
            networkName.setPrice(Double.valueOf(adUnit.getPrice()));
        }
        if (uVar != null) {
            networkName.setCustomParams(uVar.getCustomParamsMap());
        }
        String str = this.f54781l;
        if (!TextUtils.isEmpty(str)) {
            networkName.setCustomParam("gam_waterfall_id", str);
        }
        ((i) this.f54778i).trackEvent(trackEventType, this.f54775f, networkName, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f54786q.compareAndSet(false, true)) {
            nm.a.d(this.f54772b, new s0(this, 0));
            d(TrackEventType.WaterfallLoadStart, null, null, null);
            b(null);
        }
    }
}
