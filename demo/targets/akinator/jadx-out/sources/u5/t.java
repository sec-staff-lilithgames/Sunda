package u5;

import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static final int columnIndexOfCommon(x5.d dVar, String name) {
        e0.checkNotNullParameter(dVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        if (dVar instanceof m) {
            return ((m) dVar).getColumnIndex(name);
        }
        int columnCount = dVar.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (e0.areEqual(name, dVar.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static final int getColumnIndex(x5.d stmt, String name) {
        e0.checkNotNullParameter(stmt, "stmt");
        e0.checkNotNullParameter(name, "name");
        return s.columnIndexOf(stmt, name);
    }

    public static final int getColumnIndexOrThrow(x5.d stmt, String name) {
        e0.checkNotNullParameter(stmt, "stmt");
        e0.checkNotNullParameter(name, "name");
        int iColumnIndexOf = s.columnIndexOf(stmt, name);
        if (iColumnIndexOf >= 0) {
            return iColumnIndexOf;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + y0.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST);
    }

    public static final x5.d wrapMappedColumns(x5.d statement, String[] columnNames, int[] mapping) {
        e0.checkNotNullParameter(statement, "statement");
        e0.checkNotNullParameter(columnNames, "columnNames");
        e0.checkNotNullParameter(mapping, "mapping");
        return new m(statement, columnNames, mapping);
    }
}
