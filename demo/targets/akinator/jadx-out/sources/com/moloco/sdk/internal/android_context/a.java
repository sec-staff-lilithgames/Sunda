package com.moloco.sdk.internal.android_context;

import android.content.Context;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45829a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile Context f45830b;

    public final Context a() {
        Context context = f45830b;
        if (context != null) {
            return context;
        }
        e0.throwUninitializedPropertyAccessException(wHkgq.ucUeA);
        return null;
    }

    public final void a(Context context) {
        e0.checkNotNullParameter(context, "context");
        f45830b = context.getApplicationContext();
    }
}
