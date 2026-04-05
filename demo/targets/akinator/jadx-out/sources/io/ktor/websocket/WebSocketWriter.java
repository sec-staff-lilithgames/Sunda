package io.ktor.websocket;

import av.e;
import bv.f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketWriter implements CoroutineScope {
    private final m coroutineContext;
    private boolean masking;
    private final ObjectPool<ByteBuffer> pool;
    private final Channel<Object> queue;
    private final Serializer serializer;
    private final ByteWriteChannel writeChannel;
    private final Job writeLoopJob;

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
    @f(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "drainQueueAndSerialize", n = {"this", "buffer", "flush", "closeSent"}, s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        int I$0;
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
            return WebSocketWriter.this.drainQueueAndSerialize(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0}, l = {ModuleDescriptor.MODULE_VERSION, 158, 163}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
    /* renamed from: io.ktor.websocket.WebSocketWriter$flush$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41101 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41101(d<? super C41101> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.flush(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 1, 1}, l = {46, 48}, m = "writeLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.WebSocketWriter$writeLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41111 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41111(d<? super C41111> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.writeLoop(null, this);
        }
    }

    public WebSocketWriter(ByteWriteChannel writeChannel, m coroutineContext, boolean z10, ObjectPool<ByteBuffer> pool) {
        e0.checkNotNullParameter(writeChannel, "writeChannel");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(pool, "pool");
        this.writeChannel = writeChannel;
        this.coroutineContext = coroutineContext;
        this.masking = z10;
        this.pool = pool;
        this.queue = ChannelKt.Channel$default(8, null, null, 6, null);
        this.serializer = new Serializer();
        this.writeLoopJob = BuildersKt.launch(this, new CoroutineName("ws-writer"), CoroutineStart.ATOMIC, new WebSocketWriter$writeLoopJob$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drainQueueAndDiscard() {
        /*
            r4 = this;
            kotlinx.coroutines.channels.Channel<java.lang.Object> r0 = r4.queue
            r1 = 0
            r2 = 1
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r0, r1, r2, r1)
        L7:
            kotlinx.coroutines.channels.Channel<java.lang.Object> r0 = r4.queue     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.Object r0 = r0.mo5146tryReceivePtdJZtk()     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelResult.m5158getOrNullimpl(r0)     // Catch: java.util.concurrent.CancellationException -> L4e
            if (r0 != 0) goto L14
            goto L4e
        L14:
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Close     // Catch: java.util.concurrent.CancellationException -> L4e
            if (r1 != 0) goto L7
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Ping     // Catch: java.util.concurrent.CancellationException -> L4e
            if (r1 == 0) goto L1e
            r1 = r2
            goto L20
        L1e:
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Pong     // Catch: java.util.concurrent.CancellationException -> L4e
        L20:
            if (r1 != 0) goto L7
            boolean r1 = r0 instanceof io.ktor.websocket.WebSocketWriter.FlushRequest     // Catch: java.util.concurrent.CancellationException -> L4e
            if (r1 == 0) goto L2c
            io.ktor.websocket.WebSocketWriter$FlushRequest r0 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r0     // Catch: java.util.concurrent.CancellationException -> L4e
            r0.complete()     // Catch: java.util.concurrent.CancellationException -> L4e
            goto L7
        L2c:
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Text     // Catch: java.util.concurrent.CancellationException -> L4e
            if (r1 == 0) goto L32
            r1 = r2
            goto L34
        L32:
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Binary     // Catch: java.util.concurrent.CancellationException -> L4e
        L34:
            if (r1 == 0) goto L37
            goto L7
        L37:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.util.concurrent.CancellationException -> L4e
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.String r3 = "unknown message "
            r2.append(r3)     // Catch: java.util.concurrent.CancellationException -> L4e
            r2.append(r0)     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.String r0 = r2.toString()     // Catch: java.util.concurrent.CancellationException -> L4e
            r1.<init>(r0)     // Catch: java.util.concurrent.CancellationException -> L4e
            throw r1     // Catch: java.util.concurrent.CancellationException -> L4e
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.drainQueueAndDiscard():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x0051
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:62:0x010c, B:63:0x010e], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:53:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object drainQueueAndSerialize(io.ktor.websocket.Frame r8, java.nio.ByteBuffer r9, zu.d<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.drainQueueAndSerialize(io.ktor.websocket.Frame, java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[Catch: all -> 0x0040, ChannelWriteException -> 0x0043, TryCatch #5 {ChannelWriteException -> 0x0043, all -> 0x0040, blocks: (B:13:0x0037, B:39:0x00a3, B:28:0x006f, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:43:0x00af, B:45:0x00b3, B:46:0x00b9, B:47:0x00cf, B:22:0x005a), top: B:63:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a0 -> B:39:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b3 -> B:42:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeLoop(java.nio.ByteBuffer r11, zu.d<? super tu.x0> r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.writeLoop(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    @tu.f
    public final void close() {
        SendChannel.DefaultImpls.close$default(this.queue, null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9.send(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r5.await(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.WebSocketWriter$FlushRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flush(zu.d<? super tu.x0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.WebSocketWriter.C41101
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = (io.ktor.websocket.WebSocketWriter.C41101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = new io.ktor.websocket.WebSocketWriter$flush$1
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
            io.ktor.websocket.WebSocketWriter$FlushRequest r2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r2
            tu.a0.throwOnFailure(r9)
            goto L94
        L41:
            java.lang.Object r2 = r0.L$2
            io.ktor.websocket.WebSocketWriter$FlushRequest r2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r2
            java.lang.Object r5 = r0.L$1
            io.ktor.websocket.WebSocketWriter$FlushRequest r5 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r5
            java.lang.Object r7 = r0.L$0
            io.ktor.websocket.WebSocketWriter r7 = (io.ktor.websocket.WebSocketWriter) r7
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L7f
            goto L95
        L51:
            r9 = move-exception
            goto L7b
        L53:
            tu.a0.throwOnFailure(r9)
            io.ktor.websocket.WebSocketWriter$FlushRequest r2 = new io.ktor.websocket.WebSocketWriter$FlushRequest
            zu.m r9 = r8.getCoroutineContext()
            kotlinx.coroutines.Job$Key r7 = kotlinx.coroutines.Job.Key
            zu.k r9 = r9.get(r7)
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            r2.<init>(r9)
            kotlinx.coroutines.channels.Channel<java.lang.Object> r9 = r8.queue     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
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
            kotlinx.coroutines.Job r9 = r7.writeLoopJob
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.flush(zu.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    public final boolean getMasking() {
        return this.masking;
    }

    public final SendChannel<Frame> getOutgoing() {
        return this.queue;
    }

    public final ObjectPool<ByteBuffer> getPool() {
        return this.pool;
    }

    public final Object send(Frame frame, d<? super x0> dVar) {
        Object objSend = this.queue.send(frame, dVar);
        return objSend == e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
    }

    public final void setMasking(boolean z10) {
        this.masking = z10;
    }

    public /* synthetic */ WebSocketWriter(ByteWriteChannel byteWriteChannel, m mVar, boolean z10, ObjectPool objectPool, int i10, u uVar) {
        this(byteWriteChannel, mVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    private static /* synthetic */ void getWriteLoopJob$annotations() {
    }
}
