package x5;

import android.database.SQLException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final void execSQL(b bVar, String sql) throws Exception {
        e0.checkNotNullParameter(bVar, "<this>");
        e0.checkNotNullParameter(sql, "sql");
        d dVarPrepare = bVar.prepare(sql);
        try {
            dVarPrepare.step();
            iv.a.closeFinally(dVarPrepare, null);
        } finally {
        }
    }

    public static final Void throwSQLiteException(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }
}
