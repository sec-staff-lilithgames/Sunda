package jm;

import android.content.Context;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import tm.b0;
import tm.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends hr.h {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f69688a;

    /* renamed from: b, reason: collision with root package name */
    public q f69689b;

    /* renamed from: c, reason: collision with root package name */
    public fn.c f69690c;

    public i(b0 b0Var) {
        this.f69688a = b0Var;
    }

    @Override // hr.b
    public void onDestroy() {
        fn.c cVar = this.f69690c;
        if (cVar != null) {
            cVar.destroy(new h(this));
            this.f69690c = null;
            return;
        }
        q qVar = this.f69689b;
        if (qVar != null) {
            qVar.destroy();
            this.f69689b = null;
        }
    }

    @Override // hr.h
    public void show(ContextProvider contextProvider, hr.i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        q qVar = this.f69689b;
        if (qVar == null) {
            iVar.onAdShowFailed(pr.a.internal("MRAID fullscreen object is null"));
            return;
        }
        if (!qVar.isReady()) {
            iVar.onAdShowFailed(pr.a.internal("MRAID fullscreen object is not ready"));
        } else if (this.f69689b.isShown()) {
            iVar.onAdShowFailed(pr.a.internal("MRAID fullscreen object is already was shown"));
        } else {
            this.f69689b.show(contextProvider.getContext(), this.f69688a);
        }
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.i iVar, hr.j jVar, hr.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        k kVar2 = new k(kVar);
        if (kVar2.isValid(iVar)) {
            Context applicationContext = contextProvider.getApplicationContext();
            boolean z10 = kVar2.f69698f;
            String strPrepareCreativeForMeasure = kVar2.f69694b;
            if (z10) {
                fn.c cVar = new fn.c();
                this.f69690c = cVar;
                strPrepareCreativeForMeasure = cVar.prepareCreativeForMeasure(strPrepareCreativeForMeasure);
            }
            nm.j.onUiThread(new g(this, kVar2, applicationContext, iVar, strPrepareCreativeForMeasure));
        }
    }
}
