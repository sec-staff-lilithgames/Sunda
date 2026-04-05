package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.protobuf.AdCacheControl;
import io.bidmachine.protobuf.AdExtension;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n implements ExpirationHandler.Listener {

    /* renamed from: x, reason: collision with root package name */
    public static final long f61892x = TimeUnit.MINUTES.toSeconds(29);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f61893y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f61894a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61895b;

    /* renamed from: c, reason: collision with root package name */
    public final AdRequestParameters f61896c;

    /* renamed from: d, reason: collision with root package name */
    public final NetworkAdUnitManager f61897d;

    /* renamed from: e, reason: collision with root package name */
    public final String f61898e;

    /* renamed from: f, reason: collision with root package name */
    public final Struct f61899f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61900g;

    /* renamed from: h, reason: collision with root package name */
    public final Ad f61901h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f61902i;

    /* renamed from: j, reason: collision with root package name */
    public final AdExtension.EventConfiguration f61903j;

    /* renamed from: k, reason: collision with root package name */
    public final AdCacheControl f61904k;

    /* renamed from: l, reason: collision with root package name */
    public final long f61905l;

    /* renamed from: m, reason: collision with root package name */
    public final k f61906m;

    /* renamed from: n, reason: collision with root package name */
    public final NetworkAdUnit f61907n;

    /* renamed from: o, reason: collision with root package name */
    public final ExpirationHandler f61908o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumMap f61909p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f61910q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f61911r;

    /* renamed from: s, reason: collision with root package name */
    public volatile u f61912s;

    /* renamed from: t, reason: collision with root package name */
    public final m f61913t;

    /* renamed from: u, reason: collision with root package name */
    public volatile up.a f61914u;

    /* renamed from: v, reason: collision with root package name */
    public ExpirationHandler f61915v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f61916w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements ExpirationHandler.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final AdProcessCallback f61917a;

        public a(AdProcessCallback adProcessCallback) {
            this.f61917a = adProcessCallback;
        }

        @Override // io.bidmachine.ExpirationHandler.Listener
        public void onExpired() {
            this.f61917a.processLoadFail(new pr.a(pr.a.f81788f, -1, "Creative loading timeout reached"));
        }
    }

    public n(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, Response response, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad2, NetworkAdapter networkAdapter) {
        AdExtension.EventConfiguration eventConfiguration;
        AdCacheControl adCacheControl;
        EnumMap enumMap = new EnumMap(TrackEventType.class);
        this.f61909p = enumMap;
        boolean z10 = false;
        this.f61910q = new AtomicBoolean(false);
        this.f61911r = new CopyOnWriteArrayList();
        this.f61912s = u.f62021b;
        m mVar = new m(this);
        this.f61913t = mVar;
        this.f61894a = new pr.n("AdResponse");
        this.f61895b = System.currentTimeMillis();
        this.f61896c = adRequestParameters;
        this.f61897d = networkAdUnitManager;
        this.f61898e = response.getId();
        this.f61899f = seatbid.getExt();
        this.f61900g = bid.getId();
        this.f61901h = ad2;
        AdExtension adExtensionFindFirstAdExtension = pr.i.findFirstAdExtension(ad2);
        k0 k0Var = new k0(adRequestParameters.getAdsType(), seatbid, bid, ad2, networkAdapter, adExtensionFindFirstAdExtension);
        this.f61902i = k0Var;
        this.f61903j = (adExtensionFindFirstAdExtension == null || (eventConfiguration = adExtensionFindFirstAdExtension.getEventConfiguration()) == AdExtension.EventConfiguration.getDefaultInstance()) ? null : eventConfiguration;
        this.f61904k = (adExtensionFindFirstAdExtension == null || (adCacheControl = adExtensionFindFirstAdExtension.getAdCacheControl()) == AdCacheControl.UNRECOGNIZED) ? null : adCacheControl;
        long orDefault = nm.j.getOrDefault(bid.getExp(), Response.Seatbid.Bid.getDefaultInstance().getExp(), f61892x) * 1000;
        this.f61905l = orDefault;
        this.f61906m = new k(this, k0Var.getId());
        this.f61907n = networkAdUnitManager.findOrAddWinnerNetworkAdUnit(networkAdapter, adRequestParameters.getAdsFormat(), k0Var.getNetworkParams());
        ExpirationHandler expirationHandler = new ExpirationHandler(orDefault, this);
        this.f61908o = expirationHandler;
        int creativeLoadingTimeout = adExtensionFindFirstAdExtension != null ? adExtensionFindFirstAdExtension.getCreativeLoadingTimeout() : 0;
        this.f61915v = creativeLoadingTimeout > 0 ? new ExpirationHandler(creativeLoadingTimeout, new a(mVar)) : null;
        if (adExtensionFindFirstAdExtension != null && adExtensionFindFirstAdExtension.getCridMonitoringEnabled()) {
            z10 = true;
        }
        this.f61916w = z10;
        pr.i.addEvent(enumMap, TrackEventType.MediationWin, bid.getPurl());
        pr.i.addEvent(enumMap, TrackEventType.MediationLoss, bid.getLurl());
        expirationHandler.start();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f61911r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((WeakReference) it.next()).clear();
        }
        copyOnWriteArrayList.clear();
    }

    public void attachAdRequest(AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        nm.a.d(this.f61894a, new c(this, 3));
        this.f61911r.add(new WeakReference(adRequest));
    }

    public final Value b() {
        Struct.Builder builderPutFields = Struct.newBuilder().putFields("price", Value.newBuilder().setNumberValue(this.f61902i.getPrice()).build()).putFields("exp", Value.newBuilder().setNumberValue(calculateExpirationLeftMs()).build()).putFields("request_id", Value.newBuilder().setStringValue(this.f61898e).build()).putFields("bid_id", Value.newBuilder().setStringValue(this.f61900g).build());
        Struct struct = this.f61899f;
        if (struct.getFieldsCount() > 0) {
            builderPutFields.putFields("seat", Value.newBuilder().setStructValue(struct).build());
        }
        return Value.newBuilder().setStructValue(builderPutFields).build();
    }

    public final void c() {
        nm.a.d(this.f61894a, new c(this, 6));
        t.get().c(this);
        ExpirationHandler expirationHandler = this.f61915v;
        if (expirationHandler != null) {
            expirationHandler.stop();
        }
        this.f61915v = null;
        a();
        this.f61908o.stop();
        m mVar = this.f61913t;
        mVar.f60594a.clear();
        synchronized (mVar.f60596c) {
            mVar.f60595b.clear();
        }
        this.f61909p.clear();
        this.f61897d.notifyNetworkClearAuction();
        if (this.f61913t.f60598e.get()) {
            d(TrackEventType.Load, pr.a.f81796n, null);
        }
        if (this.f61914u != null) {
            d(TrackEventType.Destroy, null, null);
        }
        this.f61906m.clear();
        nm.j.onUiThread(new l(this));
    }

    public long calculateExpirationLeftMs() {
        return this.f61905l - (System.currentTimeMillis() - this.f61895b);
    }

    public boolean canCache() {
        return this.f61904k == AdCacheControl.AD_CACHE_CONTROL_ENABLED;
    }

    public final void d(TrackEventType trackEventType, pr.a aVar, Map map) {
        this.f61906m.eventFinish(trackEventType, getAdsType(), this, aVar, map);
    }

    public void detachAdRequest(AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        nm.a.d(this.f61894a, new c(this, 1));
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f61911r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            AdRequest<?, ?, ?> adRequest2 = (AdRequest) weakReference.get();
            if (adRequest2 == null || adRequest2 == adRequest) {
                arrayList.add(weakReference);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
        if (copyOnWriteArrayList.isEmpty()) {
            g();
        }
    }

    public final void e(AdRequest adRequest) {
        Iterator it = this.f61911r.iterator();
        while (it.hasNext()) {
            AdRequest adRequest2 = (AdRequest) ((WeakReference) it.next()).get();
            if (adRequest2 != null && adRequest2 != adRequest) {
                adRequest2.processExpired();
            }
        }
    }

    public final void f(boolean z10) {
        nm.a.d(this.f61894a, new c(this, 5));
        this.f61910q.set(true);
        this.f61908o.stop();
        e(null);
        if (z10) {
            c();
        }
    }

    public final void g() {
        boolean zContains;
        nm.a.d(this.f61894a, new c(this, 4));
        t tVar = t.get();
        if (!wasShown() && !isExpired()) {
            synchronized (tVar.f62017a) {
                zContains = tVar.f62018b.contains(this);
            }
            if (zContains) {
                a();
                setStatus(u.f62021b);
                nm.j.onUiThread(new t0(this, 2));
                return;
            }
        }
        c();
    }

    public Ad getAd() {
        return this.f61901h;
    }

    public up.a getAdObject() {
        return this.f61914u;
    }

    public AdRequestParameters getAdRequestParameters() {
        return this.f61896c;
    }

    public AdsType getAdsType() {
        return this.f61896c.getAdsType();
    }

    public up.c getAuctionResult() {
        return this.f61902i;
    }

    public CreativeFormat getCreativeFormat() {
        return this.f61902i.getCreativeFormat();
    }

    public AdExtension.EventConfiguration getEventConfiguration() {
        return this.f61903j;
    }

    public double getPrice() {
        return this.f61902i.getPrice();
    }

    public synchronized u getStatus() {
        return this.f61912s;
    }

    public List<String> getTrackUrlListByEvent(TrackEventType trackEventType) {
        return (List) this.f61909p.get(trackEventType);
    }

    public List<String> getTrackUrls(TrackEventType trackEventType) {
        up.a adObject = getAdObject();
        up.b params = adObject != null ? adObject.getParams() : null;
        if (params != null) {
            return params.getTrackUrls(trackEventType);
        }
        return null;
    }

    public NetworkAdUnit getWinnerNetworkAdUnit() {
        return this.f61907n;
    }

    public boolean isAdLoaded() {
        return getAdObject() != null && this.f61913t.f60597d.get();
    }

    public boolean isExpired() {
        return this.f61910q.get();
    }

    public synchronized void loadAdObject(ContextProvider contextProvider, AdRequest adRequest, BidMachineAd bidMachineAd, AdProcessCallback adProcessCallback) {
        NetworkAdapter networkAdapterFindNetworkAdapter;
        onAdLoadStart(adRequest);
        m mVar = this.f61913t;
        synchronized (mVar.f60596c) {
            mVar.f60595b.put(adProcessCallback, Boolean.TRUE);
        }
        if (isAdLoaded()) {
            adProcessCallback.processLoadSuccess();
            return;
        }
        if (this.f61913t.f60598e.getAndSet(true)) {
            return;
        }
        this.f61906m.eventStart(TrackEventType.Load);
        if (isExpired()) {
            this.f61913t.processLoadFail(pr.a.f81793k);
            return;
        }
        if (wasShown()) {
            this.f61913t.processLoadFail(pr.a.f81794l);
            return;
        }
        try {
            networkAdapterFindNetworkAdapter = adRequest.getAdsType().findNetworkAdapter(this.f61901h);
        } catch (Throwable th2) {
            nm.a.w(th2);
            this.f61913t.processLoadFail(pr.a.throwable("Exception processing response", th2));
        }
        if (networkAdapterFindNetworkAdapter == null) {
            this.f61913t.processLoadFail(pr.a.incorrectContent("Failed to get adapter by response"));
            return;
        }
        up.b bVarCreateAdObjectParams = adRequest.getAdsType().createAdObjectParams(this.f61901h);
        if (bVarCreateAdObjectParams != null && bVarCreateAdObjectParams.isValid()) {
            up.a aVarCreateAdObject = bidMachineAd.createAdObject(contextProvider, adRequest, networkAdapterFindNetworkAdapter, bVarCreateAdObjectParams, this.f61913t);
            if (aVarCreateAdObject == null) {
                this.f61913t.processLoadFail(pr.a.incorrectContent("Failed to create ad object by response"));
                return;
            }
            this.f61914u = aVarCreateAdObject;
            ExpirationHandler expirationHandler = this.f61915v;
            if (expirationHandler != null) {
                expirationHandler.start();
            }
            aVarCreateAdObject.load(contextProvider, adRequest.obtainUnifiedRequestParams(), this.f61907n);
            return;
        }
        this.f61913t.processLoadFail(pr.a.incorrectContent("Failed to get parameters by response"));
    }

    public void onAdLoadStart(AdRequest<?, ?, ?> adRequest) {
        nm.a.d(this.f61894a, new c(this, 2));
        e(adRequest);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.f61913t.processExpired();
    }

    public void removeCallback(AdProcessCallback adProcessCallback) {
        m mVar = this.f61913t;
        synchronized (mVar.f60596c) {
            mVar.f60595b.remove(adProcessCallback);
        }
    }

    public synchronized void setStatus(u uVar) {
        this.f61912s = uVar;
    }

    public String toString() {
        return this.f61902i.toString();
    }

    public boolean wasShown() {
        return this.f61913t.f60603j.get();
    }
}
