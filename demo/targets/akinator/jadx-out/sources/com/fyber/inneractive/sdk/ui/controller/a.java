package com.fyber.inneractive.sdk.ui.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public c f26738a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26739b = new AtomicBoolean(false);

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f10) {
        if (f10 < 0.01f || !this.f26739b.compareAndSet(false, true)) {
            return;
        }
        IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.a(this), Float.valueOf(f10 * 100.0f));
        this.f26738a.u();
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        throw null;
    }
}
