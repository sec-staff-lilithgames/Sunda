package l5;

import android.adservices.measurement.WebTriggerParams;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final a f72430c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f72431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72432b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final List<WebTriggerParams> convertWebTriggerParams$ads_adservices_release(List<l> request) {
            e0.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            for (l lVar : request) {
                WebTriggerParams webTriggerParamsBuild = new WebTriggerParams.Builder(lVar.getRegistrationUri()).setDebugKeyAllowed(lVar.getDebugKeyAllowed()).build();
                e0.checkNotNullExpressionValue(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }
    }

    public l(Uri registrationUri, boolean z10) {
        e0.checkNotNullParameter(registrationUri, "registrationUri");
        this.f72431a = registrationUri;
        this.f72432b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return e0.areEqual(this.f72431a, lVar.f72431a) && this.f72432b == lVar.f72432b;
    }

    public final boolean getDebugKeyAllowed() {
        return this.f72432b;
    }

    public final Uri getRegistrationUri() {
        return this.f72431a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f72432b) + (this.f72431a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebTriggerParams { RegistrationUri=");
        sb2.append(this.f72431a);
        sb2.append(", DebugKeyAllowed=");
        return a.b.q(sb2, this.f72432b, " }");
    }
}
