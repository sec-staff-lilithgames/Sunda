package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
