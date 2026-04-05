package com.ironsource;

import com.ironsource.InterfaceC3140b7;
import com.ironsource.InterfaceC3194e7;
import com.ironsource.Vf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3298k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f37070a = c.f37077a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k4$a */
    public static final class a implements InterfaceC3298k4 {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3122a7 f37071b;

        /* renamed from: c, reason: collision with root package name */
        private final Vf f37072c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f37073d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k4$a$a, reason: collision with other inner class name */
        public static final class C0232a implements Vf.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f37074a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f37075b;

            public C0232a(d dVar, a aVar) {
                this.f37074a = dVar;
                this.f37075b = aVar;
            }

            @Override // com.ironsource.Vf.a
            public void a() {
                this.f37074a.a(new InterfaceC3194e7.a(new InterfaceC3140b7.a(this.f37075b.f37071b.b())));
                this.f37075b.f37073d.set(false);
            }
        }

        public a(InterfaceC3122a7 config, Vf timer) {
            kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.e0.checkNotNullParameter(timer, "timer");
            this.f37071b = config;
            this.f37072c = timer;
            this.f37073d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC3298k4
        public synchronized void a(d callback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
            if (this.f37073d.compareAndSet(false, true)) {
                this.f37072c.a(new C0232a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC3298k4
        public synchronized void a() {
            this.f37072c.cancel();
            this.f37073d.set(false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k4$b */
    public static final class b implements InterfaceC3298k4 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f37076b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC3298k4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC3298k4
        public void a(d callback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k4$d */
    public interface d {
        void a(InterfaceC3194e7 interfaceC3194e7);
    }

    static InterfaceC3298k4 a(C3158c7 c3158c7) {
        return f37070a.a(c3158c7);
    }

    void a();

    void a(d dVar);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k4$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f37077a = new c();

        private c() {
        }

        public final InterfaceC3298k4 a(C3158c7 featureFlag) {
            kotlin.jvm.internal.e0.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.f37076b;
            }
            Z6 z62 = new Z6(featureFlag);
            Vf.b bVar = new Vf.b();
            bVar.b(z62.a());
            bVar.a(z62.a());
            return new a(z62, new Vf.d().a(bVar));
        }

        public final InterfaceC3298k4 a() {
            return b.f37076b;
        }
    }
}
