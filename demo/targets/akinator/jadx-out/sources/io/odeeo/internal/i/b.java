package io.odeeo.internal.i;

import io.odeeo.internal.g.h;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.l;
import io.odeeo.internal.g.m;
import io.odeeo.internal.g.n;
import io.odeeo.internal.g.o;
import io.odeeo.internal.g.p;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements h {

    /* renamed from: o, reason: collision with root package name */
    public static final l f64286o = new bt.a(3);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64287a;

    /* renamed from: b, reason: collision with root package name */
    public final x f64288b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64289c;

    /* renamed from: d, reason: collision with root package name */
    public final m.a f64290d;

    /* renamed from: e, reason: collision with root package name */
    public j f64291e;

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.g.x f64292f;

    /* renamed from: g, reason: collision with root package name */
    public int f64293g;

    /* renamed from: h, reason: collision with root package name */
    public io.odeeo.internal.s.a f64294h;

    /* renamed from: i, reason: collision with root package name */
    public p f64295i;

    /* renamed from: j, reason: collision with root package name */
    public int f64296j;

    /* renamed from: k, reason: collision with root package name */
    public int f64297k;

    /* renamed from: l, reason: collision with root package name */
    public a f64298l;

    /* renamed from: m, reason: collision with root package name */
    public int f64299m;

    /* renamed from: n, reason: collision with root package name */
    public long f64300n;

    public b() {
        this(0);
    }

    public static /* synthetic */ h[] a() {
        return new h[]{new b()};
    }

    public final void b(i iVar) throws IOException {
        byte[] bArr = this.f64287a;
        iVar.peekFully(bArr, 0, bArr.length);
        iVar.resetPeekPosition();
        this.f64293g = 2;
    }

    public final void c(i iVar) throws IOException {
        this.f64294h = n.readId3Metadata(iVar, !this.f64289c);
        this.f64293g = 1;
    }

    public final void d(i iVar) throws IOException {
        n.a aVar = new n.a(this.f64295i);
        boolean metadataBlock = false;
        while (!metadataBlock) {
            metadataBlock = n.readMetadataBlock(iVar, aVar);
            this.f64295i = (p) g0.castNonNull(aVar.f64145a);
        }
        io.odeeo.internal.q0.a.checkNotNull(this.f64295i);
        this.f64296j = Math.max(this.f64295i.f64150c, 6);
        ((io.odeeo.internal.g.x) g0.castNonNull(this.f64292f)).format(this.f64295i.getFormat(this.f64287a, this.f64294h));
        this.f64293g = 4;
    }

    public final void e(i iVar) throws IOException {
        n.readStreamMarker(iVar);
        this.f64293g = 3;
    }

    @Override // io.odeeo.internal.g.h
    public void init(j jVar) {
        this.f64291e = jVar;
        this.f64292f = jVar.track(0, 1);
        jVar.endTracks();
    }

    @Override // io.odeeo.internal.g.h
    public int read(i iVar, u uVar) throws IOException {
        int i10 = this.f64293g;
        if (i10 == 0) {
            c(iVar);
            return 0;
        }
        if (i10 == 1) {
            b(iVar);
            return 0;
        }
        if (i10 == 2) {
            e(iVar);
            return 0;
        }
        if (i10 == 3) {
            d(iVar);
            return 0;
        }
        if (i10 == 4) {
            a(iVar);
            return 0;
        }
        if (i10 == 5) {
            return a(iVar, uVar);
        }
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f64293g = 0;
        } else {
            a aVar = this.f64298l;
            if (aVar != null) {
                aVar.setSeekTargetUs(j11);
            }
        }
        this.f64300n = j11 != 0 ? -1L : 0L;
        this.f64299m = 0;
        this.f64288b.reset(0);
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(i iVar) throws IOException {
        n.peekId3Metadata(iVar, false);
        return n.checkAndPeekStreamMarker(iVar);
    }

    public b(int i10) {
        this.f64287a = new byte[42];
        this.f64288b = new x(new byte[32768], 0);
        this.f64289c = (i10 & 1) != 0;
        this.f64290d = new m.a();
        this.f64293g = 0;
    }

    public final void a(i iVar) throws IOException {
        this.f64297k = n.getFrameStartMarker(iVar);
        ((j) g0.castNonNull(this.f64291e)).seekMap(a(iVar.getPosition(), iVar.getLength()));
        this.f64293g = 5;
    }

    public final void b() {
        ((io.odeeo.internal.g.x) g0.castNonNull(this.f64292f)).sampleMetadata((this.f64300n * 1000000) / ((p) g0.castNonNull(this.f64295i)).f64152e, 1, this.f64299m, 0, null);
    }

    public final int a(i iVar, u uVar) throws IOException {
        boolean z10;
        io.odeeo.internal.q0.a.checkNotNull(this.f64292f);
        io.odeeo.internal.q0.a.checkNotNull(this.f64295i);
        a aVar = this.f64298l;
        if (aVar != null && aVar.isSeeking()) {
            return this.f64298l.handlePendingSeek(iVar, uVar);
        }
        if (this.f64300n == -1) {
            this.f64300n = m.getFirstSampleNumber(iVar, this.f64295i);
            return 0;
        }
        int iLimit = this.f64288b.limit();
        if (iLimit < 32768) {
            int i10 = iVar.read(this.f64288b.getData(), iLimit, 32768 - iLimit);
            z10 = i10 == -1;
            if (!z10) {
                this.f64288b.setLimit(iLimit + i10);
            } else if (this.f64288b.bytesLeft() == 0) {
                b();
                return -1;
            }
        } else {
            z10 = false;
        }
        int position = this.f64288b.getPosition();
        int i11 = this.f64299m;
        int i12 = this.f64296j;
        if (i11 < i12) {
            x xVar = this.f64288b;
            xVar.skipBytes(Math.min(i12 - i11, xVar.bytesLeft()));
        }
        long jA = a(this.f64288b, z10);
        int position2 = this.f64288b.getPosition() - position;
        this.f64288b.setPosition(position);
        this.f64292f.sampleData(this.f64288b, position2);
        this.f64299m += position2;
        if (jA != -1) {
            b();
            this.f64299m = 0;
            this.f64300n = jA;
        }
        if (this.f64288b.bytesLeft() < 16) {
            int iBytesLeft = this.f64288b.bytesLeft();
            System.arraycopy(this.f64288b.getData(), this.f64288b.getPosition(), this.f64288b.getData(), 0, iBytesLeft);
            this.f64288b.setPosition(0);
            this.f64288b.setLimit(iBytesLeft);
        }
        return 0;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    public final v a(long j10, long j11) {
        io.odeeo.internal.q0.a.checkNotNull(this.f64295i);
        p pVar = this.f64295i;
        if (pVar.f64158k != null) {
            return new o(pVar, j10);
        }
        if (j11 != -1 && pVar.f64157j > 0) {
            a aVar = new a(pVar, this.f64297k, j10, j11);
            this.f64298l = aVar;
            return aVar.getSeekMap();
        }
        return new v.b(pVar.getDurationUs());
    }

    public final long a(x xVar, boolean z10) {
        boolean zCheckAndReadFrameHeader;
        io.odeeo.internal.q0.a.checkNotNull(this.f64295i);
        int position = xVar.getPosition();
        while (position <= xVar.limit() - 16) {
            xVar.setPosition(position);
            if (m.checkAndReadFrameHeader(xVar, this.f64295i, this.f64297k, this.f64290d)) {
                xVar.setPosition(position);
                return this.f64290d.f64144a;
            }
            position++;
        }
        if (z10) {
            while (position <= xVar.limit() - this.f64296j) {
                xVar.setPosition(position);
                try {
                    zCheckAndReadFrameHeader = m.checkAndReadFrameHeader(xVar, this.f64295i, this.f64297k, this.f64290d);
                } catch (IndexOutOfBoundsException unused) {
                    zCheckAndReadFrameHeader = false;
                }
                if (xVar.getPosition() <= xVar.limit() ? zCheckAndReadFrameHeader : false) {
                    xVar.setPosition(position);
                    return this.f64290d.f64144a;
                }
                position++;
            }
            xVar.setPosition(xVar.limit());
            return -1L;
        }
        xVar.setPosition(position);
        return -1L;
    }
}
