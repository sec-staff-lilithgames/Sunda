package i1;

import b0.e2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final a f59349e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final j f59350f = new j(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f59351a;

    /* renamed from: b, reason: collision with root package name */
    public final float f59352b;

    /* renamed from: c, reason: collision with root package name */
    public final float f59353c;

    /* renamed from: d, reason: collision with root package name */
    public final float f59354d;

    public j(float f10, float f11, float f12, float f13) {
        this.f59351a = f10;
        this.f59352b = f11;
        this.f59353c = f12;
        this.f59354d = f13;
    }

    public static /* synthetic */ j copy$default(j jVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = jVar.f59351a;
        }
        if ((i10 & 2) != 0) {
            f11 = jVar.f59352b;
        }
        if ((i10 & 4) != 0) {
            f12 = jVar.f59353c;
        }
        if ((i10 & 8) != 0) {
            f13 = jVar.f59354d;
        }
        return jVar.copy(f10, f11, f12, f13);
    }

    public final float component1() {
        return this.f59351a;
    }

    public final float component2() {
        return this.f59352b;
    }

    public final float component3() {
        return this.f59353c;
    }

    public final float component4() {
        return this.f59354d;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4205containsk4lQ0M(long j10) {
        return h.m4185getXimpl(j10) >= this.f59351a && h.m4185getXimpl(j10) < this.f59353c && h.m4186getYimpl(j10) >= this.f59352b && h.m4186getYimpl(j10) < this.f59354d;
    }

    public final j copy(float f10, float f11, float f12, float f13) {
        return new j(f10, f11, f12, f13);
    }

    public final j deflate(float f10) {
        return inflate(-f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return e0.areEqual((Object) Float.valueOf(this.f59351a), (Object) Float.valueOf(jVar.f59351a)) && e0.areEqual((Object) Float.valueOf(this.f59352b), (Object) Float.valueOf(jVar.f59352b)) && e0.areEqual((Object) Float.valueOf(this.f59353c), (Object) Float.valueOf(jVar.f59353c)) && e0.areEqual((Object) Float.valueOf(this.f59354d), (Object) Float.valueOf(jVar.f59354d));
    }

    public final float getBottom() {
        return this.f59354d;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m4206getBottomCenterF1C5BW0() {
        return i.Offset((getWidth() / 2.0f) + this.f59351a, this.f59354d);
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m4207getBottomLeftF1C5BW0() {
        return i.Offset(this.f59351a, this.f59354d);
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m4208getBottomRightF1C5BW0() {
        return i.Offset(this.f59353c, this.f59354d);
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m4209getCenterF1C5BW0() {
        return i.Offset((getWidth() / 2.0f) + this.f59351a, (getHeight() / 2.0f) + this.f59352b);
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m4210getCenterLeftF1C5BW0() {
        return i.Offset(this.f59351a, (getHeight() / 2.0f) + this.f59352b);
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m4211getCenterRightF1C5BW0() {
        return i.Offset(this.f59353c, (getHeight() / 2.0f) + this.f59352b);
    }

    public final float getHeight() {
        return this.f59354d - this.f59352b;
    }

    public final float getLeft() {
        return this.f59351a;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.f59353c;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4212getSizeNHjbRc() {
        return p.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.f59352b;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m4213getTopCenterF1C5BW0() {
        return i.Offset((getWidth() / 2.0f) + this.f59351a, this.f59352b);
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m4214getTopLeftF1C5BW0() {
        return i.Offset(this.f59351a, this.f59352b);
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m4215getTopRightF1C5BW0() {
        return i.Offset(this.f59353c, this.f59352b);
    }

    public final float getWidth() {
        return this.f59353c - this.f59351a;
    }

    public int hashCode() {
        return Float.hashCode(this.f59354d) + e2.b(this.f59353c, e2.b(this.f59352b, Float.hashCode(this.f59351a) * 31, 31), 31);
    }

    public final j inflate(float f10) {
        return new j(this.f59351a - f10, this.f59352b - f10, this.f59353c + f10, this.f59354d + f10);
    }

    public final j intersect(j other) {
        e0.checkNotNullParameter(other, "other");
        return new j(Math.max(this.f59351a, other.f59351a), Math.max(this.f59352b, other.f59352b), Math.min(this.f59353c, other.f59353c), Math.min(this.f59354d, other.f59354d));
    }

    public final boolean isEmpty() {
        return this.f59351a >= this.f59353c || this.f59352b >= this.f59354d;
    }

    public final boolean isFinite() {
        float f10 = this.f59351a;
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            return false;
        }
        float f11 = this.f59352b;
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            return false;
        }
        float f12 = this.f59353c;
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            return false;
        }
        float f13 = this.f59354d;
        return (Float.isInfinite(f13) || Float.isNaN(f13)) ? false : true;
    }

    public final boolean isInfinite() {
        return this.f59351a >= Float.POSITIVE_INFINITY || this.f59352b >= Float.POSITIVE_INFINITY || this.f59353c >= Float.POSITIVE_INFINITY || this.f59354d >= Float.POSITIVE_INFINITY;
    }

    public final boolean overlaps(j other) {
        e0.checkNotNullParameter(other, "other");
        return this.f59353c > other.f59351a && other.f59353c > this.f59351a && this.f59354d > other.f59352b && other.f59354d > this.f59352b;
    }

    public String toString() {
        return "Rect.fromLTRB(" + d.toStringAsFixed(this.f59351a, 1) + ", " + d.toStringAsFixed(this.f59352b, 1) + ", " + d.toStringAsFixed(this.f59353c, 1) + ", " + d.toStringAsFixed(this.f59354d, 1) + ')';
    }

    public final j translate(float f10, float f11) {
        return new j(this.f59351a + f10, this.f59352b + f11, this.f59353c + f10, this.f59354d + f11);
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final j m4216translatek4lQ0M(long j10) {
        return new j(h.m4185getXimpl(j10) + this.f59351a, h.m4186getYimpl(j10) + this.f59352b, h.m4185getXimpl(j10) + this.f59353c, h.m4186getYimpl(j10) + this.f59354d);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final j getZero() {
            return j.f59350f;
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4204getSizeNHjbRc$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public static /* synthetic */ void isFinite$annotations() {
    }

    public static /* synthetic */ void isInfinite$annotations() {
    }
}
