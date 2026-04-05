package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.pf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3400pf extends Hg {

    /* renamed from: d, reason: collision with root package name */
    private final Xc f38189d;

    /* renamed from: e, reason: collision with root package name */
    private final Cg f38190e;

    /* renamed from: f, reason: collision with root package name */
    private final F f38191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3400pf(V0 adTools, Xc outcomeReporter, Cg waterfallInstances, F adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.f38189d = outcomeReporter;
        this.f38190e = waterfallInstances;
        this.f38191f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.Hg
    public void a(AbstractC3553z instance) {
        AbstractC3553z abstractC3553zA;
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        if (this.f38191f.a(instance)) {
            this.f38189d.a(this.f38190e.b(), instance);
        } else {
            if (!this.f38191f.a() || (abstractC3553zA = this.f38191f.c().a()) == null) {
                return;
            }
            this.f38189d.a(this.f38190e.b(), abstractC3553zA);
        }
    }

    @Override // com.ironsource.Hg
    public void b(AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Hg
    public void c(AbstractC3553z instanceToShow) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.f38189d.a(this.f38190e.b(), instanceToShow);
    }

    @Override // com.ironsource.Hg
    public void a() {
        AbstractC3553z abstractC3553zA = this.f38191f.c().a();
        if (abstractC3553zA != null) {
            this.f38189d.a(this.f38190e.b(), abstractC3553zA);
        }
    }
}
