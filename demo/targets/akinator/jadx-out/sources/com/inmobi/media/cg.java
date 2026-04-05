package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cg implements Xf {

    /* renamed from: g, reason: collision with root package name */
    public static final WeakHashMap f32716g = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Zf f32717a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f32718b;

    /* renamed from: c, reason: collision with root package name */
    public View f32719c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f32720d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f32721e;

    /* renamed from: f, reason: collision with root package name */
    public EnumC3108za f32722f;

    public cg(Activity activity, Zf windowInsetListener, F5 f52) {
        Window window;
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        this.f32717a = windowInsetListener;
        this.f32718b = f52;
        this.f32720d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.f32721e = weakReference;
        if (!R3.f32183a.P()) {
            if (f52 != null) {
                ((G5) f52).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.f32719c = decorView;
            if (f52 != null) {
                ((G5) f52).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = f32716g;
            Object yf2 = weakHashMap.get(decorView);
            if (yf2 == null) {
                yf2 = new Yf(decorView);
                weakHashMap.put(decorView, yf2);
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(this, "listener");
            ((Yf) yf2).f32586a.add(this);
            if (f52 != null) {
                ((G5) f52).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(ag insets, int i10) {
        EnumC3108za orientation = Aa.a(AbstractC2679a4.g());
        bg bgVar = (bg) this.f32720d.get(Integer.valueOf(i10));
        if (bgVar == null) {
            bgVar = new bg();
            this.f32720d.put(Integer.valueOf(i10), bgVar);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        ag agVar = (ag) bgVar.f32694a.get(orientation);
        if (agVar == null || !kotlin.jvm.internal.e0.areEqual(insets, agVar)) {
            F5 f52 = this.f32718b;
            if (f52 != null) {
                ((G5) f52).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
            kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
            bgVar.f32694a.put(orientation, insets);
            ConcurrentHashMap concurrentHashMap = this.f32720d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(uu.o1.mapCapacity(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((bg) entry.getValue()).a());
            }
            AbstractC2679a4.a(linkedHashMap);
        } else {
            F5 f53 = this.f32718b;
            if (f53 != null) {
                ((G5) f53).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        }
        if (this.f32722f != orientation) {
            this.f32722f = orientation;
            Zf zf2 = this.f32717a;
            Object obj = this.f32720d.get(Integer.valueOf(i10));
            kotlin.jvm.internal.e0.checkNotNull(obj);
            zf2.a(orientation, (bg) obj);
        }
    }

    public final void a() {
        View view = this.f32719c;
        if (view != null) {
            WeakHashMap weakHashMap = f32716g;
            Yf yf2 = (Yf) weakHashMap.get(view);
            if (yf2 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(this, "listener");
                yf2.f32586a.remove(this);
                if (yf2.f32586a.isEmpty()) {
                    yf2.a();
                    weakHashMap.remove(view);
                }
            }
            F5 f52 = this.f32718b;
            if (f52 != null) {
                ((G5) f52).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
    }
}
