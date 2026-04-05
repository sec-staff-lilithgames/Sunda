package com.ironsource;

import com.ironsource.D0;
import com.ironsource.InterfaceC3259i0;
import com.ironsource.InterfaceC3501vf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.o0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3368o0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3486v0 f38005a;

    /* renamed from: b, reason: collision with root package name */
    private final W6 f38006b;

    /* renamed from: c, reason: collision with root package name */
    private final V0 f38007c;

    /* renamed from: d, reason: collision with root package name */
    private L0 f38008d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3520x0 f38009e;

    /* renamed from: f, reason: collision with root package name */
    private final xg f38010f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<J0> f38011g;

    /* renamed from: h, reason: collision with root package name */
    private C3317l5 f38012h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3501vf.a f38013i;

    /* renamed from: j, reason: collision with root package name */
    private final E5 f38014j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o0$b */
    public static final class b implements Fg {
        public b() {
        }

        @Override // com.ironsource.Fg
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.e0.checkNotNullParameter(errorReason, "errorReason");
            AbstractC3368o0.this.a(i10, errorReason);
        }

        @Override // com.ironsource.Fg
        public void b(AbstractC3553z instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            AbstractC3368o0.this.f38014j.e().a(C3317l5.a(AbstractC3368o0.this.f38012h), AbstractC3368o0.this.e().u());
            L0 l0J = AbstractC3368o0.this.j();
            if (l0J != null) {
                l0J.a(new C3435s0(AbstractC3368o0.this, instance.e()));
            }
            AbstractC3368o0.this.l();
        }

        @Override // com.ironsource.Fg
        public void a(AbstractC3553z instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            AbstractC3368o0.this.f().e().a().e(AbstractC3368o0.this.h());
            L0 l0J = AbstractC3368o0.this.j();
            if (l0J != null) {
                l0J.b(new C3435s0(AbstractC3368o0.this, instance.e()));
            }
            AbstractC3368o0.this.l();
        }
    }

    public AbstractC3368o0(C3350n0 adTools, AbstractC3486v0 adUnitData, J0 listener, W6 taskScheduler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.f38005a = adUnitData;
        this.f38006b = taskScheduler;
        V0 v02 = new V0(adTools, adUnitData, D0.b.MEDIATION);
        this.f38007c = v02;
        this.f38010f = new xg(v02, adUnitData, c());
        this.f38011g = new WeakReference<>(listener);
        this.f38014j = v02.e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        IronLog.INTERNAL.verbose(a("starting expiration scheduled task"));
        InterfaceC3501vf.a aVar = this.f38013i;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.f38007c.b(this.f38005a.b().e());
        W6 w62 = this.f38006b;
        ch chVar = new ch(this, 10);
        tv.e eVar = tv.f.f87433c;
        this.f38013i = w62.a(chVar, tv.h.toDuration(jB, tv.i.f87441f));
    }

    public abstract C a();

    public final AbstractC3486v0 e() {
        return this.f38005a;
    }

    public final C3325ld g() {
        return this.f38005a.b().f();
    }

    public final String h() {
        return this.f38005a.l();
    }

    public final InterfaceC3520x0 i() {
        return this.f38009e;
    }

    public final L0 j() {
        return this.f38008d;
    }

    public final xg k() {
        return this.f38010f;
    }

    private final b c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC3368o0 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        L0 l02 = this$0.f38008d;
        if (l02 != null) {
            l02.a();
        }
    }

    public final void a(InterfaceC3520x0 interfaceC3520x0) {
        this.f38009e = interfaceC3520x0;
    }

    public final void b(L0 l02) {
        this.f38008d = l02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceC3259i0 d() {
        if (this.f38010f.d()) {
            return InterfaceC3259i0.b.f36884a;
        }
        return new InterfaceC3259i0.a(null, 1, 0 == true ? 1 : 0);
    }

    public final V0 f() {
        return this.f38007c;
    }

    public void a(L0 loadListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38007c, (String) null, (String) null, 3, (Object) null));
        this.f38007c.a(b());
        this.f38008d = loadListener;
        this.f38014j.a(this.f38005a.u());
        this.f38012h = new C3317l5();
        this.f38010f.a(a());
    }

    public C3402q0 b() {
        return new C3402q0(this.f38005a.b());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o0$a */
    public class a implements D {
        public a() {
        }

        @Override // com.ironsource.D
        public void a(AbstractC3553z instance, IronSourceError error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            IronLog.INTERNAL.verbose(AbstractC3368o0.this.a(instance.q()));
            AbstractC3368o0.this.f38014j.a().a(AbstractC3368o0.this.h(), error.getErrorCode(), error.getErrorMessage(), "");
            InterfaceC3520x0 interfaceC3520x0I = AbstractC3368o0.this.i();
            if (interfaceC3520x0I != null) {
                interfaceC3520x0I.c(error);
            }
        }

        @Override // com.ironsource.D
        public void b(AbstractC3553z instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC3368o0.this.a(instance.q()));
            AbstractC3368o0.this.k().b(instance);
            AbstractC3368o0.this.f38014j.a().g(AbstractC3368o0.this.h());
            AbstractC3368o0.this.f().l().b(AbstractC3368o0.this.e().b().a());
        }

        @Override // com.ironsource.D
        public void a(AbstractC3553z instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            AbstractC3368o0.this.f38014j.a().a(AbstractC3368o0.this.h());
            J0 j02 = (J0) AbstractC3368o0.this.f38011g.get();
            if (j02 != null) {
                j02.g();
            }
        }
    }

    public final void a(I adInstancePresenter, InterfaceC3520x0 displayListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        kotlin.jvm.internal.e0.checkNotNullParameter(displayListener, "displayListener");
        this.f38009e = displayListener;
        InterfaceC3501vf.a aVar = this.f38013i;
        if (aVar != null) {
            aVar.a();
        }
        this.f38010f.a(adInstancePresenter);
    }

    public /* synthetic */ AbstractC3368o0(C3350n0 c3350n0, AbstractC3486v0 abstractC3486v0, J0 j02, W6 w62, int i10, kotlin.jvm.internal.u uVar) {
        this(c3350n0, abstractC3486v0, j02, (i10 & 8) != 0 ? new W6(X6.a(c3350n0.a())) : w62);
    }

    public final void a(boolean z10) {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38007c, (String) null, (String) null, 3, (Object) null));
        this.f38010f.a();
        if (z10) {
            this.f38007c.e().e().a(this.f38007c.f());
        }
    }

    public final void a(int i10, String errorReason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i10 + ", errorReason = " + errorReason));
        this.f38014j.e().a(C3317l5.a(this.f38012h), i10, errorReason, this.f38005a.u());
        L0 l02 = this.f38008d;
        if (l02 != null) {
            l02.a(new IronSourceError(i10, errorReason));
        }
    }

    public final String a(String str) {
        return C3350n0.a(this.f38007c, str, (String) null, 2, (Object) null);
    }
}
