package io.odeeo.internal.d1;

import io.odeeo.sdk.OdeeoSDK;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f63660a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static String f63661b = "native";

    /* renamed from: c, reason: collision with root package name */
    public static String f63662c = "0.0.0";

    public final String getEngineName() {
        return f63661b;
    }

    public final String getEngineVersion() {
        return e0.areEqual(f63661b, "native") ? OdeeoSDK.SDK_VERSION : f63662c;
    }

    public final void setEngineInfo(String engineName, String engineVersion) {
        e0.checkNotNullParameter(engineName, "engineName");
        e0.checkNotNullParameter(engineVersion, "engineVersion");
        f63661b = engineName;
        f63662c = engineVersion;
    }
}
