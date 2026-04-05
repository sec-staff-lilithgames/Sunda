package es;

import mh.p1;
import wr.b3;
import wr.f3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends e {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f55056a;

    /* renamed from: b, reason: collision with root package name */
    public final f3 f55057b;

    public k(b3.e eVar, f3 f3Var) {
        this.f55056a = (b3.e) p1.checkNotNull(eVar, "delegate");
        this.f55057b = (f3) p1.checkNotNull(f3Var, "healthListener");
    }

    @Override // es.e
    public b3.e delegate() {
        return this.f55056a;
    }

    @Override // es.e, wr.b3.e
    public wr.c getAttributes() {
        return super.getAttributes().toBuilder().set(b3.f90830d, Boolean.TRUE).build();
    }

    @Override // es.e, wr.b3.e
    public void start(f3 f3Var) {
        this.f55056a.start(new j(this, f3Var));
    }
}
