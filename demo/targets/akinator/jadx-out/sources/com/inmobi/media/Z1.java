package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Z1 extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public final tu.o f32589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f32589a = tu.q.lazy(new Y1(this));
    }

    public abstract S6 f();

    public final S6 getLandingPageHandler() {
        return (S6) this.f32589a.getValue();
    }
}
