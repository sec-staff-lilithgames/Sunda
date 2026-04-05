package i7;

import android.net.Uri;
import com.ironsource.C3191e4;
import java.io.File;
import kotlin.jvm.internal.e0;
import l7.o;
import q7.n;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements d {
    @Override // i7.d
    public File map(Uri uri, o oVar) {
        String scheme;
        if (!n.isAssetUri(uri) && ((scheme = uri.getScheme()) == null || e0.areEqual(scheme, C3191e4.h.f36473b))) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (n0.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) && n.getFirstPathSegment(uri) != null) {
                if (uri.getScheme() != null) {
                    uri = uri.buildUpon().scheme(null).build();
                }
                return new File(uri.toString());
            }
        }
        return null;
    }
}
