package dp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.t0;
import gn.u0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.e1;
import ko.n0;
import ko.p0;
import ko.r0;
import ko.s0;
import ko.v;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;
import yo.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements z {

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.a f52420v = new com.google.android.gms.internal.ads.a(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f52421a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52422b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f52423c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f52424d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f52425e;

    /* renamed from: f, reason: collision with root package name */
    public final p0 f52426f;

    /* renamed from: g, reason: collision with root package name */
    public final v f52427g;

    /* renamed from: h, reason: collision with root package name */
    public c0 f52428h;

    /* renamed from: i, reason: collision with root package name */
    public e1 f52429i;

    /* renamed from: j, reason: collision with root package name */
    public e1 f52430j;

    /* renamed from: k, reason: collision with root package name */
    public int f52431k;

    /* renamed from: l, reason: collision with root package name */
    public u0 f52432l;

    /* renamed from: m, reason: collision with root package name */
    public long f52433m;

    /* renamed from: n, reason: collision with root package name */
    public long f52434n;

    /* renamed from: o, reason: collision with root package name */
    public long f52435o;

    /* renamed from: p, reason: collision with root package name */
    public long f52436p;

    /* renamed from: q, reason: collision with root package name */
    public int f52437q;

    /* renamed from: r, reason: collision with root package name */
    public f f52438r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f52439s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f52440t;

    /* renamed from: u, reason: collision with root package name */
    public long f52441u;

    public d() {
        this(0);
    }

    public static long a(u0 u0Var) {
        if (u0Var == null) {
            return C.TIME_UNSET;
        }
        int length = u0Var.length();
        for (int i10 = 0; i10 < length; i10++) {
            t0 t0Var = u0Var.get(i10);
            if (t0Var instanceof n) {
                n nVar = (n) t0Var;
                if (nVar.f94736a.equals("TLEN")) {
                    return a1.msToUs(Long.parseLong((String) nVar.f94749c.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final void b() {
        f fVar = this.f52438r;
        if ((fVar instanceof a) && fVar.isSeekable()) {
            long j10 = this.f52436p;
            if (j10 == -1 || j10 == this.f52438r.getDataEndPosition()) {
                return;
            }
            this.f52438r = ((a) this.f52438r).copyWithNewDataEndPosition(this.f52436p);
            ((c0) io.bidmachine.media3.common.util.a.checkNotNull(this.f52428h)).seekMap(this.f52438r);
            ((e1) io.bidmachine.media3.common.util.a.checkNotNull(this.f52429i)).durationUs(this.f52438r.getDurationUs());
        }
    }

    public final boolean c(a0 a0Var) {
        f fVar = this.f52438r;
        if (fVar != null) {
            long dataEndPosition = fVar.getDataEndPosition();
            if (dataEndPosition != -1 && a0Var.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !a0Var.peekFully(this.f52423c.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean d(a0 a0Var, boolean z10) throws Throwable {
        int peekPosition;
        int i10;
        int frameSize;
        int i11 = z10 ? 32768 : 131072;
        a0Var.resetPeekPosition();
        if (a0Var.getPosition() == 0) {
            u0 u0VarPeekId3Data = this.f52426f.peekId3Data(a0Var, (this.f52421a & 8) == 0 ? null : f52420v);
            this.f52432l = u0VarPeekId3Data;
            if (u0VarPeekId3Data != null) {
                this.f52425e.setFromMetadata(u0VarPeekId3Data);
            }
            peekPosition = (int) a0Var.getPeekPosition();
            if (!z10) {
                a0Var.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!c(a0Var)) {
                m0 m0Var = this.f52423c;
                m0Var.setPosition(0);
                int i14 = m0Var.readInt();
                if ((i10 == 0 || ((-128000) & i14) == (i10 & (-128000))) && (frameSize = s0.getFrameSize(i14)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f52424d.setForHeaderData(i14);
                        i10 = i14;
                    }
                    a0Var.advancePeekPosition(frameSize - 4);
                } else {
                    int i15 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        b();
                        throw new EOFException();
                    }
                    if (z10) {
                        a0Var.resetPeekPosition();
                        a0Var.advancePeekPosition(peekPosition + i15);
                    } else {
                        a0Var.skipFully(1);
                    }
                    i12 = 0;
                    i13 = i15;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                b();
                throw new EOFException();
            }
        }
        if (z10) {
            a0Var.skipFully(peekPosition + i13);
        } else {
            a0Var.resetPeekPosition();
        }
        this.f52431k = i10;
        return true;
    }

    public void disableSeeking() {
        this.f52439s = true;
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
        this.f52428h = c0Var;
        e1 e1VarTrack = c0Var.track(0, 1);
        this.f52429i = e1VarTrack;
        this.f52430j = e1VarTrack;
        this.f52428h.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r41, ko.v0 r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.d.read(ko.a0, ko.v0):int");
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f52431k = 0;
        this.f52433m = C.TIME_UNSET;
        this.f52434n = 0L;
        this.f52437q = 0;
        this.f52441u = j11;
        f fVar = this.f52438r;
        if (!(fVar instanceof b) || ((b) fVar).isTimeUsInIndex(j11)) {
            return;
        }
        this.f52440t = true;
        this.f52430j = this.f52427g;
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        return d(a0Var, true);
    }

    public d(int i10) {
        this(i10, C.TIME_UNSET);
    }

    public d(int i10, long j10) {
        this.f52421a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f52422b = j10;
        this.f52423c = new m0(10);
        this.f52424d = new r0();
        this.f52425e = new n0();
        this.f52433m = C.TIME_UNSET;
        this.f52426f = new p0();
        v vVar = new v();
        this.f52427g = vVar;
        this.f52430j = vVar;
        this.f52436p = -1L;
    }

    @Override // ko.z
    public void release() {
    }
}
