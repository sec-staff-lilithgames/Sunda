package io.bidmachine.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import io.bidmachine.analytics.internal.InterfaceC3890x;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3882o {

    /* renamed from: l, reason: collision with root package name */
    public static final i f60152l = new i(null);

    /* renamed from: m, reason: collision with root package name */
    private static final tu.o f60153m = tu.q.lazy(d.f60175a);

    /* renamed from: n, reason: collision with root package name */
    private static final tu.o f60154n = tu.q.lazy(e.f60176a);

    /* renamed from: o, reason: collision with root package name */
    private static final tu.o f60155o = tu.q.lazy(f.f60177a);

    /* renamed from: p, reason: collision with root package name */
    private static final tu.o f60156p = tu.q.lazy(b.f60173a);

    /* renamed from: q, reason: collision with root package name */
    private static final tu.o f60157q = tu.q.lazy(h.f60179a);

    /* renamed from: r, reason: collision with root package name */
    private static final tu.o f60158r = tu.q.lazy(c.f60174a);

    /* renamed from: s, reason: collision with root package name */
    private static final tu.o f60159s = tu.q.lazy(g.f60178a);

    /* renamed from: t, reason: collision with root package name */
    private static final tu.o f60160t = tu.q.lazy(a.f60172a);

    /* renamed from: a, reason: collision with root package name */
    private final Context f60161a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C3883p f60162b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f60163c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f60164d;

    /* renamed from: e, reason: collision with root package name */
    private final tu.o f60165e = tu.q.lazy(C0581o.f60186a);

    /* renamed from: f, reason: collision with root package name */
    private final tu.o f60166f = tu.q.lazy(new l());

    /* renamed from: g, reason: collision with root package name */
    private final tu.o f60167g = tu.q.lazy(new m());

    /* renamed from: h, reason: collision with root package name */
    private final tu.o f60168h = tu.q.lazy(new n());

    /* renamed from: i, reason: collision with root package name */
    private final tu.o f60169i = tu.q.lazy(new p());

    /* renamed from: j, reason: collision with root package name */
    private final tu.o f60170j = tu.q.lazy(new j());

    /* renamed from: k, reason: collision with root package name */
    private final ServiceConnection f60171k = new q();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60172a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("cGxheUJpbGxpbmdMaWJyYXJ5VmVyc2lvbg==");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$b */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f60173a = new b();

        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("VkVSU0lPTl9OQU1F");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$c */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f60174a = new c();

        public c() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLkluQXBwQmlsbGluZ1NlcnZpY2UuQklORA==");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$d */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f60175a = new d();

        public d() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5CdWlsZENvbmZpZw==");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$e */
    public static final class e extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f60176a = new e();

        public e() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5rdHguQnVpbGRDb25maWc=");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$f */
    public static final class f extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f60177a = new f();

        public f() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmdvb2dsZS5hbmRyb2lkLnBsYXkuYmlsbGluZ2NsaWVudC52ZXJzaW9u");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$g */
    public static final class g extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f60178a = new g();

        public g() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQudmVuZGluZw==");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$h */
    public static final class h extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f60179a = new h();

        public h() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQudmVuZGluZy5CSUxMSU5H");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$i */
    public static final class i {
        public /* synthetic */ i(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final String a() {
            return (String) C3882o.f60160t.getValue();
        }

        public final String b() {
            return (String) C3882o.f60156p.getValue();
        }

        public final String c() {
            return (String) C3882o.f60158r.getValue();
        }

        public final String d() {
            return (String) C3882o.f60153m.getValue();
        }

        public final String e() {
            return (String) C3882o.f60154n.getValue();
        }

        public final String f() {
            return (String) C3882o.f60155o.getValue();
        }

        public final String g() {
            return (String) C3882o.f60159s.getValue();
        }

        public final String h() {
            return (String) C3882o.f60157q.getValue();
        }

        private i() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$j */
    public static final class j extends kotlin.jvm.internal.f0 implements kv.a {
        public j() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0 invoke() {
            Object objM7131constructorimpl;
            t0 t0VarA;
            C3882o c3882o = C3882o.this;
            try {
                int i10 = tu.z.f87419c;
                String strP = c3882o.p();
                if (strP == null || (t0VarA = t0.f60270d.a(strP)) == null) {
                    String strN = c3882o.n();
                    t0VarA = strN != null ? t0.f60270d.a(strN) : null;
                }
                objM7131constructorimpl = tu.z.m7131constructorimpl(t0VarA);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            return (t0) (tu.z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$k */
    public static final class k extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f60181a;

        public k(zu.d dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((k) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return C3882o.this.new k(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f60181a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            while (C3882o.this.f60162b == null) {
                this.f60181a = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C3883p c3883p = C3882o.this.f60162b;
            if (c3883p != null) {
                return c3883p.s();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$l */
    public static final class l extends kotlin.jvm.internal.f0 implements kv.a {
        public l() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C3882o.this.a(C3882o.f60152l.d());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$m */
    public static final class m extends kotlin.jvm.internal.f0 implements kv.a {
        public m() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C3882o.this.a(C3882o.f60152l.e());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$n */
    public static final class n extends kotlin.jvm.internal.f0 implements kv.a {
        public n() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C3882o.this.m();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$o, reason: collision with other inner class name */
    public static final class C0581o extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0581o f60186a = new C0581o();

        public C0581o() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ov.g invoke() {
            return ov.h.Random(System.nanoTime());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$p */
    public static final class p extends kotlin.jvm.internal.f0 implements kv.a {
        public p() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strO = C3882o.this.o();
            if (strO != null) {
                return strO;
            }
            String strN = C3882o.this.n();
            return strN == null ? C3882o.this.p() : strN;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.o$q */
    public static final class q implements ServiceConnection {
        public q() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C3883p c3883p;
            t0 t0VarL = C3882o.this.l();
            if (t0VarL == null) {
                throw new IllegalArgumentException("Version not found in connected callback");
            }
            C3882o c3882o = C3882o.this;
            String strR = c3882o.r();
            if (strR != null) {
                C3882o c3882o2 = C3882o.this;
                c3883p = new C3883p(new InterfaceC3890x.a(iBinder, InterfaceC3890x.a.f60276d.a(t0VarL), null, 4, null), c3882o2.f60161a.getPackageName(), t0VarL, strR, c3882o2.q().nextLong());
            } else {
                c3883p = null;
            }
            c3882o.f60162b = c3883p;
            C3882o c3882o3 = C3882o.this;
            c3882o3.f60163c = c3882o3.f60162b != null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C3882o.this.f60163c = false;
            C3882o.this.f60162b = null;
        }
    }

    public C3882o(Context context) {
        this.f60161a = context;
    }

    private final Intent k() {
        i iVar = f60152l;
        Intent intent = new Intent(iVar.c());
        intent.setPackage(iVar.g());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m() {
        Object objM7131constructorimpl;
        try {
            int i10 = tu.z.f87419c;
            Bundle bundle = this.f60161a.getPackageManager().getApplicationInfo(this.f60161a.getPackageName(), 128).metaData;
            objM7131constructorimpl = tu.z.m7131constructorimpl(bundle != null ? bundle.getString(f60152l.f()) : null);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        return (String) (tu.z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.f60166f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o() {
        return (String) this.f60167g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p() {
        return (String) this.f60168h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ov.g q() {
        return (ov.g) this.f60165e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r() {
        return (String) this.f60169i.getValue();
    }

    private final ComponentName s() {
        ServiceInfo serviceInfo;
        List<ResolveInfo> listQueryIntentServices = this.f60161a.getPackageManager().queryIntentServices(k(), 0);
        if (!listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (kotlin.jvm.internal.e0.areEqual(f60152l.g(), str) && str2 != null) {
                return new ComponentName(str, str2);
            }
        }
        return null;
    }

    public final void i() {
        ComponentName componentNameS = s();
        if (componentNameS == null) {
            throw new IllegalArgumentException("Component name not found");
        }
        String strR = r();
        if (strR == null) {
            throw new IllegalArgumentException("Library version not found");
        }
        Context context = this.f60161a;
        Intent intentK = k();
        intentK.setComponent(componentNameS);
        intentK.putExtra(f60152l.a(), strR);
        if (!context.bindService(intentK, this.f60171k, 1)) {
            throw new IllegalStateException("Can't connect");
        }
        this.f60164d = true;
    }

    public final void j() {
        if (this.f60164d) {
            this.f60161a.unbindService(this.f60171k);
        }
        this.f60164d = false;
    }

    public final t0 l() {
        return (t0) this.f60170j.getValue();
    }

    public final boolean t() {
        return this.f60161a.getPackageManager().checkPermission(f60152l.h(), this.f60161a.getPackageName()) == 0;
    }

    public final boolean u() {
        return s() != null;
    }

    public final Object a(long j10, zu.d dVar) {
        return TimeoutKt.withTimeoutOrNull(j10, new k(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(String str) {
        Object objM7131constructorimpl;
        try {
            int i10 = tu.z.f87419c;
            Object obj = Class.forName(str).getField(f60152l.b()).get(null);
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            objM7131constructorimpl = tu.z.m7131constructorimpl((String) obj);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        return (String) (tu.z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }
}
