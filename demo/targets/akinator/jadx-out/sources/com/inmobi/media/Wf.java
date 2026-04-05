package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Wf {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to("source", source), tu.e0.to("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("WebViewRenderProcessGoneEvent", mapMutableMapOf, EnumC2993se.f33373a);
        view.destroy();
        return true;
    }
}
