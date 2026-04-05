package oe;

import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public boolean f79301c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f79302d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79303e;

    /* renamed from: a, reason: collision with root package name */
    public final h1 f79299a = new h1(0);

    /* renamed from: f, reason: collision with root package name */
    public long f79304f = C.TIME_UNSET;

    /* renamed from: g, reason: collision with root package name */
    public long f79305g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f79306h = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f79300b = new v0();

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long readScrValueFromPack(v0 v0Var) {
        int position = v0Var.getPosition();
        if (v0Var.bytesLeft() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        v0Var.readBytes(bArr, 0, 9);
        v0Var.setPosition(position);
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
        return this.f79306h;
    }

    public h1 getScrTimestampAdjuster() {
        return this.f79299a;
    }

    public boolean isDurationReadFinished() {
        return this.f79301c;
    }

    public int readDuration(ee.q qVar, ee.f0 f0Var) throws IOException {
        boolean z10 = this.f79303e;
        v0 v0Var = this.f79300b;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long length = qVar.getLength();
            int iMin = (int) Math.min(20000L, length);
            long j11 = length - iMin;
            if (qVar.getPosition() != j11) {
                f0Var.f54188a = j11;
                return 1;
            }
            v0Var.reset(iMin);
            qVar.resetPeekPosition();
            qVar.peekFully(v0Var.getData(), 0, iMin);
            int position = v0Var.getPosition();
            int iLimit = v0Var.limit() - 4;
            while (true) {
                if (iLimit < position) {
                    break;
                }
                if (a(iLimit, v0Var.getData()) == 442) {
                    v0Var.setPosition(iLimit + 4);
                    long scrValueFromPack = readScrValueFromPack(v0Var);
                    if (scrValueFromPack != C.TIME_UNSET) {
                        j10 = scrValueFromPack;
                        break;
                    }
                }
                iLimit--;
            }
            this.f79305g = j10;
            this.f79303e = true;
            return 0;
        }
        if (this.f79305g == C.TIME_UNSET) {
            v0Var.reset(n1.f28511f);
            this.f79301c = true;
            qVar.resetPeekPosition();
            return 0;
        }
        if (this.f79302d) {
            long j12 = this.f79304f;
            if (j12 == C.TIME_UNSET) {
                v0Var.reset(n1.f28511f);
                this.f79301c = true;
                qVar.resetPeekPosition();
                return 0;
            }
            h1 h1Var = this.f79299a;
            long jAdjustTsTimestamp = h1Var.adjustTsTimestamp(this.f79305g) - h1Var.adjustTsTimestamp(j12);
            this.f79306h = jAdjustTsTimestamp;
            if (jAdjustTsTimestamp < 0) {
                com.google.android.exoplayer2.util.f0.w("PsDurationReader", "Invalid duration: " + this.f79306h + ". Using TIME_UNSET instead.");
                this.f79306h = C.TIME_UNSET;
            }
            v0Var.reset(n1.f28511f);
            this.f79301c = true;
            qVar.resetPeekPosition();
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, qVar.getLength());
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
            if (position2 >= iLimit2 - 3) {
                break;
            }
            if (a(position2, v0Var.getData()) == 442) {
                v0Var.setPosition(position2 + 4);
                long scrValueFromPack2 = readScrValueFromPack(v0Var);
                if (scrValueFromPack2 != C.TIME_UNSET) {
                    j10 = scrValueFromPack2;
                    break;
                }
            }
            position2++;
        }
        this.f79304f = j10;
        this.f79302d = true;
        return 0;
    }
}
