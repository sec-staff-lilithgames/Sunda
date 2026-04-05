package me;

import com.google.android.exoplayer2.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f74474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74475b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74476c;

    /* renamed from: d, reason: collision with root package name */
    public final long f74477d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74478e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f74479f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74480g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f74481h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f74482i;

    /* renamed from: j, reason: collision with root package name */
    public final int f74483j;

    /* renamed from: k, reason: collision with root package name */
    public final w[] f74484k;

    public v(int i10, int i11, long j10, long j11, long j12, z0 z0Var, int i12, w[] wVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f74474a = i10;
        this.f74475b = i11;
        this.f74476c = j10;
        this.f74477d = j11;
        this.f74478e = j12;
        this.f74479f = z0Var;
        this.f74480g = i12;
        this.f74484k = wVarArr;
        this.f74483j = i13;
        this.f74481h = jArr;
        this.f74482i = jArr2;
    }

    public v copyWithFormat(z0 z0Var) {
        return new v(this.f74474a, this.f74475b, this.f74476c, this.f74477d, this.f74478e, z0Var, this.f74480g, this.f74484k, this.f74483j, this.f74481h, this.f74482i);
    }

    public w getSampleDescriptionEncryptionBox(int i10) {
        w[] wVarArr = this.f74484k;
        if (wVarArr == null) {
            return null;
        }
        return wVarArr[i10];
    }
}
