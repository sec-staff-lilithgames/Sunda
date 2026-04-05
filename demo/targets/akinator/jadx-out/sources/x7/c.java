package x7;

import android.graphics.PointF;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f91759a;

    /* renamed from: b, reason: collision with root package name */
    public String f91760b;

    /* renamed from: c, reason: collision with root package name */
    public float f91761c;

    /* renamed from: d, reason: collision with root package name */
    public b f91762d;

    /* renamed from: e, reason: collision with root package name */
    public int f91763e;

    /* renamed from: f, reason: collision with root package name */
    public float f91764f;

    /* renamed from: g, reason: collision with root package name */
    public float f91765g;

    /* renamed from: h, reason: collision with root package name */
    public int f91766h;

    /* renamed from: i, reason: collision with root package name */
    public int f91767i;

    /* renamed from: j, reason: collision with root package name */
    public float f91768j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f91769k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f91770l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f91771m;

    public c(String str, String str2, float f10, b bVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        set(str, str2, f10, bVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public int hashCode() {
        int iOrdinal = ((this.f91762d.ordinal() + (((int) (o2.e(this.f91759a.hashCode() * 31, 31, this.f91760b) + this.f91761c)) * 31)) * 31) + this.f91763e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f91764f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f91766h;
    }

    public void set(String str, String str2, float f10, b bVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f91759a = str;
        this.f91760b = str2;
        this.f91761c = f10;
        this.f91762d = bVar;
        this.f91763e = i10;
        this.f91764f = f11;
        this.f91765g = f12;
        this.f91766h = i11;
        this.f91767i = i12;
        this.f91768j = f13;
        this.f91769k = z10;
        this.f91770l = pointF;
        this.f91771m = pointF2;
    }

    public c() {
    }
}
