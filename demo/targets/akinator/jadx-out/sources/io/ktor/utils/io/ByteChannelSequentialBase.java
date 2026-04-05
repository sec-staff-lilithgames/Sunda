package io.ktor.utils.io;

import a.b;
import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.BuffersKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.InputArraysKt;
import io.ktor.utils.io.core.InputPrimitivesKt;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.OutputKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UTF8Kt;
import io.ktor.utils.io.core.internal.UnsafeKt;
import io.ktor.utils.io.internal.AwaitingSlot;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;
import p0.o2;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ByteChannelSequentialBase implements ByteChannel, ByteReadChannel, ByteWriteChannel, SuspendableReadSession, HasReadSession, HasWriteSession {
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;
    private final boolean autoFlush;
    private volatile /* synthetic */ int channelSize;
    private final BytePacketBuilder flushBuffer;
    private final Object flushMutex;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;
    private final ByteReadPacket readable;
    private final AwaitingSlot slot;
    private final BytePacketBuilder writable;
    private static final /* synthetic */ AtomicLongFieldUpdater _totalBytesRead$FU = AtomicLongFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "_totalBytesRead");
    private static final /* synthetic */ AtomicLongFieldUpdater _totalBytesWritten$FU = AtomicLongFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "_totalBytesWritten");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availableForRead$FU = AtomicIntegerFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "_availableForRead");
    private static final /* synthetic */ AtomicIntegerFieldUpdater channelSize$FU = AtomicIntegerFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "channelSize");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closed$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannelSequentialBase.class, Object.class, "_closed");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {799}, m = "awaitFreeSpace$suspendImpl", n = {"$this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$awaitFreeSpace$1, reason: invalid class name */
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
            return ByteChannelSequentialBase.awaitFreeSpace$suspendImpl(ByteChannelSequentialBase.this, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {611}, m = "awaitSuspend", n = {"this", "atLeast"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$awaitSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40421 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40421(zu.d<? super C40421> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.awaitSuspend(0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {673}, m = "discardSuspend", n = {"this", "max", "discarded"}, s = {"L$0", "J$0", "J$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$discardSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40441 extends d {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40441(zu.d<? super C40441> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.discardSuspend(0L, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {486}, m = "readAvailable$ktor_io", n = {"this", "dst"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$2, reason: invalid class name */
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
            return ByteChannelSequentialBase.this.readAvailable$ktor_io(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {IronSourceError.ERROR_AD_UNIT_CAPPED}, m = "readAvailable$suspendImpl", n = {"$this", "dst", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$4, reason: invalid class name */
    public static final class AnonymousClass4 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(zu.d<? super AnonymousClass4> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readAvailable$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {570, 572}, m = "readBooleanSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readBooleanSlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40451 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40451(zu.d<? super C40451> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readBooleanSlow(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE}, m = "readByteSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readByteSlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40461 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40461(zu.d<? super C40461> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readByteSlow(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {390}, m = "readDoubleSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readDoubleSlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40471 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40471(zu.d<? super C40471> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readDoubleSlow(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {377}, m = "readFloatSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFloatSlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40481 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40481(zu.d<? super C40481> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readFloatSlow(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {544, 548}, m = "readFully$suspendImpl", n = {"$this", "dst", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFully$6, reason: invalid class name */
    public static final class AnonymousClass6 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass6(zu.d<? super AnonymousClass6> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readFully$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {519, IronSourceError.ERROR_NO_INTERNET_CONNECTION}, m = "readFullySuspend", n = {"this", "dst", "n"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40491 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40491(zu.d<? super C40491> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readFullySuspend(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0, 0}, l = {555}, m = "readFullySuspend", n = {"this", "dst", "offset", "length", "written"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40502 extends d {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40502(zu.d<? super C40502> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readFullySuspend(null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {349}, m = "readIntSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readIntSlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40511 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40511(zu.d<? super C40511> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readIntSlow(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {364}, m = "readLongSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readLongSlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40521 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40521(zu.d<? super C40521> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readLongSlow(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {459}, m = "readPacketSuspend", n = {"this", "builder", "remaining"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readPacketSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40531 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40531(zu.d<? super C40531> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readPacketSuspend(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {425}, m = "readRemainingSuspend", n = {"this", "builder", "limit"}, s = {"L$0", "L$1", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readRemainingSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40541 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40541(zu.d<? super C40541> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readRemainingSuspend(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {329}, m = "readShortSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readShortSlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40551 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40551(zu.d<? super C40551> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readShortSlow(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED}, m = "readSuspendableSession$suspendImpl", n = {"$this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readSuspendableSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40561 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40561(zu.d<? super C40561> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readSuspendableSession$suspendImpl(ByteChannelSequentialBase.this, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {731}, m = "readUTF8Line$suspendImpl", n = {"builder"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readUTF8Line$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40571 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40571(zu.d<? super C40571> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readUTF8Line$suspendImpl(ByteChannelSequentialBase.this, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase$readUTF8LineTo$2", f = "ByteChannelSequential.kt", i = {}, l = {721}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readUTF8LineTo$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40582 extends n implements p {
        /* synthetic */ int I$0;
        int label;

        public C40582(zu.d<? super C40582> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C40582 c40582 = ByteChannelSequentialBase.this.new C40582(dVar);
            c40582.I$0 = ((Number) obj).intValue();
            return c40582;
        }

        public final Object invoke(int i10, zu.d<? super Input> dVar) {
            return ((C40582) create(Integer.valueOf(i10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                int i11 = this.I$0;
                ByteChannelSequentialBase byteChannelSequentialBase = ByteChannelSequentialBase.this;
                this.label = 1;
                obj = byteChannelSequentialBase.await(i11, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return ByteChannelSequentialBase.this.getReadable();
            }
            return null;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (zu.d<? super Input>) obj2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readUTF8LineTo$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return x0.f87415a;
        }

        public final void invoke(int i10) {
            ByteChannelSequentialBase.this.afterRead(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {776, 777}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40591 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40591(zu.d<? super C40591> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.writeAvailableSuspend(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {781, 782}, m = "writeAvailableSuspend", n = {"this", "src", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40602 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40602(zu.d<? super C40602> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.writeAvailableSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {150}, m = "writeByte$suspendImpl", n = {"$this", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B}, s = {"L$0", "B$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeByte$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40611 extends d {
        byte B$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40611(zu.d<? super C40611> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeByte$suspendImpl(ByteChannelSequentialBase.this, (byte) 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {180}, m = "writeDouble$suspendImpl", n = {"$this", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D}, s = {"L$0", "D$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeDouble$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40621 extends d {
        double D$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40621(zu.d<? super C40621> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeDouble$suspendImpl(ByteChannelSequentialBase.this, 0.0d, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {174}, m = "writeFloat$suspendImpl", n = {"$this", InneractiveMediationDefs.GENDER_FEMALE}, s = {"L$0", "F$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFloat$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40631 extends d {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40631(zu.d<? super C40631> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeFloat$suspendImpl(ByteChannelSequentialBase.this, 0.0f, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {193}, m = "writeFully$suspendImpl", n = {"$this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40641 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40641(zu.d<? super C40641> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeFully$suspendImpl(ByteChannelSequentialBase.this, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {204}, m = "writeFully$suspendImpl", n = {"$this", "src", "currentIndex", "endIndex"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40652 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40652(zu.d<? super C40652> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeFully$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "writeFully-JT6ljtQ$suspendImpl", n = {"$this", "memory", "endIndex", "currentIndex"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$3, reason: invalid class name and case insensitive filesystem */
    public static final class C40663 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40663(zu.d<? super C40663> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.m4305writeFullyJT6ljtQ$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {162}, m = "writeInt$suspendImpl", n = {"$this", "i"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeInt$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40671 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40671(zu.d<? super C40671> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeInt$suspendImpl(ByteChannelSequentialBase.this, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {168}, m = "writeLong$suspendImpl", n = {"$this", "l"}, s = {"L$0", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeLong$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40681 extends d {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40681(zu.d<? super C40681> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeLong$suspendImpl(ByteChannelSequentialBase.this, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {186}, m = "writePacket$suspendImpl", n = {"$this", "packet"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writePacket$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40691 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40691(zu.d<? super C40691> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writePacket$suspendImpl(ByteChannelSequentialBase.this, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {156}, m = "writeShort$suspendImpl", n = {"$this", ApsMetricsDataMap.APSMETRICS_FIELD_SDK}, s = {"L$0", "S$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeShort$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40701 extends d {
        Object L$0;
        short S$0;
        int label;
        /* synthetic */ Object result;

        public C40701(zu.d<? super C40701> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeShort$suspendImpl(ByteChannelSequentialBase.this, (short) 0, this);
        }
    }

    public ByteChannelSequentialBase(ChunkBuffer initial, boolean z10, ObjectPool<ChunkBuffer> pool) throws Throwable {
        e0.checkNotNullParameter(initial, "initial");
        e0.checkNotNullParameter(pool, "pool");
        this.autoFlush = z10;
        ChunkBuffer.Companion companion = ChunkBuffer.Companion;
        this._lastReadView = companion.getEmpty();
        this._totalBytesRead = 0L;
        this._totalBytesWritten = 0L;
        this._availableForRead = 0;
        this.channelSize = 0;
        this._closed = null;
        this.writable = new BytePacketBuilder(pool);
        this.readable = new ByteReadPacket(initial, pool);
        this.lastReadAvailable$delegate = 0;
        this.lastReadView$delegate = companion.getEmpty();
        this.slot = new AwaitingSlot();
        this.flushMutex = new Object();
        this.flushBuffer = new BytePacketBuilder(null, 1, null);
        int iRemainingAll = (int) BuffersKt.remainingAll(initial);
        afterWrite(iRemainingAll);
        _availableForRead$FU.addAndGet(this, iRemainingAll);
    }

    private final void addBytesRead(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "Can't read negative amount of bytes: ").toString());
        }
        int i11 = -i10;
        channelSize$FU.getAndAdd(this, i11);
        _totalBytesRead$FU.addAndGet(this, i10);
        _availableForRead$FU.getAndAdd(this, i11);
        if (this.channelSize < 0) {
            throw new IllegalStateException(("Readable bytes count is negative: " + getAvailableForRead() + ", " + i10 + " in " + this).toString());
        }
        if (getAvailableForRead() >= 0) {
            return;
        }
        throw new IllegalStateException(("Readable bytes count is negative: " + getAvailableForRead() + ", " + i10 + " in " + this).toString());
    }

    private final void addBytesWritten(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "Can't write negative amount of bytes: ").toString());
        }
        channelSize$FU.getAndAdd(this, i10);
        _totalBytesWritten$FU.addAndGet(this, i10);
        if (this.channelSize >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Readable bytes count is negative: ");
        b.x(this.channelSize, i10, ", ", " in ", sb2);
        sb2.append(this);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static /* synthetic */ Object await$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, int i10, zu.d<? super Boolean> dVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "atLeast parameter shouldn't be negative: ").toString());
        }
        long j10 = i10;
        if (j10 > 4088) {
            throw new IllegalArgumentException(b.e(i10, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
        }
        byteChannelSequentialBase.completeReading();
        return i10 == 0 ? bv.b.boxBoolean(!byteChannelSequentialBase.isClosedForRead()) : byteChannelSequentialBase.readable.getRemaining() >= j10 ? bv.b.boxBoolean(true) : byteChannelSequentialBase.awaitSuspend(i10, dVar);
    }

    public static /* synthetic */ Object awaitContent$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super x0> dVar) {
        Object objAwait = byteChannelSequentialBase.await(1, dVar);
        return objAwait == e.getCOROUTINE_SUSPENDED() ? objAwait : x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object awaitFreeSpace$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r4, zu.d<? super tu.x0> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteChannelSequentialBase$awaitFreeSpace$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$awaitFreeSpace$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$awaitFreeSpace$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r4 = (io.ktor.utils.io.ByteChannelSequentialBase) r4
            tu.a0.throwOnFailure(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            tu.a0.throwOnFailure(r5)
            r4.flush()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r4.ensureNotClosed()
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.awaitFreeSpace$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, zu.d):java.lang.Object");
    }

    private final void checkClosed(int i10, BytePacketBuilder bytePacketBuilder) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            if (bytePacketBuilder == null) {
                throw closedCause;
            }
            bytePacketBuilder.close();
            throw closedCause;
        }
        if (!getClosed() || getAvailableForRead() >= i10) {
            return;
        }
        if (bytePacketBuilder != null) {
            bytePacketBuilder.close();
        }
        throw new EOFException(o2.j(i10, " bytes required but EOF reached"));
    }

    public static /* synthetic */ void checkClosed$default(ByteChannelSequentialBase byteChannelSequentialBase, int i10, BytePacketBuilder bytePacketBuilder, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkClosed");
        }
        if ((i11 & 2) != 0) {
            bytePacketBuilder = null;
        }
        byteChannelSequentialBase.checkClosed(i10, bytePacketBuilder);
    }

    private final void completeReading() {
        ChunkBuffer lastReadView = getLastReadView();
        int lastReadAvailable = getLastReadAvailable() - (lastReadView.getWritePosition() - lastReadView.getReadPosition());
        if (getLastReadView() != Buffer.Companion.getEmpty()) {
            UnsafeKt.completeReadHead(this.readable, getLastReadView());
        }
        if (lastReadAvailable > 0) {
            afterRead(lastReadAvailable);
        }
        setLastReadAvailable(0);
        setLastReadView(ChunkBuffer.Companion.getEmpty());
    }

    public static /* synthetic */ Object discard$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, long j10, zu.d<? super Long> dVar) throws Throwable {
        long jDiscard = byteChannelSequentialBase.readable.discard(j10);
        byteChannelSequentialBase.afterRead((int) jDiscard);
        if (jDiscard != j10 && !byteChannelSequentialBase.isClosedForRead()) {
            return byteChannelSequentialBase.discardSuspend(j10, jDiscard, dVar);
        }
        byteChannelSequentialBase.ensureNotFailed();
        return bv.b.boxLong(jDiscard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2.isClosedForRead() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object discardSuspend(long r9, long r11, zu.d<? super java.lang.Long> r13) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40441
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteChannelSequentialBase$discardSuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$discardSuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$discardSuspend$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            long r9 = r0.J$1
            long r11 = r0.J$0
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r13)
            r6 = r11
            r11 = r9
            r9 = r6
            goto L4f
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            tu.a0.throwOnFailure(r13)
            r2 = r8
        L40:
            r0.L$0 = r2
            r0.J$0 = r9
            r0.J$1 = r11
            r0.label = r3
            java.lang.Object r13 = r2.await(r3, r0)
            if (r13 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L6e
            io.ktor.utils.io.core.ByteReadPacket r13 = r2.readable
            long r4 = r9 - r11
            long r4 = r13.discard(r4)
            int r13 = (int) r4
            r2.afterRead(r13)
            long r11 = r11 + r4
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L6e
            boolean r13 = r2.isClosedForRead()
            if (r13 == 0) goto L40
        L6e:
            r2.ensureNotFailed()
            java.lang.Long r9 = bv.b.boxLong(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.discardSuspend(long, long, zu.d):java.lang.Object");
    }

    private final void ensureNotClosed() throws Throwable {
        if (getClosed()) {
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            throw new ClosedWriteChannelException("Channel " + this + " is already closed");
        }
    }

    private final void ensureNotFailed() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    private final boolean flushImpl() {
        if (this.writable.isEmpty()) {
            this.slot.resume();
            return false;
        }
        flushWrittenBytes();
        this.slot.resume();
        return true;
    }

    private final void flushWrittenBytes() {
        synchronized (this.flushMutex) {
            int size = this.writable.getSize();
            ChunkBuffer chunkBufferStealAll$ktor_io = this.writable.stealAll$ktor_io();
            e0.checkNotNull(chunkBufferStealAll$ktor_io);
            this.flushBuffer.writeChunkBuffer$ktor_io(chunkBufferStealAll$ktor_io);
            _availableForRead$FU.addAndGet(this, size);
        }
    }

    private final int getLastReadAvailable() {
        return this.lastReadAvailable$delegate;
    }

    private final ChunkBuffer getLastReadView() {
        return (ChunkBuffer) this.lastReadView$delegate;
    }

    private final boolean isCancelled() {
        CloseElement closeElement = (CloseElement) this._closed;
        return (closeElement != null ? closeElement.getCause() : null) != null;
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ChunkBuffer chunkBuffer, zu.d<? super Integer> dVar) {
        e0.checkNotNull(chunkBuffer, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        return byteChannelSequentialBase.readAvailable$ktor_io(chunkBuffer, dVar);
    }

    public static /* synthetic */ Object readBoolean$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super Boolean> dVar) {
        if (!byteChannelSequentialBase.readable.canRead()) {
            return byteChannelSequentialBase.readBooleanSlow(dVar);
        }
        boolean z10 = byteChannelSequentialBase.readable.readByte() == 1;
        byteChannelSequentialBase.afterRead(1);
        return bv.b.boxBoolean(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readBooleanSlow(zu.d<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40451
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readBooleanSlow$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readBooleanSlow$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readBooleanSlow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r6)
            goto L4b
        L3c:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.awaitSuspend(r4, r0)
            if (r6 != r1) goto L4a
            goto L59
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            checkClosed$default(r2, r4, r6, r3, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.readBoolean(r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readBooleanSlow(zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readByte$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super Byte> dVar) {
        if (byteChannelSequentialBase.readable.getEndOfInput()) {
            return byteChannelSequentialBase.readByteSlow(dVar);
        }
        byte b10 = byteChannelSequentialBase.readable.readByte();
        byteChannelSequentialBase.afterRead(1);
        return bv.b.boxByte(b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readByteSlow(zu.d<? super java.lang.Byte> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40461
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readByteSlow$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readByteSlow$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readByteSlow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            tu.a0.throwOnFailure(r6)
            r2 = r5
        L39:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r2.awaitSuspend(r3, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            io.ktor.utils.io.core.ByteReadPacket r6 = r2.readable
            boolean r6 = r6.getEndOfInput()
            if (r6 != 0) goto L5d
            io.ktor.utils.io.core.ByteReadPacket r6 = r2.readable
            byte r6 = r6.readByte()
            java.lang.Byte r6 = bv.b.boxByte(r6)
            r6.byteValue()
            r2.afterRead(r3)
            return r6
        L5d:
            r6 = 2
            r4 = 0
            checkClosed$default(r2, r3, r4, r6, r4)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readByteSlow(zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readDouble$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super Double> dVar) {
        if (!byteChannelSequentialBase.readable.hasBytes(8)) {
            return byteChannelSequentialBase.readDoubleSlow(dVar);
        }
        double d10 = InputPrimitivesKt.readDouble(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(8);
        return bv.b.boxDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDoubleSlow(zu.d<? super java.lang.Double> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40471
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readDoubleSlow$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readDoubleSlow$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readDoubleSlow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r0 = (io.ktor.utils.io.ByteChannelSequentialBase) r0
            tu.a0.throwOnFailure(r6)
            goto L46
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.awaitSuspend(r3, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r5
        L46:
            io.ktor.utils.io.core.ByteReadPacket r6 = r0.readable
            double r1 = io.ktor.utils.io.core.InputPrimitivesKt.readDouble(r6)
            r0.afterRead(r3)
            java.lang.Double r6 = bv.b.boxDouble(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readDoubleSlow(zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readFloat$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super Float> dVar) {
        if (!byteChannelSequentialBase.readable.hasBytes(4)) {
            return byteChannelSequentialBase.readFloatSlow(dVar);
        }
        float f10 = InputPrimitivesKt.readFloat(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(4);
        return bv.b.boxFloat(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFloatSlow(zu.d<? super java.lang.Float> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40481
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readFloatSlow$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readFloatSlow$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readFloatSlow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r0 = (io.ktor.utils.io.ByteChannelSequentialBase) r0
            tu.a0.throwOnFailure(r6)
            goto L45
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.awaitSuspend(r3, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            r0 = r5
        L45:
            io.ktor.utils.io.core.ByteReadPacket r6 = r0.readable
            float r6 = io.ktor.utils.io.core.InputPrimitivesKt.readFloat(r6)
            r0.afterRead(r3)
            java.lang.Float r6 = bv.b.boxFloat(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readFloatSlow(zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readFully$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ChunkBuffer chunkBuffer, int i10, zu.d<? super x0> dVar) throws Throwable {
        e0.checkNotNull(chunkBuffer, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        Object fully = byteChannelSequentialBase.readFully((Buffer) chunkBuffer, i10, dVar);
        return fully == e.getCOROUTINE_SUSPENDED() ? fully : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r2.readFully(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFullySuspend(io.ktor.utils.io.core.Buffer r6, int r7, zu.d<? super tu.x0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40491
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r7 = r0.I$0
            java.lang.Object r6 = r0.L$1
            io.ktor.utils.io.core.Buffer r6 = (io.ktor.utils.io.core.Buffer) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r8)
            goto L55
        L42:
            tu.a0.throwOnFailure(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitSuspend(r7, r0)
            if (r8 != r1) goto L54
            goto L62
        L54:
            r2 = r5
        L55:
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r6 = r2.readFully(r6, r7, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readFullySuspend(io.ktor.utils.io.core.Buffer, int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readInt$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super Integer> dVar) {
        if (!byteChannelSequentialBase.readable.hasBytes(4)) {
            return byteChannelSequentialBase.readIntSlow(dVar);
        }
        int i10 = InputPrimitivesKt.readInt(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(4);
        return bv.b.boxInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readIntSlow(zu.d<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40511
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readIntSlow$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readIntSlow$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readIntSlow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r0 = (io.ktor.utils.io.ByteChannelSequentialBase) r0
            tu.a0.throwOnFailure(r6)
            goto L45
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.awaitSuspend(r3, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            r0 = r5
        L45:
            io.ktor.utils.io.core.ByteReadPacket r6 = r0.readable
            int r6 = io.ktor.utils.io.core.InputPrimitivesKt.readInt(r6)
            r0.afterRead(r3)
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readIntSlow(zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readLong$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super Long> dVar) {
        if (!byteChannelSequentialBase.readable.hasBytes(8)) {
            return byteChannelSequentialBase.readLongSlow(dVar);
        }
        long j10 = InputPrimitivesKt.readLong(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(8);
        return bv.b.boxLong(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readLongSlow(zu.d<? super java.lang.Long> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40521
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readLongSlow$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readLongSlow$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readLongSlow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r0 = (io.ktor.utils.io.ByteChannelSequentialBase) r0
            tu.a0.throwOnFailure(r6)
            goto L46
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.awaitSuspend(r3, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r5
        L46:
            io.ktor.utils.io.core.ByteReadPacket r6 = r0.readable
            long r1 = io.ktor.utils.io.core.InputPrimitivesKt.readLong(r6)
            r0.afterRead(r3)
            java.lang.Long r6 = bv.b.boxLong(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readLongSlow(zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readPacket$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, int i10, zu.d<? super ByteReadPacket> dVar) throws Throwable {
        checkClosed$default(byteChannelSequentialBase, i10, null, 2, null);
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        int iMin = (int) Math.min(i10, byteChannelSequentialBase.readable.getRemaining());
        int i11 = i10 - iMin;
        bytePacketBuilder.writePacket(byteChannelSequentialBase.readable, iMin);
        byteChannelSequentialBase.afterRead(iMin);
        byteChannelSequentialBase.checkClosed(i11, bytePacketBuilder);
        return i11 > 0 ? byteChannelSequentialBase.readPacketSuspend(bytePacketBuilder, i11, dVar) : bytePacketBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readPacketSuspend(io.ktor.utils.io.core.BytePacketBuilder r10, int r11, zu.d<? super io.ktor.utils.io.core.ByteReadPacket> r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40531
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.ByteChannelSequentialBase$readPacketSuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readPacketSuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readPacketSuspend$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            io.ktor.utils.io.core.BytePacketBuilder r11 = (io.ktor.utils.io.core.BytePacketBuilder) r11
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L42
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            tu.a0.throwOnFailure(r12)
            r2 = r9
        L42:
            if (r11 <= 0) goto L6d
            long r4 = (long) r11
            io.ktor.utils.io.core.ByteReadPacket r12 = r2.readable
            long r6 = r12.getRemaining()
            long r4 = java.lang.Math.min(r4, r6)
            int r12 = (int) r4
            int r11 = r11 - r12
            io.ktor.utils.io.core.ByteReadPacket r4 = r2.readable
            r10.writePacket(r4, r12)
            r2.afterRead(r12)
            r2.checkClosed(r11, r10)
            if (r11 <= 0) goto L42
            r0.L$0 = r2
            r0.L$1 = r10
            r0.I$0 = r11
            r0.label = r3
            java.lang.Object r12 = r2.awaitSuspend(r3, r0)
            if (r12 != r1) goto L42
            return r1
        L6d:
            r2.checkClosed(r11, r10)
            io.ktor.utils.io.core.ByteReadPacket r10 = r10.build()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readPacketSuspend(io.ktor.utils.io.core.BytePacketBuilder, int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readRemaining$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, long j10, zu.d<? super ByteReadPacket> dVar) throws Throwable {
        byteChannelSequentialBase.ensureNotFailed();
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        long jMin = Math.min(j10, byteChannelSequentialBase.readable.getRemaining());
        bytePacketBuilder.writePacket(byteChannelSequentialBase.readable, jMin);
        byteChannelSequentialBase.afterRead((int) jMin);
        if (j10 - bytePacketBuilder.getSize() != 0 && !byteChannelSequentialBase.isClosedForRead()) {
            return byteChannelSequentialBase.readRemainingSuspend(bytePacketBuilder, j10, dVar);
        }
        byteChannelSequentialBase.ensureNotFailed(bytePacketBuilder);
        return bytePacketBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readRemainingSuspend(io.ktor.utils.io.core.BytePacketBuilder r11, long r12, zu.d<? super io.ktor.utils.io.core.ByteReadPacket> r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40541
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.ByteChannelSequentialBase$readRemainingSuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readRemainingSuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readRemainingSuspend$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r11 = r0.J$0
            java.lang.Object r13 = r0.L$1
            io.ktor.utils.io.core.BytePacketBuilder r13 = (io.ktor.utils.io.core.BytePacketBuilder) r13
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r14)
            r8 = r11
            r11 = r13
            r12 = r8
            goto L42
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            tu.a0.throwOnFailure(r14)
            r2 = r10
        L42:
            int r14 = r11.getSize()
            long r4 = (long) r14
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 >= 0) goto L85
            int r14 = r11.getSize()
            long r4 = (long) r14
            long r4 = r12 - r4
            io.ktor.utils.io.core.ByteReadPacket r14 = r2.readable
            long r6 = r14.getRemaining()
            long r4 = java.lang.Math.min(r4, r6)
            io.ktor.utils.io.core.ByteReadPacket r14 = r2.readable
            r11.writePacket(r14, r4)
            int r14 = (int) r4
            r2.afterRead(r14)
            r2.ensureNotFailed(r11)
            boolean r14 = r2.isClosedForRead()
            if (r14 != 0) goto L85
            int r14 = r11.getSize()
            int r4 = (int) r12
            if (r14 != r4) goto L76
            goto L85
        L76:
            r0.L$0 = r2
            r0.L$1 = r11
            r0.J$0 = r12
            r0.label = r3
            java.lang.Object r14 = r2.awaitSuspend(r3, r0)
            if (r14 != r1) goto L42
            return r1
        L85:
            r2.ensureNotFailed(r11)
            io.ktor.utils.io.core.ByteReadPacket r11 = r11.build()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readRemainingSuspend(io.ktor.utils.io.core.BytePacketBuilder, long, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object readShort$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super Short> dVar) {
        if (!byteChannelSequentialBase.readable.hasBytes(2)) {
            return byteChannelSequentialBase.readShortSlow(dVar);
        }
        short s10 = InputPrimitivesKt.readShort(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(2);
        return bv.b.boxShort(s10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.ktor.utils.io.ByteChannelSequentialBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.ktor.utils.io.ByteChannelSequentialBase] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tu.x0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kv.p] */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object readSuspendableSession$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r4, kv.p r5, zu.d<? super tu.x0> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40561
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readSuspendableSession$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readSuspendableSession$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readSuspendableSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r4 = (io.ktor.utils.io.ByteChannelSequentialBase) r4
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L45
            return r1
        L45:
            r4.completeReading()
            tu.x0 r4 = tu.x0.f87415a
            return r4
        L4b:
            r4.completeReading()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readSuspendableSession$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, kv.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object readUTF8Line$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, int r6, zu.d<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40571
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$readUTF8Line$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readUTF8Line$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readUTF8Line$1
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readUTF8Line$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ <A extends Appendable> Object readUTF8LineTo$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, A a10, int i10, zu.d<? super Boolean> dVar) throws Throwable {
        if (!byteChannelSequentialBase.isClosedForRead()) {
            return UTF8Kt.decodeUTF8LineLoopSuspend(a10, i10, byteChannelSequentialBase.new C40582(null), byteChannelSequentialBase.new AnonymousClass3(), dVar);
        }
        Throwable closedCause = byteChannelSequentialBase.getClosedCause();
        if (closedCause == null) {
            return bv.b.boxBoolean(false);
        }
        throw closedCause;
    }

    private final ChunkBuffer requestNextView(int i10) {
        if (this.readable.getEndOfInput()) {
            prepareFlushedBytes();
        }
        ChunkBuffer chunkBufferPrepareReadHead$ktor_io = this.readable.prepareReadHead$ktor_io(i10);
        if (chunkBufferPrepareReadHead$ktor_io == null) {
            setLastReadView(ChunkBuffer.Companion.getEmpty());
            setLastReadAvailable(0);
            return chunkBufferPrepareReadHead$ktor_io;
        }
        setLastReadView(chunkBufferPrepareReadHead$ktor_io);
        setLastReadAvailable(chunkBufferPrepareReadHead$ktor_io.getWritePosition() - chunkBufferPrepareReadHead$ktor_io.getReadPosition());
        return chunkBufferPrepareReadHead$ktor_io;
    }

    private final void setLastReadAvailable(int i10) {
        this.lastReadAvailable$delegate = i10;
    }

    private final void setLastReadView(ChunkBuffer chunkBuffer) {
        this.lastReadView$delegate = chunkBuffer;
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, byte[] bArr, int i10, int i11, zu.d<? super Integer> dVar) throws Throwable {
        if (i11 == 0) {
            return bv.b.boxInt(0);
        }
        int iMin = Math.min(i11, byteChannelSequentialBase.getAvailableForWrite());
        if (iMin == 0) {
            return byteChannelSequentialBase.writeAvailableSuspend(bArr, i10, i11, dVar);
        }
        OutputKt.writeFully((Output) byteChannelSequentialBase.writable, bArr, i10, iMin);
        byteChannelSequentialBase.afterWrite(iMin);
        return bv.b.boxInt(iMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeAvailableSuspend(io.ktor.utils.io.core.internal.ChunkBuffer r6, zu.d<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40591
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$1
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
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r7)
            goto L51
        L40:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r4, r0)
            if (r7 != r1) goto L50
            goto L5e
        L50:
            r2 = r5
        L51:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r2.writeAvailable(r6, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeAvailableSuspend(io.ktor.utils.io.core.internal.ChunkBuffer, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeByte$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r4, byte r5, zu.d<? super tu.x0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40611
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$writeByte$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeByte$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeByte$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            byte r5 = r0.B$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r4 = (io.ktor.utils.io.ByteChannelSequentialBase) r4
            tu.a0.throwOnFailure(r6)
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4
            r0.B$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            io.ktor.utils.io.core.BytePacketBuilder r6 = r4.writable
            byte r5 = (byte) r5
            r6.writeByte(r5)
            r4.afterWrite(r3)
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeByte$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, byte, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeDouble$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, double r6, zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40621
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteChannelSequentialBase$writeDouble$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeDouble$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeDouble$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            double r6 = r0.D$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r5 = (io.ktor.utils.io.ByteChannelSequentialBase) r5
            tu.a0.throwOnFailure(r8)
            goto L49
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tu.a0.throwOnFailure(r8)
            r0.L$0 = r5
            r0.D$0 = r6
            r0.label = r4
            java.lang.Object r8 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            io.ktor.utils.io.core.BytePacketBuilder r8 = r5.writable
            io.ktor.utils.io.core.OutputPrimitivesKt.writeDouble(r8, r6)
            r5.afterWrite(r3)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeDouble$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, double, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeFloat$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, float r6, zu.d<? super tu.x0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40631
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$writeFloat$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeFloat$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeFloat$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r5 = (io.ktor.utils.io.ByteChannelSequentialBase) r5
            tu.a0.throwOnFailure(r7)
            goto L48
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.F$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            io.ktor.utils.io.core.BytePacketBuilder r7 = r5.writable
            io.ktor.utils.io.core.OutputPrimitivesKt.writeFloat(r7, r6)
            r5.afterWrite(r3)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeFloat$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, float, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeFully$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r4, io.ktor.utils.io.core.Buffer r5, zu.d<? super tu.x0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40641
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$writeFully$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeFully$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeFully$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.ktor.utils.io.core.Buffer r5 = (io.ktor.utils.io.core.Buffer) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r4 = (io.ktor.utils.io.ByteChannelSequentialBase) r4
            tu.a0.throwOnFailure(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            int r6 = r5.getWritePosition()
            int r0 = r5.getReadPosition()
            int r6 = r6 - r0
            io.ktor.utils.io.core.BytePacketBuilder r0 = r4.writable
            r1 = 2
            r2 = 0
            r3 = 0
            io.ktor.utils.io.core.OutputKt.writeFully$default(r0, r5, r3, r1, r2)
            r4.afterWrite(r6)
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeFully$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, io.ktor.utils.io.core.Buffer, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* renamed from: writeFully-JT6ljtQ$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m4305writeFullyJT6ljtQ$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, java.nio.ByteBuffer r6, int r7, int r8, zu.d<? super tu.x0> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40663
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteChannelSequentialBase$writeFully$3 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40663) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeFully$3 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeFully$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r5 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r8 = (io.ktor.utils.io.ByteChannelSequentialBase) r8
            tu.a0.throwOnFailure(r9)
            r4 = r7
            r7 = r5
            r5 = r8
            r8 = r6
            r6 = r4
            goto L58
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            tu.a0.throwOnFailure(r9)
        L45:
            if (r7 >= r8) goto L6c
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r8
            r0.I$1 = r7
            r0.label = r3
            java.lang.Object r9 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            int r9 = r5.getAvailableForWrite()
            int r2 = r8 - r7
            int r9 = java.lang.Math.min(r9, r2)
            io.ktor.utils.io.core.BytePacketBuilder r2 = r5.writable
            io.ktor.utils.io.core.OutputKt.m4530writeFullyUAd2zVI(r2, r6, r7, r9)
            int r7 = r7 + r9
            r5.afterWrite(r9)
            goto L45
        L6c:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.m4305writeFullyJT6ljtQ$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, java.nio.ByteBuffer, int, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeInt$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, int r6, zu.d<? super tu.x0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40671
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$writeInt$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeInt$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeInt$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.I$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r5 = (io.ktor.utils.io.ByteChannelSequentialBase) r5
            tu.a0.throwOnFailure(r7)
            goto L48
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            io.ktor.utils.io.core.BytePacketBuilder r7 = r5.writable
            io.ktor.utils.io.core.OutputPrimitivesKt.writeInt(r7, r6)
            r5.afterWrite(r3)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeInt$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeLong$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, long r6, zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40681
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteChannelSequentialBase$writeLong$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeLong$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeLong$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            long r6 = r0.J$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r5 = (io.ktor.utils.io.ByteChannelSequentialBase) r5
            tu.a0.throwOnFailure(r8)
            goto L49
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tu.a0.throwOnFailure(r8)
            r0.L$0 = r5
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            io.ktor.utils.io.core.BytePacketBuilder r8 = r5.writable
            io.ktor.utils.io.core.OutputPrimitivesKt.writeLong(r8, r6)
            r5.afterWrite(r3)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeLong$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writePacket$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r4, io.ktor.utils.io.core.ByteReadPacket r5, zu.d<? super tu.x0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40691
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$writePacket$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writePacket$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writePacket$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.ktor.utils.io.core.ByteReadPacket r5 = (io.ktor.utils.io.core.ByteReadPacket) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r4 = (io.ktor.utils.io.ByteChannelSequentialBase) r4
            tu.a0.throwOnFailure(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            long r0 = r5.getRemaining()
            int r6 = (int) r0
            io.ktor.utils.io.core.BytePacketBuilder r0 = r4.writable
            r0.writePacket(r5)
            r4.afterWrite(r6)
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writePacket$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, io.ktor.utils.io.core.ByteReadPacket, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeShort$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, short r6, zu.d<? super tu.x0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40701
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$writeShort$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40701) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeShort$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeShort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            short r6 = r0.S$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r5 = (io.ktor.utils.io.ByteChannelSequentialBase) r5
            tu.a0.throwOnFailure(r7)
            goto L48
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.S$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            io.ktor.utils.io.core.BytePacketBuilder r7 = r5.writable
            short r6 = (short) r6
            io.ktor.utils.io.core.OutputPrimitivesKt.writeShort(r7, r6)
            r5.afterWrite(r3)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeShort$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, short, zu.d):java.lang.Object");
    }

    @tu.f
    public static /* synthetic */ Object writeSuspendSession$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, p pVar, zu.d<? super x0> dVar) {
        Object objInvoke = pVar.invoke(byteChannelSequentialBase.beginWriteSession(), dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }

    public final void afterRead(int i10) {
        addBytesRead(i10);
        this.slot.resume();
    }

    public final void afterWrite(int i10) throws Throwable {
        addBytesWritten(i10);
        if (getClosed()) {
            this.writable.release();
            ensureNotClosed();
        }
        if (getAutoFlush() || getAvailableForWrite() == 0) {
            flush();
        }
    }

    @Override // io.ktor.utils.io.SuspendableReadSession
    public Object await(int i10, zu.d<? super Boolean> dVar) {
        return await$suspendImpl(this, i10, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitAtLeastNBytesAvailableForRead$ktor_io(int r6, zu.d<? super tu.x0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
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
            int r7 = r2.getAvailableForRead()
            if (r7 >= r6) goto L5b
            boolean r7 = r2.isClosedForRead()
            if (r7 != 0) goto L5b
            io.ktor.utils.io.internal.AwaitingSlot r7 = r2.slot
            io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$2 r4 = new io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$2
            r4.<init>(r2, r6)
            r0.L$0 = r2
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.sleep(r4, r0)
            if (r7 != r1) goto L3b
            return r1
        L5b:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.awaitAtLeastNBytesAvailableForRead$ktor_io(int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitAtLeastNBytesAvailableForWrite$ktor_io(int r6, zu.d<? super tu.x0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
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
            int r7 = r2.getAvailableForWrite()
            if (r7 >= r6) goto L61
            boolean r7 = r2.getClosed()
            if (r7 != 0) goto L61
            boolean r7 = r2.flushImpl()
            if (r7 != 0) goto L3b
            io.ktor.utils.io.internal.AwaitingSlot r7 = r2.slot
            io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$2 r4 = new io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$2
            r4.<init>(r2, r6)
            r0.L$0 = r2
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.sleep(r4, r0)
            if (r7 != r1) goto L3b
            return r1
        L61:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(int, zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object awaitContent(zu.d<? super x0> dVar) {
        return awaitContent$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object awaitFreeSpace(zu.d<? super x0> dVar) {
        return awaitFreeSpace$suspendImpl(this, dVar);
    }

    public final Object awaitInternalAtLeast1$ktor_io(zu.d<? super Boolean> dVar) {
        return !this.readable.getEndOfInput() ? bv.b.boxBoolean(true) : awaitSuspend(1, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitSuspend(int r5, zu.d<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40421
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$awaitSuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$awaitSuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$awaitSuspend$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.I$0
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r0 = (io.ktor.utils.io.ByteChannelSequentialBase) r0
            tu.a0.throwOnFailure(r6)
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            tu.a0.throwOnFailure(r6)
            if (r5 < 0) goto L67
            r0.L$0 = r4
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.awaitAtLeastNBytesAvailableForRead$ktor_io(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            r0.prepareFlushedBytes()
            java.lang.Throwable r6 = r0.getClosedCause()
            if (r6 != 0) goto L66
            boolean r6 = r0.isClosedForRead()
            if (r6 != 0) goto L60
            int r6 = r0.getAvailableForRead()
            if (r6 < r5) goto L60
            goto L61
        L60:
            r3 = 0
        L61:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        L66:
            throw r6
        L67:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.awaitSuspend(int, zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.HasWriteSession
    public WriterSuspendSession beginWriteSession() {
        return new WriterSuspendSession() { // from class: io.ktor.utils.io.ByteChannelSequentialBase.beginWriteSession.1
            @Override // io.ktor.utils.io.WriterSession
            public void flush() {
                ByteChannelSequentialBase.this.flush();
            }

            @Override // io.ktor.utils.io.WriterSession
            public ChunkBuffer request(int i10) {
                if (ByteChannelSequentialBase.this.getAvailableForWrite() == 0) {
                    return null;
                }
                return ByteChannelSequentialBase.this.getWritable().prepareWriteHead(i10);
            }

            @Override // io.ktor.utils.io.WriterSuspendSession
            public Object tryAwait(int i10, zu.d<? super x0> dVar) {
                Object objAwaitAtLeastNBytesAvailableForWrite$ktor_io;
                return (ByteChannelSequentialBase.this.getAvailableForWrite() >= i10 || (objAwaitAtLeastNBytesAvailableForWrite$ktor_io = ByteChannelSequentialBase.this.awaitAtLeastNBytesAvailableForWrite$ktor_io(i10, dVar)) != e.getCOROUTINE_SUSPENDED()) ? x0.f87415a : objAwaitAtLeastNBytesAvailableForWrite$ktor_io;
            }

            @Override // io.ktor.utils.io.WriterSession
            public void written(int i10) throws Throwable {
                ByteChannelSequentialBase.this.getWritable().afterHeadWrite();
                ByteChannelSequentialBase.this.afterWrite(i10);
            }
        };
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean cancel(Throwable th2) {
        if (getClosedCause() != null || getClosed()) {
            return false;
        }
        if (th2 == null) {
            th2 = new CancellationException("Channel cancelled");
        }
        return close(th2);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean close(Throwable th2) {
        CloseElement closed_success = th2 == null ? CloseElementKt.getCLOSED_SUCCESS() : new CloseElement(th2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closed$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closed_success)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        if (th2 != null) {
            this.readable.release();
            this.writable.release();
            this.flushBuffer.release();
        } else {
            flush();
            this.writable.release();
        }
        this.slot.cancel(th2);
        return true;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object discard(long j10, zu.d<? super Long> dVar) {
        return discard$suspendImpl(this, j10, dVar);
    }

    @Override // io.ktor.utils.io.HasReadSession
    public void endReadSession() {
        completeReading();
    }

    @Override // io.ktor.utils.io.HasWriteSession
    public void endWriteSession(int i10) throws Throwable {
        this.writable.afterHeadWrite();
        afterWrite(i10);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void flush() {
        flushImpl();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public int getAvailableForRead() {
        return this._availableForRead;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public int getAvailableForWrite() {
        return Math.max(0, 4088 - this.channelSize);
    }

    public final boolean getClosed() {
        return this._closed != null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final Throwable getClosedCause() {
        CloseElement closeElement = (CloseElement) this._closed;
        if (closeElement != null) {
            return closeElement.getCause();
        }
        return null;
    }

    public final ByteReadPacket getReadable() {
        return this.readable;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public long getTotalBytesRead() {
        return this._totalBytesRead;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public long getTotalBytesWritten() {
        return this._totalBytesWritten;
    }

    public final BytePacketBuilder getWritable() {
        return this.writable;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        if (isCancelled()) {
            return true;
        }
        return getClosed() && this.channelSize == 0;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return getClosed();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /* renamed from: peekTo-lBXzO7A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4303peekTolBXzO7A(java.nio.ByteBuffer r19, long r20, long r22, long r24, long r26, zu.d<? super java.lang.Long> r28) {
        /*
            r18 = this;
            r0 = r18
            r1 = r28
            boolean r2 = r1 instanceof io.ktor.utils.io.ByteChannelSequentialBase$peekTo$1
            if (r2 == 0) goto L17
            r2 = r1
            io.ktor.utils.io.ByteChannelSequentialBase$peekTo$1 r2 = (io.ktor.utils.io.ByteChannelSequentialBase$peekTo$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            io.ktor.utils.io.ByteChannelSequentialBase$peekTo$1 r2 = new io.ktor.utils.io.ByteChannelSequentialBase$peekTo$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = av.e.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.L$0
            kotlin.jvm.internal.a1 r2 = (kotlin.jvm.internal.a1) r2
            tu.a0.throwOnFailure(r1)
            goto L5e
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            tu.a0.throwOnFailure(r1)
            kotlin.jvm.internal.a1 r11 = new kotlin.jvm.internal.a1
            r11.<init>()
            io.ktor.utils.io.ByteChannelSequentialBase$peekTo$2 r6 = new io.ktor.utils.io.ByteChannelSequentialBase$peekTo$2
            r17 = 0
            r14 = r19
            r15 = r20
            r9 = r22
            r7 = r24
            r12 = r26
            r6.<init>(r7, r9, r11, r12, r14, r15, r17)
            r2.L$0 = r11
            r2.label = r5
            java.lang.Object r1 = r0.readSuspendableSession(r6, r2)
            if (r1 != r3) goto L5d
            return r3
        L5d:
            r2 = r11
        L5e:
            long r1 = r2.f71813b
            java.lang.Long r1 = bv.b.boxLong(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.mo4303peekTolBXzO7A(java.nio.ByteBuffer, long, long, long, long, zu.d):java.lang.Object");
    }

    public final void prepareFlushedBytes() {
        synchronized (this.flushMutex) {
            UnsafeKt.unsafeAppend(this.readable, this.flushBuffer);
        }
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readAvailable(ChunkBuffer chunkBuffer, zu.d<? super Integer> dVar) {
        return readAvailable$suspendImpl(this, chunkBuffer, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAvailable$ktor_io(io.ktor.utils.io.core.Buffer r6, zu.d<? super java.lang.Integer> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$2 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$2 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            io.ktor.utils.io.core.Buffer r6 = (io.ktor.utils.io.core.Buffer) r6
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r0 = (io.ktor.utils.io.ByteChannelSequentialBase) r0
            tu.a0.throwOnFailure(r7)
            goto L79
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            tu.a0.throwOnFailure(r7)
            java.lang.Throwable r7 = r5.getClosedCause()
            if (r7 != 0) goto La6
            boolean r7 = r5.getClosed()
            if (r7 == 0) goto L54
            int r7 = r5.getAvailableForRead()
            if (r7 != 0) goto L54
            r6 = -1
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L54:
            int r7 = r6.getLimit()
            int r2 = r6.getWritePosition()
            int r7 = r7 - r2
            if (r7 != 0) goto L65
            r6 = 0
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L65:
            int r7 = r5.getAvailableForRead()
            if (r7 != 0) goto L78
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r5.awaitSuspend(r3, r0)
            if (r7 != r1) goto L78
            return r1
        L78:
            r0 = r5
        L79:
            io.ktor.utils.io.core.ByteReadPacket r7 = r0.readable
            boolean r7 = r7.canRead()
            if (r7 != 0) goto L84
            r0.prepareFlushedBytes()
        L84:
            int r7 = r6.getLimit()
            int r1 = r6.getWritePosition()
            int r7 = r7 - r1
            long r1 = (long) r7
            io.ktor.utils.io.core.ByteReadPacket r7 = r0.readable
            long r3 = r7.getRemaining()
            long r1 = java.lang.Math.min(r1, r3)
            int r7 = (int) r1
            io.ktor.utils.io.core.ByteReadPacket r1 = r0.readable
            io.ktor.utils.io.core.InputArraysKt.readFully(r1, r6, r7)
            r0.afterRead(r7)
            java.lang.Integer r6 = bv.b.boxInt(r7)
            return r6
        La6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readAvailable$ktor_io(io.ktor.utils.io.core.Buffer, zu.d):java.lang.Object");
    }

    public final int readAvailableClosed() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (getAvailableForRead() <= 0) {
            return -1;
        }
        prepareFlushedBytes();
        return -1;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readBoolean(zu.d<? super Boolean> dVar) {
        return readBoolean$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readByte(zu.d<? super Byte> dVar) {
        return readByte$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readDouble(zu.d<? super Double> dVar) {
        return readDouble$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readFloat(zu.d<? super Float> dVar) {
        return readFloat$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readFully(ChunkBuffer chunkBuffer, int i10, zu.d<? super x0> dVar) {
        return readFully$suspendImpl(this, chunkBuffer, i10, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readInt(zu.d<? super Integer> dVar) {
        return readInt$suspendImpl(this, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readLong(zu.d<? super Long> dVar) {
        return readLong$suspendImpl(this, dVar);
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
        try {
            consumer.invoke(this);
        } finally {
            completeReading();
        }
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readShort(zu.d<? super Short> dVar) {
        return readShort$suspendImpl(this, dVar);
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
        return readUTF8LineTo$suspendImpl(this, a10, i10, dVar);
    }

    @Override // io.ktor.utils.io.ReadSession
    public ChunkBuffer request(int i10) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        completeReading();
        return requestNextView(i10);
    }

    public final void setClosed(boolean z10) {
        throw new IllegalStateException("Setting is not allowed for closed");
    }

    public final void setClosedCause(Throwable th2) {
        throw new IllegalStateException("Closed cause shouldn't be changed directly");
    }

    @Override // io.ktor.utils.io.HasReadSession
    public SuspendableReadSession startReadSession() {
        return this;
    }

    public final long transferTo$ktor_io(ByteChannelSequentialBase dst, long j10) throws Throwable {
        e0.checkNotNullParameter(dst, "dst");
        long remaining = this.readable.getRemaining();
        if (remaining > j10) {
            return 0L;
        }
        dst.writable.writePacket(this.readable);
        int i10 = (int) remaining;
        dst.afterWrite(i10);
        afterRead(i10);
        return remaining;
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
    /* renamed from: writeFully-JT6ljtQ */
    public Object mo4304writeFullyJT6ljtQ(ByteBuffer byteBuffer, int i10, int i11, zu.d<? super x0> dVar) {
        return m4305writeFullyJT6ljtQ$suspendImpl(this, byteBuffer, i10, i11, dVar);
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

    private final void ensureNotFailed(BytePacketBuilder bytePacketBuilder) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            return;
        }
        bytePacketBuilder.release();
        throw closedCause;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object readAvailable$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r4, byte[] r5, int r6, int r7, zu.d<? super java.lang.Integer> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass4
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$4 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$4 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r4 = r0.L$1
            r5 = r4
            byte[] r5 = (byte[]) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r4 = (io.ktor.utils.io.ByteChannelSequentialBase) r4
            tu.a0.throwOnFailure(r8)
            goto L78
        L36:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3e:
            tu.a0.throwOnFailure(r8)
            java.lang.Throwable r8 = r4.getClosedCause()
            if (r8 != 0) goto L9c
            boolean r8 = r4.getClosed()
            if (r8 == 0) goto L59
            int r8 = r4.getAvailableForRead()
            if (r8 != 0) goto L59
            r4 = -1
            java.lang.Integer r4 = bv.b.boxInt(r4)
            return r4
        L59:
            if (r7 != 0) goto L61
            r4 = 0
            java.lang.Integer r4 = bv.b.boxInt(r4)
            return r4
        L61:
            int r8 = r4.getAvailableForRead()
            if (r8 != 0) goto L78
            r0.L$0 = r4
            r0.L$1 = r5
            r0.I$0 = r6
            r0.I$1 = r7
            r0.label = r3
            java.lang.Object r8 = r4.awaitSuspend(r3, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            io.ktor.utils.io.core.ByteReadPacket r8 = r4.readable
            boolean r8 = r8.canRead()
            if (r8 != 0) goto L83
            r4.prepareFlushedBytes()
        L83:
            long r7 = (long) r7
            io.ktor.utils.io.core.ByteReadPacket r0 = r4.readable
            long r0 = r0.getRemaining()
            long r7 = java.lang.Math.min(r7, r0)
            int r7 = (int) r7
            io.ktor.utils.io.core.ByteReadPacket r8 = r4.readable
            io.ktor.utils.io.core.InputArraysKt.readFully(r8, r5, r6, r7)
            r4.afterRead(r7)
            java.lang.Integer r4 = bv.b.boxInt(r7)
            return r4
        L9c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readAvailable$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, byte[], int, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object readFully$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r6, byte[] r7, int r8, int r9, zu.d<? super tu.x0> r10) throws java.io.EOFException {
        /*
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass6
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteChannelSequentialBase$readFully$6 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.AnonymousClass6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readFully$6 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readFully$6
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            tu.x0 r3 = tu.x0.f87415a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            tu.a0.throwOnFailure(r10)
            goto L77
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            int r9 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r6 = r0.L$1
            r7 = r6
            byte[] r7 = (byte[]) r7
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r6 = (io.ktor.utils.io.ByteChannelSequentialBase) r6
            tu.a0.throwOnFailure(r10)
            goto L5b
        L47:
            tu.a0.throwOnFailure(r10)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.I$0 = r8
            r0.I$1 = r9
            r0.label = r5
            java.lang.Object r10 = r6.readAvailable(r7, r8, r9, r0)
            if (r10 != r1) goto L5b
            goto L76
        L5b:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != r9) goto L64
            return r3
        L64:
            r2 = -1
            if (r10 == r2) goto L78
            int r8 = r8 + r10
            int r9 = r9 - r10
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r6 = r6.readFullySuspend(r7, r8, r9, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            return r3
        L78:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "Unexpected end of stream"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readFully$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, byte[], int, int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readShortSlow(zu.d<? super java.lang.Short> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40551
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialBase$readShortSlow$1 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readShortSlow$1 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readShortSlow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r0 = (io.ktor.utils.io.ByteChannelSequentialBase) r0
            tu.a0.throwOnFailure(r6)
            goto L46
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r0 = 0
            java.lang.String r0 = androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN.XRIt
            r6.<init>(r0)
            throw r6
        L37:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.awaitSuspend(r3, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r5
        L46:
            io.ktor.utils.io.core.ByteReadPacket r6 = r0.readable
            short r6 = io.ktor.utils.io.core.InputPrimitivesKt.readShort(r6)
            r0.afterRead(r3)
            short r6 = (short) r6
            java.lang.Short r6 = bv.b.boxShort(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readShortSlow(zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ReadSession
    public int discard(int i10) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (i10 == 0) {
            return 0;
        }
        int iDiscard = this.readable.discard(i10);
        afterRead(i10);
        requestNextView(1);
        return iDiscard;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readAvailable(byte[] bArr, int i10, int i11, zu.d<? super Integer> dVar) {
        return readAvailable$suspendImpl(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readFully(byte[] bArr, int i10, int i11, zu.d<? super x0> dVar) {
        return readFully$suspendImpl(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeAvailable(byte[] bArr, int i10, int i11, zu.d<? super Integer> dVar) {
        return writeAvailable$suspendImpl(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeFully(byte[] bArr, int i10, int i11, zu.d<? super x0> dVar) {
        return writeFully$suspendImpl(this, bArr, i10, i11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readFully(Buffer buffer, int i10, zu.d<? super x0> dVar) throws Throwable {
        if (i10 > buffer.getLimit() - buffer.getWritePosition()) {
            throw new IllegalArgumentException(o2.k(i10, "Not enough space in the destination buffer to write ", " bytes").toString());
        }
        if (i10 >= 0) {
            if (getClosedCause() == null) {
                long remaining = this.readable.getRemaining();
                long j10 = i10;
                x0 x0Var = x0.f87415a;
                if (remaining >= j10) {
                    InputArraysKt.readFully(this.readable, buffer, i10);
                    afterRead(i10);
                    return x0Var;
                }
                if (!getClosed()) {
                    Object fullySuspend = readFullySuspend(buffer, i10, dVar);
                    return fullySuspend == e.getCOROUTINE_SUSPENDED() ? fullySuspend : x0Var;
                }
                StringBuilder sbT = o2.t(i10, "Channel is closed and not enough bytes available: required ", " but ");
                sbT.append(getAvailableForRead());
                sbT.append(" available");
                throw new EOFException(sbT.toString());
            }
            Throwable closedCause = getClosedCause();
            e0.checkNotNull(closedCause);
            throw closedCause;
        }
        throw new IllegalArgumentException("n shouldn't be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFullySuspend(byte[] r8, int r9, int r10, zu.d<? super tu.x0> r11) throws java.io.EOFException {
        /*
            r7 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40502
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$2 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40502) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$2 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$2
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r8 = r0.I$2
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            byte[] r2 = (byte[]) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r4 = (io.ktor.utils.io.ByteChannelSequentialBase) r4
            tu.a0.throwOnFailure(r11)
            r6 = r0
            r0 = r9
            r9 = r2
        L39:
            r2 = r6
            goto L6a
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            tu.a0.throwOnFailure(r11)
            r11 = 0
            r4 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r4
            r4 = r7
        L4d:
            if (r8 >= r11) goto L7f
            int r2 = r10 + r8
            int r5 = r11 - r8
            r0.L$0 = r4
            r0.L$1 = r9
            r0.I$0 = r10
            r0.I$1 = r11
            r0.I$2 = r8
            r0.label = r3
            java.lang.Object r2 = r4.readAvailable(r9, r2, r5, r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            r6 = r0
            r0 = r11
            r11 = r2
            goto L39
        L6a:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r5 = -1
            if (r11 == r5) goto L77
            int r8 = r8 + r11
            r11 = r0
            r0 = r2
            goto L4d
        L77:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r9 = "Unexpected end of stream"
            r8.<init>(r9)
            throw r8
        L7f:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.readFullySuspend(byte[], int, int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeAvailableSuspend(byte[] r6, int r7, int r8, zu.d<? super java.lang.Integer> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40602
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$2 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40602) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$2 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$2
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
            io.ktor.utils.io.ByteChannelSequentialBase r2 = (io.ktor.utils.io.ByteChannelSequentialBase) r2
            tu.a0.throwOnFailure(r9)
            goto L59
        L44:
            tu.a0.throwOnFailure(r9)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r7
            r0.I$1 = r8
            r0.label = r4
            java.lang.Object r9 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r4, r0)
            if (r9 != r1) goto L58
            goto L66
        L58:
            r2 = r5
        L59:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r6 = r2.writeAvailable(r6, r7, r8, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeAvailableSuspend(byte[], int, int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ChunkBuffer chunkBuffer, zu.d<? super Integer> dVar) throws Throwable {
        int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
        if (writePosition == 0) {
            return bv.b.boxInt(0);
        }
        int iMin = Math.min(writePosition, byteChannelSequentialBase.getAvailableForWrite());
        if (iMin == 0) {
            return byteChannelSequentialBase.writeAvailableSuspend(chunkBuffer, dVar);
        }
        OutputKt.writeFully(byteChannelSequentialBase.writable, chunkBuffer, iMin);
        byteChannelSequentialBase.afterWrite(iMin);
        return bv.b.boxInt(iMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object writeFully$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase r5, byte[] r6, int r7, int r8, zu.d<? super tu.x0> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteChannelSequentialBase.C40652
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteChannelSequentialBase$writeFully$2 r0 = (io.ktor.utils.io.ByteChannelSequentialBase.C40652) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialBase$writeFully$2 r0 = new io.ktor.utils.io.ByteChannelSequentialBase$writeFully$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r5 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r8 = (io.ktor.utils.io.ByteChannelSequentialBase) r8
            tu.a0.throwOnFailure(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L5c
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            tu.a0.throwOnFailure(r9)
            int r8 = r8 + r7
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r4
        L49:
            if (r8 >= r5) goto L70
            r0.L$0 = r6
            r0.L$1 = r7
            r0.I$0 = r8
            r0.I$1 = r5
            r0.label = r3
            java.lang.Object r9 = r6.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            int r9 = r6.getAvailableForWrite()
            int r2 = r5 - r8
            int r9 = java.lang.Math.min(r9, r2)
            io.ktor.utils.io.core.BytePacketBuilder r2 = r6.writable
            io.ktor.utils.io.core.OutputKt.writeFully(r2, r7, r8, r9)
            int r8 = r8 + r9
            r6.afterWrite(r9)
            goto L49
        L70:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialBase.writeFully$suspendImpl(io.ktor.utils.io.ByteChannelSequentialBase, byte[], int, int, zu.d):java.lang.Object");
    }

    public /* synthetic */ ByteChannelSequentialBase(ChunkBuffer chunkBuffer, boolean z10, ObjectPool objectPool, int i10, u uVar) {
        this(chunkBuffer, z10, (i10 & 4) != 0 ? ChunkBuffer.Companion.getPool() : objectPool);
    }
}
