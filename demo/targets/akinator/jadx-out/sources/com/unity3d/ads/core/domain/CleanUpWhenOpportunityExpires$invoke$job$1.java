package com.unity3d.ads.core.domain;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", i = {}, l = {33, 34, 39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends n implements p {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$adObject = adObject;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$adObject, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                this.$adObject.getState().setValue(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                this.label = 1;
                if (adPlayer.destroy(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, d<? super CleanUpWhenOpportunityExpires$invoke$job$1> dVar) {
        super(2, dVar);
        this.$adObject = adObject;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            tu.a0.throwOnFailure(r7)
            goto L7b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            tu.a0.throwOnFailure(r7)
            goto L5a
        L21:
            tu.a0.throwOnFailure(r7)
            goto L4e
        L25:
            tu.a0.throwOnFailure(r7)
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.getTtl()
            java.lang.Object r7 = r7.getValue()
            tv.f r7 = (tv.f) r7
            if (r7 == 0) goto L3b
        L36:
            long r4 = r7.m7225unboximpl()
            goto L51
        L3b:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.getTtl()
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r7)
            r6.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r6)
            if (r7 != r0) goto L4e
            goto L7a
        L4e:
            tv.f r7 = (tv.f) r7
            goto L36
        L51:
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m5128delayVtjQ1oo(r4, r6)
            if (r7 != r0) goto L5a
            goto L7a
        L5a:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.getState()
            java.lang.Object r7 = r7.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r7 == r1) goto L7b
            kotlinx.coroutines.NonCancellable r7 = kotlinx.coroutines.NonCancellable.INSTANCE
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r1 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r3 = r6.$adObject
            r4 = 0
            r1.<init>(r3, r4)
            r6.label = r2
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
            if (r7 != r0) goto L7b
        L7a:
            return r0
        L7b:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
