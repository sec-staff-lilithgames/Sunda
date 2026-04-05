package com.ironsource;

import com.ironsource.F;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3523x3 extends F {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3523x3(AbstractC3486v0 adUnitData, Cg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.F
    public void a(AbstractC3553z instance, F.b loadSelection) {
        String strL;
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadSelection, "loadSelection");
        if (!instance.u()) {
            IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.p() + " (non-bidder) is ready to load");
            loadSelection.a().add(instance);
            return;
        }
        loadSelection.a(true);
        if (loadSelection.e()) {
            strL = a.b.l("Advanced Loading: Starting to load bidder ", instance.p(), ". No other instances will be loaded at the same time.");
            loadSelection.a().add(instance);
        } else {
            strL = a.b.l("Advanced Loading: Won't start loading bidder ", instance.p(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(instance.d().name() + " - " + strL);
    }

    @Override // com.ironsource.F
    public boolean a(F.b loadSelection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadSelection, "loadSelection");
        return super.a(loadSelection) || loadSelection.d();
    }
}
