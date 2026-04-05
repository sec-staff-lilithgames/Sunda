package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import sv.k0;
import sv.n0;
import tu.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    public static final Companion Companion = new Companion(null);
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(Object internalRef) {
        super(p1.hashMapOf(e0.to(TO_STRING_METHOD, new Class[0])));
        kotlin.jvm.internal.e0.checkNotNullParameter(internalRef, "internalRef");
        this.internalRef = internalRef;
    }

    private final String parseOriginalJson(String str) {
        try {
            int iIndexOf$default = n0.indexOf$default((CharSequence) str, "jsonString='", 0, false, 6, (Object) null) + 12;
            int iIndexOf$default2 = n0.indexOf$default((CharSequence) str, "', parsedJson=", 0, false, 6, (Object) null);
            if (1 <= iIndexOf$default && iIndexOf$default < iIndexOf$default2) {
                String strSubstring = str.substring(iIndexOf$default, iIndexOf$default2);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return k0.replace$default(strSubstring, "\\/", "/", false, 4, (Object) null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        try {
            String originalJson = parseOriginalJson(toString());
            return originalJson != null ? new JSONObject(originalJson) : new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public String toString() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objCallNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        kotlin.jvm.internal.e0.checkNotNull(objCallNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) objCallNonVoidMethod;
    }
}
