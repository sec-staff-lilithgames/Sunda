package ne;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import ee.f0;
import ee.i0;
import ee.l0;
import ee.p;
import ee.q;
import ee.s;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public s f76022a;

    /* renamed from: b, reason: collision with root package name */
    public k f76023b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76024c;

    public final boolean a(q qVar) throws IOException {
        g gVar = new g();
        if (gVar.populate(qVar, true) && (gVar.f76030a & 2) == 2) {
            int iMin = Math.min(gVar.f76034e, 8);
            v0 v0Var = new v0(iMin);
            qVar.peekFully(v0Var.getData(), 0, iMin);
            v0Var.setPosition(0);
            if (d.verifyBitstreamType(v0Var)) {
                this.f76023b = new d();
            } else {
                v0Var.setPosition(0);
                if (m.verifyBitstreamType(v0Var)) {
                    this.f76023b = new m();
                } else {
                    v0Var.setPosition(0);
                    if (i.verifyBitstreamType(v0Var)) {
                        this.f76023b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f76022a = sVar;
    }

    @Override // ee.p
    public int read(q qVar, f0 f0Var) throws IOException {
        int i10;
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f76022a);
        if (this.f76023b == null) {
            if (!a(qVar)) {
                throw h2.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            qVar.resetPeekPosition();
        }
        if (!this.f76024c) {
            l0 l0VarTrack = this.f76022a.track(0, 1);
            this.f76022a.endTracks();
            k kVar = this.f76023b;
            kVar.f76042c = this.f76022a;
            kVar.f76041b = l0VarTrack;
            kVar.d(true);
            this.f76024c = true;
        }
        k kVar2 = this.f76023b;
        f fVar = kVar2.f76040a;
        com.google.android.exoplayer2.util.a.checkStateNotNull(kVar2.f76041b);
        n1.castNonNull(kVar2.f76042c);
        int i11 = kVar2.f76047h;
        if (i11 == 0) {
            while (fVar.populate(qVar)) {
                kVar2.f76050k = qVar.getPosition() - kVar2.f76045f;
                if (!kVar2.c(fVar.getPayload(), kVar2.f76045f, kVar2.f76049j)) {
                    z0 z0Var = (z0) kVar2.f76049j.f6756a;
                    kVar2.f76048i = z0Var.B;
                    if (!kVar2.f76052m) {
                        kVar2.f76041b.format(z0Var);
                        kVar2.f76052m = true;
                    }
                    c cVar = (c) kVar2.f76049j.f6757b;
                    if (cVar != null) {
                        kVar2.f76043d = cVar;
                    } else {
                        if (qVar.getLength() != -1) {
                            g pageHeader = fVar.getPageHeader();
                            i10 = 2;
                            kVar2.f76043d = new b(kVar2, kVar2.f76045f, qVar.getLength(), pageHeader.f76033d + pageHeader.f76034e, pageHeader.f76031b, (pageHeader.f76030a & 4) != 0);
                            kVar2.f76047h = i10;
                            fVar.trimPayload();
                            return 0;
                        }
                        kVar2.f76043d = new j();
                    }
                    i10 = 2;
                    kVar2.f76047h = i10;
                    fVar.trimPayload();
                    return 0;
                }
                kVar2.f76045f = qVar.getPosition();
            }
            kVar2.f76047h = 3;
            return -1;
        }
        if (i11 == 1) {
            qVar.skipFully((int) kVar2.f76045f);
            kVar2.f76047h = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        n1.castNonNull(kVar2.f76043d);
        long j10 = kVar2.f76043d.read(qVar);
        if (j10 >= 0) {
            f0Var.f54188a = j10;
            return 1;
        }
        if (j10 < -1) {
            kVar2.a(-(j10 + 2));
        }
        if (!kVar2.f76051l) {
            kVar2.f76042c.seekMap((i0) com.google.android.exoplayer2.util.a.checkStateNotNull(kVar2.f76043d.createSeekMap()));
            kVar2.f76051l = true;
        }
        if (kVar2.f76050k <= 0 && !fVar.populate(qVar)) {
            kVar2.f76047h = 3;
            return -1;
        }
        kVar2.f76050k = 0L;
        v0 payload = fVar.getPayload();
        long jB = kVar2.b(payload);
        if (jB >= 0) {
            long j11 = kVar2.f76046g;
            if (j11 + jB >= kVar2.f76044e) {
                kVar2.f76041b.sampleData(payload, payload.limit());
                kVar2.f76041b.sampleMetadata((j11 * 1000000) / kVar2.f76048i, 1, payload.limit(), 0, null);
                kVar2.f76044e = -1L;
            }
        }
        kVar2.f76046g += jB;
        return 0;
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        k kVar = this.f76023b;
        if (kVar != null) {
            kVar.f76040a.reset();
            if (j10 == 0) {
                kVar.d(!kVar.f76051l);
            } else if (kVar.f76047h != 0) {
                kVar.f76044e = (kVar.f76048i * j11) / 1000000;
                ((h) n1.castNonNull(kVar.f76043d)).startSeek(kVar.f76044e);
                kVar.f76047h = 2;
            }
        }
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        try {
            return a(qVar);
        } catch (h2 unused) {
            return false;
        }
    }

    @Override // ee.p
    public void release() {
    }
}
