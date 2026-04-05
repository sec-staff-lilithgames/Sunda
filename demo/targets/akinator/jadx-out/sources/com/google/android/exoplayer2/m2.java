package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m2 {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f27693b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.o f27694a;

    public m2() {
        this.f27694a = new com.google.android.exoplayer2.util.o();
    }

    public m2 add(int i10) {
        this.f27694a.add(i10);
        return this;
    }

    public m2 addAll(int... iArr) {
        this.f27694a.addAll(iArr);
        return this;
    }

    public m2 addAllCommands() {
        this.f27694a.addAll(f27693b);
        return this;
    }

    public m2 addIf(int i10, boolean z10) {
        this.f27694a.addIf(i10, z10);
        return this;
    }

    public n2 build() {
        return new n2(this.f27694a.build());
    }

    public m2 remove(int i10) {
        this.f27694a.remove(i10);
        return this;
    }

    public m2 removeAll(int... iArr) {
        this.f27694a.removeAll(iArr);
        return this;
    }

    public m2 removeIf(int i10, boolean z10) {
        this.f27694a.removeIf(i10, z10);
        return this;
    }

    public m2 addAll(n2 n2Var) {
        this.f27694a.addAll(n2Var.f27830b);
        return this;
    }

    public m2(n2 n2Var) {
        com.google.android.exoplayer2.util.o oVar = new com.google.android.exoplayer2.util.o();
        this.f27694a = oVar;
        oVar.addAll(n2Var.f27830b);
    }
}
