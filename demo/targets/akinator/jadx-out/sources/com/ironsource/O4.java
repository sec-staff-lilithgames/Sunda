package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class O4 extends Hg {

    /* renamed from: d, reason: collision with root package name */
    private final Xc f35093d;

    /* renamed from: e, reason: collision with root package name */
    private final Cg f35094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4(V0 adTools, Xc outcomeReporter, Cg waterfallInstances) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f35093d = outcomeReporter;
        this.f35094e = waterfallInstances;
    }

    @Override // com.ironsource.Hg
    public void a() {
    }

    @Override // com.ironsource.Hg
    public void b(AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        this.f35093d.a(this.f35094e.b(), instance);
    }

    @Override // com.ironsource.Hg
    public void c(AbstractC3553z instanceToShow) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceToShow, "instanceToShow");
    }

    @Override // com.ironsource.Hg
    public void a(AbstractC3553z instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
    }
}
