package ds;

import wr.e4;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends l {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f52630a;

    /* renamed from: b, reason: collision with root package name */
    public final j f52631b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52632c;

    public m(l0 l0Var, j jVar) {
        this.f52630a = l0Var;
        this.f52631b = jVar;
        jVar.f52619a = true;
    }

    @Override // ds.l
    public final void a() {
        j jVar = this.f52631b;
        int i10 = jVar.f52623e;
        if (i10 > 0) {
            jVar.request(i10);
        }
    }

    @Override // wr.p.a
    public void onClose(m6 m6Var, e4 e4Var) {
        boolean zIsOk = m6Var.isOk();
        l0 l0Var = this.f52630a;
        if (zIsOk) {
            l0Var.onCompleted();
        } else {
            l0Var.onError(m6Var.asRuntimeException(e4Var));
        }
    }

    @Override // wr.p.a
    public void onMessage(Object obj) {
        boolean z10 = this.f52632c;
        j jVar = this.f52631b;
        if (z10 && !jVar.f52621c) {
            throw m6.f91046n.withDescription("More than one responses received for unary or client-streaming call").asRuntimeException();
        }
        this.f52632c = true;
        this.f52630a.onNext(obj);
        if (jVar.f52621c && jVar.f52624f) {
            jVar.request(1);
        }
    }

    @Override // wr.p.a
    public void onReady() {
        Runnable runnable = this.f52631b.f52622d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // wr.p.a
    public void onHeaders(e4 e4Var) {
    }
}
