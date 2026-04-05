package io.odeeo.internal.g1;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import io.odeeo.internal.g1.a;
import io.odeeo.internal.y1.s;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.AdLoader;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineScope;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements io.odeeo.internal.g1.a {
        public io.odeeo.internal.x1.a<ConnectivityManager> A;
        public io.odeeo.internal.x1.a<io.odeeo.sdk.i> B;

        /* renamed from: a, reason: collision with root package name */
        public final String f64215a;

        /* renamed from: b, reason: collision with root package name */
        public final String f64216b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.g1.b f64217c;

        /* renamed from: d, reason: collision with root package name */
        public final Context f64218d;

        /* renamed from: e, reason: collision with root package name */
        public final h f64219e;

        /* renamed from: f, reason: collision with root package name */
        public final b f64220f;

        /* renamed from: g, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.j1.d> f64221g;

        /* renamed from: h, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.j1.a> f64222h;

        /* renamed from: i, reason: collision with root package name */
        public io.odeeo.internal.x1.a<l0> f64223i;

        /* renamed from: j, reason: collision with root package name */
        public io.odeeo.internal.x1.a<s> f64224j;

        /* renamed from: k, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.j1.h> f64225k;

        /* renamed from: l, reason: collision with root package name */
        public io.odeeo.internal.x1.a<Context> f64226l;

        /* renamed from: m, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.j1.f> f64227m;

        /* renamed from: n, reason: collision with root package name */
        public io.odeeo.internal.x1.a<String> f64228n;

        /* renamed from: o, reason: collision with root package name */
        public io.odeeo.internal.x1.a<String> f64229o;

        /* renamed from: p, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.s1.c> f64230p;

        /* renamed from: q, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.f1.a> f64231q;

        /* renamed from: r, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.m1.d> f64232r;

        /* renamed from: s, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.u1.a> f64233s;

        /* renamed from: t, reason: collision with root package name */
        public io.odeeo.internal.x1.a<CoroutineScope> f64234t;

        /* renamed from: u, reason: collision with root package name */
        public io.odeeo.internal.x1.a<AudioManager> f64235u;

        /* renamed from: v, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.q1.a> f64236v;

        /* renamed from: w, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.t1.a> f64237w;

        /* renamed from: x, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.d1.a> f64238x;

        /* renamed from: y, reason: collision with root package name */
        public io.odeeo.internal.x1.a<SharedPreferences> f64239y;

        /* renamed from: z, reason: collision with root package name */
        public io.odeeo.internal.x1.a<io.odeeo.internal.j1.i> f64240z;

        public final io.odeeo.internal.k1.a a() {
            return i.provideAvailabilityCallback(this.f64219e, this.f64218d, this.A.get());
        }

        public final Executor b() {
            return e.provideMainThreadExecutor(this.f64217c, this.f64218d);
        }

        public final io.odeeo.internal.r1.b c() {
            return new io.odeeo.internal.r1.b(d(), this.f64215a, this.f64216b);
        }

        public final io.odeeo.internal.j1.f d() {
            return new io.odeeo.internal.j1.f(this.f64225k.get(), this.f64224j.get());
        }

        public final io.odeeo.internal.a1.b e() {
            return new io.odeeo.internal.a1.b(this.f64233s.get(), this.f64238x.get(), this.f64235u.get(), geteventTrackingManagerImp(), this.f64218d);
        }

        @Override // io.odeeo.internal.g1.a
        public AdLoader getAdLoader() {
            return a(io.odeeo.internal.z0.d.newInstance(d(), c(), d.provideIoCoroutineScope(this.f64217c)));
        }

        @Override // io.odeeo.internal.g1.a
        public io.odeeo.internal.d1.h getOdeeoSDKParameters() {
            return new io.odeeo.internal.d1.h(d(), this.f64233s.get(), e(), this.f64238x.get(), this.f64218d);
        }

        @Override // io.odeeo.internal.g1.a
        public io.odeeo.internal.a1.a getOmSdkAdSessionController() {
            return new io.odeeo.internal.a1.a();
        }

        @Override // io.odeeo.internal.g1.a
        public io.odeeo.internal.j1.i getPopUpImageController() {
            return this.f64240z.get();
        }

        @Override // io.odeeo.internal.g1.a
        public io.odeeo.internal.o1.e geteventTrackingManagerImp() {
            return a(io.odeeo.internal.o1.f.newInstance(this.f64225k.get(), this.f64234t));
        }

        @Override // io.odeeo.internal.g1.a
        public void inject(AdUnit adUnit) {
            a(adUnit);
        }

        public b(io.odeeo.internal.g1.b bVar, h hVar, Context context, String str, String str2) {
            this.f64220f = this;
            this.f64215a = str;
            this.f64216b = str2;
            this.f64217c = bVar;
            this.f64218d = context;
            this.f64219e = hVar;
            a(bVar, hVar, context, str, str2);
        }

        public final void a(io.odeeo.internal.g1.b bVar, h hVar, Context context, String str, String str2) {
            this.f64221g = io.odeeo.internal.y0.a.provider(io.odeeo.internal.j1.e.create());
            io.odeeo.internal.x1.a<io.odeeo.internal.j1.a> aVarProvider = io.odeeo.internal.y0.a.provider(io.odeeo.internal.j1.b.create());
            this.f64222h = aVarProvider;
            io.odeeo.internal.x1.a<l0> aVarProvider2 = io.odeeo.internal.y0.a.provider(k.create(hVar, this.f64221g, aVarProvider));
            this.f64223i = aVarProvider2;
            io.odeeo.internal.x1.a<s> aVarProvider3 = io.odeeo.internal.y0.a.provider(m.create(hVar, aVarProvider2));
            this.f64224j = aVarProvider3;
            this.f64225k = io.odeeo.internal.y0.a.provider(l.create(hVar, aVarProvider3));
            this.f64226l = io.odeeo.internal.y0.c.create(context);
            this.f64227m = io.odeeo.internal.j1.g.create(this.f64225k, this.f64224j);
            this.f64228n = io.odeeo.internal.y0.c.create(str);
            io.odeeo.internal.y0.b bVarCreate = io.odeeo.internal.y0.c.create(str2);
            this.f64229o = bVarCreate;
            this.f64230p = io.odeeo.internal.s1.d.create(this.f64227m, this.f64228n, bVarCreate);
            this.f64231q = io.odeeo.internal.y0.a.provider(io.odeeo.internal.f1.b.create(this.f64226l, io.odeeo.internal.s1.b.create(), this.f64230p, io.odeeo.internal.j1.l.create()));
            io.odeeo.internal.x1.a<io.odeeo.internal.m1.d> aVarProvider4 = io.odeeo.internal.y0.a.provider(io.odeeo.internal.m1.e.create(this.f64226l));
            this.f64232r = aVarProvider4;
            this.f64233s = io.odeeo.internal.y0.a.provider(io.odeeo.internal.u1.b.create(this.f64226l, this.f64231q, aVarProvider4, this.f64228n));
            this.f64234t = d.create(bVar);
            io.odeeo.internal.x1.a<AudioManager> aVarProvider5 = io.odeeo.internal.y0.a.provider(io.odeeo.internal.g1.c.create(bVar, this.f64226l));
            this.f64235u = aVarProvider5;
            this.f64236v = io.odeeo.internal.q1.b.create(this.f64227m, aVarProvider5, this.f64228n, this.f64229o);
            io.odeeo.internal.t1.b bVarCreate2 = io.odeeo.internal.t1.b.create(this.f64227m, this.f64235u, this.f64228n, this.f64229o);
            this.f64237w = bVarCreate2;
            this.f64238x = io.odeeo.internal.y0.a.provider(io.odeeo.internal.d1.b.create(this.f64227m, this.f64233s, this.f64234t, this.f64236v, bVarCreate2, io.odeeo.internal.j1.l.create()));
            f fVarCreate = f.create(bVar, this.f64226l);
            this.f64239y = fVarCreate;
            this.f64240z = io.odeeo.internal.y0.a.provider(io.odeeo.internal.j1.j.create(this.f64225k, this.f64234t, fVarCreate));
            this.A = io.odeeo.internal.y0.a.provider(j.create(hVar, this.f64226l));
            this.B = io.odeeo.internal.y0.a.provider(io.odeeo.sdk.j.create(this.f64235u, this.f64226l));
        }

        public final AdLoader a(AdLoader adLoader) {
            io.odeeo.internal.z0.e.injectRetryManagerProvider(adLoader, io.odeeo.internal.j1.l.create());
            return adLoader;
        }

        public final io.odeeo.internal.o1.e a(io.odeeo.internal.o1.e eVar) {
            io.odeeo.internal.o1.g.injectRetryManagerProvider(eVar, io.odeeo.internal.j1.l.create());
            return eVar;
        }

        public final AdUnit a(AdUnit adUnit) {
            io.odeeo.sdk.b.injectMainThreadExecutor(adUnit, b());
            io.odeeo.sdk.b.injectConnectivityManager(adUnit, this.A.get());
            io.odeeo.sdk.b.injectEventTrackingManager(adUnit, geteventTrackingManagerImp());
            io.odeeo.sdk.b.injectAdLoader(adUnit, getAdLoader());
            io.odeeo.sdk.b.injectImageController(adUnit, this.f64240z.get());
            io.odeeo.sdk.b.injectOdeeoAudioManager(adUnit, this.B.get());
            io.odeeo.sdk.b.injectAvailabilityCallback(adUnit, a());
            io.odeeo.sdk.b.injectGenerateBidRequestDataUseCase(adUnit, new io.odeeo.internal.r1.a());
            return adUnit;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements a.InterfaceC0616a {

        /* renamed from: a, reason: collision with root package name */
        public Context f64241a;

        /* renamed from: b, reason: collision with root package name */
        public String f64242b;

        /* renamed from: c, reason: collision with root package name */
        public String f64243c;

        public c() {
        }

        @Override // io.odeeo.internal.g1.a.InterfaceC0616a
        public io.odeeo.internal.g1.a build() {
            io.odeeo.internal.y0.d.checkBuilderRequirement(this.f64241a, Context.class);
            io.odeeo.internal.y0.d.checkBuilderRequirement(this.f64242b, String.class);
            io.odeeo.internal.y0.d.checkBuilderRequirement(this.f64243c, String.class);
            return new b(new io.odeeo.internal.g1.b(), new h(), this.f64241a, this.f64242b, this.f64243c);
        }

        @Override // io.odeeo.internal.g1.a.InterfaceC0616a
        public c appKey(String str) {
            this.f64242b = (String) io.odeeo.internal.y0.d.checkNotNull(str);
            return this;
        }

        @Override // io.odeeo.internal.g1.a.InterfaceC0616a
        public c bundleId(String str) {
            this.f64243c = (String) io.odeeo.internal.y0.d.checkNotNull(str);
            return this;
        }

        @Override // io.odeeo.internal.g1.a.InterfaceC0616a
        public c context(Context context) {
            this.f64241a = (Context) io.odeeo.internal.y0.d.checkNotNull(context);
            return this;
        }
    }

    public static a.InterfaceC0616a builder() {
        return new c();
    }
}
