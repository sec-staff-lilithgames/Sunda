package com.ironsource;

import com.ironsource.F;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class xg implements E {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f39233a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3486v0 f39234b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg f39235c;

    /* renamed from: d, reason: collision with root package name */
    private final Ag f39236d;

    /* renamed from: e, reason: collision with root package name */
    private F f39237e;

    /* renamed from: f, reason: collision with root package name */
    private Hg f39238f;

    /* renamed from: g, reason: collision with root package name */
    private final List<AbstractC3553z> f39239g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC3553z f39240h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39241i;

    public xg(V0 adTools, AbstractC3486v0 adUnitData, Fg listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f39233a = adTools;
        this.f39234b = adUnitData;
        this.f39235c = listener;
        this.f39236d = Ag.f33850d.a(adTools, adUnitData);
        this.f39239g = new ArrayList();
    }

    private final boolean e() {
        return this.f39240h != null;
    }

    private final void f() {
        F f10 = this.f39237e;
        F.b bVarD = f10 != null ? f10.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.f39235c.a(509, "Mediation No fill");
            return;
        }
        if (!bVarD.f()) {
            Iterator<AbstractC3553z> it = bVarD.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            Hg hg2 = this.f39238f;
            if (hg2 != null) {
                hg2.a();
            }
        }
    }

    public final AbstractC3553z c() {
        F.c cVarC;
        F f10 = this.f39237e;
        if (f10 == null || (cVarC = f10.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    public final boolean d() {
        Iterator<AbstractC3553z> it = this.f39239g.iterator();
        while (it.hasNext()) {
            if (it.next().z()) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Bg {
        public a() {
        }

        @Override // com.ironsource.Bg
        public void a(Cg waterfallInstances) {
            kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (xg.this.f39241i) {
                return;
            }
            xg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.Bg
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.e0.checkNotNullParameter(errorReason, "errorReason");
            if (xg.this.f39241i) {
                return;
            }
            xg.this.f39235c.a(i10, errorReason);
        }
    }

    private final void c(AbstractC3553z abstractC3553z) {
        d(abstractC3553z);
        b();
    }

    public final void b() {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f39233a, "dispose", (String) null, 2, (Object) null));
        Iterator<T> it = this.f39239g.iterator();
        while (it.hasNext()) {
            ((AbstractC3553z) it.next()).c();
        }
        this.f39239g.clear();
        this.f39233a.e().h().a();
    }

    private final void d(AbstractC3553z abstractC3553z) {
        this.f39240h = abstractC3553z;
        this.f39239g.remove(abstractC3553z);
    }

    public final void a(C adInstanceFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.f39236d.a(adInstanceFactory, new a());
    }

    public final void a(I adInstancePresenter) {
        AbstractC3553z abstractC3553zC;
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        F f10 = this.f39237e;
        F.c cVarC = f10 != null ? f10.c() : null;
        if (cVarC == null || (abstractC3553zC = cVarC.c()) == null) {
            return;
        }
        c(abstractC3553zC);
        Hg hg2 = this.f39238f;
        if (hg2 != null) {
            hg2.a(cVarC.c(), cVarC.d());
        }
        cVarC.c().a(adInstancePresenter);
    }

    public final void b(AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        Hg hg2 = this.f39238f;
        if (hg2 != null) {
            hg2.a(instance, this.f39234b.l(), this.f39234b.o());
        }
    }

    public final void a() {
        this.f39241i = true;
        AbstractC3553z abstractC3553z = this.f39240h;
        if (abstractC3553z != null) {
            abstractC3553z.b();
        }
    }

    @Override // com.ironsource.E
    public void a(AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        if (!this.f39241i && !e()) {
            Hg hg2 = this.f39238f;
            if (hg2 != null) {
                hg2.a(instance);
            }
            this.f39239g.add(instance);
            if (this.f39239g.size() == 1) {
                Hg hg3 = this.f39238f;
                if (hg3 != null) {
                    hg3.b(instance);
                }
                this.f39235c.b(instance);
                return;
            }
            F f10 = this.f39237e;
            if (f10 == null || !f10.a(instance)) {
                return;
            }
            this.f39235c.a(instance);
            return;
        }
        instance.c();
    }

    @Override // com.ironsource.E
    public void a(IronSourceError error, AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        if (this.f39241i) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Cg cg2) {
        F fA = F.f34330c.a(this.f39234b, cg2);
        this.f39237e = fA;
        this.f39238f = Hg.f34628c.a(this.f39233a, this.f39234b, this.f39236d.a(), cg2, fA);
        f();
    }
}
