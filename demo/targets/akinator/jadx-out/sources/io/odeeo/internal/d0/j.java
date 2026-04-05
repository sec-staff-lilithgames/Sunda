package io.odeeo.internal.d0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.x;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j implements io.odeeo.internal.g.h {

    /* renamed from: a, reason: collision with root package name */
    public final g f63591a;

    /* renamed from: d, reason: collision with root package name */
    public final t f63594d;

    /* renamed from: g, reason: collision with root package name */
    public io.odeeo.internal.g.j f63597g;

    /* renamed from: h, reason: collision with root package name */
    public x f63598h;

    /* renamed from: i, reason: collision with root package name */
    public int f63599i;

    /* renamed from: b, reason: collision with root package name */
    public final c f63592b = new c();

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f63593c = new io.odeeo.internal.q0.x();

    /* renamed from: e, reason: collision with root package name */
    public final List<Long> f63595e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List<io.odeeo.internal.q0.x> f63596f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f63600j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f63601k = C.TIME_UNSET;

    public j(g gVar, t tVar) {
        this.f63591a = gVar;
        this.f63594d = tVar.buildUpon().setSampleMimeType("text/x-exoplayer-cues").setCodecs(tVar.f62971l).build();
    }

    public final boolean a(io.odeeo.internal.g.i iVar) throws IOException {
        int iCapacity = this.f63593c.capacity();
        int i10 = this.f63599i;
        if (iCapacity == i10) {
            this.f63593c.ensureCapacity(i10 + 1024);
        }
        int i11 = iVar.read(this.f63593c.getData(), this.f63599i, this.f63593c.capacity() - this.f63599i);
        if (i11 != -1) {
            this.f63599i += i11;
        }
        long length = iVar.getLength();
        return (length != -1 && ((long) this.f63599i) == length) || i11 == -1;
    }

    public final boolean b(io.odeeo.internal.g.i iVar) throws IOException {
        return iVar.skip((iVar.getLength() > (-1L) ? 1 : (iVar.getLength() == (-1L) ? 0 : -1)) != 0 ? io.odeeo.internal.w0.d.checkedCast(iVar.getLength()) : 1024) == -1;
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        io.odeeo.internal.q0.a.checkState(this.f63600j == 0);
        this.f63597g = jVar;
        this.f63598h = jVar.track(0, 3);
        this.f63597g.endTracks();
        this.f63597g.seekMap(new io.odeeo.internal.g.t(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        this.f63598h.format(this.f63594d);
        this.f63600j = 1;
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, u uVar) throws InterruptedException, io.odeeo.internal.e.f, IOException {
        int i10 = this.f63600j;
        io.odeeo.internal.q0.a.checkState((i10 == 0 || i10 == 5) ? false : true);
        if (this.f63600j == 1) {
            this.f63593c.reset(iVar.getLength() != -1 ? io.odeeo.internal.w0.d.checkedCast(iVar.getLength()) : 1024);
            this.f63599i = 0;
            this.f63600j = 2;
        }
        if (this.f63600j == 2 && a(iVar)) {
            a();
            b();
            this.f63600j = 4;
        }
        if (this.f63600j == 3 && b(iVar)) {
            b();
            this.f63600j = 4;
        }
        return this.f63600j == 4 ? -1 : 0;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
        if (this.f63600j == 5) {
            return;
        }
        this.f63591a.release();
        this.f63600j = 5;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        int i10 = this.f63600j;
        io.odeeo.internal.q0.a.checkState((i10 == 0 || i10 == 5) ? false : true);
        this.f63601k = j11;
        if (this.f63600j == 2) {
            this.f63600j = 1;
        }
        if (this.f63600j == 4) {
            this.f63600j = 3;
        }
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(io.odeeo.internal.g.i iVar) throws IOException {
        return true;
    }

    public final void b() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f63598h);
        io.odeeo.internal.q0.a.checkState(this.f63595e.size() == this.f63596f.size());
        long j10 = this.f63601k;
        for (int iBinarySearchFloor = j10 == C.TIME_UNSET ? 0 : g0.binarySearchFloor((List<? extends Comparable<? super Long>>) this.f63595e, Long.valueOf(j10), true, true); iBinarySearchFloor < this.f63596f.size(); iBinarySearchFloor++) {
            io.odeeo.internal.q0.x xVar = this.f63596f.get(iBinarySearchFloor);
            xVar.setPosition(0);
            int length = xVar.getData().length;
            this.f63598h.sampleData(xVar, length);
            this.f63598h.sampleMetadata(this.f63595e.get(iBinarySearchFloor).longValue(), 1, length, 0, null);
        }
    }

    public final void a() throws InterruptedException, io.odeeo.internal.e.f, IOException {
        try {
            k kVar = (k) this.f63591a.dequeueInputBuffer();
            while (kVar == null) {
                Thread.sleep(5L);
                kVar = (k) this.f63591a.dequeueInputBuffer();
            }
            kVar.ensureSpaceForWrite(this.f63599i);
            kVar.f63705c.put(this.f63593c.getData(), 0, this.f63599i);
            kVar.f63705c.limit(this.f63599i);
            this.f63591a.queueInputBuffer(kVar);
            l lVar = (l) this.f63591a.dequeueOutputBuffer();
            while (lVar == null) {
                Thread.sleep(5L);
                lVar = (l) this.f63591a.dequeueOutputBuffer();
            }
            for (int i10 = 0; i10 < lVar.getEventTimeCount(); i10++) {
                byte[] bArrEncode = this.f63592b.encode(lVar.getCues(lVar.getEventTime(i10)));
                this.f63595e.add(Long.valueOf(lVar.getEventTime(i10)));
                this.f63596f.add(new io.odeeo.internal.q0.x(bArrEncode));
            }
            lVar.release();
        } catch (h e10) {
            throw io.odeeo.internal.b.g0.createForMalformedContainer("SubtitleDecoder failed.", e10);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
