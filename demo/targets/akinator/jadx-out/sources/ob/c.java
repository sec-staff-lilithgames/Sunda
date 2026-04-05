package ob;

import kv.l;
import tu.x0;
import xv.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f78780b;

    public c(j jVar) {
        this.f78780b = jVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        try {
            this.f78780b.cancel();
        } catch (Throwable unused) {
        }
    }
}
