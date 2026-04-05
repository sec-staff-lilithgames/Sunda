package com.sfbx.appconsentv3.ui.domain;

import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.RemoteTheme;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetRemoteThemeUseCaseImpl implements GetRemoteThemeUseCase {
    private final AppConsentCore appConsentCore;
    private final CoroutineDispatcher defaultDispatcher;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.domain.GetRemoteThemeUseCaseImpl$invoke$2", f = "GetRemoteThemeUseCaseImpl.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.domain.GetRemoteThemeUseCaseImpl$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.domain.GetRemoteThemeUseCaseImpl$invoke$2$1", f = "GetRemoteThemeUseCaseImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.domain.GetRemoteThemeUseCaseImpl$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass1(d<? super AnonymousClass1> dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                throw ((Throwable) this.L$0);
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super RemoteTheme> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return GetRemoteThemeUseCaseImpl.this.new AnonymousClass2(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(GetRemoteThemeUseCaseImpl.this.appConsentCore.getRemoteTheme(), new AnonymousClass1(null));
                this.label = 1;
                if (FlowKt.collect(flowM5171catch, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super RemoteTheme> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass2) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public GetRemoteThemeUseCaseImpl(CoroutineDispatcher defaultDispatcher, AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.defaultDispatcher = defaultDispatcher;
        this.appConsentCore = appConsentCore;
    }

    @Override // com.sfbx.appconsentv3.ui.domain.SimpleFlowUseCase
    public Object invoke(d<? super Flow<? extends RemoteTheme>> dVar) {
        return FlowKt.flowOn(FlowKt.flow(new AnonymousClass2(null)), this.defaultDispatcher);
    }

    public /* synthetic */ GetRemoteThemeUseCaseImpl(CoroutineDispatcher coroutineDispatcher, AppConsentCore appConsentCore, int i10, u uVar) {
        this((i10 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, appConsentCore);
    }
}
