package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0;
import java.lang.ref.WeakReference;
import p0.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static kv.w f48026d;

    /* renamed from: f, reason: collision with root package name */
    public static kv.a f48028f;

    /* renamed from: g, reason: collision with root package name */
    public static d f48029g;

    /* renamed from: h, reason: collision with root package name */
    public static e0 f48030h;

    /* renamed from: i, reason: collision with root package name */
    public static kv.a f48031i;

    /* renamed from: a, reason: collision with root package name */
    public static final c f48023a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f48024b = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f48025c = new WeakReference(null);

    /* renamed from: e, reason: collision with root package name */
    public static kv.p f48027e = a.f48032b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f48032b = new a();

        public final kv.b a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(-631904177);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-631904177, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivityDataHolder.closeButton.<anonymous> (MraidActivity.kt:259)");
            }
            kv.b bVarA = a0.a(null, null, 0L, 0L, 0L, null, null, null, wVar, 0, 255);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    public final void a(l lVar) {
        f48024b = new WeakReference(lVar);
    }

    public final kv.p b() {
        return f48027e;
    }

    public final kv.w c() {
        return f48026d;
    }

    public final kv.a d() {
        return f48028f;
    }

    public final kv.a e() {
        return f48031i;
    }

    public final e0 f() {
        return f48030h;
    }

    public final Activity g() {
        return (Activity) f48025c.get();
    }

    public final l h() {
        return (l) f48024b.get();
    }

    public final void a(Activity activity) {
        f48025c = new WeakReference(activity);
    }

    public final void b(kv.a aVar) {
        f48031i = aVar;
    }

    public final void a(kv.w wVar) {
        f48026d = wVar;
    }

    public final void a(kv.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<set-?>");
        f48027e = pVar;
    }

    public final void a(kv.a aVar) {
        f48028f = aVar;
    }

    public final d a() {
        return f48029g;
    }

    public final void a(d dVar) {
        f48029g = dVar;
    }

    public final void a(e0 e0Var) {
        f48030h = e0Var;
    }
}
