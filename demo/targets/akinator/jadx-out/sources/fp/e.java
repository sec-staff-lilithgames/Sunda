package fp;

import gn.z0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.e1;
import ko.v0;
import ko.y0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e implements z {

    /* renamed from: a, reason: collision with root package name */
    public c0 f55949a;

    /* renamed from: b, reason: collision with root package name */
    public k f55950b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f55951c;

    public final boolean a(a0 a0Var) throws IOException {
        g gVar = new g();
        if (gVar.populate(a0Var, true) && (gVar.f55957a & 2) == 2) {
            int iMin = Math.min(gVar.f55961e, 8);
            m0 m0Var = new m0(iMin);
            a0Var.peekFully(m0Var.getData(), 0, iMin);
            m0Var.setPosition(0);
            if (d.verifyBitstreamType(m0Var)) {
                this.f55950b = new d();
            } else {
                m0Var.setPosition(0);
                if (m.verifyBitstreamType(m0Var)) {
                    this.f55950b = new m();
                } else {
                    m0Var.setPosition(0);
                    if (i.verifyBitstreamType(m0Var)) {
                        this.f55950b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        this.f55949a = c0Var;
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        int i10;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f55949a);
        if (this.f55950b == null) {
            if (!a(a0Var)) {
                throw z0.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            a0Var.resetPeekPosition();
        }
        if (!this.f55951c) {
            e1 e1VarTrack = this.f55949a.track(0, 1);
            this.f55949a.endTracks();
            k kVar = this.f55950b;
            kVar.f55969c = this.f55949a;
            kVar.f55968b = e1VarTrack;
            kVar.d(true);
            this.f55951c = true;
        }
        k kVar2 = this.f55950b;
        f fVar = kVar2.f55967a;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar2.f55968b);
        a1.castNonNull(kVar2.f55969c);
        int i11 = kVar2.f55974h;
        if (i11 == 0) {
            while (fVar.populate(a0Var)) {
                kVar2.f55977k = a0Var.getPosition() - kVar2.f55972f;
                if (!kVar2.c(fVar.getPayload(), kVar2.f55972f, kVar2.f55976j)) {
                    io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) kVar2.f55976j.f6756a;
                    kVar2.f55975i = bVar.F;
                    if (!kVar2.f55979m) {
                        kVar2.f55968b.format(bVar);
                        kVar2.f55979m = true;
                    }
                    c cVar = (c) kVar2.f55976j.f6757b;
                    if (cVar != null) {
                        kVar2.f55970d = cVar;
                    } else {
                        if (a0Var.getLength() != -1) {
                            g pageHeader = fVar.getPageHeader();
                            i10 = 2;
                            kVar2.f55970d = new b(kVar2, kVar2.f55972f, a0Var.getLength(), pageHeader.f55960d + pageHeader.f55961e, pageHeader.f55958b, (pageHeader.f55957a & 4) != 0);
                            kVar2.f55974h = i10;
                            fVar.trimPayload();
                            return 0;
                        }
                        kVar2.f55970d = new j();
                    }
                    i10 = 2;
                    kVar2.f55974h = i10;
                    fVar.trimPayload();
                    return 0;
                }
                kVar2.f55972f = a0Var.getPosition();
            }
            kVar2.f55974h = 3;
            return -1;
        }
        if (i11 == 1) {
            a0Var.skipFully((int) kVar2.f55972f);
            kVar2.f55974h = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        a1.castNonNull(kVar2.f55970d);
        long j10 = kVar2.f55970d.read(a0Var);
        if (j10 >= 0) {
            v0Var.f71790a = j10;
            return 1;
        }
        if (j10 < -1) {
            kVar2.a(-(j10 + 2));
        }
        if (!kVar2.f55978l) {
            y0 y0Var = (y0) io.bidmachine.media3.common.util.a.checkStateNotNull(kVar2.f55970d.createSeekMap());
            kVar2.f55969c.seekMap(y0Var);
            kVar2.f55968b.durationUs(y0Var.getDurationUs());
            kVar2.f55978l = true;
        }
        if (kVar2.f55977k <= 0 && !fVar.populate(a0Var)) {
            kVar2.f55974h = 3;
            return -1;
        }
        kVar2.f55977k = 0L;
        m0 payload = fVar.getPayload();
        long jB = kVar2.b(payload);
        if (jB >= 0) {
            long j11 = kVar2.f55973g;
            if (j11 + jB >= kVar2.f55971e) {
                kVar2.f55968b.sampleData(payload, payload.limit());
                kVar2.f55968b.sampleMetadata((j11 * 1000000) / kVar2.f55975i, 1, payload.limit(), 0, null);
                kVar2.f55971e = -1L;
            }
        }
        kVar2.f55973g += jB;
        return 0;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        k kVar = this.f55950b;
        if (kVar != null) {
            kVar.f55967a.reset();
            if (j10 == 0) {
                kVar.d(!kVar.f55978l);
            } else if (kVar.f55974h != 0) {
                kVar.f55971e = (kVar.f55975i * j11) / 1000000;
                ((h) a1.castNonNull(kVar.f55970d)).startSeek(kVar.f55971e);
                kVar.f55974h = 2;
            }
        }
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        try {
            return a(a0Var);
        } catch (z0 unused) {
            return false;
        }
    }

    @Override // ko.z
    public void release() {
    }
}
