package io.ktor.websocket;

import androidx.core.app.NotificationCompat;
import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.ContentDisposition;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kv.p;
import tu.x0;
import uu.y0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DefaultWebSocketSessionImpl implements DefaultWebSocketSession, WebSocketSession {
    private final List<WebSocketExtension<?>> _extensions;
    private final Deferred<CloseReason> closeReason;
    private final CompletableDeferred<CloseReason> closeReasonRef;
    private volatile /* synthetic */ int closed;
    private final CompletableJob context;
    private final m coroutineContext;
    private final Channel<Frame> filtered;
    private final Channel<Frame> outgoingToBeProcessed;
    private long pingIntervalMillis;
    volatile /* synthetic */ Object pinger;
    private final WebSocketSession raw;
    private volatile /* synthetic */ int started;
    private long timeoutMillis;
    public static final Companion Companion = new Companion(null);
    private static final Frame.Pong EmptyPong = new Frame.Pong(new byte[0], NonDisposableHandle.INSTANCE);
    static final /* synthetic */ AtomicReferenceFieldUpdater pinger$FU = AtomicReferenceFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, Object.class, "pinger");
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, "closed");
    private static final /* synthetic */ AtomicIntegerFieldUpdater started$FU = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, C3191e4.h.f36478d0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0}, l = {327}, m = "checkMaxFrameSize", n = {ContentDisposition.Parameters.Size}, s = {"I$0"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.checkMaxFrameSize(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 2}, l = {252, NotificationCompat.FLAG_LOCAL_ONLY, 266}, m = "outgoingProcessorLoop", n = {"this", "this"}, s = {"L$0", "L$0"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41021 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41021(zu.d<? super C41021> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.outgoingProcessorLoop(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {352, 172, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 178, 179, 181, 196, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frame", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41031 extends n implements p {
        final /* synthetic */ SendChannel<Frame.Ping> $ponger;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41031(SendChannel<? super Frame.Ping> sendChannel, zu.d<? super C41031> dVar) {
            super(2, dVar);
            this.$ponger = sendChannel;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41031 c41031 = DefaultWebSocketSessionImpl.this.new C41031(this.$ponger, dVar);
            c41031.L$0 = obj;
            return c41031;
        }

        /* JADX WARN: Code restructure failed: missing block: B:152:0x03a2, code lost:
        
            r5 = r12.f71816b;
            kotlin.jvm.internal.e0.checkNotNull(r5);
            io.ktor.utils.io.core.OutputKt.writeFully$default((io.ktor.utils.io.core.Output) r5, r0.getData(), 0, 0, 6, (java.lang.Object) null);
            r0 = r13;
            r13 = r7;
            r7 = r0;
            r0 = r12;
            r12 = r9;
            r9 = r10;
            r10 = r11;
            r11 = r0;
            r0 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x0251, code lost:
        
            r0 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
            r10 = r11;
            r11 = r12;
            r12 = r13;
            r13 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x039e, code lost:
        
            if (r5.send(r0, r30) == r3) goto L139;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x017d A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:36:0x0175, B:38:0x017d, B:40:0x01a7, B:42:0x01b1, B:44:0x01bf, B:45:0x01c3, B:48:0x01e2, B:62:0x022c, B:64:0x0230, B:66:0x0236, B:70:0x025e, B:72:0x0262, B:75:0x027d, B:24:0x00fb, B:27:0x0120), top: B:147:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01e2 A[Catch: all -> 0x004c, PHI: r7 r10 r11
          0x01e2: PHI (r7v22 kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame>) = 
          (r7v6 kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame>)
          (r7v24 kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame>)
          (r7v24 kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame>)
         binds: [B:24:0x00fb, B:41:0x01af, B:46:0x01de] A[DONT_GENERATE, DONT_INLINE]
          0x01e2: PHI (r10v24 kotlin.jvm.internal.w0) = (r10v8 kotlin.jvm.internal.w0), (r10v25 kotlin.jvm.internal.w0), (r10v25 kotlin.jvm.internal.w0) binds: [B:24:0x00fb, B:41:0x01af, B:46:0x01de] A[DONT_GENERATE, DONT_INLINE]
          0x01e2: PHI (r11v25 kotlin.jvm.internal.b1) = (r11v8 kotlin.jvm.internal.b1), (r11v26 kotlin.jvm.internal.b1), (r11v26 kotlin.jvm.internal.b1) binds: [B:24:0x00fb, B:41:0x01af, B:46:0x01de] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:36:0x0175, B:38:0x017d, B:40:0x01a7, B:42:0x01b1, B:44:0x01bf, B:45:0x01c3, B:48:0x01e2, B:62:0x022c, B:64:0x0230, B:66:0x0236, B:70:0x025e, B:72:0x0262, B:75:0x027d, B:24:0x00fb, B:27:0x0120), top: B:147:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02b0 A[Catch: all -> 0x009a, TryCatch #2 {all -> 0x009a, blocks: (B:79:0x02aa, B:81:0x02b0, B:83:0x02b4, B:84:0x02b6, B:86:0x02ba, B:87:0x02c3, B:88:0x02e6, B:90:0x02ea, B:94:0x031a, B:15:0x0095), top: B:143:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02e6 A[Catch: all -> 0x009a, TryCatch #2 {all -> 0x009a, blocks: (B:79:0x02aa, B:81:0x02b0, B:83:0x02b4, B:84:0x02b6, B:86:0x02ba, B:87:0x02c3, B:88:0x02e6, B:90:0x02ea, B:94:0x031a, B:15:0x0095), top: B:143:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x03a6 A[Catch: all -> 0x0229, ClosedSendChannelException -> 0x048a, TRY_ENTER, TRY_LEAVE, TryCatch #7 {ClosedSendChannelException -> 0x048a, all -> 0x0229, blocks: (B:50:0x01e6, B:98:0x03a6, B:111:0x03ef, B:112:0x03f2, B:30:0x013c, B:109:0x03ed), top: B:151:0x013c, inners: #6 }] */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v23 */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v28 */
        /* JADX WARN: Type inference failed for: r8v29 */
        /* JADX WARN: Type inference failed for: r8v30 */
        /* JADX WARN: Type inference failed for: r8v31 */
        /* JADX WARN: Type inference failed for: r8v32 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0234 -> B:69:0x0251). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x024d -> B:69:0x0251). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0279 -> B:69:0x0251). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.C41031.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C41031) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", i = {}, l = {236, 247, 247, 247, PsExtractor.VIDEO_STREAM_MASK, 247, 247, 244, 247, 247}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41041 extends n implements p {
        Object L$0;
        int label;

        public C41041(zu.d<? super C41041> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return DefaultWebSocketSessionImpl.this.new C41041(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0144 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.C41041.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C41041) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 0, 0}, l = {281}, m = "sendCloseSequence", n = {"this", "exception", "reasonToSend"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41051 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41051(zu.d<? super C41051> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.sendCloseSequence(null, null, this);
        }
    }

    public DefaultWebSocketSessionImpl(WebSocketSession raw, long j10, long j11) {
        e0.checkNotNullParameter(raw, "raw");
        this.raw = raw;
        this.pinger = null;
        CompletableDeferred<CloseReason> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.closeReasonRef = completableDeferredCompletableDeferred$default;
        this.filtered = ChannelKt.Channel$default(8, null, null, 6, null);
        this.outgoingToBeProcessed = ChannelKt.Channel$default(UtilsKt.getOUTGOING_CHANNEL_CAPACITY(), null, null, 6, null);
        this.closed = 0;
        CompletableJob completableJobJob = JobKt.Job((Job) raw.getCoroutineContext().get(Job.Key));
        this.context = completableJobJob;
        this._extensions = new ArrayList();
        this.started = 0;
        this.coroutineContext = raw.getCoroutineContext().plus(completableJobJob).plus(new CoroutineName("ws-default"));
        this.pingIntervalMillis = j10;
        this.timeoutMillis = j11;
        this.closeReason = completableDeferredCompletableDeferred$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkMaxFrameSize(io.ktor.utils.io.core.BytePacketBuilder r9, io.ktor.websocket.Frame r10, zu.d<? super tu.x0> r11) throws io.ktor.websocket.FrameTooBigException {
        /*
            r8 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.DefaultWebSocketSessionImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r0 = (io.ktor.websocket.DefaultWebSocketSessionImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r0 = new io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            int r9 = r0.I$0
            tu.a0.throwOnFailure(r11)
            goto L78
        L33:
            tu.a0.throwOnFailure(r11)
            byte[] r10 = r10.getData()
            int r10 = r10.length
            if (r9 == 0) goto L42
            int r11 = r9.getSize()
            goto L43
        L42:
            r11 = 0
        L43:
            int r10 = r10 + r11
            long r4 = (long) r10
            long r6 = r8.getMaxFrameSize()
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L7f
            if (r9 == 0) goto L52
            r9.release()
        L52:
            io.ktor.websocket.CloseReason r9 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r11 = io.ktor.websocket.CloseReason.Codes.TOO_BIG
            java.lang.String r2 = "Frame is too big: "
            java.lang.String r4 = ". Max size is "
            java.lang.StringBuilder r2 = p0.o2.t(r10, r2, r4)
            long r4 = r8.getMaxFrameSize()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r9.<init>(r11, r2)
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r9 = io.ktor.websocket.WebSocketSessionKt.close(r8, r9, r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            r9 = r10
        L78:
            io.ktor.websocket.FrameTooBigException r10 = new io.ktor.websocket.FrameTooBigException
            long r0 = (long) r9
            r10.<init>(r0)
            throw r10
        L7f:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.checkMaxFrameSize(io.ktor.utils.io.core.BytePacketBuilder, io.ktor.websocket.Frame, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object goingAway$default(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, String str, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Server is going down";
        }
        return defaultWebSocketSessionImpl.goingAway(str, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (sendCloseSequence$default(r6, r7, null, r9, 2, null) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d5 -> B:14:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object outgoingProcessorLoop(zu.d<? super tu.x0> r13) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.outgoingProcessorLoop(zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Frame processIncomingExtensions(Frame frame) {
        Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((WebSocketExtension) it.next()).processIncomingFrame(frame);
        }
        return frame;
    }

    private final Frame processOutgoingExtensions(Frame frame) {
        Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((WebSocketExtension) it.next()).processOutgoingFrame(frame);
        }
        return frame;
    }

    private final Job runIncomingProcessor(SendChannel<? super Frame.Ping> sendChannel) {
        return BuildersKt__Builders_commonKt.launch$default(this, DefaultWebSocketSessionKt.IncomingProcessorCoroutineName.plus(Dispatchers.getUnconfined()), null, new C41031(sendChannel, null), 2, null);
    }

    private final void runOrCancelPinger() {
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        SendChannel<Frame.Pong> sendChannelPinger;
        long pingIntervalMillis = getPingIntervalMillis();
        if (this.closed == 0 && pingIntervalMillis > 0) {
            defaultWebSocketSessionImpl = this;
            sendChannelPinger = PingPongKt.pinger(defaultWebSocketSessionImpl, this.raw.getOutgoing(), pingIntervalMillis, getTimeoutMillis(), new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this, null));
        } else {
            defaultWebSocketSessionImpl = this;
            sendChannelPinger = null;
        }
        SendChannel sendChannel = (SendChannel) pinger$FU.getAndSet(this, sendChannelPinger);
        if (sendChannel != null) {
            SendChannel.DefaultImpls.close$default(sendChannel, null, 1, null);
        }
        if (sendChannelPinger != null) {
            ChannelResult.m5163isSuccessimpl(sendChannelPinger.mo5139trySendJP2dKIU(EmptyPong));
        }
        if (defaultWebSocketSessionImpl.closed == 0 || sendChannelPinger == null) {
            return;
        }
        runOrCancelPinger();
    }

    private final Job runOutgoingProcessor() {
        return BuildersKt.launch(this, DefaultWebSocketSessionKt.OutgoingProcessorCoroutineName.plus(Dispatchers.getUnconfined()), CoroutineStart.UNDISPATCHED, new C41041(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendCloseSequence(io.ktor.websocket.CloseReason r7, java.lang.Throwable r8, zu.d<? super tu.x0> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.DefaultWebSocketSessionImpl.C41051
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1 r0 = (io.ktor.websocket.DefaultWebSocketSessionImpl.C41051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1 r0 = new io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            tu.x0 r3 = tu.x0.f87415a
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r7 = r0.L$2
            io.ktor.websocket.CloseReason r7 = (io.ktor.websocket.CloseReason) r7
            java.lang.Object r8 = r0.L$1
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r0 = r0.L$0
            io.ktor.websocket.DefaultWebSocketSessionImpl r0 = (io.ktor.websocket.DefaultWebSocketSessionImpl) r0
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L38
            goto Laf
        L38:
            r9 = move-exception
            goto Lc1
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            tu.a0.throwOnFailure(r9)
            boolean r9 = r6.tryClose()
            if (r9 != 0) goto L4d
            return r3
        L4d:
            bx.a r9 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Sending Close Sequence for session "
            r2.<init>(r5)
            r2.append(r6)
            java.lang.String r5 = " with reason "
            r2.append(r5)
            r2.append(r7)
            java.lang.String r5 = " and exception "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r9.trace(r2)
            kotlinx.coroutines.CompletableJob r9 = r6.context
            r9.complete()
            if (r7 != 0) goto L82
            io.ktor.websocket.CloseReason r7 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r9 = io.ktor.websocket.CloseReason.Codes.NORMAL
            java.lang.String r2 = ""
            r7.<init>(r9, r2)
        L82:
            r6.runOrCancelPinger()     // Catch: java.lang.Throwable -> Lab
            short r9 = r7.getCode()     // Catch: java.lang.Throwable -> Lab
            io.ktor.websocket.CloseReason$Codes r2 = io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY     // Catch: java.lang.Throwable -> Lab
            short r2 = r2.getCode()     // Catch: java.lang.Throwable -> Lab
            if (r9 == r2) goto Lae
            io.ktor.websocket.WebSocketSession r9 = r6.raw     // Catch: java.lang.Throwable -> Lab
            kotlinx.coroutines.channels.SendChannel r9 = r9.getOutgoing()     // Catch: java.lang.Throwable -> Lab
            io.ktor.websocket.Frame$Close r2 = new io.ktor.websocket.Frame$Close     // Catch: java.lang.Throwable -> Lab
            r2.<init>(r7)     // Catch: java.lang.Throwable -> Lab
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Lab
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lab
            r0.L$2 = r7     // Catch: java.lang.Throwable -> Lab
            r0.label = r4     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r9 = r9.send(r2, r0)     // Catch: java.lang.Throwable -> Lab
            if (r9 != r1) goto Lae
            return r1
        Lab:
            r9 = move-exception
            r0 = r6
            goto Lc1
        Lae:
            r0 = r6
        Laf:
            kotlinx.coroutines.CompletableDeferred<io.ktor.websocket.CloseReason> r9 = r0.closeReasonRef
            r9.complete(r7)
            if (r8 == 0) goto Lc0
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> r7 = r0.outgoingToBeProcessed
            r7.close(r8)
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> r7 = r0.filtered
            r7.close(r8)
        Lc0:
            return r3
        Lc1:
            kotlinx.coroutines.CompletableDeferred<io.ktor.websocket.CloseReason> r1 = r0.closeReasonRef
            r1.complete(r7)
            if (r8 == 0) goto Ld2
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> r7 = r0.outgoingToBeProcessed
            r7.close(r8)
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> r7 = r0.filtered
            r7.close(r8)
        Ld2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.sendCloseSequence(io.ktor.websocket.CloseReason, java.lang.Throwable, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object sendCloseSequence$default(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, CloseReason closeReason, Throwable th2, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return defaultWebSocketSessionImpl.sendCloseSequence(closeReason, th2, dVar);
    }

    private final boolean tryClose() {
        return closed$FU.compareAndSet(this, 0, 1);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(zu.d<? super x0> dVar) {
        Object objFlush = this.raw.flush(dVar);
        return objFlush == e.getCOROUTINE_SUSPENDED() ? objFlush : x0.f87415a;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public Deferred<CloseReason> getCloseReason() {
        return this.closeReason;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return this._extensions;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public ReceiveChannel<Frame> getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.raw.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.raw.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public SendChannel<Frame> getOutgoing() {
        return this.outgoingToBeProcessed;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final Object goingAway(String str, zu.d<? super x0> dVar) {
        Object objSendCloseSequence$default = sendCloseSequence$default(this, new CloseReason(CloseReason.Codes.GOING_AWAY, str), null, dVar, 2, null);
        return objSendCloseSequence$default == e.getCOROUTINE_SUSPENDED() ? objSendCloseSequence$default : x0.f87415a;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, zu.d<? super x0> dVar) {
        return DefaultWebSocketSession.DefaultImpls.send(this, frame, dVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z10) {
        this.raw.setMasking(z10);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j10) {
        this.raw.setMaxFrameSize(j10);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setPingIntervalMillis(long j10) {
        this.pingIntervalMillis = j10;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setTimeoutMillis(long j10) {
        this.timeoutMillis = j10;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void start(List<? extends WebSocketExtension<?>> negotiatedExtensions) {
        e0.checkNotNullParameter(negotiatedExtensions, "negotiatedExtensions");
        if (!started$FU.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        DefaultWebSocketSessionKt.getLOGGER().trace("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + y0.joinToString$default(negotiatedExtensions, null, null, null, 0, null, null, 63, null));
        this._extensions.addAll(negotiatedExtensions);
        runOrCancelPinger();
        runIncomingProcessor(PingPongKt.ponger(this, getOutgoing()));
        runOutgoingProcessor();
    }

    @Override // io.ktor.websocket.WebSocketSession
    @tu.f
    public void terminate() {
        Job.DefaultImpls.cancel$default((Job) this.context, (CancellationException) null, 1, (Object) null);
        CoroutineScopeKt.cancel$default(this.raw, null, 1, null);
    }
}
