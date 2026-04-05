package u8;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88141a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f88142b;

    public y0(Context context, l0 l0Var) {
        this.f88141a = context.getApplicationContext();
        this.f88142b = l0Var;
    }

    public static m0 newAssetFileDescriptorFactory(Context context) {
        return new w0(context);
    }

    public static m0 newStreamFactory(Context context) {
        return new x0(context);
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, n8.v vVar) throws NumberFormatException {
        int i12;
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        l0 l0Var = this.f88142b;
        if (size == 1) {
            try {
                i12 = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e10) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
                }
            }
            if (i12 != 0) {
                return l0Var.buildLoadData(Integer.valueOf(i12), i10, i11, vVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                return null;
            }
            return null;
        }
        if (pathSegments.size() != 2) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
            }
            return null;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = this.f88141a;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return l0Var.buildLoadData(Integer.valueOf(identifier), i10, i11, vVar);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        }
        return null;
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f88141a.getPackageName().equals(uri.getAuthority());
    }
}
