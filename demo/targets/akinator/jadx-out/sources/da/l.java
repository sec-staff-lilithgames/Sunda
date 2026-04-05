package da;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f51967b;

    public l(q qVar) {
        this.f51967b = qVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        q qVar = this.f51967b;
        if (qVar.isShowing()) {
            qVar.dismiss();
        }
    }
}
