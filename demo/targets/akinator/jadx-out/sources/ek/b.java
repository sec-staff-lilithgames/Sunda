package ek;

import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f54457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54459c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54460d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f54461e;

    /* renamed from: f, reason: collision with root package name */
    public final a f54462f;

    public b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, i0 logEnvironment, a androidAppInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.e0.checkNotNullParameter(deviceModel, "deviceModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.e0.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f54457a = appId;
        this.f54458b = deviceModel;
        this.f54459c = sessionSdkVersion;
        this.f54460d = osVersion;
        this.f54461e = logEnvironment;
        this.f54462f = androidAppInfo;
    }

    public static /* synthetic */ b copy$default(b bVar, String str, String str2, String str3, String str4, i0 i0Var, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f54457a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f54458b;
        }
        if ((i10 & 4) != 0) {
            str3 = bVar.f54459c;
        }
        if ((i10 & 8) != 0) {
            str4 = bVar.f54460d;
        }
        if ((i10 & 16) != 0) {
            i0Var = bVar.f54461e;
        }
        if ((i10 & 32) != 0) {
            aVar = bVar.f54462f;
        }
        i0 i0Var2 = i0Var;
        a aVar2 = aVar;
        return bVar.copy(str, str2, str3, str4, i0Var2, aVar2);
    }

    public final String component1() {
        return this.f54457a;
    }

    public final String component2() {
        return this.f54458b;
    }

    public final String component3() {
        return this.f54459c;
    }

    public final String component4() {
        return this.f54460d;
    }

    public final i0 component5() {
        return this.f54461e;
    }

    public final a component6() {
        return this.f54462f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f54457a, bVar.f54457a) && kotlin.jvm.internal.e0.areEqual(this.f54458b, bVar.f54458b) && kotlin.jvm.internal.e0.areEqual(this.f54459c, bVar.f54459c) && kotlin.jvm.internal.e0.areEqual(this.f54460d, bVar.f54460d) && this.f54461e == bVar.f54461e && kotlin.jvm.internal.e0.areEqual(this.f54462f, bVar.f54462f);
    }

    public final a getAndroidAppInfo() {
        return this.f54462f;
    }

    public final String getAppId() {
        return this.f54457a;
    }

    public final String getDeviceModel() {
        return this.f54458b;
    }

    public final i0 getLogEnvironment() {
        return this.f54461e;
    }

    public final String getOsVersion() {
        return this.f54460d;
    }

    public final String getSessionSdkVersion() {
        return this.f54459c;
    }

    public int hashCode() {
        return this.f54462f.hashCode() + ((this.f54461e.hashCode() + o2.e(o2.e(o2.e(this.f54457a.hashCode() * 31, 31, this.f54458b), 31, this.f54459c), 31, this.f54460d)) * 31);
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f54457a + ", deviceModel=" + this.f54458b + ", sessionSdkVersion=" + this.f54459c + ", osVersion=" + this.f54460d + ", logEnvironment=" + this.f54461e + ", androidAppInfo=" + this.f54462f + ')';
    }

    public final b copy(String str, String deviceModel, String sessionSdkVersion, String osVersion, i0 logEnvironment, a androidAppInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, NyKZx.ZSxf);
        kotlin.jvm.internal.e0.checkNotNullParameter(deviceModel, "deviceModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.e0.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new b(str, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }
}
