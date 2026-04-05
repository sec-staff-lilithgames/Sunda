package com.moloco.sdk.internal;

import b0.b0;
import b0.c0;
import b0.t1;
import b0.v1;
import com.digidust.elokence.akinator.freemium.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import g0.b4;
import g0.f0;
import g0.f2;
import g0.i2;
import j1.m0;
import j1.o0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.StateFlow;
import p0.d0;
import p0.v5;
import p0.z4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f47223a = o0.Color(4278354171L);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.d f47224b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2 f47225c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47226e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47227f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f47228g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f47229h;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.v$a$a, reason: collision with other inner class name */
        public static final class C0392a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kv.l f47230b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v5 f47231c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f47232e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f47233f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f47234g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ long f47235h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ kv.a f47236i;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.internal.v$a$a$a, reason: collision with other inner class name */
            public static final class C0393a implements kv.q {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f47237b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f47238c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f47239e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f47240f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ kv.a f47241g;

                public C0393a(String str, String str2, long j10, long j11, kv.a aVar) {
                    this.f47237b = str;
                    this.f47238c = str2;
                    this.f47239e = j10;
                    this.f47240f = j11;
                    this.f47241g = aVar;
                }

                public final void a(e1.v it, p0.w wVar, int i10) {
                    int i11;
                    e0.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i11 = (wVar.changed(it) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && wVar.getSkipping()) {
                        wVar.skipToGroupEnd();
                        return;
                    }
                    if (d0.isTraceInProgress()) {
                        d0.traceEventStart(-1938502477, i11, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:72)");
                    }
                    v.a(it, this.f47237b, this.f47238c, this.f47239e, this.f47240f, this.f47241g, wVar, i11 & 14, 0);
                    if (d0.isTraceInProgress()) {
                        d0.traceEventEnd();
                    }
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                    return x0.f87415a;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.internal.v$a$a$b */
            public static final class b implements kv.q {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f47242b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f47243c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f47244e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f47245f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ kv.a f47246g;

                public b(String str, String str2, long j10, long j11, kv.a aVar) {
                    this.f47242b = str;
                    this.f47243c = str2;
                    this.f47244e = j10;
                    this.f47245f = j11;
                    this.f47246g = aVar;
                }

                public final void a(e1.v it, p0.w wVar, int i10) {
                    int i11;
                    e0.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i11 = (wVar.changed(it) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && wVar.getSkipping()) {
                        wVar.skipToGroupEnd();
                        return;
                    }
                    if (d0.isTraceInProgress()) {
                        d0.traceEventStart(-868048676, i11, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:87)");
                    }
                    v.a(it, this.f47242b, this.f47243c, this.f47244e, this.f47245f, this.f47246g, wVar, i11 & 14, 0);
                    if (d0.isTraceInProgress()) {
                        d0.traceEventEnd();
                    }
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                    return x0.f87415a;
                }
            }

            public C0392a(kv.l lVar, v5 v5Var, String str, String str2, long j10, long j11, kv.a aVar) {
                this.f47230b = lVar;
                this.f47231c = v5Var;
                this.f47232e = str;
                this.f47233f = str2;
                this.f47234g = j10;
                this.f47235h = j11;
                this.f47236i = aVar;
            }

            public final void a(c0 AnimatedVisibility, p0.w wVar, int i10) {
                e0.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (d0.isTraceInProgress()) {
                    d0.traceEventStart(-657845797, i10, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous> (MolocoVastCTA.kt:66)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVarB = a.b(this.f47231c);
                if (kVarB instanceof k.a) {
                    wVar.startReplaceableGroup(-388830153);
                    i0.a(null, a.c.EnumC0490a.f50252i, this.f47230b, z0.u.composableLambda(wVar, -1938502477, true, new C0393a(this.f47232e, this.f47233f, this.f47234g, this.f47235h, this.f47236i)), wVar, 3120, 1);
                    wVar.endReplaceableGroup();
                } else if (kVarB instanceof k.c) {
                    wVar.startReplaceableGroup(-388268681);
                    i0.a(null, a.c.EnumC0490a.f50252i, this.f47230b, z0.u.composableLambda(wVar, -868048676, true, new b(this.f47232e, this.f47233f, this.f47234g, this.f47235h, this.f47236i)), wVar, 3120, 1);
                    wVar.endReplaceableGroup();
                } else if (kVarB instanceof k.b) {
                    wVar.startReplaceableGroup(-387725902);
                    wVar.endReplaceableGroup();
                } else if (kVarB instanceof k.d) {
                    wVar.startReplaceableGroup(-387668366);
                    wVar.endReplaceableGroup();
                } else {
                    if (kVarB != null) {
                        wVar.startReplaceableGroup(-843828347);
                        wVar.endReplaceableGroup();
                        throw new tu.t();
                    }
                    wVar.startReplaceableGroup(-387633677);
                    wVar.endReplaceableGroup();
                }
                if (d0.isTraceInProgress()) {
                    d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((c0) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        public a(e1.d dVar, i2 i2Var, String str, String str2, long j10, long j11) {
            this.f47224b = dVar;
            this.f47225c = i2Var;
            this.f47226e = str;
            this.f47227f = str2;
            this.f47228g = j10;
            this.f47229h = j11;
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k b(v5 v5Var) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) v5Var.getValue();
        }

        @Override // kv.u
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((g0.e0) obj, ((Boolean) obj2).booleanValue(), (StateFlow) obj3, (kv.l) obj4, (kv.a) obj5, (p0.w) obj6, ((Number) obj7).intValue());
            return x0.f87415a;
        }

        public final void a(g0.e0 e0Var, boolean z10, StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k> currentAdPartFlow, kv.l onButtonRendered, kv.a onCTA, p0.w wVar, int i10) {
            e0.checkNotNullParameter(e0Var, "<this>");
            e0.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            e0.checkNotNullParameter(onCTA, "onCTA");
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-927135997, i10, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous> (MolocoVastCTA.kt:48)");
            }
            v5 v5VarCollectAsState = z4.collectAsState(currentAdPartFlow, null, wVar, (i10 >> 6) & 14, 1);
            b0.AnimatedVisibility(z10, f2.padding(b4.displayCutoutPadding(((f0) e0Var).align(e1.t.f53496b, this.f47224b)), this.f47225c), (t1) null, (v1) null, (String) null, z0.u.composableLambda(wVar, -657845797, true, new C0392a(onButtonRendered, v5VarCollectAsState, this.f47226e, this.f47227f, this.f47228g, this.f47229h, onCTA)), wVar, ((i10 >> 3) & 14) | 196608, 28);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }
    }

    public static final x0 a(e1.v vVar, String str, String str2, long j10, long j11, kv.a aVar, int i10, int i11, p0.w wVar, int i12) {
        a(vVar, str, str2, j10, j11, aVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final kv.u a(e1.d dVar, i2 i2Var, String str, long j10, long j11, String str2, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(959702933);
        if ((i11 & 1) != 0) {
            dVar = e1.d.f53469a.getBottomEnd();
        }
        e1.d dVar2 = dVar;
        if ((i11 & 2) != 0) {
            i2Var = f2.m3870PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        i2 i2Var2 = i2Var;
        if ((i11 & 4) != 0) {
            str = d2.d.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, wVar, 0);
        }
        String str3 = str;
        long jM4836getWhite0d7_KjU = (i11 & 8) != 0 ? m0.f68918b.m4836getWhite0d7_KjU() : j10;
        long j12 = (i11 & 16) != 0 ? f47223a : j11;
        String str4 = (i11 & 32) != 0 ? null : str2;
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(959702933, i10, -1, "com.moloco.sdk.internal.molocoCTAButton (MolocoVastCTA.kt:47)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, -927135997, true, new a(dVar2, i2Var2, str4, str3, jM4836getWhite0d7_KjU, j12));
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(e1.v r34, java.lang.String r35, final java.lang.String r36, final long r37, final long r39, final kv.a r41, p0.w r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.v.a(e1.v, java.lang.String, java.lang.String, long, long, kv.a, p0.w, int, int):void");
    }

    public static final long a() {
        return f47223a;
    }
}
