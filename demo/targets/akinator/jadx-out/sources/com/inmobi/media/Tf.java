package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Tf extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tf(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f32309a = true;
        super.destroy();
    }
}
