package io.ktor.http;

import com.ironsource.G5;
import io.ktor.util.StringValuesBuilder;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.n0;
import sv.p0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HeaderValueWithParametersKt {
    private static final Set<Character> HeaderFieldValueSeparators = c2.setOf((Object[]) new Character[]{'(', ')', '<', '>', '@', Character.valueOf(AbstractJsonLexerKt.COMMA), ';', Character.valueOf(AbstractJsonLexerKt.COLON), Character.valueOf(AbstractJsonLexerKt.STRING_ESC), Character.valueOf(AbstractJsonLexerKt.STRING), '/', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '?', Character.valueOf(G5.T), Character.valueOf(AbstractJsonLexerKt.BEGIN_OBJ), Character.valueOf(AbstractJsonLexerKt.END_OBJ), ' ', '\t', '\n', '\r'});

    public static final void append(StringValuesBuilder stringValuesBuilder, String name, HeaderValueWithParameters value) {
        e0.checkNotNullParameter(stringValuesBuilder, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        stringValuesBuilder.append(name, value.toString());
    }

    public static final String escapeIfNeeded(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return needQuotes(str) ? quote(str) : str;
    }

    private static final void escapeIfNeededTo(String str, StringBuilder sb2) {
        if (needQuotes(str)) {
            sb2.append(quote(str));
        } else {
            sb2.append(str);
        }
    }

    private static final boolean isQuoted(String str) {
        if (str.length() < 2 || p0.first(str) != '\"' || p0.last(str) != '\"') {
            return false;
        }
        int i10 = 1;
        while (true) {
            String str2 = str;
            int iIndexOf$default = n0.indexOf$default((CharSequence) str2, AbstractJsonLexerKt.STRING, i10, false, 4, (Object) null);
            if (iIndexOf$default == n0.getLastIndex(str2)) {
                break;
            }
            int i11 = 0;
            for (int i12 = iIndexOf$default - 1; str2.charAt(i12) == '\\'; i12--) {
                i11++;
            }
            if (i11 % 2 == 0) {
                return false;
            }
            i10 = iIndexOf$default + 1;
            if (i10 >= str2.length()) {
                break;
            }
            str = str2;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean needQuotes(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (isQuoted(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (HeaderFieldValueSeparators.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
        }
        return false;
    }

    public static final String quote(String str) {
        e0.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        quoteTo(str, sb2);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void quoteTo(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\') {
                sb2.append("\\\\");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append("\"");
    }
}
