package u5;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import j1.o2;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final Cursor copyAndClose(Cursor c10) {
        e0.checkNotNullParameter(c10, "c");
        Cursor cursor = c10;
        try {
            Cursor cursor2 = cursor;
            MatrixCursor matrixCursor = new MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                Object[] objArr = new Object[cursor2.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = cursor2.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(cursor2.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(cursor2.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = cursor2.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = cursor2.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            gv.d.closeFinally(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    public static final int findColumnIndexBySuffix(String[] columnNames, String name) {
        e0.checkNotNullParameter(columnNames, "columnNames");
        e0.checkNotNullParameter(name, "name");
        String str = "." + name;
        String strF = o2.f('`', ".", name);
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str2 = columnNames[i10];
            int i12 = i11 + 1;
            if (str2.length() >= name.length() + 2 && (k0.endsWith$default(str2, str, false, 2, null) || (str2.charAt(0) == '`' && k0.endsWith$default(str2, strF, false, 2, null)))) {
                return i11;
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }

    public static final int getColumnIndex(Cursor c10, String name) {
        e0.checkNotNullParameter(c10, "c");
        e0.checkNotNullParameter(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex("`" + name + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || name.length() == 0) {
            return -1;
        }
        String[] columnNames = c10.getColumnNames();
        e0.checkNotNull(columnNames);
        return findColumnIndexBySuffix(columnNames, name);
    }

    public static final int getColumnIndexOrThrow(Cursor c10, String name) {
        String strJoinToString$default;
        e0.checkNotNullParameter(c10, "c");
        e0.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c10, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            e0.checkNotNullExpressionValue(columnNames, "getColumnNames(...)");
            strJoinToString$default = uu.k0.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (kv.l) null, 63, (Object) null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strJoinToString$default = "unknown";
        }
        throw new IllegalArgumentException(a.b.m("column '", name, "' does not exist. Available columns: ", strJoinToString$default));
    }

    public static final <R> R useCursor(Cursor cursor, kv.l block) {
        e0.checkNotNullParameter(cursor, "<this>");
        e0.checkNotNullParameter(block, "block");
        Cursor cursor2 = cursor;
        try {
            R r10 = (R) block.invoke(cursor2);
            kotlin.jvm.internal.b0.finallyStart(1);
            gv.d.closeFinally(cursor2, null);
            kotlin.jvm.internal.b0.finallyEnd(1);
            return r10;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, String[] columnNames, int[] mapping) {
        e0.checkNotNullParameter(cursor, "cursor");
        e0.checkNotNullParameter(columnNames, "columnNames");
        e0.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new a(cursor, columnNames, mapping);
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }
}
