package zw;

import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements h0 {
    @Override // zw.h0
    public URL read(String str) throws Exception {
        return new URL(str);
    }

    @Override // zw.h0
    public String write(URL url) throws Exception {
        return url.toString();
    }
}
