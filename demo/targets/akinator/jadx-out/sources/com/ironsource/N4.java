package com.ironsource;

import com.ironsource.AbstractC3438s3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N4<Smash extends AbstractC3438s3<?>> extends Kg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(int i10, boolean z10, List<? extends Smash> waterfall) {
        super(i10, z10, waterfall);
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.Kg
    public void c(Smash smash) {
        kotlin.jvm.internal.e0.checkNotNullParameter(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
