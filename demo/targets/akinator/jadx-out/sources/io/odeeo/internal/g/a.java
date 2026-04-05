package io.odeeo.internal.g;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.v;
import io.odeeo.internal.q0.g0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0614a f64060a;

    /* renamed from: b, reason: collision with root package name */
    public final f f64061b;

    /* renamed from: c, reason: collision with root package name */
    public c f64062c;

    /* renamed from: d, reason: collision with root package name */
    public final int f64063d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.g.a$a, reason: collision with other inner class name */
    public static class C0614a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final d f64064a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64065b;

        /* renamed from: c, reason: collision with root package name */
        public final long f64066c;

        /* renamed from: d, reason: collision with root package name */
        public final long f64067d;

        /* renamed from: e, reason: collision with root package name */
        public final long f64068e;

        /* renamed from: f, reason: collision with root package name */
        public final long f64069f;

        /* renamed from: g, reason: collision with root package name */
        public final long f64070g;

        public C0614a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f64064a = dVar;
            this.f64065b = j10;
            this.f64066c = j11;
            this.f64067d = j12;
            this.f64068e = j13;
            this.f64069f = j14;
            this.f64070g = j15;
        }

        @Override // io.odeeo.internal.g.v
        public long getDurationUs() {
            return this.f64065b;
        }

        @Override // io.odeeo.internal.g.v
        public v.a getSeekPoints(long j10) {
            return new v.a(new w(j10, c.a(this.f64064a.timeUsToTargetTime(j10), this.f64066c, this.f64067d, this.f64068e, this.f64069f, this.f64070g)));
        }

        @Override // io.odeeo.internal.g.v
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j10) {
            return this.f64064a.timeUsToTargetTime(j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f64071a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64072b;

        /* renamed from: c, reason: collision with root package name */
        public final long f64073c;

        /* renamed from: d, reason: collision with root package name */
        public long f64074d;

        /* renamed from: e, reason: collision with root package name */
        public long f64075e;

        /* renamed from: f, reason: collision with root package name */
        public long f64076f;

        /* renamed from: g, reason: collision with root package name */
        public long f64077g;

        /* renamed from: h, reason: collision with root package name */
        public long f64078h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f64071a = j10;
            this.f64072b = j11;
            this.f64074d = j12;
            this.f64075e = j13;
            this.f64076f = j14;
            this.f64077g = j15;
            this.f64073c = j16;
            this.f64078h = a(j11, j12, j13, j14, j15, j16);
        }

        public final void f() {
            this.f64078h = a(this.f64072b, this.f64074d, this.f64075e, this.f64076f, this.f64077g, this.f64073c);
        }

        public final long c() {
            return this.f64078h;
        }

        public final long d() {
            return this.f64071a;
        }

        public final long e() {
            return this.f64072b;
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return g0.constrainValue(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long b() {
            return this.f64076f;
        }

        public final void b(long j10, long j11) {
            this.f64074d = j10;
            this.f64076f = j11;
            f();
        }

        public final long a() {
            return this.f64077g;
        }

        public final void a(long j10, long j11) {
            this.f64075e = j10;
            this.f64077g = j11;
            f();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        long timeUsToTargetTime(long j10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f64079d = new e(-3, C.TIME_UNSET, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f64080a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64081b;

        /* renamed from: c, reason: collision with root package name */
        public final long f64082c;

        public e(int i10, long j10, long j11) {
            this.f64080a = i10;
            this.f64081b = j10;
            this.f64082c = j11;
        }

        public static e overestimatedResult(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e targetFoundResult(long j10) {
            return new e(0, C.TIME_UNSET, j10);
        }

        public static e underestimatedResult(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f64061b = fVar;
        this.f64063d = i10;
        this.f64060a = new C0614a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f64060a.timeUsToTargetTime(j10), this.f64060a.f64066c, this.f64060a.f64067d, this.f64060a.f64068e, this.f64060a.f64069f, this.f64060a.f64070g);
    }

    public final v getSeekMap() {
        return this.f64060a;
    }

    public int handlePendingSeek(i iVar, u uVar) throws IOException {
        while (true) {
            c cVar = (c) io.odeeo.internal.q0.a.checkStateNotNull(this.f64062c);
            long jB = cVar.b();
            long jA = cVar.a();
            long jC = cVar.c();
            if (jA - jB <= this.f64063d) {
                a(false, jB);
                return a(iVar, jB, uVar);
            }
            if (!a(iVar, jC)) {
                return a(iVar, jC, uVar);
            }
            iVar.resetPeekPosition();
            e eVarSearchForTimestamp = this.f64061b.searchForTimestamp(iVar, cVar.e());
            int i10 = eVarSearchForTimestamp.f64080a;
            if (i10 == -3) {
                a(false, jC);
                return a(iVar, jC, uVar);
            }
            if (i10 == -2) {
                cVar.b(eVarSearchForTimestamp.f64081b, eVarSearchForTimestamp.f64082c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    a(iVar, eVarSearchForTimestamp.f64082c);
                    a(true, eVarSearchForTimestamp.f64082c);
                    return a(iVar, eVarSearchForTimestamp.f64082c, uVar);
                }
                cVar.a(eVarSearchForTimestamp.f64081b, eVarSearchForTimestamp.f64082c);
            }
        }
    }

    public final boolean isSeeking() {
        return this.f64062c != null;
    }

    public final void setSeekTargetUs(long j10) {
        c cVar = this.f64062c;
        if (cVar == null || cVar.d() != j10) {
            this.f64062c = a(j10);
        }
    }

    public final void a(boolean z10, long j10) {
        this.f64062c = null;
        this.f64061b.onSeekFinished();
        b(z10, j10);
    }

    public final boolean a(i iVar, long j10) throws IOException {
        long position = j10 - iVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        iVar.skipFully((int) position);
        return true;
    }

    public final int a(i iVar, long j10, u uVar) {
        if (j10 == iVar.getPosition()) {
            return 0;
        }
        uVar.f64171a = j10;
        return 1;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface f {
        e searchForTimestamp(i iVar, long j10) throws IOException;

        default void onSeekFinished() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements d {
        @Override // io.odeeo.internal.g.a.d
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    public void b(boolean z10, long j10) {
    }
}
