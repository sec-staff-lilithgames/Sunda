package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class x implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q {

    /* renamed from: b, reason: collision with root package name */
    public final View f48140b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f48141c;

    /* renamed from: e, reason: collision with root package name */
    public Job f48142e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.p f48143f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f48144g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f48145h;

    /* renamed from: i, reason: collision with root package name */
    public final v f48146i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f48147j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f48148k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final v f48149a;

        public a(v value) {
            e0.checkNotNullParameter(value, "value");
            this.f48149a = value;
        }

        public final v a() {
            return this.f48149a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48150i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f48152k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f48153l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f48154m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f48155n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, int i12, int i13, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48152k = i10;
            this.f48153l = i11;
            this.f48154m = i12;
            this.f48155n = i13;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return x.this.new b(this.f48152k, this.f48153l, this.f48154m, this.f48155n, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48150i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                this.f48150i = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            x xVar = x.this;
            xVar.o();
            xVar.a(this.f48152k, this.f48153l, this.f48154m, this.f48155n);
            return x0.f87415a;
        }
    }

    public x(View view, Context context, CoroutineScope scope) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(scope, "scope");
        this.f48140b = view;
        this.f48141c = CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.c.a().getMain());
        com.google.android.exoplayer2.ui.p pVar = new com.google.android.exoplayer2.ui.p(this, 2);
        this.f48143f = pVar;
        view.addOnLayoutChangeListener(pVar);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f48144g = MutableStateFlow;
        this.f48145h = MutableStateFlow;
        v vVar = new v(context);
        this.f48146i = vVar;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new a(vVar));
        this.f48147j = MutableStateFlow2;
        this.f48148k = MutableStateFlow2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        Job job = this.f48142e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f48140b.removeOnLayoutChangeListener(this.f48143f);
    }

    public final StateFlow<a> k() {
        return this.f48148k;
    }

    public final StateFlow<Boolean> m() {
        return this.f48145h;
    }

    public final void o() {
        this.f48144g.setValue(Boolean.valueOf(this.f48140b.isShown()));
    }

    public static final void a(x xVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Job job = xVar.f48142e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        xVar.f48142e = BuildersKt__Builders_commonKt.launch$default(xVar.f48141c, null, null, xVar.new b(i10, i11, i12, i13, null), 3, null);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        int iWidth = rect.width();
        int iHeight = rect.height();
        v vVar = this.f48146i;
        vVar.a(i10, i11, iWidth, iHeight);
        vVar.b(i10, i11, iWidth, iHeight);
        vVar.c(i10, i11, iWidth, iHeight);
        vVar.a(iWidth, iHeight);
        this.f48147j.setValue(new a(vVar));
    }
}
