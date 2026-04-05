package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import p0.o4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f47563a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.p f47564b;

        public a(kv.p pVar) {
            this.f47564b = pVar;
        }

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(586795374, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkImpl.ApplyWatermark.<anonymous> (Watermark.kt:47)");
            }
            this.f47564b.invoke(wVar, 0);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p0.w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final x0 a(b bVar, kv.p pVar, int i10, p0.w wVar, int i11) {
        bVar.a(pVar, wVar, i10 | 1);
        return x0.f87415a;
    }

    public b(String str) {
        this.f47563a = str;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0
    public void a(kv.p content, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(412679763);
        if ((i10 & 6) == 0) {
            i11 = (wVarStartRestartGroup.changed(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= wVarStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(412679763, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkImpl.ApplyWatermark (Watermark.kt:45)");
            }
            d.a(this.f47563a, z0.u.composableLambda(wVarStartRestartGroup, 586795374, true, new a(content)), wVarStartRestartGroup, 48);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a(this, content, i10, 0));
        }
    }

    public /* synthetic */ b(String str, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0
    public void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        Bitmap bitmapA = d.a(this.f47563a);
        if (bitmapA == null) {
            return;
        }
        com.moloco.sdk.service_locator.a aVar = com.moloco.sdk.service_locator.a.f47434a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(aVar.a().getResources(), bitmapA);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(aVar.a().getResources().getDisplayMetrics());
        view.setForeground(bitmapDrawable);
        view.setClickable(false);
        view.setFocusable(false);
    }
}
