package com.sfbx.appconsentv3.ui.ui.consentable.stack;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.FlowCollector;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackViewModel extends AbstractTrackingViewModel {
    private Stack stack;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1", f = "StackViewModel.kt", i = {0}, l = {27, 30}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ int $consentableId;
        final /* synthetic */ ConsentStatus $newStatus;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1$1", f = "StackViewModel.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05151 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05151(m1 m1Var, d<? super C05151> dVar) {
                super(3, dVar);
                this.$$this$liveData = m1Var;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Throwable th2 = (Throwable) this.L$0;
                    m1 m1Var = this.$$this$liveData;
                    Response.Error error = new Response.Error(th2, null, 2, null);
                    this.label = 1;
                    if (m1Var.emit(error, this) == coroutine_suspended) {
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

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05151 c05151 = new C05151(this.$$this$liveData, dVar);
                c05151.L$0 = th2;
                return c05151.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, ConsentStatus consentStatus, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$consentableId = i10;
            this.$newStatus = consentStatus;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = StackViewModel.this.new AnonymousClass1(this.$consentableId, this.$newStatus, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((AnonymousClass1) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        
            if (r10.collect(r3, r9) == r0) goto L15;
         */
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
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r10)
                goto L65
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r10)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r10 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r10.<init>()
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L3a
                goto L64
            L3a:
                com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel r10 = com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r3 = com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel.access$getAppConsentCore(r10)
                int r4 = r9.$consentableId
                com.sfbx.appconsent.core.model.ConsentStatus r5 = r9.$newStatus
                r7 = 4
                r8 = 0
                r6 = 0
                kotlinx.coroutines.flow.Flow r10 = com.sfbx.appconsent.core.AppConsentCoreContract.DefaultImpls.setConsentableStatus$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1$1 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1$1
                r4 = 0
                r3.<init>(r1, r4)
                kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.m5171catch(r10, r3)
                com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1$2 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setConsent$1$2
                r3.<init>()
                r9.L$0 = r4
                r9.label = r2
                java.lang.Object r10 = r10.collect(r3, r9)
                if (r10 != r0) goto L65
            L64:
                return r0
            L65:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1", f = "StackViewModel.kt", i = {0}, l = {35, 38}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37071 extends n implements p {
        final /* synthetic */ int $id;
        final /* synthetic */ ConsentStatus $newStatus;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1$1", f = "StackViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05161 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05161(m1 m1Var, d<? super C05161> dVar) {
                super(3, dVar);
                this.$$this$liveData = m1Var;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Throwable th2 = (Throwable) this.L$0;
                    m1 m1Var = this.$$this$liveData;
                    Response.Error error = new Response.Error(th2, null, 2, null);
                    this.label = 1;
                    if (m1Var.emit(error, this) == coroutine_suspended) {
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

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05161 c05161 = new C05161(this.$$this$liveData, dVar);
                c05161.L$0 = th2;
                return c05161.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37071(int i10, ConsentStatus consentStatus, d<? super C37071> dVar) {
            super(2, dVar);
            this.$id = i10;
            this.$newStatus = consentStatus;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37071 c37071 = StackViewModel.this.new C37071(this.$id, this.$newStatus, dVar);
            c37071.L$0 = obj;
            return c37071;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((C37071) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        
            if (r10.collect(r3, r9) == r0) goto L15;
         */
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
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r10)
                goto L65
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r10)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r10 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r10.<init>()
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L3a
                goto L64
            L3a:
                com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel r10 = com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r3 = com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel.access$getAppConsentCore(r10)
                int r4 = r9.$id
                com.sfbx.appconsent.core.model.ConsentStatus r5 = r9.$newStatus
                r7 = 4
                r8 = 0
                r6 = 0
                kotlinx.coroutines.flow.Flow r10 = com.sfbx.appconsent.core.AppConsentCoreContract.DefaultImpls.setStackStatus$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1$1 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1$1
                r4 = 0
                r3.<init>(r1, r4)
                kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.m5171catch(r10, r3)
                com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1$2 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel$setStackConsent$1$2
                r3.<init>()
                r9.L$0 = r4
                r9.label = r2
                java.lang.Object r10 = r10.collect(r3, r9)
                if (r10 != r0) goto L65
            L64:
                return r0
            L65:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel.C37071.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackViewModel(AppConsentCore appConsentCore) {
        super(appConsentCore);
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
    }

    public final Stack getStack(int i10) {
        for (Stack stack : getAppConsentCore().getConsentInCache().getStacks()) {
            if (stack.getId() == i10) {
                this.stack = stack;
                if (stack != null) {
                    return stack;
                }
                e0.throwUninitializedPropertyAccessException("stack");
                return null;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final l1 setConsent(int i10, ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new AnonymousClass1(i10, newStatus, null), 3, (Object) null);
    }

    public final l1 setStackConsent(int i10, ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new C37071(i10, newStatus, null), 3, (Object) null);
    }
}
