package w3;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static void buildShortClassTag(Object obj, StringBuilder sb2) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
