package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.b1;
import androidx.lifecycle.b2;
import androidx.lifecycle.i0;
import androidx.lifecycle.v0;
import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, v0 {
    private final MutableStateFlow<Boolean> _appActive;
    private final StateFlow<Boolean> appActive;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidLifecycleDataSource.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            b2.f6515k.get().getLifecycle().addObserver(AndroidLifecycleDataSource.this);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidLifecycleDataSource() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this._appActive = MutableStateFlow;
        this.appActive = FlowKt.asStateFlow(MutableStateFlow);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return getAppActive().getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public StateFlow<Boolean> getAppActive() {
        return this.appActive;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(event, "event");
        MutableStateFlow<Boolean> mutableStateFlow = this._appActive;
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean zBooleanValue = true;
        if (i10 == 1) {
            zBooleanValue = false;
        } else if (i10 != 2) {
            zBooleanValue = getAppActive().getValue().booleanValue();
        }
        mutableStateFlow.setValue(Boolean.valueOf(zBooleanValue));
    }
}
