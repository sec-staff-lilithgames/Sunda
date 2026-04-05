package io.ktor.websocket;

import av.e;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import tu.x0;
import uu.p0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class RawWebSocketCommon implements WebSocketSession {
    private final Channel<Frame> _incoming;
    private final Channel<Object> _outgoing;
    private final m coroutineContext;
    private final ByteReadChannel input;
    private int lastOpcode;
    private boolean masking;
    private long maxFrameSize;
    private final ByteWriteChannel output;
    private final Job readerJob;
    private final CompletableJob socketJob;
    private final Job writerJob;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FlushRequest {
        private final CompletableJob done;

        public FlushRequest(Job job) {
            this.done = JobKt.Job(job);
        }

        public final Object await(d<? super x0> dVar) {
            Object objJoin = this.done.join(dVar);
            return objJoin == e.getCOROUTINE_SUSPENDED() ? objJoin : x0.f87415a;
        }

        public final boolean complete() {
            return this.done.complete();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 126, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
    /* renamed from: io.ktor.websocket.RawWebSocketCommon$flush$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommon.this.flush(this);
        }
    }

    public RawWebSocketCommon(ByteReadChannel input, ByteWriteChannel output, long j10, boolean z10, m coroutineContext) {
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.input = input;
        this.output = output;
        this.maxFrameSize = j10;
        this.masking = z10;
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.Key));
        this.socketJob = completableJobJob;
        this._incoming = ChannelKt.Channel$default(8, null, null, 6, null);
        this._outgoing = ChannelKt.Channel$default(8, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(completableJobJob).plus(new CoroutineName("raw-ws"));
        CoroutineName coroutineName = new CoroutineName("ws-writer");
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        this.writerJob = BuildersKt.launch(this, coroutineName, coroutineStart, new RawWebSocketCommon$writerJob$1(this, null));
        this.readerJob = BuildersKt.launch(this, new CoroutineName("ws-reader"), coroutineStart, new RawWebSocketCommon$readerJob$1(this, null));
        completableJobJob.complete();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9.send(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r5.await(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.RawWebSocketCommon$FlushRequest] */
    @Override // io.ktor.websocket.WebSocketSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object flush(zu.d<? super tu.x0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.RawWebSocketCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.RawWebSocketCommon$flush$1 r0 = (io.ktor.websocket.RawWebSocketCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.RawWebSocketCommon$flush$1 r0 = new io.ktor.websocket.RawWebSocketCommon$flush$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            tu.a0.throwOnFailure(r9)
            goto La4
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.L$0
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r2 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r2
            tu.a0.throwOnFailure(r9)
            goto L94
        L41:
            java.lang.Object r2 = r0.L$2
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r2 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r2
            java.lang.Object r5 = r0.L$1
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r5 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r5
            java.lang.Object r7 = r0.L$0
            io.ktor.websocket.RawWebSocketCommon r7 = (io.ktor.websocket.RawWebSocketCommon) r7
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L7f
            goto L95
        L51:
            r9 = move-exception
            goto L7b
        L53:
            tu.a0.throwOnFailure(r9)
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r2 = new io.ktor.websocket.RawWebSocketCommon$FlushRequest
            zu.m r9 = r8.getCoroutineContext()
            kotlinx.coroutines.Job$Key r7 = kotlinx.coroutines.Job.Key
            zu.k r9 = r9.get(r7)
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            r2.<init>(r9)
            kotlinx.coroutines.channels.Channel<java.lang.Object> r9 = r8._outgoing     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.label = r5     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            java.lang.Object r9 = r9.send(r2, r0)     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            if (r9 != r1) goto L94
            goto La3
        L78:
            r7 = r8
            r5 = r2
            goto L7f
        L7b:
            r2.complete()
            throw r9
        L7f:
            r2.complete()
            kotlinx.coroutines.Job r9 = r7.writerJob
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r9 = r9.join(r0)
            if (r9 != r1) goto L93
            goto La3
        L93:
            r2 = r5
        L94:
            r5 = r2
        L95:
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r9 = r5.await(r0)
            if (r9 != r1) goto La4
        La3:
            return r1
        La4:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon.flush(zu.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return p0.emptyList();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public ReceiveChannel<Frame> getIncoming() {
        return this._incoming;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.masking;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public SendChannel<Frame> getOutgoing() {
        return this._outgoing;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, d<? super x0> dVar) {
        return WebSocketSession.DefaultImpls.send(this, frame, dVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z10) {
        this.masking = z10;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j10) {
        this.maxFrameSize = j10;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @tu.f
    public void terminate() {
        SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.socketJob.complete();
    }

    public /* synthetic */ RawWebSocketCommon(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j10, boolean z10, m mVar, int i10, u uVar) {
        this(byteReadChannel, byteWriteChannel, (i10 & 4) != 0 ? 2147483647L : j10, (i10 & 8) != 0 ? false : z10, mVar);
    }
}
