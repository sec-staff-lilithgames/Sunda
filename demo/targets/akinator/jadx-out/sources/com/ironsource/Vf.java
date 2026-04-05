package com.ironsource;

import com.ironsource.Xf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface Vf {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f35653a;

        /* renamed from: b, reason: collision with root package name */
        private long f35654b;

        public final long a() {
            return this.f35654b;
        }

        public final long b() {
            return this.f35653a;
        }

        public final void a(long j10) {
            this.f35654b = j10;
        }

        public final void b(long j10) {
            this.f35653a = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        Vf a(b bVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements c {
        @Override // com.ironsource.Vf.c
        public Vf a(b timerConfig) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new Xf(timerConfig.b()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements Vf {

        /* renamed from: a, reason: collision with root package name */
        private final Xf f35655a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements Xf.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f35656a;

            public a(a aVar) {
                this.f35656a = aVar;
            }

            @Override // com.ironsource.Xf.a
            public void a() {
                this.f35656a.a();
            }
        }

        public e(Xf timer) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timer, "timer");
            this.f35655a = timer;
        }

        @Override // com.ironsource.Vf
        public void a(a callback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
            this.f35655a.a((Xf.a) new a(callback));
        }

        @Override // com.ironsource.Vf
        public void cancel() {
            this.f35655a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
