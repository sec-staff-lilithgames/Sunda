package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48361a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48362b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public c(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        this.f48361a = context;
        this.f48362b = mraidCommunicationHub;
    }

    @JavascriptInterface
    public final void close() {
        this.f48362b.a();
    }

    @JavascriptInterface
    public final void expand(String url) {
        e0.checkNotNullParameter(url, "url");
    }

    @JavascriptInterface
    public final void open(String jsonParams) throws JSONException {
        e0.checkNotNullParameter(jsonParams, "jsonParams");
        String string = new JSONObject(jsonParams).getString("url");
        e0.checkNotNull(string);
        this.f48362b.a(string);
    }

    @JavascriptInterface
    public final void setOrientationProperties(String jsonParams) {
        e0.checkNotNullParameter(jsonParams, "jsonParams");
        try {
            JSONObject jSONObject = new JSONObject(jsonParams);
            boolean zOptBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            String strOptString = jSONObject.optString("forceOrientation", "none");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Orientation Set from JSON: " + zOptBoolean + ", " + strOptString, false, 4, null);
            r rVarA = r.f48111b.a(strOptString);
            if (rVarA != null) {
                this.f48362b.a(zOptBoolean, rVarA);
            }
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Error parsing orientation properties JSON", e10, false, 8, null);
        }
    }

    @JavascriptInterface
    public final void resize(String str) {
        e0.checkNotNullParameter(str, NyKZx.EMpdsuUoVKuz);
    }
}
