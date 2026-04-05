package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.JavascriptInterface;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d f48366a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a$a, reason: collision with other inner class name */
    public static final class C0433a {
        public /* synthetic */ C0433a(u uVar) {
            this();
        }

        public C0433a() {
        }
    }

    static {
        new C0433a(null);
    }

    public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d eventHandler) {
        e0.checkNotNullParameter(eventHandler, "eventHandler");
        this.f48366a = eventHandler;
    }

    @JavascriptInterface
    public final void log(String message) {
        e0.checkNotNullParameter(message, "message");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateJavascript", message, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(String event) throws JSONException {
        e0.checkNotNullParameter(event, "event");
        this.f48366a.a(event);
    }

    @JavascriptInterface
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
