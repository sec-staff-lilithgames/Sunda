package nm;

import com.ironsource.C3271ic;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum e {
    Get(C3271ic.f36943a),
    Post(C3271ic.f36944b);


    /* renamed from: b, reason: collision with root package name */
    public final String f77039b;

    e(String str) {
        this.f77039b = str;
    }

    public void apply(URLConnection uRLConnection) throws ProtocolException {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.f77039b);
        }
    }
}
