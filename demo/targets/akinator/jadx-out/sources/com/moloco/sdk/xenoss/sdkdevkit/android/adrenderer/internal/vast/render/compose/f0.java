package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import com.applovin.shadow.okio.Segment;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.service_locator.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import p0.g1;
import p0.h1;
import p0.j2;
import p0.k1;
import p0.o4;
import p0.o5;
import p0.s0;
import p0.v5;
import p0.z4;
import tu.x0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zu.m f49640a = com.moloco.sdk.internal.scheduling.c.a().getMain();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49641i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ j2 f49642j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ j2 f49643k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49644l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v5 f49645m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v5 f49646n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j2 j2Var, j2 j2Var2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, v5 v5Var, v5 v5Var2, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49642j = j2Var;
            this.f49643k = j2Var2;
            this.f49644l = gVar;
            this.f49645m = v5Var;
            this.f49646n = v5Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, zu.d<? super x0> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f49642j, this.f49643k, this.f49644l, this.f49645m, this.f49646n, dVar);
            aVar.f49641i = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f49641i;
            f0.a(this.f49645m).invoke(bv.b.boxBoolean(aVar.e()));
            this.f49642j.setValue(bv.b.boxBoolean(aVar.e()));
            this.f49643k.setValue(bv.b.boxBoolean(aVar.d()));
            f0.b(this.f49646n).invoke(bv.b.boxBoolean(aVar.f()));
            View viewN = this.f49644l.N();
            if (viewN != null) {
                viewN.setKeepScreenOn(aVar.d());
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49647i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ v5 f49648j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v5 v5Var, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f49648j = v5Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, zu.d<? super x0> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = new b(this.f49648j, dVar);
            bVar.f49647i = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            f0.c(this.f49648j).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) this.f49647i);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49649i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ v5 f49650j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v5 v5Var, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f49650j = v5Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n nVar, zu.d<? super x0> dVar) {
            return ((c) create(nVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = new c(this.f49650j, dVar);
            cVar.f49649i = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            f0.d(this.f49650j).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n) this.f49649i);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public View f49651i;

        /* renamed from: j, reason: collision with root package name */
        public int f49652j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49653k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f49653k = gVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f49653k, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.f49652j
                r2 = 0
                r3 = 4
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L24
                if (r1 == r5) goto L1e
                if (r1 != r4) goto L16
                android.view.View r0 = r6.f49651i
                tu.a0.throwOnFailure(r7)
                goto L50
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                android.view.View r1 = r6.f49651i
                tu.a0.throwOnFailure(r7)
                goto L3d
            L24:
                tu.a0.throwOnFailure(r7)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g r7 = r6.f49653k
                android.view.View r1 = r7.N()
                if (r1 == 0) goto L32
                r1.setVisibility(r3)
            L32:
                r6.f49651i = r1
                r6.f49652j = r5
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L3d
                goto L4e
            L3d:
                if (r1 == 0) goto L42
                r1.setVisibility(r2)
            L42:
                r6.f49651i = r1
                r6.f49652j = r4
                r4 = 50
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                r0 = r1
            L50:
                if (r0 == 0) goto L55
                r0.setVisibility(r3)
            L55:
                if (r0 == 0) goto L5a
                r0.setVisibility(r2)
            L5a:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49654i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49655j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f49656k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n f49657l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n f49658m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49659i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f49660j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n f49661k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n f49662l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar2, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f49659i = gVar;
                this.f49660j = str;
                this.f49661k = nVar;
                this.f49662l = nVar2;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f49659i, this.f49660j, this.f49661k, this.f49662l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar = this.f49659i;
                gVar.a(this.f49660j);
                gVar.seekTo(((Number) this.f49661k.a()).longValue());
                f0.b(gVar, this.f49662l);
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar2, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f49655j = gVar;
            this.f49656k = str;
            this.f49657l = nVar;
            this.f49658m = nVar2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new e(this.f49655j, this.f49656k, this.f49657l, this.f49658m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49654i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                zu.m mVar = f0.f49640a;
                a aVar = new a(this.f49655j, this.f49656k, this.f49657l, this.f49658m, null);
                this.f49654i = 1;
                if (BuildersKt.withContext(mVar, aVar, this) == coroutine_suspended) {
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
    public static final class f extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49663i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49664j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n f49665k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49666i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n f49667j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f49666i = gVar;
                this.f49667j = nVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f49666i, this.f49667j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                f0.b(this.f49666i, this.f49667j);
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f49664j = gVar;
            this.f49665k = nVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new f(this.f49664j, this.f49665k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49663i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                zu.m mVar = f0.f49640a;
                a aVar = new a(this.f49664j, this.f49665k, null);
                this.f49663i = 1;
                if (BuildersKt.withContext(mVar, aVar, this) == coroutine_suspended) {
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
    public static final class g extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49668i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49669j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f49670k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49671i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ boolean f49672j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, boolean z10, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f49671i = gVar;
                this.f49672j = z10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f49671i, this.f49672j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                this.f49671i.b(this.f49672j);
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, boolean z10, zu.d<? super g> dVar) {
            super(2, dVar);
            this.f49669j = gVar;
            this.f49670k = z10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new g(this.f49669j, this.f49670k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49668i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                zu.m mVar = f0.f49640a;
                a aVar = new a(this.f49669j, this.f49670k, null);
                this.f49668i = 1;
                if (BuildersKt.withContext(mVar, aVar, this) == coroutine_suspended) {
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
    public static final class h implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f49673a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f49674b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v5 f49675c;

        public h(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, v5 v5Var) {
            this.f49673a = list;
            this.f49674b = gVar;
            this.f49675c = v5Var;
        }

        @Override // p0.g1
        public void dispose() {
            Iterator it = this.f49673a.iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
            }
            this.f49674b.destroy();
            f0.a(this.f49675c).invoke(Boolean.FALSE);
        }
    }

    public static final x0 a(String str, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar2, boolean z11, kv.l lVar, kv.l lVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, kv.l lVar3, kv.l lVar4, e1.v vVar, int i10, int i11, int i12, p0.w wVar, int i13) {
        a(str, z10, nVar, nVar2, z11, lVar, lVar2, jVar, lVar3, lVar4, vVar, wVar, i10 | 1, i11, i12);
        return x0.f87415a;
    }

    public static final j2 b() {
        return o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final j2 c() {
        return o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar) {
        if (((Boolean) nVar.a()).booleanValue()) {
            gVar.play();
        } else {
            gVar.pause();
        }
    }

    public static final kv.l c(v5 v5Var) {
        return (kv.l) v5Var.getValue();
    }

    public static final kv.l d(v5 v5Var) {
        return (kv.l) v5Var.getValue();
    }

    public static final void a(final String uri, final boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n play, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n seekToMillis, final boolean z11, final kv.l isPlaying, final kv.l isVisible, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker, final kv.l onProgressChanged, final kv.l onError, e1.v vVar, p0.w wVar, final int i10, final int i11, final int i12) {
        int i13;
        e1.v vVar2;
        int i14;
        int i15;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar;
        int i16;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar;
        e1.v vVar3;
        p0.w wVar2;
        final e1.v vVar4;
        kotlin.jvm.internal.e0.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.e0.checkNotNullParameter(play, "play");
        kotlin.jvm.internal.e0.checkNotNullParameter(seekToMillis, "seekToMillis");
        kotlin.jvm.internal.e0.checkNotNullParameter(isPlaying, "isPlaying");
        kotlin.jvm.internal.e0.checkNotNullParameter(isVisible, "isVisible");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        kotlin.jvm.internal.e0.checkNotNullParameter(onError, "onError");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(32444032);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (wVarStartRestartGroup.changed(uri) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= wVarStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= wVarStartRestartGroup.changed(play) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i13 |= wVarStartRestartGroup.changed(seekToMillis) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i13 |= wVarStartRestartGroup.changed(z11) ? 16384 : Segment.SIZE;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i13 |= wVarStartRestartGroup.changed(isPlaying) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i13 |= wVarStartRestartGroup.changed(isVisible) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i13 |= wVarStartRestartGroup.changed(viewVisibilityTracker) ? 8388608 : 4194304;
        }
        if ((i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            i13 |= wVarStartRestartGroup.changed(onProgressChanged) ? 67108864 : 33554432;
        }
        if ((i12 & 512) != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            i13 |= wVarStartRestartGroup.changed(onError) ? 536870912 : 268435456;
        }
        int i17 = i13;
        int i18 = i12 & 1024;
        if (i18 != 0) {
            vVar2 = vVar;
            i14 = i18;
            i15 = i11 | 6;
        } else {
            vVar2 = vVar;
            if ((i11 & 6) == 0) {
                i14 = i18;
                i15 = i11 | (wVarStartRestartGroup.changed(vVar2) ? 4 : 2);
            } else {
                i14 = i18;
                i15 = i11;
            }
        }
        if ((i17 & 306783379) == 306783378 && (i15 & 3) == 2 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            nVar = play;
            wVar2 = wVarStartRestartGroup;
            vVar4 = vVar2;
        } else {
            e1.v vVar5 = i14 != 0 ? e1.t.f53496b : vVar2;
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(32444032, i17, i15, duhsDlGWdBkekB.oCqwVdqiqVlau);
            }
            Context context = (Context) wVarStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            k0 lifecycle = ((b1) wVarStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            wVarStartRestartGroup.startReplaceableGroup(-794104450);
            boolean zChanged = wVarStartRestartGroup.changed(context) | wVarStartRestartGroup.changed(z10) | wVarStartRestartGroup.changed(lifecycle);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar6 = p0.v.f80515a;
            int i19 = i15;
            if (zChanged || objRememberedValue == vVar6.getEmpty()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d(context, z10, a.g.f47460a.a(), lifecycle), viewVisibilityTracker);
                wVarStartRestartGroup.updateRememberedValue(hVar3);
                objRememberedValue = hVar3;
            }
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h) objRememberedValue;
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.startReplaceableGroup(773894976);
            wVarStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == vVar6.getEmpty()) {
                objRememberedValue2 = new s0(k1.createCompositionCoroutineScope(a(), wVarStartRestartGroup));
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((s0) objRememberedValue2).getCoroutineScope();
            wVarStartRestartGroup.endReplaceableGroup();
            final v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(isPlaying, wVarStartRestartGroup, (i17 >> 15) & 14);
            final v5 v5VarRememberUpdatedState2 = z4.rememberUpdatedState(isVisible, wVarStartRestartGroup, (i17 >> 18) & 14);
            Object[] objArr = new Object[0];
            wVarStartRestartGroup.startReplaceableGroup(-794074476);
            Object objRememberedValue3 = wVarStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == vVar6.getEmpty()) {
                objRememberedValue3 = new com.moloco.sdk.service_locator.b(19);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            final j2 j2Var = (j2) a1.d.rememberSaveable(objArr, (a1.m) null, (String) null, (kv.a) objRememberedValue3, wVarStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            wVarStartRestartGroup.startReplaceableGroup(-794071564);
            Object objRememberedValue4 = wVarStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == vVar6.getEmpty()) {
                objRememberedValue4 = new com.moloco.sdk.service_locator.b(20);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            final j2 j2Var2 = (j2) a1.d.rememberSaveable(objArr2, (a1.m) null, (String) null, (kv.a) objRememberedValue4, wVarStartRestartGroup, 3072, 6);
            final v5 v5VarRememberUpdatedState3 = z4.rememberUpdatedState(onProgressChanged, wVarStartRestartGroup, (i17 >> 24) & 14);
            final v5 v5VarRememberUpdatedState4 = z4.rememberUpdatedState(onError, wVarStartRestartGroup, (i17 >> 27) & 14);
            wVarStartRestartGroup.startReplaceableGroup(-794063918);
            boolean zChanged2 = wVarStartRestartGroup.changed(hVar4) | wVarStartRestartGroup.changed(v5VarRememberUpdatedState) | wVarStartRestartGroup.changed(j2Var2) | wVarStartRestartGroup.changed(j2Var) | wVarStartRestartGroup.changed(v5VarRememberUpdatedState2) | wVarStartRestartGroup.changed(coroutineScope) | wVarStartRestartGroup.changed(v5VarRememberUpdatedState3) | wVarStartRestartGroup.changed(v5VarRememberUpdatedState4);
            Object objRememberedValue5 = wVarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == vVar6.getEmpty()) {
                objRememberedValue5 = new kv.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0
                    @Override // kv.l
                    public final Object invoke(Object obj) {
                        return f0.a(hVar4, coroutineScope, j2Var2, j2Var, v5VarRememberUpdatedState, v5VarRememberUpdatedState2, v5VarRememberUpdatedState3, v5VarRememberUpdatedState4, (h1) obj);
                    }
                };
                hVar = hVar4;
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                hVar = hVar4;
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.DisposableEffect(hVar, (kv.l) objRememberedValue5, wVarStartRestartGroup, 0);
            wVarStartRestartGroup.startReplaceableGroup(-794027148);
            boolean zChanged3 = wVarStartRestartGroup.changed(hVar);
            Object objRememberedValue6 = wVarStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == vVar6.getEmpty()) {
                objRememberedValue6 = new d(hVar, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.LaunchedEffect(x0.f87415a, (kv.p) objRememberedValue6, wVarStartRestartGroup, 6);
            wVarStartRestartGroup.startReplaceableGroup(-794015629);
            boolean zChanged4 = wVarStartRestartGroup.changed(hVar) | wVarStartRestartGroup.changed(uri) | wVarStartRestartGroup.changed(seekToMillis) | wVarStartRestartGroup.changed(play);
            Object objRememberedValue7 = wVarStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue7 == vVar6.getEmpty()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar5 = hVar;
                i16 = i17;
                e eVar = new e(hVar5, uri, seekToMillis, play, null);
                hVar2 = hVar5;
                nVar = play;
                wVarStartRestartGroup.updateRememberedValue(eVar);
                objRememberedValue7 = eVar;
            } else {
                i16 = i17;
                nVar = play;
                hVar2 = hVar;
            }
            wVarStartRestartGroup.endReplaceableGroup();
            int i20 = i16 >> 3;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar6 = hVar2;
            k1.LaunchedEffect(hVar6, uri, seekToMillis, (kv.p) objRememberedValue7, wVarStartRestartGroup, ((i16 << 3) & 112) | (i20 & 896));
            wVarStartRestartGroup.startReplaceableGroup(-793998962);
            boolean zChanged5 = wVarStartRestartGroup.changed(hVar6) | wVarStartRestartGroup.changed(nVar);
            Object objRememberedValue8 = wVarStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue8 == vVar6.getEmpty()) {
                objRememberedValue8 = new f(hVar6, nVar, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.LaunchedEffect(hVar6, nVar, (kv.p) objRememberedValue8, wVarStartRestartGroup, i20 & 112);
            Boolean boolValueOf = Boolean.valueOf(z11);
            wVarStartRestartGroup.startReplaceableGroup(-793993338);
            boolean zChanged6 = wVarStartRestartGroup.changed(hVar6) | wVarStartRestartGroup.changed(z11);
            Object objRememberedValue9 = wVarStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue9 == vVar6.getEmpty()) {
                objRememberedValue9 = new g(hVar6, z11, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.LaunchedEffect(hVar6, boolValueOf, (kv.p) objRememberedValue9, wVarStartRestartGroup, (i16 >> 9) & 112);
            View viewN = hVar6.N();
            if (viewN == null) {
                vVar3 = vVar5;
                wVar2 = wVarStartRestartGroup;
            } else {
                wVarStartRestartGroup.startReplaceableGroup(-1928433433);
                boolean zChanged7 = wVarStartRestartGroup.changed(viewN);
                Object objRememberedValue10 = wVarStartRestartGroup.rememberedValue();
                if (zChanged7 || objRememberedValue10 == vVar6.getEmpty()) {
                    objRememberedValue10 = new aw.f(viewN, 14);
                    wVarStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                wVarStartRestartGroup.endReplaceableGroup();
                vVar3 = vVar5;
                u2.q.AndroidView((kv.l) objRememberedValue10, vVar3, null, wVarStartRestartGroup, (i19 << 3) & 112, 4);
                wVar2 = wVarStartRestartGroup;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            vVar4 = vVar3;
        }
        o4 o4VarEndRestartGroup = wVar2.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar2 = nVar;
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0
                @Override // kv.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return f0.a(uri, z10, nVar2, seekToMillis, z11, isPlaying, isVisible, viewVisibilityTracker, onProgressChanged, onError, vVar4, i10, i11, i12, (p0.w) obj, iIntValue);
                }
            });
        }
    }

    public static final kv.l b(v5 v5Var) {
        return (kv.l) v5Var.getValue();
    }

    public static final zu.m a() {
        return f49640a;
    }

    public static final g1 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, CoroutineScope coroutineScope, j2 j2Var, j2 j2Var2, v5 v5Var, v5 v5Var2, v5 v5Var3, v5 v5Var4, h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new h(p0.listOf((Object[]) new Job[]{FlowKt.launchIn(FlowKt.onEach(gVar.isPlaying(), new a(j2Var, j2Var2, gVar, v5Var, v5Var2, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(gVar.p(), new b(v5Var3, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(gVar.f()), new c(v5Var4, null)), coroutineScope)}), gVar, v5Var);
    }

    public static final FrameLayout a(View view, Context it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final kv.l a(v5 v5Var) {
        return (kv.l) v5Var.getValue();
    }
}
