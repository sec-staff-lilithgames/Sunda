package com.ironsource;

import android.app.Activity;
import com.ironsource.D0;
import com.ironsource.InterfaceC3396pb;
import com.ironsource.InterfaceC3456t4;
import com.ironsource.InterfaceC3501vf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.t6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3458t6 implements InterfaceC3336m6 {

    /* renamed from: a, reason: collision with root package name */
    private final Mb f38910a;

    /* renamed from: b, reason: collision with root package name */
    private final V0 f38911b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3486v0 f38912c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3509w6 f38913d;

    /* renamed from: e, reason: collision with root package name */
    private final kv.q f38914e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3501vf f38915f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3456t4 f38916g;

    /* renamed from: h, reason: collision with root package name */
    private b f38917h;

    /* renamed from: i, reason: collision with root package name */
    private a f38918i;

    /* renamed from: j, reason: collision with root package name */
    private final xg f38919j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3501vf.a f38920k;

    /* renamed from: l, reason: collision with root package name */
    private Long f38921l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t6$a */
    public interface a {
        void a(C3458t6 c3458t6, IronSourceError ironSourceError);

        void a(C3458t6 c3458t6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t6$b */
    public interface b {
        void a(C3458t6 c3458t6);

        void b(C3458t6 c3458t6, IronSourceError ironSourceError);

        void b(C3458t6 c3458t6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C3458t6 c3458t6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t6$d */
    public /* synthetic */ class d extends kotlin.jvm.internal.a0 implements kv.q {
        public d(Object obj) {
            super(3, obj, C3458t6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kv.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3318l6 invoke(A p02, G p12, InterfaceC3336m6 p22) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            kotlin.jvm.internal.e0.checkNotNullParameter(p12, "p1");
            kotlin.jvm.internal.e0.checkNotNullParameter(p22, "p2");
            return ((C3458t6) this.receiver).a(p02, p12, p22);
        }
    }

    public C3458t6(Mb mediationServices, V0 adUnitTools, AbstractC3486v0 adUnitData, InterfaceC3509w6 fullscreenListener, zg zgVar, kv.q qVar, InterfaceC3501vf taskScheduler, InterfaceC3456t4 currentTimeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationServices, "mediationServices");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f38910a = mediationServices;
        this.f38911b = adUnitTools;
        this.f38912c = adUnitData;
        this.f38913d = fullscreenListener;
        this.f38914e = qVar;
        this.f38915f = taskScheduler;
        this.f38916g = currentTimeProvider;
        this.f38919j = a(zgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C3458t6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        b bVar = this$0.f38917h;
        if (bVar != null) {
            bVar.a(this$0);
        }
        this$0.f38919j.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.f38912c.l();
    }

    private final InterfaceC3396pb<tu.x0> f() {
        return !this.f38919j.d() ? new InterfaceC3396pb.a(new IronSourceError(509, "show called while ad unit is not ready to show")) : this.f38910a.p().a(c(), b()).d() ? new InterfaceC3396pb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, a.b.l("placement ", c(), " is capped"))) : this.f38910a.f().a(this.f38912c.b().c()).d() ? new InterfaceC3396pb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, a.b.l("adUnitId ", this.f38912c.b().c(), " is capped"))) : new InterfaceC3396pb.b(tu.x0.f87415a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        InterfaceC3501vf.a aVar = this.f38920k;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.f38911b.b(b());
        InterfaceC3501vf interfaceC3501vf = this.f38915f;
        ch chVar = new ch(this, 11);
        tv.e eVar = tv.f.f87433c;
        this.f38920k = interfaceC3501vf.a(chVar, tv.h.toDuration(jB, tv.i.f87441f));
    }

    @Override // com.ironsource.D
    public void b(AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        this.f38919j.b(instance);
        this.f38911b.e().a().g(c());
        this.f38910a.h().b(com.unity3d.mediation.a.a(b()));
    }

    public final InterfaceC3509w6 d() {
        return this.f38913d;
    }

    public final LevelPlayAdInfo e() {
        AbstractC3553z abstractC3553zC = this.f38919j.c();
        if (abstractC3553zC != null) {
            return abstractC3553zC.e();
        }
        return null;
    }

    private final void h() {
        String strC = c();
        if (strC.length() > 0) {
            this.f38910a.a().b(strC, b());
            O3 o3A = this.f38910a.p().a(strC, b());
            if (o3A.d()) {
                this.f38911b.e().a().b(strC, o3A.e());
            }
        }
    }

    public final void a(InterfaceC3509w6 interfaceC3509w6) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interfaceC3509w6, "<set-?>");
        this.f38913d = interfaceC3509w6;
    }

    public final void a(b loadListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38911b, (String) null, (String) null, 3, (Object) null));
        this.f38917h = loadListener;
        this.f38921l = Long.valueOf(this.f38916g.a());
        this.f38911b.a(new C3402q0(this.f38912c.b()));
        ah ahVar = new ah(this, 4);
        this.f38911b.e().e().a(this.f38912c.u());
        this.f38919j.a(ahVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t6$c */
    public static final class c implements Fg {
        public c() {
        }

        @Override // com.ironsource.Fg
        public void a(int i10, String errorReason) {
            Long lValueOf;
            kotlin.jvm.internal.e0.checkNotNullParameter(errorReason, "errorReason");
            Long l9 = C3458t6.this.f38921l;
            if (l9 != null) {
                lValueOf = Long.valueOf(C3458t6.this.f38916g.a() - l9.longValue());
            } else {
                lValueOf = null;
            }
            C3458t6.this.f38911b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, i10, errorReason, C3458t6.this.f38912c.u());
            b bVar = C3458t6.this.f38917h;
            if (bVar != null) {
                bVar.b(C3458t6.this, new IronSourceError(i10, errorReason));
            }
        }

        @Override // com.ironsource.Fg
        public void b(AbstractC3553z instance) {
            Long lValueOf;
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            Long l9 = C3458t6.this.f38921l;
            if (l9 != null) {
                lValueOf = Long.valueOf(C3458t6.this.f38916g.a() - l9.longValue());
            } else {
                lValueOf = null;
            }
            C3458t6.this.f38911b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, C3458t6.this.f38912c.u());
            C3458t6.this.g();
            b bVar = C3458t6.this.f38917h;
            if (bVar != null) {
                bVar.b(C3458t6.this, instance.e());
            }
        }

        @Override // com.ironsource.Fg
        public void a(AbstractC3553z instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            C3458t6.this.f38911b.e().a().e(C3458t6.this.c());
            C3458t6.this.g();
            b bVar = C3458t6.this.f38917h;
            if (bVar != null) {
                bVar.c(C3458t6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC3336m6
    public void b(C3318l6 fullscreenInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.f38911b.e().a().b(c());
        this.f38913d.onClosed();
    }

    private final LevelPlay.AdFormat b() {
        return this.f38912c.b().e();
    }

    public /* synthetic */ C3458t6(Mb mb2, V0 v02, AbstractC3486v0 abstractC3486v0, InterfaceC3509w6 interfaceC3509w6, zg zgVar, kv.q qVar, InterfaceC3501vf interfaceC3501vf, InterfaceC3456t4 interfaceC3456t4, int i10, kotlin.jvm.internal.u uVar) {
        this(mb2, v02, abstractC3486v0, interfaceC3509w6, (i10 & 16) != 0 ? null : zgVar, (i10 & 32) != 0 ? null : qVar, (i10 & 64) != 0 ? new W6(X6.a(v02.a())) : interfaceC3501vf, (i10 & 128) != 0 ? new InterfaceC3456t4.a() : interfaceC3456t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3553z a(C3458t6 this$0, A instanceData, G adInstancePayload) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kv.q dVar = this$0.f38914e;
        if (dVar == null) {
            dVar = new d(this$0);
        }
        return (AbstractC3553z) dVar.invoke(instanceData, adInstancePayload, this$0);
    }

    public final void a(Activity activity, a displayListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C3350n0.a(this.f38911b, (String) null, (String) null, 3, (Object) null));
        this.f38918i = displayListener;
        this.f38911b.e().a().a(activity, c());
        InterfaceC3396pb<tu.x0> interfaceC3396pbF = f();
        if (interfaceC3396pbF instanceof InterfaceC3396pb.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC3396pb.a) interfaceC3396pbF).b();
            ironLog.verbose(C3350n0.a(this.f38911b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.f38911b.e().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), "");
            displayListener.a(this, ironSourceErrorB);
            return;
        }
        InterfaceC3501vf.a aVar = this.f38920k;
        if (aVar != null) {
            aVar.a();
        }
        this.f38919j.a(new C3356n6(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3318l6 a(A a10, G g8, InterfaceC3336m6 interfaceC3336m6) {
        return new C3318l6(new V0(this.f38911b, D0.b.PROVIDER), a10, g8, interfaceC3336m6);
    }

    private final xg a(zg zgVar) {
        Fg fgA = a();
        if (zgVar != null) {
            return zgVar.a(fgA);
        }
        return new xg(this.f38911b, this.f38912c, fgA);
    }

    private final Fg a() {
        return new c();
    }

    @Override // com.ironsource.InterfaceC3336m6
    public void a(C3318l6 fullscreenInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        a aVar = this.f38918i;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        h();
        this.f38910a.l().b(this.f38912c.b().c());
    }

    @Override // com.ironsource.D
    public void a(AbstractC3553z instance, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38911b, error.toString(), (String) null, 2, (Object) null));
        this.f38911b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), "");
        a aVar = this.f38918i;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC3336m6
    public void a(C3318l6 fullscreenInstance, LevelPlayReward reward) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38911b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.f38913d.a(reward);
    }

    @Override // com.ironsource.D
    public void a(AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        this.f38911b.e().a().a(c());
        this.f38913d.g();
    }
}
