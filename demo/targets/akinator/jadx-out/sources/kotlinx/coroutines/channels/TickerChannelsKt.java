package kotlinx.coroutines.channels;

import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kv.p;
import p0.o2;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TickerChannelsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {102, 104, 105}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        long J$0;
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
            return TickerChannelsKt.fixedDelayTicker(0L, 0L, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {80, 84, 90, 92}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41521 extends bv.d {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41521(zu.d<? super C41521> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TickerChannelsKt.fixedPeriodTicker(0L, 0L, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ TickerMode $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TickerMode.values().length];
                try {
                    iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TickerMode tickerMode, long j10, long j11, zu.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$mode = tickerMode;
            this.$delayMillis = j10;
            this.$initialDelayMillis = j11;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$mode, this.$delayMillis, this.$initialDelayMillis, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (kotlinx.coroutines.channels.TickerChannelsKt.fixedDelayTicker(r4, r6, r8, r10) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (kotlinx.coroutines.channels.TickerChannelsKt.fixedPeriodTicker(r1, r3, r11, r10) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            return r0;
         */
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                tu.a0.throwOnFailure(r11)
                r6 = r10
                goto L62
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                tu.a0.throwOnFailure(r11)
                goto L62
            L1f:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.TickerMode r1 = r10.$mode
                int[] r4 = kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r4[r1]
                if (r1 == r3) goto L4e
                if (r1 != r2) goto L47
                long r4 = r10.$delayMillis
                long r6 = r10.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r8 = r11.getChannel()
                r10.label = r2
                r9 = r10
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r4, r6, r8, r9)
                r6 = r9
                if (r11 != r0) goto L62
                goto L61
            L47:
                r6 = r10
                tu.t r11 = new tu.t
                r11.<init>()
                throw r11
            L4e:
                r6 = r10
                long r1 = r6.$delayMillis
                r5 = r3
                long r3 = r6.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r11 = r11.getChannel()
                r6.label = r5
                r5 = r11
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r1, r3, r5, r6)
                if (r11 != r0) goto L62
            L61:
                return r0
            L62:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super x0> producerScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass3) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object fixedDelayTicker(long r6, long r8, kotlinx.coroutines.channels.SendChannel<? super tu.x0> r10, zu.d<? super tu.x0> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            tu.a0.throwOnFailure(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            tu.a0.throwOnFailure(r11)
            goto L73
        L48:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            kotlinx.coroutines.channels.SendChannel r10 = (kotlinx.coroutines.channels.SendChannel) r10
            tu.a0.throwOnFailure(r11)
            goto L63
        L53:
            tu.a0.throwOnFailure(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r0)
            if (r8 != r1) goto L63
            goto L7f
        L63:
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            tu.x0 r8 = tu.x0.f87415a
            java.lang.Object r8 = r10.send(r8, r0)
            if (r8 != r1) goto L72
            goto L7f
        L72:
            r8 = r10
        L73:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r9 != r1) goto L34
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.fixedDelayTicker(long, long, kotlinx.coroutines.channels.SendChannel, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r1) != r2) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fd -> B:31:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0113 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object fixedPeriodTicker(long r18, long r20, kotlinx.coroutines.channels.SendChannel<? super tu.x0> r22, zu.d<? super tu.x0> r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.fixedPeriodTicker(long, long, kotlinx.coroutines.channels.SendChannel, zu.d):java.lang.Object");
    }

    public static final ReceiveChannel<x0> ticker(long j10, long j11, m mVar, TickerMode tickerMode) {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.n(j10, "Expected non-negative delay, but has ", " ms").toString());
        }
        if (j11 >= 0) {
            return ProduceKt.produce(GlobalScope.INSTANCE, Dispatchers.getUnconfined().plus(mVar), 0, new AnonymousClass3(tickerMode, j10, j11, null));
        }
        throw new IllegalArgumentException(o2.n(j11, "Expected non-negative initial delay, but has ", " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel ticker$default(long j10, long j11, m mVar, TickerMode tickerMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        if ((i10 & 4) != 0) {
            mVar = zu.n.f98854b;
        }
        if ((i10 & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return ticker(j10, j11, mVar, tickerMode);
    }
}
