package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f88241a;

    public j0 build() {
        return new j0(this.f88241a);
    }

    public i0 maxNestingDepth(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxNestingDepth to a negative value");
        }
        this.f88241a = i10;
        return this;
    }
}
