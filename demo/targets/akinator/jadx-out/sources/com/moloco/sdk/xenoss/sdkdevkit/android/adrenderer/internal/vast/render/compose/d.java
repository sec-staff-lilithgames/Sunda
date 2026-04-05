package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import g0.h3;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f49607a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f49608b = z0.u.composableLambdaInstance(262683049, false, a.f49609b);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f49609b = new a();

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(262683049, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$CompanionKt.lambda-1.<anonymous> (Companion.kt:87)");
            }
            b.a(new k.b("https://images.unsplash.com/photo-1453728013993-6d66e9c9123a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2670&q=80", 267, 178), h3.fillMaxSize$default(e1.t.f53496b, 0.0f, 1, null), wVar, 48, 0);
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

    public final kv.p a() {
        return f49608b;
    }
}
