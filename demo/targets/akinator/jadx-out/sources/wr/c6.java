package wr;

import wr.b6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c6 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    public final b6.b f90863a;

    public c6(b6.b bVar) {
        this.f90863a = bVar;
    }

    @Override // wr.z4
    public final k5 a() {
        throw new UnsupportedOperationException();
    }

    @Override // wr.m1, wr.z4, wr.k5
    public c getAttributes() {
        return this.f90863a.getAttributes();
    }

    @Override // wr.m1, wr.z4, wr.k5
    public String getAuthority() {
        return this.f90863a.getAuthority();
    }

    @Override // wr.m1, wr.k5
    public k4 getMethodDescriptor() {
        return this.f90863a.getMethodDescriptor();
    }

    @Override // wr.m1, wr.z4, wr.k5
    public boolean isCancelled() {
        return false;
    }

    @Override // wr.m1, wr.z4, wr.k5
    public boolean isReady() {
        return false;
    }
}
