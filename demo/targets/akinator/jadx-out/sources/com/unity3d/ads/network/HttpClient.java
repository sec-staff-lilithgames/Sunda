package com.unity3d.ads.network;

import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar);
}
