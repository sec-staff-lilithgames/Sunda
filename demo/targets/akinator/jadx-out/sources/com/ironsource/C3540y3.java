package com.ironsource;

import com.ironsource.AbstractC3438s3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3540y3<Smash extends AbstractC3438s3<?>> extends Kg<Smash> {

    /* renamed from: h, reason: collision with root package name */
    private boolean f39250h;

    public /* synthetic */ C3540y3(int i10, boolean z10, List list, boolean z11, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, z10, list, (i11 & 8) != 0 ? false : z11);
    }

    @Override // com.ironsource.Kg
    public void c(Smash smash) {
        String strL;
        kotlin.jvm.internal.e0.checkNotNullParameter(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.f39250h = true;
        if (d() == 0) {
            strL = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            strL = a.b.l("Advanced Loading: Won't start loading bidder ", smash.c(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + strL);
        IronSourceUtils.i(strL);
    }

    @Override // com.ironsource.Kg
    public boolean e() {
        return super.e() || this.f39250h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540y3(int i10, boolean z10, List<? extends Smash> waterfall, boolean z11) {
        super(i10, z10, waterfall);
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        this.f39250h = z11;
    }
}
