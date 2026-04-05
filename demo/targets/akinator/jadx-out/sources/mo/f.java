package mo;

import gn.o;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.Arrays;
import ko.a0;
import ko.e1;
import ko.w0;
import ko.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f74881a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f74882b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74883c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74884d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74885e;

    /* renamed from: f, reason: collision with root package name */
    public int f74886f;

    /* renamed from: g, reason: collision with root package name */
    public int f74887g;

    /* renamed from: h, reason: collision with root package name */
    public int f74888h;

    /* renamed from: i, reason: collision with root package name */
    public int f74889i;

    /* renamed from: j, reason: collision with root package name */
    public int f74890j;

    /* renamed from: k, reason: collision with root package name */
    public int f74891k;

    /* renamed from: l, reason: collision with root package name */
    public long f74892l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f74893m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f74894n;

    public f(int i10, e eVar, e1 e1Var) {
        this.f74881a = eVar;
        int trackType = eVar.getTrackType();
        boolean z10 = true;
        if (trackType != 1 && trackType != 2) {
            z10 = false;
        }
        io.bidmachine.media3.common.util.a.checkArgument(z10);
        int i11 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f74883c = (trackType == 2 ? 1667497984 : 1651965952) | i11;
        this.f74885e = eVar.getDurationUs();
        this.f74882b = e1Var;
        this.f74884d = trackType == 2 ? i11 | 1650720768 : -1;
        this.f74892l = -1L;
        this.f74893m = new long[512];
        this.f74894n = new int[512];
        this.f74886f = eVar.f74878d;
    }

    public final z0 a(int i10) {
        return new z0(getFrameDurationUs() * this.f74894n[i10], this.f74893m[i10]);
    }

    public void advanceCurrentChunk() {
        this.f74889i++;
    }

    public void appendIndexChunk(long j10, boolean z10) {
        if (this.f74892l == -1) {
            this.f74892l = j10;
        }
        if (z10) {
            if (this.f74891k == this.f74894n.length) {
                long[] jArr = this.f74893m;
                this.f74893m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f74894n;
                this.f74894n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f74893m;
            int i10 = this.f74891k;
            jArr2[i10] = j10;
            this.f74894n[i10] = this.f74890j;
            this.f74891k = i10 + 1;
        }
        this.f74890j++;
    }

    public void commitIndex() {
        int i10;
        this.f74893m = Arrays.copyOf(this.f74893m, this.f74891k);
        this.f74894n = Arrays.copyOf(this.f74894n, this.f74891k);
        if (!isAudio() || this.f74881a.f74880f == 0 || (i10 = this.f74891k) <= 0) {
            return;
        }
        this.f74886f = i10;
    }

    public long getCurrentChunkTimestampUs() {
        return (this.f74885e * this.f74889i) / this.f74886f;
    }

    public long getFrameDurationUs() {
        return (this.f74885e * 1) / this.f74886f;
    }

    public w0 getSeekPoints(long j10) {
        if (this.f74891k == 0) {
            return new w0(new z0(0L, this.f74892l));
        }
        int frameDurationUs = (int) (j10 / getFrameDurationUs());
        int iBinarySearchFloor = a1.binarySearchFloor(this.f74894n, frameDurationUs, true, true);
        if (this.f74894n[iBinarySearchFloor] == frameDurationUs) {
            return new w0(a(iBinarySearchFloor));
        }
        z0 z0VarA = a(iBinarySearchFloor);
        int i10 = iBinarySearchFloor + 1;
        return i10 < this.f74893m.length ? new w0(z0VarA, a(i10)) : new w0(z0VarA);
    }

    public boolean handlesChunkId(int i10) {
        return this.f74883c == i10 || this.f74884d == i10;
    }

    public boolean isAudio() {
        return (this.f74883c & 1651965952) == 1651965952;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return Arrays.binarySearch(this.f74894n, this.f74889i) >= 0;
    }

    public boolean isVideo() {
        return (this.f74883c & 1667497984) == 1667497984;
    }

    public boolean onChunkData(a0 a0Var) throws IOException {
        int i10 = this.f74888h;
        int iSampleData = i10 - this.f74882b.sampleData((o) a0Var, i10, false);
        this.f74888h = iSampleData;
        boolean z10 = iSampleData == 0;
        if (z10) {
            if (this.f74887g > 0) {
                this.f74882b.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.f74887g, 0, null);
            }
            advanceCurrentChunk();
        }
        return z10;
    }

    public void onChunkStart(int i10) {
        this.f74887g = i10;
        this.f74888h = i10;
    }

    public void seekToPosition(long j10) {
        if (this.f74891k == 0) {
            this.f74889i = 0;
        } else {
            this.f74889i = this.f74894n[a1.binarySearchFloor(this.f74893m, j10, true, true)];
        }
    }
}
