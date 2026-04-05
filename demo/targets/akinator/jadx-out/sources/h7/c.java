package h7;

import android.net.Uri;
import kotlin.jvm.internal.e0;
import l7.o;
import q7.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements b {
    @Override // h7.b
    public String key(Uri uri, o oVar) {
        if (!e0.areEqual(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(n.getNightMode(oVar.getContext().getResources().getConfiguration()));
        return sb2.toString();
    }
}
