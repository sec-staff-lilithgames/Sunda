package j1;

import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final List f68851d;

    /* renamed from: e, reason: collision with root package name */
    public final List f68852e;

    /* renamed from: f, reason: collision with root package name */
    public final long f68853f;

    /* renamed from: g, reason: collision with root package name */
    public final long f68854g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68855h;

    public /* synthetic */ c1(List list, List list2, long j10, long j11, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, j11, (i11 & 16) != 0 ? r2.f68961b.m4915getClamp3opZhB0() : i10, null);
    }

    @Override // j1.b2
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4695createShaderuvyYCjk(long j10) {
        long j11 = this.f68853f;
        float fM4252getWidthimpl = i1.h.m4185getXimpl(j11) == Float.POSITIVE_INFINITY ? i1.o.m4252getWidthimpl(j10) : i1.h.m4185getXimpl(j11);
        float fM4249getHeightimpl = i1.h.m4186getYimpl(j11) == Float.POSITIVE_INFINITY ? i1.o.m4249getHeightimpl(j10) : i1.h.m4186getYimpl(j11);
        long j12 = this.f68854g;
        return c2.m4710LinearGradientShaderVjE6UOU(i1.i.Offset(fM4252getWidthimpl, fM4249getHeightimpl), i1.i.Offset(i1.h.m4185getXimpl(j12) == Float.POSITIVE_INFINITY ? i1.o.m4252getWidthimpl(j10) : i1.h.m4185getXimpl(j12), i1.h.m4186getYimpl(j12) == Float.POSITIVE_INFINITY ? i1.o.m4249getHeightimpl(j10) : i1.h.m4186getYimpl(j12)), this.f68851d, this.f68852e, this.f68855h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f68851d, c1Var.f68851d) && kotlin.jvm.internal.e0.areEqual(this.f68852e, c1Var.f68852e) && i1.h.m4182equalsimpl0(this.f68853f, c1Var.f68853f) && i1.h.m4182equalsimpl0(this.f68854g, c1Var.f68854g) && r2.m4936equalsimpl0(this.f68855h, c1Var.f68855h);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // j1.b0
    /* renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo4672getIntrinsicSizeNHjbRc() {
        /*
            r8 = this;
            long r0 = r8.f68853f
            float r2 = i1.h.m4185getXimpl(r0)
            boolean r3 = java.lang.Float.isInfinite(r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            long r5 = r8.f68854g
            if (r3 != 0) goto L34
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L34
            float r2 = i1.h.m4185getXimpl(r5)
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L34
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L34
            float r2 = i1.h.m4185getXimpl(r0)
            float r3 = i1.h.m4185getXimpl(r5)
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            goto L35
        L34:
            r2 = r4
        L35:
            float r3 = i1.h.m4186getYimpl(r0)
            boolean r7 = java.lang.Float.isInfinite(r3)
            if (r7 != 0) goto L62
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L62
            float r3 = i1.h.m4186getYimpl(r5)
            boolean r7 = java.lang.Float.isInfinite(r3)
            if (r7 != 0) goto L62
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L62
            float r0 = i1.h.m4186getYimpl(r0)
            float r1 = i1.h.m4186getYimpl(r5)
            float r0 = r0 - r1
            float r4 = java.lang.Math.abs(r0)
        L62:
            long r0 = i1.p.Size(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c1.mo4672getIntrinsicSizeNHjbRc():long");
    }

    public int hashCode() {
        int iHashCode = this.f68851d.hashCode() * 31;
        List list = this.f68852e;
        return r2.m4937hashCodeimpl(this.f68855h) + ((i1.h.m4187hashCodeimpl(this.f68854g) + ((i1.h.m4187hashCodeimpl(this.f68853f) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str;
        long j10 = this.f68853f;
        String str2 = "";
        if (i1.i.m4196isFinitek4lQ0M(j10)) {
            str = "start=" + ((Object) i1.h.m4193toStringimpl(j10)) + ", ";
        } else {
            str = "";
        }
        long j11 = this.f68854g;
        if (i1.i.m4196isFinitek4lQ0M(j11)) {
            str2 = "end=" + ((Object) i1.h.m4193toStringimpl(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f68851d + ", stops=" + this.f68852e + ", " + str + str2 + "tileMode=" + ((Object) r2.m4938toStringimpl(this.f68855h)) + ')';
    }

    public c1(List list, List list2, long j10, long j11, int i10, kotlin.jvm.internal.u uVar) {
        this.f68851d = list;
        this.f68852e = list2;
        this.f68853f = j10;
        this.f68854g = j11;
        this.f68855h = i10;
    }
}
