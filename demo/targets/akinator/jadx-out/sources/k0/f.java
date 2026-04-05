package k0;

import a2.r3;
import i1.o;
import kotlin.jvm.internal.e0;
import rv.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements b, r3 {

    /* renamed from: b, reason: collision with root package name */
    public final float f70009b;

    public f(float f10) {
        this.f70009b = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public static /* synthetic */ f copy$default(f fVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fVar.f70009b;
        }
        return fVar.copy(f10);
    }

    public final f copy(float f10) {
        return new f(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && e0.areEqual((Object) Float.valueOf(this.f70009b), (Object) Float.valueOf(((f) obj).f70009b));
    }

    @Override // a2.r3
    public /* bridge */ /* synthetic */ t getInspectableElements() {
        return super.getInspectableElements();
    }

    @Override // a2.r3
    public /* bridge */ /* synthetic */ String getNameFallback() {
        return super.getNameFallback();
    }

    public int hashCode() {
        return Float.hashCode(this.f70009b);
    }

    @Override // k0.b
    /* renamed from: toPx-TmRCtEA */
    public float mo5089toPxTmRCtEA(long j10, s2.e density) {
        e0.checkNotNullParameter(density, "density");
        return (this.f70009b / 100.0f) * o.m4251getMinDimensionimpl(j10);
    }

    public String toString() {
        return "CornerSize(size = " + this.f70009b + "%)";
    }

    @Override // a2.r3
    public String getValueOverride() {
        return a.b.n(new StringBuilder(), this.f70009b, '%');
    }
}
