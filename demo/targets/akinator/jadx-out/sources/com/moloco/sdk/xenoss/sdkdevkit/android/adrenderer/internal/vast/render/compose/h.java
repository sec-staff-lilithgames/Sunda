package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p0.v5;
import tu.x0;
import u1.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49679i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f49680j;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$a$a, reason: collision with other inner class name */
        public static final class C0472a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f49681i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0472a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, zu.d<? super C0472a> dVar) {
                super(2, dVar);
                this.f49681i = eVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0472a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0472a(this.f49681i, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                this.f49681i.b();
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49680j = eVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f49680j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49679i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                zu.m main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0472a c0472a = new C0472a(this.f49680j, null);
                this.f49679i = 1;
                if (BuildersKt.withContext(main, c0472a, this) == coroutine_suspended) {
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
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49682i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49683j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kv.a f49684k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f49685l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kv.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f49684k = aVar;
            this.f49685l = eVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k0 k0Var, zu.d<? super x0> dVar) {
            return ((b) create(k0Var, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = new b(this.f49684k, this.f49685l, dVar);
            bVar.f49683j = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49682i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                k0 k0Var = (k0) this.f49683j;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(this.f49684k, this.f49685l, 1);
                this.f49682i = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(k0Var, cVar, this) == coroutine_suspended) {
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

        public static final x0 a(kv.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, i1.h hVar, i1.h hVar2) {
            if (aVar != null) {
                aVar.invoke();
            } else {
                eVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f48771a.a(hVar.m4195unboximpl()));
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class c extends kotlin.jvm.internal.a0 implements kv.a {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.receiver).i();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class d extends kotlin.jvm.internal.a0 implements kv.a {
        public d(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.receiver).v();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, kv.a aVar, kv.t tVar, e1.v vVar, int i10, int i11, p0.w wVar, int i12) {
        a(eVar, aVar, tVar, vVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e r17, kv.a r18, kv.t r19, e1.v r20, p0.w r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, kv.a, kv.t, e1.v, p0.w, int, int):void");
    }

    public static final x0 a() {
        return x0.f87415a;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k a(v5 v5Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) v5Var.getValue();
    }
}
