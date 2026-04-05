package z8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import j9.q;
import java.util.List;
import n8.u;
import n8.v;
import n8.x;
import p0.o2;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final u f97697b = u.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    public final Context f97698a;

    public h(Context context) {
        this.f97698a = context.getApplicationContext();
    }

    @Override // n8.x
    public v0 decode(Uri uri, int i10, int i11, v vVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f97698a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(o2.p("Failed to obtain context or unrecognized Uri format for: ", uri), e10);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(o2.p("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(o2.p("Unrecognized Uri format: ", uri));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(o2.p("Unrecognized Uri format: ", uri), e11);
            }
        }
        Resources.Theme theme = ((String) q.checkNotNull(authority)).equals(context.getPackageName()) ? (Resources.Theme) vVar.get(f97697b) : null;
        Drawable drawable = theme == null ? e.getDrawable(context, contextCreatePackageContext, identifier) : e.getDrawable(context, identifier, theme);
        if (drawable != null) {
            return new g(drawable);
        }
        return null;
    }

    @Override // n8.x
    public boolean handles(Uri uri, v vVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
