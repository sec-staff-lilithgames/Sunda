package com.unity3d.ads.core.domain;

import android.app.Activity;
import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import tv.d;
import tv.x;
import tv.y;
import tv.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidHandleFocusCounters {
    private final CoroutineDispatcher defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, d> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final MutableStateFlow<FocusState> previousFocusState;
    private final SessionRepository sessionRepository;
    private final z timeSource;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = AndroidHandleFocusCounters.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(FocusState focusState, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(focusState, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            String qualifiedName;
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            FocusState focusState = (FocusState) this.L$0;
            AndroidHandleFocusCounters.this.onFocusStateChange(focusState);
            Activity activity = focusState.getActivity().get();
            if (activity == null || (qualifiedName = c1.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()) == null) {
                qualifiedName = "unknown_activity_name";
            }
            boolean zInvoke = AndroidHandleFocusCounters.this.isAdActivity.invoke(qualifiedName);
            x0 x0Var = x0.f87415a;
            if (!zInvoke) {
                return x0Var;
            }
            AndroidHandleFocusCounters.this.sessionRepository.incrementGlobalAdsFocusChangeCount();
            if (focusState instanceof FocusState.Focused) {
                AndroidHandleFocusCounters.this.onResume(qualifiedName);
            } else if (focusState instanceof FocusState.Unfocused) {
                AndroidHandleFocusCounters.this.onPause(qualifiedName);
            }
            return x0Var;
        }
    }

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity isAdActivity, CoroutineDispatcher defaultDispatcher, z timeSource) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(focusRepository, "focusRepository");
        e0.checkNotNullParameter(isAdActivity, "isAdActivity");
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = StateFlowKt.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState) {
        FocusState value;
        FocusState focusState2;
        MutableStateFlow<FocusState> mutableStateFlow = this.previousFocusState;
        do {
            value = mutableStateFlow.getValue();
            focusState2 = value;
        } while (!mutableStateFlow.compareAndSet(value, focusState));
        if (focusState2 == null || focusState.getClass() == focusState2.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String str) {
        String str2 = this.latestKnownActivityResumed;
        if (str2 == null || e0.areEqual(str2, str)) {
            d dVarRemove = this.focusTimesPerActivity.remove(str);
            if (dVarRemove == null) {
                dVarRemove = this.timeSource.markNow();
            }
            e0.checkNotNullExpressionValue(dVarRemove, "focusTimesPerActivity.re…) ?: timeSource.markNow()");
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) tv.f.m7195getInWholeMillisecondsimpl(((x) dVarRemove).mo7144elapsedNowUwyO8pc()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.markNow());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        FlowKt.launchIn(FlowKt.onEach(this.focusRepository.getFocusState(), new AnonymousClass1(null)), CoroutineScopeKt.CoroutineScope(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, CoroutineDispatcher coroutineDispatcher, z zVar, int i10, u uVar) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, coroutineDispatcher, (i10 & 16) != 0 ? y.f87465a : zVar);
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }
}
