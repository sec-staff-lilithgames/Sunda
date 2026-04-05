package io.odeeo.internal.h;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.d;
import io.odeeo.internal.g.h;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.l;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.x;
import io.odeeo.internal.p0.g;
import io.odeeo.internal.q0.g0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements h {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f64259r;

    /* renamed from: u, reason: collision with root package name */
    public static final int f64262u;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64264b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64265c;

    /* renamed from: d, reason: collision with root package name */
    public long f64266d;

    /* renamed from: e, reason: collision with root package name */
    public int f64267e;

    /* renamed from: f, reason: collision with root package name */
    public int f64268f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f64269g;

    /* renamed from: h, reason: collision with root package name */
    public long f64270h;

    /* renamed from: i, reason: collision with root package name */
    public int f64271i;

    /* renamed from: j, reason: collision with root package name */
    public int f64272j;

    /* renamed from: k, reason: collision with root package name */
    public long f64273k;

    /* renamed from: l, reason: collision with root package name */
    public j f64274l;

    /* renamed from: m, reason: collision with root package name */
    public x f64275m;

    /* renamed from: n, reason: collision with root package name */
    public v f64276n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f64277o;

    /* renamed from: p, reason: collision with root package name */
    public static final l f64257p = new bt.a(2);

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f64258q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f64260s = g0.getUtf8Bytes("#!AMR\n");

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f64261t = g0.getUtf8Bytes("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f64259r = iArr;
        f64262u = iArr[8];
    }

    public a() {
        this(0);
    }

    public static boolean a(i iVar, byte[] bArr) throws IOException {
        iVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        iVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public static /* synthetic */ h[] b() {
        return new h[]{new a()};
    }

    @RequiresNonNull({"trackOutput"})
    public final void c() {
        if (this.f64277o) {
            return;
        }
        this.f64277o = true;
        boolean z10 = this.f64265c;
        this.f64275m.format(new t.b().setSampleMimeType(z10 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).setMaxInputSize(f64262u).setChannelCount(1).setSampleRate(z10 ? 16000 : 8000).build());
    }

    public final boolean d(int i10) {
        if (this.f64265c) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    @Override // io.odeeo.internal.g.h
    public void init(j jVar) {
        this.f64274l = jVar;
        this.f64275m = jVar.track(0, 1);
        jVar.endTracks();
    }

    @Override // io.odeeo.internal.g.h
    public int read(i iVar, u uVar) throws IOException {
        a();
        if (iVar.getPosition() == 0 && !b(iVar)) {
            throw io.odeeo.internal.b.g0.createForMalformedContainer("Could not find AMR header.", null);
        }
        c();
        int iC = c(iVar);
        a(iVar.getLength(), iC);
        return iC;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.f64266d = 0L;
        this.f64267e = 0;
        this.f64268f = 0;
        if (j10 != 0) {
            v vVar = this.f64276n;
            if (vVar instanceof d) {
                this.f64273k = ((d) vVar).getTimeUsAtPosition(j10);
                return;
            }
        }
        this.f64273k = 0L;
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(i iVar) throws IOException {
        return b(iVar);
    }

    public a(int i10) {
        this.f64264b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f64263a = new byte[1];
        this.f64271i = -1;
    }

    public final boolean b(i iVar) throws IOException {
        byte[] bArr = f64260s;
        if (a(iVar, bArr)) {
            this.f64265c = false;
            iVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f64261t;
        if (!a(iVar, bArr2)) {
            return false;
        }
        this.f64265c = true;
        iVar.skipFully(bArr2.length);
        return true;
    }

    public final int a(i iVar) throws IOException {
        iVar.resetPeekPosition();
        iVar.peekFully(this.f64263a, 0, 1);
        byte b10 = this.f64263a[0];
        if ((b10 & 131) <= 0) {
            return a((b10 >> 3) & 15);
        }
        throw io.odeeo.internal.b.g0.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b10), null);
    }

    public final boolean b(int i10) {
        if (this.f64265c) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    public final int a(int i10) throws io.odeeo.internal.b.g0 {
        if (c(i10)) {
            return this.f64265c ? f64259r[i10] : f64258q[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f64265c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw io.odeeo.internal.b.g0.createForMalformedContainer(sb2.toString(), null);
    }

    @RequiresNonNull({"trackOutput"})
    public final int c(i iVar) throws IOException {
        if (this.f64268f == 0) {
            try {
                int iA = a(iVar);
                this.f64267e = iA;
                this.f64268f = iA;
                if (this.f64271i == -1) {
                    this.f64270h = iVar.getPosition();
                    this.f64271i = this.f64267e;
                }
                if (this.f64271i == this.f64267e) {
                    this.f64272j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.f64275m.sampleData((g) iVar, this.f64268f, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i10 = this.f64268f - iSampleData;
        this.f64268f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f64275m.sampleMetadata(this.f64273k + this.f64266d, 1, this.f64267e, 0, null);
        this.f64266d += 20000;
        return 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void a(long j10, int i10) {
        int i11;
        if (this.f64269g) {
            return;
        }
        int i12 = this.f64264b;
        if ((i12 & 1) != 0 && j10 != -1 && ((i11 = this.f64271i) == -1 || i11 == this.f64267e)) {
            if (this.f64272j >= 20 || i10 == -1) {
                v vVarA = a(j10, (i12 & 2) != 0);
                this.f64276n = vVarA;
                this.f64274l.seekMap(vVarA);
                this.f64269g = true;
                return;
            }
            return;
        }
        v.b bVar = new v.b(C.TIME_UNSET);
        this.f64276n = bVar;
        this.f64274l.seekMap(bVar);
        this.f64269g = true;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    public final v a(long j10, boolean z10) {
        return new d(j10, this.f64270h, a(this.f64271i, 20000L), this.f64271i, z10);
    }

    public final boolean c(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return d(i10) || b(i10);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void a() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f64275m);
        g0.castNonNull(this.f64274l);
    }

    public static int a(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }
}
