package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends y {
    @Override // androidx.lifecycle.y, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        l2.f6659c.injectIfNeededIn(activity);
    }
}
