package kotlinx.coroutines.channels;

import bv.n;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C3533xd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kv.l;
import kv.p;
import kv.q;
import tu.a0;
import tu.h;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {434}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1, reason: invalid class name */
    public static final class AnonymousClass1<E> extends bv.d {
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
            return ChannelsKt__DeprecatedKt.any(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {41}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41181<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41181(zu.d<? super C41181> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.consumeEach(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41191<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41191(zu.d<? super C41191> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.count(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41201 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C41201(zu.d<? super C41201> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41201 c41201 = new C41201(dVar);
            c41201.L$0 = obj;
            return c41201;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return this.L$0;
        }

        @Override // kv.p
        public final Object invoke(Object obj, zu.d dVar) {
            return ((C41201) create(obj, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 418, 420}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", CampaignEx.JSON_KEY_AD_K}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41211 extends n implements p {
        final /* synthetic */ p $selector;
        final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41211(ReceiveChannel<? extends E> receiveChannel, p pVar, zu.d<? super C41211> dVar) {
            super(2, dVar);
            this.$this_distinctBy = receiveChannel;
            this.$selector = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41211 c41211 = new C41211(this.$this_distinctBy, this.$selector, dVar);
            c41211.L$0 = obj;
            return c41211;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[PHI: r1 r5 r6 r11
          0x0079: PHI (r1v5 kotlinx.coroutines.channels.ChannelIterator) = (r1v6 kotlinx.coroutines.channels.ChannelIterator), (r1v11 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0076, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
          0x0079: PHI (r5v6 java.util.HashSet) = (r5v8 java.util.HashSet), (r5v12 java.util.HashSet) binds: [B:14:0x0076, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
          0x0079: PHI (r6v3 kotlinx.coroutines.channels.ProducerScope) = (r6v5 kotlinx.coroutines.channels.ProducerScope), (r6v10 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0076, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
          0x0079: PHI (r11v4 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:14:0x0076, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a1 -> B:29:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b4 -> B:28:0x00b6). Please report as a decompilation issue!!! */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L51
                if (r1 == r4) goto L41
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r10.L$3
                java.lang.Object r5 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r10.L$1
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                tu.a0.throwOnFailure(r11)
                goto Lb6
            L24:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2c:
                java.lang.Object r1 = r10.L$3
                java.lang.Object r5 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r10.L$1
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                tu.a0.throwOnFailure(r11)
                r9 = r5
                r5 = r1
                r1 = r9
                goto L9d
            L41:
                java.lang.Object r1 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r10.L$1
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r11)
                goto L79
            L51:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r10.$this_distinctBy
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r6 = r5
                r5 = r1
                r1 = r6
                r6 = r11
            L67:
                r10.L$0 = r6
                r10.L$1 = r5
                r10.L$2 = r1
                r11 = 0
                r10.L$3 = r11
                r10.label = r4
                java.lang.Object r11 = r1.hasNext(r10)
                if (r11 != r0) goto L79
                goto Lb3
            L79:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbd
                java.lang.Object r11 = r1.next()
                kv.p r7 = r10.$selector
                r10.L$0 = r6
                r10.L$1 = r5
                r10.L$2 = r1
                r10.L$3 = r11
                r10.label = r3
                java.lang.Object r7 = r7.invoke(r11, r10)
                if (r7 != r0) goto L98
                goto Lb3
            L98:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L9d:
                boolean r8 = r6.contains(r11)
                if (r8 != 0) goto Lba
                r10.L$0 = r7
                r10.L$1 = r6
                r10.L$2 = r1
                r10.L$3 = r11
                r10.label = r2
                java.lang.Object r5 = r7.send(r5, r10)
                if (r5 != r0) goto Lb4
            Lb3:
                return r0
            Lb4:
                r5 = r1
                r1 = r11
            Lb6:
                r6.add(r1)
                r1 = r5
            Lba:
                r5 = r6
                r6 = r7
                goto L67
            Lbd:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41211.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super E> producerScope, zu.d<? super x0> dVar) {
            return ((C41211) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {194, 199, 200}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41221 extends n implements p {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel $this_drop;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41221(int i10, ReceiveChannel receiveChannel, zu.d dVar) {
            super(2, dVar);
            this.$n = i10;
            this.$this_drop = receiveChannel;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41221 c41221 = new C41221(this.$n, this.$this_drop, dVar);
            c41221.L$0 = obj;
            return c41221;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (r9 == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        
            if (r1 == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
        
            if (r4.send(r9, r8) == r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:23:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a4 -> B:8:0x001c). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L40
                if (r1 == r4) goto L32
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                tu.a0.throwOnFailure(r9)
            L1c:
                r9 = r4
                goto L7e
            L1e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L26:
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                tu.a0.throwOnFailure(r9)
                goto L8e
            L32:
                int r1 = r8.I$0
                java.lang.Object r5 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r9)
                goto L68
            L40:
                tu.a0.throwOnFailure(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                int r1 = r8.$n
                if (r1 < 0) goto L4d
                r5 = r4
                goto L4e
            L4d:
                r5 = 0
            L4e:
                if (r5 == 0) goto Laa
                if (r1 <= 0) goto L78
                kotlinx.coroutines.channels.ReceiveChannel r5 = r8.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r6 = r9
            L59:
                r8.L$0 = r6
                r8.L$1 = r5
                r8.I$0 = r1
                r8.label = r4
                java.lang.Object r9 = r5.hasNext(r8)
                if (r9 != r0) goto L68
                goto La6
            L68:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L77
                r5.next()
                int r1 = r1 + (-1)
                if (r1 != 0) goto L59
            L77:
                r9 = r6
            L78:
                kotlinx.coroutines.channels.ReceiveChannel r1 = r8.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            L7e:
                r8.L$0 = r9
                r8.L$1 = r1
                r8.label = r3
                java.lang.Object r4 = r1.hasNext(r8)
                if (r4 != r0) goto L8b
                goto La6
            L8b:
                r7 = r4
                r4 = r9
                r9 = r7
            L8e:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La7
                java.lang.Object r9 = r1.next()
                r8.L$0 = r4
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r9 = r4.send(r9, r8)
                if (r9 != r0) goto L1c
            La6:
                return r0
            La7:
                tu.x0 r9 = tu.x0.f87415a
                return r9
            Laa:
                java.lang.String r9 = "Requested element count "
                java.lang.String r0 = " is less than zero."
                java.lang.String r9 = p0.o2.k(r1, r9, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41221.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope producerScope, zu.d dVar) {
            return ((C41221) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41231 extends n implements p {
        final /* synthetic */ p $predicate;
        final /* synthetic */ ReceiveChannel $this_dropWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41231(ReceiveChannel receiveChannel, p pVar, zu.d dVar) {
            super(2, dVar);
            this.$this_dropWhile = receiveChannel;
            this.$predicate = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41231 c41231 = new C41231(this.$this_dropWhile, this.$predicate, dVar);
            c41231.L$0 = obj;
            return c41231;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
        
            if (r4.send(r12, r11) == r0) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[PHI: r1 r8 r12
          0x0061: PHI (r1v3 kotlinx.coroutines.channels.ChannelIterator) = (r1v5 kotlinx.coroutines.channels.ChannelIterator), (r1v15 kotlinx.coroutines.channels.ChannelIterator) binds: [B:21:0x007f, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r8v1 kotlinx.coroutines.channels.ProducerScope) = (r8v4 kotlinx.coroutines.channels.ProducerScope), (r8v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:21:0x007f, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r12v3 java.lang.Object) = (r12v8 java.lang.Object), (r12v0 java.lang.Object) binds: [B:21:0x007f, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a0 -> B:16:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ed -> B:10:0x0023). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41231.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope producerScope, zu.d dVar) {
            return ((C41231) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41241<E> extends bv.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41241(zu.d<? super C41241> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAt(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {83}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41251<E> extends bv.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41251(zu.d<? super C41251> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAtOrNull(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {228, 229, 229}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41261 extends n implements p {
        final /* synthetic */ p $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_filter;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41261(ReceiveChannel<? extends E> receiveChannel, p pVar, zu.d<? super C41261> dVar) {
            super(2, dVar);
            this.$this_filter = receiveChannel;
            this.$predicate = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41261 c41261 = new C41261(this.$this_filter, this.$predicate, dVar);
            c41261.L$0 = obj;
            return c41261;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L43
                if (r1 == r5) goto L37
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r10)
                goto L51
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.L$2
                java.lang.Object r6 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                tu.a0.throwOnFailure(r10)
                r8 = r6
                r6 = r1
                r1 = r8
                goto L81
            L37:
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r10)
                goto L60
            L43:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r9.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r6 = r10
            L51:
                r9.L$0 = r6
                r9.L$1 = r1
                r9.L$2 = r2
                r9.label = r5
                java.lang.Object r10 = r1.hasNext(r9)
                if (r10 != r0) goto L60
                goto L97
            L60:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9a
                java.lang.Object r10 = r1.next()
                kv.p r7 = r9.$predicate
                r9.L$0 = r6
                r9.L$1 = r1
                r9.L$2 = r10
                r9.label = r4
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r0) goto L7d
                goto L97
            L7d:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L81:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L98
                r9.L$0 = r7
                r9.L$1 = r1
                r9.L$2 = r2
                r9.label = r3
                java.lang.Object r10 = r7.send(r6, r9)
                if (r10 != r0) goto L98
            L97:
                return r0
            L98:
                r6 = r7
                goto L51
            L9a:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41261.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super E> producerScope, zu.d<? super x0> dVar) {
            return ((C41261) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {241, 242, 242}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41271 extends n implements p {
        final /* synthetic */ q $predicate;
        final /* synthetic */ ReceiveChannel $this_filterIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41271(ReceiveChannel receiveChannel, q qVar, zu.d dVar) {
            super(2, dVar);
            this.$this_filterIndexed = receiveChannel;
            this.$predicate = qVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41271 c41271 = new C41271(this.$this_filterIndexed, this.$predicate, dVar);
            c41271.L$0 = obj;
            return c41271;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L49
                if (r1 == r5) goto L3b
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
                int r1 = r11.I$0
                java.lang.Object r6 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                tu.a0.throwOnFailure(r12)
                goto L5b
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.I$0
                java.lang.Object r6 = r11.L$2
                java.lang.Object r7 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                java.lang.Object r8 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                tu.a0.throwOnFailure(r12)
                r10 = r7
                r7 = r6
                r6 = r10
                goto L95
            L3b:
                int r1 = r11.I$0
                java.lang.Object r6 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                tu.a0.throwOnFailure(r12)
                goto L6c
            L49:
                tu.a0.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                kotlinx.coroutines.channels.ReceiveChannel r1 = r11.$this_filterIndexed
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r6 = 0
                r7 = r6
                r6 = r1
                r1 = r7
                r7 = r12
            L5b:
                r11.L$0 = r7
                r11.L$1 = r6
                r11.L$2 = r2
                r11.I$0 = r1
                r11.label = r5
                java.lang.Object r12 = r6.hasNext(r11)
                if (r12 != r0) goto L6c
                goto Lad
            L6c:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb0
                java.lang.Object r12 = r6.next()
                kv.q r8 = r11.$predicate
                int r9 = r1 + 1
                java.lang.Integer r1 = bv.b.boxInt(r1)
                r11.L$0 = r7
                r11.L$1 = r6
                r11.L$2 = r12
                r11.I$0 = r9
                r11.label = r4
                java.lang.Object r1 = r8.invoke(r1, r12, r11)
                if (r1 != r0) goto L91
                goto Lad
            L91:
                r8 = r7
                r7 = r12
                r12 = r1
                r1 = r9
            L95:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lae
                r11.L$0 = r8
                r11.L$1 = r6
                r11.L$2 = r2
                r11.I$0 = r1
                r11.label = r3
                java.lang.Object r12 = r8.send(r7, r11)
                if (r12 != r0) goto Lae
            Lad:
                return r0
            Lae:
                r7 = r8
                goto L5b
            Lb0:
                tu.x0 r12 = tu.x0.f87415a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41271.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope producerScope, zu.d dVar) {
            return ((C41271) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41281 extends n implements p {
        final /* synthetic */ p $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41281(p pVar, zu.d dVar) {
            super(2, dVar);
            this.$predicate = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41281 c41281 = new C41281(this.$predicate, dVar);
            c41281.L$0 = obj;
            return c41281;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Object obj2 = this.L$0;
                p pVar = this.$predicate;
                this.label = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return bv.b.boxBoolean(!((Boolean) obj).booleanValue());
        }

        @Override // kv.p
        public final Object invoke(Object obj, zu.d dVar) {
            return ((C41281) create(obj, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41291 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C41291(zu.d<? super C41291> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41291 c41291 = new C41291(dVar);
            c41291.L$0 = obj;
            return c41291;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C41291) obj, (zu.d<? super Boolean>) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return bv.b.boxBoolean(this.L$0 != null);
        }

        public final Object invoke(E e10, zu.d<? super Boolean> dVar) {
            return ((C41291) create(e10, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41301<E, C extends Collection<? super E>> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41301(zu.d<? super C41301> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (Collection) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 272}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3, reason: invalid class name */
    public static final class AnonymousClass3<E, C extends SendChannel<? super E>> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(zu.d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (SendChannel) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {95}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41311<E> extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41311(zu.d<? super C41311> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.first(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41321<E> extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41321(zu.d<? super C41321> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.firstOrNull(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {351, 352, 352}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41331 extends n implements p {
        final /* synthetic */ ReceiveChannel $this_flatMap;
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41331(ReceiveChannel receiveChannel, p pVar, zu.d dVar) {
            super(2, dVar);
            this.$this_flatMap = receiveChannel;
            this.$transform = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41331 c41331 = new C41331(this.$this_flatMap, this.$transform, dVar);
            c41331.L$0 = obj;
            return c41331;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:13:0x004b). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3d
                if (r1 == r4) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                tu.a0.throwOnFailure(r8)
                goto L4b
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                tu.a0.throwOnFailure(r8)
                goto L73
            L31:
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                tu.a0.throwOnFailure(r8)
                goto L58
            L3d:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlinx.coroutines.channels.ReceiveChannel r1 = r7.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r5 = r8
            L4b:
                r7.L$0 = r5
                r7.L$1 = r1
                r7.label = r4
                java.lang.Object r8 = r1.hasNext(r7)
                if (r8 != r0) goto L58
                goto L81
            L58:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r1.next()
                kv.p r6 = r7.$transform
                r7.L$0 = r5
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r8 = r6.invoke(r8, r7)
                if (r8 != r0) goto L73
                goto L81
            L73:
                kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
                r7.L$0 = r5
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r8, r5, r7)
                if (r8 != r0) goto L4b
            L81:
                return r0
            L82:
                tu.x0 r8 = tu.x0.f87415a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41331.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope producerScope, zu.d dVar) {
            return ((C41331) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41341<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C41341(zu.d<? super C41341> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.indexOf(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {127, 130}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41351<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41351(zu.d<? super C41351> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.last(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41361<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C41361(zu.d<? super C41361> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastIndexOf(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {153, 156}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41371<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41371(zu.d<? super C41371> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastOrNull(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41381 extends n implements p {
        final /* synthetic */ ReceiveChannel<E> $this_map;
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41381(ReceiveChannel<? extends E> receiveChannel, p pVar, zu.d<? super C41381> dVar) {
            super(2, dVar);
            this.$this_map = receiveChannel;
            this.$transform = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41381 c41381 = new C41381(this.$this_map, this.$transform, dVar);
            c41381.L$0 = obj;
            return c41381;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:24:0x0075, B:28:0x0089, B:30:0x0091, B:20:0x005f, B:23:0x006e), top: B:44:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c0 -> B:24:0x0075). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41381.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super R> producerScope, zu.d<? super x0> dVar) {
            return ((C41381) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41391 extends n implements p {
        final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ q $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41391(ReceiveChannel<? extends E> receiveChannel, q qVar, zu.d<? super C41391> dVar) {
            super(2, dVar);
            this.$this_mapIndexed = receiveChannel;
            this.$transform = qVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41391 c41391 = new C41391(this.$this_mapIndexed, this.$transform, dVar);
            c41391.L$0 = obj;
            return c41391;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a6 -> B:13:0x0059). Please report as a decompilation issue!!! */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.I$0
                java.lang.Object r5 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r11)
                r11 = r6
                goto L59
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.I$0
                java.lang.Object r5 = r10.L$2
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                java.lang.Object r6 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                tu.a0.throwOnFailure(r11)
                goto L94
            L3a:
                int r1 = r10.I$0
                java.lang.Object r5 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r11)
                goto L6b
            L48:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r10.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r5 = 0
                r9 = r5
                r5 = r1
                r1 = r9
            L59:
                r10.L$0 = r11
                r10.L$1 = r5
                r10.I$0 = r1
                r10.label = r4
                java.lang.Object r6 = r5.hasNext(r10)
                if (r6 != r0) goto L68
                goto La5
            L68:
                r9 = r6
                r6 = r11
                r11 = r9
            L6b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La9
                java.lang.Object r11 = r5.next()
                kv.q r7 = r10.$transform
                int r8 = r1 + 1
                java.lang.Integer r1 = bv.b.boxInt(r1)
                r10.L$0 = r6
                r10.L$1 = r5
                r10.L$2 = r6
                r10.I$0 = r8
                r10.label = r3
                java.lang.Object r11 = r7.invoke(r1, r11, r10)
                if (r11 != r0) goto L90
                goto La5
            L90:
                r7 = r6
                r1 = r8
                r6 = r5
                r5 = r7
            L94:
                r10.L$0 = r7
                r10.L$1 = r6
                r8 = 0
                r10.L$2 = r8
                r10.I$0 = r1
                r10.label = r2
                java.lang.Object r11 = r5.send(r11, r10)
                if (r11 != r0) goto La6
            La5:
                return r0
            La6:
                r5 = r6
                r11 = r7
                goto L59
            La9:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41391.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super R> producerScope, zu.d<? super x0> dVar) {
            return ((C41391) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {450, 452}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41401<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C41401(zu.d<? super C41401> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.maxWith(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {464, 466}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41411<E> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C41411(zu.d<? super C41411> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.minWith(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {477}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41421<E> extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41421(zu.d<? super C41421> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.none(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41431 extends n implements p {
        final /* synthetic */ ReceiveChannel $this_requireNoNulls;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41431(ReceiveChannel receiveChannel, zu.d dVar) {
            super(2, dVar);
            this.$this_requireNoNulls = receiveChannel;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41431 c41431 = new C41431(this.$this_requireNoNulls, dVar);
            c41431.L$0 = obj;
            return c41431;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }

        @Override // kv.p
        public final Object invoke(Object obj, zu.d dVar) {
            return ((C41431) create(obj, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {166, 169}, m = C3533xd.f39226d, n = {"$this$consume$iv", "iterator", "$this$consume$iv", C3533xd.f39226d}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41441<E> extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41441(zu.d<? super C41441> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.single(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {179, 182}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", C3533xd.f39226d}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41451<E> extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41451(zu.d<? super C41451> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.singleOrNull(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {284, 285}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41461 extends n implements p {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel $this_take;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41461(int i10, ReceiveChannel receiveChannel, zu.d dVar) {
            super(2, dVar);
            this.$n = i10;
            this.$this_take = receiveChannel;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41461 c41461 = new C41461(this.$n, this.$this_take, dVar);
            c41461.L$0 = obj;
            return c41461;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        
            if (r6.send(r9, r8) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        
            if (r1 == 0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:7:0x001d). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 2
                tu.x0 r3 = tu.x0.f87415a
                r4 = 1
                if (r1 == 0) goto L35
                if (r1 == r4) goto L27
                if (r1 != r2) goto L1f
                int r1 = r8.I$0
                java.lang.Object r5 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r9)
            L1d:
                r9 = r6
                goto L7b
            L1f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L27:
                int r1 = r8.I$0
                java.lang.Object r5 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r9)
                goto L60
            L35:
                tu.a0.throwOnFailure(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                int r1 = r8.$n
                if (r1 != 0) goto L41
                return r3
            L41:
                if (r1 < 0) goto L45
                r5 = r4
                goto L46
            L45:
                r5 = 0
            L46:
                if (r5 == 0) goto L80
                kotlinx.coroutines.channels.ReceiveChannel r5 = r8.$this_take
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            L4e:
                r8.L$0 = r9
                r8.L$1 = r5
                r8.I$0 = r1
                r8.label = r4
                java.lang.Object r6 = r5.hasNext(r8)
                if (r6 != r0) goto L5d
                goto L7a
            L5d:
                r7 = r6
                r6 = r9
                r9 = r7
            L60:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7f
                java.lang.Object r9 = r5.next()
                r8.L$0 = r6
                r8.L$1 = r5
                r8.I$0 = r1
                r8.label = r2
                java.lang.Object r9 = r6.send(r9, r8)
                if (r9 != r0) goto L1d
            L7a:
                return r0
            L7b:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L4e
            L7f:
                return r3
            L80:
                java.lang.String r9 = "Requested element count "
                java.lang.String r0 = " is less than zero."
                java.lang.String r9 = p0.o2.k(r1, r9, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41461.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope producerScope, zu.d dVar) {
            return ((C41461) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, 300, Sdk.SDKError.Reason.MRAID_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41471 extends n implements p {
        final /* synthetic */ p $predicate;
        final /* synthetic */ ReceiveChannel $this_takeWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41471(ReceiveChannel receiveChannel, p pVar, zu.d dVar) {
            super(2, dVar);
            this.$this_takeWhile = receiveChannel;
            this.$predicate = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41471 c41471 = new C41471(this.$this_takeWhile, this.$predicate, dVar);
            c41471.L$0 = obj;
            return c41471;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0097 -> B:13:0x004f). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L41
                if (r1 == r5) goto L35
                if (r1 == r4) goto L27
                if (r1 != r3) goto L1f
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r10)
                goto L4f
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.L$2
                java.lang.Object r6 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                tu.a0.throwOnFailure(r10)
                goto L7e
            L35:
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                tu.a0.throwOnFailure(r10)
                goto L5c
            L41:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel r1 = r9.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r6 = r10
            L4f:
                r9.L$0 = r6
                r9.L$1 = r1
                r9.label = r5
                java.lang.Object r10 = r1.hasNext(r9)
                if (r10 != r0) goto L5c
                goto L96
            L5c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9a
                java.lang.Object r10 = r1.next()
                kv.p r7 = r9.$predicate
                r9.L$0 = r6
                r9.L$1 = r1
                r9.L$2 = r10
                r9.label = r4
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r0) goto L79
                goto L96
            L79:
                r8 = r1
                r1 = r10
                r10 = r7
                r7 = r6
                r6 = r8
            L7e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L87
                return r2
            L87:
                r9.L$0 = r7
                r9.L$1 = r6
                r10 = 0
                r9.L$2 = r10
                r9.label = r3
                java.lang.Object r10 = r7.send(r1, r9)
                if (r10 != r0) goto L97
            L96:
                return r0
            L97:
                r1 = r6
                r6 = r7
                goto L4f
            L9a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41471.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope producerScope, zu.d dVar) {
            return ((C41471) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 308}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41481<E, C extends SendChannel<? super E>> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41481(zu.d<? super C41481> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toChannel(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41491<E, C extends Collection<? super E>> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41491(zu.d<? super C41491> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toCollection(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2, reason: invalid class name */
    public static final class AnonymousClass2<K, V, M extends Map<? super K, ? super V>> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toMap(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {400, 401}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41501 extends n implements p {
        final /* synthetic */ ReceiveChannel $this_withIndex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41501(ReceiveChannel receiveChannel, zu.d dVar) {
            super(2, dVar);
            this.$this_withIndex = receiveChannel;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41501 c41501 = new C41501(this.$this_withIndex, dVar);
            c41501.L$0 = obj;
            return c41501;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007b -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                tu.a0.throwOnFailure(r10)
                r10 = r4
                r4 = r1
                r1 = r10
            L1e:
                r10 = r5
                goto L44
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                int r1 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                tu.a0.throwOnFailure(r10)
                goto L59
            L36:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel r1 = r9.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r4 = 0
            L44:
                r9.L$0 = r10
                r9.L$1 = r1
                r9.I$0 = r4
                r9.label = r3
                java.lang.Object r5 = r1.hasNext(r9)
                if (r5 != r0) goto L53
                goto L7a
            L53:
                r8 = r5
                r5 = r10
                r10 = r8
                r8 = r4
                r4 = r1
                r1 = r8
            L59:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L7e
                java.lang.Object r10 = r4.next()
                uu.g1 r6 = new uu.g1
                int r7 = r1 + 1
                r6.<init>(r1, r10)
                r9.L$0 = r5
                r9.L$1 = r4
                r9.I$0 = r7
                r9.label = r2
                java.lang.Object r10 = r5.send(r6, r9)
                if (r10 != r0) goto L7b
            L7a:
                return r0
            L7b:
                r1 = r4
                r4 = r7
                goto L1e
            L7e:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41501.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope producerScope, zu.d dVar) {
            return ((C41501) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 499, 501}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2, reason: invalid class name and case insensitive filesystem */
    public static final class C41512 extends n implements p {
        final /* synthetic */ ReceiveChannel<R> $other;
        final /* synthetic */ ReceiveChannel<E> $this_zip;
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41512(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, p pVar, zu.d<? super C41512> dVar) {
            super(2, dVar);
            this.$other = receiveChannel;
            this.$this_zip = receiveChannel2;
            this.$transform = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41512 c41512 = new C41512(this.$other, this.$this_zip, this.$transform, dVar);
            c41512.L$0 = obj;
            return c41512;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
        
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:24:0x0088, B:27:0x009d, B:29:0x00a5, B:20:0x006b, B:23:0x0080), top: B:49:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cd A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:33:0x00c5, B:35:0x00cd, B:15:0x004b), top: B:45:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41512.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super V> producerScope, zu.d<? super x0> dVar) {
            return ((C41512) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r4, zu.d r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            tu.a0.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            tu.a0.throwOnFailure(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            return r5
        L4e:
            throw r5     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.any(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    @tu.f
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, l lVar) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            return (R) lVar.invoke(receiveChannelOpenSubscription);
        } finally {
            b0.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            b0.finallyEnd(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d), top: B:42:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:14:0x0038). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r6, kv.l r7, zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41181
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kv.l r2 = (kv.l) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L65
        L3a:
            r6 = move-exception
            goto L8d
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.channels.ReceiveChannel r6 = r6.openSubscription()
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L89
            r5 = r8
            r8 = r6
            r6 = r5
        L52:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L86
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L86
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L86
            r0.label = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L61
            return r1
        L61:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L77
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L77
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L77
            r8 = r0
            r0 = r2
            goto L52
        L77:
            r6 = move-exception
            r7 = r0
            goto L8d
        L7a:
            kotlin.jvm.internal.b0.finallyStart(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r0, r3, r4, r3)
            kotlin.jvm.internal.b0.finallyEnd(r4)
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L86:
            r6 = move-exception
            r7 = r8
            goto L8d
        L89:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8d:
            kotlin.jvm.internal.b0.finallyStart(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r3, r4, r3)
            kotlin.jvm.internal.b0.finallyEnd(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(kotlinx.coroutines.channels.BroadcastChannel, kv.l, zu.d):java.lang.Object");
    }

    @tu.f
    private static final <E> Object consumeEach$$forInline(BroadcastChannel<E> broadcastChannel, l lVar, zu.d<? super x0> dVar) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            ChannelIterator<E> it = receiveChannelOpenSubscription.iterator();
            while (true) {
                b0.mark(3);
                b0.mark(0);
                Object objHasNext = it.hasNext(null);
                b0.mark(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    b0.finallyStart(1);
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
                    b0.finallyEnd(1);
                    return x0.f87415a;
                }
                lVar.invoke(it.next());
            }
        } catch (Throwable th2) {
            b0.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            b0.finallyEnd(1);
            throw th2;
        }
    }

    public static final l consumes(ReceiveChannel<?> receiveChannel) {
        return new d(receiveChannel, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 consumes$lambda$24$ChannelsKt__DeprecatedKt(ReceiveChannel receiveChannel, Throwable th2) {
        ChannelsKt.cancelConsumed(receiveChannel, th2);
        return x0.f87415a;
    }

    public static final l consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return new d(receiveChannelArr, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 consumesAll$lambda$2$ChannelsKt__DeprecatedKt(ReceiveChannel[] receiveChannelArr, Throwable th2) throws Throwable {
        Throwable th3 = null;
        for (ReceiveChannel receiveChannel : receiveChannelArr) {
            try {
                ChannelsKt.cancelConsumed(receiveChannel, th2);
            } catch (Throwable th4) {
                if (th3 == null) {
                    th3 = th4;
                } else {
                    h.addSuppressed(th3, th4);
                }
            }
        }
        if (th3 == null) {
            return x0.f87415a;
        }
        throw th3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0060, B:27:0x0068), top: B:43:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:25:0x0060). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r6, zu.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41191
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41191) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.z0 r4 = (kotlin.jvm.internal.z0) r4
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L83
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            tu.a0.throwOnFailure(r7)
            kotlin.jvm.internal.z0 r7 = new kotlin.jvm.internal.z0
            r7.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L80
            r4 = r7
            r7 = r6
            r6 = r2
        L4e:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7d
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L7d
            r0.label = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L7d
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r5 = r2
            r2 = r7
            r7 = r5
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L72
            r6.next()     // Catch: java.lang.Throwable -> L35
            int r7 = r4.f71866b     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r3
            r4.f71866b = r7     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4e
        L72:
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            int r6 = r4.f71866b
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L7d:
            r6 = move-exception
            r2 = r7
            goto L83
        L80:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L83:
            throw r6     // Catch: java.lang.Throwable -> L84
        L84:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel receiveChannel) {
        return distinctBy$default(receiveChannel, null, new C41201(null), 1, null);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, m mVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41211(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, mVar, pVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i10, m mVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41221(i10, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i10, m mVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return drop(receiveChannel, i10, mVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, m mVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41231(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return dropWhile(receiveChannel, mVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0064, B:27:0x006c, B:33:0x007d, B:34:0x0094), top: B:44:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0064, B:27:0x006c, B:33:0x007d, B:34:0x0094), top: B:44:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:25:0x0064). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, zu.d r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41241
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 46
            r4 = 1
            java.lang.String r5 = "ReceiveChannel doesn't contain element at index "
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L39
            goto L64
        L39:
            r9 = move-exception
            goto Lae
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            tu.a0.throwOnFailure(r11)
            if (r10 < 0) goto L99
            kotlinx.coroutines.channels.ChannelIterator r11 = r9.iterator()     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L4e:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L95
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L95
            r0.I$0 = r10     // Catch: java.lang.Throwable -> L95
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L95
            r0.label = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r11.hasNext(r0)     // Catch: java.lang.Throwable -> L95
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L39
            int r7 = r9 + 1
            if (r10 != r9) goto L79
            r9 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            return r11
        L79:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4e
        L7d:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r11.<init>()     // Catch: java.lang.Throwable -> L39
            r11.append(r5)     // Catch: java.lang.Throwable -> L39
            r11.append(r10)     // Catch: java.lang.Throwable -> L39
            r11.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        L95:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lae
        L99:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L95
            r0.append(r10)     // Catch: java.lang.Throwable -> L95
            r0.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L95
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L95
            throw r11     // Catch: java.lang.Throwable -> L95
        Lae:
            throw r9     // Catch: java.lang.Throwable -> Laf
        Laf:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(kotlinx.coroutines.channels.ReceiveChannel, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:27:0x0068, B:29:0x0070, B:23:0x0053, B:22:0x004e), top: B:43:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:27:0x0068). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, zu.d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41251
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            tu.a0.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3b
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r0
            r0 = r7
            goto L68
        L3b:
            r8 = move-exception
            goto L88
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            tu.a0.throwOnFailure(r10)
            if (r9 >= 0) goto L4e
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L4e:
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> L80
            r2 = 0
        L53:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L80
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L80
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r5 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L80
            if (r5 != r1) goto L64
            return r1
        L64:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r7
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L80
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r10 == 0) goto L84
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L80
            int r6 = r2 + 1
            if (r9 != r2) goto L7c
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r10
        L7c:
            r10 = r0
            r0 = r5
            r2 = r6
            goto L53
        L80:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto L88
        L84:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel, int, zu.d):java.lang.Object");
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, m mVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41261(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, mVar, pVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, m mVar, q qVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41271(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, m mVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return filterIndexed(receiveChannel, mVar, qVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, m mVar, p pVar) {
        return ChannelsKt.filter(receiveChannel, mVar, new C41281(pVar, null));
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return filterNot(receiveChannel, mVar, pVar);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> receiveChannelFilter$default = filter$default(receiveChannel, null, new C41291(null), 1, null);
        e0.checkNotNull(receiveChannelFilter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return receiveChannelFilter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:29:0x006a, B:21:0x004a), top: B:41:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Collection r6, zu.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41301
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L78
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L74
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
        L6d:
            r7 = r2
            goto L4a
        L6f:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r2
        L74:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L78:
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0053, B:25:0x005b, B:28:0x0064, B:29:0x006b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0053, B:25:0x005b, B:28:0x0064, B:29:0x006b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r5, zu.d r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41311
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L6c
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6c
            r0.label = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L64
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r6)
            return r5
        L64:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L31
        L6c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L70
        L70:
            r6 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.first(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r5, zu.d r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41321
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L68
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L68
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L68
            r0.label = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r6 != 0) goto L60
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r1
        L60:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r5
        L68:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6b:
            throw r5     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.firstOrNull(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, m mVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41331(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return flatMap(receiveChannel, mVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:37:0x008b, B:39:0x0093), top: B:51:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0087 -> B:37:0x008b). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r6, zu.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41351
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L36
            goto L8b
        L36:
            r6 = move-exception
            r2 = r4
            goto Laa
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L4e
            goto L69
        L4e:
            r6 = move-exception
            goto Laa
        L51:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9e
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9e
            r0.label = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L65
            goto L86
        L65:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L69:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto La2
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4e
            r5 = r2
            r2 = r6
            r6 = r5
        L78:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9e
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L9e
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L9e
            r0.label = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r4 != r1) goto L87
        L86:
            return r1
        L87:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L99
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L36
            r6 = r4
            goto L78
        L99:
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
            return r6
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto Laa
        La2:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            throw r6     // Catch: java.lang.Throwable -> L4e
        Laa:
            throw r6     // Catch: java.lang.Throwable -> Lab
        Lab:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007d, B:29:0x0087, B:30:0x008b, B:21:0x005f), top: B:42:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:25:0x0075). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, zu.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41361
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r7 = r0.L$4
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.z0 r2 = (kotlin.jvm.internal.z0) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.z0 r4 = (kotlin.jvm.internal.z0) r4
            java.lang.Object r5 = r0.L$0
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3b
            goto L75
        L3b:
            r7 = move-exception
            goto La1
        L3e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L46:
            tu.a0.throwOnFailure(r9)
            kotlin.jvm.internal.z0 r9 = new kotlin.jvm.internal.z0
            r9.<init>()
            r2 = -1
            r9.f71866b = r2
            kotlin.jvm.internal.z0 r2 = new kotlin.jvm.internal.z0
            r2.<init>()
            kotlinx.coroutines.channels.ChannelIterator r4 = r7.iterator()     // Catch: java.lang.Throwable -> L9d
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L5f:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L3b
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$4 = r7     // Catch: java.lang.Throwable -> L3b
            r0.label = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 != r1) goto L72
            return r1
        L72:
            r6 = r5
            r5 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3b
            boolean r9 = kotlin.jvm.internal.e0.areEqual(r5, r9)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L8b
            int r9 = r2.f71866b     // Catch: java.lang.Throwable -> L3b
            r4.f71866b = r9     // Catch: java.lang.Throwable -> L3b
        L8b:
            int r9 = r2.f71866b     // Catch: java.lang.Throwable -> L3b
            int r9 = r9 + r3
            r2.f71866b = r9     // Catch: java.lang.Throwable -> L3b
            r9 = r5
            goto L5f
        L92:
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            int r7 = r4.f71866b
            java.lang.Integer r7 = bv.b.boxInt(r7)
            return r7
        L9d:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La1:
            throw r7     // Catch: java.lang.Throwable -> La2
        La2:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:39:0x008f, B:41:0x0097), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008b -> B:39:0x008f). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, zu.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41371
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            r2 = r4
            goto La4
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r7 = move-exception
            goto La4
        L51:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La1
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La1
            r0.label = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L65
            goto L8a
        L65:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L75
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r5)
            return r5
        L75:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4f
            r6 = r2
            r2 = r7
            r7 = r6
        L7c:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La1
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La1
            r0.L$2 = r8     // Catch: java.lang.Throwable -> La1
            r0.label = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L37
            r7 = r4
            goto L7c
        L9d:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            return r7
        La1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, m mVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41381(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, mVar, pVar);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, m mVar, q qVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41391(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, m mVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, mVar, qVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, m mVar, q qVar) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, mVar, qVar));
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, m mVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, mVar, qVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, m mVar, p pVar) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, mVar, pVar));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return mapNotNull(receiveChannel, mVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:40:0x00a3, B:42:0x00ab, B:36:0x008e, B:26:0x0062), top: B:58:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009f -> B:15:0x003d). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, zu.d r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:40:0x00a3, B:42:0x00ab, B:36:0x008e, B:26:0x0062), top: B:58:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009f -> B:15:0x003d). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, zu.d r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r4, zu.d r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41421
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            tu.a0.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            tu.a0.throwOnFailure(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2d
            r5 = r5 ^ r3
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            return r5
        L59:
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.none(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel receiveChannel) {
        return map$default(receiveChannel, null, new C41431(receiveChannel, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:41:0x0096, B:42:0x009d), top: B:53:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:35:0x0081, B:39:0x008e, B:40:0x0095), top: B:51:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:41:0x0096, B:42:0x009d), top: B:53:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r6, zu.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41441
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r6 = move-exception
            r2 = r0
            goto La1
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r6 = move-exception
            goto La1
        L4c:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9e
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9e
            r0.label = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L60
            goto L7c
        L60:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L96
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4a
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L4a
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L4a
            if (r6 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r2
        L81:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L32
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L8e
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r7)
            return r6
        L8e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L96:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            throw r6     // Catch: java.lang.Throwable -> L4a
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.single(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, zu.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41451
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L33
            goto L86
        L33:
            r7 = move-exception
            r2 = r0
            goto L99
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7 = move-exception
            goto L99
        L4d:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L96
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L96
            r0.label = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L61
            goto L81
        L61:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L71
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r5)
            return r5
        L71:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L4b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L4b
            r0.label = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r2
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L92
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            return r5
        L92:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            return r7
        L96:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.singleOrNull(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i10, m mVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41461(i10, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i10, m mVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return take(receiveChannel, i10, mVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, m mVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41471(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return takeWhile(receiveChannel, mVar, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r2.send(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0034, B:28:0x0070, B:30:0x0078, B:20:0x0051), top: B:45:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0088 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, C r7, zu.d<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41481
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3b
        L37:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5c
        L3b:
            r6 = move-exception
            goto L94
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3b
            goto L70
        L55:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L90
        L5c:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L90
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L90
            r0.label = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L90
            if (r2 != r1) goto L6b
            goto L8a
        L6b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L3b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L3b
            r0.label = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L3b
            if (r8 != r1) goto L37
        L8a:
            return r1
        L8b:
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L90:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L94:
            throw r6     // Catch: java.lang.Throwable -> L95
        L95:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, C r6, zu.d<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41491
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L76
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L72
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r2
        L72:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L76:
            throw r5     // Catch: java.lang.Throwable -> L77
        L77:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, zu.d):java.lang.Object");
    }

    @tu.f
    public static final /* synthetic */ Object toMap(ReceiveChannel receiveChannel, zu.d dVar) {
        return ChannelsKt.toMap(receiveChannel, new LinkedHashMap(), dVar);
    }

    @tu.f
    public static final /* synthetic */ Object toMutableList(ReceiveChannel receiveChannel, zu.d dVar) {
        return ChannelsKt.toCollection(receiveChannel, new ArrayList(), dVar);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, zu.d<? super Set<E>> dVar) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), dVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, m mVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumes(receiveChannel), new C41501(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return withIndex(receiveChannel, mVar);
    }

    @tu.f
    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2) {
        return zip$default(receiveChannel, receiveChannel2, null, new e(), 2, null);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, mVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053), top: B:44:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, zu.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41341
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C41341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.z0 r2 = (kotlin.jvm.internal.z0) r2
            java.lang.Object r4 = r0.L$0
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L37
            goto L67
        L37:
            r7 = move-exception
            goto L98
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 0
            java.lang.String r8 = androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN.HThOejarnC
            r7.<init>(r8)
            throw r7
        L42:
            tu.a0.throwOnFailure(r9)
            kotlin.jvm.internal.z0 r9 = new kotlin.jvm.internal.z0
            r9.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L94
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L53:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L37
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L37
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L37
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L37
            r0.label = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r4
            r4 = r9
            r9 = r6
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = kotlin.jvm.internal.e0.areEqual(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L84
            int r7 = r2.f71866b     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r7 = bv.b.boxInt(r7)     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            return r7
        L84:
            int r9 = r2.f71866b     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r3
            r2.f71866b = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L53
        L8b:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            r7 = -1
            java.lang.Integer r7 = bv.b.boxInt(r7)
            return r7
        L94:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L98:
            throw r7     // Catch: java.lang.Throwable -> L99
        L99:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends tu.v> r6, M r7, zu.d<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            java.util.Map r2 = (java.util.Map) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L80
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7c
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            tu.v r8 = (tu.v) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r8.getFirst()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.getSecond()     // Catch: java.lang.Throwable -> L35
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L77:
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L7c:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L80:
            throw r6     // Catch: java.lang.Throwable -> L81
        L81:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, zu.d):java.lang.Object");
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, m mVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, mVar, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new C41512(receiveChannel2, receiveChannel, pVar, null), 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r2.send(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:20:0x004f), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:35:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:35:0x008b). Please report as a decompilation issue!!! */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.SendChannel r7, zu.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L38
            goto L8b
        L38:
            r6 = move-exception
            goto L98
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L38
            goto L6e
        L53:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L94
        L5a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L94
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L94
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L94
            r0.label = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L69
            goto L8a
        L69:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L38
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L8b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L38
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L38
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L38
            r0.label = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L38
            if (r8 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5a
        L8f:
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L94:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L98:
            throw r6     // Catch: java.lang.Throwable -> L99
        L99:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, zu.d):java.lang.Object");
    }
}
