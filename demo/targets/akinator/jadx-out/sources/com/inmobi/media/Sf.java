package com.inmobi.media;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Sf {

    /* renamed from: a, reason: collision with root package name */
    public final F5 f32280a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f32281b = new ConcurrentHashMap();

    public Sf(F5 f52) {
        this.f32280a = f52;
    }

    public final void a(kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) this.f32281b.get(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            action.invoke(gestureDetectorOnGestureListenerC3093yc);
        }
        ConcurrentHashMap concurrentHashMap = this.f32281b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!kotlin.jvm.internal.e0.areEqual(entry.getKey(), BuildConfig.FLAVOR)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((GestureDetectorOnGestureListenerC3093yc) ((Map.Entry) it.next()).getValue());
        }
    }

    public final void b(kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        ConcurrentHashMap concurrentHashMap = this.f32281b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC3093yc) entry.getValue()) instanceof Fc) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) ((Map.Entry) it.next()).getValue();
            kotlin.jvm.internal.e0.checkNotNull(gestureDetectorOnGestureListenerC3093yc, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((Fc) gestureDetectorOnGestureListenerC3093yc);
        }
    }

    public final GestureDetectorOnGestureListenerC3093yc a(Wc route, Context context, short s10, S adMetaData) {
        GestureDetectorOnGestureListenerC3093yc fc2;
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adMetaData, "adMetaData");
        if (s10 == 0) {
            F5 f52 = this.f32280a;
            if (f52 != null) {
                ((G5) f52).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.f32467b);
            }
            fc2 = new GestureDetectorOnGestureListenerC3093yc(context, adMetaData.f32238o, adMetaData.f32239p, adMetaData.f32240q, false, adMetaData.f32242s, 0L, adMetaData.f32243t, adMetaData.f32244u, route, this, adMetaData, 80);
        } else if (s10 == 1) {
            F5 f53 = this.f32280a;
            if (f53 != null) {
                ((G5) f53).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + route.f32467b);
            }
            fc2 = new Fc(context, adMetaData.f32238o, adMetaData.f32244u, S.a(adMetaData, null, 4194047), this, route);
        } else {
            F5 f54 = this.f32280a;
            if (f54 != null) {
                ((G5) f54).b("SiblingWebViewManager", a.b.e(s10, "Unsupported WebView type: "));
            }
            throw new IllegalArgumentException(a.b.e(s10, "Unsupported WebView type: "));
        }
        String str = route.f32467b;
        this.f32281b.put(str, fc2);
        F5 f55 = this.f32280a;
        if (f55 != null) {
            ((G5) f55).a("SiblingWebViewManager", AbstractC2811i0.a("Registered bridge for WebView ID: ", str));
        }
        return fc2;
    }
}
