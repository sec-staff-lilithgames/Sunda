package io.odeeo.internal.b;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.a0.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final t.a f62647a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62648b;

    /* renamed from: c, reason: collision with root package name */
    public final long f62649c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62650d;

    /* renamed from: e, reason: collision with root package name */
    public final long f62651e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62652f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62653g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f62654h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f62655i;

    public c0(t.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        io.odeeo.internal.q0.a.checkArgument(!z13 || z11);
        io.odeeo.internal.q0.a.checkArgument(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        io.odeeo.internal.q0.a.checkArgument(z14);
        this.f62647a = aVar;
        this.f62648b = j10;
        this.f62649c = j11;
        this.f62650d = j12;
        this.f62651e = j13;
        this.f62652f = z10;
        this.f62653g = z11;
        this.f62654h = z12;
        this.f62655i = z13;
    }

    public c0 copyWithRequestedContentPositionUs(long j10) {
        return j10 == this.f62649c ? this : new c0(this.f62647a, this.f62648b, j10, this.f62650d, this.f62651e, this.f62652f, this.f62653g, this.f62654h, this.f62655i);
    }

    public c0 copyWithStartPositionUs(long j10) {
        return j10 == this.f62648b ? this : new c0(this.f62647a, j10, this.f62649c, this.f62650d, this.f62651e, this.f62652f, this.f62653g, this.f62654h, this.f62655i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f62648b == c0Var.f62648b && this.f62649c == c0Var.f62649c && this.f62650d == c0Var.f62650d && this.f62651e == c0Var.f62651e && this.f62652f == c0Var.f62652f && this.f62653g == c0Var.f62653g && this.f62654h == c0Var.f62654h && this.f62655i == c0Var.f62655i && io.odeeo.internal.q0.g0.areEqual(this.f62647a, c0Var.f62647a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f62647a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f62648b)) * 31) + ((int) this.f62649c)) * 31) + ((int) this.f62650d)) * 31) + ((int) this.f62651e)) * 31) + (this.f62652f ? 1 : 0)) * 31) + (this.f62653g ? 1 : 0)) * 31) + (this.f62654h ? 1 : 0)) * 31) + (this.f62655i ? 1 : 0);
    }
}
