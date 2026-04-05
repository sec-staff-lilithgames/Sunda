package com.fyber.inneractive.sdk.click;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ActivityInfo activityInfo;
        String str;
        ResolveInfo resolveInfo = (ResolveInfo) obj2;
        ActivityInfo activityInfo2 = ((ResolveInfo) obj).activityInfo;
        if (activityInfo2 == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo2.packageName) == null) {
            return 1;
        }
        return str.compareTo(activityInfo.packageName);
    }
}
