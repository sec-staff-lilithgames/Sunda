package com.ironsource;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3484uf implements InterfaceC3218fd {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f39065a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39066b;

    /* renamed from: c, reason: collision with root package name */
    private long f39067c;

    /* renamed from: d, reason: collision with root package name */
    private long f39068d;

    /* renamed from: e, reason: collision with root package name */
    private long f39069e;

    /* renamed from: f, reason: collision with root package name */
    private final b f39070f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.uf$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f39071a;

        /* renamed from: b, reason: collision with root package name */
        private final long f39072b;

        public a(long j10, long j11) {
            this.f39071a = j10;
            this.f39072b = j11;
        }

        public final long a() {
            return this.f39071a;
        }

        public final long b() {
            return this.f39072b;
        }

        public final long c() {
            return this.f39071a;
        }

        public final long d() {
            return this.f39072b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39071a == aVar.f39071a && this.f39072b == aVar.f39072b;
        }

        public int hashCode() {
            return Long.hashCode(this.f39072b) + (Long.hashCode(this.f39071a) * 31);
        }

        public String toString() {
            return a.b.g(this.f39072b, ")", b0.e2.r(this.f39071a, "Status(remainingTime=", ", timePassed="));
        }

        public final a a(long j10, long j11) {
            return new a(j10, j11);
        }

        public static /* synthetic */ a a(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = aVar.f39071a;
            }
            if ((i10 & 2) != 0) {
                j11 = aVar.f39072b;
            }
            return aVar.a(j10, j11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.uf$b */
    public static final class b extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f39073b;

        public b(Runnable runnable) {
            this.f39073b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            this.f39073b.run();
        }
    }

    public C3484uf(Handler handler, Runnable task, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        this.f39065a = handler;
        this.f39066b = j10;
        this.f39070f = new b(task);
        this.f39069e = c();
        b();
    }

    private final long c() {
        return System.currentTimeMillis();
    }

    private final long d() {
        return this.f39066b - this.f39067c;
    }

    @Override // com.ironsource.InterfaceC3218fd
    public a a() {
        if (!e()) {
            long jC = c();
            this.f39069e = jC;
            this.f39067c = (jC - this.f39068d) + this.f39067c;
            this.f39065a.removeCallbacks(this.f39070f);
        }
        return new a(d(), this.f39067c);
    }

    @Override // com.ironsource.InterfaceC3218fd
    public a b() {
        if (e()) {
            this.f39068d = c();
            this.f39069e = 0L;
            this.f39065a.postDelayed(this.f39070f, d());
        }
        return new a(d(), this.f39067c);
    }

    public final boolean e() {
        return this.f39069e > 0;
    }
}
