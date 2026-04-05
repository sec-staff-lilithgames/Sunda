package vn;

import io.bidmachine.media3.common.DrmInitData;
import vn.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final String f89417b;

    /* renamed from: c, reason: collision with root package name */
    public final f.e f89418c;

    /* renamed from: e, reason: collision with root package name */
    public final long f89419e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89420f;

    /* renamed from: g, reason: collision with root package name */
    public final long f89421g;

    /* renamed from: h, reason: collision with root package name */
    public final DrmInitData f89422h;

    /* renamed from: i, reason: collision with root package name */
    public final String f89423i;

    /* renamed from: j, reason: collision with root package name */
    public final String f89424j;

    /* renamed from: k, reason: collision with root package name */
    public final long f89425k;

    /* renamed from: l, reason: collision with root package name */
    public final long f89426l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f89427m;

    public g(String str, f.e eVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
        this.f89417b = str;
        this.f89418c = eVar;
        this.f89419e = j10;
        this.f89420f = i10;
        this.f89421g = j11;
        this.f89422h = drmInitData;
        this.f89423i = str2;
        this.f89424j = str3;
        this.f89425k = j12;
        this.f89426l = j13;
        this.f89427m = z10;
    }

    @Override // java.lang.Comparable
    public int compareTo(Long l9) {
        long jLongValue = l9.longValue();
        long j10 = this.f89421g;
        if (j10 > jLongValue) {
            return 1;
        }
        return j10 < l9.longValue() ? -1 : 0;
    }
}
