package yp;

import io.bidmachine.iab.vast.w;
import vp.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f94757b;

    public f(k kVar) {
        this.f94757b = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            k kVar = this.f94757b;
            kVar.f94779t = false;
            k.a(kVar);
            this.f94757b.l(1);
            this.f94757b.stopVideoVisibilityCheckerTimer();
            this.f94757b.f94781v = true;
            k kVar2 = this.f94757b;
            kVar2.f94780u = false;
            r rVar = kVar2.f94763c;
            if (rVar == null || ((vp.l) rVar).getVastRequest() == null) {
                return;
            }
            ((vp.l) kVar2.f94763c).getVastRequest().sendVastSpecError(w.f60562j);
        } catch (Exception e10) {
            nm.a.w(e10);
        }
    }
}
