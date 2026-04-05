package ek;

import hr.kNq.ikJMrW;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f54447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54449c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54450d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f54451e;

    /* renamed from: f, reason: collision with root package name */
    public final List f54452f;

    public a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, q0 currentProcessDetails, List<q0> appProcessDetails) {
        kotlin.jvm.internal.e0.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.e0.checkNotNullParameter(versionName, "versionName");
        kotlin.jvm.internal.e0.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.e0.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f54447a = packageName;
        this.f54448b = versionName;
        this.f54449c = appBuildVersion;
        this.f54450d = deviceManufacturer;
        this.f54451e = currentProcessDetails;
        this.f54452f = appProcessDetails;
    }

    public static /* synthetic */ a copy$default(a aVar, String str, String str2, String str3, String str4, q0 q0Var, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f54447a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f54448b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f54449c;
        }
        if ((i10 & 8) != 0) {
            str4 = aVar.f54450d;
        }
        if ((i10 & 16) != 0) {
            q0Var = aVar.f54451e;
        }
        if ((i10 & 32) != 0) {
            list = aVar.f54452f;
        }
        q0 q0Var2 = q0Var;
        List list2 = list;
        return aVar.copy(str, str2, str3, str4, q0Var2, list2);
    }

    public final String component1() {
        return this.f54447a;
    }

    public final String component2() {
        return this.f54448b;
    }

    public final String component3() {
        return this.f54449c;
    }

    public final String component4() {
        return this.f54450d;
    }

    public final q0 component5() {
        return this.f54451e;
    }

    public final List<q0> component6() {
        return this.f54452f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f54447a, aVar.f54447a) && kotlin.jvm.internal.e0.areEqual(this.f54448b, aVar.f54448b) && kotlin.jvm.internal.e0.areEqual(this.f54449c, aVar.f54449c) && kotlin.jvm.internal.e0.areEqual(this.f54450d, aVar.f54450d) && kotlin.jvm.internal.e0.areEqual(this.f54451e, aVar.f54451e) && kotlin.jvm.internal.e0.areEqual(this.f54452f, aVar.f54452f);
    }

    public final String getAppBuildVersion() {
        return this.f54449c;
    }

    public final List<q0> getAppProcessDetails() {
        return this.f54452f;
    }

    public final q0 getCurrentProcessDetails() {
        return this.f54451e;
    }

    public final String getDeviceManufacturer() {
        return this.f54450d;
    }

    public final String getPackageName() {
        return this.f54447a;
    }

    public final String getVersionName() {
        return this.f54448b;
    }

    public int hashCode() {
        return this.f54452f.hashCode() + ((this.f54451e.hashCode() + o2.e(o2.e(o2.e(this.f54447a.hashCode() * 31, 31, this.f54448b), 31, this.f54449c), 31, this.f54450d)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb2.append(this.f54447a);
        sb2.append(", versionName=");
        sb2.append(this.f54448b);
        sb2.append(", appBuildVersion=");
        sb2.append(this.f54449c);
        sb2.append(", deviceManufacturer=");
        sb2.append(this.f54450d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f54451e);
        sb2.append(", appProcessDetails=");
        return j1.o2.p(sb2, this.f54452f, ')');
    }

    public final a copy(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, q0 q0Var, List<q0> appProcessDetails) {
        kotlin.jvm.internal.e0.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.e0.checkNotNullParameter(versionName, "versionName");
        kotlin.jvm.internal.e0.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.e0.checkNotNullParameter(q0Var, ikJMrW.AUzfUYMcSF);
        kotlin.jvm.internal.e0.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new a(packageName, versionName, appBuildVersion, deviceManufacturer, q0Var, appProcessDetails);
    }
}
