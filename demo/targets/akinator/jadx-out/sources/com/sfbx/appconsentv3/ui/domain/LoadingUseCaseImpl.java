package com.sfbx.appconsentv3.ui.domain;

import bv.f;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadingUseCaseImpl implements LoadingUseCase {
    private final CoroutineDispatcher defaultDispatcher;
    private final GetCountryFromBOUseCase getCountryFromBOUseCase;
    private final IsGDPRCacheObsoleteUseCase isGDPRCacheObsoleteUseCase;
    private final IsGDPRForceByClientUseCase isGDPRForceByClientUseCase;
    private final IsGDPRFromCacheUseCase isGDPRFromCacheUseCase;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl$invoke$2", f = "LoadingUseCaseImpl.kt", i = {1}, l = {21, 30, 37}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = LoadingUseCaseImpl.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        
            if (r6 == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L26;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r6)
                goto L70
            L22:
                tu.a0.throwOnFailure(r6)
                goto L97
            L26:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.this
                com.sfbx.appconsentv3.ui.domain.IsGDPRForceByClientUseCase r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.access$isGDPRForceByClientUseCase$p(r6)
                java.lang.Object r6 = r6.get()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L4d
                java.lang.Boolean r6 = bv.b.boxBoolean(r4)
                r5.label = r4
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L97
                goto L96
            L4d:
                com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.this
                com.sfbx.appconsentv3.ui.domain.IsGDPRCacheObsoleteUseCase r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.access$isGDPRCacheObsoleteUseCase$p(r6)
                java.lang.Object r6 = r6.get()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L77
                com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.this
                com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCase r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.access$getGetCountryFromBOUseCase$p(r6)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.invoke(r5)
                if (r6 != r0) goto L70
                goto L96
            L70:
                com.sfbx.appconsentv3.ui.model.CountryCore r6 = (com.sfbx.appconsentv3.ui.model.CountryCore) r6
                boolean r6 = r6.getGdpr()
                goto L87
            L77:
                com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.this
                com.sfbx.appconsentv3.ui.domain.IsGDPRFromCacheUseCase r6 = com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.access$isGDPRFromCacheUseCase$p(r6)
                java.lang.Object r6 = r6.get()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
            L87:
                java.lang.Boolean r6 = bv.b.boxBoolean(r6)
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L97
            L96:
                return r0
            L97:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass2) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public LoadingUseCaseImpl(CoroutineDispatcher defaultDispatcher, IsGDPRForceByClientUseCase isGDPRForceByClientUseCase, IsGDPRFromCacheUseCase isGDPRFromCacheUseCase, IsGDPRCacheObsoleteUseCase isGDPRCacheObsoleteUseCase, GetCountryFromBOUseCase getCountryFromBOUseCase) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(isGDPRForceByClientUseCase, "isGDPRForceByClientUseCase");
        e0.checkNotNullParameter(isGDPRFromCacheUseCase, "isGDPRFromCacheUseCase");
        e0.checkNotNullParameter(isGDPRCacheObsoleteUseCase, "isGDPRCacheObsoleteUseCase");
        e0.checkNotNullParameter(getCountryFromBOUseCase, "getCountryFromBOUseCase");
        this.defaultDispatcher = defaultDispatcher;
        this.isGDPRForceByClientUseCase = isGDPRForceByClientUseCase;
        this.isGDPRFromCacheUseCase = isGDPRFromCacheUseCase;
        this.isGDPRCacheObsoleteUseCase = isGDPRCacheObsoleteUseCase;
        this.getCountryFromBOUseCase = getCountryFromBOUseCase;
    }

    private final CoroutineDispatcher component1() {
        return this.defaultDispatcher;
    }

    private final IsGDPRForceByClientUseCase component2() {
        return this.isGDPRForceByClientUseCase;
    }

    private final IsGDPRFromCacheUseCase component3() {
        return this.isGDPRFromCacheUseCase;
    }

    private final IsGDPRCacheObsoleteUseCase component4() {
        return this.isGDPRCacheObsoleteUseCase;
    }

    private final GetCountryFromBOUseCase component5() {
        return this.getCountryFromBOUseCase;
    }

    public static /* synthetic */ LoadingUseCaseImpl copy$default(LoadingUseCaseImpl loadingUseCaseImpl, CoroutineDispatcher coroutineDispatcher, IsGDPRForceByClientUseCase isGDPRForceByClientUseCase, IsGDPRFromCacheUseCase isGDPRFromCacheUseCase, IsGDPRCacheObsoleteUseCase isGDPRCacheObsoleteUseCase, GetCountryFromBOUseCase getCountryFromBOUseCase, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineDispatcher = loadingUseCaseImpl.defaultDispatcher;
        }
        if ((i10 & 2) != 0) {
            isGDPRForceByClientUseCase = loadingUseCaseImpl.isGDPRForceByClientUseCase;
        }
        if ((i10 & 4) != 0) {
            isGDPRFromCacheUseCase = loadingUseCaseImpl.isGDPRFromCacheUseCase;
        }
        if ((i10 & 8) != 0) {
            isGDPRCacheObsoleteUseCase = loadingUseCaseImpl.isGDPRCacheObsoleteUseCase;
        }
        if ((i10 & 16) != 0) {
            getCountryFromBOUseCase = loadingUseCaseImpl.getCountryFromBOUseCase;
        }
        GetCountryFromBOUseCase getCountryFromBOUseCase2 = getCountryFromBOUseCase;
        IsGDPRFromCacheUseCase isGDPRFromCacheUseCase2 = isGDPRFromCacheUseCase;
        return loadingUseCaseImpl.copy(coroutineDispatcher, isGDPRForceByClientUseCase, isGDPRFromCacheUseCase2, isGDPRCacheObsoleteUseCase, getCountryFromBOUseCase2);
    }

    public final LoadingUseCaseImpl copy(CoroutineDispatcher defaultDispatcher, IsGDPRForceByClientUseCase isGDPRForceByClientUseCase, IsGDPRFromCacheUseCase isGDPRFromCacheUseCase, IsGDPRCacheObsoleteUseCase isGDPRCacheObsoleteUseCase, GetCountryFromBOUseCase getCountryFromBOUseCase) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(isGDPRForceByClientUseCase, "isGDPRForceByClientUseCase");
        e0.checkNotNullParameter(isGDPRFromCacheUseCase, "isGDPRFromCacheUseCase");
        e0.checkNotNullParameter(isGDPRCacheObsoleteUseCase, "isGDPRCacheObsoleteUseCase");
        e0.checkNotNullParameter(getCountryFromBOUseCase, "getCountryFromBOUseCase");
        return new LoadingUseCaseImpl(defaultDispatcher, isGDPRForceByClientUseCase, isGDPRFromCacheUseCase, isGDPRCacheObsoleteUseCase, getCountryFromBOUseCase);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingUseCaseImpl)) {
            return false;
        }
        LoadingUseCaseImpl loadingUseCaseImpl = (LoadingUseCaseImpl) obj;
        return e0.areEqual(this.defaultDispatcher, loadingUseCaseImpl.defaultDispatcher) && e0.areEqual(this.isGDPRForceByClientUseCase, loadingUseCaseImpl.isGDPRForceByClientUseCase) && e0.areEqual(this.isGDPRFromCacheUseCase, loadingUseCaseImpl.isGDPRFromCacheUseCase) && e0.areEqual(this.isGDPRCacheObsoleteUseCase, loadingUseCaseImpl.isGDPRCacheObsoleteUseCase) && e0.areEqual(this.getCountryFromBOUseCase, loadingUseCaseImpl.getCountryFromBOUseCase);
    }

    public int hashCode() {
        return this.getCountryFromBOUseCase.hashCode() + ((this.isGDPRCacheObsoleteUseCase.hashCode() + ((this.isGDPRFromCacheUseCase.hashCode() + ((this.isGDPRForceByClientUseCase.hashCode() + (this.defaultDispatcher.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.sfbx.appconsentv3.ui.domain.SimpleFlowUseCase
    public Object invoke(d<? super Flow<? extends Boolean>> dVar) {
        return FlowKt.flowOn(FlowKt.flow(new AnonymousClass2(null)), this.defaultDispatcher);
    }

    public String toString() {
        return "LoadingUseCaseImpl(defaultDispatcher=" + this.defaultDispatcher + ", isGDPRForceByClientUseCase=" + this.isGDPRForceByClientUseCase + ", isGDPRFromCacheUseCase=" + this.isGDPRFromCacheUseCase + ", isGDPRCacheObsoleteUseCase=" + this.isGDPRCacheObsoleteUseCase + ", getCountryFromBOUseCase=" + this.getCountryFromBOUseCase + ')';
    }

    public /* synthetic */ LoadingUseCaseImpl(CoroutineDispatcher coroutineDispatcher, IsGDPRForceByClientUseCase isGDPRForceByClientUseCase, IsGDPRFromCacheUseCase isGDPRFromCacheUseCase, IsGDPRCacheObsoleteUseCase isGDPRCacheObsoleteUseCase, GetCountryFromBOUseCase getCountryFromBOUseCase, int i10, u uVar) {
        this((i10 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, isGDPRForceByClientUseCase, isGDPRFromCacheUseCase, isGDPRCacheObsoleteUseCase, getCountryFromBOUseCase);
    }
}
