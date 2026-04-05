package es;

import java.util.concurrent.atomic.AtomicLong;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 extends b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.u f55024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f55025c;

    public c0(e0 e0Var, wr.u uVar) {
        this.f55025c = e0Var;
        this.f55024b = uVar;
    }

    @Override // es.b
    public final wr.u a() {
        return this.f55024b;
    }

    @Override // es.b, wr.p6
    public void streamClosed(m6 m6Var) {
        r rVar = this.f55025c.f55027a;
        boolean zIsOk = m6Var.isOk();
        b0 b0Var = rVar.f55094a;
        if (b0Var.f55021e != null || b0Var.f55022f != null) {
            if (zIsOk) {
                ((AtomicLong) rVar.f55095b.f6756a).getAndIncrement();
            } else {
                ((AtomicLong) rVar.f55095b.f6757b).getAndIncrement();
            }
        }
        this.f55024b.streamClosed(m6Var);
    }
}
