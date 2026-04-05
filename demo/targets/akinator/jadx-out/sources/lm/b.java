package lm;

import android.content.Context;
import fn.y;
import hr.h;
import hr.i;
import hr.j;
import hr.k;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.b0;
import io.bidmachine.iab.vast.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f73394a;

    /* renamed from: b, reason: collision with root package name */
    public y f73395b;

    /* renamed from: c, reason: collision with root package name */
    public fn.c f73396c;

    /* renamed from: d, reason: collision with root package name */
    public t f73397d;

    /* renamed from: e, reason: collision with root package name */
    public c f73398e;

    /* renamed from: f, reason: collision with root package name */
    public d f73399f;

    /* renamed from: g, reason: collision with root package name */
    public VastView f73400g;

    public b(b0 b0Var) {
        this.f73394a = b0Var;
    }

    @Override // hr.b
    public void onDestroy() {
        this.f73398e = null;
        this.f73399f = null;
        y yVar = this.f73395b;
        if (yVar != null) {
            yVar.destroy();
            this.f73395b = null;
        }
        fn.c cVar = this.f73396c;
        if (cVar != null) {
            cVar.destroy(new a(this));
            this.f73396c = null;
        } else {
            VastView vastView = this.f73400g;
            if (vastView != null) {
                vastView.destroy();
                this.f73400g = null;
            }
        }
        if (this.f73397d != null) {
            this.f73397d = null;
        }
    }

    @Override // hr.h
    public void show(ContextProvider contextProvider, i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        t tVar = this.f73397d;
        if (tVar == null || !tVar.canDisplay()) {
            iVar.onAdShowFailed(pr.a.internal("VAST fullscreen object is null or can not find video file"));
            return;
        }
        this.f73399f = new d(iVar, this.f73395b, this.f73396c);
        this.f73397d.display(contextProvider.getContext(), this.f73394a, this.f73399f, this.f73400g, this.f73395b, this.f73396c);
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, i iVar, j jVar, k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        e eVar = new e(kVar);
        if (eVar.isValid(iVar)) {
            if (eVar.f73411h) {
                this.f73395b = new y();
                this.f73396c = new fn.c();
            }
            Context applicationContext = contextProvider.getApplicationContext();
            this.f73398e = new c(iVar);
            this.f73400g = new VastView(applicationContext);
            t tVarBuild = t.newBuilder().setCacheControl(eVar.f73406c).setPlaceholderTimeoutSec(eVar.f73407d).setVideoCloseTime(eVar.f73408e).setCompanionCloseTime(eVar.f73409f).forceUseNativeCloseTime(eVar.f73410g).setAdMeasurer(this.f73395b).build();
            this.f73397d = tVarBuild;
            tVarBuild.loadVideoWithData(applicationContext, eVar.f73405b, this.f73398e);
        }
    }
}
