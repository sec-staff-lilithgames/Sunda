package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Hg {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34628c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f34629a;

    /* renamed from: b, reason: collision with root package name */
    private final Xc f34630b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final Hg a(V0 adTools, AbstractC3486v0 adUnitData, Xc outcomeReporter, Cg waterfallInstances, F adInstanceLoadStrategy) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
            kotlin.jvm.internal.e0.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new C3400pf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new O4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public Hg(C3350n0 adTools, Xc outcomeReporter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.f34629a = adTools;
        this.f34630b = outcomeReporter;
    }

    private final void b(AbstractC3553z abstractC3553z, List<? extends AbstractC3553z> list) {
        for (AbstractC3553z abstractC3553z2 : list) {
            if (abstractC3553z2 == abstractC3553z) {
                abstractC3553z.a(true);
                return;
            } else {
                abstractC3553z2.a(false);
                IronLog.INTERNAL.verbose(C3350n0.a(this.f34629a, j1.o2.l(abstractC3553z2.q(), " - not ready to show"), (String) null, 2, (Object) null));
            }
        }
    }

    public abstract void a();

    public abstract void a(AbstractC3553z abstractC3553z);

    public final void a(AbstractC3553z abstractC3553z, List<? extends AbstractC3553z> orderedInstances) {
        kotlin.jvm.internal.e0.checkNotNullParameter(abstractC3553z, RnJusJ.AnZ);
        kotlin.jvm.internal.e0.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(abstractC3553z, orderedInstances);
        c(abstractC3553z);
    }

    public abstract void b(AbstractC3553z abstractC3553z);

    public abstract void c(AbstractC3553z abstractC3553z);

    public final void a(AbstractC3553z instance, String str, C3360na publisherDataHolder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f34630b.a(instance, str, publisherDataHolder);
    }
}
