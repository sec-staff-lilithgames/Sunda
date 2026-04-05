package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final kv.s f49720a = e.f49618a.a();

    public static final kv.u a(kv.s sVar, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(718660168);
        if ((i11 & 1) != 0) {
            sVar = f49720a;
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(718660168, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl (PlaybackControl.kt:30)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, 1901828083, true, new a(sVar));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    public static final kv.s a() {
        return f49720a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.s f49721b;

        public a(kv.s sVar) {
            this.f49721b = sVar;
        }

        public final void a(g0.e0 e0Var, final boolean z10, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j progress, final kv.l onShouldPlay, final kv.a onShouldReplay, p0.w wVar, int i10) {
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
            kotlin.jvm.internal.e0.checkNotNullParameter(onShouldPlay, "onShouldPlay");
            kotlin.jvm.internal.e0.checkNotNullParameter(onShouldReplay, "onShouldReplay");
            if ((i10 & 6) == 0) {
                i11 = (wVar.changed(e0Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= wVar.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= wVar.changed(progress) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= wVar.changed(onShouldPlay) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i11 |= wVar.changed(onShouldReplay) ? 16384 : Segment.SIZE;
            }
            if ((74899 & i11) == 74898 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1901828083, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl.<anonymous> (PlaybackControl.kt:32)");
            }
            wVar.startReplaceableGroup(263769922);
            boolean zChanged = wVar.changed(progress) | wVar.changed(onShouldReplay) | wVar.changed(onShouldPlay) | wVar.changed(z10);
            Object objRememberedValue = wVar.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new kv.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n
                    @Override // kv.a
                    public final Object invoke() {
                        return o.a.a(progress, onShouldReplay, onShouldPlay, z10);
                    }
                };
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            this.f49721b.invoke(e0Var, Boolean.valueOf(z10), (kv.a) objRememberedValue, wVar, Integer.valueOf(i11 & 126));
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.u
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((g0.e0) obj, ((Boolean) obj2).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) obj3, (kv.l) obj4, (kv.a) obj5, (p0.w) obj6, ((Number) obj7).intValue());
            return x0.f87415a;
        }

        public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, kv.a aVar, kv.l lVar, boolean z10) {
            if (jVar instanceof j.a) {
                aVar.invoke();
            } else {
                lVar.invoke(Boolean.valueOf(!z10));
            }
            return x0.f87415a;
        }
    }
}
