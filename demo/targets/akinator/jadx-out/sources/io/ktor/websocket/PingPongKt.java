package io.ktor.websocket;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.websocket.Frame;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PingPongKt {
    private static final CoroutineName PongerCoroutineName = new CoroutineName("ws-ponger");
    private static final CoroutineName PingerCoroutineName = new CoroutineName("ws-pinger");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {64, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, 95}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ Channel<Frame.Pong> $channel;
        final /* synthetic */ p $onTimeout;
        final /* synthetic */ SendChannel<Frame> $outgoing;
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ long $timeoutMillis;
        Object L$0;
        Object L$1;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.websocket.PingPongKt$pinger$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05881 extends n implements p {
            final /* synthetic */ Channel<Frame.Pong> $channel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05881(Channel<Frame.Pong> channel, d<? super C05881> dVar) {
                super(2, dVar);
                this.$channel = channel;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C05881(this.$channel, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Channel<Frame.Pong> channel;
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                do {
                    channel = this.$channel;
                    this.label = 1;
                } while (channel.receive(this) != coroutine_suspended);
                return coroutine_suspended;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C05881) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(long j10, long j11, p pVar, Channel<Frame.Pong> channel, SendChannel<? super Frame> sendChannel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$periodMillis = j10;
            this.$timeoutMillis = j11;
            this.$onTimeout = pVar;
            this.$channel = channel;
            this.$outgoing = sendChannel;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
        
            if (r13.invoke(r1, r12) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, PHI: r1 r6 r13
          0x00b9: PHI (r1v7 byte[]) = (r1v5 byte[]), (r1v13 byte[]) binds: [B:23:0x00b6, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x00b9: PHI (r6v10 ov.g) = (r6v6 ov.g), (r6v14 ov.g) binds: [B:23:0x00b6, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x00b9: PHI (r13v8 java.lang.Object) = (r13v6 java.lang.Object), (r13v0 java.lang.Object) binds: [B:23:0x00b6, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, blocks: (B:7:0x0012, B:12:0x0027, B:12:0x0027, B:12:0x0027, B:25:0x00b9, B:25:0x00b9, B:25:0x00b9, B:27:0x00bd, B:27:0x00bd, B:27:0x00bd, B:18:0x006d, B:18:0x006d, B:18:0x006d, B:22:0x0084, B:22:0x0084, B:22:0x0084, B:15:0x0034, B:15:0x0034, B:15:0x0034), top: B:34:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e0, blocks: (B:7:0x0012, B:12:0x0027, B:12:0x0027, B:12:0x0027, B:25:0x00b9, B:25:0x00b9, B:25:0x00b9, B:27:0x00bd, B:27:0x00bd, B:27:0x00bd, B:18:0x006d, B:18:0x006d, B:18:0x006d, B:22:0x0084, B:22:0x0084, B:22:0x0084, B:15:0x0034, B:15:0x0034, B:15:0x0034), top: B:34:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b6 -> B:25:0x00b9). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L38
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                tu.a0.throwOnFailure(r13)     // Catch: java.lang.Throwable -> Le0
                goto Le0
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.L$1
                byte[] r1 = (byte[]) r1
                java.lang.Object r6 = r12.L$0
                ov.g r6 = (ov.g) r6
                tu.a0.throwOnFailure(r13)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                goto Lb9
            L2c:
                java.lang.Object r1 = r12.L$1
                byte[] r1 = (byte[]) r1
                java.lang.Object r6 = r12.L$0
                ov.g r6 = (ov.g) r6
                tu.a0.throwOnFailure(r13)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                goto L84
            L38:
                tu.a0.throwOnFailure(r13)
                bx.a r13 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r6 = "Starting WebSocket pinger coroutine with period "
                r1.<init>(r6)
                long r6 = r12.$periodMillis
                r1.append(r6)
                java.lang.String r6 = " ms and timeout "
                r1.append(r6)
                long r6 = r12.$timeoutMillis
                r1.append(r6)
                java.lang.String r6 = " ms"
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r13.trace(r1)
                long r6 = io.ktor.util.date.DateJvmKt.getTimeMillis()
                ov.g r13 = ov.h.Random(r6)
                r1 = 32
                byte[] r1 = new byte[r1]
            L6d:
                long r6 = r12.$periodMillis     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                io.ktor.websocket.PingPongKt$pinger$1$1 r8 = new io.ktor.websocket.PingPongKt$pinger$1$1     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame$Pong> r9 = r12.$channel     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r8.<init>(r9, r5)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.L$0 = r13     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.L$1 = r1     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.label = r4     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.Object r6 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r6, r8, r12)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                if (r6 != r0) goto L83
                goto Ldd
            L83:
                r6 = r13
            L84:
                r6.nextBytes(r1)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r13.<init>()     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.String r7 = "[ping "
                r13.append(r7)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.String r7 = io.ktor.util.CryptoKt.hex(r1)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r13.append(r7)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.String r7 = " ping]"
                r13.append(r7)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                long r7 = r12.$timeoutMillis     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                io.ktor.websocket.PingPongKt$pinger$1$rc$1 r9 = new io.ktor.websocket.PingPongKt$pinger$1$rc$1     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> r10 = r12.$outgoing     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame$Pong> r11 = r12.$channel     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r9.<init>(r10, r13, r11, r5)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.L$0 = r6     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.L$1 = r1     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.label = r3     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.Object r13 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r7, r9, r12)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                if (r13 != r0) goto Lb9
                goto Ldd
            Lb9:
                tu.x0 r13 = (tu.x0) r13     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                if (r13 != 0) goto Lde
                bx.a r13 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.String r1 = "WebSocket pinger has timed out"
                r13.trace(r1)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                kv.p r13 = r12.$onTimeout     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                io.ktor.websocket.CloseReason r1 = new io.ktor.websocket.CloseReason     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                io.ktor.websocket.CloseReason$Codes r3 = io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.String r4 = "Ping timeout"
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.L$0 = r5     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.L$1 = r5     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                r12.label = r2     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                java.lang.Object r13 = r13.invoke(r1, r12)     // Catch: java.lang.Throwable -> Le0 java.lang.Throwable -> Le0 java.lang.Throwable -> Le0
                if (r13 != r0) goto Le0
            Ldd:
                return r0
            Lde:
                r13 = r6
                goto L6d
            Le0:
                tu.x0 r13 = tu.x0.f87415a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ CompletableJob $actorJob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CompletableJob completableJob) {
            super(1);
            this.$actorJob = completableJob;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            Job.DefaultImpls.cancel$default((Job) this.$actorJob, (CancellationException) null, 1, (Object) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", i = {0, 1}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 32}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
    /* renamed from: io.ktor.websocket.PingPongKt$ponger$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41061 extends n implements p {
        final /* synthetic */ Channel<Frame.Ping> $channel;
        final /* synthetic */ SendChannel<Frame.Pong> $outgoing;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41061(Channel<Frame.Ping> channel, SendChannel<? super Frame.Pong> sendChannel, d<? super C41061> dVar) {
            super(2, dVar);
            this.$channel = channel;
            this.$outgoing = sendChannel;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C41061(this.$channel, this.$outgoing, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        
            if (r5.send(r7, r10) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:7:0x001a, B:19:0x0044, B:23:0x0056, B:25:0x005f, B:14:0x0035, B:18:0x0040), top: B:37:0x0008, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[Catch: ClosedSendChannelException -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {ClosedSendChannelException -> 0x0090, blocks: (B:28:0x0086, B:32:0x008c, B:33:0x008f, B:17:0x003c, B:30:0x008a, B:7:0x001a, B:19:0x0044, B:23:0x0056, B:25:0x005f, B:14:0x0035, B:18:0x0040), top: B:37:0x0008, inners: #1, #2 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:8:0x001d). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L39
                if (r1 == r2) goto L29
                if (r1 != r3) goto L21
                java.lang.Object r1 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r10.L$1
                kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
                tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r11 = r5
                goto L44
            L1f:
                r11 = move-exception
                goto L8a
            L21:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L29:
                java.lang.Object r1 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r10.L$1
                kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
                tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L1f
                goto L56
            L39:
                tu.a0.throwOnFailure(r11)
                kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame$Ping> r4 = r10.$channel     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L90
                kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame$Pong> r11 = r10.$outgoing     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L90
                kotlinx.coroutines.channels.ChannelIterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> L1f
            L44:
                r10.L$0 = r11     // Catch: java.lang.Throwable -> L1f
                r10.L$1 = r4     // Catch: java.lang.Throwable -> L1f
                r10.L$2 = r1     // Catch: java.lang.Throwable -> L1f
                r10.label = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = r1.hasNext(r10)     // Catch: java.lang.Throwable -> L1f
                if (r5 != r0) goto L53
                goto L85
            L53:
                r9 = r5
                r5 = r11
                r11 = r9
            L56:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1f
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1f
                r6 = 0
                if (r11 == 0) goto L86
                java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L1f
                io.ktor.websocket.Frame$Ping r11 = (io.ktor.websocket.Frame.Ping) r11     // Catch: java.lang.Throwable -> L1f
                bx.a r7 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()     // Catch: java.lang.Throwable -> L1f
                java.lang.String r8 = "Received ping message, sending pong message"
                r7.trace(r8)     // Catch: java.lang.Throwable -> L1f
                io.ktor.websocket.Frame$Pong r7 = new io.ktor.websocket.Frame$Pong     // Catch: java.lang.Throwable -> L1f
                byte[] r11 = r11.getData()     // Catch: java.lang.Throwable -> L1f
                r7.<init>(r11, r6, r3, r6)     // Catch: java.lang.Throwable -> L1f
                r10.L$0 = r5     // Catch: java.lang.Throwable -> L1f
                r10.L$1 = r4     // Catch: java.lang.Throwable -> L1f
                r10.L$2 = r1     // Catch: java.lang.Throwable -> L1f
                r10.label = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r11 = r5.send(r7, r10)     // Catch: java.lang.Throwable -> L1f
                if (r11 != r0) goto L1d
            L85:
                return r0
            L86:
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L90
                goto L90
            L8a:
                throw r11     // Catch: java.lang.Throwable -> L8b
            L8b:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r11)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L90
                throw r0     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L90
            L90:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt.C41061.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C41061) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final SendChannel<Frame.Pong> pinger(CoroutineScope coroutineScope, SendChannel<? super Frame> outgoing, long j10, long j11, p onTimeout) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(outgoing, "outgoing");
        e0.checkNotNullParameter(onTimeout, "onTimeout");
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        Channel channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobJob$default.plus(PingerCoroutineName), null, new AnonymousClass1(j10, j11, onTimeout, channelChannel$default, outgoing, null), 2, null);
        k kVar = coroutineScope.getCoroutineContext().get(Job.Key);
        e0.checkNotNull(kVar);
        ((Job) kVar).invokeOnCompletion(new AnonymousClass2(completableJobJob$default));
        return channelChannel$default;
    }

    public static final SendChannel<Frame.Ping> ponger(CoroutineScope coroutineScope, SendChannel<? super Frame.Pong> outgoing) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(outgoing, "outgoing");
        Channel channelChannel$default = ChannelKt.Channel$default(5, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, PongerCoroutineName, null, new C41061(channelChannel$default, outgoing, null), 2, null);
        return channelChannel$default;
    }
}
