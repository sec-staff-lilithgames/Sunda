package com.inmobi.media;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G3 implements La {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H3 f31812a;

    public G3(H3 h32) {
        this.f31812a = h32;
    }

    @Override // com.inmobi.media.La
    public final void a(Na result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        WeakReference weakReference = (WeakReference) this.f31812a.f32453b.get(result.f32074a.f31920h);
        Va va2 = weakReference != null ? (Va) weakReference.get() : null;
        if (Qa.a(result)) {
            this.f31812a.b(result, va2);
        } else {
            this.f31812a.a(result, va2);
        }
    }
}
