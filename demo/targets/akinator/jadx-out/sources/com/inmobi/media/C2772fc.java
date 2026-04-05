package com.inmobi.media;

import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2772fc extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2772fc f32844a = new C2772fc();

    public C2772fc() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        JSONObject jsonObject = (JSONObject) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "it");
        SparseArray sparseArray = InMobiAdActivity.f31591k;
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = InMobiAdActivity.f31592l;
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            gestureDetectorOnGestureListenerC3093yc.a(jsonObject);
        }
        return tu.x0.f87415a;
    }
}
