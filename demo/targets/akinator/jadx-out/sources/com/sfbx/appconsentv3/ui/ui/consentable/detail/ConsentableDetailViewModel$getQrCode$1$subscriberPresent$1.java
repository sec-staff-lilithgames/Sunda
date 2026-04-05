package com.sfbx.appconsentv3.ui.ui.consentable.detail;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1", f = "ConsentableDetailViewModel.kt", i = {}, l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1 extends n implements p {
    final /* synthetic */ boolean $forced;
    int label;
    final /* synthetic */ ConsentableDetailViewModel this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1$1", f = "ConsentableDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i10, d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return bv.b.boxBoolean(this.I$0 > 0);
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (d<? super Boolean>) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1(ConsentableDetailViewModel consentableDetailViewModel, boolean z10, d<? super ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1> dVar) {
        super(2, dVar);
        this.this$0 = consentableDetailViewModel;
        this.$forced = z10;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1(this.this$0, this.$forced, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            if (this.this$0._qrCode.getSubscriptionCount().getValue().intValue() > 0) {
                ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "ConsentableDetailViewModel", "Abonné déjà présent.", null, 4, null);
                z10 = this.$forced;
                return bv.b.boxBoolean(z10);
            }
            ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "ConsentableDetailViewModel", "En attente d'un abonné...", null, 4, null);
            StateFlow<Integer> subscriptionCount = this.this$0._qrCode.getSubscriptionCount();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(subscriptionCount, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "ConsentableDetailViewModel", "Abonné détecté !", null, 4, null);
        z10 = this.$forced;
        return bv.b.boxBoolean(z10);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super Boolean> dVar) {
        return ((ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
