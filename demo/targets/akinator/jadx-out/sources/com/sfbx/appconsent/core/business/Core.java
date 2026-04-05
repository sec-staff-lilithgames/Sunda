package com.sfbx.appconsent.core.business;

import android.content.Context;
import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentError;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import com.sfbx.appconsent.core.repository.XchangeRepository;
import com.sfbx.appconsent.core.util.StateExtsKt;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.a;
import kv.p;
import kv.q;
import tu.a0;
import tu.o;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Core extends AbstractCore {
    private final AppConsentNoticeListener mNoticeListener;
    private final o mXchangeRepository$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.Core$syncXchangeData$1", f = "Core.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.Core$syncXchangeData$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.Core$syncXchangeData$1$1", f = "Core.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.Core$syncXchangeData$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05031 extends n implements q {
            int label;

            public C05031(d<? super C05031> dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                return new C05031(dVar).invokeSuspend(x0.f87415a);
            }
        }

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return Core.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(Core.this.postXChangeUserData(), new C05031(null));
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Core(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.mXchangeRepository$delegate = tu.q.lazy(Core$mXchangeRepository$2.INSTANCE);
        AppConsentNoticeListener appConsentNoticeListener = new AppConsentNoticeListener() { // from class: com.sfbx.appconsent.core.business.Core$mNoticeListener$1
            @Override // com.sfbx.appconsent.core.listener.AppConsentNoticeListener
            public void onConsentGiven() {
                this.this$0.syncXchangeData();
            }

            @Override // com.sfbx.appconsent.core.listener.AppConsentNoticeListener
            public void onError(AppConsentError error) {
                e0.checkNotNullParameter(error, "error");
            }
        };
        this.mNoticeListener = appConsentNoticeListener;
        removeNoticeListener(appConsentNoticeListener);
        addNoticeListener(appConsentNoticeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncXchangeData() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.sfbx.appconsent.core.business.AbstractCore
    public void firstLaunch(String appKey, boolean z10, a onReady) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(onReady, "onReady");
        super.firstLaunch(appKey, z10, onReady);
        getMXchangeRepository().defineAppKey$appconsent_core_prodXchangeRelease(appKey);
        syncXchangeData();
    }

    public final AppConsentNoticeListener getMNoticeListener() {
        return this.mNoticeListener;
    }

    public final XchangeRepository getMXchangeRepository() {
        return (XchangeRepository) this.mXchangeRepository$delegate.getValue();
    }

    public final Flow<Boolean> postXChangeUserData() {
        return (!isSubjectToGDPR() || StateExtsKt.hasXchangePermission(getMStateDao().getTemporaryState())) ? getMXchangeRepository().postXChangeData() : FlowKt.emptyFlow();
    }

    public final void sendXchangeData() {
        syncXchangeData();
    }
}
