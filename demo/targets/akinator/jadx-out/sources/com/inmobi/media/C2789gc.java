package com.inmobi.media;

import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.gc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2789gc extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public static final C2789gc f32888a = new C2789gc();

    public C2789gc() {
        super(2);
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        String trackerName = (String) obj;
        Map macros = (Map) obj2;
        kotlin.jvm.internal.e0.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
        SparseArray sparseArray = InMobiAdActivity.f31591k;
        kotlin.jvm.internal.e0.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = InMobiAdActivity.f31592l;
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            gestureDetectorOnGestureListenerC3093yc.a(trackerName, macros);
        }
        return tu.x0.f87415a;
    }
}
