package l5;

import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final List f72433a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f72434b;

    public m(List<l> webTriggerParams, Uri destination) {
        e0.checkNotNullParameter(webTriggerParams, "webTriggerParams");
        e0.checkNotNullParameter(destination, "destination");
        this.f72433a = webTriggerParams;
        this.f72434b = destination;
    }

    public final WebTriggerRegistrationRequest convertToAdServices$ads_adservices_release() {
        WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = new WebTriggerRegistrationRequest.Builder(l.f72430c.convertWebTriggerParams$ads_adservices_release(this.f72433a), this.f72434b).build();
        e0.checkNotNullExpressionValue(webTriggerRegistrationRequestBuild, "Builder(\n               …   )\n            .build()");
        return webTriggerRegistrationRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return e0.areEqual(this.f72433a, mVar.f72433a) && e0.areEqual(this.f72434b, mVar.f72434b);
    }

    public final Uri getDestination() {
        return this.f72434b;
    }

    public final List<l> getWebTriggerParams() {
        return this.f72433a;
    }

    public int hashCode() {
        return this.f72434b.hashCode() + (this.f72433a.hashCode() * 31);
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f72433a + ", Destination=" + this.f72434b;
    }
}
