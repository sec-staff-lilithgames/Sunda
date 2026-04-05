package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SimpleContextProvider implements ContextProvider {
    private final Context applicationContext;

    public SimpleContextProvider(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // io.bidmachine.ContextProvider
    public Activity getActivity() {
        WeakReference weakReference = o0.f61966b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Override // io.bidmachine.ContextProvider
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // io.bidmachine.ContextProvider
    public Context getContext() {
        return this.applicationContext;
    }
}
