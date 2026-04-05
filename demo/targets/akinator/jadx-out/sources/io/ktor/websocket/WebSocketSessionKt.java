package io.ktor.websocket;

import av.e;
import bv.d;
import bv.f;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketSessionKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", i = {0}, l = {AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "close", n = {"$this$close"}, s = {"L$0"})
    /* renamed from: io.ktor.websocket.WebSocketSessionKt$close$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketSessionKt.close((WebSocketSession) null, (CloseReason) null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r5.flush(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object close(io.ktor.websocket.WebSocketSession r5, io.ktor.websocket.CloseReason r6, zu.d<? super tu.x0> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.websocket.WebSocketSessionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = (io.ktor.websocket.WebSocketSessionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = new io.ktor.websocket.WebSocketSessionKt$close$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            io.ktor.websocket.WebSocketSession r5 = (io.ktor.websocket.WebSocketSession) r5
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L5b
            goto L4f
        L3c:
            tu.a0.throwOnFailure(r7)
            io.ktor.websocket.Frame$Close r7 = new io.ktor.websocket.Frame$Close     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L5b
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5b
            r0.label = r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r5.send(r7, r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L4f
            goto L5a
        L4f:
            r6 = 0
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L5b
            r0.label = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r5.flush(r0)     // Catch: java.lang.Throwable -> L5b
            if (r5 != r1) goto L5b
        L5a:
            return r1
        L5b:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketSessionKt.close(io.ktor.websocket.WebSocketSession, io.ktor.websocket.CloseReason, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object close$default(WebSocketSession webSocketSession, CloseReason closeReason, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            closeReason = new CloseReason(CloseReason.Codes.NORMAL, "");
        }
        return close(webSocketSession, closeReason, (zu.d<? super x0>) dVar);
    }

    public static final Object closeExceptionally(WebSocketSession webSocketSession, Throwable th2, zu.d<? super x0> dVar) {
        Object objClose = close(webSocketSession, th2 instanceof CancellationException ? new CloseReason(CloseReason.Codes.NORMAL, "") : new CloseReason(CloseReason.Codes.INTERNAL_ERROR, th2.toString()), dVar);
        return objClose == e.getCOROUTINE_SUSPENDED() ? objClose : x0.f87415a;
    }

    public static final <T extends WebSocketExtension<?>> T extension(WebSocketSession webSocketSession, WebSocketExtensionFactory<?, T> extension) {
        e0.checkNotNullParameter(webSocketSession, "<this>");
        e0.checkNotNullParameter(extension, "extension");
        T t10 = (T) extensionOrNull(webSocketSession, extension);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(("Extension " + extension + " not found.").toString());
    }

    public static final <T extends WebSocketExtension<?>> T extensionOrNull(WebSocketSession webSocketSession, WebSocketExtensionFactory<?, T> extension) {
        Object next;
        e0.checkNotNullParameter(webSocketSession, "<this>");
        e0.checkNotNullParameter(extension, "extension");
        Iterator<T> it = webSocketSession.getExtensions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WebSocketExtension) next).getFactory().getKey() == extension.getKey()) {
                break;
            }
        }
        if (next instanceof WebSocketExtension) {
            return (T) next;
        }
        return null;
    }

    public static final Object send(WebSocketSession webSocketSession, String str, zu.d<? super x0> dVar) {
        Object objSend = webSocketSession.send(new Frame.Text(str), dVar);
        return objSend == e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
    }

    public static final Object send(WebSocketSession webSocketSession, byte[] bArr, zu.d<? super x0> dVar) {
        Object objSend = webSocketSession.send(new Frame.Binary(true, bArr), dVar);
        return objSend == e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
    }

    @tu.f
    public static final Object close(WebSocketSession webSocketSession, Throwable th2, zu.d<? super x0> dVar) {
        x0 x0Var = x0.f87415a;
        if (th2 == null) {
            Object objClose$default = close$default(webSocketSession, null, dVar, 1, null);
            return objClose$default == e.getCOROUTINE_SUSPENDED() ? objClose$default : x0Var;
        }
        Object objCloseExceptionally = closeExceptionally(webSocketSession, th2, dVar);
        return objCloseExceptionally == e.getCOROUTINE_SUSPENDED() ? objCloseExceptionally : x0Var;
    }
}
