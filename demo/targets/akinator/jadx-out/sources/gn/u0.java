package gn;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0[] f58193a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58194b;

    public u0(t0... t0VarArr) {
        this(C.TIME_UNSET, t0VarArr);
    }

    public u0 copyWithAppendedEntries(t0... t0VarArr) {
        if (t0VarArr.length == 0) {
            return this;
        }
        return new u0(this.f58194b, (t0[]) io.bidmachine.media3.common.util.a1.nullSafeArrayConcatenation(this.f58193a, t0VarArr));
    }

    public u0 copyWithAppendedEntriesFrom(u0 u0Var) {
        return u0Var == null ? this : copyWithAppendedEntries(u0Var.f58193a);
    }

    public u0 copyWithPresentationTimeUs(long j10) {
        return this.f58194b == j10 ? this : new u0(j10, this.f58193a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (Arrays.equals(this.f58193a, u0Var.f58193a) && this.f58194b == u0Var.f58194b) {
                return true;
            }
        }
        return false;
    }

    public t0 get(int i10) {
        return this.f58193a[i10];
    }

    public int hashCode() {
        return rh.b0.hashCode(this.f58194b) + (Arrays.hashCode(this.f58193a) * 31);
    }

    public int length() {
        return this.f58193a.length;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f58193a));
        long j10 = this.f58194b;
        if (j10 == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public u0(long j10, t0... t0VarArr) {
        this.f58194b = j10;
        this.f58193a = t0VarArr;
    }

    public u0(List<? extends t0> list) {
        this((t0[]) list.toArray(new t0[0]));
    }

    public u0(long j10, List<? extends t0> list) {
        this(j10, (t0[]) list.toArray(new t0[0]));
    }
}
