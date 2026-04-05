package mo;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import hp.q;
import hp.t;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.t0;
import ko.w0;
import ko.y0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements z {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f74851a;

    /* renamed from: b, reason: collision with root package name */
    public final c f74852b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74853c;

    /* renamed from: d, reason: collision with root package name */
    public final q f74854d;

    /* renamed from: e, reason: collision with root package name */
    public int f74855e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f74856f;

    /* renamed from: g, reason: collision with root package name */
    public d f74857g;

    /* renamed from: h, reason: collision with root package name */
    public long f74858h;

    /* renamed from: i, reason: collision with root package name */
    public f[] f74859i;

    /* renamed from: j, reason: collision with root package name */
    public long f74860j;

    /* renamed from: k, reason: collision with root package name */
    public f f74861k;

    /* renamed from: l, reason: collision with root package name */
    public int f74862l;

    /* renamed from: m, reason: collision with root package name */
    public long f74863m;

    /* renamed from: n, reason: collision with root package name */
    public long f74864n;

    /* renamed from: o, reason: collision with root package name */
    public int f74865o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f74866p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements y0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f74867a;

        public a(long j10) {
            this.f74867a = j10;
        }

        @Override // ko.y0
        public long getDurationUs() {
            return this.f74867a;
        }

        @Override // ko.y0
        public w0 getSeekPoints(long j10) {
            b bVar = b.this;
            w0 seekPoints = bVar.f74859i[0].getSeekPoints(j10);
            int i10 = 1;
            while (true) {
                f[] fVarArr = bVar.f74859i;
                if (i10 >= fVarArr.length) {
                    return seekPoints;
                }
                w0 seekPoints2 = fVarArr[i10].getSeekPoints(j10);
                if (seekPoints2.f71792a.f71812b < seekPoints.f71792a.f71812b) {
                    seekPoints = seekPoints2;
                }
                i10++;
            }
        }

        @Override // ko.y0
        public boolean isSeekable() {
            return true;
        }
    }

    @Deprecated
    public b() {
        this(1, q.f59124a);
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
        this.f74855e = 0;
        if (this.f74853c) {
            c0Var = new t(c0Var, this.f74854d);
        }
        this.f74856f = c0Var;
        this.f74860j = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02fa  */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r22, ko.v0 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo.b.read(ko.a0, ko.v0):int");
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f74860j = -1L;
        this.f74861k = null;
        for (f fVar : this.f74859i) {
            fVar.seekToPosition(j10);
        }
        if (j10 != 0) {
            this.f74855e = 6;
        } else if (this.f74859i.length == 0) {
            this.f74855e = 0;
        } else {
            this.f74855e = 3;
        }
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        m0 m0Var = this.f74851a;
        a0Var.peekFully(m0Var.getData(), 0, 12);
        m0Var.setPosition(0);
        if (m0Var.readLittleEndianInt() != 1179011410) {
            return false;
        }
        m0Var.skipBytes(4);
        return m0Var.readLittleEndianInt() == 541677121;
    }

    public b(int i10, q qVar) {
        this.f74854d = qVar;
        this.f74853c = (i10 & 1) == 0;
        this.f74851a = new m0(12);
        this.f74852b = new c();
        this.f74856f = new t0();
        this.f74859i = new f[0];
        this.f74863m = -1L;
        this.f74864n = -1L;
        this.f74862l = -1;
        this.f74858h = C.TIME_UNSET;
    }

    @Override // ko.z
    public void release() {
    }
}
