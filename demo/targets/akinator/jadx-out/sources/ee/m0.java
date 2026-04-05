package ee;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f54242a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f54243b;

    /* renamed from: c, reason: collision with root package name */
    public int f54244c;

    /* renamed from: d, reason: collision with root package name */
    public long f54245d;

    /* renamed from: e, reason: collision with root package name */
    public int f54246e;

    /* renamed from: f, reason: collision with root package name */
    public int f54247f;

    /* renamed from: g, reason: collision with root package name */
    public int f54248g;

    public void outputPendingSampleMetadata(l0 l0Var, k0 k0Var) {
        if (this.f54244c > 0) {
            l0Var.sampleMetadata(this.f54245d, this.f54246e, this.f54247f, this.f54248g, k0Var);
            this.f54244c = 0;
        }
    }

    public void reset() {
        this.f54243b = false;
        this.f54244c = 0;
    }

    public void sampleMetadata(l0 l0Var, long j10, int i10, int i11, int i12, k0 k0Var) {
        com.google.android.exoplayer2.util.a.checkState(this.f54248g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f54243b) {
            int i13 = this.f54244c;
            int i14 = i13 + 1;
            this.f54244c = i14;
            if (i13 == 0) {
                this.f54245d = j10;
                this.f54246e = i10;
                this.f54247f = 0;
            }
            this.f54247f += i11;
            this.f54248g = i12;
            if (i14 >= 16) {
                outputPendingSampleMetadata(l0Var, k0Var);
            }
        }
    }

    public void startSample(q qVar) throws IOException {
        if (this.f54243b) {
            return;
        }
        byte[] bArr = this.f54242a;
        qVar.peekFully(bArr, 0, 10);
        qVar.resetPeekPosition();
        if (com.google.android.exoplayer2.audio.d.parseTrueHdSyncframeAudioSampleCount(bArr) == 0) {
            return;
        }
        this.f54243b = true;
    }
}
