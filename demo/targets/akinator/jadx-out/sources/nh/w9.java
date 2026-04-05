package nh;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w9 extends e9 {

    /* renamed from: j, reason: collision with root package name */
    public final ReferenceQueue f76738j;

    public w9(fa faVar, int i10) {
        super(faVar, i10);
        this.f76738j = new ReferenceQueue();
    }

    @Override // nh.e9
    public final void e() {
        while (this.f76738j.poll() != null) {
        }
    }

    @Override // nh.e9
    public final void f() {
        a(this.f76738j);
    }

    public v9 castForTesting(a9 a9Var) {
        return (v9) a9Var;
    }

    @Override // nh.e9
    public final e9 k() {
        return this;
    }
}
