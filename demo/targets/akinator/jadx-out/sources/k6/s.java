package k6;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f70629a;

    public s(ArrayList arrayList) {
        this.f70629a = arrayList;
    }

    public WebResourceResponse shouldInterceptRequest(Uri uri) {
        WebResourceResponse webResourceResponseHandle;
        Iterator it = this.f70629a.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            q qVarMatch = rVar.match(uri);
            if (qVarMatch != null && (webResourceResponseHandle = qVarMatch.handle(rVar.getSuffixPath(uri.getPath()))) != null) {
                return webResourceResponseHandle;
            }
        }
        return null;
    }
}
