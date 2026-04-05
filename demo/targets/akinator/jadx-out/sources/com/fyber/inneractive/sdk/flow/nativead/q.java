package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23742a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f23743b;

    static {
        String strB = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        f23742a = a.b.l("<html><head>", strB, "<script src='%s'></script></head><body></body></html>");
        f23743b = a.b.l("<html><head>", strB, "%s</head><body></body></html>");
    }

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (str.startsWith(iAConfigManager.f23222q ? HttpRequest.DEFAULT_SCHEME : "http")) {
            return String.format(f23742a, str);
        }
        if (iAConfigManager.f23222q && !str.startsWith(HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(f23743b, str);
    }
}
