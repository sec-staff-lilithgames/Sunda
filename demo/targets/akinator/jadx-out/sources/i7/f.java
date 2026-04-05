package i7;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.e0;
import l7.o;
import p0.o2;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements d {
    @Override // i7.d
    public Uri map(Uri uri, o oVar) throws PackageManager.NameNotFoundException {
        String authority;
        if (!e0.areEqual(uri.getScheme(), "android.resource") || (authority = uri.getAuthority()) == null || n0.isBlank(authority) || uri.getPathSegments().size() != 2) {
            return null;
        }
        String authority2 = uri.getAuthority();
        if (authority2 == null) {
            authority2 = "";
        }
        Resources resourcesForApplication = oVar.getContext().getPackageManager().getResourcesForApplication(authority2);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
        if (identifier == 0) {
            throw new IllegalStateException(o2.p("Invalid android.resource URI: ", uri).toString());
        }
        Uri uri2 = Uri.parse("android.resource://" + authority2 + '/' + identifier);
        e0.checkNotNullExpressionValue(uri2, "parse(this)");
        return uri2;
    }
}
