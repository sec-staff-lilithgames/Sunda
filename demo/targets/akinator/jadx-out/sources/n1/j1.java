package n1;

import androidx.core.app.NotificationCompat;
import b0.e2;
import com.applovin.shadow.okio.Segment;
import j1.l2;
import j1.n2;
import j1.o2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f75450b;

    /* renamed from: c, reason: collision with root package name */
    public final List f75451c;

    /* renamed from: e, reason: collision with root package name */
    public final int f75452e;

    /* renamed from: f, reason: collision with root package name */
    public final j1.b0 f75453f;

    /* renamed from: g, reason: collision with root package name */
    public final float f75454g;

    /* renamed from: h, reason: collision with root package name */
    public final j1.b0 f75455h;

    /* renamed from: i, reason: collision with root package name */
    public final float f75456i;

    /* renamed from: j, reason: collision with root package name */
    public final float f75457j;

    /* renamed from: k, reason: collision with root package name */
    public final int f75458k;

    /* renamed from: l, reason: collision with root package name */
    public final int f75459l;

    /* renamed from: m, reason: collision with root package name */
    public final float f75460m;

    /* renamed from: n, reason: collision with root package name */
    public final float f75461n;

    /* renamed from: o, reason: collision with root package name */
    public final float f75462o;

    /* renamed from: p, reason: collision with root package name */
    public final float f75463p;

    public /* synthetic */ j1(String str, List list, int i10, j1.b0 b0Var, float f10, j1.b0 b0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, int i13, kotlin.jvm.internal.u uVar) {
        this((i13 & 1) != 0 ? "" : str, list, i10, (i13 & 8) != 0 ? null : b0Var, (i13 & 16) != 0 ? 1.0f : f10, (i13 & 32) != 0 ? null : b0Var2, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? 0.0f : f12, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? w0.getDefaultStrokeLineCap() : i11, (i13 & 512) != 0 ? w0.getDefaultStrokeLineJoin() : i12, (i13 & 1024) != 0 ? 4.0f : f13, (i13 & 2048) != 0 ? 0.0f : f14, (i13 & 4096) != 0 ? 1.0f : f15, (i13 & Segment.SIZE) != 0 ? 0.0f : f16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kotlin.jvm.internal.e0.areEqual(kotlin.jvm.internal.c1.getOrCreateKotlinClass(j1.class), kotlin.jvm.internal.c1.getOrCreateKotlinClass(obj.getClass()))) {
            j1 j1Var = (j1) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f75450b, j1Var.f75450b) && kotlin.jvm.internal.e0.areEqual(this.f75453f, j1Var.f75453f) && this.f75454g == j1Var.f75454g && kotlin.jvm.internal.e0.areEqual(this.f75455h, j1Var.f75455h) && this.f75456i == j1Var.f75456i && this.f75457j == j1Var.f75457j && l2.m4844equalsimpl0(this.f75458k, j1Var.f75458k) && n2.m4881equalsimpl0(this.f75459l, j1Var.f75459l) && this.f75460m == j1Var.f75460m && this.f75461n == j1Var.f75461n && this.f75462o == j1Var.f75462o && this.f75463p == j1Var.f75463p && j1.o1.m4898equalsimpl0(this.f75452e, j1Var.f75452e) && kotlin.jvm.internal.e0.areEqual(this.f75451c, j1Var.f75451c);
        }
        return false;
    }

    public final j1.b0 getFill() {
        return this.f75453f;
    }

    public final float getFillAlpha() {
        return this.f75454g;
    }

    public final String getName() {
        return this.f75450b;
    }

    public final List<g> getPathData() {
        return this.f75451c;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m5726getPathFillTypeRgk1Os() {
        return this.f75452e;
    }

    public final j1.b0 getStroke() {
        return this.f75455h;
    }

    public final float getStrokeAlpha() {
        return this.f75456i;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m5727getStrokeLineCapKaPHkGw() {
        return this.f75458k;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m5728getStrokeLineJoinLxFBmk8() {
        return this.f75459l;
    }

    public final float getStrokeLineMiter() {
        return this.f75460m;
    }

    public final float getStrokeLineWidth() {
        return this.f75457j;
    }

    public final float getTrimPathEnd() {
        return this.f75462o;
    }

    public final float getTrimPathOffset() {
        return this.f75463p;
    }

    public final float getTrimPathStart() {
        return this.f75461n;
    }

    public int hashCode() {
        int iC = o2.c(this.f75450b.hashCode() * 31, 31, this.f75451c);
        j1.b0 b0Var = this.f75453f;
        int iB = e2.b(this.f75454g, (iC + (b0Var != null ? b0Var.hashCode() : 0)) * 31, 31);
        j1.b0 b0Var2 = this.f75455h;
        return j1.o1.m4899hashCodeimpl(this.f75452e) + e2.b(this.f75463p, e2.b(this.f75462o, e2.b(this.f75461n, e2.b(this.f75460m, (n2.m4882hashCodeimpl(this.f75459l) + ((l2.m4845hashCodeimpl(this.f75458k) + e2.b(this.f75457j, e2.b(this.f75456i, (iB + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    public j1(String str, List list, int i10, j1.b0 b0Var, float f10, j1.b0 b0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, kotlin.jvm.internal.u uVar) {
        super(null);
        this.f75450b = str;
        this.f75451c = list;
        this.f75452e = i10;
        this.f75453f = b0Var;
        this.f75454g = f10;
        this.f75455h = b0Var2;
        this.f75456i = f11;
        this.f75457j = f12;
        this.f75458k = i11;
        this.f75459l = i12;
        this.f75460m = f13;
        this.f75461n = f14;
        this.f75462o = f15;
        this.f75463p = f16;
    }
}
