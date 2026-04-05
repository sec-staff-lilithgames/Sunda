package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.core.app.NotificationCompat;
import b0.t1;
import b0.v1;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import g0.b4;
import g0.f2;
import g0.i2;
import tu.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class j {
    public static final kv.b a(e1.d alignment, i2 padding, long j10, long j11, long j12, x afterCountdownButtonPart, a.c.EnumC0490a buttonType, kv.a aVar, com.moloco.sdk.internal.ortb.model.i iVar, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        kotlin.jvm.internal.e0.checkNotNullParameter(padding, "padding");
        kotlin.jvm.internal.e0.checkNotNullParameter(afterCountdownButtonPart, "afterCountdownButtonPart");
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        wVar.startReplaceableGroup(410719381);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(410719381, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton (AdCountdownButton.kt:53)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, -563618292, true, new a(alignment, padding, buttonType, afterCountdownButtonPart, aVar, j10, j11, j12, iVar));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.d f48605b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2 f48606c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a.c.EnumC0490a f48607e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x f48608f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.a f48609g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f48610h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f48611i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f48612j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.i f48613k;

        public a(e1.d dVar, i2 i2Var, a.c.EnumC0490a enumC0490a, x xVar, kv.a aVar, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.i iVar) {
            this.f48605b = dVar;
            this.f48606c = i2Var;
            this.f48607e = enumC0490a;
            this.f48608f = xVar;
            this.f48609g = aVar;
            this.f48610h = j10;
            this.f48611i = j11;
            this.f48612j = j12;
            this.f48613k = iVar;
        }

        public final void a(g0.e0 e0Var, boolean z10, boolean z11, kv.a onClick, kv.l onButtonRendered, boolean z12, int i10, int i11, p0.w wVar, int i12) {
            int i13;
            boolean z13;
            boolean z14;
            int i14;
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
            kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if ((i12 & 6) == 0) {
                i13 = (wVar.changed(e0Var) ? 4 : 2) | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 48) == 0) {
                z13 = z10;
                i13 |= wVar.changed(z13) ? 32 : 16;
            } else {
                z13 = z10;
            }
            if ((i12 & 384) == 0) {
                i13 |= wVar.changed(z11) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i12 & 3072) == 0) {
                i13 |= wVar.changed(onClick) ? 2048 : 1024;
            }
            if ((i12 & 24576) == 0) {
                i13 |= wVar.changed(onButtonRendered) ? 16384 : Segment.SIZE;
            }
            if ((i12 & 196608) == 0) {
                z14 = z12;
                i13 |= wVar.changed(z14) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            } else {
                z14 = z12;
            }
            if ((1572864 & i12) == 0) {
                i13 |= wVar.changed(i10) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((i12 & 12582912) == 0) {
                i14 = i11;
                i13 |= wVar.changed(i14) ? 8388608 : 4194304;
            } else {
                i14 = i11;
            }
            if ((38347923 & i13) == 38347922 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-563618292, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous> (AdCountdownButton.kt:55)");
            }
            boolean z15 = z14;
            int i15 = i14;
            b0.b0.AnimatedVisibility(z11, f2.padding(b4.displayCutoutPadding(((g0.f0) e0Var).align(e1.t.f53496b, this.f48605b)), this.f48606c), (t1) null, (v1) null, (String) null, z0.u.composableLambda(wVar, 411500084, true, new C0445a(this.f48607e, onButtonRendered, z13, this.f48608f, z15, i10, i15, onClick, this.f48609g, this.f48610h, this.f48611i, this.f48612j, this.f48613k)), wVar, ((i13 >> 6) & 14) | 196608, 28);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
            a((g0.e0) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (kv.a) obj4, (kv.l) obj5, ((Boolean) obj6).booleanValue(), ((k0) obj7).m7061unboximpl(), ((k0) obj8).m7061unboximpl(), (p0.w) obj9, ((Number) obj10).intValue());
            return x0.f87415a;
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j$a$a, reason: collision with other inner class name */
        public static final class C0445a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.c.EnumC0490a f48614b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kv.l f48615c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f48616e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ x f48617f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f48618g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ int f48619h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ int f48620i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ kv.a f48621j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ kv.a f48622k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f48623l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f48624m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ long f48625n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.i f48626o;

            public C0445a(a.c.EnumC0490a enumC0490a, kv.l lVar, boolean z10, x xVar, boolean z11, int i10, int i11, kv.a aVar, kv.a aVar2, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.i iVar) {
                this.f48614b = enumC0490a;
                this.f48615c = lVar;
                this.f48616e = z10;
                this.f48617f = xVar;
                this.f48618g = z11;
                this.f48619h = i10;
                this.f48620i = i11;
                this.f48621j = aVar;
                this.f48622k = aVar2;
                this.f48623l = j10;
                this.f48624m = j11;
                this.f48625n = j12;
                this.f48626o = iVar;
            }

            public final void a(b0.c0 AnimatedVisibility, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(411500084, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous> (AdCountdownButton.kt:62)");
                }
                i0.a(e1.t.f53496b, this.f48614b, this.f48615c, z0.u.composableLambda(wVar, 1495696596, true, new C0446a(this.f48616e, this.f48617f, this.f48618g, this.f48619h, this.f48620i, this.f48621j, this.f48622k, this.f48623l, this.f48624m, this.f48625n, this.f48626o)), wVar, 3078, 0);
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((b0.c0) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j$a$a$a, reason: collision with other inner class name */
            public static final class C0446a implements kv.q {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f48627b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ x f48628c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f48629e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f48630f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f48631g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ kv.a f48632h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ kv.a f48633i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ long f48634j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f48635k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f48636l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.i f48637m;

                public C0446a(boolean z10, x xVar, boolean z11, int i10, int i11, kv.a aVar, kv.a aVar2, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.i iVar) {
                    this.f48627b = z10;
                    this.f48628c = xVar;
                    this.f48629e = z11;
                    this.f48630f = i10;
                    this.f48631g = i11;
                    this.f48632h = aVar;
                    this.f48633i = aVar2;
                    this.f48634j = j10;
                    this.f48635k = j11;
                    this.f48636l = j12;
                    this.f48637m = iVar;
                }

                public final void a(e1.v modifier, p0.w wVar, int i10) {
                    int i11;
                    kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (wVar.changed(modifier) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && wVar.getSkipping()) {
                        wVar.skipToGroupEnd();
                        return;
                    }
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventStart(1495696596, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous>.<anonymous> (AdCountdownButton.kt:67)");
                    }
                    x aVar = this.f48627b ? this.f48628c : new x.a(this.f48629e, this.f48630f, this.f48631g, null);
                    wVar.startReplaceableGroup(1166285558);
                    kv.a aVar2 = this.f48632h;
                    boolean zChanged = wVar.changed(aVar2);
                    kv.a aVar3 = this.f48633i;
                    boolean zChanged2 = zChanged | wVar.changed(aVar3);
                    Object objRememberedValue = wVar.rememberedValue();
                    if (zChanged2 || objRememberedValue == p0.v.f80515a.getEmpty()) {
                        objRememberedValue = new i(aVar2, aVar3, 0);
                        wVar.updateRememberedValue(objRememberedValue);
                    }
                    wVar.endReplaceableGroup();
                    w.a(aVar, modifier, (kv.a) objRememberedValue, this.f48627b, this.f48634j, this.f48635k, this.f48636l, this.f48637m, wVar, (i11 << 3) & 112, 0);
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventEnd();
                    }
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                    return x0.f87415a;
                }

                public static final x0 a(kv.a aVar, kv.a aVar2) {
                    aVar.invoke();
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return x0.f87415a;
                }
            }
        }
    }
}
