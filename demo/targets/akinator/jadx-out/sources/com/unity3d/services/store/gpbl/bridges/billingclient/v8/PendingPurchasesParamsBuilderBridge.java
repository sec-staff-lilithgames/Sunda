package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.u;
import tu.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PendingPurchasesParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String ENABLE_ONE_TIME_PRODUCT_METHOD = "enableOneTimeProducts";
    private final Object builderInstance;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPurchasesParamsBuilderBridge(Object builderInstance) {
        super(p1.hashMapOf(e0.to(ENABLE_ONE_TIME_PRODUCT_METHOD, new Class[0]), e0.to(BUILD_METHOD, new Class[0])));
        kotlin.jvm.internal.e0.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final PendingPurchasesParamsBridge build() {
        return new PendingPurchasesParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    public final PendingPurchasesParamsBuilderBridge enableOneTimeProducts() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        callVoidMethod(ENABLE_ONE_TIME_PRODUCT_METHOD, this.builderInstance, new Object[0]);
        return this;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams$Builder";
    }
}
