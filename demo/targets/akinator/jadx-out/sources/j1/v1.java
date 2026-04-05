package j1;

import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final List f69014d;

    /* renamed from: e, reason: collision with root package name */
    public final List f69015e;

    /* renamed from: f, reason: collision with root package name */
    public final long f69016f;

    /* renamed from: g, reason: collision with root package name */
    public final float f69017g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69018h;

    public /* synthetic */ v1(List list, List list2, long j10, float f10, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? r2.f68961b.m4915getClamp3opZhB0() : i10, null);
    }

    @Override // j1.b2
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4695createShaderuvyYCjk(long j10) {
        float fM4252getWidthimpl;
        float fM4249getHeightimpl;
        long j11 = this.f69016f;
        if (i1.i.m4200isUnspecifiedk4lQ0M(j11)) {
            long jM4258getCenteruvyYCjk = i1.p.m4258getCenteruvyYCjk(j10);
            fM4252getWidthimpl = i1.h.m4185getXimpl(jM4258getCenteruvyYCjk);
            fM4249getHeightimpl = i1.h.m4186getYimpl(jM4258getCenteruvyYCjk);
        } else {
            fM4252getWidthimpl = i1.h.m4185getXimpl(j11) == Float.POSITIVE_INFINITY ? i1.o.m4252getWidthimpl(j10) : i1.h.m4185getXimpl(j11);
            fM4249getHeightimpl = i1.h.m4186getYimpl(j11) == Float.POSITIVE_INFINITY ? i1.o.m4249getHeightimpl(j10) : i1.h.m4186getYimpl(j11);
        }
        long jOffset = i1.i.Offset(fM4252getWidthimpl, fM4249getHeightimpl);
        float fM4251getMinDimensionimpl = this.f69017g;
        if (fM4251getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM4251getMinDimensionimpl = i1.o.m4251getMinDimensionimpl(j10) / 2;
        }
        return c2.m4712RadialGradientShader8uybcMk(jOffset, fM4251getMinDimensionimpl, this.f69014d, this.f69015e, this.f69018h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f69014d, v1Var.f69014d) && kotlin.jvm.internal.e0.areEqual(this.f69015e, v1Var.f69015e) && i1.h.m4182equalsimpl0(this.f69016f, v1Var.f69016f) && this.f69017g == v1Var.f69017g && r2.m4936equalsimpl0(this.f69018h, v1Var.f69018h);
    }

    @Override // j1.b0
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4672getIntrinsicSizeNHjbRc() {
        float f10 = this.f69017g;
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            return i1.o.f59366b.m4238getUnspecifiedNHjbRc();
        }
        float f11 = 2;
        return i1.p.Size(f10 * f11, f10 * f11);
    }

    public int hashCode() {
        int iHashCode = this.f69014d.hashCode() * 31;
        List list = this.f69015e;
        return r2.m4937hashCodeimpl(this.f69018h) + b0.e2.b(this.f69017g, (i1.h.m4187hashCodeimpl(this.f69016f) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31);
    }

    public String toString() {
        String str;
        long j10 = this.f69016f;
        String str2 = "";
        if (i1.i.m4198isSpecifiedk4lQ0M(j10)) {
            str = "center=" + ((Object) i1.h.m4193toStringimpl(j10)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f69017g;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            str2 = "radius=" + f10 + ", ";
        }
        return "RadialGradient(colors=" + this.f69014d + ", stops=" + this.f69015e + ", " + str + str2 + "tileMode=" + ((Object) r2.m4938toStringimpl(this.f69018h)) + ')';
    }

    public v1(List list, List list2, long j10, float f10, int i10, kotlin.jvm.internal.u uVar) {
        this.f69014d = list;
        this.f69015e = list2;
        this.f69016f = j10;
        this.f69017g = f10;
        this.f69018h = i10;
    }
}
