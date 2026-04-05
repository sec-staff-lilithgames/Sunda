package xv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f1 {
    public void onClosed(e1 webSocket, int i10, String reason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
    }

    public void onClosing(e1 webSocket, int i10, String reason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
    }

    public void onFailure(e1 webSocket, Throwable t10, v0 v0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "t");
    }

    public void onMessage(e1 webSocket, String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
    }

    public void onOpen(e1 webSocket, v0 response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
    }

    public void onMessage(e1 webSocket, pw.l bytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
    }
}
