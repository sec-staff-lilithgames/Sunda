package io.odeeo.internal.o;

import com.inmobi.commons.core.configs.CrashConfig;
import io.odeeo.internal.g.k;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.q0.g0;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final e f65104a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65105b;

    /* renamed from: c, reason: collision with root package name */
    public final long f65106c;

    /* renamed from: d, reason: collision with root package name */
    public final h f65107d;

    /* renamed from: e, reason: collision with root package name */
    public int f65108e;

    /* renamed from: f, reason: collision with root package name */
    public long f65109f;

    /* renamed from: g, reason: collision with root package name */
    public long f65110g;

    /* renamed from: h, reason: collision with root package name */
    public long f65111h;

    /* renamed from: i, reason: collision with root package name */
    public long f65112i;

    /* renamed from: j, reason: collision with root package name */
    public long f65113j;

    /* renamed from: k, reason: collision with root package name */
    public long f65114k;

    /* renamed from: l, reason: collision with root package name */
    public long f65115l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements v {
        public b() {
        }

        @Override // io.odeeo.internal.g.v
        public long getDurationUs() {
            return a.this.f65107d.a(a.this.f65109f);
        }

        @Override // io.odeeo.internal.g.v
        public v.a getSeekPoints(long j10) {
            long jB = a.this.f65107d.b(j10);
            return new v.a(new w(j10, g0.constrainValue(((((a.this.f65106c - a.this.f65105b) * jB) / a.this.f65109f) + a.this.f65105b) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, a.this.f65105b, a.this.f65106c - 1)));
        }

        @Override // io.odeeo.internal.g.v
        public boolean isSeekable() {
            return true;
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        io.odeeo.internal.q0.a.checkArgument(j10 >= 0 && j11 > j10);
        this.f65107d = hVar;
        this.f65105b = j10;
        this.f65106c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f65109f = j13;
            this.f65108e = 4;
        } else {
            this.f65108e = 0;
        }
        this.f65104a = new e();
    }

    @Override // io.odeeo.internal.o.f
    public long read(io.odeeo.internal.g.i iVar) throws IOException {
        int i10 = this.f65108e;
        if (i10 == 0) {
            long position = iVar.getPosition();
            this.f65110g = position;
            this.f65108e = 1;
            long j10 = this.f65106c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jA = a(iVar);
                if (jA != -1) {
                    return jA;
                }
                this.f65108e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            c(iVar);
            this.f65108e = 4;
            return -(this.f65114k + 2);
        }
        this.f65109f = b(iVar);
        this.f65108e = 4;
        return this.f65110g;
    }

    @Override // io.odeeo.internal.o.f
    public void startSeek(long j10) {
        this.f65111h = g0.constrainValue(j10, 0L, this.f65109f - 1);
        this.f65108e = 2;
        this.f65112i = this.f65105b;
        this.f65113j = this.f65106c;
        this.f65114k = 0L;
        this.f65115l = this.f65109f;
    }

    public final long a(io.odeeo.internal.g.i iVar) throws IOException {
        if (this.f65112i == this.f65113j) {
            return -1L;
        }
        long position = iVar.getPosition();
        if (!this.f65104a.skipToNextPage(iVar, this.f65113j)) {
            long j10 = this.f65112i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f65104a.populate(iVar, false);
        iVar.resetPeekPosition();
        long j11 = this.f65111h;
        e eVar = this.f65104a;
        long j12 = eVar.f65134c;
        long j13 = j11 - j12;
        int i10 = eVar.f65139h + eVar.f65140i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f65113j = position;
            this.f65115l = j12;
        } else {
            this.f65112i = iVar.getPosition() + i10;
            this.f65114k = this.f65104a.f65134c;
        }
        long j14 = this.f65113j;
        long j15 = this.f65112i;
        if (j14 - j15 < 100000) {
            this.f65113j = j15;
            return j15;
        }
        long position2 = iVar.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f65113j;
        long j17 = this.f65112i;
        return g0.constrainValue((((j16 - j17) * j13) / (this.f65115l - this.f65114k)) + position2, j17, j16 - 1);
    }

    public long b(io.odeeo.internal.g.i iVar) throws IOException {
        this.f65104a.reset();
        if (!this.f65104a.skipToNextPage(iVar)) {
            throw new EOFException();
        }
        this.f65104a.populate(iVar, false);
        e eVar = this.f65104a;
        iVar.skipFully(eVar.f65139h + eVar.f65140i);
        long j10 = this.f65104a.f65134c;
        while (true) {
            e eVar2 = this.f65104a;
            if ((eVar2.f65133b & 4) == 4 || !eVar2.skipToNextPage(iVar) || iVar.getPosition() >= this.f65106c || !this.f65104a.populate(iVar, true)) {
                break;
            }
            e eVar3 = this.f65104a;
            if (!k.skipFullyQuietly(iVar, eVar3.f65139h + eVar3.f65140i)) {
                break;
            }
            j10 = this.f65104a.f65134c;
        }
        return j10;
    }

    public final void c(io.odeeo.internal.g.i iVar) throws IOException {
        while (true) {
            this.f65104a.skipToNextPage(iVar);
            this.f65104a.populate(iVar, false);
            e eVar = this.f65104a;
            if (eVar.f65134c > this.f65111h) {
                iVar.resetPeekPosition();
                return;
            } else {
                iVar.skipFully(eVar.f65139h + eVar.f65140i);
                this.f65112i = iVar.getPosition();
                this.f65114k = this.f65104a.f65134c;
            }
        }
    }

    @Override // io.odeeo.internal.o.f
    public b createSeekMap() {
        if (this.f65109f != 0) {
            return new b();
        }
        return null;
    }
}
