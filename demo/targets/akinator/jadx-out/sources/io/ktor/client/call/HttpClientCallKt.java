package io.ktor.client.call;

import av.e;
import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.lang.reflect.Type;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class HttpClientCallKt {
    public static final /* synthetic */ <T> Object body(HttpClientCall httpClientCall, d<? super T> dVar) {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objBodyNullable = httpClientCall.bodyNullable(typeInfoTypeInfoImpl, dVar);
        b0.mark(1);
        e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return objBodyNullable;
    }

    public static final /* synthetic */ <T> Object body(HttpResponse httpResponse, d<? super T> dVar) {
        HttpClientCall call = httpResponse.getCall();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, dVar);
        b0.mark(1);
        e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return objBodyNullable;
    }

    public static final <T> Object body(HttpResponse httpResponse, TypeInfo typeInfo, d<? super T> dVar) {
        Object objBodyNullable = httpResponse.getCall().bodyNullable(typeInfo, dVar);
        e.getCOROUTINE_SUSPENDED();
        return objBodyNullable;
    }
}
