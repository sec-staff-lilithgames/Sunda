package he;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import ee.a0;
import ee.f0;
import ee.h0;
import ee.i0;
import ee.l0;
import ee.p;
import ee.q;
import ee.s;
import ee.v;
import ee.w;
import ee.x;
import ee.y;
import ee.z;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f58737a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f58738b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58739c;

    /* renamed from: d, reason: collision with root package name */
    public final v f58740d;

    /* renamed from: e, reason: collision with root package name */
    public s f58741e;

    /* renamed from: f, reason: collision with root package name */
    public l0 f58742f;

    /* renamed from: g, reason: collision with root package name */
    public int f58743g;

    /* renamed from: h, reason: collision with root package name */
    public Metadata f58744h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f58745i;

    /* renamed from: j, reason: collision with root package name */
    public int f58746j;

    /* renamed from: k, reason: collision with root package name */
    public int f58747k;

    /* renamed from: l, reason: collision with root package name */
    public b f58748l;

    /* renamed from: m, reason: collision with root package name */
    public int f58749m;

    /* renamed from: n, reason: collision with root package name */
    public long f58750n;

    public c() {
        this(0);
    }

    public final void a() {
        ((l0) n1.castNonNull(this.f58742f)).sampleMetadata((this.f58750n * 1000000) / ((a0) n1.castNonNull(this.f58745i)).f54157e, 1, this.f58749m, 0, null);
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f58741e = sVar;
        this.f58742f = sVar.track(0, 1);
        sVar.endTracks();
    }

    @Override // ee.p
    public int read(q qVar, f0 f0Var) throws IOException {
        i0 h0Var;
        boolean z10;
        long j10;
        boolean zCheckAndReadFrameHeader;
        int i10 = this.f58743g;
        if (i10 == 0) {
            this.f58744h = y.readId3Metadata(qVar, !this.f58739c);
            this.f58743g = 1;
            return 0;
        }
        byte[] bArr = this.f58737a;
        if (i10 == 1) {
            qVar.peekFully(bArr, 0, bArr.length);
            qVar.resetPeekPosition();
            this.f58743g = 2;
            return 0;
        }
        if (i10 == 2) {
            y.readStreamMarker(qVar);
            this.f58743g = 3;
            return 0;
        }
        if (i10 == 3) {
            x xVar = new x(this.f58745i);
            boolean metadataBlock = false;
            while (!metadataBlock) {
                metadataBlock = y.readMetadataBlock(qVar, xVar);
                this.f58745i = (a0) n1.castNonNull(xVar.f54264a);
            }
            com.google.android.exoplayer2.util.a.checkNotNull(this.f58745i);
            this.f58746j = Math.max(this.f58745i.f54155c, 6);
            ((l0) n1.castNonNull(this.f58742f)).format(this.f58745i.getFormat(bArr, this.f58744h));
            this.f58743g = 4;
            return 0;
        }
        if (i10 == 4) {
            this.f58747k = y.getFrameStartMarker(qVar);
            s sVar = (s) n1.castNonNull(this.f58741e);
            long position = qVar.getPosition();
            long length = qVar.getLength();
            com.google.android.exoplayer2.util.a.checkNotNull(this.f58745i);
            a0 a0Var = this.f58745i;
            if (a0Var.f54163k != null) {
                h0Var = new z(a0Var, position);
            } else if (length == -1 || a0Var.f54162j <= 0) {
                h0Var = new h0(a0Var.getDurationUs());
            } else {
                b bVar = new b(a0Var, this.f58747k, position, length);
                this.f58748l = bVar;
                h0Var = bVar.getSeekMap();
            }
            sVar.seekMap(h0Var);
            this.f58743g = 5;
            return 0;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        com.google.android.exoplayer2.util.a.checkNotNull(this.f58742f);
        com.google.android.exoplayer2.util.a.checkNotNull(this.f58745i);
        b bVar2 = this.f58748l;
        if (bVar2 != null && bVar2.isSeeking()) {
            return this.f58748l.handlePendingSeek(qVar, f0Var);
        }
        if (this.f58750n == -1) {
            this.f58750n = w.getFirstSampleNumber(qVar, this.f58745i);
            return 0;
        }
        v0 v0Var = this.f58738b;
        int iLimit = v0Var.limit();
        if (iLimit < 32768) {
            int i11 = qVar.read(v0Var.getData(), iLimit, 32768 - iLimit);
            z10 = i11 == -1;
            if (!z10) {
                v0Var.setLimit(iLimit + i11);
            } else if (v0Var.bytesLeft() == 0) {
                a();
                return -1;
            }
        } else {
            z10 = false;
        }
        int position2 = v0Var.getPosition();
        int i12 = this.f58749m;
        int i13 = this.f58746j;
        if (i12 < i13) {
            v0Var.skipBytes(Math.min(i13 - i12, v0Var.bytesLeft()));
        }
        com.google.android.exoplayer2.util.a.checkNotNull(this.f58745i);
        int position3 = v0Var.getPosition();
        while (true) {
            int iLimit2 = v0Var.limit() - 16;
            v vVar = this.f58740d;
            if (position3 <= iLimit2) {
                v0Var.setPosition(position3);
                if (w.checkAndReadFrameHeader(v0Var, this.f58745i, this.f58747k, vVar)) {
                    v0Var.setPosition(position3);
                    j10 = vVar.f54263a;
                    break;
                }
                position3++;
            } else {
                if (z10) {
                    while (position3 <= v0Var.limit() - this.f58746j) {
                        v0Var.setPosition(position3);
                        try {
                            zCheckAndReadFrameHeader = w.checkAndReadFrameHeader(v0Var, this.f58745i, this.f58747k, vVar);
                        } catch (IndexOutOfBoundsException unused) {
                            zCheckAndReadFrameHeader = false;
                        }
                        if (v0Var.getPosition() > v0Var.limit()) {
                            zCheckAndReadFrameHeader = false;
                        }
                        if (zCheckAndReadFrameHeader) {
                            v0Var.setPosition(position3);
                            j10 = vVar.f54263a;
                            break;
                        }
                        position3++;
                    }
                    v0Var.setPosition(v0Var.limit());
                } else {
                    v0Var.setPosition(position3);
                }
                j10 = -1;
            }
        }
        int position4 = v0Var.getPosition() - position2;
        v0Var.setPosition(position2);
        this.f58742f.sampleData(v0Var, position4);
        this.f58749m += position4;
        if (j10 != -1) {
            a();
            this.f58749m = 0;
            this.f58750n = j10;
        }
        if (v0Var.bytesLeft() < 16) {
            int iBytesLeft = v0Var.bytesLeft();
            System.arraycopy(v0Var.getData(), v0Var.getPosition(), v0Var.getData(), 0, iBytesLeft);
            v0Var.setPosition(0);
            v0Var.setLimit(iBytesLeft);
        }
        return 0;
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f58743g = 0;
        } else {
            b bVar = this.f58748l;
            if (bVar != null) {
                bVar.setSeekTargetUs(j11);
            }
        }
        this.f58750n = j11 != 0 ? -1L : 0L;
        this.f58749m = 0;
        this.f58738b.reset(0);
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        y.peekId3Metadata(qVar, false);
        return y.checkAndPeekStreamMarker(qVar);
    }

    public c(int i10) {
        this.f58737a = new byte[42];
        this.f58738b = new v0(new byte[32768], 0);
        this.f58739c = (i10 & 1) != 0;
        this.f58740d = new v();
        this.f58743g = 0;
    }

    @Override // ee.p
    public void release() {
    }
}
