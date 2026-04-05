package ko;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f71638a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f71639b;

    /* renamed from: c, reason: collision with root package name */
    public int f71640c;

    /* renamed from: d, reason: collision with root package name */
    public long f71641d;

    /* renamed from: e, reason: collision with root package name */
    public int f71642e;

    /* renamed from: f, reason: collision with root package name */
    public int f71643f;

    /* renamed from: g, reason: collision with root package name */
    public int f71644g;

    public void outputPendingSampleMetadata(e1 e1Var, d1 d1Var) {
        if (this.f71640c > 0) {
            e1Var.sampleMetadata(this.f71641d, this.f71642e, this.f71643f, this.f71644g, d1Var);
            this.f71640c = 0;
        }
    }

    public void reset() {
        this.f71639b = false;
        this.f71640c = 0;
    }

    public void sampleMetadata(e1 e1Var, long j10, int i10, int i11, int i12, d1 d1Var) {
        io.bidmachine.media3.common.util.a.checkState(this.f71644g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f71639b) {
            int i13 = this.f71640c;
            int i14 = i13 + 1;
            this.f71640c = i14;
            if (i13 == 0) {
                this.f71641d = j10;
                this.f71642e = i10;
                this.f71643f = 0;
            }
            this.f71643f += i11;
            this.f71644g = i12;
            if (i14 >= 16) {
                outputPendingSampleMetadata(e1Var, d1Var);
            }
        }
    }

    public void startSample(a0 a0Var) throws IOException {
        if (this.f71639b) {
            return;
        }
        byte[] bArr = this.f71638a;
        a0Var.peekFully(bArr, 0, 10);
        a0Var.resetPeekPosition();
        if (d.parseTrueHdSyncframeAudioSampleCount(bArr) == 0) {
            return;
        }
        this.f71639b = true;
    }
}
