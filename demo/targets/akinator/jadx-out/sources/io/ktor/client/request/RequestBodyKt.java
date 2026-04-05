package io.ktor.client.request;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.lang.reflect.Type;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RequestBodyKt {
    private static final AttributeKey<TypeInfo> BodyTypeAttributeKey = new AttributeKey<>("BodyTypeAttributeKey");

    public static final AttributeKey<TypeInfo> getBodyTypeAttributeKey() {
        return BodyTypeAttributeKey;
    }

    public static final /* synthetic */ <T> void setBody(HttpRequestBuilder httpRequestBuilder, T t10) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        if (t10 == null) {
            httpRequestBuilder.setBody(NullBody.INSTANCE);
            e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            Type javaType = TypesJVMKt.getJavaType((KType) null);
            e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null));
            return;
        }
        if (t10 instanceof OutgoingContent) {
            httpRequestBuilder.setBody(t10);
            httpRequestBuilder.setBodyType(null);
            return;
        }
        httpRequestBuilder.setBody(t10);
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType2 = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(javaType2, c1.getOrCreateKotlinClass(Object.class), null));
    }

    public static final void setBody(HttpRequestBuilder httpRequestBuilder, Object obj, TypeInfo bodyType) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(bodyType, "bodyType");
        if (obj == null) {
            obj = NullBody.INSTANCE;
        }
        httpRequestBuilder.setBody(obj);
        httpRequestBuilder.setBodyType(bodyType);
    }
}
