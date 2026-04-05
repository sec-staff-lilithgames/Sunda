package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11395a;

    public a1() {
        this(0, 1, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a1) && ((a1) obj).f11395a == this.f11395a;
    }

    public final int getDelay() {
        return this.f11395a;
    }

    public int hashCode() {
        return this.f11395a;
    }

    public a1(int i10) {
        this.f11395a = i10;
    }

    @Override // c0.f0, c0.j0, c0.n
    public <V extends v> n3 vectorize(n2 converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        return new v3(this.f11395a);
    }

    public /* synthetic */ a1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
