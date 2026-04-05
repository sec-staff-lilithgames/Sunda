package oe;

import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f79013a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f79016d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79017e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f79018f;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f79014b = new h1(0);

    /* renamed from: g, reason: collision with root package name */
    public long f79019g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f79020h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f79021i = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f79015c = new v0();

    public d0(int i10) {
        this.f79013a = i10;
    }

    public final void a(ee.q qVar) {
        this.f79015c.reset(n1.f28511f);
        this.f79016d = true;
        qVar.resetPeekPosition();
    }

    public long getDurationUs() {
        return this.f79021i;
    }

    public h1 getPcrTimestampAdjuster() {
        return this.f79014b;
    }

    public boolean isDurationReadFinished() {
        return this.f79016d;
    }

    public int readDuration(ee.q qVar, ee.f0 f0Var, int i10) throws IOException {
        if (i10 <= 0) {
            a(qVar);
            return 0;
        }
        boolean z10 = this.f79018f;
        int i11 = this.f79013a;
        v0 v0Var = this.f79015c;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long length = qVar.getLength();
            int iMin = (int) Math.min(i11, length);
            long j11 = length - iMin;
            if (qVar.getPosition() != j11) {
                f0Var.f54188a = j11;
                return 1;
            }
            v0Var.reset(iMin);
            qVar.resetPeekPosition();
            qVar.peekFully(v0Var.getData(), 0, iMin);
            int position = v0Var.getPosition();
            int iLimit = v0Var.limit();
            int i12 = iLimit - 188;
            while (true) {
                if (i12 < position) {
                    break;
                }
                if (k0.isStartOfTsPacket(v0Var.getData(), position, iLimit, i12)) {
                    long pcrFromPacket = k0.readPcrFromPacket(v0Var, i12, i10);
                    if (pcrFromPacket != C.TIME_UNSET) {
                        j10 = pcrFromPacket;
                        break;
                    }
                }
                i12--;
            }
            this.f79020h = j10;
            this.f79018f = true;
            return 0;
        }
        if (this.f79020h == C.TIME_UNSET) {
            a(qVar);
            return 0;
        }
        if (this.f79017e) {
            long j12 = this.f79019g;
            if (j12 == C.TIME_UNSET) {
                a(qVar);
                return 0;
            }
            h1 h1Var = this.f79014b;
            long jAdjustTsTimestamp = h1Var.adjustTsTimestamp(this.f79020h) - h1Var.adjustTsTimestamp(j12);
            this.f79021i = jAdjustTsTimestamp;
            if (jAdjustTsTimestamp < 0) {
                com.google.android.exoplayer2.util.f0.w("TsDurationReader", "Invalid duration: " + this.f79021i + ". Using TIME_UNSET instead.");
                this.f79021i = C.TIME_UNSET;
            }
            a(qVar);
            return 0;
        }
        int iMin2 = (int) Math.min(i11, qVar.getLength());
        long j13 = 0;
        if (qVar.getPosition() != j13) {
            f0Var.f54188a = j13;
            return 1;
        }
        v0Var.reset(iMin2);
        qVar.resetPeekPosition();
        qVar.peekFully(v0Var.getData(), 0, iMin2);
        int position2 = v0Var.getPosition();
        int iLimit2 = v0Var.limit();
        while (true) {
            if (position2 >= iLimit2) {
                break;
            }
            if (v0Var.getData()[position2] == 71) {
                long pcrFromPacket2 = k0.readPcrFromPacket(v0Var, position2, i10);
                if (pcrFromPacket2 != C.TIME_UNSET) {
                    j10 = pcrFromPacket2;
                    break;
                }
            }
            position2++;
        }
        this.f79019g = j10;
        this.f79017e = true;
        return 0;
    }
}
