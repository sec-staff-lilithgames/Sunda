package io.ktor.client.plugins.websocket;

import av.e;
import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.serialization.ContentConverterKt;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.serialization.WebsocketConverterNotFoundException;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.websocket.serialization.WebsocketChannelSerializationKt;
import java.lang.reflect.Type;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ClientSessionsKt {
    public static final WebsocketContentConverter getConverter(DefaultClientWebSocketSession defaultClientWebSocketSession) {
        e0.checkNotNullParameter(defaultClientWebSocketSession, "<this>");
        WebSockets webSockets = (WebSockets) HttpClientPluginKt.pluginOrNull(defaultClientWebSocketSession.getCall().getClient(), WebSockets.Plugin);
        if (webSockets != null) {
            return webSockets.getContentConverter();
        }
        return null;
    }

    public static final <T> Object receiveDeserialized(DefaultClientWebSocketSession defaultClientWebSocketSession, TypeInfo typeInfo, d<? super T> dVar) throws WebsocketDeserializeException, WebsocketConverterNotFoundException {
        WebsocketContentConverter converter = getConverter(defaultClientWebSocketSession);
        if (converter == null) {
            throw new WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        Object objReceiveDeserializedBase = WebsocketChannelSerializationKt.receiveDeserializedBase(defaultClientWebSocketSession, typeInfo, converter, ContentConverterKt.suitableCharset$default(defaultClientWebSocketSession.getCall().getRequest().getHeaders(), null, 1, null), dVar);
        e.getCOROUTINE_SUSPENDED();
        return objReceiveDeserializedBase;
    }

    public static final Object sendSerialized(DefaultClientWebSocketSession defaultClientWebSocketSession, Object obj, TypeInfo typeInfo, d<? super x0> dVar) throws WebsocketConverterNotFoundException {
        WebsocketContentConverter converter = getConverter(defaultClientWebSocketSession);
        if (converter == null) {
            throw new WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        Object objSendSerializedBase = WebsocketChannelSerializationKt.sendSerializedBase(defaultClientWebSocketSession, obj, typeInfo, converter, ContentConverterKt.suitableCharset$default(defaultClientWebSocketSession.getCall().getRequest().getHeaders(), null, 1, null), dVar);
        return objSendSerializedBase == e.getCOROUTINE_SUSPENDED() ? objSendSerializedBase : x0.f87415a;
    }

    public static final /* synthetic */ <T> Object receiveDeserialized(DefaultClientWebSocketSession defaultClientWebSocketSession, d<? super T> dVar) throws WebsocketDeserializeException, WebsocketConverterNotFoundException {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objReceiveDeserialized = receiveDeserialized(defaultClientWebSocketSession, typeInfoTypeInfoImpl, dVar);
        b0.mark(1);
        return objReceiveDeserialized;
    }

    public static final /* synthetic */ <T> Object sendSerialized(DefaultClientWebSocketSession defaultClientWebSocketSession, T t10, d<? super x0> dVar) throws WebsocketConverterNotFoundException {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        sendSerialized(defaultClientWebSocketSession, t10, typeInfoTypeInfoImpl, dVar);
        b0.mark(1);
        return x0.f87415a;
    }
}
