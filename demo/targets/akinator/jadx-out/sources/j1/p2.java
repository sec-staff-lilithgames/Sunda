package j1;

import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final long f68945d;

    /* renamed from: e, reason: collision with root package name */
    public final List f68946e;

    /* renamed from: f, reason: collision with root package name */
    public final List f68947f;

    public /* synthetic */ p2(long j10, List list, List list2, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, list, (i10 & 4) != 0 ? null : list2, null);
    }

    @Override // j1.b2
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4695createShaderuvyYCjk(long j10) {
        long jOffset;
        long j11 = this.f68945d;
        if (i1.i.m4200isUnspecifiedk4lQ0M(j11)) {
            jOffset = i1.p.m4258getCenteruvyYCjk(j10);
        } else {
            jOffset = i1.i.Offset(i1.h.m4185getXimpl(j11) == Float.POSITIVE_INFINITY ? i1.o.m4252getWidthimpl(j10) : i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11) == Float.POSITIVE_INFINITY ? i1.o.m4249getHeightimpl(j10) : i1.h.m4186getYimpl(j11));
        }
        return c2.m4714SweepGradientShader9KIMszo(jOffset, this.f68946e, this.f68947f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return i1.h.m4182equalsimpl0(this.f68945d, p2Var.f68945d) && kotlin.jvm.internal.e0.areEqual(this.f68946e, p2Var.f68946e) && kotlin.jvm.internal.e0.areEqual(this.f68947f, p2Var.f68947f);
    }

    public int hashCode() {
        int iC = o2.c(i1.h.m4187hashCodeimpl(this.f68945d) * 31, 31, this.f68946e);
        List list = this.f68947f;
        return iC + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        long j10 = this.f68945d;
        if (i1.i.m4198isSpecifiedk4lQ0M(j10)) {
            str = "center=" + ((Object) i1.h.m4193toStringimpl(j10)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbO = e3.g.o("SweepGradient(", str, "colors=");
        sbO.append(this.f68946e);
        sbO.append(", stops=");
        return o2.p(sbO, this.f68947f, ')');
    }

    public p2(long j10, List list, List list2, kotlin.jvm.internal.u uVar) {
        this.f68945d = j10;
        this.f68946e = list;
        this.f68947f = list2;
    }
}
