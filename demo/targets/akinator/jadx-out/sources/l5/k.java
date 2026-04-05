package l5;

import android.adservices.measurement.WebSourceRegistrationRequest;
import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List f72424a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f72425b;

    /* renamed from: c, reason: collision with root package name */
    public final InputEvent f72426c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f72427d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f72428e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f72429f;

    public k(List<j> webSourceParams, Uri topOriginUri, InputEvent inputEvent, Uri uri, Uri uri2, Uri uri3) {
        e0.checkNotNullParameter(webSourceParams, "webSourceParams");
        e0.checkNotNullParameter(topOriginUri, "topOriginUri");
        this.f72424a = webSourceParams;
        this.f72425b = topOriginUri;
        this.f72426c = inputEvent;
        this.f72427d = uri;
        this.f72428e = uri2;
        this.f72429f = uri3;
    }

    public final WebSourceRegistrationRequest convertToAdServices$ads_adservices_release() {
        WebSourceRegistrationRequest webSourceRegistrationRequestBuild = new WebSourceRegistrationRequest.Builder(j.f72421c.convertWebSourceParams$ads_adservices_release(this.f72424a), this.f72425b).setWebDestination(this.f72428e).setAppDestination(this.f72427d).setInputEvent(this.f72426c).setVerifiedDestination(this.f72429f).build();
        e0.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "Builder(\n               …ion)\n            .build()");
        return webSourceRegistrationRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return e0.areEqual(this.f72424a, kVar.f72424a) && e0.areEqual(this.f72428e, kVar.f72428e) && e0.areEqual(this.f72427d, kVar.f72427d) && e0.areEqual(this.f72425b, kVar.f72425b) && e0.areEqual(this.f72426c, kVar.f72426c) && e0.areEqual(this.f72429f, kVar.f72429f);
    }

    public final Uri getAppDestination() {
        return this.f72427d;
    }

    public final InputEvent getInputEvent() {
        return this.f72426c;
    }

    public final Uri getTopOriginUri() {
        return this.f72425b;
    }

    public final Uri getVerifiedDestination() {
        return this.f72429f;
    }

    public final Uri getWebDestination() {
        return this.f72428e;
    }

    public final List<j> getWebSourceParams() {
        return this.f72424a;
    }

    public int hashCode() {
        int iHashCode = this.f72424a.hashCode() * 31;
        Uri uri = this.f72425b;
        int iHashCode2 = uri.hashCode() + iHashCode;
        InputEvent inputEvent = this.f72426c;
        if (inputEvent != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent.hashCode();
        }
        Uri uri2 = this.f72427d;
        if (uri2 != null) {
            iHashCode2 = (iHashCode2 * 31) + uri2.hashCode();
        }
        Uri uri3 = this.f72428e;
        if (uri3 != null) {
            iHashCode2 = (iHashCode2 * 31) + uri3.hashCode();
        }
        int iHashCode3 = uri.hashCode() + (iHashCode2 * 31);
        if (inputEvent != null) {
            iHashCode3 = (iHashCode3 * 31) + inputEvent.hashCode();
        }
        Uri uri4 = this.f72429f;
        if (uri4 == null) {
            return iHashCode3;
        }
        return uri4.hashCode() + (iHashCode3 * 31);
    }

    public String toString() {
        return a.b.l("WebSourceRegistrationRequest { ", "WebSourceParams=[" + this.f72424a + "], TopOriginUri=" + this.f72425b + ", InputEvent=" + this.f72426c + ", AppDestination=" + this.f72427d + ", WebDestination=" + this.f72428e + ", VerifiedDestination=" + this.f72429f, " }");
    }

    public /* synthetic */ k(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i10, u uVar) {
        this(list, uri, (i10 & 4) != 0 ? null : inputEvent, (i10 & 8) != 0 ? null : uri2, (i10 & 16) != 0 ? null : uri3, (i10 & 32) != 0 ? null : uri4);
    }
}
