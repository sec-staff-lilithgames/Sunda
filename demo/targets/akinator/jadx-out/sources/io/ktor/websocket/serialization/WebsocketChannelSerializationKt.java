package io.ktor.websocket.serialization;

import bv.d;
import bv.f;
import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.util.InternalAPI;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.websocket.WebSocketSession;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebsocketChannelSerializationKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0, 0, 0, 1, 1}, l = {95, 104}, m = "receiveDeserializedBase", n = {"typeInfo", "converter", "charset", "typeInfo", "frame"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2, reason: invalid class name */
    public static final class AnonymousClass2 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebsocketChannelSerializationKt.receiveDeserializedBase(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0}, l = {50, 55}, m = "sendSerializedBase", n = {"$this$sendSerializedBase"}, s = {"L$0"})
    /* renamed from: io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2, reason: invalid class name and case insensitive filesystem */
    public static final class C41122 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41122(zu.d<? super C41122> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebsocketChannelSerializationKt.sendSerializedBase(null, null, null, null, null, this);
        }
    }

    @InternalAPI
    public static final /* synthetic */ <T> Object receiveDeserializedBase(WebSocketSession webSocketSession, WebsocketContentConverter websocketContentConverter, Charset charset, zu.d<Object> dVar) throws WebsocketDeserializeException {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        Object objReceiveDeserializedBase = receiveDeserializedBase(webSocketSession, typeInfoTypeInfoImpl, websocketContentConverter, charset, dVar);
        b0.mark(1);
        return objReceiveDeserializedBase;
    }

    @InternalAPI
    public static final /* synthetic */ <T> Object sendSerializedBase(WebSocketSession webSocketSession, Object obj, WebsocketContentConverter websocketContentConverter, Charset charset, zu.d<? super x0> dVar) {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
        b0.mark(0);
        sendSerializedBase(webSocketSession, obj, typeInfoTypeInfoImpl, websocketContentConverter, charset, dVar);
        b0.mark(1);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @io.ktor.util.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object receiveDeserializedBase(io.ktor.websocket.WebSocketSession r16, io.ktor.util.reflect.TypeInfo r17, io.ktor.serialization.WebsocketContentConverter r18, java.nio.charset.Charset r19, zu.d<java.lang.Object> r20) throws io.ktor.serialization.WebsocketDeserializeException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.serialization.WebsocketChannelSerializationKt.receiveDeserializedBase(io.ktor.websocket.WebSocketSession, io.ktor.util.reflect.TypeInfo, io.ktor.serialization.WebsocketContentConverter, java.nio.charset.Charset, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r5.send((io.ktor.websocket.Frame) r10, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.util.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object sendSerializedBase(io.ktor.websocket.WebSocketSession r5, java.lang.Object r6, io.ktor.util.reflect.TypeInfo r7, io.ktor.serialization.WebsocketContentConverter r8, java.nio.charset.Charset r9, zu.d<? super tu.x0> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.websocket.serialization.WebsocketChannelSerializationKt.C41122
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2 r0 = (io.ktor.websocket.serialization.WebsocketChannelSerializationKt.C41122) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2 r0 = new io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r10)
            goto L5c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            io.ktor.websocket.WebSocketSession r5 = (io.ktor.websocket.WebSocketSession) r5
            tu.a0.throwOnFailure(r10)
            goto L4a
        L3c:
            tu.a0.throwOnFailure(r10)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r10 = r8.serializeNullable(r9, r7, r6, r0)
            if (r10 != r1) goto L4a
            goto L5b
        L4a:
            io.ktor.websocket.Frame r10 = (io.ktor.websocket.Frame) r10
            kotlinx.coroutines.channels.SendChannel r5 = r5.getOutgoing()
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.send(r10, r0)
            if (r5 != r1) goto L5c
        L5b:
            return r1
        L5c:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.serialization.WebsocketChannelSerializationKt.sendSerializedBase(io.ktor.websocket.WebSocketSession, java.lang.Object, io.ktor.util.reflect.TypeInfo, io.ktor.serialization.WebsocketContentConverter, java.nio.charset.Charset, zu.d):java.lang.Object");
    }
}
