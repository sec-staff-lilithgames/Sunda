package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import b0.t1;
import b0.v1;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import g0.f2;
import g0.i2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p0.j2;
import p0.v5;
import tu.x0;
import u1.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class l {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49701i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l f49702j;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$a$a, reason: collision with other inner class name */
        public static final class C0473a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l f49703i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0473a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, zu.d<? super C0473a> dVar) {
                super(2, dVar);
                this.f49703i = lVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0473a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0473a(this.f49703i, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                this.f49703i.b();
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49702j = lVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f49702j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49701i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                zu.m main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0473a c0473a = new C0473a(this.f49702j, null);
                this.f49701i = 1;
                if (BuildersKt.withContext(main, c0473a, this) == coroutine_suspended) {
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
    public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.l {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n p02) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) this.receiver).a(p02);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49704i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49705j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kv.a f49706k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l f49707l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kv.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f49706k = aVar;
            this.f49707l = lVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k0 k0Var, zu.d<? super x0> dVar) {
            return ((c) create(k0Var, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = new c(this.f49706k, this.f49707l, dVar);
            cVar.f49705j = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49704i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                k0 k0Var = (k0) this.f49705j;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(this.f49706k, this.f49707l, 2);
                this.f49704i = 1;
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

        public static final x0 a(kv.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, i1.h hVar, i1.h hVar2) {
            if (aVar != null) {
                aVar.invoke();
            } else {
                lVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f48771a.a(hVar.m4195unboximpl()));
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class d extends kotlin.jvm.internal.a0 implements kv.l {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z10) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) this.receiver).c(z10);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class e extends kotlin.jvm.internal.a0 implements kv.a {
        public e(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) this.receiver).i();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class f extends kotlin.jvm.internal.a0 implements kv.a {
        public f(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) this.receiver).v();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements kv.t {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.d f49708b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2 f49709c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k f49710b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kv.a f49711c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kv.a f49712e;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar, kv.a aVar, kv.a aVar2) {
                this.f49710b = kVar;
                this.f49711c = aVar;
                this.f49712e = aVar2;
            }

            public final void a(b0.c0 AnimatedVisibility, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(989733896, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous>.<anonymous> (Linear.kt:155)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.f49710b;
                if (kVar != null) {
                    r.a(kVar, this.f49711c, this.f49712e, null, wVar, 0, 8);
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((b0.c0) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        public g(e1.d dVar, i2 i2Var) {
            this.f49708b = dVar;
            this.f49709c = i2Var;
        }

        public final void a(g0.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar, kv.a onDisplayed, kv.a onClick, p0.w wVar, int i10) {
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(onDisplayed, "onDisplayed");
            kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (wVar.changed(e0Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= wVar.changed(kVar) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= wVar.changed(onDisplayed) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= wVar.changed(onClick) ? 2048 : 1024;
            }
            if ((i11 & 9363) == 9362 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-903645392, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous> (Linear.kt:149)");
            }
            b0.b0.AnimatedVisibility(kVar != null, f2.padding(((g0.f0) e0Var).align(e1.t.f53496b, this.f49708b), this.f49709c), (t1) null, (v1) null, (String) null, z0.u.composableLambda(wVar, 989733896, true, new a(kVar, onDisplayed, onClick)), wVar, 196608, 28);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.t
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            a((g0.e0) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) obj2, (kv.a) obj3, (kv.a) obj4, (p0.w) obj5, ((Number) obj6).intValue());
            return x0.f87415a;
        }
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, kv.a aVar, e1.v vVar, kv.u uVar, kv.s sVar, kv.t tVar, kv.u uVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, kv.a aVar2, int i10, int i11, p0.w wVar, int i12) {
        a(lVar, aVar, vVar, uVar, sVar, tVar, uVar2, jVar, aVar2, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final void b(j2 j2Var, boolean z10) {
        j2Var.setValue(Boolean.valueOf(z10));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j c(j2 j2Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) j2Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l r32, kv.a r33, e1.v r34, kv.u r35, kv.s r36, kv.t r37, kv.u r38, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j r39, kv.a r40, p0.w r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, kv.a, e1.v, kv.u, kv.s, kv.t, kv.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j, kv.a, p0.w, int, int):void");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k c(v5 v5Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) v5Var.getValue();
    }

    public static final boolean b(v5 v5Var) {
        return ((Boolean) v5Var.getValue()).booleanValue();
    }

    public static final boolean b(j2 j2Var) {
        return ((Boolean) j2Var.getValue()).booleanValue();
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, j2 j2Var, boolean z10) {
        lVar.d(z10);
        b(j2Var, z10);
        return x0.f87415a;
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, boolean z10) {
        if (z10) {
            lVar.F();
        } else {
            lVar.G();
        }
        return x0.f87415a;
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, j2 j2Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        lVar.a(it);
        a(j2Var, it);
        return x0.f87415a;
    }

    public static final x0 a(j2 j2Var, boolean z10) {
        a(j2Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n(Boolean.valueOf(z10)));
        return x0.f87415a;
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, a.c button, a.c.EnumC0490a buttonType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        lVar.a(button);
        lVar.a(buttonType);
        return x0.f87415a;
    }

    public static final kv.t a(e1.d dVar, i2 i2Var, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-1318345093);
        if ((i11 & 1) != 0) {
            dVar = e1.d.f53469a.getBottomStart();
        }
        if ((i11 & 2) != 0) {
            i2Var = f2.m3870PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-1318345093, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon (Linear.kt:148)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, -903645392, true, new g(dVar, i2Var));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n a(v5 v5Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) v5Var.getValue();
    }

    public static final void a(j2 j2Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar) {
        j2Var.setValue(jVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n a(j2 j2Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) j2Var.getValue();
    }

    public static final void a(j2 j2Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar) {
        j2Var.setValue(nVar);
    }
}
