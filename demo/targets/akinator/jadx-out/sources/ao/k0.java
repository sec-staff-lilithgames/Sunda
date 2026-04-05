package ao;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7718a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7720c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7721d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7722e;

    public k0(Object obj) {
        this(obj, -1L);
    }

    public k0 copyWithPeriodUid(Object obj) {
        if (this.f7718a.equals(obj)) {
            return this;
        }
        return new k0(obj, this.f7719b, this.f7720c, this.f7721d, this.f7722e);
    }

    public k0 copyWithWindowSequenceNumber(long j10) {
        if (this.f7721d == j10) {
            return this;
        }
        return new k0(this.f7718a, this.f7719b, this.f7720c, j10, this.f7722e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f7718a.equals(k0Var.f7718a) && this.f7719b == k0Var.f7719b && this.f7720c == k0Var.f7720c && this.f7721d == k0Var.f7721d && this.f7722e == k0Var.f7722e;
    }

    public int hashCode() {
        return ((((((((this.f7718a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f7719b) * 31) + this.f7720c) * 31) + ((int) this.f7721d)) * 31) + this.f7722e;
    }

    public boolean isAd() {
        return this.f7719b != -1;
    }

    public k0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public k0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public k0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public k0(Object obj, int i10, int i11, long j10, int i12) {
        this.f7718a = obj;
        this.f7719b = i10;
        this.f7720c = i11;
        this.f7721d = j10;
        this.f7722e = i12;
    }
}
