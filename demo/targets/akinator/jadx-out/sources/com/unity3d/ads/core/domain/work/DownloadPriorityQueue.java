package com.unity3d.ads.core.domain.work;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.p;
import tu.a0;
import tu.x0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DownloadPriorityQueue {
    private final Mutex mutex = MutexKt.Mutex(false);
    private final MutableStateFlow<PriorityItem> nextTurn = StateFlowKt.MutableStateFlow(null);
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return d.compareValues(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t10).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t11).getPriority()));
        }
    });

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", f = "DownloadPriorityQueue.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3}, l = {47, 28, 31, 57}, m = "invoke", n = {"this", "downloadAction", "priorityItem", "$this$withLock_u24default$iv", "this", "downloadAction", "priorityItem", "this", "priorityItem", "this", "priorityItem", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadPriorityQueue.this.invoke(0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        final /* synthetic */ PriorityItem $priorityItem;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PriorityItem priorityItem, zu.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$priorityItem = priorityItem;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$priorityItem, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kv.p
        public final Object invoke(PriorityItem priorityItem, zu.d<? super Boolean> dVar) {
            return ((AnonymousClass3) create(priorityItem, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return b.boxBoolean(((PriorityItem) this.L$0) == this.$priorityItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[PHI: r2 r11
      0x0054: PHI (r2v6 com.unity3d.ads.core.domain.work.DownloadPriorityQueue) = 
      (r2v5 com.unity3d.ads.core.domain.work.DownloadPriorityQueue)
      (r2v11 com.unity3d.ads.core.domain.work.DownloadPriorityQueue)
     binds: [B:31:0x00d7, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r11v6 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem) = 
      (r11v5 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem)
      (r11v16 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem)
     binds: [B:31:0x00d7, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(int r11, kv.l r12, zu.d<? super tu.x0> r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke(int, kv.l, zu.d):java.lang.Object");
    }
}
