package sv;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g0 extends f0 {
    @tu.f
    public static final Appendable appendln(Appendable appendable) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(q0.f86197a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    public static StringBuilder clear(StringBuilder sb2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @tu.f
    public static final StringBuilder appendln(StringBuilder sb2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sb2, "<this>");
        sb2.append(q0.f86197a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }
}
