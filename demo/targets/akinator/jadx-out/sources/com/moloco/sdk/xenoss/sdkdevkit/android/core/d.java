package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import a1.e;
import com.moloco.sdk.internal.MolocoLogger;
import sv.n0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final o f50240a = q.lazy(new e(this, 20));

    public final String a() {
        return (String) this.f50240a.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.a
    public String invoke() {
        return a();
    }

    public static final String a(d dVar) {
        try {
            String property = System.getProperty("http.agent");
            if (property != null) {
                if (!n0.isBlank(property)) {
                    return property;
                }
            }
            return "";
        } catch (Exception e10) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            dVar.getClass();
            MolocoLogger.error$default(molocoLogger, "WebBrowserUserAgentService", e10.toString(), null, false, 12, null);
            return "";
        }
    }
}
