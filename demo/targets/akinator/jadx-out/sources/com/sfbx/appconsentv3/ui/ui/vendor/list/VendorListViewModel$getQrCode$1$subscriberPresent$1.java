package com.sfbx.appconsentv3.ui.ui.vendor.list;

import av.e;
import bv.b;
import bv.f;
import bv.n;
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
@f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$1$subscriberPresent$1", f = "VendorListViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class VendorListViewModel$getQrCode$1$subscriberPresent$1 extends n implements p {
    final /* synthetic */ boolean $forced;
    int label;
    final /* synthetic */ VendorListViewModel this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$1$subscriberPresent$1$1", f = "VendorListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$1$subscriberPresent$1$1, reason: invalid class name */
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
            return b.boxBoolean(this.I$0 > 0);
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (d<? super Boolean>) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorListViewModel$getQrCode$1$subscriberPresent$1(VendorListViewModel vendorListViewModel, boolean z10, d<? super VendorListViewModel$getQrCode$1$subscriberPresent$1> dVar) {
        super(2, dVar);
        this.this$0 = vendorListViewModel;
        this.$forced = z10;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new VendorListViewModel$getQrCode$1$subscriberPresent$1(this.this$0, this.$forced, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            if (this.this$0._qrCode.getSubscriptionCount().getValue().intValue() > 0) {
                ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "VendorListViewModel", "Abonné déjà présent.", null, 4, null);
                z10 = this.$forced;
                return b.boxBoolean(z10);
            }
            ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "VendorListViewModel", "En attente d'un abonné...", null, 4, null);
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
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "VendorListViewModel", "Abonné détecté !", null, 4, null);
        z10 = this.$forced;
        return b.boxBoolean(z10);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super Boolean> dVar) {
        return ((VendorListViewModel$getQrCode$1$subscriberPresent$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
