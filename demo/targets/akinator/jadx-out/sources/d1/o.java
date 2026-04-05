package d1;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final List f51702b;

    public o(List<c> list) {
        this.f51702b = list;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Composition stack when thrown:");
        e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        e0.checkNotNullExpressionValue(sb2, "append(...)");
        d.appendStackTrace(sb2, this.f51702b);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
