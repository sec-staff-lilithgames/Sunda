package com.inmobi.media;

import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class R8 extends PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiNative> f32213a;

    public R8(InMobiNative inMobiNative) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inMobiNative, "inMobiNative");
        this.f32213a = new WeakReference<>(inMobiNative);
    }

    public final WeakReference<InMobiNative> getNativeRef() {
        return this.f32213a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        AbstractC2751e8 mPubListener;
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
        InMobiNative inMobiNative = this.f32213a.get();
        if (inMobiNative == null || (mPubListener = inMobiNative.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiNative, log);
    }

    public final void setNativeRef(WeakReference<InMobiNative> weakReference) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weakReference, "<set-?>");
        this.f32213a = weakReference;
    }
}
