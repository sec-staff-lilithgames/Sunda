package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import tu.e0;
import uu.p1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class QueryProductDetailsParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_LIST_METHOD = "setProductList";
    private Object builderInstance;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsParamsBuilderBridge(Object builderInstance) {
        super(p1.mapOf(e0.to(SET_PRODUCT_LIST_METHOD, new Class[]{List.class}), e0.to(BUILD_METHOD, new Class[0])));
        kotlin.jvm.internal.e0.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Builder";
    }

    public final void setBuilderInstance(Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "<set-?>");
        this.builderInstance = obj;
    }

    public final QueryProductDetailsParamsBuilderBridge setProductList(List<ProductBridge> productList) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.e0.checkNotNullParameter(productList, "productList");
        List<ProductBridge> list = productList;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBridge) it.next()).getInternalClass());
        }
        Object objCallNonVoidMethod = callNonVoidMethod(SET_PRODUCT_LIST_METHOD, this.builderInstance, arrayList);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…nce, productListInternal)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }
}
