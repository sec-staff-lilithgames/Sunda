package l6;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import k6.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends WebMessagePort.WebMessageCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m.a f72464a;

    public k(m.a aVar) {
        this.f72464a = aVar;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        this.f72464a.onMessage(new n0(webMessagePort), n0.frameworkMessageToCompat(webMessage));
    }
}
