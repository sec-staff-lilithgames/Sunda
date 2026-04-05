package com.moloco.sdk.service_locator;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.b2;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.services.a0;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.internal.services.e0;
import com.moloco.sdk.internal.services.f0;
import com.moloco.sdk.internal.services.g0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.l;
import com.moloco.sdk.internal.services.m;
import com.moloco.sdk.internal.services.n;
import com.moloco.sdk.internal.services.p;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.internal.services.w;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.internal.services.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0;
import io.ktor.client.HttpClient;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import tu.o;
import tu.q;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f47434a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.service_locator.a$a, reason: collision with other inner class name */
    public static final class C0394a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0394a f47435a = new C0394a();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47436b = q.lazy(new com.moloco.sdk.publisher.b(2));

        public static final com.moloco.sdk.internal.services.k c() {
            return new com.moloco.sdk.internal.services.k(a.f47434a.a());
        }

        public final b0 a() {
            return d0.a(g.f47460a.a(), b.f47437a.f());
        }

        public final com.moloco.sdk.internal.services.k b() {
            return (com.moloco.sdk.internal.services.k) f47436b.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f47437a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47438b = q.lazy(new com.moloco.sdk.publisher.b(3));

        /* renamed from: c, reason: collision with root package name */
        public static final o f47439c = q.lazy(new com.moloco.sdk.publisher.b(4));

        /* renamed from: d, reason: collision with root package name */
        public static final o f47440d = q.lazy(new com.moloco.sdk.publisher.b(5));

        /* renamed from: e, reason: collision with root package name */
        public static final o f47441e = q.lazy(new com.moloco.sdk.publisher.b(6));

        /* renamed from: f, reason: collision with root package name */
        public static final o f47442f = q.lazy(new com.moloco.sdk.publisher.b(7));

        public static final com.moloco.sdk.internal.services.analytics.b a() {
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVarC = i.f47469a.c();
            k kVar = k.f47476a;
            return new com.moloco.sdk.internal.services.analytics.b(kVarC, kVar.b(), kVar.c());
        }

        public static final s b() {
            return new s(b2.f6515k.get().getLifecycle(), f47437a.h());
        }

        public static final com.moloco.sdk.internal.error.d c() {
            return new com.moloco.sdk.internal.error.d(c.f47443a.b(), new com.moloco.sdk.internal.error.api.b(h.f47463a.h(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a()));
        }

        public static final com.moloco.sdk.internal.ilrd.d i() {
            return new com.moloco.sdk.internal.ilrd.d(a.f47434a.a());
        }

        public static final l j() {
            return new l(f47437a.d(), h.f47463a.h());
        }

        public final com.moloco.sdk.internal.services.analytics.a d() {
            return (com.moloco.sdk.internal.services.analytics.a) f47438b.getValue();
        }

        public final r e() {
            return (r) f47440d.getValue();
        }

        public final com.moloco.sdk.internal.error.c f() {
            return (com.moloco.sdk.internal.error.c) f47441e.getValue();
        }

        public final com.moloco.sdk.internal.ilrd.d g() {
            return (com.moloco.sdk.internal.ilrd.d) f47442f.getValue();
        }

        public final l h() {
            return (l) f47439c.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f47443a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47444b = q.lazy(new com.moloco.sdk.publisher.b(8));

        public static final com.moloco.sdk.internal.services.config.b a() {
            return new com.moloco.sdk.internal.services.config.b();
        }

        public final com.moloco.sdk.internal.services.config.a b() {
            return (com.moloco.sdk.internal.services.config.a) f47444b.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f47445a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47446b = q.lazy(new com.moloco.sdk.publisher.b(9));

        public static final com.moloco.sdk.internal.error.crash.c a() {
            return new com.moloco.sdk.internal.error.crash.c(new com.moloco.sdk.internal.error.crash.e(o0.listOf(new com.moloco.sdk.internal.error.crash.filters.b()), new com.moloco.sdk.internal.error.api.b(h.f47463a.h(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a()), com.moloco.sdk.acm.recorder.c.Companion.withNoMediation()));
        }

        public final com.moloco.sdk.internal.error.crash.a b() {
            return (com.moloco.sdk.internal.error.crash.a) f47446b.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f47447a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47448b = q.lazy(new com.moloco.sdk.publisher.b(10));

        /* renamed from: c, reason: collision with root package name */
        public static final o f47449c = q.lazy(new com.moloco.sdk.publisher.b(11));

        /* renamed from: d, reason: collision with root package name */
        public static final o f47450d = q.lazy(new com.moloco.sdk.publisher.b(12));

        /* renamed from: e, reason: collision with root package name */
        public static final o f47451e = q.lazy(new com.moloco.sdk.publisher.b(13));

        /* renamed from: f, reason: collision with root package name */
        public static final o f47452f = q.lazy(new com.moloco.sdk.publisher.b(14));

        /* renamed from: g, reason: collision with root package name */
        public static final o f47453g = q.lazy(new com.moloco.sdk.publisher.b(15));

        /* renamed from: h, reason: collision with root package name */
        public static final o f47454h = q.lazy(new com.moloco.sdk.publisher.b(16));

        public static final n a() {
            return new n(a.f47434a.a());
        }

        public static final w b() {
            return new w(a.f47434a.a());
        }

        public static final z c() {
            return new z(a.f47434a.a());
        }

        public static final com.moloco.sdk.internal.services.b0 d() {
            return new com.moloco.sdk.internal.services.b0(a.f47434a.a());
        }

        public static final f0 e() {
            return new f0(a.f47434a.a());
        }

        public static final t f() {
            return new t(a.f47434a.a());
        }

        public static final com.moloco.sdk.internal.services.g n() {
            return new com.moloco.sdk.internal.services.g(a.f47434a.a());
        }

        public final m g() {
            return (m) f47454h.getValue();
        }

        public final v h() {
            return (v) f47448b.getValue();
        }

        public final y i() {
            return (y) f47450d.getValue();
        }

        public final a0 j() {
            return (a0) f47453g.getValue();
        }

        public final e0 k() {
            return (e0) f47452f.getValue();
        }

        public final i0 l() {
            return (i0) f47449c.getValue();
        }

        public final com.moloco.sdk.internal.services.f m() {
            return (com.moloco.sdk.internal.services.f) f47451e.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f47460a = new g();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47461b = q.lazy(new com.moloco.sdk.publisher.b(20));

        /* renamed from: c, reason: collision with root package name */
        public static final o f47462c = q.lazy(new com.moloco.sdk.publisher.b(21));

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i c() {
            g gVar = f47460a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVarB = gVar.b();
            e eVar = e.f47447a;
            e0 e0VarK = eVar.k();
            b bVar = b.f47437a;
            com.moloco.sdk.internal.error.c cVarF = bVar.f();
            i iVar = i.f47469a;
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i(gVar.b(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d(eVar.k(), bVar.f(), iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c(jVarB, e0VarK, cVarF, iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f(a.f47434a.a(), "com.moloco.sdk.xenoss.sdkdevkit.android.cache"));
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j) c.f47443a.b().a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.class, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k.a());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h a() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) f47462c.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j b() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j) f47461b.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public static final h f47463a = new h();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47464b = q.lazy(new com.moloco.sdk.publisher.b(22));

        /* renamed from: c, reason: collision with root package name */
        public static final o f47465c = q.lazy(new com.moloco.sdk.publisher.b(23));

        /* renamed from: d, reason: collision with root package name */
        public static final o f47466d = q.lazy(new com.moloco.sdk.publisher.b(24));

        /* renamed from: e, reason: collision with root package name */
        public static final o f47467e = q.lazy(new com.moloco.sdk.publisher.b(25));

        /* renamed from: f, reason: collision with root package name */
        public static final o f47468f = q.lazy(new com.moloco.sdk.publisher.b(26));

        public static final ActivityManager a() {
            Object systemService = a.f47434a.a().getSystemService("activity");
            kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return (ActivityManager) systemService;
        }

        public static final com.moloco.sdk.internal.services.q b() {
            return new com.moloco.sdk.internal.services.q(a.f47434a.a());
        }

        public static final com.moloco.sdk.internal.services.proto.c k() {
            return new com.moloco.sdk.internal.services.proto.c();
        }

        public static final com.moloco.sdk.internal.services.j l() {
            return new com.moloco.sdk.internal.services.j();
        }

        public static final com.moloco.sdk.internal.b m() {
            return new com.moloco.sdk.internal.b();
        }

        public final ActivityManager c() {
            return (ActivityManager) f47468f.getValue();
        }

        public final p d() {
            return (p) f47466d.getValue();
        }

        public final c0 e() {
            return new com.moloco.sdk.internal.services.d0(f(), k.f47476a.b());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 f() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f0(a.f47434a.a());
        }

        public final com.moloco.sdk.internal.services.proto.b g() {
            return (com.moloco.sdk.internal.services.proto.b) f47465c.getValue();
        }

        public final com.moloco.sdk.internal.services.i h() {
            return (com.moloco.sdk.internal.services.i) f47464b.getValue();
        }

        public final com.moloco.sdk.internal.a i() {
            return (com.moloco.sdk.internal.a) f47467e.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j j() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f47469a = new i();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47470b = q.lazy(new com.moloco.sdk.publisher.b(27));

        /* renamed from: c, reason: collision with root package name */
        public static final o f47471c = q.lazy(new com.moloco.sdk.publisher.b(28));

        /* renamed from: d, reason: collision with root package name */
        public static final o f47472d = q.lazy(new com.moloco.sdk.publisher.b(29));

        /* renamed from: e, reason: collision with root package name */
        public static final o f47473e = q.lazy(new com.moloco.sdk.service_locator.b(0));

        public static final HttpClient e() {
            e eVar = e.f47447a;
            return com.moloco.sdk.internal.http.b.a(eVar.h().invoke(), eVar.l().invoke());
        }

        public static final com.moloco.sdk.internal.services.c f() {
            return new com.moloco.sdk.internal.services.c(a.f47434a.a(), e.f47447a.l());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k g() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k.f50306a.a(f47469a.d());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o h() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o(a.f47434a.a());
        }

        public final HttpClient a() {
            return (HttpClient) f47470b.getValue();
        }

        public final com.moloco.sdk.internal.services.b b() {
            return (com.moloco.sdk.internal.services.b) f47471c.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) f47473e.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n) f47472d.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public static final j f47474a = new j();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47475b = q.lazy(new com.moloco.sdk.service_locator.b(1));

        public static final com.moloco.sdk.internal.services.d a() {
            SharedPreferences sharedPreferences = a.f47434a.a().getSharedPreferences("moloco_sdk_preferences", 0);
            kotlin.jvm.internal.e0.checkNotNull(sharedPreferences);
            return new com.moloco.sdk.internal.services.d(sharedPreferences);
        }

        public final g0 b() {
            return (g0) f47475b.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public static final k f47476a = new k();

        /* renamed from: b, reason: collision with root package name */
        public static final o f47477b = q.lazy(new com.moloco.sdk.service_locator.b(2));

        /* renamed from: c, reason: collision with root package name */
        public static final o f47478c = q.lazy(new com.moloco.sdk.service_locator.b(3));

        /* renamed from: d, reason: collision with root package name */
        public static final o f47479d = q.lazy(new com.moloco.sdk.service_locator.b(4));

        public static final com.moloco.sdk.internal.services.events.d a() {
            return new com.moloco.sdk.internal.services.events.d();
        }

        public static final com.moloco.sdk.internal.services.usertracker.c g() {
            return new com.moloco.sdk.internal.services.usertracker.c(j.f47474a.b());
        }

        public static final com.moloco.sdk.internal.services.usertracker.f h() {
            k kVar = f47476a;
            return new com.moloco.sdk.internal.services.usertracker.f(kVar.e(), kVar.d());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b b() {
            e eVar = e.f47447a;
            v vVarH = eVar.h();
            com.moloco.sdk.internal.services.b bVarB = i.f47469a.b();
            i0 i0VarL = eVar.l();
            com.moloco.sdk.internal.services.f fVarM = eVar.m();
            com.moloco.sdk.internal.services.usertracker.e eVarF = f();
            h hVar = h.f47463a;
            return new com.moloco.sdk.internal.services.events.a(vVarH, bVarB, i0VarL, fVarM, eVarF, hVar.d(), hVar.g(), c(), BuildConfig.SDK_VERSION_NAME);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c) f47479d.getValue();
        }

        public final com.moloco.sdk.internal.services.usertracker.b d() {
            return (com.moloco.sdk.internal.services.usertracker.b) f47477b.getValue();
        }

        public final com.moloco.sdk.internal.services.usertracker.d e() {
            return new com.moloco.sdk.internal.services.usertracker.a();
        }

        public final com.moloco.sdk.internal.services.usertracker.e f() {
            return (com.moloco.sdk.internal.services.usertracker.e) f47478c.getValue();
        }
    }

    public final Context a() {
        return com.moloco.sdk.internal.android_context.b.a(null, 1, null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: b, reason: collision with root package name */
        public static volatile com.moloco.sdk.internal.f f47456b;

        /* renamed from: a, reason: collision with root package name */
        public static final f f47455a = new f();

        /* renamed from: c, reason: collision with root package name */
        public static final o f47457c = q.lazy(new com.moloco.sdk.publisher.b(17));

        /* renamed from: d, reason: collision with root package name */
        public static final o f47458d = q.lazy(new com.moloco.sdk.publisher.b(18));

        /* renamed from: e, reason: collision with root package name */
        public static final o f47459e = q.lazy(new com.moloco.sdk.publisher.b(19));

        public static final com.moloco.sdk.internal.services.init.f d() {
            e eVar = e.f47447a;
            return new com.moloco.sdk.internal.services.init.f(eVar.l(), eVar.h(), k.f47476a.f(), BuildConfig.SDK_VERSION_NAME, BuildConfig.MOLOCO_ENDPOINT_INIT_CONFIG, 3000L, i.f47469a.a());
        }

        public static final com.moloco.sdk.internal.services.init.l e() {
            com.moloco.sdk.internal.services.init.d dVarA = f47455a.a();
            com.moloco.sdk.internal.services.init.g gVar = com.moloco.sdk.internal.services.init.h.f47099a;
            SharedPreferences sharedPreferences = a.f47434a.a().getSharedPreferences("moloco_sdk_init_cache", 0);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            return new com.moloco.sdk.internal.services.init.l(dVarA, gVar.a(sharedPreferences), CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getIo().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))));
        }

        public static final com.moloco.sdk.internal.services.init.p f() {
            return new com.moloco.sdk.internal.services.init.p(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a());
        }

        public final com.moloco.sdk.internal.e a(Init$SDKInitResponse initResponse) {
            com.moloco.sdk.internal.f fVar;
            kotlin.jvm.internal.e0.checkNotNullParameter(initResponse, "initResponse");
            com.moloco.sdk.internal.f fVar2 = f47456b;
            if (fVar2 != null) {
                return fVar2;
            }
            synchronized (this) {
                fVar = f47456b;
                if (fVar == null) {
                    fVar = new com.moloco.sdk.internal.f(initResponse, k.f47476a.b(), h.f47463a.e());
                    f47456b = fVar;
                }
            }
            return fVar;
        }

        public final com.moloco.sdk.internal.services.init.k b() {
            return (com.moloco.sdk.internal.services.init.k) f47459e.getValue();
        }

        public final com.moloco.sdk.internal.services.init.n c() {
            return (com.moloco.sdk.internal.services.init.n) f47457c.getValue();
        }

        public final com.moloco.sdk.internal.services.init.d a() {
            return (com.moloco.sdk.internal.services.init.d) f47458d.getValue();
        }
    }
}
