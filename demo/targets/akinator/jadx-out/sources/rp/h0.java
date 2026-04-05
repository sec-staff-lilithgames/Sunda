package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import ko.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f84656a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84659d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84660e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84661f;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f84657b = new u0(0);

    /* renamed from: g, reason: collision with root package name */
    public long f84662g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f84663h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f84664i = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84658c = new io.bidmachine.media3.common.util.m0();

    public h0(int i10) {
        this.f84656a = i10;
    }

    public final void a(ko.a0 a0Var) {
        this.f84658c.reset(a1.f60681c);
        this.f84659d = true;
        a0Var.resetPeekPosition();
    }

    public long getDurationUs() {
        return this.f84664i;
    }

    public u0 getPcrTimestampAdjuster() {
        return this.f84657b;
    }

    public boolean isDurationReadFinished() {
        return this.f84659d;
    }

    public int readDuration(ko.a0 a0Var, v0 v0Var, int i10) throws IOException {
        if (i10 <= 0) {
            a(a0Var);
            return 0;
        }
        boolean z10 = this.f84661f;
        int i11 = this.f84656a;
        io.bidmachine.media3.common.util.m0 m0Var = this.f84658c;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long length = a0Var.getLength();
            int iMin = (int) Math.min(i11, length);
            long j11 = length - iMin;
            if (a0Var.getPosition() != j11) {
                v0Var.f71790a = j11;
                return 1;
            }
            m0Var.reset(iMin);
            a0Var.resetPeekPosition();
            a0Var.peekFully(m0Var.getData(), 0, iMin);
            int position = m0Var.getPosition();
            int iLimit = m0Var.limit();
            int i12 = iLimit - 188;
            while (true) {
                if (i12 < position) {
                    break;
                }
                if (o0.isStartOfTsPacket(m0Var.getData(), position, iLimit, i12)) {
                    long pcrFromPacket = o0.readPcrFromPacket(m0Var, i12, i10);
                    if (pcrFromPacket != C.TIME_UNSET) {
                        j10 = pcrFromPacket;
                        break;
                    }
                }
                i12--;
            }
            this.f84663h = j10;
            this.f84661f = true;
            return 0;
        }
        if (this.f84663h == C.TIME_UNSET) {
            a(a0Var);
            return 0;
        }
        if (this.f84660e) {
            long j12 = this.f84662g;
            if (j12 == C.TIME_UNSET) {
                a(a0Var);
                return 0;
            }
            u0 u0Var = this.f84657b;
            this.f84664i = u0Var.adjustTsTimestampGreaterThanPreviousTimestamp(this.f84663h) - u0Var.adjustTsTimestamp(j12);
            a(a0Var);
            return 0;
        }
        int iMin2 = (int) Math.min(i11, a0Var.getLength());
        long j13 = 0;
        if (a0Var.getPosition() != j13) {
            v0Var.f71790a = j13;
            return 1;
        }
        m0Var.reset(iMin2);
        a0Var.resetPeekPosition();
        a0Var.peekFully(m0Var.getData(), 0, iMin2);
        int position2 = m0Var.getPosition();
        int iLimit2 = m0Var.limit();
        while (true) {
            if (position2 >= iLimit2) {
                break;
            }
            if (m0Var.getData()[position2] == 71) {
                long pcrFromPacket2 = o0.readPcrFromPacket(m0Var, position2, i10);
                if (pcrFromPacket2 != C.TIME_UNSET) {
                    j10 = pcrFromPacket2;
                    break;
                }
            }
            position2++;
        }
        this.f84662g = j10;
        this.f84660e = true;
        return 0;
    }
}
