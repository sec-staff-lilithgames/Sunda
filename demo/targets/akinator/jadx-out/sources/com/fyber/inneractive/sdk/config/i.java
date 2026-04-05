package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23318a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f23319b;

    public i(Context context, Context context2) {
        h hVar = new h(this);
        this.f23318a = context2;
        if (context instanceof Activity) {
            this.f23319b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(hVar);
        }
    }

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.f23319b);
        return context != null ? context : this.f23318a;
    }
}
