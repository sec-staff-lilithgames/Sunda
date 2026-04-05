package oe;

import com.google.android.exoplayer2.audio.f1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: b, reason: collision with root package name */
    public final String f79091b;

    /* renamed from: c, reason: collision with root package name */
    public String f79092c;

    /* renamed from: d, reason: collision with root package name */
    public ee.l0 f79093d;

    /* renamed from: f, reason: collision with root package name */
    public int f79095f;

    /* renamed from: g, reason: collision with root package name */
    public int f79096g;

    /* renamed from: h, reason: collision with root package name */
    public long f79097h;

    /* renamed from: i, reason: collision with root package name */
    public z0 f79098i;

    /* renamed from: j, reason: collision with root package name */
    public int f79099j;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f79090a = new v0(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    public int f79094e = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f79100k = C.TIME_UNSET;

    public h(String str) {
        this.f79091b = str;
    }

    @Override // oe.j
    public void consume(v0 v0Var) {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79093d);
        while (v0Var.bytesLeft() > 0) {
            int i10 = this.f79094e;
            v0 v0Var2 = this.f79090a;
            if (i10 == 0) {
                while (true) {
                    if (v0Var.bytesLeft() > 0) {
                        int i11 = this.f79096g << 8;
                        this.f79096g = i11;
                        int unsignedByte = i11 | v0Var.readUnsignedByte();
                        this.f79096g = unsignedByte;
                        if (f1.isSyncWord(unsignedByte)) {
                            byte[] data = v0Var2.getData();
                            int i12 = this.f79096g;
                            data[0] = (byte) ((i12 >> 24) & 255);
                            data[1] = (byte) ((i12 >> 16) & 255);
                            data[2] = (byte) ((i12 >> 8) & 255);
                            data[3] = (byte) (i12 & 255);
                            this.f79095f = 4;
                            this.f79096g = 0;
                            this.f79094e = 1;
                            break;
                        }
                    }
                }
            } else if (i10 == 1) {
                byte[] data2 = v0Var2.getData();
                int iMin = Math.min(v0Var.bytesLeft(), 18 - this.f79095f);
                v0Var.readBytes(data2, this.f79095f, iMin);
                int i13 = this.f79095f + iMin;
                this.f79095f = i13;
                if (i13 == 18) {
                    byte[] data3 = v0Var2.getData();
                    if (this.f79098i == null) {
                        z0 dtsFormat = f1.parseDtsFormat(data3, this.f79092c, this.f79091b, null);
                        this.f79098i = dtsFormat;
                        this.f79093d.format(dtsFormat);
                    }
                    this.f79099j = f1.getDtsFrameSize(data3);
                    this.f79097h = (int) ((f1.parseDtsAudioSampleCount(data3) * 1000000) / this.f79098i.B);
                    v0Var2.setPosition(0);
                    this.f79093d.sampleData(v0Var2, 18);
                    this.f79094e = 2;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(v0Var.bytesLeft(), this.f79099j - this.f79095f);
                this.f79093d.sampleData(v0Var, iMin2);
                int i14 = this.f79095f + iMin2;
                this.f79095f = i14;
                int i15 = this.f79099j;
                if (i14 == i15) {
                    long j10 = this.f79100k;
                    if (j10 != C.TIME_UNSET) {
                        this.f79093d.sampleMetadata(j10, 1, i15, 0, null);
                        this.f79100k += this.f79097h;
                    }
                    this.f79094e = 0;
                }
            }
        }
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79092c = i0Var.getFormatId();
        this.f79093d = sVar.track(i0Var.getTrackId(), 1);
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79100k = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        this.f79094e = 0;
        this.f79095f = 0;
        this.f79096g = 0;
        this.f79100k = C.TIME_UNSET;
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
