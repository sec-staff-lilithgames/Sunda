package ds;

import wr.e4;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p extends l {

    /* renamed from: a, reason: collision with root package name */
    public final k f52640a;

    /* renamed from: b, reason: collision with root package name */
    public Object f52641b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52642c = false;

    public p(k kVar) {
        this.f52640a = kVar;
    }

    @Override // ds.l
    public final void a() {
        this.f52640a.f52629j.request(2);
    }

    @Override // wr.p.a
    public void onClose(m6 m6Var, e4 e4Var) {
        boolean zIsOk = m6Var.isOk();
        k kVar = this.f52640a;
        if (!zIsOk) {
            kVar.setException(m6Var.asRuntimeException(e4Var));
            return;
        }
        if (!this.f52642c) {
            kVar.setException(m6.f91046n.withDescription("No value received for unary call").asRuntimeException(e4Var));
        }
        kVar.set(this.f52641b);
    }

    @Override // wr.p.a
    public void onMessage(Object obj) {
        if (this.f52642c) {
            throw m6.f91046n.withDescription("More than one value received for unary call").asRuntimeException();
        }
        this.f52641b = obj;
        this.f52642c = true;
    }

    @Override // wr.p.a
    public void onHeaders(e4 e4Var) {
    }
}
