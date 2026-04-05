package l6;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class w extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    public final k6.e f72508a;

    public w(k6.e eVar) {
        this.f72508a = eVar;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f72508a.shouldInterceptRequest(webResourceRequest);
    }
}
