package com.inmobi.media;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ib implements BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ob f31878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Kb f31879b;

    public Ib(Ob ob2, Kb kb2) {
        this.f31878a = ob2;
        this.f31879b = kb2;
    }

    public static final void a(kv.l onComplete, Hb result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "$onComplete");
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "$result");
        onComplete.invoke(result);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        this.f31878a.getClass();
        C2925od.a(new zk.o(this.f31879b, this.f31878a, 0));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        Object fb2;
        kotlin.jvm.internal.e0.checkNotNullParameter(billingResult, "billingResult");
        this.f31878a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            fb2 = Gb.f31826a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            fb2 = new Fb(debugMessage, responseCode);
        }
        C2925od.a(new zk.n(1, this.f31879b, fb2));
    }

    public static final void a(kv.l onComplete, Ob this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "$onComplete");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        onComplete.invoke(new Fb("Billing Service Disconnected", -1));
    }
}
