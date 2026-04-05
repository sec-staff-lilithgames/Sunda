package io.ktor.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.websocket.Frame;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import sv.g;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebsocketContentConverterKt {
    public static final /* synthetic */ <T> Object deserialize(WebsocketContentConverter websocketContentConverter, Frame frame, Charset charset, d<? super T> dVar) {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objDeserialize = websocketContentConverter.deserialize(charset, typeInfoTypeInfoImpl, frame, dVar);
        b0.mark(1);
        e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return objDeserialize;
    }

    public static /* synthetic */ Object deserialize$default(WebsocketContentConverter websocketContentConverter, Frame frame, Charset charset, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = g.f86134b;
        }
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objDeserialize = websocketContentConverter.deserialize(charset, typeInfoTypeInfoImpl, frame, dVar);
        b0.mark(1);
        e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return objDeserialize;
    }

    public static final /* synthetic */ <T> Object serialize(WebsocketContentConverter websocketContentConverter, T t10, Charset charset, d<? super Frame> dVar) {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objSerializeNullable = websocketContentConverter.serializeNullable(charset, typeInfoTypeInfoImpl, t10, dVar);
        b0.mark(1);
        return objSerializeNullable;
    }

    public static /* synthetic */ Object serialize$default(WebsocketContentConverter websocketContentConverter, Object obj, Charset charset, d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            charset = g.f86134b;
        }
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objSerializeNullable = websocketContentConverter.serializeNullable(charset, typeInfoTypeInfoImpl, obj, dVar);
        b0.mark(1);
        return objSerializeNullable;
    }
}
