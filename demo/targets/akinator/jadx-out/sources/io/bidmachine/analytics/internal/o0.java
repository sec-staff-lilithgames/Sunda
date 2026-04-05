package io.bidmachine.analytics.internal;

import com.ironsource.C3271ic;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum o0 {
    Get(C3271ic.f36943a),
    Post(C3271ic.f36944b);


    /* renamed from: a, reason: collision with root package name */
    private final String f60192a;

    o0(String str) {
        this.f60192a = str;
    }

    public final void a(URLConnection uRLConnection) throws ProtocolException {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.f60192a);
        }
    }
}
