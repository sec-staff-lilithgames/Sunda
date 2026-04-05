package k4;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends IOException {
    public /* synthetic */ e(String str, Throwable th2, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String message, Throwable th2) {
        super(message, th2);
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
    }
}
