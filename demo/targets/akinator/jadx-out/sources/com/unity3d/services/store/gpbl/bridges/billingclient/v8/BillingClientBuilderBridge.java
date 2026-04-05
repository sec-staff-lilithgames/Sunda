package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.jvm.internal.u;
import tu.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {
    public static final Companion Companion = new Companion(null);
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public BillingClientBuilderBridge(Object obj) {
        super(obj, p1.hashMapOf(e0.to("enablePendingPurchases", new Class[]{PendingPurchasesParamsBridge.Companion.getClassForParams()})));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, PendingPurchasesParamsBridge.Companion.newBuilder().enableOneTimeProducts().build().getInternalClass());
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new Object[0]));
    }
}
