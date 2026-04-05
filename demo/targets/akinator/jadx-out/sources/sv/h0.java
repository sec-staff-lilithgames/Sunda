package sv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h0 extends g0 {
    public static final StringBuilder append(StringBuilder sb2, String... value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sb2, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }

    public static final StringBuilder append(StringBuilder sb2, Object... value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sb2, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        for (Object obj : value) {
            sb2.append(obj);
        }
        return sb2;
    }
}
