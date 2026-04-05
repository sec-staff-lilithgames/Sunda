package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nzb {
    private static boolean jd(View view) {
        return view != null && view.isShown();
    }

    private static boolean jpo(View view, int i10) {
        float fJpo = jpo(view);
        return fJpo > 0.0f && fJpo >= ((float) i10) / 100.0f;
    }

    private static int wqx(View view, int i10) {
        if (i10 == 3) {
            return va.my(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int jd(View view, int i10) {
        if (i10 == 3) {
            return (int) (va.wqx(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    public static float jpo(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long jHeight = r1.height() * r1.width();
                    long height = view.getHeight() * view.getWidth();
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int jd(View view, int i10, int i11, boolean z10) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!jd(view)) {
            return 1;
        }
        if (jpo(view, i11, z10)) {
            return !jpo(view, i10) ? 3 : 0;
        }
        return 6;
    }

    private static boolean jpo(View view, int i10, boolean z10) {
        return (i10 == 1 && z10) ? view.getWidth() > 0 && view.getHeight() > 0 : view.getWidth() >= jd(view, i10) && view.getHeight() >= wqx(view, i10);
    }

    public static boolean jpo(View view, int i10, int i11, boolean z10) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.zz.nmd) || (view instanceof com.bytedance.sdk.openadsdk.core.cm.cm)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                i10 = 0;
            }
        }
        return jd(view, i10, i11, z10) == 0;
    }
}
