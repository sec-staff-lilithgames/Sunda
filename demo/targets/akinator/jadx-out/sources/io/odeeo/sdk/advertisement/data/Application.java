package io.odeeo.sdk.advertisement.data;

import kotlin.jvm.internal.e0;
import lk.c;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Application {

    @c("app_version")
    private final String appVersion;

    @c("engine_name")
    private final String engineName;

    @c("sdk_version")
    private final String sdkVersion;

    public Application(String sdkVersion, String engineName, String appVersion) {
        e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        e0.checkNotNullParameter(engineName, "engineName");
        e0.checkNotNullParameter(appVersion, "appVersion");
        this.sdkVersion = sdkVersion;
        this.engineName = engineName;
        this.appVersion = appVersion;
    }

    public static /* synthetic */ Application copy$default(Application application, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = application.sdkVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = application.engineName;
        }
        if ((i10 & 4) != 0) {
            str3 = application.appVersion;
        }
        return application.copy(str, str2, str3);
    }

    public final String component1() {
        return this.sdkVersion;
    }

    public final String component2() {
        return this.engineName;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final Application copy(String sdkVersion, String engineName, String appVersion) {
        e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        e0.checkNotNullParameter(engineName, "engineName");
        e0.checkNotNullParameter(appVersion, "appVersion");
        return new Application(sdkVersion, engineName, appVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Application)) {
            return false;
        }
        Application application = (Application) obj;
        return e0.areEqual(this.sdkVersion, application.sdkVersion) && e0.areEqual(this.engineName, application.engineName) && e0.areEqual(this.appVersion, application.appVersion);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getEngineName() {
        return this.engineName;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        return this.appVersion.hashCode() + o2.e(this.sdkVersion.hashCode() * 31, 31, this.engineName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Application(sdkVersion=");
        sb2.append(this.sdkVersion);
        sb2.append(", engineName=");
        sb2.append(this.engineName);
        sb2.append(", appVersion=");
        return o2.q(sb2, this.appVersion, ')');
    }
}
