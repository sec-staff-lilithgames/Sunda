package k6;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final l6.t f70621a;

    public o(Context context) {
        this.f70621a = new l6.t(context);
    }

    @Override // k6.q
    public WebResourceResponse handle(String str) {
        try {
            return new WebResourceResponse(l6.t.guessMimeType(str), null, this.f70621a.openAsset(str));
        } catch (IOException e10) {
            Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
            return new WebResourceResponse(null, null, null);
        }
    }
}
