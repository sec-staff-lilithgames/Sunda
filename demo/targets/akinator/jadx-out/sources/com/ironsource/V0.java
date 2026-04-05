package com.ironsource;

import com.ironsource.D0;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class V0 extends C3350n0 {

    /* renamed from: g, reason: collision with root package name */
    private final C3350n0 f35595g;

    /* renamed from: h, reason: collision with root package name */
    private final R0 f35596h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3243h2 f35597i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(C3350n0 adTools, AbstractC3486v0 adUnitData, D0.b level) {
        super(adTools, level);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(level, "level");
        this.f35595g = adTools;
        R0 r0A = C3518wf.a(adUnitData, adUnitData.e().c());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0A, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f35596h = r0A;
    }

    public final void a(InterfaceC3243h2 interfaceC3243h2) {
        this.f35597i = interfaceC3243h2;
    }

    public final void c(AbstractRunnableC3273ie task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        C3535xf.a(C3535xf.f39230a, task, 0L, 2, null);
    }

    public final String e(String serverData) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverData, "serverData");
        String strC = com.ironsource.mediationsdk.d.b().c(serverData);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    public final R0 h() {
        return this.f35596h;
    }

    public final InterfaceC3243h2 i() {
        return this.f35597i;
    }

    public final String j() {
        return com.ironsource.mediationsdk.r.m().l();
    }

    public final C3161ca k() {
        return C3518wf.a();
    }

    public final P8.a l() {
        return Mb.f34856s.a().h();
    }

    public final BaseAdAdapter<?, ?> a(A instanceData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.u(), instanceData.h(), instanceData.i().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(V0 adUnitTools, D0.b level) {
        super(adUnitTools, level);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(level, "level");
        this.f35595g = adUnitTools.f35595g;
        this.f35596h = adUnitTools.f35596h;
        this.f35597i = adUnitTools.f35597i;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings providerSettings, IronSource.a adFormat, UUID adId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    public final String a(long j10, String instanceName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceName, "instanceName");
        String strA = IronSourceUtils.a(j10, instanceName);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "getTransId(timeStamp, instanceName)");
        return strA;
    }
}
