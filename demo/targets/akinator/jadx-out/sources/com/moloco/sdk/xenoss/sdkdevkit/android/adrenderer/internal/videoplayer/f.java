package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements q {

    /* renamed from: b, reason: collision with root package name */
    public final k0 f50129b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f50130c;

    public f(k0 lifecycle, kv.a onExoResume, kv.a onExoPause) {
        e0.checkNotNullParameter(lifecycle, "lifecycle");
        e0.checkNotNullParameter(onExoResume, "onExoResume");
        e0.checkNotNullParameter(onExoPause, "onExoPause");
        this.f50129b = lifecycle;
        l0 l0Var = new l0(1, onExoResume, onExoPause);
        this.f50130c = l0Var;
        lifecycle.addObserver(l0Var);
    }

    public static final void a(kv.a aVar, kv.a aVar2, b1 b1Var, i0 event) {
        e0.checkNotNullParameter(b1Var, "<unused var>");
        e0.checkNotNullParameter(event, "event");
        int i10 = e.f50128a[event.ordinal()];
        if (i10 == 1) {
            aVar.invoke();
        } else {
            if (i10 == 2 || i10 == 3 || i10 != 4) {
                return;
            }
            aVar2.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        this.f50129b.removeObserver(this.f50130c);
    }
}
