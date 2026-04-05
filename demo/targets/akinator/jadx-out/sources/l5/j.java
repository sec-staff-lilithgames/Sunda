package l5;

import android.adservices.measurement.WebSourceParams;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final a f72421c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f72422a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72423b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final List<WebSourceParams> convertWebSourceParams$ads_adservices_release(List<j> request) {
            e0.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            for (j jVar : request) {
                WebSourceParams webSourceParamsBuild = new WebSourceParams.Builder(jVar.getRegistrationUri()).setDebugKeyAllowed(jVar.getDebugKeyAllowed()).build();
                e0.checkNotNullExpressionValue(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }
    }

    public j(Uri registrationUri, boolean z10) {
        e0.checkNotNullParameter(registrationUri, "registrationUri");
        this.f72422a = registrationUri;
        this.f72423b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return e0.areEqual(this.f72422a, jVar.f72422a) && this.f72423b == jVar.f72423b;
    }

    public final boolean getDebugKeyAllowed() {
        return this.f72423b;
    }

    public final Uri getRegistrationUri() {
        return this.f72422a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f72423b) + (this.f72422a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebSourceParams { RegistrationUri=");
        sb2.append(this.f72422a);
        sb2.append(", DebugKeyAllowed=");
        return a.b.q(sb2, this.f72423b, " }");
    }
}
