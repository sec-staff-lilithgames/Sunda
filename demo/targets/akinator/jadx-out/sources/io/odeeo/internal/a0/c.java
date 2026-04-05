package io.odeeo.internal.a0;

import android.net.Uri;
import j1.o2;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements y {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.g.l f62243a;

    /* renamed from: b, reason: collision with root package name */
    public io.odeeo.internal.g.h f62244b;

    /* renamed from: c, reason: collision with root package name */
    public io.odeeo.internal.g.i f62245c;

    public c(io.odeeo.internal.g.l lVar) {
        this.f62243a = lVar;
    }

    @Override // io.odeeo.internal.a0.y
    public void disableSeekingOnMp3Streams() {
        io.odeeo.internal.g.h hVar = this.f62244b;
        if (hVar instanceof io.odeeo.internal.m.d) {
            ((io.odeeo.internal.m.d) hVar).disableSeeking();
        }
    }

    @Override // io.odeeo.internal.a0.y
    public long getCurrentInputPosition() {
        io.odeeo.internal.g.i iVar = this.f62245c;
        if (iVar != null) {
            return iVar.getPosition();
        }
        return -1L;
    }

    @Override // io.odeeo.internal.a0.y
    public void init(io.odeeo.internal.p0.g gVar, Uri uri, Map<String, List<String>> map, long j10, long j11, io.odeeo.internal.g.j jVar) throws IOException {
        io.odeeo.internal.g.e eVar = new io.odeeo.internal.g.e(gVar, j10, j11);
        this.f62245c = eVar;
        if (this.f62244b != null) {
            return;
        }
        io.odeeo.internal.g.h[] hVarArrCreateExtractors = this.f62243a.createExtractors(uri, map);
        if (hVarArrCreateExtractors.length == 1) {
            this.f62244b = hVarArrCreateExtractors[0];
        } else {
            int length = hVarArrCreateExtractors.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                io.odeeo.internal.g.h hVar = hVarArrCreateExtractors[i10];
                try {
                } catch (EOFException unused) {
                    io.odeeo.internal.q0.a.checkState(this.f62244b != null || eVar.getPosition() == j10);
                    eVar.resetPeekPosition();
                } catch (Throwable th2) {
                    io.odeeo.internal.q0.a.checkState(this.f62244b != null || eVar.getPosition() == j10);
                    eVar.resetPeekPosition();
                    throw th2;
                }
                if (hVar.sniff(eVar)) {
                    this.f62244b = hVar;
                    io.odeeo.internal.q0.a.checkState(true);
                    eVar.resetPeekPosition();
                    break;
                } else {
                    io.odeeo.internal.q0.a.checkState(this.f62244b != null || eVar.getPosition() == j10);
                    eVar.resetPeekPosition();
                    i10++;
                }
            }
            if (this.f62244b == null) {
                throw new m0(o2.o(new StringBuilder("None of the available extractors ("), io.odeeo.internal.q0.g0.getCommaDelimitedSimpleClassNames(hVarArrCreateExtractors), ") could read the stream."), (Uri) io.odeeo.internal.q0.a.checkNotNull(uri));
            }
        }
        this.f62244b.init(jVar);
    }

    @Override // io.odeeo.internal.a0.y
    public int read(io.odeeo.internal.g.u uVar) throws IOException {
        return ((io.odeeo.internal.g.h) io.odeeo.internal.q0.a.checkNotNull(this.f62244b)).read((io.odeeo.internal.g.i) io.odeeo.internal.q0.a.checkNotNull(this.f62245c), uVar);
    }

    @Override // io.odeeo.internal.a0.y
    public void release() {
        io.odeeo.internal.g.h hVar = this.f62244b;
        if (hVar != null) {
            hVar.release();
            this.f62244b = null;
        }
        this.f62245c = null;
    }

    @Override // io.odeeo.internal.a0.y
    public void seek(long j10, long j11) {
        ((io.odeeo.internal.g.h) io.odeeo.internal.q0.a.checkNotNull(this.f62244b)).seek(j10, j11);
    }
}
