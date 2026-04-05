package io.odeeo.internal.j;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.h;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.l;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.q0.x;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements h {

    /* renamed from: q, reason: collision with root package name */
    public static final l f64344q = new bt.a(4);

    /* renamed from: f, reason: collision with root package name */
    public j f64350f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64352h;

    /* renamed from: i, reason: collision with root package name */
    public long f64353i;

    /* renamed from: j, reason: collision with root package name */
    public int f64354j;

    /* renamed from: k, reason: collision with root package name */
    public int f64355k;

    /* renamed from: l, reason: collision with root package name */
    public int f64356l;

    /* renamed from: m, reason: collision with root package name */
    public long f64357m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f64358n;

    /* renamed from: o, reason: collision with root package name */
    public a f64359o;

    /* renamed from: p, reason: collision with root package name */
    public e f64360p;

    /* renamed from: a, reason: collision with root package name */
    public final x f64345a = new x(4);

    /* renamed from: b, reason: collision with root package name */
    public final x f64346b = new x(9);

    /* renamed from: c, reason: collision with root package name */
    public final x f64347c = new x(11);

    /* renamed from: d, reason: collision with root package name */
    public final x f64348d = new x();

    /* renamed from: e, reason: collision with root package name */
    public final c f64349e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f64351g = 1;

    public static /* synthetic */ h[] c() {
        return new h[]{new b()};
    }

    public final x a(i iVar) throws IOException {
        if (this.f64356l > this.f64348d.capacity()) {
            x xVar = this.f64348d;
            xVar.reset(new byte[Math.max(xVar.capacity() * 2, this.f64356l)], 0);
        } else {
            this.f64348d.setPosition(0);
        }
        this.f64348d.setLimit(this.f64356l);
        iVar.readFully(this.f64348d.getData(), 0, this.f64356l);
        return this.f64348d;
    }

    @RequiresNonNull({"extractorOutput"})
    public final boolean b(i iVar) throws IOException {
        if (!iVar.readFully(this.f64346b.getData(), 0, 9, true)) {
            return false;
        }
        this.f64346b.setPosition(0);
        this.f64346b.skipBytes(4);
        int unsignedByte = this.f64346b.readUnsignedByte();
        boolean z10 = (unsignedByte & 4) != 0;
        boolean z11 = (unsignedByte & 1) != 0;
        if (z10 && this.f64359o == null) {
            this.f64359o = new a(this.f64350f.track(8, 1));
        }
        if (z11 && this.f64360p == null) {
            this.f64360p = new e(this.f64350f.track(9, 2));
        }
        this.f64350f.endTracks();
        this.f64354j = this.f64346b.readInt() - 5;
        this.f64351g = 2;
        return true;
    }

    public final boolean d(i iVar) throws IOException {
        if (!iVar.readFully(this.f64347c.getData(), 0, 11, true)) {
            return false;
        }
        this.f64347c.setPosition(0);
        this.f64355k = this.f64347c.readUnsignedByte();
        this.f64356l = this.f64347c.readUnsignedInt24();
        this.f64357m = this.f64347c.readUnsignedInt24();
        this.f64357m = ((this.f64347c.readUnsignedByte() << 24) | this.f64357m) * 1000;
        this.f64347c.skipBytes(3);
        this.f64351g = 4;
        return true;
    }

    public final void e(i iVar) throws IOException {
        iVar.skipFully(this.f64354j);
        this.f64354j = 0;
        this.f64351g = 3;
    }

    @Override // io.odeeo.internal.g.h
    public void init(j jVar) {
        this.f64350f = jVar;
    }

    @Override // io.odeeo.internal.g.h
    public int read(i iVar, u uVar) throws IOException {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f64350f);
        while (true) {
            int i10 = this.f64351g;
            if (i10 != 1) {
                if (i10 == 2) {
                    e(iVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (c(iVar)) {
                        return 0;
                    }
                } else if (!d(iVar)) {
                    return -1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f64351g = 1;
            this.f64352h = false;
        } else {
            this.f64351g = 3;
        }
        this.f64354j = 0;
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(i iVar) throws IOException {
        iVar.peekFully(this.f64345a.getData(), 0, 3);
        this.f64345a.setPosition(0);
        if (this.f64345a.readUnsignedInt24() != 4607062) {
            return false;
        }
        iVar.peekFully(this.f64345a.getData(), 0, 2);
        this.f64345a.setPosition(0);
        if ((this.f64345a.readUnsignedShort() & 250) != 0) {
            return false;
        }
        iVar.peekFully(this.f64345a.getData(), 0, 4);
        this.f64345a.setPosition(0);
        int i10 = this.f64345a.readInt();
        iVar.resetPeekPosition();
        iVar.advancePeekPosition(i10);
        iVar.peekFully(this.f64345a.getData(), 0, 4);
        this.f64345a.setPosition(0);
        return this.f64345a.readInt() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(io.odeeo.internal.g.i r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.b()
            int r2 = r9.f64355k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            io.odeeo.internal.j.a r3 = r9.f64359o
            if (r3 == 0) goto L23
            r9.a()
            io.odeeo.internal.j.a r2 = r9.f64359o
            io.odeeo.internal.q0.x r10 = r9.a(r10)
            boolean r10 = r2.consume(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            io.odeeo.internal.j.e r3 = r9.f64360p
            if (r3 == 0) goto L39
            r9.a()
            io.odeeo.internal.j.e r2 = r9.f64360p
            io.odeeo.internal.q0.x r10 = r9.a(r10)
            boolean r10 = r2.consume(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f64358n
            if (r2 != 0) goto L6e
            io.odeeo.internal.j.c r2 = r9.f64349e
            io.odeeo.internal.q0.x r10 = r9.a(r10)
            boolean r10 = r2.consume(r10, r0)
            io.odeeo.internal.j.c r0 = r9.f64349e
            long r0 = r0.getDurationUs()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            io.odeeo.internal.g.j r2 = r9.f64350f
            io.odeeo.internal.g.t r3 = new io.odeeo.internal.g.t
            io.odeeo.internal.j.c r7 = r9.f64349e
            long[] r7 = r7.getKeyFrameTagPositions()
            io.odeeo.internal.j.c r8 = r9.f64349e
            long[] r8 = r8.getKeyFrameTimesUs()
            r3.<init>(r7, r8, r0)
            r2.seekMap(r3)
            r9.f64358n = r6
            goto L21
        L6e:
            int r0 = r9.f64356l
            r10.skipFully(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f64352h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f64352h = r6
            io.odeeo.internal.j.c r10 = r9.f64349e
            long r1 = r10.getDurationUs()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f64357m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f64353i = r1
        L8f:
            r10 = 4
            r9.f64354j = r10
            r10 = 2
            r9.f64351g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.j.b.c(io.odeeo.internal.g.i):boolean");
    }

    @RequiresNonNull({"extractorOutput"})
    public final void a() {
        if (this.f64358n) {
            return;
        }
        this.f64350f.seekMap(new v.b(C.TIME_UNSET));
        this.f64358n = true;
    }

    public final long b() {
        if (this.f64352h) {
            return this.f64353i + this.f64357m;
        }
        if (this.f64349e.getDurationUs() == C.TIME_UNSET) {
            return 0L;
        }
        return this.f64357m;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }
}
