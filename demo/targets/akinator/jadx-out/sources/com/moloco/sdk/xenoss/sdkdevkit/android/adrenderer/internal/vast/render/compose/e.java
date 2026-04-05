package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import b0.q0;
import g0.f2;
import g0.v2;
import n0.n1;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f49618a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f49619b = z0.u.composableLambdaInstance(-1970835476, false, a.f49620b);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.s {

        /* renamed from: b, reason: collision with root package name */
        public static final a f49620b = new a();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e$a$a, reason: collision with other inner class name */
        public static final class C0470a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kv.a f49621b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e$a$a$a, reason: collision with other inner class name */
            public static final class C0471a implements kv.q {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f49622b;

                public C0471a(boolean z10) {
                    this.f49622b = z10;
                }

                public final void a(v2 TextButton, p0.w wVar, int i10) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(TextButton, "$this$TextButton");
                    if ((i10 & 17) == 16 && wVar.getSkipping()) {
                        wVar.skipToGroupEnd();
                        return;
                    }
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventStart(-919554769, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (PlaybackControl.kt:55)");
                    }
                    n1.m5701TextfLXpl1I(this.f49622b ? "Pause" : "Play", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, wVar, 0, 0, 65534);
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventEnd();
                    }
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((v2) obj, (p0.w) obj2, ((Number) obj3).intValue());
                    return x0.f87415a;
                }
            }

            public C0470a(kv.a aVar) {
                this.f49621b = aVar;
            }

            public final void a(boolean z10, p0.w wVar, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (wVar.changed(z10) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(170935244, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous> (PlaybackControl.kt:54)");
                }
                n0.h.TextButton(this.f49621b, null, false, null, null, null, null, null, null, z0.u.composableLambda(wVar, -919554769, true, new C0471a(z10)), wVar, 805306368, 510);
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a(((Boolean) obj).booleanValue(), (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        public final void a(g0.e0 e0Var, boolean z10, kv.a onClick, p0.w wVar, int i10) {
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (wVar.changed(e0Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= wVar.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= wVar.changed(onClick) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i11 & 1171) == 1170 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1970835476, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous> (PlaybackControl.kt:48)");
            }
            q0.Crossfade(Boolean.valueOf(z10), f2.m3877padding3ABfNKs(((g0.f0) e0Var).align(e1.t.f53496b, e1.d.f53469a.getBottomCenter()), s2.i.m6817constructorimpl(4)), null, z0.u.composableLambda(wVar, 170935244, true, new C0470a(onClick)), wVar, ((i11 >> 3) & 14) | 3072, 4);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((g0.e0) obj, ((Boolean) obj2).booleanValue(), (kv.a) obj3, (p0.w) obj4, ((Number) obj5).intValue());
            return x0.f87415a;
        }
    }

    public final kv.s a() {
        return f49619b;
    }
}
