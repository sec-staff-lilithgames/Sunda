package le;

import com.google.android.exoplayer2.audio.j1;
import com.google.android.exoplayer2.audio.k1;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.c0;
import ee.d0;
import ee.l0;
import ee.o;
import ee.p;
import ee.q;
import ee.s;
import j1.u;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements p {

    /* renamed from: u, reason: collision with root package name */
    public static final u f73334u = new u(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f73335a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73336b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f73337c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f73338d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f73339e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f73340f;

    /* renamed from: g, reason: collision with root package name */
    public final o f73341g;

    /* renamed from: h, reason: collision with root package name */
    public s f73342h;

    /* renamed from: i, reason: collision with root package name */
    public l0 f73343i;

    /* renamed from: j, reason: collision with root package name */
    public l0 f73344j;

    /* renamed from: k, reason: collision with root package name */
    public int f73345k;

    /* renamed from: l, reason: collision with root package name */
    public Metadata f73346l;

    /* renamed from: m, reason: collision with root package name */
    public long f73347m;

    /* renamed from: n, reason: collision with root package name */
    public long f73348n;

    /* renamed from: o, reason: collision with root package name */
    public long f73349o;

    /* renamed from: p, reason: collision with root package name */
    public int f73350p;

    /* renamed from: q, reason: collision with root package name */
    public f f73351q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f73352r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f73353s;

    /* renamed from: t, reason: collision with root package name */
    public long f73354t;

    public d() {
        this(0);
    }

    public static long b(Metadata metadata) {
        if (metadata == null) {
            return C.TIME_UNSET;
        }
        int length = metadata.length();
        for (int i10 = 0; i10 < length; i10++) {
            Metadata.Entry entry = metadata.get(i10);
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f27763b.equals("TLEN")) {
                    return n1.msToUs(Long.parseLong((String) textInformationFrame.f27775e.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final a a(q qVar, boolean z10) throws IOException {
        v0 v0Var = this.f73337c;
        qVar.peekFully(v0Var.getData(), 0, 4);
        v0Var.setPosition(0);
        this.f73338d.setForHeaderData(v0Var.readInt());
        return new a(qVar.getLength(), qVar.getPosition(), this.f73338d, z10);
    }

    public final boolean c(q qVar) {
        f fVar = this.f73351q;
        if (fVar != null) {
            long dataEndPosition = fVar.getDataEndPosition();
            if (dataEndPosition != -1 && qVar.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !qVar.peekFully(this.f73337c.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean d(q qVar, boolean z10) throws Throwable {
        int peekPosition;
        int i10;
        int frameSize;
        int i11 = z10 ? 32768 : 131072;
        qVar.resetPeekPosition();
        if (qVar.getPosition() == 0) {
            Metadata metadataPeekId3Data = this.f73340f.peekId3Data(qVar, (this.f73335a & 8) == 0 ? null : f73334u);
            this.f73346l = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.f73339e.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) qVar.getPeekPosition();
            if (!z10) {
                qVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!c(qVar)) {
                v0 v0Var = this.f73337c;
                v0Var.setPosition(0);
                int i14 = v0Var.readInt();
                if ((i10 == 0 || ((-128000) & i14) == (i10 & (-128000))) && (frameSize = k1.getFrameSize(i14)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f73338d.setForHeaderData(i14);
                        i10 = i14;
                    }
                    qVar.advancePeekPosition(frameSize - 4);
                } else {
                    int i15 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw h2.createForMalformedContainer("Searched too many bytes.", null);
                    }
                    if (z10) {
                        qVar.resetPeekPosition();
                        qVar.advancePeekPosition(peekPosition + i15);
                    } else {
                        qVar.skipFully(1);
                    }
                    i12 = 0;
                    i13 = i15;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            qVar.skipFully(peekPosition + i13);
        } else {
            qVar.resetPeekPosition();
        }
        this.f73345k = i10;
        return true;
    }

    public void disableSeeking() {
        this.f73352r = true;
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f73342h = sVar;
        l0 l0VarTrack = sVar.track(0, 1);
        this.f73343i = l0VarTrack;
        this.f73344j = l0VarTrack;
        this.f73342h.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // ee.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ee.q r31, ee.f0 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: le.d.read(ee.q, ee.f0):int");
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.f73345k = 0;
        this.f73347m = C.TIME_UNSET;
        this.f73348n = 0L;
        this.f73350p = 0;
        this.f73354t = j11;
        f fVar = this.f73351q;
        if (!(fVar instanceof b) || ((b) fVar).isTimeUsInIndex(j11)) {
            return;
        }
        this.f73353s = true;
        this.f73344j = this.f73341g;
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        return d(qVar, true);
    }

    public d(int i10) {
        this(i10, C.TIME_UNSET);
    }

    public d(int i10, long j10) {
        this.f73335a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f73336b = j10;
        this.f73337c = new v0(10);
        this.f73338d = new j1();
        this.f73339e = new c0();
        this.f73347m = C.TIME_UNSET;
        this.f73340f = new d0();
        o oVar = new o();
        this.f73341g = oVar;
        this.f73344j = oVar;
    }

    @Override // ee.p
    public void release() {
    }
}
