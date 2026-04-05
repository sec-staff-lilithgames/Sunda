package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import android.webkit.WebSettings;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class s {
    public static final v a(Context context) {
        e0.checkNotNullParameter(context, "context");
        v vVar = new v(context);
        vVar.setScrollBarStyle(0);
        vVar.setHorizontalScrollBarEnabled(false);
        vVar.setVerticalScrollBarEnabled(false);
        WebSettings settings = vVar.getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        vVar.setBackgroundColor(0);
        return vVar;
    }

    public static final void a(v vVar, a0 vastResource) {
        String strA;
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(vastResource, "vastResource");
        if (vastResource instanceof a0.c) {
            a0.c cVar = (a0.c) vastResource;
            int i10 = r.f50081a[cVar.a().a().ordinal()];
            if (i10 == 1) {
                strA = "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + cVar.a().b() + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            } else if (i10 == 2) {
                strA = "<script src=\"" + cVar.a().b() + "\"></script>";
            } else {
                throw new t();
            }
        } else if (vastResource instanceof a0.a) {
            strA = ((a0.a) vastResource).a().a();
        } else if (vastResource instanceof a0.b) {
            strA = "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\"" + ((a0.b) vastResource).a().a() + "\"></iframe>";
        } else {
            throw new t();
        }
        try {
            w.a(vVar, vVar.getHtmlCssFixer().a(strA));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BaseWebView", e10.toString(), e10, false, 8, null);
        }
    }
}
