package io.bidmachine.media3.exoplayer;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final ao.k0 f60880a;

    /* renamed from: b, reason: collision with root package name */
    public final long f60881b;

    /* renamed from: c, reason: collision with root package name */
    public final long f60882c;

    /* renamed from: d, reason: collision with root package name */
    public final long f60883d;

    /* renamed from: e, reason: collision with root package name */
    public final long f60884e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f60885f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f60886g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f60887h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f60888i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f60889j;

    public a1(ao.k0 k0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        io.bidmachine.media3.common.util.a.checkArgument(!z14 || z12);
        io.bidmachine.media3.common.util.a.checkArgument(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        io.bidmachine.media3.common.util.a.checkArgument(z15);
        this.f60880a = k0Var;
        this.f60881b = j10;
        this.f60882c = j11;
        this.f60883d = j12;
        this.f60884e = j13;
        this.f60885f = z10;
        this.f60886g = z11;
        this.f60887h = z12;
        this.f60888i = z13;
        this.f60889j = z14;
    }

    public a1 copyWithRequestedContentPositionUs(long j10) {
        if (j10 == this.f60882c) {
            return this;
        }
        return new a1(this.f60880a, this.f60881b, j10, this.f60883d, this.f60884e, this.f60885f, this.f60886g, this.f60887h, this.f60888i, this.f60889j);
    }

    public a1 copyWithStartPositionUs(long j10) {
        if (j10 == this.f60881b) {
            return this;
        }
        return new a1(this.f60880a, j10, this.f60882c, this.f60883d, this.f60884e, this.f60885f, this.f60886g, this.f60887h, this.f60888i, this.f60889j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f60881b == a1Var.f60881b && this.f60882c == a1Var.f60882c && this.f60883d == a1Var.f60883d && this.f60884e == a1Var.f60884e && this.f60885f == a1Var.f60885f && this.f60886g == a1Var.f60886g && this.f60887h == a1Var.f60887h && this.f60888i == a1Var.f60888i && this.f60889j == a1Var.f60889j && Objects.equals(this.f60880a, a1Var.f60880a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f60880a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f60881b)) * 31) + ((int) this.f60882c)) * 31) + ((int) this.f60883d)) * 31) + ((int) this.f60884e)) * 31) + (this.f60885f ? 1 : 0)) * 31) + (this.f60886g ? 1 : 0)) * 31) + (this.f60887h ? 1 : 0)) * 31) + (this.f60888i ? 1 : 0)) * 31) + (this.f60889j ? 1 : 0);
    }
}
