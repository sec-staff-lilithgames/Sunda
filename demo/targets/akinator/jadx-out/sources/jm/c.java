package jm;

import android.content.Context;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import nm.m;
import tm.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends hr.e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f69674a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public l0 f69675b;

    /* renamed from: c, reason: collision with root package name */
    public fn.c f69676c;

    @Override // hr.b
    public void onDestroy() {
        fn.c cVar = this.f69676c;
        if (cVar != null) {
            cVar.destroy(new b(this));
            this.f69676c = null;
            return;
        }
        l0 l0Var = this.f69675b;
        if (l0Var != null) {
            l0Var.destroy();
            this.f69675b = null;
        }
    }

    @Override // hr.b
    public void onShown() {
        super.onShown();
        fn.c cVar = this.f69676c;
        if (cVar != null) {
            cVar.trackShown();
        }
    }

    @Override // hr.p
    public void prepareToShow(RendererConfiguration rendererConfiguration) throws Throwable {
        l0 l0Var;
        super.prepareToShow(rendererConfiguration);
        if (this.f69674a.compareAndSet(false, true) && (l0Var = this.f69675b) != null) {
            l0Var.show(null);
        }
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.f fVar, hr.g gVar, hr.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        k kVar2 = new k(kVar);
        if (kVar2.isValid(fVar)) {
            fVar.setVisibilitySource(kVar2.f69699g == qm.a.f83288b ? m.f77061b : m.f77063e);
            Context applicationContext = contextProvider.getApplicationContext();
            boolean z10 = kVar2.f69698f;
            String strPrepareCreativeForMeasure = kVar2.f69694b;
            if (z10) {
                fn.c cVar = new fn.c(true);
                this.f69676c = cVar;
                strPrepareCreativeForMeasure = cVar.prepareCreativeForMeasure(strPrepareCreativeForMeasure);
            }
            nm.j.onUiThread(new a(this, kVar2, fVar, applicationContext, strPrepareCreativeForMeasure));
        }
    }
}
