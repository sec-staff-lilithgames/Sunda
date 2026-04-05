package ge;

import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.g0;
import ee.i0;
import ee.n;
import ee.p;
import ee.q;
import ee.s;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements p {

    /* renamed from: c, reason: collision with root package name */
    public int f57558c;

    /* renamed from: e, reason: collision with root package name */
    public d f57560e;

    /* renamed from: h, reason: collision with root package name */
    public long f57563h;

    /* renamed from: i, reason: collision with root package name */
    public f f57564i;

    /* renamed from: m, reason: collision with root package name */
    public int f57568m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f57569n;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f57556a = new v0(12);

    /* renamed from: b, reason: collision with root package name */
    public final c f57557b = new c();

    /* renamed from: d, reason: collision with root package name */
    public s f57559d = new n();

    /* renamed from: g, reason: collision with root package name */
    public f[] f57562g = new f[0];

    /* renamed from: k, reason: collision with root package name */
    public long f57566k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f57567l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f57565j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f57561f = C.TIME_UNSET;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements i0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f57570a;

        public a(long j10) {
            this.f57570a = j10;
        }

        @Override // ee.i0
        public long getDurationUs() {
            return this.f57570a;
        }

        @Override // ee.i0
        public g0 getSeekPoints(long j10) {
            b bVar = b.this;
            g0 seekPoints = bVar.f57562g[0].getSeekPoints(j10);
            int i10 = 1;
            while (true) {
                f[] fVarArr = bVar.f57562g;
                if (i10 >= fVarArr.length) {
                    return seekPoints;
                }
                g0 seekPoints2 = fVarArr[i10].getSeekPoints(j10);
                if (seekPoints2.f54193a.f54212b < seekPoints.f54193a.f54212b) {
                    seekPoints = seekPoints2;
                }
                i10++;
            }
        }

        @Override // ee.i0
        public boolean isSeekable() {
            return true;
        }
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f57558c = 0;
        this.f57559d = sVar;
        this.f57563h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02d6  */
    @Override // ee.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ee.q r21, ee.f0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.b.read(ee.q, ee.f0):int");
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.f57563h = -1L;
        this.f57564i = null;
        for (f fVar : this.f57562g) {
            fVar.seekToPosition(j10);
        }
        if (j10 != 0) {
            this.f57558c = 6;
        } else if (this.f57562g.length == 0) {
            this.f57558c = 0;
        } else {
            this.f57558c = 3;
        }
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        v0 v0Var = this.f57556a;
        qVar.peekFully(v0Var.getData(), 0, 12);
        v0Var.setPosition(0);
        if (v0Var.readLittleEndianInt() != 1179011410) {
            return false;
        }
        v0Var.skipBytes(4);
        return v0Var.readLittleEndianInt() == 541677121;
    }

    @Override // ee.p
    public void release() {
    }
}
