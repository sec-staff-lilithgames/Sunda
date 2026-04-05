package lc;

import jc.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final s f73146f = new s(2000, 4000, 200);

    /* renamed from: b, reason: collision with root package name */
    public final int f73147b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73148c;

    /* renamed from: e, reason: collision with root package name */
    public final int f73149e;

    public s(int i10, int i11, int i12) {
        this.f73147b = i10;
        this.f73148c = i11;
        this.f73149e = i12;
    }

    public static r builder() {
        return new r();
    }

    public static b defaultInstance() {
        return f73146f;
    }

    @Override // lc.b
    public dd.u forDeserializerCache(jc.j jVar) {
        int i10 = this.f73147b;
        return new dd.s(Math.min(64, i10 >> 2), i10);
    }

    @Override // lc.b
    public dd.u forSerializerCache(s0 s0Var) {
        int i10 = this.f73148c;
        return new dd.s(Math.min(64, i10 >> 2), i10);
    }

    @Override // lc.b
    public dd.u forTypeFactory() {
        int i10 = this.f73149e;
        return new dd.s(Math.min(64, i10 >> 2), i10);
    }
}
