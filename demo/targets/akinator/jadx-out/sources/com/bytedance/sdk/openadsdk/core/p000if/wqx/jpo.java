package com.bytedance.sdk.openadsdk.core.p000if.wqx;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static final Set<String> jpo = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.if.wqx.jpo.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };

    /* renamed from: jd, reason: collision with root package name */
    public static Set<String> f20441jd = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.if.wqx.jpo.2
        {
            add("application/x-javascript");
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jd {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.if.wqx.jpo$jpo, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0118jpo {
        jpo,
        IMAGE,
        JAVASCRIPT
    }

    public static Point jpo(Context context, int i10, int i11, jd jdVar) {
        if (context == null) {
            context = sq.jpo();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iJd = va.jd(context, i10);
        int iJd2 = va.jd(context, i11);
        if (iJd > width || iJd2 > height) {
            Point point2 = new Point();
            if (jd.HTML_RESOURCE == jdVar) {
                point2.x = Math.min(width, iJd);
                point2.y = Math.min(height, iJd2);
            } else {
                float f10 = iJd;
                float f11 = f10 / width;
                float f12 = iJd2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 >= 0 && point2.y >= 0) {
                point2.x = va.wqx(context, i12);
                point2.y = va.wqx(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
