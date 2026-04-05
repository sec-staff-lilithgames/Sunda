package rp;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import ko.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f84545c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84546d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84547e;

    /* renamed from: a, reason: collision with root package name */
    public final u0 f84543a = new u0(0);

    /* renamed from: f, reason: collision with root package name */
    public long f84548f = C.TIME_UNSET;

    /* renamed from: g, reason: collision with root package name */
    public long f84549g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f84550h = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84544b = new io.bidmachine.media3.common.util.m0();

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long readScrValueFromPack(io.bidmachine.media3.common.util.m0 m0Var) {
        int position = m0Var.getPosition();
        if (m0Var.bytesLeft() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        m0Var.readBytes(bArr, 0, 9);
        m0Var.setPosition(position);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return C.TIME_UNSET;
    }

    public long getDurationUs() {
        return this.f84550h;
    }

    public u0 getScrTimestampAdjuster() {
        return this.f84543a;
    }

    public boolean isDurationReadFinished() {
        return this.f84545c;
    }

    public int readDuration(ko.a0 a0Var, v0 v0Var) throws IOException {
        boolean z10 = this.f84547e;
        io.bidmachine.media3.common.util.m0 m0Var = this.f84544b;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long length = a0Var.getLength();
            int iMin = (int) Math.min(20000L, length);
            long j11 = length - iMin;
            if (a0Var.getPosition() != j11) {
                v0Var.f71790a = j11;
                return 1;
            }
            m0Var.reset(iMin);
            a0Var.resetPeekPosition();
            a0Var.peekFully(m0Var.getData(), 0, iMin);
            int position = m0Var.getPosition();
            int iLimit = m0Var.limit() - 4;
            while (true) {
                if (iLimit < position) {
                    break;
                }
                if (a(iLimit, m0Var.getData()) == 442) {
                    m0Var.setPosition(iLimit + 4);
                    long scrValueFromPack = readScrValueFromPack(m0Var);
                    if (scrValueFromPack != C.TIME_UNSET) {
                        j10 = scrValueFromPack;
                        break;
                    }
                }
                iLimit--;
            }
            this.f84549g = j10;
            this.f84547e = true;
            return 0;
        }
        if (this.f84549g == C.TIME_UNSET) {
            m0Var.reset(a1.f60681c);
            this.f84545c = true;
            a0Var.resetPeekPosition();
            return 0;
        }
        if (this.f84546d) {
            long j12 = this.f84548f;
            if (j12 == C.TIME_UNSET) {
                m0Var.reset(a1.f60681c);
                this.f84545c = true;
                a0Var.resetPeekPosition();
                return 0;
            }
            u0 u0Var = this.f84543a;
            this.f84550h = u0Var.adjustTsTimestampGreaterThanPreviousTimestamp(this.f84549g) - u0Var.adjustTsTimestamp(j12);
            m0Var.reset(a1.f60681c);
            this.f84545c = true;
            a0Var.resetPeekPosition();
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, a0Var.getLength());
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
            if (position2 >= iLimit2 - 3) {
                break;
            }
            if (a(position2, m0Var.getData()) == 442) {
                m0Var.setPosition(position2 + 4);
                long scrValueFromPack2 = readScrValueFromPack(m0Var);
                if (scrValueFromPack2 != C.TIME_UNSET) {
                    j10 = scrValueFromPack2;
                    break;
                }
            }
            position2++;
        }
        this.f84548f = j10;
        this.f84546d = true;
        return 0;
    }
}
