package com.vungle.ads;

import com.vungle.ads.internal.util.ImageLoader;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NativeAd$imageLoader$2 extends f0 implements kv.a {
    final /* synthetic */ NativeAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAd$imageLoader$2(NativeAd nativeAd) {
        super(0);
        this.this$0 = nativeAd;
    }

    @Override // kv.a
    public final ImageLoader invoke() {
        ImageLoader companion = ImageLoader.Companion.getInstance();
        companion.init(this.this$0.getExecutors().getIoExecutor());
        return companion;
    }
}
