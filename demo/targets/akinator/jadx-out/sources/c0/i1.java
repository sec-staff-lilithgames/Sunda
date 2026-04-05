package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f11502a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11503b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11504c;

    public i1() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            if (i1Var.f11502a == this.f11502a && i1Var.f11503b == this.f11503b && kotlin.jvm.internal.e0.areEqual(i1Var.f11504c, this.f11504c)) {
                return true;
            }
        }
        return false;
    }

    public final float getDampingRatio() {
        return this.f11502a;
    }

    public final float getStiffness() {
        return this.f11503b;
    }

    public final Object getVisibilityThreshold() {
        return this.f11504c;
    }

    public int hashCode() {
        Object obj = this.f11504c;
        return Float.hashCode(this.f11503b) + b0.e2.b(this.f11502a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public i1(float f10, float f11, Object obj) {
        this.f11502a = f10;
        this.f11503b = f11;
        this.f11504c = obj;
    }

    @Override // c0.j0, c0.n
    public <V extends v> w3 vectorize(n2 converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        return new w3(this.f11502a, this.f11503b, o.access$convert(converter, this.f11504c));
    }

    public /* synthetic */ i1(float f10, float f11, Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
