package ge;

import com.google.android.exoplayer2.util.n1;
import ee.g0;
import ee.j0;
import ee.l0;
import ee.q;
import java.io.IOException;
import java.util.Arrays;
import qf.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f57583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57584b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57585c;

    /* renamed from: d, reason: collision with root package name */
    public final long f57586d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57587e;

    /* renamed from: f, reason: collision with root package name */
    public int f57588f;

    /* renamed from: g, reason: collision with root package name */
    public int f57589g;

    /* renamed from: h, reason: collision with root package name */
    public int f57590h;

    /* renamed from: i, reason: collision with root package name */
    public int f57591i;

    /* renamed from: j, reason: collision with root package name */
    public int f57592j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f57593k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f57594l;

    public f(int i10, int i11, long j10, int i12, l0 l0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.checkArgument(z10);
        this.f57586d = j10;
        this.f57587e = i12;
        this.f57583a = l0Var;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f57584b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f57585c = i11 == 2 ? i13 | 1650720768 : -1;
        this.f57593k = new long[512];
        this.f57594l = new int[512];
    }

    public final j0 a(int i10) {
        return new j0(getFrameDurationUs() * this.f57594l[i10], this.f57593k[i10]);
    }

    public void advanceCurrentChunk() {
        this.f57590h++;
    }

    public void appendKeyFrameToIndex(long j10) {
        if (this.f57592j == this.f57594l.length) {
            long[] jArr = this.f57593k;
            this.f57593k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f57594l;
            this.f57594l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f57593k;
        int i10 = this.f57592j;
        jArr2[i10] = j10;
        this.f57594l[i10] = this.f57591i;
        this.f57592j = i10 + 1;
    }

    public void compactIndex() {
        this.f57593k = Arrays.copyOf(this.f57593k, this.f57592j);
        this.f57594l = Arrays.copyOf(this.f57594l, this.f57592j);
    }

    public long getCurrentChunkTimestampUs() {
        return (this.f57586d * this.f57590h) / this.f57587e;
    }

    public long getFrameDurationUs() {
        return (this.f57586d * 1) / this.f57587e;
    }

    public g0 getSeekPoints(long j10) {
        int frameDurationUs = (int) (j10 / getFrameDurationUs());
        int iBinarySearchFloor = n1.binarySearchFloor(this.f57594l, frameDurationUs, true, true);
        if (this.f57594l[iBinarySearchFloor] == frameDurationUs) {
            return new g0(a(iBinarySearchFloor));
        }
        j0 j0VarA = a(iBinarySearchFloor);
        int i10 = iBinarySearchFloor + 1;
        return i10 < this.f57593k.length ? new g0(j0VarA, a(i10)) : new g0(j0VarA);
    }

    public boolean handlesChunkId(int i10) {
        return this.f57584b == i10 || this.f57585c == i10;
    }

    public void incrementIndexChunkCount() {
        this.f57591i++;
    }

    public boolean isAudio() {
        return (this.f57584b & 1651965952) == 1651965952;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return Arrays.binarySearch(this.f57594l, this.f57590h) >= 0;
    }

    public boolean isVideo() {
        return (this.f57584b & 1667497984) == 1667497984;
    }

    public boolean onChunkData(q qVar) throws IOException {
        int i10 = this.f57589g;
        int iSampleData = i10 - this.f57583a.sampleData((k) qVar, i10, false);
        this.f57589g = iSampleData;
        boolean z10 = iSampleData == 0;
        if (z10) {
            if (this.f57588f > 0) {
                this.f57583a.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.f57588f, 0, null);
            }
            advanceCurrentChunk();
        }
        return z10;
    }

    public void onChunkStart(int i10) {
        this.f57588f = i10;
        this.f57589g = i10;
    }

    public void seekToPosition(long j10) {
        if (this.f57592j == 0) {
            this.f57590h = 0;
        } else {
            this.f57590h = this.f57594l[n1.binarySearchFloor(this.f57593k, j10, true, true)];
        }
    }
}
