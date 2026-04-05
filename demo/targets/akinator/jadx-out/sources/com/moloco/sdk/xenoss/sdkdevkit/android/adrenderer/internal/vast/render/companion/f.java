package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class f {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d b(int i10) {
        return i10 == 0 ? d.a.f49898a : new d.b(i10, null);
    }

    public static final d a(int i10, CoroutineScope scope) {
        e0.checkNotNullParameter(scope, "scope");
        return new e(i10, scope, null);
    }
}
