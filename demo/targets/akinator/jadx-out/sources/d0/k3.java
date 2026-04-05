package d0;

import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k3 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f51464g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final k3 f51465h;

    /* renamed from: i, reason: collision with root package name */
    public static final k3 f51466i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f51467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f51468b;

    /* renamed from: c, reason: collision with root package name */
    public final float f51469c;

    /* renamed from: d, reason: collision with root package name */
    public final float f51470d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f51471e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f51472f;

    static {
        k3 k3Var = new k3(0L, 0.0f, 0.0f, false, false, 31, (kotlin.jvm.internal.u) null);
        f51465h = k3Var;
        f51466i = new k3(true, k3Var.f51468b, k3Var.f51469c, k3Var.f51470d, k3Var.f51471e, k3Var.f51472f, (kotlin.jvm.internal.u) null);
    }

    public k3(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12, kotlin.jvm.internal.u uVar) {
        this.f51467a = z10;
        this.f51468b = j10;
        this.f51469c = f10;
        this.f51470d = f11;
        this.f51471e = z11;
        this.f51472f = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return this.f51467a == k3Var.f51467a && s2.o.m6908equalsimpl0(this.f51468b, k3Var.f51468b) && s2.i.m6822equalsimpl0(this.f51469c, k3Var.f51469c) && s2.i.m6822equalsimpl0(this.f51470d, k3Var.f51470d) && this.f51471e == k3Var.f51471e && this.f51472f == k3Var.f51472f;
    }

    public final boolean getClippingEnabled$foundation_release() {
        return this.f51471e;
    }

    /* renamed from: getCornerRadius-D9Ej5fM$foundation_release, reason: not valid java name */
    public final float m3716getCornerRadiusD9Ej5fM$foundation_release() {
        return this.f51469c;
    }

    /* renamed from: getElevation-D9Ej5fM$foundation_release, reason: not valid java name */
    public final float m3717getElevationD9Ej5fM$foundation_release() {
        return this.f51470d;
    }

    public final boolean getFishEyeEnabled$foundation_release() {
        return this.f51472f;
    }

    /* renamed from: getSize-MYxV2XQ$foundation_release, reason: not valid java name */
    public final long m3718getSizeMYxV2XQ$foundation_release() {
        return this.f51468b;
    }

    public final boolean getUseTextDefault$foundation_release() {
        return this.f51467a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f51472f) + com.google.android.gms.internal.play_billing.a.c((s2.i.m6823hashCodeimpl(this.f51470d) + ((s2.i.m6823hashCodeimpl(this.f51469c) + ((s2.o.m6913hashCodeimpl(this.f51468b) + (Boolean.hashCode(this.f51467a) * 31)) * 31)) * 31)) * 31, 31, this.f51471e);
    }

    public final boolean isSupported() {
        return a.isStyleSupported$foundation_release$default(f51464g, this, 0, 2, null);
    }

    public String toString() {
        if (this.f51467a) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder sb2 = new StringBuilder("MagnifierStyle(size=");
        sb2.append((Object) s2.o.m6918toStringimpl(this.f51468b));
        sb2.append(", cornerRadius=");
        sb2.append((Object) s2.i.m6828toStringimpl(this.f51469c));
        sb2.append(", elevation=");
        sb2.append((Object) s2.i.m6828toStringimpl(this.f51470d));
        sb2.append(", clippingEnabled=");
        sb2.append(this.f51471e);
        sb2.append(", fishEyeEnabled=");
        return a.b.p(sb2, this.f51472f, ')');
    }

    public /* synthetic */ k3(long j10, float f10, float f11, boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s2.o.f85348b.m6897getUnspecifiedMYxV2XQ() : j10, (i10 & 2) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f10, (i10 & 4) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f11, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, null);
    }

    public k3(long j10, float f10, float f11, boolean z10, boolean z11, kotlin.jvm.internal.u uVar) {
        this(false, j10, f10, f11, z10, z11, (kotlin.jvm.internal.u) null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(a aVar, k3 k3Var, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = Build.VERSION.SDK_INT;
            }
            return aVar.isStyleSupported$foundation_release(k3Var, i10);
        }

        public final k3 getDefault() {
            return k3.f51465h;
        }

        public final k3 getTextDefault() {
            return k3.f51466i;
        }

        public final boolean isStyleSupported$foundation_release(k3 style, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
            if (y2.isPlatformMagnifierSupported(i10) && !style.getFishEyeEnabled$foundation_release()) {
                return style.getUseTextDefault$foundation_release() || kotlin.jvm.internal.e0.areEqual(style, getDefault()) || i10 >= 29;
            }
            return false;
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getTextDefault$annotations() {
        }
    }
}
