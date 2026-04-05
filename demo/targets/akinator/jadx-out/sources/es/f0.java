package es;

import wr.b3;
import wr.c3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 extends b3.f {

    /* renamed from: a, reason: collision with root package name */
    public final b3.f f55030a;

    public f0(b3.f fVar) {
        this.f55030a = fVar;
    }

    @Override // wr.b3.f
    public c3 pickSubchannel(b3.d dVar) {
        c3 c3VarPickSubchannel = this.f55030a.pickSubchannel(dVar);
        b3.e subchannel = c3VarPickSubchannel.getSubchannel();
        return subchannel != null ? c3.withSubchannel(subchannel, new e0((r) subchannel.getAttributes().get(k0.f55058n), c3VarPickSubchannel.getStreamTracerFactory())) : c3VarPickSubchannel;
    }
}
