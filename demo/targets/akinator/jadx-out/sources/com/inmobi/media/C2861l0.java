package com.inmobi.media;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.inmobi.adquality.models.AdQualityResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2861l0 implements InterfaceC2771fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2929p0 f33032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2723ce f33034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33035d;

    public C2861l0(C2929p0 c2929p0, boolean z10, C2723ce c2723ce, String str) {
        this.f33032a = c2929p0;
        this.f33033b = z10;
        this.f33034c = c2723ce;
        this.f33035d = str;
    }

    @Override // com.inmobi.media.InterfaceC2771fb
    public final void a(Object obj) {
        String result = (String) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        C2929p0 c2929p0 = this.f33032a;
        StringBuilder sbO = e3.g.o("file saved - ", result, " , isReporting - ");
        sbO.append(this.f33033b);
        c2929p0.a(sbO.toString());
        C2929p0 c2929p02 = this.f33032a;
        C2723ce process = this.f33034c;
        String beacon = this.f33035d;
        boolean z10 = this.f33033b;
        c2929p02.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
        kotlin.jvm.internal.e0.checkNotNullParameter(beacon, "beacon");
        tu.x0 x0Var = null;
        if (z10) {
            c2929p02.a(new AdQualityResult(result, null, beacon, c2929p02.f33243k.toString()), false);
            return;
        }
        c2929p02.f33238f.remove(process);
        AdQualityResult adQualityResult = c2929p02.f33241i;
        if (adQualityResult != null) {
            adQualityResult.setImageLocation(result);
            x0Var = tu.x0.f87415a;
        }
        if (x0Var == null) {
            c2929p02.f33241i = new AdQualityResult(result, null, beacon, null, 8, null);
        }
        c2929p02.a("file is saved. result - " + c2929p02.f33241i);
        c2929p02.a(true);
    }

    @Override // com.inmobi.media.InterfaceC2771fb
    public final void onError(Exception exc) {
        C2929p0 c2929p0 = this.f33032a;
        C2723ce process = this.f33034c;
        c2929p0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
        c2929p0.a(exc, "error in running process - ".concat(ApsMetricsDataMap.APSMETRICS_FIELD_ADCLICKEVENT));
        c2929p0.f33238f.remove(process);
        c2929p0.a(true);
    }
}
