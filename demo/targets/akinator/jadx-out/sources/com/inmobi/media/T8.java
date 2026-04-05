package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class T8 extends C3004t8 {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f32304a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T8(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public final C2734d8 getNativeStrandAd() {
        WeakReference weakReference = this.f32304a;
        if (weakReference != null) {
            return (C2734d8) weakReference.get();
        }
        return null;
    }

    public final void setNativeStrandAd(C2734d8 c2734d8) {
        this.f32304a = new WeakReference(c2734d8);
    }
}
