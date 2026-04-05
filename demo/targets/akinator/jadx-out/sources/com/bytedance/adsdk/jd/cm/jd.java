package com.bytedance.adsdk.jd.cm;

import com.ironsource.C3271ic;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements jj {
    @Override // com.bytedance.adsdk.jd.cm.jj
    public cm jpo(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(C3271ic.f36943a);
        httpURLConnection.connect();
        return new jpo(httpURLConnection);
    }
}
