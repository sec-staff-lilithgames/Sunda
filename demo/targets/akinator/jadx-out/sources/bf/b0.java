package bf;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9195c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9196d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9197e;

    public b0(Object obj) {
        this(obj, -1L);
    }

    public b0 copyWithPeriodUid(Object obj) {
        if (this.f9193a.equals(obj)) {
            return this;
        }
        return new b0(obj, this.f9194b, this.f9195c, this.f9196d, this.f9197e);
    }

    public b0 copyWithWindowSequenceNumber(long j10) {
        if (this.f9196d == j10) {
            return this;
        }
        return new b0(this.f9193a, this.f9194b, this.f9195c, j10, this.f9197e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f9193a.equals(b0Var.f9193a) && this.f9194b == b0Var.f9194b && this.f9195c == b0Var.f9195c && this.f9196d == b0Var.f9196d && this.f9197e == b0Var.f9197e;
    }

    public int hashCode() {
        return ((((((((this.f9193a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f9194b) * 31) + this.f9195c) * 31) + ((int) this.f9196d)) * 31) + this.f9197e;
    }

    public boolean isAd() {
        return this.f9194b != -1;
    }

    public b0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public b0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public b0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public b0(b0 b0Var) {
        this.f9193a = b0Var.f9193a;
        this.f9194b = b0Var.f9194b;
        this.f9195c = b0Var.f9195c;
        this.f9196d = b0Var.f9196d;
        this.f9197e = b0Var.f9197e;
    }

    public b0(Object obj, int i10, int i11, long j10, int i12) {
        this.f9193a = obj;
        this.f9194b = i10;
        this.f9195c = i11;
        this.f9196d = j10;
        this.f9197e = i12;
    }
}
