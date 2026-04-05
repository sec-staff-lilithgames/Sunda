package xb;

import ic.g0;
import ub.u;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends c {

    /* renamed from: f, reason: collision with root package name */
    public final z f91892f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f91893g;

    public a(u uVar, String str, z zVar, Class<?> cls) {
        super(uVar, str, uVar == null ? null : uVar.currentLocation(), null);
        this.f91892f = zVar;
        this.f91893g = cls;
    }

    public z getInputType() {
        return this.f91892f;
    }

    public Class<?> getTargetType() {
        return this.f91893g;
    }

    @Override // xb.c
    public a withParser(u uVar) {
        this.f91894c = uVar;
        return this;
    }

    @Override // xb.c
    public a withRequestPayload(g0 g0Var) {
        this.f91895e = g0Var;
        return this;
    }
}
