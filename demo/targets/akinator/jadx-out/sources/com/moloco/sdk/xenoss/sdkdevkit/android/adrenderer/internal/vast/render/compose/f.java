package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f49637a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f49638b = z0.u.composableLambdaInstance(-1374838940, false, a.f49639b);

    public final kv.p a() {
        return f49638b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f49639b = new a();

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1374838940, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$VastCTAKt.lambda-1.<anonymous> (VastCTA.kt:60)");
            }
            wVar.startReplaceableGroup(-1163733356);
            Object objRememberedValue = wVar.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new com.moloco.sdk.service_locator.b(16);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            q.a(null, "https://play-lh.googleusercontent.com/l_C7yZC4etIdr5tUY7-7LdKzi_-FWmVhwqMU_OncT9MMntcK-wWBEIvuVrfT1Yoe6Q=s96", "Learn More", 0L, (kv.a) objRememberedValue, wVar, 25008, 9);
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
