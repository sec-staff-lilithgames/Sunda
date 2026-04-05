package u5;

import android.os.Build;
import j1.o2;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static final int columnIndexOf(x5.d dVar, String name) {
        e0.checkNotNullParameter(dVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        int iColumnIndexOfCommon = s.columnIndexOfCommon(dVar, name);
        if (iColumnIndexOfCommon >= 0) {
            return iColumnIndexOfCommon;
        }
        int iColumnIndexOfCommon2 = s.columnIndexOfCommon(dVar, "`" + name + '`');
        if (iColumnIndexOfCommon2 >= 0) {
            return iColumnIndexOfCommon2;
        }
        if (Build.VERSION.SDK_INT > 25 || name.length() == 0) {
            return -1;
        }
        int columnCount = dVar.getColumnCount();
        String strConcat = ".".concat(name);
        String strF = o2.f('`', ".", name);
        for (int i10 = 0; i10 < columnCount; i10++) {
            String columnName = dVar.getColumnName(i10);
            if (columnName.length() >= name.length() + 2 && (k0.endsWith$default(columnName, strConcat, false, 2, null) || (columnName.charAt(0) == '`' && k0.endsWith$default(columnName, strF, false, 2, null)))) {
                return i10;
            }
        }
        return -1;
    }
}
