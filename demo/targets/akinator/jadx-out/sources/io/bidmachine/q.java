package io.bidmachine;

import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.ApiRequest;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f61976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61977b;

    /* renamed from: c, reason: collision with root package name */
    public a f61978c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements nm.b, nm.c {

        /* renamed from: a, reason: collision with root package name */
        public final String f61979a;

        /* renamed from: b, reason: collision with root package name */
        public final String f61980b;

        /* renamed from: c, reason: collision with root package name */
        public final AdRequestParameters f61981c;

        /* renamed from: d, reason: collision with root package name */
        public final NetworkAdUnitManager f61982d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakReference f61983e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f61984f = new AtomicBoolean(false);

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f61985g = new AtomicBoolean(false);

        public a(String str, String str2, AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, o oVar) {
            this.f61979a = str;
            this.f61980b = str2;
            this.f61981c = adRequestParameters;
            this.f61982d = networkAdUnitManager;
            this.f61983e = new WeakReference(oVar);
        }

        public final o a() {
            if (this.f61985g.get()) {
                return null;
            }
            AtomicBoolean atomicBoolean = this.f61984f;
            if (atomicBoolean.get()) {
                return null;
            }
            WeakReference weakReference = this.f61983e;
            if (weakReference.get() == null) {
                return null;
            }
            atomicBoolean.set(true);
            return (o) weakReference.get();
        }

        public void clear() {
            this.f61985g.set(true);
            this.f61983e.clear();
        }

        @Override // nm.c
        public void onCanceled() {
            p3.get().remove(this.f61979a);
            this.f61982d.notifyNetworkClearAuction();
            o oVarA = a();
            if (oVarA != null) {
                ((h) oVarA).onCancel();
            }
            clear();
        }

        @Override // nm.b
        public void onFail(pr.a aVar) {
            p3.get().remove(this.f61979a);
            NetworkAdUnitManager networkAdUnitManager = this.f61982d;
            networkAdUnitManager.notifyNetworkAuctionResult(null);
            networkAdUnitManager.notifyNetworkClearAuction();
            n nVarB = t.get().b(this.f61981c);
            if (nVarB == null) {
                o oVarA = a();
                if (oVarA != null) {
                    ((h) oVarA).onFail(aVar);
                }
                clear();
                return;
            }
            o oVarA2 = a();
            if (oVarA2 != null) {
                ((h) oVarA2).onSuccess(nVarB);
            } else {
                nVarB.setStatus(u.f62021b);
            }
            clear();
        }

        @Override // nm.b
        public void onSuccess(Response response) {
            p3.get().remove(this.f61979a);
            UrlProvider.setAuctionUrlFromSuccessRequest(this.f61980b);
            t3.a(this.f61981c, this.f61982d, response, new p(this));
        }
    }

    public q() {
        this(UUID.randomUUID().toString());
    }

    public void cancel() {
        nm.a.d(this.f61976a, "cancel");
        a aVar = this.f61978c;
        if (aVar != null) {
            aVar.clear();
            this.f61978c = null;
        }
    }

    public void load(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, ApiRequest.Builder<?, Response> builder, o oVar) {
        nm.a.d(this.f61976a, "load");
        a aVar = this.f61978c;
        if (aVar != null) {
            aVar.clear();
        }
        a aVar2 = new a(this.f61977b, builder.getUrl(), adRequestParameters, networkAdUnitManager, oVar);
        this.f61978c = aVar2;
        builder.setCallback(aVar2);
        builder.setCancelCallback(this.f61978c);
        p3.get().add(this.f61977b, builder.request());
    }

    public q(String str) {
        this.f61976a = new pr.n("AdResponseLoader");
        this.f61977b = str;
    }
}
