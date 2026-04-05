package io.ktor.websocket;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.internal.play_billing.a;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.pool.ObjectPool;
import io.ktor.websocket.WebSocketSession;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kv.p;
import nv.c;
import tu.x0;
import uu.p0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class RawWebSocketJvm implements WebSocketSession {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.n(RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0), a.n(RawWebSocketJvm.class, "masking", "getMasking()Z", 0)};
    private final m coroutineContext;
    private final Channel<Frame> filtered;
    private final c masking$delegate;
    private final c maxFrameSize$delegate;
    private final WebSocketReader reader;
    private final CompletableJob socketJob;
    private final WebSocketWriter writer;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {2, 3}, l = {TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
    /* renamed from: io.ktor.websocket.RawWebSocketJvm$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        Object L$0;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return RawWebSocketJvm.this.new AnonymousClass1(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        
            if (r7.send(r11, r10) == r0) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[Catch: all -> 0x003b, CancellationException -> 0x003d, ProtocolViolationException -> 0x003f, FrameTooBigException -> 0x0042, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x0042, CancellationException -> 0x003d, blocks: (B:19:0x0036, B:34:0x005e, B:38:0x006d, B:40:0x0075, B:30:0x0049, B:33:0x0050), top: B:61:0x000b, outer: #4 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0089 -> B:20:0x0039). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketJvm.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public RawWebSocketJvm(ByteReadChannel input, ByteWriteChannel output, long j10, boolean z10, m coroutineContext, ObjectPool<ByteBuffer> pool) {
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(pool, "pool");
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.Key));
        this.socketJob = completableJobJob;
        this.filtered = ChannelKt.Channel$default(0, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(completableJobJob).plus(new CoroutineName("raw-ws"));
        final Long lValueOf = Long.valueOf(j10);
        this.maxFrameSize$delegate = new nv.a(lValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // nv.a
            public void afterChange(KProperty<?> property, Long l9, Long l10) {
                e0.checkNotNullParameter(property, "property");
                long jLongValue = l10.longValue();
                l9.longValue();
                this.getReader$ktor_websockets().setMaxFrameSize(jLongValue);
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(z10);
        this.masking$delegate = new nv.a(boolValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // nv.a
            public void afterChange(KProperty<?> property, Boolean bool, Boolean bool2) {
                e0.checkNotNullParameter(property, "property");
                boolean zBooleanValue = bool2.booleanValue();
                bool.getClass();
                this.getWriter$ktor_websockets().setMasking(zBooleanValue);
            }
        };
        this.writer = new WebSocketWriter(output, getCoroutineContext(), z10, pool);
        this.reader = new WebSocketReader(input, getCoroutineContext(), j10, pool);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
        completableJobJob.complete();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(d<? super x0> dVar) {
        Object objFlush = this.writer.flush(dVar);
        return objFlush == e.getCOROUTINE_SUSPENDED() ? objFlush : x0.f87415a;
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
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return ((Boolean) this.masking$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return ((Number) this.maxFrameSize$delegate.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public SendChannel<Frame> getOutgoing() {
        return this.writer.getOutgoing();
    }

    public final WebSocketReader getReader$ktor_websockets() {
        return this.reader;
    }

    public final WebSocketWriter getWriter$ktor_websockets() {
        return this.writer;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, d<? super x0> dVar) {
        return WebSocketSession.DefaultImpls.send(this, frame, dVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z10) {
        this.masking$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z10));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j10) {
        this.maxFrameSize$delegate.setValue(this, $$delegatedProperties[0], Long.valueOf(j10));
    }

    @Override // io.ktor.websocket.WebSocketSession
    @tu.f
    public void terminate() {
        SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.socketJob.complete();
    }

    public /* synthetic */ RawWebSocketJvm(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j10, boolean z10, m mVar, ObjectPool objectPool, int i10, u uVar) {
        this(byteReadChannel, byteWriteChannel, (i10 & 4) != 0 ? 2147483647L : j10, (i10 & 8) != 0 ? false : z10, mVar, (i10 & 32) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }
}
