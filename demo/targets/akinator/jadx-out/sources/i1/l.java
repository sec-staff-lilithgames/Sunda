package i1;

import b0.e2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final a f59355j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final l f59356k = m.m4233RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, b.f59337b.m4146getZerokKHJgLs());

    /* renamed from: a, reason: collision with root package name */
    public final float f59357a;

    /* renamed from: b, reason: collision with root package name */
    public final float f59358b;

    /* renamed from: c, reason: collision with root package name */
    public final float f59359c;

    /* renamed from: d, reason: collision with root package name */
    public final float f59360d;

    /* renamed from: e, reason: collision with root package name */
    public final long f59361e;

    /* renamed from: f, reason: collision with root package name */
    public final long f59362f;

    /* renamed from: g, reason: collision with root package name */
    public final long f59363g;

    /* renamed from: h, reason: collision with root package name */
    public final long f59364h;

    /* renamed from: i, reason: collision with root package name */
    public l f59365i;

    public l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, u uVar) {
        this.f59357a = f10;
        this.f59358b = f11;
        this.f59359c = f12;
        this.f59360d = f13;
        this.f59361e = j10;
        this.f59362f = j11;
        this.f59363g = j12;
        this.f59364h = j13;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        float f14 = f11 + f12;
        return (f14 <= f13 || f14 == 0.0f) ? f10 : Math.min(f10, f13 / f14);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ l m4220copyMDFrsts$default(l lVar, float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lVar.f59357a;
        }
        if ((i10 & 2) != 0) {
            f11 = lVar.f59358b;
        }
        if ((i10 & 4) != 0) {
            f12 = lVar.f59359c;
        }
        if ((i10 & 8) != 0) {
            f13 = lVar.f59360d;
        }
        if ((i10 & 16) != 0) {
            j10 = lVar.f59361e;
        }
        if ((i10 & 32) != 0) {
            j11 = lVar.f59362f;
        }
        if ((i10 & 64) != 0) {
            j12 = lVar.f59363g;
        }
        if ((i10 & 128) != 0) {
            j13 = lVar.f59364h;
        }
        long j14 = j13;
        long j15 = j12;
        long j16 = j11;
        long j17 = j10;
        return lVar.m4226copyMDFrsts(f10, f11, f12, f13, j17, j16, j15, j14);
    }

    public static final l getZero() {
        return f59355j.getZero();
    }

    public final float component1() {
        return this.f59357a;
    }

    public final float component2() {
        return this.f59358b;
    }

    public final float component3() {
        return this.f59359c;
    }

    public final float component4() {
        return this.f59360d;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m4221component5kKHJgLs() {
        return this.f59361e;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m4222component6kKHJgLs() {
        return this.f59362f;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m4223component7kKHJgLs() {
        return this.f59363g;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m4224component8kKHJgLs() {
        return this.f59364h;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4225containsk4lQ0M(long j10) {
        float f10;
        float f11;
        float fM4185getXimpl;
        float fM4157getYimpl;
        float fM4156getXimpl;
        float fM4157getYimpl2;
        float fM4185getXimpl2 = h.m4185getXimpl(j10);
        float f12 = this.f59357a;
        if (fM4185getXimpl2 < f12) {
            return false;
        }
        float fM4185getXimpl3 = h.m4185getXimpl(j10);
        float f13 = this.f59359c;
        if (fM4185getXimpl3 >= f13) {
            return false;
        }
        float fM4186getYimpl = h.m4186getYimpl(j10);
        float f14 = this.f59358b;
        if (fM4186getYimpl < f14) {
            return false;
        }
        float fM4186getYimpl2 = h.m4186getYimpl(j10);
        float f15 = this.f59360d;
        if (fM4186getYimpl2 >= f15) {
            return false;
        }
        l lVar = this.f59365i;
        if (lVar == null) {
            long j11 = this.f59364h;
            float fM4157getYimpl3 = b.m4157getYimpl(j11);
            long j12 = this.f59361e;
            float fA = a(1.0f, fM4157getYimpl3, b.m4157getYimpl(j12), getHeight());
            float fM4156getXimpl2 = b.m4156getXimpl(j12);
            long j13 = this.f59362f;
            float fA2 = a(fA, fM4156getXimpl2, b.m4156getXimpl(j13), getWidth());
            float fM4157getYimpl4 = b.m4157getYimpl(j13);
            long j14 = this.f59363g;
            f11 = 1.0f;
            f10 = f12;
            float fA3 = a(a(fA2, fM4157getYimpl4, b.m4157getYimpl(j14), getHeight()), b.m4156getXimpl(j14), b.m4156getXimpl(j11), getWidth());
            lVar = new l(f10 * fA3, f14 * fA3, f13 * fA3, f15 * fA3, c.CornerRadius(b.m4156getXimpl(j12) * fA3, b.m4157getYimpl(j12) * fA3), c.CornerRadius(b.m4156getXimpl(j13) * fA3, b.m4157getYimpl(j13) * fA3), c.CornerRadius(b.m4156getXimpl(j14) * fA3, b.m4157getYimpl(j14) * fA3), c.CornerRadius(b.m4156getXimpl(j11) * fA3, b.m4157getYimpl(j11) * fA3), null);
            this.f59365i = lVar;
        } else {
            f10 = f12;
            f11 = 1.0f;
        }
        long j15 = lVar.f59364h;
        long j16 = lVar.f59363g;
        long j17 = lVar.f59362f;
        long j18 = lVar.f59361e;
        if (h.m4185getXimpl(j10) < b.m4156getXimpl(j18) + f10 && h.m4186getYimpl(j10) < b.m4157getYimpl(j18) + f14) {
            fM4185getXimpl = (h.m4185getXimpl(j10) - f10) - b.m4156getXimpl(j18);
            fM4157getYimpl = (h.m4186getYimpl(j10) - f14) - b.m4157getYimpl(j18);
            fM4156getXimpl = b.m4156getXimpl(j18);
            fM4157getYimpl2 = b.m4157getYimpl(j18);
        } else if (h.m4185getXimpl(j10) > f13 - b.m4156getXimpl(j17) && h.m4186getYimpl(j10) < b.m4157getYimpl(j17) + f14) {
            fM4185getXimpl = b.m4156getXimpl(j17) + (h.m4185getXimpl(j10) - f13);
            fM4157getYimpl = (h.m4186getYimpl(j10) - f14) - b.m4157getYimpl(j17);
            fM4156getXimpl = b.m4156getXimpl(j17);
            fM4157getYimpl2 = b.m4157getYimpl(j17);
        } else if (h.m4185getXimpl(j10) > f13 - b.m4156getXimpl(j16) && h.m4186getYimpl(j10) > f15 - b.m4157getYimpl(j16)) {
            fM4185getXimpl = b.m4156getXimpl(j16) + (h.m4185getXimpl(j10) - f13);
            fM4157getYimpl = b.m4157getYimpl(j16) + (h.m4186getYimpl(j10) - f15);
            fM4156getXimpl = b.m4156getXimpl(j16);
            fM4157getYimpl2 = b.m4157getYimpl(j16);
        } else {
            if (h.m4185getXimpl(j10) >= b.m4156getXimpl(j15) + f10 || h.m4186getYimpl(j10) <= f15 - b.m4157getYimpl(j15)) {
                return true;
            }
            fM4185getXimpl = (h.m4185getXimpl(j10) - f10) - b.m4156getXimpl(j15);
            fM4157getYimpl = b.m4157getYimpl(j15) + (h.m4186getYimpl(j10) - f15);
            fM4156getXimpl = b.m4156getXimpl(j15);
            fM4157getYimpl2 = b.m4157getYimpl(j15);
        }
        float f16 = fM4185getXimpl / fM4156getXimpl;
        float f17 = fM4157getYimpl / fM4157getYimpl2;
        return (f17 * f17) + (f16 * f16) <= f11;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final l m4226copyMDFrsts(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        return new l(f10, f11, f12, f13, j10, j11, j12, j13, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return e0.areEqual((Object) Float.valueOf(this.f59357a), (Object) Float.valueOf(lVar.f59357a)) && e0.areEqual((Object) Float.valueOf(this.f59358b), (Object) Float.valueOf(lVar.f59358b)) && e0.areEqual((Object) Float.valueOf(this.f59359c), (Object) Float.valueOf(lVar.f59359c)) && e0.areEqual((Object) Float.valueOf(this.f59360d), (Object) Float.valueOf(lVar.f59360d)) && b.m4155equalsimpl0(this.f59361e, lVar.f59361e) && b.m4155equalsimpl0(this.f59362f, lVar.f59362f) && b.m4155equalsimpl0(this.f59363g, lVar.f59363g) && b.m4155equalsimpl0(this.f59364h, lVar.f59364h);
    }

    public final float getBottom() {
        return this.f59360d;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4227getBottomLeftCornerRadiuskKHJgLs() {
        return this.f59364h;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4228getBottomRightCornerRadiuskKHJgLs() {
        return this.f59363g;
    }

    public final float getHeight() {
        return this.f59360d - this.f59358b;
    }

    public final float getLeft() {
        return this.f59357a;
    }

    public final float getRight() {
        return this.f59359c;
    }

    public final float getTop() {
        return this.f59358b;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4229getTopLeftCornerRadiuskKHJgLs() {
        return this.f59361e;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4230getTopRightCornerRadiuskKHJgLs() {
        return this.f59362f;
    }

    public final float getWidth() {
        return this.f59359c - this.f59357a;
    }

    public int hashCode() {
        return b.m4158hashCodeimpl(this.f59364h) + ((b.m4158hashCodeimpl(this.f59363g) + ((b.m4158hashCodeimpl(this.f59362f) + ((b.m4158hashCodeimpl(this.f59361e) + e2.b(this.f59360d, e2.b(this.f59359c, e2.b(this.f59358b, Float.hashCode(this.f59357a) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = d.toStringAsFixed(this.f59357a, 1) + ", " + d.toStringAsFixed(this.f59358b, 1) + ", " + d.toStringAsFixed(this.f59359c, 1) + ", " + d.toStringAsFixed(this.f59360d, 1);
        long j10 = this.f59361e;
        long j11 = this.f59362f;
        boolean zM4155equalsimpl0 = b.m4155equalsimpl0(j10, j11);
        long j12 = this.f59363g;
        long j13 = this.f59364h;
        if (!zM4155equalsimpl0 || !b.m4155equalsimpl0(j11, j12) || !b.m4155equalsimpl0(j12, j13)) {
            StringBuilder sbO = e3.g.o("RoundRect(rect=", str, ", topLeft=");
            sbO.append((Object) b.m4162toStringimpl(j10));
            sbO.append(", topRight=");
            sbO.append((Object) b.m4162toStringimpl(j11));
            sbO.append(", bottomRight=");
            sbO.append((Object) b.m4162toStringimpl(j12));
            sbO.append(", bottomLeft=");
            sbO.append((Object) b.m4162toStringimpl(j13));
            sbO.append(')');
            return sbO.toString();
        }
        if (b.m4156getXimpl(j10) == b.m4157getYimpl(j10)) {
            StringBuilder sbO2 = e3.g.o("RoundRect(rect=", str, ", radius=");
            sbO2.append(d.toStringAsFixed(b.m4156getXimpl(j10), 1));
            sbO2.append(')');
            return sbO2.toString();
        }
        StringBuilder sbO3 = e3.g.o("RoundRect(rect=", str, ", x=");
        sbO3.append(d.toStringAsFixed(b.m4156getXimpl(j10), 1));
        sbO3.append(", y=");
        sbO3.append(d.toStringAsFixed(b.m4157getYimpl(j10), 1));
        sbO3.append(')');
        return sbO3.toString();
    }

    public /* synthetic */ l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, u uVar) {
        this(f10, f11, f12, f13, (i10 & 16) != 0 ? b.f59337b.m4146getZerokKHJgLs() : j10, (i10 & 32) != 0 ? b.f59337b.m4146getZerokKHJgLs() : j11, (i10 & 64) != 0 ? b.f59337b.m4146getZerokKHJgLs() : j12, (i10 & 128) != 0 ? b.f59337b.m4146getZerokKHJgLs() : j13, null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final l getZero() {
            return l.f59356k;
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }
}
