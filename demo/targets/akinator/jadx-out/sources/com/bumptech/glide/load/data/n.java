package com.bumptech.glide.load.data;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n implements o {
    @Override // com.bumptech.glide.load.data.o
    public HttpURLConnection build(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }
}
