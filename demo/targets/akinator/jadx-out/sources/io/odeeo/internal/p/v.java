package io.odeeo.internal.p;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.g0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public boolean f65547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65548d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65549e;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.e0 f65545a = new io.odeeo.internal.q0.e0(0);

    /* renamed from: f, reason: collision with root package name */
    public long f65550f = C.TIME_UNSET;

    /* renamed from: g, reason: collision with root package name */
    public long f65551g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f65552h = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65546b = new io.odeeo.internal.q0.x();

    public static long readScrValueFromPack(io.odeeo.internal.q0.x xVar) {
        int position = xVar.getPosition();
        if (xVar.bytesLeft() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        xVar.readBytes(bArr, 0, 9);
        xVar.setPosition(position);
        return !a(bArr) ? C.TIME_UNSET : b(bArr);
    }

    public final int a(io.odeeo.internal.g.i iVar) {
        this.f65546b.reset(g0.f65866f);
        this.f65547c = true;
        iVar.resetPeekPosition();
        return 0;
    }

    public final int b(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        long length = iVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - iMin;
        if (iVar.getPosition() != j10) {
            uVar.f64171a = j10;
            return 1;
        }
        this.f65546b.reset(iMin);
        iVar.resetPeekPosition();
        iVar.peekFully(this.f65546b.getData(), 0, iMin);
        this.f65551g = b(this.f65546b);
        this.f65549e = true;
        return 0;
    }

    public long getDurationUs() {
        return this.f65552h;
    }

    public io.odeeo.internal.q0.e0 getScrTimestampAdjuster() {
        return this.f65545a;
    }

    public boolean isDurationReadFinished() {
        return this.f65547c;
    }

    public int readDuration(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        if (!this.f65549e) {
            return b(iVar, uVar);
        }
        if (this.f65551g == C.TIME_UNSET) {
            return a(iVar);
        }
        if (!this.f65548d) {
            return a(iVar, uVar);
        }
        long j10 = this.f65550f;
        if (j10 == C.TIME_UNSET) {
            return a(iVar);
        }
        long jAdjustTsTimestamp = this.f65545a.adjustTsTimestamp(this.f65551g) - this.f65545a.adjustTsTimestamp(j10);
        this.f65552h = jAdjustTsTimestamp;
        if (jAdjustTsTimestamp < 0) {
            io.odeeo.internal.q0.p.w("PsDurationReader", "Invalid duration: " + this.f65552h + ". Using TIME_UNSET instead.");
            this.f65552h = C.TIME_UNSET;
        }
        return a(iVar);
    }

    public final int a(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        int iMin = (int) Math.min(20000L, iVar.getLength());
        long j10 = 0;
        if (iVar.getPosition() != j10) {
            uVar.f64171a = j10;
            return 1;
        }
        this.f65546b.reset(iMin);
        iVar.resetPeekPosition();
        iVar.peekFully(this.f65546b.getData(), 0, iMin);
        this.f65550f = a(this.f65546b);
        this.f65548d = true;
        return 0;
    }

    public final long b(io.odeeo.internal.q0.x xVar) {
        int position = xVar.getPosition();
        for (int iLimit = xVar.limit() - 4; iLimit >= position; iLimit--) {
            if (a(xVar.getData(), iLimit) == 442) {
                xVar.setPosition(iLimit + 4);
                long scrValueFromPack = readScrValueFromPack(xVar);
                if (scrValueFromPack != C.TIME_UNSET) {
                    return scrValueFromPack;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final long a(io.odeeo.internal.q0.x xVar) {
        int iLimit = xVar.limit();
        for (int position = xVar.getPosition(); position < iLimit - 3; position++) {
            if (a(xVar.getData(), position) == 442) {
                xVar.setPosition(position + 4);
                long scrValueFromPack = readScrValueFromPack(xVar);
                if (scrValueFromPack != C.TIME_UNSET) {
                    return scrValueFromPack;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long b(byte[] bArr) {
        long j10 = bArr[0];
        long j11 = ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j12 = bArr[2];
        return j11 | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }
}
