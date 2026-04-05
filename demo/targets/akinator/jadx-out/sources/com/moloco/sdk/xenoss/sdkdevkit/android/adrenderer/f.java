package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import a2.h2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class f extends FrameLayout implements p, i, g, q {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f47579b;

    /* renamed from: c, reason: collision with root package name */
    public k f47580c;

    /* renamed from: e, reason: collision with root package name */
    public View f47581e;

    /* renamed from: f, reason: collision with root package name */
    public final tu.o f47582f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f47583g;

    /* renamed from: h, reason: collision with root package name */
    public final tu.o f47584h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f47585i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f47586j;

        public a(zu.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, zu.d<? super Boolean> dVar) {
            a aVar = new a(dVar);
            aVar.f47585i = z10;
            aVar.f47586j = z11;
            return aVar.invokeSuspend(x0.f87415a);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (zu.d) obj3);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            return bv.b.boxBoolean(this.f47585i && this.f47586j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47587i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f47589k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f47590l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ boolean f47591i;

            public a(zu.d<? super a> dVar) {
                super(2, dVar);
            }

            public final Object a(boolean z10, zu.d<? super Boolean> dVar) {
                return ((a) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f47591i = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                return bv.b.boxBoolean(this.f47591i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, h hVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f47589k = j10;
            this.f47590l = hVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f.this.new b(this.f47589k, this.f47590l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47587i;
            f fVar = f.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                fVar.getAdLoader().a(this.f47589k, this.f47590l);
                StateFlow<Boolean> stateFlowIsLoaded = fVar.isLoaded();
                a aVar = new a(null);
                this.f47587i = 1;
                if (FlowKt.first(stateFlowIsLoaded, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            fVar.k();
            return x0.f87415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, CoroutineScope scope) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f47579b = scope;
        final int i10 = 0;
        this.f47582f = tu.q.lazy(new kv.a(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f47578c;

            {
                this.f47578c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return f.b(this.f47578c);
                    default:
                        return f.a(this.f47578c);
                }
            }
        });
        this.f47583g = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        final int i11 = 1;
        this.f47584h = tu.q.lazy(new kv.a(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f47578c;

            {
                this.f47578c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return f.b(this.f47578c);
                    default:
                        return f.a(this.f47578c);
                }
            }
        });
    }

    public static final StateFlow b(f fVar) {
        return fVar.getAdLoader().isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, h hVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f47579b, null, null, new b(j10, hVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f47579b, null, 1, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public abstract i getAdLoader();

    public k getAdShowListener() {
        return this.f47580c;
    }

    public final View getAdView() {
        return this.f47581e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public abstract /* synthetic */ o getCreativeType();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return (StateFlow) this.f47582f.getValue();
    }

    public abstract void k();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return (StateFlow) this.f47584h.getValue();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        this.f47583g.setValue(Boolean.valueOf(i10 == 0));
    }

    public void setAdShowListener(k kVar) {
        this.f47580c = kVar;
    }

    public final void setAdView(View view) {
        View view2 = this.f47581e;
        this.f47581e = view;
        removeAllViews();
        h2 h2Var = view2 instanceof h2 ? (h2) view2 : null;
        if (h2Var != null) {
            h2Var.disposeComposition();
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public static final StateFlow a(f fVar) {
        return FlowKt.stateIn(FlowKt.flowCombine(fVar.isLoaded(), fVar.f47583g, new a(null)), fVar.f47579b, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    public static /* synthetic */ void getAdView$annotations() {
    }
}
