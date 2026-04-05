package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {
    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0;
        } catch (Throwable th2) {
            p0.b("DomainSameTool", th2.getMessage(), th2);
            return false;
        }
    }
}
