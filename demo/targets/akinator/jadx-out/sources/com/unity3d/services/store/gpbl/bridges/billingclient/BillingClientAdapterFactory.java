package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import kotlin.jvm.internal.e0;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int i10) {
        Object objM7131constructorimpl;
        try {
            int i11 = z.f87419c;
            BillingClientBuilderBridge builder = BillingClientBridge.newBuilder(context);
            e0.checkNotNullExpressionValue(builder, "builder");
            objM7131constructorimpl = z.m7131constructorimpl(new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(builder, i10));
        } catch (Throwable th2) {
            int i12 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        return (BillingClientAdapter) objM7131constructorimpl;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i10);
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m3531createV8AdapterIoAF18A(Context context) {
        try {
            int i10 = z.f87419c;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return z.m7131constructorimpl(billingClientAdapter);
            }
            throw new FallbackException(7);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            return z.m7131constructorimpl(a0.createFailure(th2));
        }
    }

    public final BillingClientAdapter createBillingClientAdapter(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object objM3531createV8AdapterIoAF18A = m3531createV8AdapterIoAF18A(context);
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM3531createV8AdapterIoAF18A);
        if (thM7134exceptionOrNullimpl != null) {
            objM3531createV8AdapterIoAF18A = thM7134exceptionOrNullimpl instanceof FallbackException ? createV6Adapter(context, ((FallbackException) thM7134exceptionOrNullimpl).getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) objM3531createV8AdapterIoAF18A;
    }
}
