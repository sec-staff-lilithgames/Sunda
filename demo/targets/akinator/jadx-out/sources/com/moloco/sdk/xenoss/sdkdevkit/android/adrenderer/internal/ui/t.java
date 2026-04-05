package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.ironsource.C3271ic;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f48744a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f48745b = z0.u.composableLambdaInstance(-1693189779, false, a.f48746b);

    public final kv.p a() {
        return f48745b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f48746b = new a();

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1693189779, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.ComposableSingletons$DECKt.lambda-1.<anonymous> (DEC.kt:91)");
            }
            wVar.startReplaceableGroup(-317660580);
            Object objRememberedValue = wVar.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new com.moloco.sdk.service_locator.b(8);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            z.a(null, "https://play-lh.googleusercontent.com/7M9FYlUnscfJQZqHE4Yz2HNEzESl3QOUEVAOD3YzC32HuMsbropV8h_tPpaNdRmqrA=w480-h960", "MONOPOLY GO!", C3271ic.f36943a, (kv.a) objRememberedValue, wVar, 28080, 1);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p0.w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }

        public static final x0 a() {
            return x0.f87415a;
        }
    }
}
