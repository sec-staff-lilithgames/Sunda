package bf;

import android.net.Uri;
import j1.o2;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final ee.u f9198a;

    /* renamed from: b, reason: collision with root package name */
    public ee.p f9199b;

    /* renamed from: c, reason: collision with root package name */
    public ee.k f9200c;

    public c(ee.u uVar) {
        this.f9198a = uVar;
    }

    @Override // bf.p0
    public void disableSeekingOnMp3Streams() {
        ee.p pVar = this.f9199b;
        if (pVar instanceof le.d) {
            ((le.d) pVar).disableSeeking();
        }
    }

    @Override // bf.p0
    public long getCurrentInputPosition() {
        ee.k kVar = this.f9200c;
        if (kVar != null) {
            return kVar.getPosition();
        }
        return -1L;
    }

    @Override // bf.p0
    public void init(qf.k kVar, Uri uri, Map<String, List<String>> map, long j10, long j11, ee.s sVar) throws IOException {
        ee.k kVar2 = new ee.k(kVar, j10, j11);
        this.f9200c = kVar2;
        if (this.f9199b != null) {
            return;
        }
        ee.p[] pVarArrCreateExtractors = this.f9198a.createExtractors(uri, map);
        if (pVarArrCreateExtractors.length == 1) {
            this.f9199b = pVarArrCreateExtractors[0];
        } else {
            int length = pVarArrCreateExtractors.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                ee.p pVar = pVarArrCreateExtractors[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f9199b != null || kVar2.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    com.google.android.exoplayer2.util.a.checkState(this.f9199b != null || kVar2.getPosition() == j10);
                    kVar2.resetPeekPosition();
                    throw th2;
                }
                if (pVar.sniff(kVar2)) {
                    this.f9199b = pVar;
                    com.google.android.exoplayer2.util.a.checkState(true);
                    kVar2.resetPeekPosition();
                    break;
                } else {
                    boolean z10 = this.f9199b != null || kVar2.getPosition() == j10;
                    com.google.android.exoplayer2.util.a.checkState(z10);
                    kVar2.resetPeekPosition();
                    i10++;
                }
            }
            if (this.f9199b == null) {
                throw new o1(o2.o(new StringBuilder("None of the available extractors ("), com.google.android.exoplayer2.util.n1.getCommaDelimitedSimpleClassNames(pVarArrCreateExtractors), ") could read the stream."), (Uri) com.google.android.exoplayer2.util.a.checkNotNull(uri));
            }
        }
        this.f9199b.init(sVar);
    }

    @Override // bf.p0
    public int read(ee.f0 f0Var) throws IOException {
        return ((ee.p) com.google.android.exoplayer2.util.a.checkNotNull(this.f9199b)).read((ee.q) com.google.android.exoplayer2.util.a.checkNotNull(this.f9200c), f0Var);
    }

    @Override // bf.p0
    public void release() {
        ee.p pVar = this.f9199b;
        if (pVar != null) {
            pVar.release();
            this.f9199b = null;
        }
        this.f9200c = null;
    }

    @Override // bf.p0
    public void seek(long j10, long j11) {
        ((ee.p) com.google.android.exoplayer2.util.a.checkNotNull(this.f9199b)).seek(j10, j11);
    }
}
