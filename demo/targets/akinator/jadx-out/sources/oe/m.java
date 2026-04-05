package oe;

import com.google.android.exoplayer2.util.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f79162a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f79163b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f79164c;

    /* renamed from: d, reason: collision with root package name */
    public int f79165d;

    /* renamed from: e, reason: collision with root package name */
    public int f79166e;

    /* renamed from: f, reason: collision with root package name */
    public int f79167f;

    /* renamed from: g, reason: collision with root package name */
    public int f79168g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f79169h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79170i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f79171j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79172k;

    /* renamed from: l, reason: collision with root package name */
    public int f79173l;

    /* renamed from: m, reason: collision with root package name */
    public int f79174m;

    /* renamed from: n, reason: collision with root package name */
    public int f79175n;

    /* renamed from: o, reason: collision with root package name */
    public int f79176o;

    /* renamed from: p, reason: collision with root package name */
    public int f79177p;

    public void clear() {
        this.f79163b = false;
        this.f79162a = false;
    }

    public boolean isISlice() {
        if (!this.f79163b) {
            return false;
        }
        int i10 = this.f79166e;
        return i10 == 7 || i10 == 2;
    }

    public void setAll(o0 o0Var, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
        this.f79164c = o0Var;
        this.f79165d = i10;
        this.f79166e = i11;
        this.f79167f = i12;
        this.f79168g = i13;
        this.f79169h = z10;
        this.f79170i = z11;
        this.f79171j = z12;
        this.f79172k = z13;
        this.f79173l = i14;
        this.f79174m = i15;
        this.f79175n = i16;
        this.f79176o = i17;
        this.f79177p = i18;
        this.f79162a = true;
        this.f79163b = true;
    }

    public void setSliceType(int i10) {
        this.f79166e = i10;
        this.f79163b = true;
    }
}
