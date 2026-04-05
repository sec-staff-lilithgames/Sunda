package io.ktor.utils.io;

import av.e;
import bv.b;
import bv.d;
import bv.f;
import bv.h;
import bv.n;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.InterfaceC3129ae;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import io.ktor.http.ContentDisposition;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.charsets.TooLongLineException;
import io.ktor.utils.io.charsets.UTFKt;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.BufferPrimitivesJvmKt;
import io.ktor.utils.io.core.BufferUtilsJvmKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.OutputArraysJVMKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import io.ktor.utils.io.internal.CancellableReusableContinuation;
import io.ktor.utils.io.internal.ClosedElement;
import io.ktor.utils.io.internal.FailedLookAhead;
import io.ktor.utils.io.internal.JoiningState;
import io.ktor.utils.io.internal.ObjectPoolKt;
import io.ktor.utils.io.internal.ReadSessionImpl;
import io.ktor.utils.io.internal.ReadWriteBufferState;
import io.ktor.utils.io.internal.RingBufferCapacity;
import io.ktor.utils.io.internal.TerminatedLookAhead;
import io.ktor.utils.io.internal.WriteSessionImpl;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.z0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kv.a;
import kv.l;
import kv.p;
import p0.o2;
import qv.v;
import tu.a0;
import tu.k;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class ByteBufferChannel implements ByteChannel, ByteReadChannel, ByteWriteChannel, LookAheadSuspendSession, HasReadSession, HasWriteSession {
    private static final int ReservedLongIndex = -8;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile Job attachedJob;
    private final boolean autoFlush;
    private volatile JoiningState joining;
    private final ObjectPool<ReadWriteBufferState.Initial> pool;
    private int readPosition;
    private final ReadSessionImpl readSession;
    private final CancellableReusableContinuation<Boolean> readSuspendContinuationCache;
    private final int reservedSize;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private int writePosition;
    private final WriteSessionImpl writeSession;
    private final CancellableReusableContinuation<x0> writeSuspendContinuationCache;
    private final l writeSuspension;
    private volatile int writeSuspensionSize;
    public static final Companion Companion = new Companion(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_state");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closed$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_closed");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _readOp$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_readOp");
    static final /* synthetic */ AtomicReferenceFieldUpdater _writeOp$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_writeOp");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$attachJob$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            ByteBufferChannel.this.attachedJob = null;
            if (th2 == null) {
                return;
            }
            ByteBufferChannel.this.cancel(ExceptionUtilsKt.unwrapCancellationException(th2));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0}, l = {1871}, m = "awaitAtLeastSuspend", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$awaitAtLeastSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40011 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40011(zu.d<? super C40011> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.awaitAtLeastSuspend(0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1512, 1513}, m = "awaitFreeSpaceOrDelegate", n = {"this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$awaitFreeSpaceOrDelegate$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40021 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40021(zu.d<? super C40021> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.awaitFreeSpaceOrDelegate(0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1702}, m = "discardSuspend", n = {"this", "discarded", "max"}, s = {"L$0", "L$1", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$discardSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40031 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40031(zu.d<? super C40031> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.discardSuspend(0L, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1163, 1171}, m = "joinFromSuspend", n = {"this", "src", "delegateClose"}, s = {"L$0", "L$1", "Z$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$joinFromSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40041 extends d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C40041(zu.d<? super C40041> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.joinFromSuspend(null, false, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {2, 2, 2, 2, 5, 5}, l = {1790, 1792, 1797, 1802, 1804, 1808}, m = "lookAheadSuspend$suspendImpl", n = {"$this", "visitor", "result", "this_$iv", "$this", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$lookAheadSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40051<R> extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C40051(zu.d<? super C40051> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.lookAheadSuspend$suspendImpl(ByteBufferChannel.this, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {729, 733}, m = "readAvailableSuspend", n = {"this", "dst", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40061 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40061(zu.d<? super C40061> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {737, 741}, m = "readAvailableSuspend", n = {"this", "dst"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$2, reason: invalid class name */
    public static final class AnonymousClass2 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {745, 749}, m = "readAvailableSuspend", n = {"this", "dst"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$3, reason: invalid class name */
    public static final class AnonymousClass3 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(zu.d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend((ChunkBuffer) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1710, 1718}, m = "readBlockSuspend", n = {"this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readBlockSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40071 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40071(zu.d<? super C40071> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readBlockSuspend(0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {}, l = {818}, m = "readBoolean", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readBoolean$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40081 extends d {
        int label;
        /* synthetic */ Object result;

        public C40081(zu.d<? super C40081> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readBoolean(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readByte", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readByte$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40091 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40091(zu.d<? super C40091> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readByte(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readDouble", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readDouble$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40101 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40101(zu.d<? super C40101> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readDouble(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readFloat", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFloat$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40111 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40111(zu.d<? super C40111> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFloat(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {585}, m = "readFullySuspend", n = {"this", "dst", "copied"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFullySuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40121 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40121(zu.d<? super C40121> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFullySuspend((ByteBuffer) null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {608}, m = "readFullySuspend", n = {"this", "dst", "n", "copied"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFullySuspend$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40132 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40132(zu.d<? super C40132> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFullySuspend((ChunkBuffer) null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0}, l = {IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL}, m = "readFullySuspend", n = {"this", "dst", "currentOffset", "currentLength", "consumed"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFullySuspend$3, reason: invalid class name and case insensitive filesystem */
    public static final class C40143 extends d {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40143(zu.d<? super C40143> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFullySuspend(null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readInt", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readInt$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40151 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40151(zu.d<? super C40151> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readInt(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readLong", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readLong$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40161 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40161(zu.d<? super C40161> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readLong(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {800}, m = "readPacketSuspend", n = {"this", "builder", "buffer", "remaining"}, s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readPacketSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40171 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C40171(zu.d<? super C40171> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readPacketSuspend(0, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0}, l = {2093}, m = "readRemainingSuspend", n = {"this", "builder$iv", "remaining", "$this$writeWhile$iv", "tail$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readRemainingSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40181 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C40181(zu.d<? super C40181> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readRemainingSuspend(0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40191 extends f0 implements l {
        final /* synthetic */ l $consumer;
        final /* synthetic */ ByteBufferChannel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40191(l lVar, ByteBufferChannel byteBufferChannel) {
            super(1);
            this.$consumer = lVar;
            this.this$0 = byteBufferChannel;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LookAheadSession) obj);
            return x0.f87415a;
        }

        public final void invoke(LookAheadSession lookAhead) {
            e0.checkNotNullParameter(lookAhead, "$this$lookAhead");
            try {
                this.$consumer.invoke(this.this$0.readSession);
            } finally {
                this.this$0.readSession.completed();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readShort", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readShort$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40201 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40201(zu.d<? super C40201> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readShort(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2236}, m = "readSuspendImpl", n = {"this", ContentDisposition.Parameters.Size}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendImpl$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40211 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40211(zu.d<? super C40211> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readSuspendImpl(0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2189}, m = "readSuspendLoop", n = {"this", ContentDisposition.Parameters.Size}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40221 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40221(zu.d<? super C40221> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readSuspendLoop(0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0}, l = {2055}, m = "readUTF8Line$suspendImpl", n = {"sb"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8Line$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40241 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40241(zu.d<? super C40241> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.readUTF8Line$suspendImpl(ByteBufferChannel.this, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {1960, 2036}, m = "readUTF8LineToUtf8Suspend", n = {"this", "out", "consumed", "required", "caret", "newLine", "output", "transferBuffer", "transferredRemaining", "limit", "this", "consumed", "caret", "newLine"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8LineToUtf8Suspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40251 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C40251(zu.d<? super C40251> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readUTF8LineToUtf8Suspend(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8LineToUtf8Suspend$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40262 extends f0 implements l {
        final /* synthetic */ w0 $caret;
        final /* synthetic */ z0 $consumed;
        final /* synthetic */ int $limit;
        final /* synthetic */ w0 $newLine;
        final /* synthetic */ Appendable $out;
        final /* synthetic */ char[] $output;
        final /* synthetic */ z0 $required;
        final /* synthetic */ b1 $transferBuffer;
        final /* synthetic */ z0 $transferredRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40262(b1 b1Var, int i10, char[] cArr, z0 z0Var, z0 z0Var2, w0 w0Var, w0 w0Var2, Appendable appendable, z0 z0Var3) {
            super(1);
            this.$transferBuffer = b1Var;
            this.$limit = i10;
            this.$output = cArr;
            this.$consumed = z0Var;
            this.$required = z0Var2;
            this.$newLine = w0Var;
            this.$caret = w0Var2;
            this.$out = appendable;
            this.$transferredRemaining = z0Var3;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            invoke((ByteBuffer) obj);
            return x0.f87415a;
        }

        public final void invoke(ByteBuffer buffer) throws IOException {
            e0.checkNotNullParameter(buffer, "buffer");
            int iPosition = buffer.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.$transferBuffer.f71816b;
            if (byteBuffer != null) {
                int iLimit = buffer.limit();
                buffer.limit(Math.min(buffer.limit(), byteBuffer.remaining() + buffer.position()));
                byteBuffer.put(buffer);
                byteBuffer.flip();
                buffer.limit(iLimit);
            } else {
                byteBuffer = buffer;
            }
            int i10 = this.$limit;
            long jDecodeUTF8Line = UTFKt.decodeUTF8Line(byteBuffer, this.$output, 0, i10 == Integer.MAX_VALUE ? this.$output.length : Math.min(this.$output.length, i10 - this.$consumed.f71866b));
            b1 b1Var = this.$transferBuffer;
            ByteBuffer byteBuffer2 = (ByteBuffer) b1Var.f71816b;
            if (byteBuffer2 != null) {
                z0 z0Var = this.$transferredRemaining;
                buffer.position((byteBuffer2.position() + iPosition) - z0Var.f71866b);
                ObjectPoolKt.getBufferPool().recycle(byteBuffer2);
                b1Var.f71816b = null;
                z0Var.f71866b = 0;
            }
            int i11 = (int) (jDecodeUTF8Line >> 32);
            int i12 = (int) (jDecodeUTF8Line & 4294967295L);
            this.$required.f71866b = Math.max(1, i12);
            if (i12 == -1) {
                this.$newLine.f71863b = true;
            }
            if (i12 != -1 && buffer.hasRemaining() && buffer.get(buffer.position()) == 13) {
                buffer.position(buffer.position() + 1);
                this.$caret.f71863b = true;
            }
            if (i12 != -1 && buffer.hasRemaining() && buffer.get(buffer.position()) == 10) {
                buffer.position(buffer.position() + 1);
                this.$newLine.f71863b = true;
            }
            Appendable appendable = this.$out;
            if (appendable instanceof StringBuilder) {
                ((StringBuilder) appendable).append(this.$output, 0, i11);
            } else {
                this.$out.append(CharBuffer.wrap(this.$output, 0, i11), 0, i11);
            }
            this.$consumed.f71866b += i11;
            if (i11 == 0 && buffer.remaining() < i12) {
                b1 b1Var2 = this.$transferBuffer;
                ByteBuffer byteBufferBorrow = ObjectPoolKt.getBufferPool().borrow();
                this.$transferredRemaining.f71866b = buffer.remaining();
                byteBufferBorrow.put(buffer);
                b1Var2.f71816b = byteBufferBorrow;
            }
            int i13 = this.$limit;
            if (i13 != Integer.MAX_VALUE && this.$consumed.f71866b >= i13 && !this.$newLine.f71863b) {
                throw new TooLongLineException("Line is longer than limit");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8LineToUtf8Suspend$3, reason: invalid class name and case insensitive filesystem */
    public static final class C40273 extends f0 implements l {
        final /* synthetic */ w0 $newLine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40273(w0 w0Var) {
            super(1);
            this.$newLine = w0Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ByteBuffer) obj);
            return x0.f87415a;
        }

        public final void invoke(ByteBuffer it) {
            e0.checkNotNullParameter(it, "it");
            if (it.get(it.position()) == 10) {
                it.position(it.position() + 1);
                this.$newLine.f71863b = true;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {InterfaceC3129ae.a.f35983h}, m = "write$suspendImpl", n = {"$this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$write$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40281 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40281(zu.d<? super C40281> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.write$suspendImpl(ByteBufferChannel.this, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1072, 1074, 1076}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40291 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40291(zu.d<? super C40291> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeAvailableSuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1080, 1082, 1084}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$3, reason: invalid class name and case insensitive filesystem */
    public static final class C40303 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40303(zu.d<? super C40303> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeAvailableSuspend((ChunkBuffer) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {936, 936, 936, 2426, 2481, 936, 936, 2508}, m = "writeByte$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B}, s = {"L$0", "L$1", "B$0", "L$0", "L$1", "L$2", "B$0", "I$0", "L$0", "L$1", "B$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeByte$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40311 extends d {
        byte B$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C40311(zu.d<? super C40311> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeByte$suspendImpl(ByteBufferChannel.this, (byte) 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1113, 1115}, m = "writeFullySuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40321 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40321(zu.d<? super C40321> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1123, 1125}, m = "writeFullySuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3, reason: invalid class name and case insensitive filesystem */
    public static final class C40333 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40333(zu.d<? super C40333> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend((Buffer) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {1422}, m = "writeFullySuspend", n = {"this", "src", "currentOffset", "currentLength"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5, reason: invalid class name */
    public static final class AnonymousClass5 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass5(zu.d<? super AnonymousClass5> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend(null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {944, 944, 944, 2426, 2481, 944, 944, 2508}, m = "writeInt$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", "i", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "i", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "i"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeInt$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40341 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C40341(zu.d<? super C40341> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeInt$suspendImpl(ByteBufferChannel.this, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {948, 948, 948, 2426, 2481, 948, 948, 2508}, m = "writeLong$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", "l", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "l", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "l"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeLong$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40351 extends d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C40351(zu.d<? super C40351> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeLong$suspendImpl(ByteBufferChannel.this, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 1}, l = {1742, 1744}, m = "writePacketSuspend", n = {"this", "packet", "packet"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writePacketSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40361 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40361(zu.d<? super C40361> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writePacketSuspend(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, l = {940, 940, 940, 2426, 2481, 940, 940, 2508}, m = "writeShort$suspendImpl", n = {"joined$iv$iv", "this_$iv$iv$iv", ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", ApsMetricsDataMap.APSMETRICS_FIELD_SDK}, s = {"L$0", "L$1", "S$0", "L$0", "L$1", "L$2", "S$0", "I$0", "L$0", "L$1", "S$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeShort$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40371 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        short S$0;
        int label;
        /* synthetic */ Object result;

        public C40371(zu.d<? super C40371> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeShort$suspendImpl(ByteBufferChannel.this, (short) 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {1439, 1441}, m = "writeSuspend", n = {"this", "src", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40381 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40381(zu.d<? super C40381> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2412}, m = "writeSuspend", n = {"this", ContentDisposition.Parameters.Size}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspend$3, reason: invalid class name and case insensitive filesystem */
    public static final class C40393 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40393(zu.d<? super C40393> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeSuspend(0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0}, l = {1835}, m = "writeSuspendSession$suspendImpl", n = {"session"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspendSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40401 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40401(zu.d<? super C40401> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeSuspendSession$suspendImpl(ByteBufferChannel.this, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {1537, 1549}, m = "writeWhileSuspend", n = {"this", "block", "continueWriting", "this_$iv", "current$iv", "capacity$iv", "capacity", "dst", "$this$writeWhileSuspend_u24lambda_u2497", "before$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeWhileSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40411 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C40411(zu.d<? super C40411> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeWhileSuspend(null, this);
        }
    }

    public ByteBufferChannel(boolean z10, ObjectPool<ReadWriteBufferState.Initial> pool, int i10) {
        e0.checkNotNullParameter(pool, "pool");
        this.autoFlush = z10;
        this.pool = pool;
        this.reservedSize = i10;
        this._state = ReadWriteBufferState.IdleEmpty.INSTANCE;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.readSession = new ReadSessionImpl(this);
        this.writeSession = new WriteSessionImpl(this);
        this.readSuspendContinuationCache = new CancellableReusableContinuation<>();
        this.writeSuspendContinuationCache = new CancellableReusableContinuation<>();
        this.writeSuspension = new ByteBufferChannel$writeSuspension$1(this);
    }

    private final int afterBufferVisited(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity) {
        int iPosition = byteBuffer.position() - this.readPosition;
        if (iPosition <= 0) {
            return iPosition;
        }
        if (!ringBufferCapacity.tryReadExact(iPosition)) {
            throw new IllegalStateException("Consumed more bytes than available");
        }
        bytesRead(byteBuffer, ringBufferCapacity, iPosition);
        prepareBuffer(byteBuffer, this.readPosition, ringBufferCapacity._availableForRead$internal);
        return iPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitAtLeastSuspend(int r5, zu.d<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteBufferChannel.C40011
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteBufferChannel$awaitAtLeastSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$awaitAtLeastSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$awaitAtLeastSuspend$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r5 = (io.ktor.utils.io.ByteBufferChannel) r5
            tu.a0.throwOnFailure(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.readSuspend(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L59
            io.ktor.utils.io.internal.ReadWriteBufferState r0 = r5.getState()
            boolean r0 = r0.getIdle()
            if (r0 == 0) goto L59
            r5.setupStateForRead()
        L59:
            java.lang.Boolean r5 = bv.b.boxBoolean(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.awaitAtLeastSuspend(int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitClose(zu.d<? super x0> dVar) {
        x0 x0Var = x0.f87415a;
        if (getClosed() != null) {
            return x0Var;
        }
        JoiningState joiningState = this.joining;
        if (joiningState != null) {
            Object objAwaitClose = joiningState.awaitClose(dVar);
            return objAwaitClose == e.getCOROUTINE_SUSPENDED() ? objAwaitClose : x0Var;
        }
        if (getClosed() != null) {
            return x0Var;
        }
        throw new IllegalStateException("Only works for joined.");
    }

    public static /* synthetic */ Object awaitContent$suspendImpl(ByteBufferChannel byteBufferChannel, zu.d<? super x0> dVar) throws Throwable {
        Object suspend = byteBufferChannel.readSuspend(1, dVar);
        return suspend == e.getCOROUTINE_SUSPENDED() ? suspend : x0.f87415a;
    }

    public static /* synthetic */ Object awaitFreeSpace$suspendImpl(ByteBufferChannel byteBufferChannel, zu.d<? super x0> dVar) throws Throwable {
        Object objWriteSuspend = byteBufferChannel.writeSuspend(1, dVar);
        return objWriteSuspend == e.getCOROUTINE_SUSPENDED() ? objWriteSuspend : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitFreeSpaceOrDelegate(int r7, kv.l r8, zu.d<? super tu.x0> r9) {
        /*
            r6 = this;
            tu.x0 r0 = tu.x0.f87415a
            boolean r1 = r9 instanceof io.ktor.utils.io.ByteBufferChannel.C40021
            if (r1 == 0) goto L15
            r1 = r9
            io.ktor.utils.io.ByteBufferChannel$awaitFreeSpaceOrDelegate$1 r1 = (io.ktor.utils.io.ByteBufferChannel.C40021) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.utils.io.ByteBufferChannel$awaitFreeSpaceOrDelegate$1 r1 = new io.ktor.utils.io.ByteBufferChannel$awaitFreeSpaceOrDelegate$1
            r1.<init>(r9)
        L1a:
            java.lang.Object r9 = r1.result
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L44
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            tu.a0.throwOnFailure(r9)
            goto L6f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            int r7 = r1.I$0
            java.lang.Object r8 = r1.L$1
            kv.l r8 = (kv.l) r8
            java.lang.Object r3 = r1.L$0
            io.ktor.utils.io.ByteBufferChannel r3 = (io.ktor.utils.io.ByteBufferChannel) r3
            tu.a0.throwOnFailure(r9)
            goto L57
        L44:
            tu.a0.throwOnFailure(r9)
            r1.L$0 = r6
            r1.L$1 = r8
            r1.I$0 = r7
            r1.label = r5
            java.lang.Object r9 = r6.writeSuspend(r7, r1)
            if (r9 != r2) goto L56
            goto L6e
        L56:
            r3 = r6
        L57:
            io.ktor.utils.io.internal.JoiningState r9 = r3.joining
            if (r9 == 0) goto L6f
            io.ktor.utils.io.ByteBufferChannel r9 = r3.resolveDelegation(r3, r9)
            if (r9 == 0) goto L6f
            r3 = 0
            r1.L$0 = r3
            r1.L$1 = r3
            r1.label = r4
            java.lang.Object r7 = r9.write(r7, r8, r1)
            if (r7 != r2) goto L6f
        L6e:
            return r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.awaitFreeSpaceOrDelegate(int, kv.l, zu.d):java.lang.Object");
    }

    private final void bytesRead(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.readPosition = carryIndex(byteBuffer, this.readPosition + i10);
        ringBufferCapacity.completeRead(i10);
        setTotalBytesRead$ktor_io(getTotalBytesRead() + i10);
        resumeWriteOp();
    }

    private final void bytesWritten(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.writePosition = carryIndex(byteBuffer, this.writePosition + i10);
        ringBufferCapacity.completeWrite(i10);
        setTotalBytesWritten$ktor_io(getTotalBytesWritten() + i10);
    }

    private final void carry(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - this.reservedSize;
        int iPosition = byteBuffer.position();
        for (int i10 = iCapacity; i10 < iPosition; i10++) {
            byteBuffer.put(i10 - iCapacity, byteBuffer.get(i10));
        }
    }

    private final int carryIndex(ByteBuffer byteBuffer, int i10) {
        return i10 >= byteBuffer.capacity() - this.reservedSize ? i10 - (byteBuffer.capacity() - this.reservedSize) : i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        kotlin.jvm.internal.b0.finallyStart(2);
        restoreStateAfterRead();
        tryTerminate$ktor_io();
        kotlin.jvm.internal.b0.finallyEnd(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean consumeEachBufferRangeFast(boolean r6, kv.p r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.nio.ByteBuffer r0 = r5.setupStateForRead()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
        L8:
            r6 = r1
            goto L36
        La:
            io.ktor.utils.io.internal.ReadWriteBufferState r3 = r5.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r3 = r3.capacity
            int r4 = r3._availableForRead$internal     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L21
            kotlin.jvm.internal.b0.finallyStart(r2)
            r5.restoreStateAfterRead()
            r5.tryTerminate$ktor_io()
            kotlin.jvm.internal.b0.finallyEnd(r2)
            goto L8
        L21:
            boolean r1 = r0.hasRemaining()     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L49
            if (r6 == 0) goto L2a
            goto L49
        L2a:
            kotlin.jvm.internal.b0.finallyStart(r2)
            r5.restoreStateAfterRead()
            r5.tryTerminate$ktor_io()
            kotlin.jvm.internal.b0.finallyEnd(r2)
        L36:
            if (r6 != 0) goto L48
            io.ktor.utils.io.internal.ClosedElement r0 = r5.getClosed()
            if (r0 == 0) goto L48
            java.nio.ByteBuffer r6 = io.ktor.utils.io.internal.ReadWriteBufferStateKt.getEmptyByteBuffer()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.invoke(r6, r0)
            return r2
        L48:
            return r6
        L49:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L65
            r5.afterBufferVisited(r0, r3)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L67
            if (r6 == 0) goto L21
            boolean r1 = r0.hasRemaining()     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L21
            goto L67
        L65:
            r6 = move-exception
            goto L75
        L67:
            r6 = 2
            kotlin.jvm.internal.b0.finallyStart(r6)
            r5.restoreStateAfterRead()
            r5.tryTerminate$ktor_io()
            kotlin.jvm.internal.b0.finallyEnd(r6)
            return r2
        L75:
            kotlin.jvm.internal.b0.finallyStart(r2)
            r5.restoreStateAfterRead()
            r5.tryTerminate$ktor_io()
            kotlin.jvm.internal.b0.finallyEnd(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.consumeEachBufferRangeFast(boolean, kv.p):boolean");
    }

    private final Object delegatePrimitive(l lVar, zu.d<? super x0> dVar) throws Throwable {
        x0 x0Var = x0.f87415a;
        JoiningState joiningState = this.joining;
        e0.checkNotNull(joiningState);
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            lVar.invoke(joiningState.getDelegatedTo());
            return x0Var;
        }
        while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
            b0.mark(0);
            writeSuspend(1, dVar);
            b0.mark(1);
        }
        lVar.invoke(joiningState.getDelegatedTo());
        return x0Var;
    }

    private final Object delegateSuspend(JoiningState joiningState, l lVar, zu.d<? super x0> dVar) throws Throwable {
        while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
            b0.mark(0);
            writeSuspend(1, dVar);
            b0.mark(1);
        }
        lVar.invoke(joiningState.getDelegatedTo());
        return x0.f87415a;
    }

    public static /* synthetic */ Object discard$suspendImpl(ByteBufferChannel byteBufferChannel, long j10, zu.d<? super Long> dVar) throws Throwable {
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "max shouldn't be negative: ").toString());
        }
        ByteBuffer byteBuffer = byteBufferChannel.setupStateForRead();
        if (byteBuffer != null) {
            RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0) {
                    int iTryReadAtMost = ringBufferCapacity.tryReadAtMost((int) Math.min(2147483647L, j10));
                    byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                    j11 = iTryReadAtMost;
                }
            } finally {
                byteBufferChannel.restoreStateAfterRead();
                byteBufferChannel.tryTerminate$ktor_io();
            }
        }
        long j12 = j11;
        return (j12 == j10 || byteBufferChannel.isClosedForRead()) ? b.boxLong(j12) : byteBufferChannel.discardSuspend(j12, j10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[PHI: r10 r12 r13
      PHI (r10v2 long) = (r10v1 long), (r10v6 long) binds: [B:14:0x003b, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]
      PHI (r12v2 kotlin.jvm.internal.a1) = (r12v1 kotlin.jvm.internal.a1), (r12v4 kotlin.jvm.internal.a1) binds: [B:14:0x003b, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]
      PHI (r13v1 io.ktor.utils.io.ByteBufferChannel) = (r13v0 io.ktor.utils.io.ByteBufferChannel), (r13v2 io.ktor.utils.io.ByteBufferChannel) binds: [B:14:0x003b, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0077 -> B:29:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object discardSuspend(long r10, long r12, zu.d<? super java.lang.Long> r14) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.ByteBufferChannel.C40031
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.ByteBufferChannel$discardSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40031) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$discardSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$discardSuspend$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r10 = r0.J$0
            java.lang.Object r12 = r0.L$1
            kotlin.jvm.internal.a1 r12 = (kotlin.jvm.internal.a1) r12
            java.lang.Object r13 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r13 = (io.ktor.utils.io.ByteBufferChannel) r13
            tu.a0.throwOnFailure(r14)
            goto L7a
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            tu.a0.throwOnFailure(r14)
            kotlin.jvm.internal.a1 r14 = new kotlin.jvm.internal.a1
            r14.<init>()
            r14.f71813b = r10
            r10 = r12
            r12 = r14
            r13 = r9
        L48:
            long r4 = r12.f71813b
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 >= 0) goto Lab
            java.nio.ByteBuffer r14 = r13.setupStateForRead()
            if (r14 != 0) goto L55
            goto L65
        L55:
            io.ktor.utils.io.internal.ReadWriteBufferState r2 = r13.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r2 = r2.capacity
            int r4 = r2._availableForRead$internal     // Catch: java.lang.Throwable -> La3
            if (r4 != 0) goto L83
            r13.restoreStateAfterRead()
            r13.tryTerminate$ktor_io()
        L65:
            boolean r14 = r13.isClosedForRead()
            if (r14 != 0) goto Lab
            r0.L$0 = r13
            r0.L$1 = r12
            r0.J$0 = r10
            r0.label = r3
            java.lang.Object r14 = r13.readSuspend(r3, r0)
            if (r14 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L48
            goto Lab
        L83:
            long r4 = r12.f71813b     // Catch: java.lang.Throwable -> La3
            long r4 = r10 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.lang.Throwable -> La3
            int r4 = (int) r4     // Catch: java.lang.Throwable -> La3
            int r4 = r2.tryReadAtMost(r4)     // Catch: java.lang.Throwable -> La3
            r13.bytesRead(r14, r2, r4)     // Catch: java.lang.Throwable -> La3
            long r5 = r12.f71813b     // Catch: java.lang.Throwable -> La3
            long r7 = (long) r4     // Catch: java.lang.Throwable -> La3
            long r5 = r5 + r7
            r12.f71813b = r5     // Catch: java.lang.Throwable -> La3
            r13.restoreStateAfterRead()
            r13.tryTerminate$ktor_io()
            goto L48
        La3:
            r10 = move-exception
            r13.restoreStateAfterRead()
            r13.tryTerminate$ktor_io()
            throw r10
        Lab:
            long r10 = r12.f71813b
            java.lang.Long r10 = bv.b.boxLong(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.discardSuspend(long, long, zu.d):java.lang.Object");
    }

    private final void doWritePrimitive(int i10, ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, l lVar) {
        if (byteBuffer.remaining() < i10) {
            byteBuffer.limit(byteBuffer.capacity());
            lVar.invoke(byteBuffer);
            carry(byteBuffer);
        } else {
            lVar.invoke(byteBuffer);
        }
        bytesWritten(byteBuffer, ringBufferCapacity, i10);
        if (ringBufferCapacity.isFull() || getAutoFlush()) {
            flush();
        }
        restoreStateAfterWrite$ktor_io();
        tryTerminate$ktor_io();
    }

    private final void ensureClosedJoined(JoiningState joiningState) {
        ClosedElement closed = getClosed();
        if (closed == null) {
            return;
        }
        this.joining = null;
        if (!joiningState.getDelegateClose()) {
            joiningState.getDelegatedTo().flush();
            joiningState.complete();
            return;
        }
        ReadWriteBufferState state = joiningState.getDelegatedTo().getState();
        boolean z10 = (state instanceof ReadWriteBufferState.Writing) || (state instanceof ReadWriteBufferState.ReadingWriting);
        if (closed.getCause() == null && z10) {
            joiningState.getDelegatedTo().flush();
        } else {
            joiningState.getDelegatedTo().close(closed.getCause());
        }
        joiningState.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushImpl(int i10) {
        ReadWriteBufferState state;
        ReadWriteBufferState.Terminated terminated;
        ByteBufferChannel delegatedTo;
        JoiningState joiningState = this.joining;
        if (joiningState != null && (delegatedTo = joiningState.getDelegatedTo()) != null) {
            delegatedTo.flush();
        }
        do {
            state = getState();
            terminated = ReadWriteBufferState.Terminated.INSTANCE;
            if (state == terminated) {
                return;
            } else {
                state.capacity.flush();
            }
        } while (state != getState());
        int i11 = state.capacity._availableForWrite$internal;
        if (state.capacity._availableForRead$internal >= 1) {
            resumeReadOp();
        }
        JoiningState joiningState2 = this.joining;
        if (i11 >= i10) {
            if (joiningState2 == null || getState() == terminated) {
                resumeWriteOp();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClosedElement getClosed() {
        return (ClosedElement) this._closed;
    }

    private final zu.d<Boolean> getReadOp() {
        return (zu.d) this._readOp;
    }

    private final ReadWriteBufferState getState() {
        return (ReadWriteBufferState) this._state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zu.d<x0> getWriteOp() {
        return (zu.d) this._writeOp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object joinFromSuspend(io.ktor.utils.io.ByteBufferChannel r10, boolean r11, io.ktor.utils.io.internal.JoiningState r12, zu.d<? super tu.x0> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteBufferChannel.C40041
            if (r0 == 0) goto L14
            r0 = r13
            io.ktor.utils.io.ByteBufferChannel$joinFromSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40041) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            io.ktor.utils.io.ByteBufferChannel$joinFromSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$joinFromSuspend$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            tu.x0 r7 = tu.x0.f87415a
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L38
            if (r1 != r8) goto L30
            tu.a0.throwOnFailure(r13)
            goto L7f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            boolean r11 = r6.Z$0
            java.lang.Object r10 = r6.L$1
            io.ktor.utils.io.ByteBufferChannel r10 = (io.ktor.utils.io.ByteBufferChannel) r10
            java.lang.Object r12 = r6.L$0
            io.ktor.utils.io.ByteBufferChannel r12 = (io.ktor.utils.io.ByteBufferChannel) r12
            tu.a0.throwOnFailure(r13)
            goto L62
        L46:
            tu.a0.throwOnFailure(r13)
            r6.L$0 = r9
            r6.L$1 = r10
            r6.Z$0 = r11
            r6.label = r2
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = r9
            r2 = r10
            r5 = r12
            java.lang.Object r10 = r1.copyDirect$ktor_io(r2, r3, r5, r6)
            if (r10 != r0) goto L60
            goto L7e
        L60:
            r12 = r9
            r10 = r2
        L62:
            if (r11 == 0) goto L6e
            boolean r11 = r10.isClosedForRead()
            if (r11 == 0) goto L6e
            io.ktor.utils.io.ByteWriteChannelKt.close(r12)
            return r7
        L6e:
            r12.flush()
            r11 = 0
            r6.L$0 = r11
            r6.L$1 = r11
            r6.label = r8
            java.lang.Object r10 = r10.awaitClose(r6)
            if (r10 != r0) goto L7f
        L7e:
            return r0
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.joinFromSuspend(io.ktor.utils.io.ByteBufferChannel, boolean, io.ktor.utils.io.internal.JoiningState, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <R> java.lang.Object lookAheadSuspend$suspendImpl(io.ktor.utils.io.ByteBufferChannel r7, kv.p r8, zu.d<? super R> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.lookAheadSuspend$suspendImpl(io.ktor.utils.io.ByteBufferChannel, kv.p, zu.d):java.lang.Object");
    }

    private final ReadWriteBufferState.Initial newBuffer() {
        ReadWriteBufferState.Initial initialBorrow = this.pool.borrow();
        initialBorrow.capacity.resetForWrite();
        return initialBorrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: peekTo-lBXzO7A$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m4301peekTolBXzO7A$suspendImpl(io.ktor.utils.io.ByteBufferChannel r14, java.nio.ByteBuffer r15, long r16, long r18, long r20, long r22, zu.d<? super java.lang.Long> r24) {
        /*
            r0 = r24
            boolean r1 = r0 instanceof io.ktor.utils.io.ByteBufferChannel$peekTo$1
            if (r1 == 0) goto L15
            r1 = r0
            io.ktor.utils.io.ByteBufferChannel$peekTo$1 r1 = (io.ktor.utils.io.ByteBufferChannel$peekTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.utils.io.ByteBufferChannel$peekTo$1 r1 = new io.ktor.utils.io.ByteBufferChannel$peekTo$1
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            java.lang.Object r14 = r1.L$0
            kotlin.jvm.internal.z0 r14 = (kotlin.jvm.internal.z0) r14
            tu.a0.throwOnFailure(r0)     // Catch: java.io.EOFException -> L60
            goto L60
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            tu.a0.throwOnFailure(r0)
            kotlin.jvm.internal.z0 r13 = new kotlin.jvm.internal.z0
            r13.<init>()
            long r5 = r20 + r18
            r7 = 4088(0xff8, double:2.0197E-320)
            long r5 = qv.v.coerceAtMost(r5, r7)
            int r0 = (int) r5
            io.ktor.utils.io.ByteBufferChannel$peekTo$2 r5 = new io.ktor.utils.io.ByteBufferChannel$peekTo$2     // Catch: java.io.EOFException -> L5f
            r10 = r15
            r11 = r16
            r6 = r18
            r8 = r22
            r5.<init>(r6, r8, r10, r11, r13)     // Catch: java.io.EOFException -> L5f
            r1.L$0 = r13     // Catch: java.io.EOFException -> L5f
            r1.label = r4     // Catch: java.io.EOFException -> L5f
            java.lang.Object r14 = r14.read(r0, r5, r1)     // Catch: java.io.EOFException -> L5f
            if (r14 != r2) goto L5f
            return r2
        L5f:
            r14 = r13
        L60:
            int r14 = r14.f71866b
            long r0 = (long) r14
            java.lang.Long r14 = bv.b.boxLong(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.m4301peekTolBXzO7A$suspendImpl(io.ktor.utils.io.ByteBufferChannel, java.nio.ByteBuffer, long, long, long, long, zu.d):java.lang.Object");
    }

    private final void prepareBuffer(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byteBuffer.limit(v.coerceAtMost(i11 + i10, byteBuffer.capacity() - this.reservedSize));
        byteBuffer.position(i10);
    }

    public static /* synthetic */ Object read$suspendImpl(ByteBufferChannel byteBufferChannel, int i10, l lVar, zu.d<? super x0> dVar) throws Throwable {
        int i11;
        x0 x0Var = x0.f87415a;
        if (i10 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        ByteBuffer byteBuffer = byteBufferChannel.setupStateForRead();
        boolean z10 = false;
        if (byteBuffer != null) {
            RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0 && (i11 = ringBufferCapacity._availableForRead$internal) > 0 && i11 >= i10) {
                    int iPosition = byteBuffer.position();
                    int iLimit = byteBuffer.limit();
                    lVar.invoke(byteBuffer);
                    if (iLimit != byteBuffer.limit()) {
                        throw new IllegalStateException("Buffer limit modified.");
                    }
                    int iPosition2 = byteBuffer.position() - iPosition;
                    if (iPosition2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported.");
                    }
                    if (!ringBufferCapacity.tryReadExact(iPosition2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, iPosition2);
                    z10 = true;
                }
            } finally {
                byteBufferChannel.restoreStateAfterRead();
                byteBufferChannel.tryTerminate$ktor_io();
            }
        }
        if (!z10) {
            if (byteBufferChannel.isClosedForRead() && i10 > 0) {
                throw new EOFException(o2.k(i10, "Got EOF but at least ", " bytes were expected"));
            }
            Object blockSuspend = byteBufferChannel.readBlockSuspend(i10, lVar, dVar);
            if (blockSuspend == e.getCOROUTINE_SUSPENDED()) {
                return blockSuspend;
            }
        }
        return x0Var;
    }

    private final int readAsMuchAsPossible(ByteBuffer byteBuffer) throws Throwable {
        ByteBuffer byteBuffer2 = setupStateForRead();
        int i10 = 0;
        if (byteBuffer2 == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        try {
            if (ringBufferCapacity._availableForRead$internal != 0) {
                int iCapacity = byteBuffer2.capacity() - this.reservedSize;
                while (true) {
                    int iRemaining = byteBuffer.remaining();
                    if (iRemaining == 0) {
                        break;
                    }
                    int i11 = this.readPosition;
                    int iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(iCapacity - i11, iRemaining));
                    if (iTryReadAtMost == 0) {
                        break;
                    }
                    byteBuffer2.limit(i11 + iTryReadAtMost);
                    byteBuffer2.position(i11);
                    byteBuffer.put(byteBuffer2);
                    bytesRead(byteBuffer2, ringBufferCapacity, iTryReadAtMost);
                    i10 += iTryReadAtMost;
                }
            }
            return i10;
        } finally {
            restoreStateAfterRead();
            tryTerminate$ktor_io();
        }
    }

    public static /* synthetic */ int readAsMuchAsPossible$default(ByteBufferChannel byteBufferChannel, Buffer buffer, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = buffer.getLimit() - buffer.getWritePosition();
        }
        return byteBufferChannel.readAsMuchAsPossible(buffer, i10, i11);
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i10, int i11, zu.d<? super Integer> dVar) throws Throwable {
        int asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(bArr, i10, i11);
        if (asMuchAsPossible == 0 && byteBufferChannel.getClosed() != null) {
            asMuchAsPossible = byteBufferChannel.getState().capacity.flush() ? byteBufferChannel.readAsMuchAsPossible(bArr, i10, i11) : -1;
        } else if (asMuchAsPossible <= 0 && i11 != 0) {
            return byteBufferChannel.readAvailableSuspend(bArr, i10, i11, dVar);
        }
        return b.boxInt(asMuchAsPossible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAvailableSuspend(byte[] r6, int r7, int r8, zu.d<? super java.lang.Integer> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteBufferChannel.C40061
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40061) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r6 = r0.L$1
            byte[] r6 = (byte[]) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r9)
            goto L59
        L44:
            tu.a0.throwOnFailure(r9)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r7
            r0.I$1 = r8
            r0.label = r4
            java.lang.Object r9 = r5.readSuspend(r4, r0)
            if (r9 != r1) goto L58
            goto L74
        L58:
            r2 = r5
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L67
            r6 = -1
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L67:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r6 = r2.readAvailable(r6, r7, r8, r0)
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readAvailableSuspend(byte[], int, int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readBlockSuspend(int r7, kv.l r8, zu.d<? super tu.x0> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteBufferChannel.C40071
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteBufferChannel$readBlockSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40071) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readBlockSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readBlockSuspend$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            tu.x0 r3 = tu.x0.f87415a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            tu.a0.throwOnFailure(r9)
            goto L82
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            kv.l r8 = (kv.l) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r9)
            goto L5b
        L44:
            tu.a0.throwOnFailure(r9)
            int r9 = qv.v.coerceAtLeast(r7, r5)
            r0.L$0 = r6
            r0.L$1 = r8
            r0.I$0 = r7
            r0.label = r5
            java.lang.Object r9 = r6.readSuspend(r9, r0)
            if (r9 != r1) goto L5a
            goto L81
        L5a:
            r2 = r6
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L74
            if (r7 > 0) goto L66
            return r3
        L66:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r9 = "Got EOF but at least "
            java.lang.String r0 = " bytes were expected"
            java.lang.String r7 = p0.o2.k(r7, r9, r0)
            r8.<init>(r7)
            throw r8
        L74:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r7 = r2.read(r7, r8, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readBlockSuspend(int, kv.l, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readFully$suspendImpl(ByteBufferChannel byteBufferChannel, ChunkBuffer chunkBuffer, int i10, zu.d<? super x0> dVar) {
        Object fullySuspend;
        int asMuchAsPossible$default = readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, i10, 2, null);
        x0 x0Var = x0.f87415a;
        return (asMuchAsPossible$default != i10 && (fullySuspend = byteBufferChannel.readFullySuspend(chunkBuffer, i10 - asMuchAsPossible$default, dVar)) == e.getCOROUTINE_SUSPENDED()) ? fullySuspend : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFullySuspend(java.nio.ByteBuffer r6, int r7, zu.d<? super java.lang.Integer> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.C40121
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteBufferChannel$readFullySuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readFullySuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readFullySuspend$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r8)
            goto L57
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            tu.a0.throwOnFailure(r8)
            r2 = r5
        L3f:
            boolean r8 = r6.hasRemaining()
            if (r8 == 0) goto L85
            r0.L$0 = r2
            r0.L$1 = r6
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r8 = r2.readSuspend(r3, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r4 = r7
            r7 = r6
            r6 = r4
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L68
            int r8 = r2.readAsMuchAsPossible(r7)
            int r6 = r6 + r8
            r4 = r7
            r7 = r6
            r6 = r4
            goto L3f
        L68:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r6 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected EOF: expected "
            r8.<init>(r0)
            int r7 = r7.remaining()
            r8.append(r7)
            java.lang.String r7 = " more bytes"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L85:
            java.lang.Integer r6 = bv.b.boxInt(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readFullySuspend(java.nio.ByteBuffer, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object readPacket$suspendImpl(ByteBufferChannel byteBufferChannel, int i10, zu.d<? super ByteReadPacket> dVar) throws Throwable {
        Throwable cause;
        ClosedElement closed = byteBufferChannel.getClosed();
        if (closed != null && (cause = closed.getCause()) != null) {
            ByteBufferChannelKt.rethrowClosed(cause);
            throw new k();
        }
        if (i10 == 0) {
            return ByteReadPacket.Companion.getEmpty();
        }
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        ByteBuffer byteBufferBorrow = ObjectPoolKt.getBufferPool().borrow();
        while (i10 > 0) {
            try {
                byteBufferBorrow.clear();
                if (byteBufferBorrow.remaining() > i10) {
                    byteBufferBorrow.limit(i10);
                }
                int asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(byteBufferBorrow);
                if (asMuchAsPossible == 0) {
                    break;
                }
                byteBufferBorrow.flip();
                OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBufferBorrow);
                i10 -= asMuchAsPossible;
            } catch (Throwable th2) {
                ObjectPoolKt.getBufferPool().recycle(byteBufferBorrow);
                bytePacketBuilder.release();
                throw th2;
            }
        }
        if (i10 != 0) {
            return byteBufferChannel.readPacketSuspend(i10, bytePacketBuilder, byteBufferBorrow, dVar);
        }
        ObjectPoolKt.getBufferPool().recycle(byteBufferBorrow);
        return bytePacketBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:28:0x006d, B:20:0x004a, B:22:0x0053, B:25:0x005c, B:29:0x007b), top: B:37:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:28:0x006d, B:20:0x004a, B:22:0x0053, B:25:0x005c, B:29:0x007b), top: B:37:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:37:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readPacketSuspend(int r6, io.ktor.utils.io.core.BytePacketBuilder r7, java.nio.ByteBuffer r8, zu.d<? super io.ktor.utils.io.core.ByteReadPacket> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteBufferChannel.C40171
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteBufferChannel$readPacketSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40171) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readPacketSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readPacketSuspend$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r8 = r0.L$1
            io.ktor.utils.io.core.BytePacketBuilder r8 = (io.ktor.utils.io.core.BytePacketBuilder) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3a
            r4 = r8
            r8 = r7
            r7 = r4
            goto L6d
        L3a:
            r6 = move-exception
            goto L87
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            tu.a0.throwOnFailure(r9)
            r2 = r5
        L48:
            if (r6 <= 0) goto L7b
            r8.clear()     // Catch: java.lang.Throwable -> L57
            int r9 = r8.remaining()     // Catch: java.lang.Throwable -> L57
            if (r9 <= r6) goto L5c
            r8.limit(r6)     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r6 = move-exception
            r4 = r8
            r8 = r7
            r7 = r4
            goto L87
        L5c:
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L57
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L57
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L57
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L57
            r0.label = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r9 = r2.readFully(r8, r0)     // Catch: java.lang.Throwable -> L57
            if (r9 != r1) goto L6d
            return r1
        L6d:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L57
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L57
            r8.flip()     // Catch: java.lang.Throwable -> L57
            io.ktor.utils.io.core.OutputArraysJVMKt.writeFully(r7, r8)     // Catch: java.lang.Throwable -> L57
            int r6 = r6 - r9
            goto L48
        L7b:
            io.ktor.utils.io.core.ByteReadPacket r6 = r7.build()     // Catch: java.lang.Throwable -> L57
            io.ktor.utils.io.pool.ObjectPool r7 = io.ktor.utils.io.internal.ObjectPoolKt.getBufferPool()
            r7.recycle(r8)
            return r6
        L87:
            r8.release()     // Catch: java.lang.Throwable -> L8b
            throw r6     // Catch: java.lang.Throwable -> L8b
        L8b:
            r6 = move-exception
            io.ktor.utils.io.pool.ObjectPool r8 = io.ktor.utils.io.internal.ObjectPoolKt.getBufferPool()
            r8.recycle(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readPacketSuspend(int, io.ktor.utils.io.core.BytePacketBuilder, java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    private final <T extends Number> Object readPrimitive(int i10, l lVar, zu.d<? super T> dVar) throws Throwable {
        boolean zBooleanValue;
        Object suspend;
        boolean z10;
        do {
            b1 b1Var = new b1();
            ByteBuffer byteBuffer = setupStateForRead();
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal == 0) {
                        b0.finallyStart(1);
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        b0.finallyEnd(1);
                        zBooleanValue = false;
                    } else {
                        if (ringBufferCapacity.tryReadExact(i10)) {
                            if (byteBuffer.remaining() < i10) {
                                rollBytes(byteBuffer, i10);
                            }
                            b1Var.f71816b = lVar.invoke(byteBuffer);
                            bytesRead(byteBuffer, ringBufferCapacity, i10);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zBooleanValue = Boolean.valueOf(z10).booleanValue();
                        b0.finallyStart(1);
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        b0.finallyEnd(1);
                    }
                } catch (Throwable th2) {
                    b0.finallyStart(1);
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                    b0.finallyEnd(1);
                    throw th2;
                }
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                Object obj = b1Var.f71816b;
                if (obj != null) {
                    return (Number) obj;
                }
                e0.throwUninitializedPropertyAccessException("result");
                return null;
            }
            b0.mark(0);
            suspend = readSuspend(i10, dVar);
            b0.mark(1);
        } while (((Boolean) suspend).booleanValue());
        throw new ClosedReceiveChannelException(o2.k(i10, "EOF while ", " bytes expected"));
    }

    public static /* synthetic */ Object readRemaining$suspendImpl(ByteBufferChannel byteBufferChannel, long j10, zu.d<? super ByteReadPacket> dVar) throws Throwable {
        if (!byteBufferChannel.isClosedForWrite()) {
            return byteBufferChannel.readRemainingSuspend(j10, dVar);
        }
        Throwable closedCause = byteBufferChannel.getClosedCause();
        if (closedCause == null) {
            return byteBufferChannel.remainingPacket(j10);
        }
        ByteBufferChannelKt.rethrowClosed(closedCause);
        throw new k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:39:0x00b7, B:41:0x00c0, B:45:0x00c9, B:46:0x00ca, B:47:0x00cd, B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:52:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00af -> B:36:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readRemainingSuspend(long r12, zu.d<? super io.ktor.utils.io.core.ByteReadPacket> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readRemainingSuspend(long, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readSuspend(int i10, zu.d<? super Boolean> dVar) throws Throwable {
        if (getState().capacity._availableForRead$internal >= i10) {
            return b.boxBoolean(true);
        }
        ClosedElement closed = getClosed();
        if (closed == null) {
            return i10 == 1 ? readSuspendImpl(1, dVar) : readSuspendLoop(i10, dVar);
        }
        Throwable cause = closed.getCause();
        if (cause != null) {
            ByteBufferChannelKt.rethrowClosed(cause);
            throw new k();
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        boolean z10 = ringBufferCapacity.flush() && ringBufferCapacity._availableForRead$internal >= i10;
        if (getReadOp() == null) {
            return b.boxBoolean(z10);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSuspendImpl(int r5, zu.d<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteBufferChannel.C40211
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteBufferChannel$readSuspendImpl$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readSuspendImpl$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readSuspendImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r5 = (io.ktor.utils.io.ByteBufferChannel) r5
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            return r6
        L2d:
            r6 = move-exception
            goto L7a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            tu.a0.throwOnFailure(r6)
            io.ktor.utils.io.internal.ReadWriteBufferState r6 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r2 = r6.capacity
            int r2 = r2._availableForRead$internal
            if (r2 >= r5) goto L7f
            io.ktor.utils.io.internal.JoiningState r2 = r4.joining
            if (r2 == 0) goto L56
            zu.d r2 = r4.getWriteOp()
            if (r2 == 0) goto L56
            io.ktor.utils.io.internal.ReadWriteBufferState$IdleEmpty r2 = io.ktor.utils.io.internal.ReadWriteBufferState.IdleEmpty.INSTANCE
            if (r6 == r2) goto L7f
            boolean r6 = r6 instanceof io.ktor.utils.io.internal.ReadWriteBufferState.IdleNonEmpty
            if (r6 != 0) goto L7f
        L56:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L73
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L73
            r0.label = r3     // Catch: java.lang.Throwable -> L73
            io.ktor.utils.io.internal.CancellableReusableContinuation<java.lang.Boolean> r6 = r4.readSuspendContinuationCache     // Catch: java.lang.Throwable -> L73
            r4.suspensionForSize(r5, r6)     // Catch: java.lang.Throwable -> L73
            zu.d r5 = av.b.intercepted(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r6.completeSuspendBlock(r5)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = av.e.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L73
            if (r5 != r6) goto L76
            bv.h.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L73
            goto L76
        L73:
            r6 = move-exception
            r5 = r4
            goto L7a
        L76:
            if (r5 != r1) goto L79
            return r1
        L79:
            return r5
        L7a:
            r0 = 0
            r5.setReadOp(r0)
            throw r6
        L7f:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readSuspendImpl(int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0092 -> B:39:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSuspendLoop(int r6, zu.d<? super java.lang.Boolean> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel.C40221
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteBufferChannel$readSuspendLoop$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readSuspendLoop$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readSuspendLoop$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r7)
            goto L95
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            tu.a0.throwOnFailure(r7)
            r2 = r5
        L3c:
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r2.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L4b
            java.lang.Boolean r6 = bv.b.boxBoolean(r4)
            return r6
        L4b:
            io.ktor.utils.io.internal.ClosedElement r7 = r2.getClosed()
            if (r7 == 0) goto L88
            java.lang.Throwable r0 = r7.getCause()
            if (r0 != 0) goto L7b
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r2.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            boolean r0 = r7.flush()
            if (r0 == 0) goto L68
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L68
            r3 = r4
        L68:
            zu.d r6 = r2.getReadOp()
            if (r6 != 0) goto L73
            java.lang.Boolean r6 = bv.b.boxBoolean(r3)
            return r6
        L73:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Read operation is already in progress"
            r6.<init>(r7)
            throw r6
        L7b:
            java.lang.Throwable r6 = r7.getCause()
            io.ktor.utils.io.ByteBufferChannelKt.access$rethrowClosed(r6)
            tu.k r6 = new tu.k
            r6.<init>()
            throw r6
        L88:
            r0.L$0 = r2
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r2.readSuspendImpl(r6, r0)
            if (r7 != r1) goto L95
            return r1
        L95:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L3c
            java.lang.Boolean r6 = bv.b.boxBoolean(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readSuspendLoop(int, zu.d):java.lang.Object");
    }

    private final boolean readSuspendPredicate(int i10) {
        ReadWriteBufferState state = getState();
        if (state.capacity._availableForRead$internal >= i10) {
            return false;
        }
        if (this.joining == null || getWriteOp() == null) {
            return true;
        }
        return (state == ReadWriteBufferState.IdleEmpty.INSTANCE || (state instanceof ReadWriteBufferState.IdleNonEmpty)) ? false : true;
    }

    @tu.f
    public static /* synthetic */ Object readSuspendableSession$suspendImpl(ByteBufferChannel byteBufferChannel, p pVar, zu.d<? super x0> dVar) {
        Object objLookAheadSuspend = byteBufferChannel.lookAheadSuspend(new C40232(pVar, byteBufferChannel, null), dVar);
        return objLookAheadSuspend == e.getCOROUTINE_SUSPENDED() ? objLookAheadSuspend : x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object readUTF8Line$suspendImpl(io.ktor.utils.io.ByteBufferChannel r5, int r6, zu.d<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel.C40241
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteBufferChannel$readUTF8Line$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readUTF8Line$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readUTF8Line$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            tu.a0.throwOnFailure(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r5 = r5.readUTF8LineTo(r7, r6, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r4 = r7
            r7 = r5
            r5 = r4
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L55
            r5 = 0
            return r5
        L55:
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readUTF8Line$suspendImpl(io.ktor.utils.io.ByteBufferChannel, int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readUTF8LineToAscii(Appendable appendable, int i10, zu.d<? super Boolean> dVar) throws Throwable {
        if (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
            return readUTF8LineToUtf8Suspend(appendable, i10, dVar);
        }
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            return b.boxBoolean(false);
        }
        throw closedCause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:86)|35|36|84|37|38|88|39|(9:42|20|43|23|(7:25|34|49|(0)|52|(1:54)|63)(0)|64|(0)(0)|74|75)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:86|35|36|84|37|38|88|39|(9:42|20|43|23|(7:25|34|49|(0)|52|(1:54)|63)(0)|64|(0)(0)|74|75)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        r20 = r9;
        r21 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
    
        r9 = r18;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012e, code lost:
    
        r0 = r16;
        r12 = r17;
        r8 = r18;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:
    
        if (r1.read(1, r5, r4) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0080, code lost:
    
        r9 = r8;
        r8 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011c -> B:20:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readUTF8LineToUtf8Suspend(java.lang.Appendable r23, int r24, zu.d<? super java.lang.Boolean> r25) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readUTF8LineToUtf8Suspend(java.lang.Appendable, int, zu.d):java.lang.Object");
    }

    private final boolean reading(p pVar) throws Throwable {
        Object obj = setupStateForRead();
        if (obj == null) {
            return false;
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        try {
            if (ringBufferCapacity._availableForRead$internal == 0) {
                return false;
            }
            return ((Boolean) pVar.invoke(obj, ringBufferCapacity)).booleanValue();
        } finally {
            b0.finallyStart(1);
            restoreStateAfterRead();
            tryTerminate$ktor_io();
            b0.finallyEnd(1);
        }
    }

    private final void releaseBuffer(ReadWriteBufferState.Initial initial) {
        this.pool.recycle(initial);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ByteReadPacket remainingPacket(long j10) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(bytePacketBuilder, 1, null);
            while (true) {
                try {
                    if (chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition() > j10) {
                        chunkBufferPrepareWriteHead.resetForWrite((int) j10);
                    }
                    j10 -= readAsMuchAsPossible$default(this, chunkBufferPrepareWriteHead, 0, 0, 6, null);
                    if (j10 <= 0 || isClosedForRead()) {
                        break;
                    }
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(bytePacketBuilder, 1, chunkBufferPrepareWriteHead);
                } catch (Throwable th2) {
                    bytePacketBuilder.afterHeadWrite();
                    throw th2;
                }
            }
            bytePacketBuilder.afterHeadWrite();
            return bytePacketBuilder.build();
        } catch (Throwable th3) {
            bytePacketBuilder.release();
            throw th3;
        }
    }

    private final ByteBufferChannel resolveDelegation(ByteBufferChannel byteBufferChannel, JoiningState joiningState) {
        while (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            byteBufferChannel = joiningState.getDelegatedTo();
            joiningState = byteBufferChannel.joining;
            if (joiningState == null) {
                return byteBufferChannel;
            }
        }
        return null;
    }

    private final void restoreStateAfterRead() {
        ReadWriteBufferState readWriteBufferStateStopReading$ktor_io;
        ReadWriteBufferState readWriteBufferState = null;
        loop0: while (true) {
            Object obj = this._state;
            ReadWriteBufferState readWriteBufferState2 = (ReadWriteBufferState) obj;
            ReadWriteBufferState.IdleNonEmpty idleNonEmpty = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState;
            if (idleNonEmpty != null) {
                idleNonEmpty.capacity.resetForWrite();
                resumeWriteOp();
                readWriteBufferState = null;
            }
            readWriteBufferStateStopReading$ktor_io = readWriteBufferState2.stopReading$ktor_io();
            if ((readWriteBufferStateStopReading$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && getState() == readWriteBufferState2 && readWriteBufferStateStopReading$ktor_io.capacity.tryLockForRelease()) {
                readWriteBufferStateStopReading$ktor_io = ReadWriteBufferState.IdleEmpty.INSTANCE;
                readWriteBufferState = readWriteBufferStateStopReading$ktor_io;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, readWriteBufferStateStopReading$ktor_io)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        ReadWriteBufferState.IdleEmpty idleEmpty = ReadWriteBufferState.IdleEmpty.INSTANCE;
        if (readWriteBufferStateStopReading$ktor_io == idleEmpty) {
            ReadWriteBufferState.IdleNonEmpty idleNonEmpty2 = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState;
            if (idleNonEmpty2 != null) {
                releaseBuffer(idleNonEmpty2.getInitial());
            }
            resumeWriteOp();
            return;
        }
        if ((readWriteBufferStateStopReading$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && readWriteBufferStateStopReading$ktor_io.capacity.isEmpty() && readWriteBufferStateStopReading$ktor_io.capacity.tryLockForRelease()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, readWriteBufferStateStopReading$ktor_io, idleEmpty)) {
                if (atomicReferenceFieldUpdater2.get(this) != readWriteBufferStateStopReading$ktor_io) {
                    return;
                }
            }
            readWriteBufferStateStopReading$ktor_io.capacity.resetForWrite();
            releaseBuffer(((ReadWriteBufferState.IdleNonEmpty) readWriteBufferStateStopReading$ktor_io).getInitial());
            resumeWriteOp();
        }
    }

    private final void resumeClosed(Throwable th2) {
        zu.d dVar = (zu.d) _readOp$FU.getAndSet(this, null);
        if (dVar != null) {
            if (th2 != null) {
                int i10 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
            } else {
                dVar.resumeWith(z.m7131constructorimpl(Boolean.valueOf(getState().capacity._availableForRead$internal > 0)));
            }
        }
        zu.d dVar2 = (zu.d) _writeOp$FU.getAndSet(this, null);
        if (dVar2 != null) {
            int i11 = z.f87419c;
            if (th2 == null) {
                th2 = new ClosedWriteChannelException(ByteBufferChannelKt.DEFAULT_CLOSE_MESSAGE);
            }
            dVar2.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeReadOp() {
        zu.d dVar = (zu.d) _readOp$FU.getAndSet(this, null);
        if (dVar != null) {
            ClosedElement closed = getClosed();
            Throwable cause = closed != null ? closed.getCause() : null;
            if (cause != null) {
                int i10 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(cause)));
            } else {
                int i11 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(Boolean.TRUE));
            }
        }
    }

    private final void resumeWriteOp() {
        Object objCreateFailure;
        while (true) {
            zu.d<x0> writeOp = getWriteOp();
            if (writeOp == null) {
                return;
            }
            ClosedElement closed = getClosed();
            if (closed == null && this.joining != null) {
                ReadWriteBufferState state = getState();
                if (!(state instanceof ReadWriteBufferState.Writing) && !(state instanceof ReadWriteBufferState.ReadingWriting) && state != ReadWriteBufferState.Terminated.INSTANCE) {
                    return;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _writeOp$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, writeOp, null)) {
                if (atomicReferenceFieldUpdater.get(this) != writeOp) {
                    break;
                }
            }
            if (closed == null) {
                int i10 = z.f87419c;
                objCreateFailure = x0.f87415a;
            } else {
                int i11 = z.f87419c;
                objCreateFailure = a0.createFailure(closed.getSendException());
            }
            writeOp.resumeWith(z.m7131constructorimpl(objCreateFailure));
            return;
        }
    }

    private final void rollBytes(ByteBuffer byteBuffer, int i10) {
        int iRemaining = byteBuffer.remaining();
        byteBuffer.limit(byteBuffer.position() + i10);
        int i11 = i10 - iRemaining;
        for (int i12 = 0; i12 < i11; i12++) {
            byteBuffer.put((byteBuffer.capacity() - 8) + i12, byteBuffer.get(i12));
        }
    }

    private final void setClosed(ClosedElement closedElement) {
        this._closed = closedElement;
    }

    private final void setReadOp(zu.d<? super Boolean> dVar) {
        this._readOp = dVar;
    }

    private final void setWriteOp(zu.d<? super x0> dVar) {
        this._writeOp = dVar;
    }

    private final JoiningState setupDelegateTo(ByteBufferChannel byteBufferChannel, boolean z10) {
        if (this == byteBufferChannel) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        JoiningState joiningState = new JoiningState(byteBufferChannel, z10);
        this.joining = joiningState;
        ClosedElement closed = getClosed();
        if (closed == null) {
            flush();
            return joiningState;
        }
        if (closed.getCause() != null) {
            byteBufferChannel.close(closed.getCause());
            return joiningState;
        }
        if (z10 && getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            ByteWriteChannelKt.close(byteBufferChannel);
            return joiningState;
        }
        byteBufferChannel.flush();
        return joiningState;
    }

    private final ByteBuffer setupStateForRead() throws Throwable {
        boolean z10;
        Throwable cause;
        ReadWriteBufferState readWriteBufferStateStartReading$ktor_io;
        Throwable cause2;
        do {
            Object obj = this._state;
            ReadWriteBufferState readWriteBufferState = (ReadWriteBufferState) obj;
            z10 = true;
            if (e0.areEqual(readWriteBufferState, ReadWriteBufferState.Terminated.INSTANCE) ? true : e0.areEqual(readWriteBufferState, ReadWriteBufferState.IdleEmpty.INSTANCE)) {
                ClosedElement closed = getClosed();
                if (closed == null || (cause = closed.getCause()) == null) {
                    return null;
                }
                ByteBufferChannelKt.rethrowClosed(cause);
                throw new k();
            }
            ClosedElement closed2 = getClosed();
            if (closed2 != null && (cause2 = closed2.getCause()) != null) {
                ByteBufferChannelKt.rethrowClosed(cause2);
                throw new k();
            }
            if (readWriteBufferState.capacity._availableForRead$internal != 0) {
                readWriteBufferStateStartReading$ktor_io = readWriteBufferState.startReading$ktor_io();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, readWriteBufferStateStartReading$ktor_io)) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                return null;
            }
        } while (!z10);
        ByteBuffer readBuffer = readWriteBufferStateStartReading$ktor_io.getReadBuffer();
        prepareBuffer(readBuffer, this.readPosition, readWriteBufferStateStartReading$ktor_io.capacity._availableForRead$internal);
        return readBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldResumeReadOp() {
        if (this.joining != null) {
            return getState() == ReadWriteBufferState.IdleEmpty.INSTANCE || (getState() instanceof ReadWriteBufferState.IdleNonEmpty);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
    
        r5 = tu.z.f87419c;
        r6.resumeWith(tu.z.m7131constructorimpl(java.lang.Boolean.TRUE));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object suspensionForSize(int r5, zu.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
        L0:
            io.ktor.utils.io.internal.ReadWriteBufferState r0 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r1 = r0.capacity
            int r1 = r1._availableForRead$internal
            if (r1 >= r5) goto Le2
            io.ktor.utils.io.internal.JoiningState r1 = r4.joining
            if (r1 == 0) goto L1c
            zu.d r1 = r4.getWriteOp()
            if (r1 == 0) goto L1c
            io.ktor.utils.io.internal.ReadWriteBufferState$IdleEmpty r1 = io.ktor.utils.io.internal.ReadWriteBufferState.IdleEmpty.INSTANCE
            if (r0 == r1) goto Le2
            boolean r0 = r0 instanceof io.ktor.utils.io.internal.ReadWriteBufferState.IdleNonEmpty
            if (r0 != 0) goto Le2
        L1c:
            io.ktor.utils.io.internal.ClosedElement r0 = r4.getClosed()
            if (r0 == 0) goto L6e
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L3e
            int r5 = tu.z.f87419c
            java.lang.Throwable r5 = r0.getCause()
            java.lang.Object r5 = tu.a0.createFailure(r5)
            java.lang.Object r5 = tu.z.m7131constructorimpl(r5)
            r6.resumeWith(r5)
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            return r5
        L3e:
            io.ktor.utils.io.internal.ReadWriteBufferState r0 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r0 = r0.capacity
            boolean r0 = r0.flush()
            io.ktor.utils.io.internal.ReadWriteBufferState r1 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r1 = r1.capacity
            int r1 = r1._availableForRead$internal
            r2 = 0
            r3 = 1
            if (r1 < r5) goto L56
            r5 = r3
            goto L57
        L56:
            r5 = r2
        L57:
            int r1 = tu.z.f87419c
            if (r0 == 0) goto L5e
            if (r5 == 0) goto L5e
            r2 = r3
        L5e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r5 = tu.z.m7131constructorimpl(r5)
            r6.resumeWith(r5)
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            return r5
        L6e:
            zu.d r0 = r4.getReadOp()
            if (r0 != 0) goto Lda
            io.ktor.utils.io.internal.ClosedElement r0 = r4.getClosed()
            if (r0 != 0) goto L0
            io.ktor.utils.io.internal.ReadWriteBufferState r0 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r1 = r0.capacity
            int r1 = r1._availableForRead$internal
            if (r1 >= r5) goto L0
            io.ktor.utils.io.internal.JoiningState r1 = r4.joining
            if (r1 == 0) goto L96
            zu.d r1 = r4.getWriteOp()
            if (r1 == 0) goto L96
            io.ktor.utils.io.internal.ReadWriteBufferState$IdleEmpty r1 = io.ktor.utils.io.internal.ReadWriteBufferState.IdleEmpty.INSTANCE
            if (r0 == r1) goto L0
            boolean r0 = r0 instanceof io.ktor.utils.io.internal.ReadWriteBufferState.IdleNonEmpty
            if (r0 != 0) goto L0
        L96:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = io.ktor.utils.io.ByteBufferChannel._readOp$FU
        L98:
            r1 = 0
            boolean r2 = r0.compareAndSet(r4, r1, r6)
            if (r2 == 0) goto Ld3
            io.ktor.utils.io.internal.ClosedElement r0 = r4.getClosed()
            if (r0 != 0) goto Lc2
            io.ktor.utils.io.internal.ReadWriteBufferState r0 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r2 = r0.capacity
            int r2 = r2._availableForRead$internal
            if (r2 >= r5) goto Lc2
            io.ktor.utils.io.internal.JoiningState r2 = r4.joining
            if (r2 == 0) goto Led
            zu.d r2 = r4.getWriteOp()
            if (r2 == 0) goto Led
            io.ktor.utils.io.internal.ReadWriteBufferState$IdleEmpty r2 = io.ktor.utils.io.internal.ReadWriteBufferState.IdleEmpty.INSTANCE
            if (r0 == r2) goto Lc2
            boolean r0 = r0 instanceof io.ktor.utils.io.internal.ReadWriteBufferState.IdleNonEmpty
            if (r0 != 0) goto Lc2
            goto Led
        Lc2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = io.ktor.utils.io.ByteBufferChannel._readOp$FU
        Lc4:
            boolean r0 = r2.compareAndSet(r4, r6, r1)
            if (r0 == 0) goto Lcc
            goto L0
        Lcc:
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r6) goto Lc4
            goto Led
        Ld3:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == 0) goto L98
            goto L6e
        Lda:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Operation is already in progress"
            r5.<init>(r6)
            throw r5
        Le2:
            int r5 = tu.z.f87419c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Object r5 = tu.z.m7131constructorimpl(r5)
            r6.resumeWith(r5)
        Led:
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.suspensionForSize(int, zu.d):java.lang.Object");
    }

    private final boolean tryCompleteJoining(JoiningState joiningState) {
        if (!tryReleaseBuffer(true)) {
            return false;
        }
        ensureClosedJoined(joiningState);
        zu.d dVar = (zu.d) _readOp$FU.getAndSet(this, null);
        if (dVar != null) {
            int i10 = z.f87419c;
            dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(new IllegalStateException("Joining is in progress"))));
        }
        resumeWriteOp();
        return true;
    }

    private final boolean tryReleaseBuffer(boolean z10) {
        ReadWriteBufferState.Initial initial = null;
        while (true) {
            Object obj = this._state;
            ReadWriteBufferState readWriteBufferState = (ReadWriteBufferState) obj;
            ClosedElement closed = getClosed();
            if (initial != null) {
                if ((closed != null ? closed.getCause() : null) == null) {
                    initial.capacity.resetForWrite();
                }
                resumeWriteOp();
                initial = null;
            }
            ReadWriteBufferState.Terminated terminated = ReadWriteBufferState.Terminated.INSTANCE;
            if (readWriteBufferState == terminated) {
                return true;
            }
            if (readWriteBufferState != ReadWriteBufferState.IdleEmpty.INSTANCE) {
                if (closed != null && (readWriteBufferState instanceof ReadWriteBufferState.IdleNonEmpty) && (readWriteBufferState.capacity.tryLockForRelease() || closed.getCause() != null)) {
                    if (closed.getCause() != null) {
                        readWriteBufferState.capacity.forceLockForRelease();
                    }
                    initial = ((ReadWriteBufferState.IdleNonEmpty) readWriteBufferState).getInitial();
                } else {
                    if (!z10 || !(readWriteBufferState instanceof ReadWriteBufferState.IdleNonEmpty) || !readWriteBufferState.capacity.tryLockForRelease()) {
                        return false;
                    }
                    initial = ((ReadWriteBufferState.IdleNonEmpty) readWriteBufferState).getInitial();
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, terminated)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (initial != null && getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                releaseBuffer(initial);
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int tryWritePacketPart(io.ktor.utils.io.core.ByteReadPacket r10) throws java.lang.Throwable {
        /*
            r9 = this;
            io.ktor.utils.io.internal.JoiningState r0 = r9.joining
            if (r0 == 0) goto La
            io.ktor.utils.io.ByteBufferChannel r0 = r9.resolveDelegation(r9, r0)
            if (r0 != 0) goto Lb
        La:
            r0 = r9
        Lb:
            java.nio.ByteBuffer r1 = r0.setupStateForWrite$ktor_io()
            if (r1 != 0) goto L13
            r10 = 0
            return r10
        L13:
            io.ktor.utils.io.internal.ReadWriteBufferState r2 = r0.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r2 = r2.capacity
            long r3 = r0.getTotalBytesWritten()
            io.ktor.utils.io.internal.ClosedElement r5 = r0.getClosed()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L6d
            long r5 = r10.getRemaining()     // Catch: java.lang.Throwable -> L46
            int r7 = r1.remaining()     // Catch: java.lang.Throwable -> L46
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L46
            long r5 = java.lang.Math.min(r5, r7)     // Catch: java.lang.Throwable -> L46
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L46
            int r5 = r2.tryWriteAtMost(r5)     // Catch: java.lang.Throwable -> L46
            if (r5 <= 0) goto L48
            int r6 = r1.position()     // Catch: java.lang.Throwable -> L46
            int r6 = r6 + r5
            r1.limit(r6)     // Catch: java.lang.Throwable -> L46
            io.ktor.utils.io.core.ByteBuffersKt.readFully(r10, r1)     // Catch: java.lang.Throwable -> L46
            r0.bytesWritten(r1, r2, r5)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r10 = move-exception
            goto L7a
        L48:
            boolean r10 = r2.isFull()
            if (r10 != 0) goto L54
            boolean r10 = r0.getAutoFlush()
            if (r10 == 0) goto L57
        L54:
            r0.flush()
        L57:
            if (r0 == r9) goto L66
            long r1 = r9.getTotalBytesWritten()
            long r6 = r0.getTotalBytesWritten()
            long r6 = r6 - r3
            long r6 = r6 + r1
            r9.setTotalBytesWritten$ktor_io(r6)
        L66:
            r0.restoreStateAfterWrite$ktor_io()
            r0.tryTerminate$ktor_io()
            return r5
        L6d:
            java.lang.Throwable r10 = r5.getSendException()     // Catch: java.lang.Throwable -> L46
            io.ktor.utils.io.ByteBufferChannelKt.access$rethrowClosed(r10)     // Catch: java.lang.Throwable -> L46
            tu.k r10 = new tu.k     // Catch: java.lang.Throwable -> L46
            r10.<init>()     // Catch: java.lang.Throwable -> L46
            throw r10     // Catch: java.lang.Throwable -> L46
        L7a:
            boolean r1 = r2.isFull()
            if (r1 != 0) goto L86
            boolean r1 = r0.getAutoFlush()
            if (r1 == 0) goto L89
        L86:
            r0.flush()
        L89:
            if (r0 == r9) goto L98
            long r1 = r9.getTotalBytesWritten()
            long r5 = r0.getTotalBytesWritten()
            long r5 = r5 - r3
            long r5 = r5 + r1
            r9.setTotalBytesWritten$ktor_io(r5)
        L98:
            r0.restoreStateAfterWrite$ktor_io()
            r0.tryTerminate$ktor_io()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.tryWritePacketPart(io.ktor.utils.io.core.ByteReadPacket):int");
    }

    private final boolean tryWritePrimitive(ByteBuffer byteBuffer, int i10, RingBufferCapacity ringBufferCapacity, l lVar) {
        if (!ringBufferCapacity.tryWriteExact(i10)) {
            return false;
        }
        prepareWriteBuffer$ktor_io(byteBuffer, i10);
        if (byteBuffer.remaining() < i10) {
            byteBuffer.limit(byteBuffer.capacity());
            lVar.invoke(byteBuffer);
            carry(byteBuffer);
        } else {
            lVar.invoke(byteBuffer);
        }
        bytesWritten(byteBuffer, ringBufferCapacity, i10);
        if (ringBufferCapacity.isFull() || getAutoFlush()) {
            flush();
        }
        restoreStateAfterWrite$ktor_io();
        tryTerminate$ktor_io();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object write$suspendImpl(io.ktor.utils.io.ByteBufferChannel r5, int r6, kv.l r7, zu.d<? super tu.x0> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.C40281
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteBufferChannel$write$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$write$1 r0 = new io.ktor.utils.io.ByteBufferChannel$write$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$1
            kv.l r6 = (kv.l) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r7 = (io.ktor.utils.io.ByteBufferChannel) r7
            tu.a0.throwOnFailure(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L48
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            tu.a0.throwOnFailure(r8)
            if (r6 <= 0) goto L72
            r8 = 4088(0xff8, float:5.729E-42)
            if (r6 > r8) goto L60
        L48:
            int r8 = r5.writeAvailable(r6, r7)
            if (r8 < 0) goto L51
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L51:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.awaitFreeSpaceOrDelegate(r6, r7, r0)
            if (r8 != r1) goto L48
            return r1
        L60:
            java.lang.String r5 = "Min("
            java.lang.String r7 = ") should'nt be greater than (4088)"
            java.lang.String r5 = p0.o2.k(r6, r5, r7)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L72:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "min should be positive"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.write$suspendImpl(io.ktor.utils.io.ByteBufferChannel, int, kv.l, zu.d):java.lang.Object");
    }

    private final int writeAsMuchAsPossible(ByteBuffer byteBuffer) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        int iTryWriteAtMost;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer2 = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i10 = 0;
        if (byteBuffer2 == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new k();
            }
            int iLimit = byteBuffer.limit();
            while (true) {
                int iPosition = iLimit - byteBuffer.position();
                if (iPosition == 0 || (iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(iPosition, byteBuffer2.remaining()))) == 0) {
                    break;
                }
                if (iTryWriteAtMost <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBuffer.limit(byteBuffer.position() + iTryWriteAtMost);
                byteBuffer2.put(byteBuffer);
                i10 += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer2, byteBufferChannelResolveDelegation.carryIndex(byteBuffer2, byteBufferChannelResolveDelegation.writePosition + i10), ringBufferCapacity._availableForWrite$internal);
            }
            byteBuffer.limit(iLimit);
            byteBufferChannelResolveDelegation.bytesWritten(byteBuffer2, ringBufferCapacity, i10);
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            return i10;
        } catch (Throwable th2) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th2;
        }
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, zu.d<? super Integer> dVar) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannelResolveDelegation2;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation2 = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            return byteBufferChannelResolveDelegation2.writeAvailable(byteBuffer, dVar);
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
        if (iWriteAsMuchAsPossible > 0) {
            return b.boxInt(iWriteAsMuchAsPossible);
        }
        JoiningState joiningState2 = byteBufferChannel.joining;
        return (joiningState2 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState2)) == null) ? byteBufferChannel.writeAvailableSuspend(byteBuffer, dVar) : byteBufferChannelResolveDelegation.writeAvailableSuspend(byteBuffer, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeAvailableSuspend(java.nio.ByteBuffer r7, zu.d<? super java.lang.Integer> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.C40291
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            tu.a0.throwOnFailure(r8)
            return r8
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            tu.a0.throwOnFailure(r8)
            return r8
        L3b:
            java.lang.Object r7 = r0.L$1
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r8)
            goto L58
        L47:
            tu.a0.throwOnFailure(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r6.writeSuspend(r5, r0)
            if (r8 != r1) goto L57
            goto L7d
        L57:
            r2 = r6
        L58:
            io.ktor.utils.io.internal.JoiningState r8 = r2.joining
            r5 = 0
            if (r8 == 0) goto L71
            io.ktor.utils.io.ByteBufferChannel r8 = r2.resolveDelegation(r2, r8)
            if (r8 == 0) goto L71
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r7 = r8.writeAvailableSuspend(r7, r0)
            if (r7 != r1) goto L70
            goto L7d
        L70:
            return r7
        L71:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r2.writeAvailable(r7, r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeAvailableSuspend(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r10.writeByte(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r10.getDelegatedTo().writeByte(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r2.getDelegatedTo().writeByte(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r9.getDelegatedTo().writeByte(r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (r2.getDelegatedTo().writeByte(r8, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa A[PHI: r2 r6 r8 r9 r10
      0x00fa: PHI (r2v10 java.nio.ByteBuffer) = (r2v9 java.nio.ByteBuffer), (r2v14 java.nio.ByteBuffer) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r6v2 io.ktor.utils.io.internal.RingBufferCapacity) = (r6v1 io.ktor.utils.io.internal.RingBufferCapacity), (r6v4 io.ktor.utils.io.internal.RingBufferCapacity) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r8v13 io.ktor.utils.io.ByteBufferChannel) = (r8v11 io.ktor.utils.io.ByteBufferChannel), (r8v19 io.ktor.utils.io.ByteBufferChannel) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r9v14 int) = (r9v12 int), (r9v21 int) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r10v13 byte) = (r10v12 byte), (r10v17 byte) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f7 -> B:49:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeByte$suspendImpl(io.ktor.utils.io.ByteBufferChannel r8, byte r9, zu.d<? super tu.x0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeByte$suspendImpl(io.ktor.utils.io.ByteBufferChannel, byte, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object writeDouble$suspendImpl(ByteBufferChannel byteBufferChannel, double d10, zu.d<? super x0> dVar) {
        Object objWriteLong = byteBufferChannel.writeLong(Double.doubleToRawLongBits(d10), dVar);
        return objWriteLong == e.getCOROUTINE_SUSPENDED() ? objWriteLong : x0.f87415a;
    }

    public static /* synthetic */ Object writeFloat$suspendImpl(ByteBufferChannel byteBufferChannel, float f10, zu.d<? super x0> dVar) {
        Object objWriteInt = byteBufferChannel.writeInt(Float.floatToRawIntBits(f10), dVar);
        return objWriteInt == e.getCOROUTINE_SUSPENDED() ? objWriteInt : x0.f87415a;
    }

    public static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, zu.d<? super x0> dVar) throws Throwable {
        Object objWriteFullySuspend;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        x0 x0Var = x0.f87415a;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) == null) {
            byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
            return (byteBuffer.hasRemaining() && (objWriteFullySuspend = byteBufferChannel.writeFullySuspend(byteBuffer, dVar)) == e.getCOROUTINE_SUSPENDED()) ? objWriteFullySuspend : x0Var;
        }
        Object objWriteFully = byteBufferChannelResolveDelegation.writeFully(byteBuffer, dVar);
        return objWriteFully == e.getCOROUTINE_SUSPENDED() ? objWriteFully : x0Var;
    }

    /* renamed from: writeFully-JT6ljtQ$suspendImpl, reason: not valid java name */
    public static /* synthetic */ Object m4302writeFullyJT6ljtQ$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, int i10, int i11, zu.d<? super x0> dVar) {
        Object objWriteFully = byteBufferChannel.writeFully(Memory.m4324slice87lwejk(byteBuffer, i10, i11 - i10), dVar);
        return objWriteFully == e.getCOROUTINE_SUSPENDED() ? objWriteFully : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeFullySuspend(java.nio.ByteBuffer r7, zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            tu.x0 r0 = tu.x0.f87415a
            boolean r1 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.C40321
            if (r1 == 0) goto L15
            r1 = r8
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$1 r1 = (io.ktor.utils.io.ByteBufferChannel.C40321) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$1 r1 = new io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            tu.a0.throwOnFailure(r8)
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r1.L$1
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r3 = r1.L$0
            io.ktor.utils.io.ByteBufferChannel r3 = (io.ktor.utils.io.ByteBufferChannel) r3
            tu.a0.throwOnFailure(r8)
            goto L59
        L42:
            tu.a0.throwOnFailure(r8)
            r3 = r6
        L46:
            boolean r8 = r7.hasRemaining()
            if (r8 == 0) goto L76
            r1.L$0 = r3
            r1.L$1 = r7
            r1.label = r5
            java.lang.Object r8 = r3.tryWriteSuspend$ktor_io(r5, r1)
            if (r8 != r2) goto L59
            goto L70
        L59:
            io.ktor.utils.io.internal.JoiningState r8 = r3.joining
            if (r8 == 0) goto L72
            io.ktor.utils.io.ByteBufferChannel r8 = r3.resolveDelegation(r3, r8)
            if (r8 == 0) goto L72
            r3 = 0
            r1.L$0 = r3
            r1.L$1 = r3
            r1.label = r4
            java.lang.Object r7 = r8.writeFully(r7, r1)
            if (r7 != r2) goto L71
        L70:
            return r2
        L71:
            return r0
        L72:
            r3.writeAsMuchAsPossible(r7)
            goto L46
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeFullySuspend(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r10.writeInt(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r8.writeInt(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        if (r8.writeInt(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        if (r8.writeInt(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013a, code lost:
    
        if (r9.writeInt(r8, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[PHI: r2 r3 r6 r8 r9
      0x00f5: PHI (r2v10 java.nio.ByteBuffer) = (r2v9 java.nio.ByteBuffer), (r2v15 java.nio.ByteBuffer) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r3v4 int) = (r3v2 int), (r3v8 int) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r6v5 io.ktor.utils.io.internal.RingBufferCapacity) = (r6v4 io.ktor.utils.io.internal.RingBufferCapacity), (r6v7 io.ktor.utils.io.internal.RingBufferCapacity) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r8v12 io.ktor.utils.io.ByteBufferChannel) = (r8v10 io.ktor.utils.io.ByteBufferChannel), (r8v18 io.ktor.utils.io.ByteBufferChannel) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r9v9 int) = (r9v7 int), (r9v13 int) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f2 -> B:49:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeInt$suspendImpl(io.ktor.utils.io.ByteBufferChannel r8, int r9, zu.d<? super tu.x0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeInt$suspendImpl(io.ktor.utils.io.ByteBufferChannel, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r13.writeLong(r11, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r10.writeLong(r11, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r10.writeLong(r11, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (r10.writeLong(r12, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        if (r12.writeLong(r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9 A[PHI: r2 r7 r10 r11 r12
      0x00f9: PHI (r2v10 java.nio.ByteBuffer) = (r2v9 java.nio.ByteBuffer), (r2v14 java.nio.ByteBuffer) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r7v2 io.ktor.utils.io.internal.RingBufferCapacity) = (r7v1 io.ktor.utils.io.internal.RingBufferCapacity), (r7v4 io.ktor.utils.io.internal.RingBufferCapacity) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r10v12 io.ktor.utils.io.ByteBufferChannel) = (r10v10 io.ktor.utils.io.ByteBufferChannel), (r10v18 io.ktor.utils.io.ByteBufferChannel) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r11v8 int) = (r11v6 int), (r11v14 int) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r12v4 long) = (r12v3 long), (r12v6 long) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f6 -> B:49:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeLong$suspendImpl(io.ktor.utils.io.ByteBufferChannel r10, long r11, zu.d<? super tu.x0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeLong$suspendImpl(io.ktor.utils.io.ByteBufferChannel, long, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object writePacket$suspendImpl(ByteBufferChannel byteBufferChannel, ByteReadPacket byteReadPacket, zu.d<? super x0> dVar) {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannelResolveDelegation2;
        x0 x0Var = x0.f87415a;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation2 = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            Object objWritePacket = byteBufferChannelResolveDelegation2.writePacket(byteReadPacket, dVar);
            return objWritePacket == e.getCOROUTINE_SUSPENDED() ? objWritePacket : x0Var;
        }
        while (!byteReadPacket.getEndOfInput() && byteBufferChannel.tryWritePacketPart(byteReadPacket) != 0) {
            try {
            } catch (Throwable th2) {
                byteReadPacket.release();
                throw th2;
            }
        }
        if (byteReadPacket.getRemaining() > 0) {
            JoiningState joiningState2 = byteBufferChannel.joining;
            if (joiningState2 != null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState2)) != null) {
                Object objWritePacket2 = byteBufferChannelResolveDelegation.writePacket(byteReadPacket, dVar);
                return objWritePacket2 == e.getCOROUTINE_SUSPENDED() ? objWritePacket2 : x0Var;
            }
            Object objWritePacketSuspend = byteBufferChannel.writePacketSuspend(byteReadPacket, dVar);
            if (objWritePacketSuspend == e.getCOROUTINE_SUSPENDED()) {
                return objWritePacketSuspend;
            }
        }
        return x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r8.writePacket(r7, r1) == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:20:0x0044, B:28:0x005f, B:30:0x0063, B:32:0x0069, B:37:0x007b, B:23:0x004c, B:25:0x0052), top: B:43:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005c -> B:28:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writePacketSuspend(io.ktor.utils.io.core.ByteReadPacket r7, zu.d<? super tu.x0> r8) {
        /*
            r6 = this;
            tu.x0 r0 = tu.x0.f87415a
            boolean r1 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.C40361
            if (r1 == 0) goto L15
            r1 = r8
            io.ktor.utils.io.ByteBufferChannel$writePacketSuspend$1 r1 = (io.ktor.utils.io.ByteBufferChannel.C40361) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.utils.io.ByteBufferChannel$writePacketSuspend$1 r1 = new io.ktor.utils.io.ByteBufferChannel$writePacketSuspend$1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L48
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L34
            java.lang.Object r7 = r1.L$0
            io.ktor.utils.io.core.ByteReadPacket r7 = (io.ktor.utils.io.core.ByteReadPacket) r7
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            goto L77
        L32:
            r8 = move-exception
            goto L83
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r1.L$1
            io.ktor.utils.io.core.ByteReadPacket r7 = (io.ktor.utils.io.core.ByteReadPacket) r7
            java.lang.Object r3 = r1.L$0
            io.ktor.utils.io.ByteBufferChannel r3 = (io.ktor.utils.io.ByteBufferChannel) r3
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            goto L5f
        L48:
            tu.a0.throwOnFailure(r8)
            r3 = r6
        L4c:
            boolean r8 = r7.getEndOfInput()     // Catch: java.lang.Throwable -> L32
            if (r8 != 0) goto L7f
            r1.L$0 = r3     // Catch: java.lang.Throwable -> L32
            r1.L$1 = r7     // Catch: java.lang.Throwable -> L32
            r1.label = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r3.writeSuspend(r5, r1)     // Catch: java.lang.Throwable -> L32
            if (r8 != r2) goto L5f
            goto L76
        L5f:
            io.ktor.utils.io.internal.JoiningState r8 = r3.joining     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L7b
            io.ktor.utils.io.ByteBufferChannel r8 = r3.resolveDelegation(r3, r8)     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L7b
            r1.L$0 = r7     // Catch: java.lang.Throwable -> L32
            r3 = 0
            r1.L$1 = r3     // Catch: java.lang.Throwable -> L32
            r1.label = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r8.writePacket(r7, r1)     // Catch: java.lang.Throwable -> L32
            if (r8 != r2) goto L77
        L76:
            return r2
        L77:
            r7.release()
            return r0
        L7b:
            r3.tryWritePacketPart(r7)     // Catch: java.lang.Throwable -> L32
            goto L4c
        L7f:
            r7.release()
            return r0
        L83:
            r7.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writePacketSuspend(io.ktor.utils.io.core.ByteReadPacket, zu.d):java.lang.Object");
    }

    private final Object writePrimitive(int i10, l lVar, l lVar2, zu.d<? super x0> dVar) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        x0 x0Var = x0.f87415a;
        JoiningState joiningState = this.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) != null) {
            lVar.invoke(byteBufferChannelResolveDelegation);
            return x0Var;
        }
        ByteBuffer byteBuffer = setupStateForWrite$ktor_io();
        if (byteBuffer == null) {
            JoiningState joiningState2 = this.joining;
            e0.checkNotNull(joiningState2);
            if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                lVar.invoke(joiningState2.getDelegatedTo());
            } else {
                while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                    b0.mark(0);
                    writeSuspend(1, dVar);
                    b0.mark(1);
                }
                lVar.invoke(joiningState2.getDelegatedTo());
            }
            return x0Var;
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        if (ringBufferCapacity.tryWriteExact(i10)) {
            prepareWriteBuffer$ktor_io(byteBuffer, i10);
            if (byteBuffer.remaining() < i10) {
                byteBuffer.limit(byteBuffer.capacity());
                lVar2.invoke(byteBuffer);
                carry(byteBuffer);
            } else {
                lVar2.invoke(byteBuffer);
            }
            bytesWritten(byteBuffer, ringBufferCapacity, i10);
            if (ringBufferCapacity.isFull() || getAutoFlush()) {
                flush();
            }
            return x0Var;
        }
        while (true) {
            try {
                b0.mark(0);
                writeSuspend(i10, dVar);
                b0.mark(1);
                if (this.joining != null) {
                    restoreStateAfterWrite$ktor_io();
                    JoiningState joiningState3 = this.joining;
                    e0.checkNotNull(joiningState3);
                    if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                        lVar.invoke(joiningState3.getDelegatedTo());
                    } else {
                        while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                            b0.mark(0);
                            writeSuspend(1, dVar);
                            b0.mark(1);
                        }
                        lVar.invoke(joiningState3.getDelegatedTo());
                    }
                } else if (ringBufferCapacity.tryWriteExact(i10)) {
                    prepareWriteBuffer$ktor_io(byteBuffer, i10);
                    if (byteBuffer.remaining() < i10) {
                        byteBuffer.limit(byteBuffer.capacity());
                        lVar2.invoke(byteBuffer);
                        carry(byteBuffer);
                    } else {
                        lVar2.invoke(byteBuffer);
                    }
                    bytesWritten(byteBuffer, ringBufferCapacity, i10);
                    if (ringBufferCapacity.isFull() || getAutoFlush()) {
                        flush();
                    }
                }
            } finally {
                restoreStateAfterWrite$ktor_io();
                tryTerminate$ktor_io();
            }
        }
        return x0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r10.writeShort(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r10.getDelegatedTo().writeShort(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r2.getDelegatedTo().writeShort(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        if (r10.getDelegatedTo().writeShort(r9, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        if (r2.getDelegatedTo().writeShort(r8, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7 A[PHI: r2 r6 r8 r9 r10
      0x00f7: PHI (r2v7 int) = (r2v6 int), (r2v13 int) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r6v4 io.ktor.utils.io.internal.RingBufferCapacity) = (r6v3 io.ktor.utils.io.internal.RingBufferCapacity), (r6v6 io.ktor.utils.io.internal.RingBufferCapacity) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r8v13 io.ktor.utils.io.ByteBufferChannel) = (r8v11 io.ktor.utils.io.ByteBufferChannel), (r8v19 io.ktor.utils.io.ByteBufferChannel) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r9v13 short) = (r9v11 short), (r9v20 short) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r10v11 java.nio.ByteBuffer) = (r10v10 java.nio.ByteBuffer), (r10v14 java.nio.ByteBuffer) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f4 -> B:49:0x00f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeShort$suspendImpl(io.ktor.utils.io.ByteBufferChannel r8, short r9, zu.d<? super tu.x0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeShort$suspendImpl(io.ktor.utils.io.ByteBufferChannel, short, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[PHI: r2 r7 r8 r9
      0x005c: PHI (r2v3 io.ktor.utils.io.ByteBufferChannel) = (r2v2 io.ktor.utils.io.ByteBufferChannel), (r2v6 io.ktor.utils.io.ByteBufferChannel) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r7v2 byte[]) = (r7v1 byte[]), (r7v6 byte[]) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r9v2 int) = (r9v1 int), (r9v5 int) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:21:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeSuspend(byte[] r7, int r8, int r9, zu.d<? super java.lang.Integer> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel.C40381
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$writeSuspend$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$1
            byte[] r9 = (byte[]) r9
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r10)
            r5 = r9
            r9 = r7
            r7 = r5
            goto L5c
        L47:
            tu.a0.throwOnFailure(r10)
            r2 = r6
        L4b:
            r0.L$0 = r2
            r0.L$1 = r7
            r0.I$0 = r8
            r0.I$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.tryWriteSuspend$ktor_io(r4, r0)
            if (r10 != r1) goto L5c
            goto L73
        L5c:
            io.ktor.utils.io.internal.JoiningState r10 = r2.joining
            if (r10 == 0) goto L75
            io.ktor.utils.io.ByteBufferChannel r10 = r2.resolveDelegation(r2, r10)
            if (r10 == 0) goto L75
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r10.writeSuspend(r7, r8, r9, r0)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            return r7
        L75:
            int r10 = r2.writeAsMuchAsPossible(r7, r8, r9)
            if (r10 <= 0) goto L4b
            java.lang.Integer r7 = bv.b.boxInt(r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeSuspend(byte[], int, int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeSuspendBlock(int i10, CancellableContinuation<? super x0> cancellableContinuation) throws Throwable {
        Throwable sendException;
        loop0: while (true) {
            ClosedElement closed = getClosed();
            if (closed != null && (sendException = closed.getSendException()) != null) {
                ByteBufferChannelKt.rethrowClosed(sendException);
                throw new k();
            }
            if (!writeSuspendPredicate(i10)) {
                int i11 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(x0.f87415a));
                break;
            }
            while (getWriteOp() == null) {
                if (!writeSuspendPredicate(i10)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _writeOp$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cancellableContinuation)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (writeSuspendPredicate(i10)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _writeOp$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, cancellableContinuation, null)) {
                    if (atomicReferenceFieldUpdater2.get(this) != cancellableContinuation) {
                        break loop0;
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        flushImpl(i10);
        if (shouldResumeReadOp()) {
            resumeReadOp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean writeSuspendPredicate(int i10) {
        JoiningState joiningState = this.joining;
        ReadWriteBufferState state = getState();
        if (getClosed() != null) {
            return false;
        }
        return joiningState == null ? state.capacity._availableForWrite$internal < i10 && state != ReadWriteBufferState.IdleEmpty.INSTANCE : (state == ReadWriteBufferState.Terminated.INSTANCE || (state instanceof ReadWriteBufferState.Writing) || (state instanceof ReadWriteBufferState.ReadingWriting)) ? false : true;
    }

    private final Object writeSuspendPrimitive(ByteBuffer byteBuffer, int i10, RingBufferCapacity ringBufferCapacity, l lVar, l lVar2, zu.d<? super x0> dVar) throws Throwable {
        x0 x0Var = x0.f87415a;
        do {
            try {
                b0.mark(0);
                writeSuspend(i10, dVar);
                b0.mark(1);
                if (this.joining != null) {
                    restoreStateAfterWrite$ktor_io();
                    JoiningState joiningState = this.joining;
                    e0.checkNotNull(joiningState);
                    if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                        lVar.invoke(joiningState.getDelegatedTo());
                    } else {
                        while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                            b0.mark(0);
                            writeSuspend(1, dVar);
                            b0.mark(1);
                        }
                        lVar.invoke(joiningState.getDelegatedTo());
                    }
                    return x0Var;
                }
            } finally {
                restoreStateAfterWrite$ktor_io();
                tryTerminate$ktor_io();
            }
        } while (!ringBufferCapacity.tryWriteExact(i10));
        prepareWriteBuffer$ktor_io(byteBuffer, i10);
        if (byteBuffer.remaining() < i10) {
            byteBuffer.limit(byteBuffer.capacity());
            lVar2.invoke(byteBuffer);
            carry(byteBuffer);
        } else {
            lVar2.invoke(byteBuffer);
        }
        bytesWritten(byteBuffer, ringBufferCapacity, i10);
        if (ringBufferCapacity.isFull() || getAutoFlush()) {
            flush();
        }
        return x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tu.x0] */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeSuspendSession$suspendImpl(io.ktor.utils.io.ByteBufferChannel r4, kv.p r5, zu.d<? super tu.x0> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteBufferChannel.C40401
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteBufferChannel$writeSuspendSession$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeSuspendSession$1 r0 = new io.ktor.utils.io.ByteBufferChannel$writeSuspendSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.internal.WriteSessionImpl r4 = (io.ktor.utils.io.internal.WriteSessionImpl) r4
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4a
        L2d:
            r5 = move-exception
            goto L50
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            tu.a0.throwOnFailure(r6)
            io.ktor.utils.io.internal.WriteSessionImpl r4 = r4.writeSession
            r4.begin()
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r4.complete()
            tu.x0 r4 = tu.x0.f87415a
            return r4
        L50:
            r4.complete()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeSuspendSession$suspendImpl(io.ktor.utils.io.ByteBufferChannel, kv.p, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object writeWhile$suspendImpl(ByteBufferChannel byteBufferChannel, l lVar, zu.d<? super x0> dVar) throws Throwable {
        boolean zWriteWhileNoSuspend = byteBufferChannel.writeWhileNoSuspend(lVar);
        x0 x0Var = x0.f87415a;
        if (!zWriteWhileNoSuspend) {
            return x0Var;
        }
        ClosedElement closed = byteBufferChannel.getClosed();
        if (closed == null) {
            Object objWriteWhileSuspend = byteBufferChannel.writeWhileSuspend(lVar, dVar);
            return objWriteWhileSuspend == e.getCOROUTINE_SUSPENDED() ? objWriteWhileSuspend : x0Var;
        }
        ByteBufferChannelKt.rethrowClosed(closed.getSendException());
        throw new k();
    }

    private final boolean writeWhileLoop(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, l lVar) {
        int iCapacity = byteBuffer.capacity() - this.reservedSize;
        boolean z10 = true;
        while (z10) {
            int iTryWriteAtLeast = ringBufferCapacity.tryWriteAtLeast(1);
            if (iTryWriteAtLeast == 0) {
                break;
            }
            int i10 = this.writePosition;
            int iCoerceAtMost = v.coerceAtMost(i10 + iTryWriteAtLeast, iCapacity);
            byteBuffer.limit(iCoerceAtMost);
            byteBuffer.position(i10);
            try {
                boolean zBooleanValue = ((Boolean) lVar.invoke(byteBuffer)).booleanValue();
                if (byteBuffer.limit() != iCoerceAtMost) {
                    throw new IllegalStateException("Buffer limit modified.");
                }
                int iPosition = byteBuffer.position() - i10;
                if (iPosition < 0) {
                    throw new IllegalStateException("Position has been moved backward: pushback is not supported.");
                }
                bytesWritten(byteBuffer, ringBufferCapacity, iPosition);
                if (iPosition < iTryWriteAtLeast) {
                    ringBufferCapacity.completeRead(iTryWriteAtLeast - iPosition);
                }
                z10 = zBooleanValue;
            } catch (Throwable th2) {
                ringBufferCapacity.completeRead(iTryWriteAtLeast);
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean writeWhileNoSuspend(kv.l r8) throws java.lang.Throwable {
        /*
            r7 = this;
            io.ktor.utils.io.internal.JoiningState r0 = r7.joining
            if (r0 == 0) goto La
            io.ktor.utils.io.ByteBufferChannel r0 = r7.resolveDelegation(r7, r0)
            if (r0 != 0) goto Lb
        La:
            r0 = r7
        Lb:
            java.nio.ByteBuffer r1 = r0.setupStateForWrite$ktor_io()
            if (r1 != 0) goto L13
            r8 = 1
            return r8
        L13:
            io.ktor.utils.io.internal.ReadWriteBufferState r2 = r0.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r2 = r2.capacity
            long r3 = r0.getTotalBytesWritten()
            io.ktor.utils.io.internal.ClosedElement r5 = r0.getClosed()     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L4e
            boolean r8 = r0.writeWhileLoop(r1, r2, r8)     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r2.isFull()
            if (r1 != 0) goto L33
            boolean r1 = r0.getAutoFlush()
            if (r1 == 0) goto L36
        L33:
            r0.flush()
        L36:
            if (r0 == r7) goto L45
            long r1 = r7.getTotalBytesWritten()
            long r5 = r0.getTotalBytesWritten()
            long r5 = r5 - r3
            long r5 = r5 + r1
            r7.setTotalBytesWritten$ktor_io(r5)
        L45:
            r0.restoreStateAfterWrite$ktor_io()
            r0.tryTerminate$ktor_io()
            return r8
        L4c:
            r8 = move-exception
            goto L5b
        L4e:
            java.lang.Throwable r8 = r5.getSendException()     // Catch: java.lang.Throwable -> L4c
            io.ktor.utils.io.ByteBufferChannelKt.access$rethrowClosed(r8)     // Catch: java.lang.Throwable -> L4c
            tu.k r8 = new tu.k     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            throw r8     // Catch: java.lang.Throwable -> L4c
        L5b:
            boolean r1 = r2.isFull()
            if (r1 != 0) goto L67
            boolean r1 = r0.getAutoFlush()
            if (r1 == 0) goto L6a
        L67:
            r0.flush()
        L6a:
            if (r0 == r7) goto L79
            long r1 = r7.getTotalBytesWritten()
            long r5 = r0.getTotalBytesWritten()
            long r5 = r5 - r3
            long r5 = r5 + r1
            r7.setTotalBytesWritten$ktor_io(r5)
        L79:
            r0.restoreStateAfterWrite$ktor_io()
            r0.tryTerminate$ktor_io()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeWhileNoSuspend(kv.l):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        if (r5.getClosed() != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:16:0x0061, B:38:0x00c9, B:40:0x00cd, B:42:0x00d3, B:43:0x00d7, B:34:0x00a7), top: B:79:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c7 -> B:38:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeWhileSuspend(kv.l r18, zu.d<? super tu.x0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeWhileSuspend(kv.l, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void writing(kv.q r9) throws java.lang.Throwable {
        /*
            r8 = this;
            io.ktor.utils.io.internal.JoiningState r0 = r8.joining
            if (r0 == 0) goto La
            io.ktor.utils.io.ByteBufferChannel r0 = r8.resolveDelegation(r8, r0)
            if (r0 != 0) goto Lb
        La:
            r0 = r8
        Lb:
            java.nio.ByteBuffer r1 = r0.setupStateForWrite$ktor_io()
            if (r1 != 0) goto L12
            return
        L12:
            io.ktor.utils.io.internal.ReadWriteBufferState r2 = r0.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r2 = r2.capacity
            long r3 = r0.getTotalBytesWritten()
            r5 = 1
            io.ktor.utils.io.internal.ClosedElement r6 = r0.getClosed()     // Catch: java.lang.Throwable -> L51
            if (r6 != 0) goto L53
            r9.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L51
            kotlin.jvm.internal.b0.finallyStart(r5)
            boolean r9 = r2.isFull()
            if (r9 != 0) goto L35
            boolean r9 = r0.getAutoFlush()
            if (r9 == 0) goto L38
        L35:
            r0.flush()
        L38:
            if (r0 == r8) goto L47
            long r1 = r8.getTotalBytesWritten()
            long r6 = r0.getTotalBytesWritten()
            long r6 = r6 - r3
            long r6 = r6 + r1
            r8.setTotalBytesWritten$ktor_io(r6)
        L47:
            r0.restoreStateAfterWrite$ktor_io()
            r0.tryTerminate$ktor_io()
            kotlin.jvm.internal.b0.finallyEnd(r5)
            return
        L51:
            r9 = move-exception
            goto L60
        L53:
            java.lang.Throwable r9 = r6.getSendException()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.ByteBufferChannelKt.access$rethrowClosed(r9)     // Catch: java.lang.Throwable -> L51
            tu.k r9 = new tu.k     // Catch: java.lang.Throwable -> L51
            r9.<init>()     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L51
        L60:
            kotlin.jvm.internal.b0.finallyStart(r5)
            boolean r1 = r2.isFull()
            if (r1 != 0) goto L6f
            boolean r1 = r0.getAutoFlush()
            if (r1 == 0) goto L72
        L6f:
            r0.flush()
        L72:
            if (r0 == r8) goto L81
            long r1 = r8.getTotalBytesWritten()
            long r6 = r0.getTotalBytesWritten()
            long r6 = r6 - r3
            long r6 = r6 + r1
            r8.setTotalBytesWritten$ktor_io(r6)
        L81:
            r0.restoreStateAfterWrite$ktor_io()
            r0.tryTerminate$ktor_io()
            kotlin.jvm.internal.b0.finallyEnd(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writing(kv.q):void");
    }

    @Override // io.ktor.utils.io.ByteChannel
    @tu.f
    public void attachJob(Job job) {
        e0.checkNotNullParameter(job, "job");
        Job job2 = this.attachedJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.attachedJob = job;
        Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new AnonymousClass1(), 2, null);
    }

    @Override // io.ktor.utils.io.LookAheadSuspendSession
    public final Object awaitAtLeast(int i10, zu.d<? super Boolean> dVar) throws Throwable {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "atLeast parameter shouldn't be negative: ").toString());
        }
        if (i10 > 4088) {
            throw new IllegalArgumentException(a.b.e(i10, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
        }
        if (getState().capacity._availableForRead$internal < i10) {
            return (getState().getIdle() || (getState() instanceof ReadWriteBufferState.Writing)) ? awaitAtLeastSuspend(i10, dVar) : i10 == 1 ? readSuspendImpl(1, dVar) : readSuspend(i10, dVar);
        }
        if (getState().getIdle() || (getState() instanceof ReadWriteBufferState.Writing)) {
            setupStateForRead();
        }
        return b.boxBoolean(true);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object awaitContent(zu.d<? super x0> dVar) {
        return awaitContent$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object awaitFreeSpace(zu.d<? super x0> dVar) {
        return awaitFreeSpace$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.HasWriteSession
    public WriterSuspendSession beginWriteSession() {
        WriteSessionImpl writeSessionImpl = this.writeSession;
        writeSessionImpl.begin();
        return writeSessionImpl;
    }

    public final void bytesWrittenFromSession$ktor_io(ByteBuffer buffer, RingBufferCapacity capacity, int i10) {
        e0.checkNotNullParameter(buffer, "buffer");
        e0.checkNotNullParameter(capacity, "capacity");
        bytesWritten(buffer, capacity, i10);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean cancel(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel has been cancelled");
        }
        return close(th2);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean close(Throwable th2) {
        JoiningState joiningState;
        if (getClosed() != null) {
            return false;
        }
        ClosedElement emptyCause = th2 == null ? ClosedElement.Companion.getEmptyCause() : new ClosedElement(th2);
        getState().capacity.flush();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closed$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, emptyCause)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        getState().capacity.flush();
        if (getState().capacity.isEmpty() || th2 != null) {
            tryTerminate$ktor_io();
        }
        resumeClosed(th2);
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE && (joiningState = this.joining) != null) {
            ensureClosedJoined(joiningState);
        }
        if (th2 == null) {
            this.writeSuspendContinuationCache.close(new ClosedWriteChannelException(ByteBufferChannelKt.DEFAULT_CLOSE_MESSAGE));
            this.readSuspendContinuationCache.close((CancellableReusableContinuation<Boolean>) Boolean.valueOf(getState().capacity.flush()));
            return true;
        }
        Job job = this.attachedJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.readSuspendContinuationCache.close(th2);
        this.writeSuspendContinuationCache.close(th2);
        return true;
    }

    @Override // io.ktor.utils.io.LookAheadSession
    /* renamed from: consumed */
    public void mo4580consumed(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ReadWriteBufferState state = getState();
        if (!state.capacity.tryReadExact(i10)) {
            throw new IllegalStateException(o2.k(i10, "Unable to consume ", " bytes: not enough available bytes"));
        }
        if (i10 > 0) {
            bytesRead(state.getReadBuffer(), state.capacity, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0151, code lost:
    
        r4 = r27;
        r7 = r30;
        r14 = r15;
        r12 = r16;
        r8 = r18;
        r27 = r19;
        r11 = r22;
        r16 = r0;
        r15 = r1;
        r0 = r2;
        r2 = r3;
        r3 = r21;
     */
    /* JADX WARN: Path cross not found for [B:136:0x02ed, B:141:0x02f9], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:141:0x02f9, B:136:0x02ed], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:147:0x031b, B:153:0x033a], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:153:0x033a, B:147:0x031b], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ed A[Catch: all -> 0x02f4, TryCatch #10 {all -> 0x02f4, blocks: (B:134:0x02e7, B:136:0x02ed, B:143:0x02fe, B:144:0x030d, B:141:0x02f9), top: B:222:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fe A[Catch: all -> 0x02f4, TryCatch #10 {all -> 0x02f4, blocks: (B:134:0x02e7, B:136:0x02ed, B:143:0x02fe, B:144:0x030d, B:141:0x02f9), top: B:222:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031b A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0340 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039c A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03de A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e4 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e9 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ff A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157 A[Catch: all -> 0x01c8, TryCatch #4 {all -> 0x01c8, blocks: (B:63:0x0151, B:65:0x0157, B:67:0x015b), top: B:210:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1 A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #7 {all -> 0x01b0, blocks: (B:74:0x019d, B:76:0x01a1), top: B:216:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206 A[Catch: all -> 0x02c7, TRY_LEAVE, TryCatch #2 {all -> 0x02c7, blocks: (B:87:0x01e7, B:91:0x0206), top: B:206:0x01e7 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x032f -> B:49:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x039a -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x03bd -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copyDirect$ktor_io(io.ktor.utils.io.ByteBufferChannel r27, long r28, io.ktor.utils.io.internal.JoiningState r30, zu.d<? super java.lang.Long> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.copyDirect$ktor_io(io.ktor.utils.io.ByteBufferChannel, long, io.ktor.utils.io.internal.JoiningState, zu.d):java.lang.Object");
    }

    public final ReadWriteBufferState currentState$ktor_io() {
        return getState();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object discard(long j10, zu.d<? super Long> dVar) {
        return discard$suspendImpl(this, j10, dVar);
    }

    @Override // io.ktor.utils.io.HasReadSession
    public void endReadSession() {
        this.readSession.completed();
        ReadWriteBufferState state = getState();
        if ((state instanceof ReadWriteBufferState.Reading) || (state instanceof ReadWriteBufferState.ReadingWriting)) {
            restoreStateAfterRead();
            tryTerminate$ktor_io();
        }
    }

    @Override // io.ktor.utils.io.HasWriteSession
    public void endWriteSession(int i10) {
        this.writeSession.written(i10);
        this.writeSession.complete();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void flush() {
        flushImpl(1);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public int getAvailableForRead() {
        return getState().capacity._availableForRead$internal;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public int getAvailableForWrite() {
        return getState().capacity._availableForWrite$internal;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        ClosedElement closed = getClosed();
        if (closed != null) {
            return closed.getCause();
        }
        return null;
    }

    public final JoiningState getJoining$ktor_io() {
        return this.joining;
    }

    public final int getReservedSize$ktor_io() {
        return this.reservedSize;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return getState() == ReadWriteBufferState.Terminated.INSTANCE && getClosed() != null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return getClosed() != null;
    }

    public final Object joinFrom$ktor_io(ByteBufferChannel byteBufferChannel, boolean z10, zu.d<? super x0> dVar) throws Throwable {
        ClosedElement closed = byteBufferChannel.getClosed();
        x0 x0Var = x0.f87415a;
        if (closed != null && byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            if (z10) {
                ClosedElement closed2 = byteBufferChannel.getClosed();
                e0.checkNotNull(closed2);
                close(closed2.getCause());
            }
            return x0Var;
        }
        ClosedElement closed3 = getClosed();
        if (closed3 != null) {
            if (byteBufferChannel.getClosed() != null) {
                return x0Var;
            }
            ByteBufferChannelKt.rethrowClosed(closed3.getSendException());
            throw new k();
        }
        JoiningState joiningState = byteBufferChannel.setupDelegateTo(this, z10);
        if (byteBufferChannel.tryCompleteJoining(joiningState)) {
            Object objAwaitClose = byteBufferChannel.awaitClose(dVar);
            return objAwaitClose == e.getCOROUTINE_SUSPENDED() ? objAwaitClose : x0Var;
        }
        Object objJoinFromSuspend = joinFromSuspend(byteBufferChannel, z10, joiningState, dVar);
        return objJoinFromSuspend == e.getCOROUTINE_SUSPENDED() ? objJoinFromSuspend : x0Var;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    @tu.f
    public <R> R lookAhead(l visitor) {
        e0.checkNotNullParameter(visitor, "visitor");
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            return (R) visitor.invoke(new FailedLookAhead(closedCause));
        }
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            return (R) visitor.invoke(TerminatedLookAhead.INSTANCE);
        }
        boolean z10 = false;
        R r10 = null;
        if (setupStateForRead() != null) {
            try {
                if (getState().capacity._availableForRead$internal != 0) {
                    r10 = (R) visitor.invoke(this);
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                    z10 = true;
                }
            } finally {
                restoreStateAfterRead();
                tryTerminate$ktor_io();
            }
        }
        if (z10) {
            e0.checkNotNull(r10);
            return r10;
        }
        Throwable closedCause2 = getClosedCause();
        return closedCause2 != null ? (R) visitor.invoke(new FailedLookAhead(closedCause2)) : (R) visitor.invoke(TerminatedLookAhead.INSTANCE);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    @tu.f
    public <R> Object lookAheadSuspend(p pVar, zu.d<? super R> dVar) {
        return lookAheadSuspend$suspendImpl(this, pVar, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    /* renamed from: peekTo-lBXzO7A, reason: not valid java name */
    public Object mo4303peekTolBXzO7A(ByteBuffer byteBuffer, long j10, long j11, long j12, long j13, zu.d<? super Long> dVar) {
        return m4301peekTolBXzO7A$suspendImpl(this, byteBuffer, j10, j11, j12, j13, dVar);
    }

    public final void prepareWriteBuffer$ktor_io(ByteBuffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "buffer");
        prepareBuffer(buffer, this.writePosition, i10);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object read(int i10, l lVar, zu.d<? super x0> dVar) {
        return read$suspendImpl(this, i10, lVar, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readAvailable(ChunkBuffer chunkBuffer, zu.d<? super Integer> dVar) {
        return readAvailable$suspendImpl(this, chunkBuffer, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readBoolean(zu.d<? super java.lang.Boolean> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteBufferChannel.C40081
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteBufferChannel$readBoolean$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40081) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readBoolean$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readBoolean$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = r4.readByte(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            byte r5 = r5.byteValue()
            if (r5 == 0) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readBoolean(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0097 -> B:42:0x009a). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readByte(zu.d<? super java.lang.Byte> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel.C40091
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$readByte$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readByte$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readByte$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r10)
            goto L9a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            tu.a0.throwOnFailure(r10)
            r4 = r9
            r2 = r3
        L3d:
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.setupStateForRead()
            r6 = 0
            if (r5 != 0) goto L4a
            goto L7d
        L4a:
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6c
            if (r8 != 0) goto L5b
        L54:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            goto L7d
        L5b:
            boolean r8 = r7.tryReadExact(r2)     // Catch: java.lang.Throwable -> L6c
            if (r8 != 0) goto L62
            goto L54
        L62:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6c
            if (r6 >= r2) goto L6e
            r4.rollBytes(r5, r2)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r10 = move-exception
            goto Lb1
        L6e:
            byte r6 = r5.get()     // Catch: java.lang.Throwable -> L6c
            java.lang.Byte r6 = bv.b.boxByte(r6)     // Catch: java.lang.Throwable -> L6c
            r10.f71816b = r6     // Catch: java.lang.Throwable -> L6c
            r4.bytesRead(r5, r7, r2)     // Catch: java.lang.Throwable -> L6c
            r6 = r3
            goto L54
        L7d:
            if (r6 == 0) goto L8d
            java.lang.Object r10 = r10.f71816b
            if (r10 != 0) goto L8a
            java.lang.String r10 = "result"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r10)
            r10 = 0
            return r10
        L8a:
            java.lang.Number r10 = (java.lang.Number) r10
            return r10
        L8d:
            r0.L$0 = r4
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r10 = r4.readSuspend(r2, r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La3
            goto L3d
        La3:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = p0.o2.k(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        Lb1:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readByte(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a5 -> B:42:0x00a8). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDouble(zu.d<? super java.lang.Double> r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteBufferChannel.C40101
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteBufferChannel$readDouble$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readDouble$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readDouble$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r11)
            goto La8
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            tu.a0.throwOnFailure(r11)
            r11 = 8
            r4 = r10
            r2 = r11
        L3f:
            kotlin.jvm.internal.b1 r11 = new kotlin.jvm.internal.b1
            r11.<init>()
            java.nio.ByteBuffer r5 = r4.setupStateForRead()
            r6 = 0
            if (r5 != 0) goto L4c
            goto L7f
        L4c:
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L5d
        L56:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            goto L7f
        L5d:
            boolean r8 = r7.tryReadExact(r2)     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L64
            goto L56
        L64:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6e
            if (r6 >= r2) goto L70
            r4.rollBytes(r5, r2)     // Catch: java.lang.Throwable -> L6e
            goto L70
        L6e:
            r11 = move-exception
            goto Lbf
        L70:
            long r8 = r5.getLong()     // Catch: java.lang.Throwable -> L6e
            java.lang.Long r6 = bv.b.boxLong(r8)     // Catch: java.lang.Throwable -> L6e
            r11.f71816b = r6     // Catch: java.lang.Throwable -> L6e
            r4.bytesRead(r5, r7, r2)     // Catch: java.lang.Throwable -> L6e
            r6 = r3
            goto L56
        L7f:
            if (r6 == 0) goto L9b
            java.lang.Object r11 = r11.f71816b
            if (r11 != 0) goto L8c
            java.lang.String r11 = "result"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r11)
            r11 = 0
            goto L8e
        L8c:
            java.lang.Number r11 = (java.lang.Number) r11
        L8e:
            long r0 = r11.longValue()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r11 = bv.b.boxDouble(r0)
            return r11
        L9b:
            r0.L$0 = r4
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r11 = r4.readSuspend(r2, r0)
            if (r11 != r1) goto La8
            return r1
        La8:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lb1
            goto L3f
        Lb1:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r11 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = p0.o2.k(r2, r0, r1)
            r11.<init>(r0)
            throw r11
        Lbf:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readDouble(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a4 -> B:42:0x00a7). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFloat(zu.d<? super java.lang.Float> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel.C40111
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$readFloat$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readFloat$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readFloat$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r10)
            goto La7
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            tu.a0.throwOnFailure(r10)
            r10 = 4
            r4 = r9
            r2 = r10
        L3e:
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.setupStateForRead()
            r6 = 0
            if (r5 != 0) goto L4b
            goto L7e
        L4b:
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L5c
        L55:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            goto L7e
        L5c:
            boolean r8 = r7.tryReadExact(r2)     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L63
            goto L55
        L63:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6d
            if (r6 >= r2) goto L6f
            r4.rollBytes(r5, r2)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto Lbe
        L6f:
            int r6 = r5.getInt()     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r6 = bv.b.boxInt(r6)     // Catch: java.lang.Throwable -> L6d
            r10.f71816b = r6     // Catch: java.lang.Throwable -> L6d
            r4.bytesRead(r5, r7, r2)     // Catch: java.lang.Throwable -> L6d
            r6 = r3
            goto L55
        L7e:
            if (r6 == 0) goto L9a
            java.lang.Object r10 = r10.f71816b
            if (r10 != 0) goto L8b
            java.lang.String r10 = "result"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r10)
            r10 = 0
            goto L8d
        L8b:
            java.lang.Number r10 = (java.lang.Number) r10
        L8d:
            int r10 = r10.intValue()
            float r10 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Float r10 = bv.b.boxFloat(r10)
            return r10
        L9a:
            r0.L$0 = r4
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r10 = r4.readSuspend(r2, r0)
            if (r10 != r1) goto La7
            return r1
        La7:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb0
            goto L3e
        Lb0:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = p0.o2.k(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        Lbe:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readFloat(zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readFully(ChunkBuffer chunkBuffer, int i10, zu.d<? super x0> dVar) {
        return readFully$suspendImpl(this, chunkBuffer, i10, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0098 -> B:42:0x009b). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readInt(zu.d<? super java.lang.Integer> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel.C40151
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$readInt$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readInt$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readInt$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r10)
            goto L9b
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            tu.a0.throwOnFailure(r10)
            r10 = 4
            r4 = r9
            r2 = r10
        L3e:
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.setupStateForRead()
            r6 = 0
            if (r5 != 0) goto L4b
            goto L7e
        L4b:
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L5c
        L55:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            goto L7e
        L5c:
            boolean r8 = r7.tryReadExact(r2)     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L63
            goto L55
        L63:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6d
            if (r6 >= r2) goto L6f
            r4.rollBytes(r5, r2)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto Lb2
        L6f:
            int r6 = r5.getInt()     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r6 = bv.b.boxInt(r6)     // Catch: java.lang.Throwable -> L6d
            r10.f71816b = r6     // Catch: java.lang.Throwable -> L6d
            r4.bytesRead(r5, r7, r2)     // Catch: java.lang.Throwable -> L6d
            r6 = r3
            goto L55
        L7e:
            if (r6 == 0) goto L8e
            java.lang.Object r10 = r10.f71816b
            if (r10 != 0) goto L8b
            java.lang.String r10 = "result"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r10)
            r10 = 0
            return r10
        L8b:
            java.lang.Number r10 = (java.lang.Number) r10
            return r10
        L8e:
            r0.L$0 = r4
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r10 = r4.readSuspend(r2, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La4
            goto L3e
        La4:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = p0.o2.k(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        Lb2:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readInt(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0099 -> B:42:0x009c). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readLong(zu.d<? super java.lang.Long> r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteBufferChannel.C40161
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteBufferChannel$readLong$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readLong$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readLong$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r11)
            goto L9c
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            tu.a0.throwOnFailure(r11)
            r11 = 8
            r4 = r10
            r2 = r11
        L3f:
            kotlin.jvm.internal.b1 r11 = new kotlin.jvm.internal.b1
            r11.<init>()
            java.nio.ByteBuffer r5 = r4.setupStateForRead()
            r6 = 0
            if (r5 != 0) goto L4c
            goto L7f
        L4c:
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L5d
        L56:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            goto L7f
        L5d:
            boolean r8 = r7.tryReadExact(r2)     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L64
            goto L56
        L64:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6e
            if (r6 >= r2) goto L70
            r4.rollBytes(r5, r2)     // Catch: java.lang.Throwable -> L6e
            goto L70
        L6e:
            r11 = move-exception
            goto Lb3
        L70:
            long r8 = r5.getLong()     // Catch: java.lang.Throwable -> L6e
            java.lang.Long r6 = bv.b.boxLong(r8)     // Catch: java.lang.Throwable -> L6e
            r11.f71816b = r6     // Catch: java.lang.Throwable -> L6e
            r4.bytesRead(r5, r7, r2)     // Catch: java.lang.Throwable -> L6e
            r6 = r3
            goto L56
        L7f:
            if (r6 == 0) goto L8f
            java.lang.Object r11 = r11.f71816b
            if (r11 != 0) goto L8c
            java.lang.String r11 = "result"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r11)
            r11 = 0
            return r11
        L8c:
            java.lang.Number r11 = (java.lang.Number) r11
            return r11
        L8f:
            r0.L$0 = r4
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r11 = r4.readSuspend(r2, r0)
            if (r11 != r1) goto L9c
            return r1
        L9c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La5
            goto L3f
        La5:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r11 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = p0.o2.k(r2, r0, r1)
            r11.<init>(r0)
            throw r11
        Lb3:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readLong(zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readPacket(int i10, zu.d<? super ByteReadPacket> dVar) {
        return readPacket$suspendImpl(this, i10, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readRemaining(long j10, zu.d<? super ByteReadPacket> dVar) {
        return readRemaining$suspendImpl(this, j10, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    @tu.f
    public void readSession(l consumer) {
        e0.checkNotNullParameter(consumer, "consumer");
        lookAhead(new C40191(consumer, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0098 -> B:42:0x009b). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readShort(zu.d<? super java.lang.Short> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel.C40201
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$readShort$1 r0 = (io.ktor.utils.io.ByteBufferChannel.C40201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readShort$1 r0 = new io.ktor.utils.io.ByteBufferChannel$readShort$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r10)
            goto L9b
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            tu.a0.throwOnFailure(r10)
            r10 = 2
            r4 = r9
            r2 = r10
        L3e:
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.setupStateForRead()
            r6 = 0
            if (r5 != 0) goto L4b
            goto L7e
        L4b:
            io.ktor.utils.io.internal.ReadWriteBufferState r7 = r4.getState()
            io.ktor.utils.io.internal.RingBufferCapacity r7 = r7.capacity
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L5c
        L55:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            goto L7e
        L5c:
            boolean r8 = r7.tryReadExact(r2)     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L63
            goto L55
        L63:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6d
            if (r6 >= r2) goto L6f
            r4.rollBytes(r5, r2)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto Lb2
        L6f:
            short r6 = r5.getShort()     // Catch: java.lang.Throwable -> L6d
            java.lang.Short r6 = bv.b.boxShort(r6)     // Catch: java.lang.Throwable -> L6d
            r10.f71816b = r6     // Catch: java.lang.Throwable -> L6d
            r4.bytesRead(r5, r7, r2)     // Catch: java.lang.Throwable -> L6d
            r6 = r3
            goto L55
        L7e:
            if (r6 == 0) goto L8e
            java.lang.Object r10 = r10.f71816b
            if (r10 != 0) goto L8b
            java.lang.String r10 = "result"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r10)
            r10 = 0
            return r10
        L8b:
            java.lang.Number r10 = (java.lang.Number) r10
            return r10
        L8e:
            r0.L$0 = r4
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r10 = r4.readSuspend(r2, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La4
            goto L3e
        La4:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = p0.o2.k(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        Lb2:
            r4.restoreStateAfterRead()
            r4.tryTerminate$ktor_io()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readShort(zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    @tu.f
    public Object readSuspendableSession(p pVar, zu.d<? super x0> dVar) {
        return readSuspendableSession$suspendImpl(this, pVar, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readUTF8Line(int i10, zu.d<? super String> dVar) {
        return readUTF8Line$suspendImpl(this, i10, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public <A extends Appendable> Object readUTF8LineTo(A a10, int i10, zu.d<? super Boolean> dVar) {
        return readUTF8LineToAscii(a10, i10, dVar);
    }

    @Override // io.ktor.utils.io.LookAheadSession
    public ByteBuffer request(int i10, int i11) {
        ReadWriteBufferState state = getState();
        int i12 = state.capacity._availableForRead$internal;
        int i13 = this.readPosition;
        if (i12 < i11 + i10) {
            return null;
        }
        if (state.getIdle() || !((state instanceof ReadWriteBufferState.Reading) || (state instanceof ReadWriteBufferState.ReadingWriting))) {
            if (setupStateForRead() == null) {
                return null;
            }
            return request(i10, i11);
        }
        ByteBuffer readBuffer = state.getReadBuffer();
        prepareBuffer(readBuffer, carryIndex(readBuffer, i13 + i10), i12 - i10);
        if (readBuffer.remaining() >= i11) {
            return readBuffer;
        }
        return null;
    }

    public final ByteBufferChannel resolveChannelInstance$ktor_io() {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        return (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) ? this : byteBufferChannelResolveDelegation;
    }

    public final void restoreStateAfterWrite$ktor_io() {
        ReadWriteBufferState readWriteBufferStateStopWriting$ktor_io;
        ReadWriteBufferState.IdleNonEmpty idleNonEmpty;
        ReadWriteBufferState readWriteBufferState = null;
        loop0: while (true) {
            Object obj = this._state;
            readWriteBufferStateStopWriting$ktor_io = ((ReadWriteBufferState) obj).stopWriting$ktor_io();
            if ((readWriteBufferStateStopWriting$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && readWriteBufferStateStopWriting$ktor_io.capacity.isEmpty()) {
                readWriteBufferStateStopWriting$ktor_io = ReadWriteBufferState.IdleEmpty.INSTANCE;
                readWriteBufferState = readWriteBufferStateStopWriting$ktor_io;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, readWriteBufferStateStopWriting$ktor_io)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        if (readWriteBufferStateStopWriting$ktor_io != ReadWriteBufferState.IdleEmpty.INSTANCE || (idleNonEmpty = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState) == null) {
            return;
        }
        releaseBuffer(idleNonEmpty.getInitial());
    }

    public void setTotalBytesRead$ktor_io(long j10) {
        this.totalBytesRead = j10;
    }

    public void setTotalBytesWritten$ktor_io(long j10) {
        this.totalBytesWritten = j10;
    }

    public final ByteBuffer setupStateForWrite$ktor_io() throws Throwable {
        ReadWriteBufferState readWriteBufferStateStartWriting$ktor_io;
        ReadWriteBufferState.Initial initial;
        zu.d<x0> writeOp = getWriteOp();
        if (writeOp != null) {
            throw new IllegalStateException("Write operation is already in progress: " + writeOp);
        }
        ReadWriteBufferState readWriteBufferState = null;
        ReadWriteBufferState.Initial initialNewBuffer = null;
        while (true) {
            Object obj = this._state;
            ReadWriteBufferState readWriteBufferState2 = (ReadWriteBufferState) obj;
            if (this.joining != null) {
                if (initialNewBuffer != null) {
                    releaseBuffer(initialNewBuffer);
                }
                return null;
            }
            if (getClosed() != null) {
                if (initialNewBuffer != null) {
                    releaseBuffer(initialNewBuffer);
                }
                ClosedElement closed = getClosed();
                e0.checkNotNull(closed);
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new k();
            }
            if (readWriteBufferState2 == ReadWriteBufferState.IdleEmpty.INSTANCE) {
                if (initialNewBuffer == null) {
                    initialNewBuffer = newBuffer();
                }
                readWriteBufferStateStartWriting$ktor_io = initialNewBuffer.startWriting$ktor_io();
            } else {
                if (readWriteBufferState2 == ReadWriteBufferState.Terminated.INSTANCE) {
                    if (initialNewBuffer != null) {
                        releaseBuffer(initialNewBuffer);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    ClosedElement closed2 = getClosed();
                    e0.checkNotNull(closed2);
                    ByteBufferChannelKt.rethrowClosed(closed2.getSendException());
                    throw new k();
                }
                readWriteBufferStateStartWriting$ktor_io = readWriteBufferState2.startWriting$ktor_io();
            }
            ReadWriteBufferState readWriteBufferState3 = readWriteBufferStateStartWriting$ktor_io;
            initial = initialNewBuffer;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, readWriteBufferState3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (getClosed() != null) {
                restoreStateAfterWrite$ktor_io();
                tryTerminate$ktor_io();
                ClosedElement closed3 = getClosed();
                e0.checkNotNull(closed3);
                ByteBufferChannelKt.rethrowClosed(closed3.getSendException());
                throw new k();
            }
            ByteBuffer writeBuffer = readWriteBufferState3.getWriteBuffer();
            if (initial != null) {
                if (readWriteBufferState2 == null) {
                    e0.throwUninitializedPropertyAccessException("old");
                } else {
                    readWriteBufferState = readWriteBufferState2;
                }
                if (readWriteBufferState != ReadWriteBufferState.IdleEmpty.INSTANCE) {
                    releaseBuffer(initial);
                }
            }
            prepareBuffer(writeBuffer, this.writePosition, readWriteBufferState3.capacity._availableForWrite$internal);
            return writeBuffer;
            initialNewBuffer = initial;
        }
    }

    @Override // io.ktor.utils.io.HasReadSession
    public SuspendableReadSession startReadSession() {
        return this.readSession;
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + getState() + ')';
    }

    public final boolean tryTerminate$ktor_io() {
        if (getClosed() == null || !tryReleaseBuffer(false)) {
            return false;
        }
        JoiningState joiningState = this.joining;
        if (joiningState != null) {
            ensureClosedJoined(joiningState);
        }
        resumeReadOp();
        resumeWriteOp();
        return true;
    }

    public final Object tryWriteSuspend$ktor_io(int i10, zu.d<? super x0> dVar) throws Throwable {
        Throwable sendException;
        x0 x0Var = x0.f87415a;
        if (!writeSuspendPredicate(i10)) {
            ClosedElement closed = getClosed();
            if (closed == null || (sendException = closed.getSendException()) == null) {
                return x0Var;
            }
            ByteBufferChannelKt.rethrowClosed(sendException);
            throw new k();
        }
        this.writeSuspensionSize = i10;
        if (this.attachedJob != null) {
            Object objInvoke = this.writeSuspension.invoke(dVar);
            if (objInvoke == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0Var;
        }
        CancellableReusableContinuation<x0> cancellableReusableContinuation = this.writeSuspendContinuationCache;
        this.writeSuspension.invoke(cancellableReusableContinuation);
        Object objCompleteSuspendBlock = cancellableReusableContinuation.completeSuspendBlock(av.b.intercepted(dVar));
        if (objCompleteSuspendBlock == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return objCompleteSuspendBlock == e.getCOROUTINE_SUSPENDED() ? objCompleteSuspendBlock : x0Var;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object write(int i10, l lVar, zu.d<? super x0> dVar) {
        return write$suspendImpl(this, i10, lVar, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeAvailable(ChunkBuffer chunkBuffer, zu.d<? super Integer> dVar) {
        return writeAvailable$suspendImpl(this, chunkBuffer, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeByte(byte b10, zu.d<? super x0> dVar) {
        return writeByte$suspendImpl(this, b10, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeDouble(double d10, zu.d<? super x0> dVar) {
        return writeDouble$suspendImpl(this, d10, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeFloat(float f10, zu.d<? super x0> dVar) {
        return writeFloat$suspendImpl(this, f10, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeFully(Buffer buffer, zu.d<? super x0> dVar) {
        return writeFully$suspendImpl(this, buffer, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    /* renamed from: writeFully-JT6ljtQ, reason: not valid java name */
    public Object mo4304writeFullyJT6ljtQ(ByteBuffer byteBuffer, int i10, int i11, zu.d<? super x0> dVar) {
        return m4302writeFullyJT6ljtQ$suspendImpl(this, byteBuffer, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeInt(int i10, zu.d<? super x0> dVar) {
        return writeInt$suspendImpl(this, i10, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeLong(long j10, zu.d<? super x0> dVar) {
        return writeLong$suspendImpl(this, j10, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writePacket(ByteReadPacket byteReadPacket, zu.d<? super x0> dVar) {
        return writePacket$suspendImpl(this, byteReadPacket, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeShort(short s10, zu.d<? super x0> dVar) {
        return writeShort$suspendImpl(this, s10, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    @tu.f
    public Object writeSuspendSession(p pVar, zu.d<? super x0> dVar) {
        return writeSuspendSession$suspendImpl(this, pVar, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeWhile(l lVar, zu.d<? super x0> dVar) {
        return writeWhile$suspendImpl(this, lVar, dVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteBufferChannel$readSuspendableSession$2", f = "ByteBufferChannel.kt", i = {}, l = {1630}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendableSession$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40232 extends n implements p {
        final /* synthetic */ p $consumer;
        int label;
        final /* synthetic */ ByteBufferChannel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40232(p pVar, ByteBufferChannel byteBufferChannel, zu.d<? super C40232> dVar) {
            super(2, dVar);
            this.$consumer = pVar;
            this.this$0 = byteBufferChannel;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C40232(this.$consumer, this.this$0, dVar);
        }

        @Override // kv.p
        public final Object invoke(LookAheadSuspendSession lookAheadSuspendSession, zu.d<? super x0> dVar) {
            return ((C40232) create(lookAheadSuspendSession, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException(TJzY.QLczdvRx);
                    }
                } else {
                    a0.throwOnFailure(obj);
                    p pVar = this.$consumer;
                    ReadSessionImpl readSessionImpl = this.this$0.readSession;
                    this.label = 1;
                    if (pVar.invoke(readSessionImpl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.this$0.readSession.completed();
                return x0.f87415a;
            } catch (Throwable th2) {
                this.this$0.readSession.completed();
                throw th2;
            }
        }
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readAvailable(ByteBuffer byteBuffer, zu.d<? super Integer> dVar) {
        return readAvailable$suspendImpl(this, byteBuffer, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object readFully(byte[] bArr, int i10, int i11, zu.d<? super x0> dVar) throws Throwable {
        Object fullySuspend;
        int asMuchAsPossible = readAsMuchAsPossible(bArr, i10, i11);
        return (asMuchAsPossible >= i11 || (fullySuspend = readFullySuspend(bArr, i10 + asMuchAsPossible, i11 - asMuchAsPossible, dVar)) != e.getCOROUTINE_SUSPENDED()) ? x0.f87415a : fullySuspend;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeAvailable(ByteBuffer byteBuffer, zu.d<? super Integer> dVar) {
        return writeAvailable$suspendImpl(this, byteBuffer, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeFully(ByteBuffer byteBuffer, zu.d<? super x0> dVar) {
        return writeFully$suspendImpl(this, byteBuffer, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readAvailable(byte[] bArr, int i10, int i11, zu.d<? super Integer> dVar) {
        return readAvailable$suspendImpl(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeAvailable(byte[] bArr, int i10, int i11, zu.d<? super Integer> dVar) {
        return writeAvailable$suspendImpl(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeFully(byte[] bArr, int i10, int i11, zu.d<? super x0> dVar) {
        return writeFully$suspendImpl(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public int readAvailable(int i10, l block) throws Throwable {
        int i11;
        e0.checkNotNullParameter(block, "block");
        if (i10 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i10 <= 4088) {
            ByteBuffer byteBuffer = setupStateForRead();
            boolean z10 = false;
            if (byteBuffer == null) {
                i11 = 0;
            } else {
                RingBufferCapacity ringBufferCapacity = getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal == 0) {
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        i11 = 0;
                    } else {
                        int iTryReadAtLeast = ringBufferCapacity.tryReadAtLeast(i10);
                        if (iTryReadAtLeast <= 0 || iTryReadAtLeast < i10) {
                            i11 = 0;
                        } else {
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit();
                            block.invoke(byteBuffer);
                            if (iLimit == byteBuffer.limit()) {
                                int iPosition2 = byteBuffer.position() - iPosition;
                                if (iPosition2 >= 0) {
                                    bytesRead(byteBuffer, ringBufferCapacity, iPosition2);
                                    if (iPosition2 < iTryReadAtLeast) {
                                        ringBufferCapacity.completeWrite(iTryReadAtLeast - iPosition2);
                                        ringBufferCapacity.flush();
                                    }
                                    z10 = true;
                                    i11 = iPosition2;
                                } else {
                                    throw new IllegalStateException("Position shouldn't been moved backwards.");
                                }
                            } else {
                                throw new IllegalStateException("Buffer limit shouldn't be modified.");
                            }
                        }
                    }
                } finally {
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                }
            }
            if (z10) {
                return i11;
            }
            return -1;
        }
        throw new IllegalArgumentException(o2.k(i10, "Min(", ") shouldn't be greater than 4088").toString());
    }

    /* JADX WARN: Finally extract failed */
    @Override // io.ktor.utils.io.ByteWriteChannel
    public int writeAvailable(int i10, l block) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        int i11;
        int i12;
        e0.checkNotNullParameter(block, "block");
        if (i10 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i10 <= 4088) {
            JoiningState joiningState = this.joining;
            if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
                byteBufferChannelResolveDelegation = this;
            }
            ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
            int iPosition = 0;
            if (byteBuffer == null) {
                i12 = 0;
            } else {
                RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
                long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
                try {
                    ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
                    if (closed != null) {
                        ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                        throw new k();
                    }
                    int iTryWriteAtLeast = ringBufferCapacity.tryWriteAtLeast(i10);
                    if (iTryWriteAtLeast <= 0) {
                        i11 = 0;
                    } else {
                        byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.writePosition, iTryWriteAtLeast);
                        int iPosition2 = byteBuffer.position();
                        int iLimit = byteBuffer.limit();
                        block.invoke(byteBuffer);
                        if (iLimit == byteBuffer.limit()) {
                            iPosition = byteBuffer.position() - iPosition2;
                            if (iPosition < 0) {
                                throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                            }
                            if (iPosition >= 0) {
                                byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, iPosition);
                                if (iPosition < iTryWriteAtLeast) {
                                    ringBufferCapacity.completeRead(iTryWriteAtLeast - iPosition);
                                }
                                i11 = 1;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            throw new IllegalStateException("Buffer limit modified");
                        }
                    }
                    if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                        byteBufferChannelResolveDelegation.flush();
                    }
                    if (byteBufferChannelResolveDelegation != this) {
                        setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
                    }
                    byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
                    byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
                    int i13 = iPosition;
                    iPosition = i11;
                    i12 = i13;
                } catch (Throwable th2) {
                    if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                        byteBufferChannelResolveDelegation.flush();
                    }
                    if (byteBufferChannelResolveDelegation != this) {
                        setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
                    }
                    byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
                    byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
                    throw th2;
                }
            }
            if (iPosition == 0) {
                return -1;
            }
            return i12;
        }
        throw new IllegalArgumentException(o2.k(i10, "Min(", ") shouldn't be greater than 4088").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAvailableSuspend(java.nio.ByteBuffer r6, zu.d<? super java.lang.Integer> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$2 r0 = (io.ktor.utils.io.ByteBufferChannel.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$2 r0 = new io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r7)
            goto L51
        L40:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.readSuspend(r4, r0)
            if (r7 != r1) goto L50
            goto L6c
        L50:
            r2 = r5
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5f
            r6 = -1
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L5f:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r2.readAvailable(r6, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readAvailableSuspend(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    private final void resumeReadOp(a aVar) {
        zu.d dVar = (zu.d) _readOp$FU.getAndSet(this, null);
        if (dVar != null) {
            int i10 = z.f87419c;
            dVar.resumeWith(z.m7131constructorimpl(a0.createFailure((Throwable) aVar.invoke())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeAvailableSuspend(io.ktor.utils.io.core.internal.ChunkBuffer r7, zu.d<? super java.lang.Integer> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.C40303
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$3 r0 = (io.ktor.utils.io.ByteBufferChannel.C40303) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$3 r0 = new io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            tu.a0.throwOnFailure(r8)
            return r8
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            tu.a0.throwOnFailure(r8)
            return r8
        L3b:
            java.lang.Object r7 = r0.L$1
            io.ktor.utils.io.core.internal.ChunkBuffer r7 = (io.ktor.utils.io.core.internal.ChunkBuffer) r7
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r8)
            goto L58
        L47:
            tu.a0.throwOnFailure(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r6.writeSuspend(r5, r0)
            if (r8 != r1) goto L57
            goto L7d
        L57:
            r2 = r6
        L58:
            io.ktor.utils.io.internal.JoiningState r8 = r2.joining
            r5 = 0
            if (r8 == 0) goto L71
            io.ktor.utils.io.ByteBufferChannel r8 = r2.resolveDelegation(r2, r8)
            if (r8 == 0) goto L71
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r7 = r8.writeAvailableSuspend(r7, r0)
            if (r7 != r1) goto L70
            goto L7d
        L70:
            return r7
        L71:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r2.writeAvailable(r7, r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeAvailableSuspend(io.ktor.utils.io.core.internal.ChunkBuffer, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, Buffer buffer, zu.d<? super x0> dVar) throws Throwable {
        Object objWriteFullySuspend;
        byteBufferChannel.writeAsMuchAsPossible(buffer);
        return (buffer.getWritePosition() <= buffer.getReadPosition() || (objWriteFullySuspend = byteBufferChannel.writeFullySuspend(buffer, dVar)) != e.getCOROUTINE_SUSPENDED()) ? x0.f87415a : objWriteFullySuspend;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object readFully(ByteBuffer byteBuffer, zu.d<? super Integer> dVar) throws Throwable {
        int asMuchAsPossible = readAsMuchAsPossible(byteBuffer);
        return !byteBuffer.hasRemaining() ? b.boxInt(asMuchAsPossible) : readFullySuspend(byteBuffer, asMuchAsPossible, dVar);
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ChunkBuffer chunkBuffer, zu.d<? super Integer> dVar) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannelResolveDelegation2;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation2 = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            return byteBufferChannelResolveDelegation2.writeAvailable(chunkBuffer, dVar);
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(chunkBuffer);
        if (iWriteAsMuchAsPossible > 0) {
            return b.boxInt(iWriteAsMuchAsPossible);
        }
        JoiningState joiningState2 = byteBufferChannel.joining;
        return (joiningState2 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState2)) == null) ? byteBufferChannel.writeAvailableSuspend(chunkBuffer, dVar) : byteBufferChannelResolveDelegation.writeAvailableSuspend(chunkBuffer, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeFullySuspend(io.ktor.utils.io.core.Buffer r8, zu.d<? super tu.x0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            tu.x0 r0 = tu.x0.f87415a
            boolean r1 = r9 instanceof io.ktor.utils.io.ByteBufferChannel.C40333
            if (r1 == 0) goto L15
            r1 = r9
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3 r1 = (io.ktor.utils.io.ByteBufferChannel.C40333) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3 r1 = new io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3
            r1.<init>(r9)
        L1a:
            java.lang.Object r9 = r1.result
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            tu.a0.throwOnFailure(r9)
            goto L75
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r1.L$1
            io.ktor.utils.io.core.Buffer r8 = (io.ktor.utils.io.core.Buffer) r8
            java.lang.Object r3 = r1.L$0
            io.ktor.utils.io.ByteBufferChannel r3 = (io.ktor.utils.io.ByteBufferChannel) r3
            tu.a0.throwOnFailure(r9)
            goto L5d
        L42:
            tu.a0.throwOnFailure(r9)
            r3 = r7
        L46:
            int r9 = r8.getWritePosition()
            int r6 = r8.getReadPosition()
            if (r9 <= r6) goto L7a
            r1.L$0 = r3
            r1.L$1 = r8
            r1.label = r5
            java.lang.Object r9 = r3.tryWriteSuspend$ktor_io(r5, r1)
            if (r9 != r2) goto L5d
            goto L74
        L5d:
            io.ktor.utils.io.internal.JoiningState r9 = r3.joining
            if (r9 == 0) goto L76
            io.ktor.utils.io.ByteBufferChannel r9 = r3.resolveDelegation(r3, r9)
            if (r9 == 0) goto L76
            r3 = 0
            r1.L$0 = r3
            r1.L$1 = r3
            r1.label = r4
            java.lang.Object r8 = r9.writeFully(r8, r1)
            if (r8 != r2) goto L75
        L74:
            return r2
        L75:
            return r0
        L76:
            r3.writeAsMuchAsPossible(r8)
            goto L46
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeFullySuspend(io.ktor.utils.io.core.Buffer, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeSuspend(int r6, zu.d<? super tu.x0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel.C40393
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$3 r0 = (io.ktor.utils.io.ByteBufferChannel.C40393) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$3 r0 = new io.ktor.utils.io.ByteBufferChannel$writeSuspend$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r7)
            goto L3b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            tu.a0.throwOnFailure(r7)
            r2 = r5
        L3b:
            boolean r7 = r2.writeSuspendPredicate(r6)
            if (r7 == 0) goto L66
            r0.L$0 = r2
            r0.I$0 = r6
            r0.label = r3
            kotlinx.coroutines.CancellableContinuationImpl r7 = new kotlinx.coroutines.CancellableContinuationImpl
            zu.d r4 = av.b.intercepted(r0)
            r7.<init>(r4, r3)
            r7.initCancellability()
            access$writeSuspendBlock(r2, r6, r7)
            java.lang.Object r7 = r7.getResult()
            java.lang.Object r4 = av.e.getCOROUTINE_SUSPENDED()
            if (r7 != r4) goto L63
            bv.h.probeCoroutineSuspended(r0)
        L63:
            if (r7 != r1) goto L3b
            return r1
        L66:
            io.ktor.utils.io.internal.ClosedElement r6 = r2.getClosed()
            if (r6 == 0) goto L7c
            java.lang.Throwable r6 = r6.getSendException()
            if (r6 != 0) goto L73
            goto L7c
        L73:
            io.ktor.utils.io.ByteBufferChannelKt.access$rethrowClosed(r6)
            tu.k r6 = new tu.k
            r6.<init>()
            throw r6
        L7c:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeSuspend(int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, zu.d<? super Integer> dVar) throws Throwable {
        int asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(byteBuffer);
        if (asMuchAsPossible == 0 && byteBufferChannel.getClosed() != null) {
            asMuchAsPossible = byteBufferChannel.getState().capacity.flush() ? byteBufferChannel.readAsMuchAsPossible(byteBuffer) : -1;
        } else if (asMuchAsPossible <= 0 && byteBuffer.hasRemaining()) {
            return byteBufferChannel.readAvailableSuspend(byteBuffer, dVar);
        }
        return b.boxInt(asMuchAsPossible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:22:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFullySuspend(io.ktor.utils.io.core.internal.ChunkBuffer r11, int r12, zu.d<? super tu.x0> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteBufferChannel.C40132
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteBufferChannel$readFullySuspend$2 r0 = (io.ktor.utils.io.ByteBufferChannel.C40132) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readFullySuspend$2 r0 = new io.ktor.utils.io.ByteBufferChannel$readFullySuspend$2
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r11 = r0.I$1
            int r12 = r0.I$0
            java.lang.Object r2 = r0.L$1
            io.ktor.utils.io.core.internal.ChunkBuffer r2 = (io.ktor.utils.io.core.internal.ChunkBuffer) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r13)
            r5 = r2
            goto L63
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            tu.a0.throwOnFailure(r13)
            r13 = 0
            r4 = r10
        L43:
            int r2 = r11.getLimit()
            int r5 = r11.getWritePosition()
            if (r2 <= r5) goto L91
            if (r13 >= r12) goto L91
            r0.L$0 = r4
            r0.L$1 = r11
            r0.I$0 = r12
            r0.I$1 = r13
            r0.label = r3
            java.lang.Object r2 = r4.readSuspend(r3, r0)
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r11
            r11 = r13
            r13 = r2
        L63:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L77
            int r7 = r12 - r11
            r8 = 2
            r9 = 0
            r6 = 0
            int r13 = readAsMuchAsPossible$default(r4, r5, r6, r7, r8, r9)
            int r13 = r13 + r11
            r11 = r5
            goto L43
        L77:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r13 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected EOF: expected "
            r0.<init>(r1)
            int r12 = r12 - r11
            r0.append(r12)
            java.lang.String r11 = " more bytes"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r13.<init>(r11)
            throw r13
        L91:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readFullySuspend(io.ktor.utils.io.core.internal.ChunkBuffer, int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i10, int i11, zu.d<? super x0> dVar) throws Throwable {
        Object objWriteFullySuspend;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        x0 x0Var = x0.f87415a;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            Object objWriteFully = byteBufferChannelResolveDelegation.writeFully(bArr, i10, i11, dVar);
            return objWriteFully == e.getCOROUTINE_SUSPENDED() ? objWriteFully : x0Var;
        }
        while (i11 > 0) {
            int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(bArr, i10, i11);
            if (iWriteAsMuchAsPossible == 0) {
                break;
            }
            i10 += iWriteAsMuchAsPossible;
            i11 -= iWriteAsMuchAsPossible;
        }
        return (i11 != 0 && (objWriteFullySuspend = byteBufferChannel.writeFullySuspend(bArr, i10, i11, dVar)) == e.getCOROUTINE_SUSPENDED()) ? objWriteFullySuspend : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAvailableSuspend(io.ktor.utils.io.core.internal.ChunkBuffer r6, zu.d<? super java.lang.Integer> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$3 r0 = (io.ktor.utils.io.ByteBufferChannel.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$3 r0 = new io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            io.ktor.utils.io.core.internal.ChunkBuffer r6 = (io.ktor.utils.io.core.internal.ChunkBuffer) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r7)
            goto L51
        L40:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.readSuspend(r4, r0)
            if (r7 != r1) goto L50
            goto L6c
        L50:
            r2 = r5
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5f
            r6 = -1
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L5f:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r2.readAvailable(r6, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readAvailableSuspend(io.ktor.utils.io.core.internal.ChunkBuffer, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i10, int i11, zu.d<? super Integer> dVar) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            return byteBufferChannelResolveDelegation.writeAvailable(bArr, i10, i11, dVar);
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(bArr, i10, i11);
        if (iWriteAsMuchAsPossible > 0) {
            return b.boxInt(iWriteAsMuchAsPossible);
        }
        return byteBufferChannel.writeSuspend(bArr, i10, i11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:20:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeFullySuspend(byte[] r6, int r7, int r8, zu.d<? super tu.x0> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteBufferChannel.AnonymousClass5
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5 r0 = (io.ktor.utils.io.ByteBufferChannel.AnonymousClass5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5 r0 = new io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            tu.a0.throwOnFailure(r9)
            goto L57
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            tu.a0.throwOnFailure(r9)
            r2 = r5
        L41:
            if (r8 <= 0) goto L63
            r0.L$0 = r2
            r0.L$1 = r6
            r0.I$0 = r7
            r0.I$1 = r8
            r0.label = r3
            java.lang.Object r9 = r2.writeAvailable(r6, r7, r8, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r4 = r8
            r8 = r6
            r6 = r4
        L57:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L41
        L63:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.writeFullySuspend(byte[], int, int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:19:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFullySuspend(byte[] r7, int r8, int r9, zu.d<? super tu.x0> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel.C40143
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$readFullySuspend$3 r0 = (io.ktor.utils.io.ByteBufferChannel.C40143) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$readFullySuspend$3 r0 = new io.ktor.utils.io.ByteBufferChannel$readFullySuspend$3
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r7 = r0.I$2
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            byte[] r2 = (byte[]) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r4 = (io.ktor.utils.io.ByteBufferChannel) r4
            tu.a0.throwOnFailure(r10)
            goto L5e
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            tu.a0.throwOnFailure(r10)
            r10 = 0
            r4 = r6
        L44:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.I$0 = r8
            r0.I$1 = r9
            r0.I$2 = r10
            r0.label = r3
            java.lang.Object r2 = r4.readSuspend(r3, r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r5 = r2
            r2 = r7
            r7 = r10
            r10 = r5
            r5 = r9
            r9 = r8
            r8 = r5
        L5e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L76
            int r9 = r9 + r7
            int r7 = r8 - r7
            int r10 = r4.readAsMuchAsPossible(r2, r9, r7)
            if (r10 < r7) goto L72
            tu.x0 r7 = tu.x0.f87415a
            return r7
        L72:
            r8 = r9
            r9 = r7
            r7 = r2
            goto L44
        L76:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r7 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r9 = "Unexpected EOF: expected "
            java.lang.String r10 = " more bytes"
            java.lang.String r8 = p0.o2.k(r8, r9, r10)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.readFullySuspend(byte[], int, int, zu.d):java.lang.Object");
    }

    public /* synthetic */ ByteBufferChannel(boolean z10, ObjectPool objectPool, int i10, int i11, u uVar) {
        this(z10, (i11 & 2) != 0 ? ObjectPoolKt.getBufferObjectPool() : objectPool, (i11 & 4) != 0 ? 8 : i10);
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ChunkBuffer chunkBuffer, zu.d<? super Integer> dVar) {
        int asMuchAsPossible$default = readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, 0, 6, null);
        if (asMuchAsPossible$default == 0 && byteBufferChannel.getClosed() != null) {
            asMuchAsPossible$default = byteBufferChannel.getState().capacity.flush() ? readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, 0, 6, null) : -1;
        } else if (asMuchAsPossible$default <= 0 && chunkBuffer.getLimit() > chunkBuffer.getWritePosition()) {
            return byteBufferChannel.readAvailableSuspend(chunkBuffer, dVar);
        }
        return b.boxInt(asMuchAsPossible$default);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel(ByteBuffer content) {
        this(false, ObjectPoolKt.getBufferObjectNoPool(), 0);
        e0.checkNotNullParameter(content, "content");
        ByteBuffer byteBufferSlice = content.slice();
        e0.checkNotNullExpressionValue(byteBufferSlice, "content.slice()");
        ReadWriteBufferState.Initial initial = new ReadWriteBufferState.Initial(byteBufferSlice, 0);
        initial.capacity.resetForRead();
        this._state = initial.startWriting$ktor_io();
        restoreStateAfterWrite$ktor_io();
        ByteWriteChannelKt.close(this);
        tryTerminate$ktor_io();
    }

    private final int readAsMuchAsPossible(Buffer buffer, int i10, int i11) throws Throwable {
        int iTryReadAtMost;
        do {
            ByteBuffer byteBuffer = setupStateForRead();
            boolean z10 = false;
            if (byteBuffer == null) {
                iTryReadAtMost = 0;
            } else {
                RingBufferCapacity ringBufferCapacity = getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal == 0) {
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        iTryReadAtMost = 0;
                    } else {
                        int limit = buffer.getLimit() - buffer.getWritePosition();
                        iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(byteBuffer.remaining(), Math.min(limit, i11)));
                        if (iTryReadAtMost > 0) {
                            if (limit < byteBuffer.remaining()) {
                                byteBuffer.limit(byteBuffer.position() + limit);
                            }
                            BufferPrimitivesJvmKt.writeFully(buffer, byteBuffer);
                            bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                            z10 = true;
                        }
                    }
                } finally {
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                }
            }
            i10 += iTryReadAtMost;
            i11 -= iTryReadAtMost;
            if (!z10 || buffer.getLimit() <= buffer.getWritePosition()) {
                break;
            }
        } while (getState().capacity._availableForRead$internal > 0);
        return i10;
    }

    private static /* synthetic */ void getReadSession$annotations() {
    }

    private final int writeAsMuchAsPossible(Buffer buffer) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i10 = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new k();
            }
            while (true) {
                int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(buffer.getWritePosition() - buffer.getReadPosition(), byteBuffer.remaining()));
                if (iTryWriteAtMost == 0) {
                    break;
                }
                BufferUtilsJvmKt.readFully(buffer, byteBuffer, iTryWriteAtMost);
                i10 += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i10), ringBufferCapacity._availableForWrite$internal);
            }
            byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, i10);
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            return i10;
        } catch (Throwable th2) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th2;
        }
    }

    private final int readAsMuchAsPossible(byte[] bArr, int i10, int i11) throws Throwable {
        ByteBuffer byteBuffer = setupStateForRead();
        int i12 = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        try {
            if (ringBufferCapacity._availableForRead$internal != 0) {
                int iCapacity = byteBuffer.capacity() - this.reservedSize;
                while (true) {
                    int i13 = i11 - i12;
                    if (i13 == 0) {
                        break;
                    }
                    int i14 = this.readPosition;
                    int iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(iCapacity - i14, i13));
                    if (iTryReadAtMost == 0) {
                        break;
                    }
                    byteBuffer.limit(i14 + iTryReadAtMost);
                    byteBuffer.position(i14);
                    byteBuffer.get(bArr, i10 + i12, iTryReadAtMost);
                    bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                    i12 += iTryReadAtMost;
                }
            }
            return i12;
        } finally {
            restoreStateAfterRead();
            tryTerminate$ktor_io();
        }
    }

    private final int writeAsMuchAsPossible(byte[] bArr, int i10, int i11) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i12 = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new k();
            }
            while (true) {
                int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(i11 - i12, byteBuffer.remaining()));
                if (iTryWriteAtMost == 0) {
                    byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, i12);
                    if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                        byteBufferChannelResolveDelegation.flush();
                    }
                    if (byteBufferChannelResolveDelegation != this) {
                        setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
                    }
                    byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
                    byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
                    return i12;
                }
                if (iTryWriteAtMost > 0) {
                    byteBuffer.put(bArr, i10 + i12, iTryWriteAtMost);
                    i12 += iTryWriteAtMost;
                    byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i12), ringBufferCapacity._availableForWrite$internal);
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } catch (Throwable th2) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io((byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten) + getTotalBytesWritten());
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th2;
        }
    }
}
