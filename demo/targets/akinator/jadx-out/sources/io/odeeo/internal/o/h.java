package io.odeeo.internal.o;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.x;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public x f65146b;

    /* renamed from: c, reason: collision with root package name */
    public j f65147c;

    /* renamed from: d, reason: collision with root package name */
    public f f65148d;

    /* renamed from: e, reason: collision with root package name */
    public long f65149e;

    /* renamed from: f, reason: collision with root package name */
    public long f65150f;

    /* renamed from: g, reason: collision with root package name */
    public long f65151g;

    /* renamed from: h, reason: collision with root package name */
    public int f65152h;

    /* renamed from: i, reason: collision with root package name */
    public int f65153i;

    /* renamed from: k, reason: collision with root package name */
    public long f65155k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65156l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f65157m;

    /* renamed from: a, reason: collision with root package name */
    public final d f65145a = new d();

    /* renamed from: j, reason: collision with root package name */
    public b f65154j = new b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public t f65158a;

        /* renamed from: b, reason: collision with root package name */
        public f f65159b;
    }

    public abstract long a(io.odeeo.internal.q0.x xVar);

    public void a(j jVar, x xVar) {
        this.f65147c = jVar;
        this.f65146b = xVar;
        a(true);
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean a(io.odeeo.internal.q0.x xVar, long j10, b bVar) throws IOException;

    @RequiresNonNull({"trackOutput"})
    public final int b(io.odeeo.internal.g.i iVar) throws IOException {
        if (!a(iVar)) {
            return -1;
        }
        t tVar = this.f65154j.f65158a;
        this.f65153i = tVar.f62985z;
        if (!this.f65157m) {
            this.f65146b.format(tVar);
            this.f65157m = true;
        }
        f fVar = this.f65154j.f65159b;
        if (fVar != null) {
            this.f65148d = fVar;
        } else if (iVar.getLength() == -1) {
            this.f65148d = new c();
        } else {
            e pageHeader = this.f65145a.getPageHeader();
            this.f65148d = new io.odeeo.internal.o.a(this, this.f65150f, iVar.getLength(), pageHeader.f65139h + pageHeader.f65140i, pageHeader.f65134c, (pageHeader.f65133b & 4) != 0);
        }
        this.f65152h = 2;
        this.f65145a.trimPayload();
        return 0;
    }

    public void c(long j10) {
        this.f65151g = j10;
    }

    public void a(boolean z10) {
        if (z10) {
            this.f65154j = new b();
            this.f65150f = 0L;
            this.f65152h = 0;
        } else {
            this.f65152h = 1;
        }
        this.f65149e = -1L;
        this.f65151g = 0L;
    }

    public final void a(long j10, long j11) {
        this.f65145a.reset();
        if (j10 == 0) {
            a(!this.f65156l);
        } else if (this.f65152h != 0) {
            this.f65149e = b(j11);
            ((f) g0.castNonNull(this.f65148d)).startSeek(this.f65149e);
            this.f65152h = 2;
        }
    }

    public final int a(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        a();
        int i10 = this.f65152h;
        if (i10 == 0) {
            return b(iVar);
        }
        if (i10 == 1) {
            iVar.skipFully((int) this.f65150f);
            this.f65152h = 2;
            return 0;
        }
        if (i10 == 2) {
            g0.castNonNull(this.f65148d);
            return b(iVar, uVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    public final int b(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        long j10 = this.f65148d.read(iVar);
        if (j10 >= 0) {
            uVar.f64171a = j10;
            return 1;
        }
        if (j10 < -1) {
            c(-(j10 + 2));
        }
        if (!this.f65156l) {
            this.f65147c.seekMap((v) io.odeeo.internal.q0.a.checkStateNotNull(this.f65148d.createSeekMap()));
            this.f65156l = true;
        }
        if (this.f65155k <= 0 && !this.f65145a.populate(iVar)) {
            this.f65152h = 3;
            return -1;
        }
        this.f65155k = 0L;
        io.odeeo.internal.q0.x payload = this.f65145a.getPayload();
        long jA = a(payload);
        if (jA >= 0) {
            long j11 = this.f65151g;
            if (j11 + jA >= this.f65149e) {
                long jA2 = a(j11);
                this.f65146b.sampleData(payload, payload.limit());
                this.f65146b.sampleMetadata(jA2, 1, payload.limit(), 0, null);
                this.f65149e = -1L;
            }
        }
        this.f65151g += jA;
        return 0;
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    public final void a() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65146b);
        g0.castNonNull(this.f65147c);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements f {
        public c() {
        }

        @Override // io.odeeo.internal.o.f
        public v createSeekMap() {
            return new v.b(C.TIME_UNSET);
        }

        @Override // io.odeeo.internal.o.f
        public long read(io.odeeo.internal.g.i iVar) {
            return -1L;
        }

        @Override // io.odeeo.internal.o.f
        public void startSeek(long j10) {
        }
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    public final boolean a(io.odeeo.internal.g.i iVar) throws IOException {
        while (this.f65145a.populate(iVar)) {
            this.f65155k = iVar.getPosition() - this.f65150f;
            if (!a(this.f65145a.getPayload(), this.f65150f, this.f65154j)) {
                return true;
            }
            this.f65150f = iVar.getPosition();
        }
        this.f65152h = 3;
        return false;
    }

    public long a(long j10) {
        return (j10 * 1000000) / this.f65153i;
    }

    public long b(long j10) {
        return (this.f65153i * j10) / 1000000;
    }
}
