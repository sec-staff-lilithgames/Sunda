package gv;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.n0;
import uu.p0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m {
    public static final int a(String str) {
        int iIndexOf$default;
        char c10 = File.separatorChar;
        int iIndexOf$default2 = n0.indexOf$default((CharSequence) str, c10, 0, false, 4, (Object) null);
        if (iIndexOf$default2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iIndexOf$default = n0.indexOf$default((CharSequence) str, c10, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int iIndexOf$default3 = n0.indexOf$default((CharSequence) str, c10, iIndexOf$default + 1, false, 4, (Object) null);
            return iIndexOf$default3 >= 0 ? iIndexOf$default3 + 1 : str.length();
        }
        if (iIndexOf$default2 > 0 && str.charAt(iIndexOf$default2 - 1) == ':') {
            return iIndexOf$default2 + 1;
        }
        if (iIndexOf$default2 == -1 && n0.endsWith$default((CharSequence) str, AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
            return str.length();
        }
        return 0;
    }

    public static final File getRoot(File file) {
        e0.checkNotNullParameter(file, "<this>");
        return new File(getRootName(file));
    }

    public static final String getRootName(File file) {
        e0.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        e0.checkNotNullExpressionValue(path, "getPath(...)");
        String path2 = file.getPath();
        e0.checkNotNullExpressionValue(path2, "getPath(...)");
        String strSubstring = path.substring(0, a(path2));
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean isRooted(File file) {
        e0.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        e0.checkNotNullExpressionValue(path, "getPath(...)");
        return a(path) > 0;
    }

    public static final File subPath(File file, int i10, int i11) {
        e0.checkNotNullParameter(file, "<this>");
        return toComponents(file).subPath(i10, i11);
    }

    public static final h toComponents(File file) {
        List listEmptyList;
        e0.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        e0.checkNotNull(path);
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(iA);
        e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            listEmptyList = p0.emptyList();
        } else {
            List listSplit$default = n0.split$default((CharSequence) strSubstring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listEmptyList = arrayList;
        }
        return new h(new File(strSubstring), listEmptyList);
    }
}
