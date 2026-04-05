package xr;

import java.util.Collections;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x8 extends wr.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y8 f93237a;

    public x8(y8 y8Var) {
        this.f93237a = y8Var;
    }

    @Override // wr.p4
    public String getServiceAuthority() {
        return this.f93237a.f93262b;
    }

    @Override // wr.p4
    public void start(p4.b bVar) {
        bVar.onResult(wr.s4.newBuilder().setAddresses(Collections.singletonList(new wr.f1(this.f93237a.f93261a))).setAttributes(wr.c.f90841b).build());
    }

    @Override // wr.p4
    public void shutdown() {
    }
}
