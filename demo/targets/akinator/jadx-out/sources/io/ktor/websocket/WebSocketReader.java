package io.ktor.websocket;

import bv.d;
import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import hr.kNq.ikJMrW;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketReader implements CoroutineScope {
    private final ByteReadChannel byteChannel;
    private final SimpleFrameCollector collector;
    private final m coroutineContext;
    private final FrameParser frameParser;
    private long maxFrameSize;
    private final Channel<Frame> queue;
    private final Job readerJob;
    private State state;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum State {
        HEADER,
        BODY,
        CLOSED
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0}, l = {115}, m = "handleFrameIfProduced", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1, reason: invalid class name */
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
            return WebSocketReader.this.handleFrameIfProduced(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 0, 1, 1}, l = {92, 100}, m = "parseLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.WebSocketReader$parseLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41081 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41081(zu.d<? super C41081> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.parseLoop(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 0, 1, 1}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "readLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.WebSocketReader$readLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41091 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41091(zu.d<? super C41091> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.readLoop(null, this);
        }
    }

    public WebSocketReader(ByteReadChannel byteReadChannel, m coroutineContext, long j10, ObjectPool<ByteBuffer> pool) {
        e0.checkNotNullParameter(byteReadChannel, ikJMrW.JBKHkBJNH);
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(pool, "pool");
        this.byteChannel = byteReadChannel;
        this.coroutineContext = coroutineContext;
        this.maxFrameSize = j10;
        this.state = State.HEADER;
        this.frameParser = new FrameParser();
        this.collector = new SimpleFrameCollector();
        this.queue = ChannelKt.Channel$default(8, null, null, 6, null);
        this.readerJob = BuildersKt.launch(this, new CoroutineName("ws-reader"), CoroutineStart.ATOMIC, new WebSocketReader$readerJob$1(pool, this, null));
    }

    private static /* synthetic */ void getReaderJob$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleFrameIfProduced(zu.d<? super tu.x0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof io.ktor.websocket.WebSocketReader.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1 r0 = (io.ktor.websocket.WebSocketReader.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1 r0 = new io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            io.ktor.websocket.WebSocketReader r0 = (io.ktor.websocket.WebSocketReader) r0
            tu.a0.throwOnFailure(r12)
            goto L89
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            tu.a0.throwOnFailure(r12)
            io.ktor.websocket.SimpleFrameCollector r12 = r11.collector
            boolean r12 = r12.getHasRemaining()
            if (r12 != 0) goto L8e
            io.ktor.websocket.FrameParser r12 = r11.frameParser
            io.ktor.websocket.FrameType r12 = r12.getFrameType()
            io.ktor.websocket.FrameType r2 = io.ktor.websocket.FrameType.CLOSE
            if (r12 != r2) goto L4d
            io.ktor.websocket.WebSocketReader$State r12 = io.ktor.websocket.WebSocketReader.State.CLOSED
            goto L4f
        L4d:
            io.ktor.websocket.WebSocketReader$State r12 = io.ktor.websocket.WebSocketReader.State.HEADER
        L4f:
            r11.state = r12
            io.ktor.websocket.FrameParser r12 = r11.frameParser
            io.ktor.websocket.Frame$Companion r4 = io.ktor.websocket.Frame.Companion
            boolean r5 = r12.getFin()
            io.ktor.websocket.FrameType r6 = r12.getFrameType()
            io.ktor.websocket.SimpleFrameCollector r2 = r11.collector
            java.lang.Integer r7 = r12.getMaskKey()
            java.nio.ByteBuffer r2 = r2.take(r7)
            byte[] r7 = io.ktor.util.NIOKt.moveToByteArray(r2)
            boolean r8 = r12.getRsv1()
            boolean r9 = r12.getRsv2()
            boolean r10 = r12.getRsv3()
            io.ktor.websocket.Frame r12 = r4.byType(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> r2 = r11.queue
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r12 = r2.send(r12, r0)
            if (r12 != r1) goto L88
            return r1
        L88:
            r0 = r11
        L89:
            io.ktor.websocket.FrameParser r12 = r0.frameParser
            r12.bodyComplete()
        L8e:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.handleFrameIfProduced(zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        throw new io.ktor.websocket.FrameTooBigException(r2.frameParser.getLength());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object parseLoop(java.nio.ByteBuffer r10, zu.d<? super tu.x0> r11) throws io.ktor.websocket.FrameTooBigException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.WebSocketReader.C41081
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.WebSocketReader$parseLoop$1 r0 = (io.ktor.websocket.WebSocketReader.C41081) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketReader$parseLoop$1 r0 = new io.ktor.websocket.WebSocketReader$parseLoop$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L28
            if (r2 != r3) goto L34
        L28:
            java.lang.Object r10 = r0.L$1
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.websocket.WebSocketReader r2 = (io.ktor.websocket.WebSocketReader) r2
            tu.a0.throwOnFailure(r11)
            goto L40
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            tu.a0.throwOnFailure(r11)
            r2 = r9
        L40:
            boolean r11 = r10.hasRemaining()
            tu.x0 r5 = tu.x0.f87415a
            if (r11 == 0) goto Lbc
            io.ktor.websocket.WebSocketReader$State r11 = r2.state
            int[] r6 = io.ktor.websocket.WebSocketReader.WhenMappings.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r6[r11]
            if (r11 == r4) goto L6d
            if (r11 == r3) goto L5b
            r6 = 3
            if (r11 == r6) goto L5a
            goto L40
        L5a:
            return r5
        L5b:
            io.ktor.websocket.SimpleFrameCollector r11 = r2.collector
            r11.handle(r10)
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r11 = r2.handleFrameIfProduced(r0)
            if (r11 != r1) goto L40
            goto Laf
        L6d:
            io.ktor.websocket.FrameParser r11 = r2.frameParser
            r11.frame(r10)
            io.ktor.websocket.FrameParser r11 = r2.frameParser
            boolean r11 = r11.getBodyReady()
            if (r11 == 0) goto Lbc
            io.ktor.websocket.WebSocketReader$State r11 = io.ktor.websocket.WebSocketReader.State.BODY
            r2.state = r11
            io.ktor.websocket.FrameParser r11 = r2.frameParser
            long r5 = r11.getLength()
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto Lb0
            io.ktor.websocket.FrameParser r11 = r2.frameParser
            long r5 = r11.getLength()
            long r7 = r2.maxFrameSize
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto Lb0
            io.ktor.websocket.SimpleFrameCollector r11 = r2.collector
            io.ktor.websocket.FrameParser r5 = r2.frameParser
            long r5 = r5.getLength()
            int r5 = (int) r5
            r11.start(r5, r10)
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r2.handleFrameIfProduced(r0)
            if (r11 != r1) goto L40
        Laf:
            return r1
        Lb0:
            io.ktor.websocket.FrameTooBigException r10 = new io.ktor.websocket.FrameTooBigException
            io.ktor.websocket.FrameParser r11 = r2.frameParser
            long r0 = r11.getLength()
            r10.<init>(r0)
            throw r10
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.parseLoop(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r2.parseLoop(r8, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0083 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readLoop(java.nio.ByteBuffer r8, zu.d<? super tu.x0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.WebSocketReader.C41091
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = (io.ktor.websocket.WebSocketReader.C41091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = new io.ktor.websocket.WebSocketReader$readLoop$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r8 = r0.L$1
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.websocket.WebSocketReader r2 = (io.ktor.websocket.WebSocketReader) r2
            tu.a0.throwOnFailure(r9)
        L33:
            r9 = r2
            goto L86
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            java.lang.Object r8 = r0.L$1
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.websocket.WebSocketReader r2 = (io.ktor.websocket.WebSocketReader) r2
            tu.a0.throwOnFailure(r9)
            goto L68
        L49:
            tu.a0.throwOnFailure(r9)
            r8.clear()
            r9 = r7
        L50:
            io.ktor.websocket.WebSocketReader$State r2 = r9.state
            io.ktor.websocket.WebSocketReader$State r5 = io.ktor.websocket.WebSocketReader.State.CLOSED
            if (r2 == r5) goto L8a
            io.ktor.utils.io.ByteReadChannel r2 = r9.byteChannel
            r0.L$0 = r9
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r2.readAvailable(r8, r0)
            if (r2 != r1) goto L65
            goto L85
        L65:
            r6 = r2
            r2 = r9
            r9 = r6
        L68:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r5 = -1
            if (r9 != r5) goto L76
            io.ktor.websocket.WebSocketReader$State r8 = io.ktor.websocket.WebSocketReader.State.CLOSED
            r2.state = r8
            goto L8a
        L76:
            r8.flip()
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r2.parseLoop(r8, r0)
            if (r9 != r1) goto L33
        L85:
            return r1
        L86:
            r8.compact()
            goto L50
        L8a:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.readLoop(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    public final ReceiveChannel<Frame> getIncoming() {
        return this.queue;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void setMaxFrameSize(long j10) {
        this.maxFrameSize = j10;
    }

    public /* synthetic */ WebSocketReader(ByteReadChannel byteReadChannel, m mVar, long j10, ObjectPool objectPool, int i10, u uVar) {
        this(byteReadChannel, mVar, j10, (i10 & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }
}
