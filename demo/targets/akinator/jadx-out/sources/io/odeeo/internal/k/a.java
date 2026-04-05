package io.odeeo.internal.k;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.h;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.n.g;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.a;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public j f64407b;

    /* renamed from: c, reason: collision with root package name */
    public int f64408c;

    /* renamed from: d, reason: collision with root package name */
    public int f64409d;

    /* renamed from: e, reason: collision with root package name */
    public int f64410e;

    /* renamed from: g, reason: collision with root package name */
    public io.odeeo.internal.y.b f64412g;

    /* renamed from: h, reason: collision with root package name */
    public i f64413h;

    /* renamed from: i, reason: collision with root package name */
    public c f64414i;

    /* renamed from: j, reason: collision with root package name */
    public g f64415j;

    /* renamed from: a, reason: collision with root package name */
    public final x f64406a = new x(6);

    /* renamed from: f, reason: collision with root package name */
    public long f64411f = -1;

    public final void a(i iVar) throws IOException {
        this.f64406a.reset(2);
        iVar.peekFully(this.f64406a.getData(), 0, 2);
        iVar.advancePeekPosition(this.f64406a.readUnsignedShort() - 2);
    }

    public final int b(i iVar) throws IOException {
        this.f64406a.reset(2);
        iVar.peekFully(this.f64406a.getData(), 0, 2);
        return this.f64406a.readUnsignedShort();
    }

    public final void c(i iVar) throws IOException {
        this.f64406a.reset(2);
        iVar.readFully(this.f64406a.getData(), 0, 2);
        int unsignedShort = this.f64406a.readUnsignedShort();
        this.f64409d = unsignedShort;
        if (unsignedShort == 65498) {
            if (this.f64411f != -1) {
                this.f64408c = 4;
                return;
            } else {
                a();
                return;
            }
        }
        if ((unsignedShort < 65488 || unsignedShort > 65497) && unsignedShort != 65281) {
            this.f64408c = 1;
        }
    }

    public final void d(i iVar) throws IOException {
        String nullTerminatedString;
        if (this.f64409d == 65505) {
            x xVar = new x(this.f64410e);
            iVar.readFully(xVar.getData(), 0, this.f64410e);
            if (this.f64412g == null && "http://ns.adobe.com/xap/1.0/".equals(xVar.readNullTerminatedString()) && (nullTerminatedString = xVar.readNullTerminatedString()) != null) {
                io.odeeo.internal.y.b bVarA = a(nullTerminatedString, iVar.getLength());
                this.f64412g = bVarA;
                if (bVarA != null) {
                    this.f64411f = bVarA.f67533d;
                }
            }
        } else {
            iVar.skipFully(this.f64410e);
        }
        this.f64408c = 0;
    }

    public final void e(i iVar) throws IOException {
        this.f64406a.reset(2);
        iVar.readFully(this.f64406a.getData(), 0, 2);
        this.f64410e = this.f64406a.readUnsignedShort() - 2;
        this.f64408c = 2;
    }

    public final void f(i iVar) throws IOException {
        if (!iVar.peekFully(this.f64406a.getData(), 0, 1, true)) {
            a();
            return;
        }
        iVar.resetPeekPosition();
        if (this.f64415j == null) {
            this.f64415j = new g();
        }
        c cVar = new c(iVar, this.f64411f);
        this.f64414i = cVar;
        if (!this.f64415j.sniff(cVar)) {
            a();
        } else {
            this.f64415j.init(new d(this.f64411f, (j) io.odeeo.internal.q0.a.checkNotNull(this.f64407b)));
            b();
        }
    }

    @Override // io.odeeo.internal.g.h
    public void init(j jVar) {
        this.f64407b = jVar;
    }

    @Override // io.odeeo.internal.g.h
    public int read(i iVar, u uVar) throws IOException {
        int i10 = this.f64408c;
        if (i10 == 0) {
            c(iVar);
            return 0;
        }
        if (i10 == 1) {
            e(iVar);
            return 0;
        }
        if (i10 == 2) {
            d(iVar);
            return 0;
        }
        if (i10 == 4) {
            long position = iVar.getPosition();
            long j10 = this.f64411f;
            if (position != j10) {
                uVar.f64171a = j10;
                return 1;
            }
            f(iVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f64414i == null || iVar != this.f64413h) {
            this.f64413h = iVar;
            this.f64414i = new c(iVar, this.f64411f);
        }
        int i11 = ((g) io.odeeo.internal.q0.a.checkNotNull(this.f64415j)).read(this.f64414i, uVar);
        if (i11 == 1) {
            uVar.f64171a += this.f64411f;
        }
        return i11;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
        g gVar = this.f64415j;
        if (gVar != null) {
            gVar.release();
        }
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f64408c = 0;
            this.f64415j = null;
        } else if (this.f64408c == 5) {
            ((g) io.odeeo.internal.q0.a.checkNotNull(this.f64415j)).seek(j10, j11);
        }
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(i iVar) throws IOException {
        if (b(iVar) != 65496) {
            return false;
        }
        int iB = b(iVar);
        this.f64409d = iB;
        if (iB == 65504) {
            a(iVar);
            this.f64409d = b(iVar);
        }
        if (this.f64409d != 65505) {
            return false;
        }
        iVar.advancePeekPosition(2);
        this.f64406a.reset(6);
        iVar.peekFully(this.f64406a.getData(), 0, 6);
        return this.f64406a.readUnsignedInt() == 1165519206 && this.f64406a.readUnsignedShort() == 0;
    }

    public final void b() {
        a((a.b) io.odeeo.internal.q0.a.checkNotNull(this.f64412g));
        this.f64408c = 5;
    }

    public final void a() {
        a(new a.b[0]);
        ((j) io.odeeo.internal.q0.a.checkNotNull(this.f64407b)).endTracks();
        this.f64407b.seekMap(new v.b(C.TIME_UNSET));
        this.f64408c = 6;
    }

    public final void a(a.b... bVarArr) {
        ((j) io.odeeo.internal.q0.a.checkNotNull(this.f64407b)).track(1024, 4).format(new t.b().setContainerMimeType("image/jpeg").setMetadata(new io.odeeo.internal.s.a(bVarArr)).build());
    }

    public static io.odeeo.internal.y.b a(String str, long j10) throws IOException {
        b bVar;
        if (j10 == -1 || (bVar = e.parse(str)) == null) {
            return null;
        }
        return bVar.getMotionPhotoMetadata(j10);
    }
}
