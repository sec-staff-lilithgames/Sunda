package sv;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c0 {
    public static final <T extends Appendable> T append(T t10, CharSequence... value) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        for (CharSequence charSequence : value) {
            t10.append(charSequence);
        }
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(Appendable appendable, T t10, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(t10.toString());
        }
    }

    public static final <T extends Appendable> T appendRange(T t10, CharSequence value, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        T t11 = (T) t10.append(value, i10, i11);
        kotlin.jvm.internal.e0.checkNotNull(t11, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t11;
    }
}
