package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f51591a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.i2 f51592b;

    public r3(long j10, g0.i2 i2Var, kotlin.jvm.internal.u uVar) {
        this.f51591a = j10;
        this.f51592b = i2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.e0.areEqual(r3.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        }
        r3 r3Var = (r3) obj;
        return j1.m0.m4859equalsimpl0(this.f51591a, r3Var.f51591a) && kotlin.jvm.internal.e0.areEqual(this.f51592b, r3Var.f51592b);
    }

    public final g0.i2 getDrawPadding() {
        return this.f51592b;
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m3729getGlowColor0d7_KjU() {
        return this.f51591a;
    }

    public int hashCode() {
        return this.f51592b.hashCode() + (j1.m0.m4865hashCodeimpl(this.f51591a) * 31);
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) j1.m0.m4866toStringimpl(this.f51591a)) + ", drawPadding=" + this.f51592b + ')';
    }

    public /* synthetic */ r3(long j10, g0.i2 i2Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? j1.o0.Color(4284900966L) : j10, (i10 & 2) != 0 ? g0.f2.m3872PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : i2Var, null);
    }
}
