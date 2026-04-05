package wn;

import android.graphics.Bitmap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.w0;
import io.bidmachine.media3.exoplayer.a0;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.exoplayer.r0;
import io.bidmachine.media3.exoplayer.u1;
import java.util.ArrayDeque;
import nn.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j extends io.bidmachine.media3.exoplayer.i {
    public long A;
    public int B;
    public int C;
    public io.bidmachine.media3.common.b D;
    public f E;
    public nn.g F;
    public ImageOutput G;
    public Bitmap H;
    public boolean I;
    public b J;
    public b K;
    public int L;
    public boolean M;

    /* renamed from: t, reason: collision with root package name */
    public final e f90752t;

    /* renamed from: u, reason: collision with root package name */
    public final nn.g f90753u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayDeque f90754v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f90755w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f90756x;

    /* renamed from: y, reason: collision with root package name */
    public a f90757y;

    /* renamed from: z, reason: collision with root package name */
    public long f90758z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f90759c = new a(C.TIME_UNSET, C.TIME_UNSET);

        /* renamed from: a, reason: collision with root package name */
        public final long f90760a;

        /* renamed from: b, reason: collision with root package name */
        public final long f90761b;

        public a(long j10, long j11) {
            this.f90760a = j10;
            this.f90761b = j11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f90762a;

        /* renamed from: b, reason: collision with root package name */
        public final long f90763b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f90764c;

        public b(int i10, long j10) {
            this.f90762a = i10;
            this.f90763b = j10;
        }

        public long getPresentationTimeUs() {
            return this.f90763b;
        }

        public Bitmap getTileBitmap() {
            return this.f90764c;
        }

        public int getTileIndex() {
            return this.f90762a;
        }

        public boolean hasTileBitmap() {
            return this.f90764c != null;
        }

        public void setTileBitmap(Bitmap bitmap) {
            this.f90764c = bitmap;
        }
    }

    public j(e eVar, ImageOutput imageOutput) {
        super(4);
        this.f90752t = eVar;
        this.G = imageOutput == null ? ImageOutput.f61275a : imageOutput;
        this.f90753u = nn.g.newNoDataInstance();
        this.f90757y = a.f90759c;
        this.f90754v = new ArrayDeque();
        this.A = C.TIME_UNSET;
        this.f90758z = C.TIME_UNSET;
        this.B = 0;
        this.C = 1;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void d() throws InterruptedException {
        this.D = null;
        this.f90757y = a.f90759c;
        this.f90754v.clear();
        p();
        this.G.onDisabled();
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void e(boolean z10, boolean z11) {
        this.C = z11 ? 1 : 0;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void f(long j10, boolean z10) {
        this.C = Math.min(this.C, 1);
        this.f90756x = false;
        this.f90755w = false;
        this.H = null;
        this.J = null;
        this.K = null;
        this.I = false;
        this.F = null;
        nn.e eVar = this.E;
        if (eVar != null) {
            ((k) eVar).flush();
        }
        this.f90754v.clear();
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void g() throws InterruptedException {
        p();
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return super.getDurationToProgressUs(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public String getName() {
        return "ImageRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void h() throws InterruptedException {
        p();
        this.C = Math.min(this.C, 1);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.n1
    public void handleMessage(int i10, Object obj) throws a0 {
        if (i10 != 15) {
            super.handleMessage(i10, obj);
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f61275a;
        }
        this.G = imageOutput;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isEnded() {
        return this.f90756x;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isReady() {
        int i10 = this.C;
        if (i10 != 3) {
            return i10 == 0 && this.I;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // io.bidmachine.media3.exoplayer.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(io.bidmachine.media3.common.b[] r5, long r6, long r8, ao.k0 r10) {
        /*
            r4 = this;
            wn.j$a r5 = r4.f90757y
            long r5 = r5.f90761b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f90754v
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.A
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f90758z
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            wn.j$a r6 = new wn.j$a
            long r0 = r4.A
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            wn.j$a r5 = new wn.j$a
            r5.<init>(r0, r8)
            r4.f90757y = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.j.k(io.bidmachine.media3.common.b[], long, long, ao.k0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(long r13) throws java.lang.InterruptedException, wn.g, io.bidmachine.media3.exoplayer.a0 {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.j.m(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(long r12) throws nn.f {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.j.n(long):boolean");
    }

    public final void o() throws InterruptedException, a0 {
        if (this.M) {
            io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.D);
            e eVar = this.f90752t;
            int iSupportsFormat = eVar.supportsFormat(bVar);
            if (iSupportsFormat != u1.create(4) && iSupportsFormat != u1.create(3)) {
                throw a(new g("Provided decoder factory can't create decoder for format."), this.D, false, 4005);
            }
            nn.e eVar2 = this.E;
            if (eVar2 != null) {
                ((k) eVar2).release();
            }
            this.E = eVar.createImageDecoder();
            this.M = false;
        }
    }

    public final void p() throws InterruptedException {
        this.F = null;
        this.B = 0;
        this.A = C.TIME_UNSET;
        nn.e eVar = this.E;
        if (eVar != null) {
            ((k) eVar).release();
            this.E = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void render(long j10, long j11) throws InterruptedException, a0 {
        if (this.f90756x) {
            return;
        }
        if (this.D == null) {
            r0 r0Var = this.f61238e;
            r0Var.clear();
            nn.g gVar = this.f90753u;
            gVar.clear();
            int iL = l(r0Var, gVar, 2);
            if (iL != -5) {
                if (iL == -4) {
                    io.bidmachine.media3.common.util.a.checkState(gVar.isEndOfStream());
                    this.f90755w = true;
                    this.f90756x = true;
                    return;
                }
                return;
            }
            this.D = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkStateNotNull(r0Var.f61543b);
            this.M = true;
        }
        if (this.E == null) {
            o();
        }
        try {
            w0.beginSection("drainAndFeedDecoder");
            while (m(j10)) {
            }
            while (n(j10)) {
            }
            w0.endSection();
        } catch (g e10) {
            throw a(e10, null, false, 4003);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws a0 {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.u1
    public int supportsFormat(io.bidmachine.media3.common.b bVar) {
        return this.f90752t.supportsFormat(bVar);
    }
}
