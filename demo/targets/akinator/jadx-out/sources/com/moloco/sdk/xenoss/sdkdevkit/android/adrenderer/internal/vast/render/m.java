package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tu.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f50041i;

        /* renamed from: j, reason: collision with root package name */
        public Object f50042j;

        /* renamed from: k, reason: collision with root package name */
        public Object f50043k;

        /* renamed from: l, reason: collision with root package name */
        public e0 f50044l;

        /* renamed from: m, reason: collision with root package name */
        public kv.a f50045m;

        /* renamed from: n, reason: collision with root package name */
        public kv.l f50046n;

        /* renamed from: o, reason: collision with root package name */
        public b1 f50047o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f50048p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f50049q;

        /* renamed from: r, reason: collision with root package name */
        public int f50050r;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f50049q = obj;
            this.f50050r |= Integer.MIN_VALUE;
            return m.a(null, null, null, null, 0, 0, null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ b1 f50051i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ a0 f50052j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b1 b1Var, a0 a0Var, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f50051i = b1Var;
            this.f50052j = a0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f50051i, this.f50052j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            this.f50051i.f71816b = m.a(this.f50052j);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f50053b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b1 f50054c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b1 f50055e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b1 f50056f;

        public c(Integer num, b1 b1Var, b1 b1Var2, b1 b1Var3) {
            this.f50053b = num;
            this.f50054c = b1Var;
            this.f50055e = b1Var2;
            this.f50056f = b1Var3;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
        public void destroy() {
            Integer num = this.f50053b;
            if (num != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n.f48177a.b(num.intValue());
            }
            b1 b1Var = this.f50054c;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o) b1Var.f71816b;
            if (oVar != null) {
                oVar.destroy();
            }
            b1Var.f71816b = null;
            b1 b1Var2 = this.f50055e;
            v vVar = (v) b1Var2.f71816b;
            if (vVar != null) {
                vVar.destroy();
            }
            b1Var2.f71816b = null;
            b1 b1Var3 = this.f50056f;
            CoroutineScope coroutineScope = (CoroutineScope) b1Var3.f71816b;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
            b1Var3.f71816b = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kv.a f50057i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kv.a aVar, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f50057i = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(x0 x0Var, zu.d<? super x0> dVar) {
            return ((d) create(x0Var, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f50057i, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            this.f50057i.invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f50058i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f50059j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kv.l f50060k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f50061i;

            public a(zu.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h hVar, zu.d<? super Boolean> dVar) {
                return ((a) create(hVar, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f50061i = obj;
                return aVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                return bv.b.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h) this.f50061i) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, kv.l lVar, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f50059j = aVar;
            this.f50060k = lVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new e(this.f50059j, this.f50060k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50058i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h> unrecoverableError = this.f50059j.getUnrecoverableError();
                a aVar = new a(null);
                this.f50058i = 1;
                obj = FlowKt.first(unrecoverableError, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h) obj;
            if (hVar != null) {
                this.f50060k.invoke(hVar);
            }
            return x0.f87415a;
        }
    }

    public static final k a(a0 a0Var, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a0Var, "<this>");
        if (!(a0Var instanceof a0.c)) {
            return null;
        }
        a0.c cVar = (a0.c) a0Var;
        if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f49344b) {
            return new k.b(cVar.a().b(), i10, i11);
        }
        return null;
    }

    public static final x0 b() {
        return x0.f87415a;
    }

    public static final String a(a0 a0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a0Var, "<this>");
        if (a0Var instanceof a0.a) {
            a0.a aVar = (a0.a) a0Var;
            if (z.f50224a.a(aVar.a().a())) {
                return aVar.a().a();
            }
            return null;
        }
        if (a0Var instanceof a0.b) {
            a0.b bVar = (a0.b) a0Var;
            if (z.f50224a.a(bVar.a().a())) {
                return bVar.a().a();
            }
            return null;
        }
        if (a0Var instanceof a0.c) {
            a0.c cVar = (a0.c) a0Var;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f49345c && z.f50224a.a(cVar.a().b())) {
                return cVar.a().b();
            }
            return null;
        }
        throw new t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 r28, android.content.Context r29, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b r30, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 r31, int r32, int r33, kv.a r34, kv.l r35, boolean r36, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l> r37) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0, android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0, int, int, kv.a, kv.l, boolean, zu.d):java.lang.Object");
    }

    public static final x0 a() {
        return x0.f87415a;
    }
}
