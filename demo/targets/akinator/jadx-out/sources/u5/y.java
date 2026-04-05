package u5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.n0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {
    public static final void appendPlaceholders(StringBuilder builder, int i10) {
        e0.checkNotNullParameter(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append("?");
            if (i11 < i10 - 1) {
                builder.append(",");
            }
        }
    }

    public static final String joinIntoString(List<Integer> list) {
        if (list != null) {
            return y0.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @tu.f
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final List<Integer> splitToIntList(String str) {
        List listSplit$default;
        Integer numValueOf;
        if (str == null || (listSplit$default = n0.split$default((CharSequence) str, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }

    @tu.f
    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }
}
