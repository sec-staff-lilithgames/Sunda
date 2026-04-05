package io.bidmachine.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f61589a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61590b;

    /* renamed from: c, reason: collision with root package name */
    public final long f61591c;

    public w0(v0 v0Var) {
        this.f61589a = v0Var.f61573a;
        this.f61590b = v0Var.f61574b;
        this.f61591c = v0Var.f61575c;
    }

    public v0 buildUpon() {
        v0 v0Var = new v0();
        v0Var.f61573a = this.f61589a;
        v0Var.f61574b = this.f61590b;
        v0Var.f61575c = this.f61591c;
        return v0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f61589a == w0Var.f61589a && this.f61590b == w0Var.f61590b && this.f61591c == w0Var.f61591c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f61589a), Float.valueOf(this.f61590b), Long.valueOf(this.f61591c));
    }

    public boolean rebufferedSince(long j10) {
        long j11 = this.f61591c;
        return (j11 == C.TIME_UNSET || j10 == C.TIME_UNSET || j11 < j10) ? false : true;
    }
}
