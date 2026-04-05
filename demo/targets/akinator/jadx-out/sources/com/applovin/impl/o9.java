package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import com.applovin.impl.d;
import com.applovin.impl.p2;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.d;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.explorestack.protobuf.Struct;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import fo.e;
import io.bidmachine.Executable;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.Configuration;
import java.util.ArrayList;
import java.util.List;
import nh.we;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements d.b, p2.a, UserMessagingPlatform.OnConsentFormLoadSuccessListener, d.a, c.InterfaceC0040c, fo.i, Executable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14998c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15000f;

    public /* synthetic */ o9(l lVar, com.applovin.impl.sdk.k kVar, n nVar, o oVar) {
        this.f15000f = lVar;
        this.f14997b = kVar;
        this.f14998c = nVar;
        this.f14999e = oVar;
    }

    @Override // com.applovin.impl.d.b
    public void a(Activity activity) {
        l.a((o2) this.f15000f, (n) this.f14998c, (o) this.f14999e, (com.applovin.impl.sdk.k) this.f14997b, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // fo.i
    public List create(int i10, gn.v1 v1Var, int[] iArr) {
        fo.g gVar = (fo.g) this.f15000f;
        String str = (String) this.f14998c;
        int[] iArr2 = (int[]) this.f14999e;
        Point point = (Point) this.f14997b;
        we weVar = fo.e.f55823j;
        return e.i.createForTrackGroup(i10, v1Var, gVar, iArr, str, iArr2[i10], point);
    }

    @Override // io.bidmachine.Executable
    public void execute(Object obj) {
        io.bidmachine.n1 n1Var = (io.bidmachine.n1) this.f15000f;
        String str = (String) this.f14998c;
        InitResponse initResponse = (InitResponse) this.f14999e;
        String str2 = (String) this.f14997b;
        Context context = (Context) obj;
        n1Var.f61932o.getClass();
        try {
            if (initResponse.hasSdkAnalyticConfigV2()) {
                Configuration sdkAnalyticConfigV2 = initResponse.getSdkAnalyticConfigV2();
                ArrayList arrayListA = io.bidmachine.c1.a(sdkAnalyticConfigV2.getMonitorsList());
                ArrayList arrayListB = io.bidmachine.c1.b(sdkAnalyticConfigV2.getReadersList());
                Struct struct = initResponse.getExtras().getPrivate();
                String value = sdkAnalyticConfigV2.getBpk().getValue();
                BidMachineAnalytics.configure(context, new AnalyticsConfig(str2, arrayListA, arrayListB, value, struct));
                if (str.equals(str2)) {
                    return;
                }
                BidMachineAnalytics.configure(context, new AnalyticsConfig(str, arrayListA, arrayListB, value, struct));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((com.applovin.impl.privacy.cmp.a) this.f15000f).a((a.InterfaceC0037a) this.f14998c, (FormError) this.f14999e, (k0) this.f14997b, consentForm);
    }

    public /* synthetic */ o9(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15000f = obj;
        this.f14998c = obj2;
        this.f14999e = obj3;
        this.f14997b = obj4;
    }

    @Override // com.applovin.impl.p2.a
    public void a(i2 i2Var, o2 o2Var) {
        ((l) this.f15000f).a((com.applovin.impl.sdk.k) this.f14997b, (n) this.f14998c, (o) this.f14999e, i2Var, o2Var);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void a(com.applovin.impl.sdk.ad.b bVar) {
        ((AppLovinAdServiceImpl) this.f15000f).a((AppLovinAdLoadListener) this.f14998c, (JSONObject) this.f14999e, (u) this.f14997b, bVar);
    }

    @Override // com.applovin.impl.sdk.c.InterfaceC0040c
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        ((com.applovin.impl.sdk.d) this.f15000f).a((d.a) this.f14998c, (c.a) this.f14999e, (u) this.f14997b, bVar, str);
    }
}
