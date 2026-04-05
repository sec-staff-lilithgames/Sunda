package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h1 extends b1 {
    @Override // oc.b1
    public ThreadGroup convert(jc.t tVar, jc.k kVar) throws IOException {
        String strAsText = tVar.path("name").asText();
        if (strAsText == null) {
            strAsText = "";
        }
        return new ThreadGroup(strAsText);
    }
}
