package fw;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final c f56136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c errorCode) {
        super("stream was reset: " + errorCode);
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        this.f56136b = errorCode;
    }
}
