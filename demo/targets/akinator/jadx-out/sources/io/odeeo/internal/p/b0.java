package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.g0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65239a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65242d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65243e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65244f;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.e0 f65240b = new io.odeeo.internal.q0.e0(0);

    /* renamed from: g, reason: collision with root package name */
    public long f65245g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f65246h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f65247i = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65241c = new io.odeeo.internal.q0.x();

    public b0(int i10) {
        this.f65239a = i10;
    }

    public final int a(io.odeeo.internal.g.i iVar) {
        this.f65241c.reset(g0.f65866f);
        this.f65242d = true;
        iVar.resetPeekPosition();
        return 0;
    }

    public final int b(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar, int i10) throws IOException {
        long length = iVar.getLength();
        int iMin = (int) Math.min(this.f65239a, length);
        long j10 = length - iMin;
        if (iVar.getPosition() != j10) {
            uVar.f64171a = j10;
            return 1;
        }
        this.f65241c.reset(iMin);
        iVar.resetPeekPosition();
        iVar.peekFully(this.f65241c.getData(), 0, iMin);
        this.f65246h = b(this.f65241c, i10);
        this.f65244f = true;
        return 0;
    }

    public long getDurationUs() {
        return this.f65247i;
    }

    public io.odeeo.internal.q0.e0 getPcrTimestampAdjuster() {
        return this.f65240b;
    }

    public boolean isDurationReadFinished() {
        return this.f65242d;
    }

    public int readDuration(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar, int i10) throws IOException {
        if (i10 <= 0) {
            return a(iVar);
        }
        if (!this.f65244f) {
            return b(iVar, uVar, i10);
        }
        if (this.f65246h == C.TIME_UNSET) {
            return a(iVar);
        }
        if (!this.f65243e) {
            return a(iVar, uVar, i10);
        }
        long j10 = this.f65245g;
        if (j10 == C.TIME_UNSET) {
            return a(iVar);
        }
        long jAdjustTsTimestamp = this.f65240b.adjustTsTimestamp(this.f65246h) - this.f65240b.adjustTsTimestamp(j10);
        this.f65247i = jAdjustTsTimestamp;
        if (jAdjustTsTimestamp < 0) {
            io.odeeo.internal.q0.p.w("TsDurationReader", "Invalid duration: " + this.f65247i + ". Using TIME_UNSET instead.");
            this.f65247i = C.TIME_UNSET;
        }
        return a(iVar);
    }

    public final int a(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar, int i10) throws IOException {
        int iMin = (int) Math.min(this.f65239a, iVar.getLength());
        long j10 = 0;
        if (iVar.getPosition() != j10) {
            uVar.f64171a = j10;
            return 1;
        }
        this.f65241c.reset(iMin);
        iVar.resetPeekPosition();
        iVar.peekFully(this.f65241c.getData(), 0, iMin);
        this.f65245g = a(this.f65241c, i10);
        this.f65243e = true;
        return 0;
    }

    public final long b(io.odeeo.internal.q0.x xVar, int i10) {
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        for (int i11 = iLimit - 188; i11 >= position; i11--) {
            if (e0.isStartOfTsPacket(xVar.getData(), position, iLimit, i11)) {
                long pcrFromPacket = e0.readPcrFromPacket(xVar, i11, i10);
                if (pcrFromPacket != C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final long a(io.odeeo.internal.q0.x xVar, int i10) {
        int iLimit = xVar.limit();
        for (int position = xVar.getPosition(); position < iLimit; position++) {
            if (xVar.getData()[position] == 71) {
                long pcrFromPacket = e0.readPcrFromPacket(xVar, position, i10);
                if (pcrFromPacket != C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C.TIME_UNSET;
    }
}
