package oa;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.e0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class p {
    public static final boolean isDeviceLegacy(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 29 || !ValueAnimator.areAnimatorsEnabled()) {
            return true;
        }
        Object systemService = context.getSystemService("activity");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        if (activityManager.isLowRamDevice()) {
            return true;
        }
        activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
        double d10 = r0.totalMem / 1.073741824E9d;
        Timber.Forest.tag("QuestionActivity").d("totalRamGb: " + d10, new Object[0]);
        return d10 <= 3.0d;
    }
}
