package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import a.b;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class QueryProductDetailsParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryProductDetailsParamsInternalInstance;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final Object callNonVoidStaticMethod(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object objInvoke = getClassForParams().getMethod(str, null).invoke(null, null);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(b.l("Static method ", str, " returned null"));
        }

        public final Class<?> getClassForParams() {
            e0.checkNotNullExpressionValue(QueryProductDetailsParams.class, "forName(\"com.android.bil…eryProductDetailsParams\")");
            return QueryProductDetailsParams.class;
        }

        public final QueryProductDetailsParamsBuilderBridge newBuilder() {
            return new QueryProductDetailsParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public QueryProductDetailsParamsBridge(Object obj) {
        super(p1.hashMapOf(tu.e0.to("newBuilder", new Class[0])));
        this.queryProductDetailsParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams";
    }

    public final Object getQueryProductDetailsParamsInternalInstance() {
        return this.queryProductDetailsParamsInternalInstance;
    }
}
