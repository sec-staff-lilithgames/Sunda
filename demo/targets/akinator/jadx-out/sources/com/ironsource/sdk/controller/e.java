package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.A4;
import com.ironsource.A8;
import com.ironsource.B4;
import com.ironsource.B8;
import com.ironsource.C3121a6;
import com.ironsource.C3191e4;
import com.ironsource.C3219fe;
import com.ironsource.C3245h4;
import com.ironsource.C3281j5;
import com.ironsource.C3397pc;
import com.ironsource.C3419r1;
import com.ironsource.C3422r4;
import com.ironsource.C3460t8;
import com.ironsource.C3477u8;
import com.ironsource.C3494v8;
import com.ironsource.EnumC3176d7;
import com.ironsource.G5;
import com.ironsource.InterfaceC3140b7;
import com.ironsource.InterfaceC3507w4;
import com.ironsource.InterfaceC3524x4;
import com.ironsource.InterfaceC3541y4;
import com.ironsource.L;
import com.ironsource.Lg;
import com.ironsource.Mb;
import com.ironsource.Ob;
import com.ironsource.Pb;
import com.ironsource.T3;
import com.ironsource.V7;
import com.ironsource.Y4;
import com.ironsource.Z4;
import com.ironsource.Z5;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {

    /* renamed from: b, reason: collision with root package name */
    private com.ironsource.sdk.controller.l f38487b;

    /* renamed from: d, reason: collision with root package name */
    private CountDownTimer f38489d;

    /* renamed from: g, reason: collision with root package name */
    private final V7 f38492g;

    /* renamed from: h, reason: collision with root package name */
    private final Lg f38493h;

    /* renamed from: k, reason: collision with root package name */
    private final C3397pc f38496k;

    /* renamed from: a, reason: collision with root package name */
    private final String f38486a = "e";

    /* renamed from: c, reason: collision with root package name */
    private C3460t8.b f38488c = C3460t8.b.None;

    /* renamed from: e, reason: collision with root package name */
    private final T3 f38490e = new T3("NativeCommandExecutor");

    /* renamed from: f, reason: collision with root package name */
    private final T3 f38491f = new T3("ControllerCommandsExecutor");

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, l.a> f38494i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, l.b> f38495j = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f38497a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38498b;

        public a(JSONObject jSONObject, InterfaceC3524x4 interfaceC3524x4) {
            this.f38497a = jSONObject;
            this.f38498b = interfaceC3524x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38497a, this.f38498b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4 f38500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f38501b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38502c;

        public b(Y4 y42, Map map, InterfaceC3524x4 interfaceC3524x4) {
            this.f38500a = y42;
            this.f38501b = map;
            this.f38502c = interfaceC3524x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38500a, this.f38501b, this.f38502c);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y4 f38506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3507w4 f38507d;

        public c(String str, String str2, Y4 y42, InterfaceC3507w4 interfaceC3507w4) {
            this.f38504a = str;
            this.f38505b = str2;
            this.f38506c = y42;
            this.f38507d = interfaceC3507w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38504a, this.f38505b, this.f38506c, this.f38507d);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f38509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3507w4 f38510b;

        public d(JSONObject jSONObject, InterfaceC3507w4 interfaceC3507w4) {
            this.f38509a = jSONObject;
            this.f38510b = interfaceC3507w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38509a, this.f38510b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    public class RunnableC0240e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4 f38512a;

        public RunnableC0240e(Y4 y42) {
            this.f38512a = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38512a);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4 f38514a;

        public f(Y4 y42) {
            this.f38514a = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.b(this.f38514a);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4 f38516a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f38517b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3507w4 f38518c;

        public g(Y4 y42, Map map, InterfaceC3507w4 interfaceC3507w4) {
            this.f38516a = y42;
            this.f38517b = map;
            this.f38518c = interfaceC3507w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38516a, this.f38517b, this.f38518c);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f38520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f38521b;

        public h(l.a aVar, f.c cVar) {
            this.f38520a = aVar;
            this.f38521b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.f38487b != null) {
                if (this.f38520a != null) {
                    eVar.f38494i.put(this.f38521b.f(), this.f38520a);
                }
                e.this.f38487b.a(this.f38521b, this.f38520a);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f38523a;

        public i(JSONObject jSONObject) {
            this.f38523a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.b(this.f38523a);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a();
                e.this.f38487b = null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k extends CountDownTimer {
        public k(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f38486a, "Global Controller Timer Finish");
            e.this.d(C3191e4.c.f36399k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f38486a, "Global Controller Timer Tick " + j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38529b;

        public m(String str, String str2) {
            this.f38528a = str;
            this.f38529b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.f38487b = eVar.b(eVar.f38493h.b(), e.this.f38493h.d(), e.this.f38493h.f(), e.this.f38493h.e(), e.this.f38493h.g(), e.this.f38493h.c(), this.f38528a, this.f38529b);
                e.this.f38487b.b();
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                e.this.d(Log.getStackTraceString(th2));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n extends CountDownTimer {
        public n(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f38486a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(C3191e4.c.f36399k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f38486a, "Recovered Controller | Global Controller Timer Tick " + j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38532a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y4 f38534c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3541y4 f38535d;

        public o(String str, String str2, Y4 y42, InterfaceC3541y4 interfaceC3541y4) {
            this.f38532a = str;
            this.f38533b = str2;
            this.f38534c = y42;
            this.f38535d = interfaceC3541y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38532a, this.f38533b, this.f38534c, this.f38535d);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f38537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3541y4 f38538b;

        public p(JSONObject jSONObject, InterfaceC3541y4 interfaceC3541y4) {
            this.f38537a = jSONObject;
            this.f38538b = interfaceC3541y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38537a, this.f38538b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y4 f38542c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38543d;

        public q(String str, String str2, Y4 y42, InterfaceC3524x4 interfaceC3524x4) {
            this.f38540a = str;
            this.f38541b = str2;
            this.f38542c = y42;
            this.f38543d = interfaceC3524x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38540a, this.f38541b, this.f38542c, this.f38543d);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38545a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38546b;

        public r(String str, InterfaceC3524x4 interfaceC3524x4) {
            this.f38545a = str;
            this.f38546b = interfaceC3524x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.a(this.f38545a, this.f38546b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4 f38548a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f38549b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38550c;

        public s(Y4 y42, Map map, InterfaceC3524x4 interfaceC3524x4) {
            this.f38548a = y42;
            this.f38549b = map;
            this.f38550c = interfaceC3524x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            A8.a(C3219fe.f36707j, new C3494v8().a(G5.f34448v, this.f38548a.f()).a(G5.f34449w, B8.a(this.f38548a, C3460t8.e.Interstitial)).a(G5.f34450x, Boolean.valueOf(B8.a(this.f38548a))).a(G5.I, Long.valueOf(L.f34778a.b(this.f38548a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.f38487b;
            if (lVar != null) {
                lVar.b(this.f38548a, this.f38549b, this.f38550c);
            }
        }
    }

    public e(Context context, C3245h4 c3245h4, Z4 z42, V7 v72, int i10, JSONObject jSONObject, String str, String str2, C3397pc c3397pc) {
        this.f38496k = c3397pc;
        this.f38492g = v72;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C3281j5 c3281j5A = C3281j5.a(networkStorageDir, v72, jSONObject);
        this.f38493h = new Lg(context, c3245h4, z42, i10, c3281j5A, networkStorageDir);
        a(context, c3245h4, z42, i10, c3281j5A, networkStorageDir, str, str2);
    }

    private void l() {
        Logger.i(this.f38486a, "handleReadyState");
        this.f38488c = C3460t8.b.Ready;
        CountDownTimer countDownTimer = this.f38489d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f38491f.c();
        this.f38491f.a();
        com.ironsource.sdk.controller.l lVar = this.f38487b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C3460t8.b.Ready.equals(this.f38488c);
    }

    private void n() {
        this.f38493h.a(true);
        com.ironsource.sdk.controller.l lVar = this.f38487b;
        if (lVar != null) {
            lVar.a(this.f38493h.i());
        }
    }

    public com.ironsource.sdk.controller.l k() {
        return this.f38487b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C3245h4 c3245h4, Z4 z42, int i10, C3281j5 c3281j5, String str, String str2, String str3) {
        try {
            v vVarB = b(context, c3245h4, z42, i10, c3281j5, str, str2, str3);
            try {
                this.f38487b = vVarB;
                vVarB.b();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                C3422r4.d().a(th3);
                d(Log.getStackTraceString(th3));
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        A8.a(C3219fe.f36701d, new C3494v8().a(G5.A, str).a());
        this.f38488c = C3460t8.b.Loading;
        this.f38487b = new com.ironsource.sdk.controller.n(str, this.f38492g);
        this.f38490e.c();
        this.f38490e.a();
        V7 v72 = this.f38492g;
        if (v72 != null) {
            v72.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C3477u8(1001, str));
    }

    private l.a i() {
        return new l.a() { // from class: com.ironsource.sdk.controller.x
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                this.f38835a.a(aVar);
            }
        };
    }

    private l.b j() {
        return new l.b() { // from class: com.ironsource.sdk.controller.y
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Ob ob2) {
                this.f38836a.a(ob2);
            }
        };
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f38487b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C3460t8.c h() {
        com.ironsource.sdk.controller.l lVar = this.f38487b;
        return lVar != null ? lVar.h() : C3460t8.c.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a aVarRemove = this.f38494i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f38487b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C3245h4 c3245h4, Z4 z42, int i10, C3281j5 c3281j5, String str, String str2, String str3) throws Throwable {
        A8.a(C3219fe.f36700c);
        v vVar = new v(context, z42, c3245h4, this, this.f38492g, i10, c3281j5, str, i(), j(), str2, str3);
        C3121a6 c3121a6 = new C3121a6(context, c3281j5, new Z5(this.f38492g.a()), new Pb(c3281j5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c3281j5.a(), c3121a6));
        vVar.a(new C3419r1());
        vVar.a(new B4(context, new A4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Ob ob2) {
        l.b bVar = this.f38495j.get(ob2.d());
        if (bVar != null) {
            bVar.a(ob2);
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f38486a, "handleControllerLoaded");
        this.f38488c = C3460t8.b.Loaded;
        this.f38490e.c();
        this.f38490e.a();
    }

    private void a(Runnable runnable, long j10) {
        V7 v72 = this.f38492g;
        if (v72 != null) {
            v72.d(runnable, j10);
        } else {
            Logger.e(this.f38486a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C3245h4 c3245h4, final Z4 z42, final int i10, final C3281j5 c3281j5, final String str, final String str2, final String str3) {
        int iH = Mb.U().g().h();
        if (iH > 0) {
            A8.a(C3219fe.B, new C3494v8().a(G5.f34451y, String.valueOf(iH)).a());
        }
        a(new Runnable() { // from class: com.ironsource.sdk.controller.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f38826b.c(context, c3245h4, z42, i10, c3281j5, str, str2, str3);
            }
        }, iH);
        this.f38489d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.f38486a, "handleControllerFailed ");
        C3494v8 c3494v8 = new C3494v8();
        c3494v8.a(G5.A, str);
        c3494v8.a(G5.f34451y, String.valueOf(this.f38493h.l()));
        A8.a(C3219fe.f36712o, c3494v8.a());
        this.f38493h.a(false);
        e(str);
        if (this.f38489d != null) {
            Logger.i(this.f38486a, "cancel timer mControllerReadyTimer");
            this.f38489d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.f38486a, "handleControllerReady ");
        this.f38496k.a(h());
        if (C3460t8.c.Web.equals(h())) {
            A8.a(C3219fe.f36702e, new C3494v8().a(G5.f34451y, String.valueOf(this.f38493h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    public void a(Runnable runnable) {
        this.f38490e.a(runnable);
    }

    @Override // com.ironsource.InterfaceC3212f7
    public void a(InterfaceC3140b7 interfaceC3140b7) {
        EnumC3176d7 enumC3176d7B = interfaceC3140b7.b();
        if (enumC3176d7B == EnumC3176d7.SendEvent) {
            A8.a(C3219fe.A, new C3494v8().a(G5.f34451y, interfaceC3140b7.a() + " : strategy: " + enumC3176d7B).a());
            return;
        }
        if (enumC3176d7B == EnumC3176d7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(interfaceC3140b7.a(), this.f38492g);
            this.f38487b = nVar;
            this.f38496k.a(nVar.h());
            A8.a(C3219fe.f36701d, new C3494v8().a(G5.A, interfaceC3140b7.a() + " : strategy: " + enumC3176d7B).a());
            A8.a(C3219fe.A, new C3494v8().a(G5.f34451y, interfaceC3140b7.a() + " : strategy: " + enumC3176d7B).a());
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        A8.a(C3219fe.f36722y, new C3494v8().a(G5.f34451y, str).a());
        CountDownTimer countDownTimer = this.f38489d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4) {
        this.f38491f.a(new s(y42, map, interfaceC3524x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42) {
        this.f38491f.a(new f(y42));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f38491f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f38487b) == null) {
            return;
        }
        lVar.b(context);
    }

    private void a(C3460t8.e eVar, Y4 y42, String str, String str2) {
        Logger.i(this.f38486a, "recoverWebController for product: " + eVar.toString());
        C3494v8 c3494v8 = new C3494v8();
        c3494v8.a(G5.f34449w, eVar.toString());
        c3494v8.a(G5.f34448v, y42.f());
        A8.a(C3219fe.f36699b, c3494v8.a());
        this.f38493h.n();
        a();
        b(new m(str, str2));
        this.f38489d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3541y4 interfaceC3541y4) {
        if (this.f38493h.a(h(), this.f38488c)) {
            a(C3460t8.e.RewardedVideo, y42, str, str2);
        }
        this.f38491f.a(new o(str, str2, y42, interfaceC3541y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3541y4 interfaceC3541y4) {
        this.f38491f.a(new p(jSONObject, interfaceC3541y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3524x4 interfaceC3524x4) {
        if (this.f38493h.a(h(), this.f38488c)) {
            a(C3460t8.e.Interstitial, y42, str, str2);
        }
        this.f38491f.a(new q(str, str2, y42, interfaceC3524x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC3524x4 interfaceC3524x4) {
        Logger.i(this.f38486a, "load interstitial");
        this.f38491f.a(new r(str, interfaceC3524x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3524x4 interfaceC3524x4) {
        this.f38491f.a(new a(jSONObject, interfaceC3524x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4) {
        this.f38491f.a(new b(y42, map, interfaceC3524x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f38487b == null || !m()) {
            return false;
        }
        return this.f38487b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3507w4 interfaceC3507w4) {
        if (this.f38493h.a(h(), this.f38488c)) {
            a(C3460t8.e.Banner, y42, str, str2);
        }
        this.f38491f.a(new c(str, str2, y42, interfaceC3507w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3507w4 interfaceC3507w4) {
        this.f38491f.a(new d(jSONObject, interfaceC3507w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42) {
        this.f38491f.a(new RunnableC0240e(y42));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC3507w4 interfaceC3507w4) {
        this.f38491f.a(new g(y42, map, interfaceC3507w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        this.f38491f.a(new h(aVar, cVar));
    }

    public void a(String str, l.b bVar) {
        this.f38495j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f38487b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.f38486a, "destroy controller");
        CountDownTimer countDownTimer = this.f38489d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        T3 t32 = this.f38491f;
        if (t32 != null) {
            t32.b();
        }
        this.f38489d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f38487b.a(activity);
    }
}
