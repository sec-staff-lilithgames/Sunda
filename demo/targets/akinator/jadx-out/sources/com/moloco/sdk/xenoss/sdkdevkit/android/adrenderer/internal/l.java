package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.b1;
import androidx.lifecycle.o3;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class l {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47837i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f47838j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ProducerScope f47839k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f47840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProducerScope<? super Boolean> producerScope, View view, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f47839k = producerScope;
            this.f47840l = view;
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((a) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f47839k, this.f47840l, dVar);
            aVar.f47838j = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.f(r1, r4.f47840l, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r1.send(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            return r0;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r4.f47837i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                tu.a0.throwOnFailure(r5)
                goto L3d
            L1b:
                tu.a0.throwOnFailure(r5)
                boolean r5 = r4.f47838j
                kotlinx.coroutines.channels.ProducerScope r1 = r4.f47839k
                if (r5 == 0) goto L2f
                r4.f47837i = r3
                android.view.View r5 = r4.f47840l
                java.lang.Object r5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.c(r1, r5, r4)
                if (r5 != r0) goto L3d
                goto L3c
            L2f:
                r5 = 0
                java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                r4.f47837i = r2
                java.lang.Object r5 = r1.send(r5, r4)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47841i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f47842j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ProducerScope f47843k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProducerScope<? super Boolean> producerScope, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f47843k = producerScope;
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((b) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = new b(this.f47843k, dVar);
            bVar.f47842j = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47841i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                Boolean boolBoxBoolean = bv.b.boxBoolean(this.f47842j);
                this.f47841i = 1;
                if (this.f47843k.send(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47844i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47845j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ProducerScope f47846k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f47847l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ProducerScope<? super Boolean> producerScope, View view, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f47846k = producerScope;
            this.f47847l = view;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Boolean bool, zu.d<? super x0> dVar) {
            return ((c) create(bool, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = new c(this.f47846k, this.f47847l, dVar);
            cVar.f47845j = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.e(r4, r5.f47847l, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r4.send(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r0;
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
                int r1 = r5.f47844i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                tu.a0.throwOnFailure(r6)
                goto L47
            L1b:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.f47845j
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r1 = 0
                java.lang.Boolean r4 = bv.b.boxBoolean(r1)
                boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r4)
                kotlinx.coroutines.channels.ProducerScope r4 = r5.f47846k
                if (r6 != 0) goto L3a
                r5.f47844i = r3
                android.view.View r6 = r5.f47847l
                java.lang.Object r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.b(r4, r6, r5)
                if (r6 != r0) goto L47
                goto L46
            L3a:
                java.lang.Boolean r6 = bv.b.boxBoolean(r1)
                r5.f47844i = r2
                java.lang.Object r6 = r4.send(r6, r5)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47848i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47849j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ View f47850k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProducerScope f47851b;

            public a(ProducerScope<? super Boolean> producerScope) {
                this.f47851b = producerScope;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View p02) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
                this.f47851b.mo5139trySendJP2dKIU(Boolean.TRUE);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View p02) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
                this.f47851b.mo5139trySendJP2dKIU(Boolean.FALSE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f47850k = view;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super Boolean> producerScope, zu.d<? super x0> dVar) {
            return ((d) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = new d(this.f47850k, dVar);
            dVar2.f47849j = obj;
            return dVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(r1, r3, r6) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.f47848i
                r2 = 2
                r3 = 1
                android.view.View r4 = r6.f47850k
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                tu.a0.throwOnFailure(r7)
                goto L59
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                java.lang.Object r1 = r6.f47849j
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                tu.a0.throwOnFailure(r7)
                goto L3f
            L24:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.f47849j
                r1 = r7
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                boolean r7 = r4.isAttachedToWindow()
                java.lang.Boolean r7 = bv.b.boxBoolean(r7)
                r6.f47849j = r1
                r6.f47848i = r3
                java.lang.Object r7 = r1.send(r7, r6)
                if (r7 != r0) goto L3f
                goto L58
            L3f:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l$d$a r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l$d$a
                r7.<init>(r1)
                r4.addOnAttachStateChangeListener(r7)
                androidx.lifecycle.x0 r3 = new androidx.lifecycle.x0
                r5 = 3
                r3.<init>(r5, r4, r7)
                r7 = 0
                r6.f47849j = r7
                r6.f47848i = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r1, r3, r6)
                if (r7 != r0) goto L59
            L58:
                return r0
            L59:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final x0 a(View view, a aVar) {
            view.removeOnAttachStateChangeListener(aVar);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public Rect f47852i;

        /* renamed from: j, reason: collision with root package name */
        public int f47853j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47854k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f47855l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f47855l = view;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, zu.d<? super x0> dVar) {
            return ((e) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            e eVar = new e(this.f47855l, dVar);
            eVar.f47854k = obj;
            return eVar;
        }

        /* JADX WARN: Path cross not found for [B:13:0x0040, B:16:0x0048], limit reached: 22 */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[PHI: r1 r5
          0x005a: PHI (r1v2 android.graphics.Rect) = (r1v3 android.graphics.Rect), (r1v4 android.graphics.Rect) binds: [B:18:0x0057, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
          0x005a: PHI (r5v2 kotlinx.coroutines.flow.FlowCollector) = (r5v3 kotlinx.coroutines.flow.FlowCollector), (r5v5 kotlinx.coroutines.flow.FlowCollector) binds: [B:18:0x0057, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0066 -> B:11:0x0038). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.f47853j
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                android.graphics.Rect r1 = r8.f47852i
                java.lang.Object r5 = r8.f47854k
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                tu.a0.throwOnFailure(r9)
                goto L38
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                android.graphics.Rect r1 = r8.f47852i
                java.lang.Object r5 = r8.f47854k
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                tu.a0.throwOnFailure(r9)
                goto L5a
            L2b:
                tu.a0.throwOnFailure(r9)
                java.lang.Object r9 = r8.f47854k
                r5 = r9
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L38:
                android.view.View r9 = r8.f47855l
                boolean r6 = r9.isShown()
                if (r6 == 0) goto L48
                boolean r9 = r9.getGlobalVisibleRect(r1)
                if (r9 == 0) goto L48
                r9 = r3
                goto L49
            L48:
                r9 = r4
            L49:
                java.lang.Boolean r9 = bv.b.boxBoolean(r9)
                r8.f47854k = r5
                r8.f47852i = r1
                r8.f47853j = r3
                java.lang.Object r9 = r5.emit(r9, r8)
                if (r9 != r0) goto L5a
                goto L68
            L5a:
                r8.f47854k = r5
                r8.f47852i = r1
                r8.f47853j = r2
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
                if (r9 != r0) goto L38
            L68:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47856i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47857j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.k0 f47858k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.lifecycle.k0 k0Var, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f47858k = k0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super Boolean> producerScope, zu.d<? super x0> dVar) {
            return ((f) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            f fVar = new f(this.f47858k, dVar);
            fVar.f47857j = obj;
            return fVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47856i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f47857j;
                w0 w0Var = new w0(producerScope, 1);
                androidx.lifecycle.k0 k0Var = this.f47858k;
                k0Var.addObserver(w0Var);
                androidx.lifecycle.x0 x0Var = new androidx.lifecycle.x0(4, k0Var, w0Var);
                this.f47856i = 1;
                if (ProduceKt.awaitClose(producerScope, x0Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        public static final void a(ProducerScope producerScope, b1 b1Var, androidx.lifecycle.i0 i0Var) {
            int i10 = m.f47867a[i0Var.ordinal()];
            if (i10 == 1) {
                ChannelResult.m5153boximpl(producerScope.mo5139trySendJP2dKIU(Boolean.FALSE));
            } else {
                if (i10 != 2) {
                    return;
                }
                ChannelResult.m5153boximpl(producerScope.mo5139trySendJP2dKIU(Boolean.TRUE));
            }
        }

        public static final x0 a(androidx.lifecycle.k0 k0Var, v0 v0Var) {
            k0Var.removeObserver(v0Var);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47859i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47860j;

        public g(zu.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, zu.d<? super x0> dVar) {
            return ((g) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f47860j = obj;
            return gVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47859i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f47860j;
                this.f47859i = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    public static final Object d(ProducerScope<? super Boolean> producerScope, View view, zu.d<? super x0> dVar) {
        Object objCollectLatest = FlowKt.collectLatest(a(view), new a(producerScope, view, null), dVar);
        return objCollectLatest == av.e.getCOROUTINE_SUSPENDED() ? objCollectLatest : x0.f87415a;
    }

    public static final Object e(ProducerScope<? super Boolean> producerScope, View view, zu.d<? super x0> dVar) {
        Object objCollectLatest = FlowKt.collectLatest(b(view), new b(producerScope, null), dVar);
        return objCollectLatest == av.e.getCOROUTINE_SUSPENDED() ? objCollectLatest : x0.f87415a;
    }

    public static final Object f(ProducerScope<? super Boolean> producerScope, View view, zu.d<? super x0> dVar) {
        Object objCollectLatest = FlowKt.collectLatest(a(o3.get(view)), new c(producerScope, view, null), dVar);
        return objCollectLatest == av.e.getCOROUTINE_SUSPENDED() ? objCollectLatest : x0.f87415a;
    }

    public static final Flow<Boolean> b(View view) {
        return b(FlowKt.flow(new e(view, null)));
    }

    public static final Flow<Boolean> a(View view) {
        return b(FlowKt.callbackFlow(new d(view, null)));
    }

    public static final <T> Flow<T> b(Flow<? extends T> flow) {
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.conflate(flow)), com.moloco.sdk.internal.scheduling.c.a().getMain());
    }

    public static final Flow<Boolean> a(b1 b1Var) {
        androidx.lifecycle.k0 lifecycle;
        if (b1Var != null && (lifecycle = b1Var.getLifecycle()) != null) {
            return b(FlowKt.callbackFlow(new f(lifecycle, null)));
        }
        return FlowKt.flow(new g(null));
    }
}
