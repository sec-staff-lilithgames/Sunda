package com.sfbx.appconsentv3.ui.ui.load;

import androidx.lifecycle.g3;
import androidx.lifecycle.l1;
import androidx.lifecycle.t1;
import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.sfbx.appconsentv3.ui.domain.GetLoadUseCase;
import com.sfbx.appconsentv3.ui.domain.IsNeedToCallHelloWsUseCase;
import com.sfbx.appconsentv3.ui.domain.LoadingUseCase;
import com.sfbx.appconsentv3.ui.domain.model.LoadDataWrapper;
import com.sfbx.appconsentv3.ui.model.Response;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadViewModel extends g3 {
    private final t1 _isGdpr;
    private final t1 _theme;
    private final GetLoadUseCase getLoadUseCase;
    private final IsNeedToCallHelloWsUseCase isNeedToCallHelloWsUseCase;
    private boolean isTriggerByUser;
    private final LoadingUseCase loadingUseCase;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$askToDisplayNotice$1", f = "LoadViewModel.kt", i = {}, l = {59, 59, 61}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$askToDisplayNotice$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return LoadViewModel.this.new AnonymousClass1(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        
            if (r6.loadData(r5) == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
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
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                tu.a0.throwOnFailure(r6)
                goto L71
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                tu.a0.throwOnFailure(r6)
                goto L50
            L21:
                tu.a0.throwOnFailure(r6)
                goto L45
            L25:
                tu.a0.throwOnFailure(r6)
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                androidx.lifecycle.t1 r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$get_theme$p(r6)
                com.sfbx.appconsentv3.ui.model.Response$Loading r1 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r1.<init>()
                r6.postValue(r1)
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                com.sfbx.appconsentv3.ui.domain.LoadingUseCase r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$getLoadingUseCase$p(r6)
                r5.label = r4
                java.lang.Object r6 = r6.invoke(r5)
                if (r6 != r0) goto L45
                goto L62
            L45:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                r5.label = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r6, r5)
                if (r6 != r0) goto L50
                goto L62
            L50:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L63
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                r5.label = r2
                java.lang.Object r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$loadData(r6, r5)
                if (r6 != r0) goto L71
            L62:
                return r0
            L63:
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                androidx.lifecycle.t1 r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$get_isGdpr$p(r6)
                r0 = 0
                java.lang.Boolean r0 = bv.b.boxBoolean(r0)
                r6.postValue(r0)
            L71:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$askToDisplaySetting$1", f = "LoadViewModel.kt", i = {}, l = {43, 45, 47}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$askToDisplaySetting$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37191 extends n implements p {
        int label;

        public C37191(d<? super C37191> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return LoadViewModel.this.new C37191(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (r6.loadData(r5) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r6.loadData(r5) == r0) goto L22;
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
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                tu.a0.throwOnFailure(r6)
                goto L60
            L1e:
                tu.a0.throwOnFailure(r6)
                goto L34
            L22:
                tu.a0.throwOnFailure(r6)
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                com.sfbx.appconsentv3.ui.domain.IsNeedToCallHelloWsUseCase r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$isNeedToCallHelloWsUseCase$p(r6)
                r5.label = r4
                java.lang.Object r6 = r6.invoke(r5)
                if (r6 != r0) goto L34
                goto L5f
            L34:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                androidx.lifecycle.t1 r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$get_theme$p(r6)
                com.sfbx.appconsentv3.ui.model.Response$Loading r1 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r1.<init>()
                r6.postValue(r1)
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                r5.label = r3
                java.lang.Object r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$loadData(r6, r5)
                if (r6 != r0) goto L60
                goto L5f
            L55:
                com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.this
                r5.label = r2
                java.lang.Object r6 = com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.access$loadData(r6, r5)
                if (r6 != r0) goto L60
            L5f:
                return r0
            L60:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.C37191.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37191) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.load.LoadViewModel", f = "LoadViewModel.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "loadData", n = {"this"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37201 extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C37201(d<? super C37201> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoadViewModel.this.loadData(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$2", f = "LoadViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            LoadViewModel.this._theme.postValue(new Response.Error((Throwable) this.L$0, null, 2, null));
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super LoadDataWrapper> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = LoadViewModel.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    public LoadViewModel(IsNeedToCallHelloWsUseCase isNeedToCallHelloWsUseCase, GetLoadUseCase getLoadUseCase, LoadingUseCase loadingUseCase) {
        e0.checkNotNullParameter(isNeedToCallHelloWsUseCase, "isNeedToCallHelloWsUseCase");
        e0.checkNotNullParameter(getLoadUseCase, "getLoadUseCase");
        e0.checkNotNullParameter(loadingUseCase, "loadingUseCase");
        this.isNeedToCallHelloWsUseCase = isNeedToCallHelloWsUseCase;
        this.getLoadUseCase = getLoadUseCase;
        this.loadingUseCase = loadingUseCase;
        this._isGdpr = new t1();
        this._theme = new t1();
    }

    private final void askToDisplayNotice() {
        try {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(null), 3, null);
        } catch (Throwable th2) {
            this._theme.postValue(new Response.Error(th2, null, 2, null));
        }
    }

    private final void askToDisplaySetting() {
        try {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C37191(null), 3, null);
        } catch (Throwable th2) {
            this._theme.postValue(new Response.Error(th2, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r7.collect(r4, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadData(zu.d<? super tu.x0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.C37201
            if (r0 == 0) goto L13
            r0 = r7
            com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$1 r0 = (com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.C37201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$1 r0 = new com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.L$0
            com.sfbx.appconsentv3.ui.ui.load.LoadViewModel r2 = (com.sfbx.appconsentv3.ui.ui.load.LoadViewModel) r2
            tu.a0.throwOnFailure(r7)
            goto L4d
        L3c:
            tu.a0.throwOnFailure(r7)
            com.sfbx.appconsentv3.ui.domain.GetLoadUseCase r7 = r6.getLoadUseCase
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L4c
            goto L68
        L4c:
            r2 = r6
        L4d:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$2 r4 = new com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$2
            r5 = 0
            r4.<init>(r5)
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.m5171catch(r7, r4)
            com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$3 r4 = new com.sfbx.appconsentv3.ui.ui.load.LoadViewModel$loadData$3
            r4.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.collect(r4, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.load.LoadViewModel.loadData(zu.d):java.lang.Object");
    }

    public final l1 getTheme() {
        return this._theme;
    }

    public final l1 isGdpr() {
        return this._isGdpr;
    }

    public final void requestTheme(boolean z10) {
        this.isTriggerByUser = z10;
        if (z10) {
            askToDisplaySetting();
        } else {
            askToDisplayNotice();
        }
    }
}
