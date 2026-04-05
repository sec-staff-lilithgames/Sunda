package u5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {
    public static final long getLastInsertedRowId(x5.b connection) throws Exception {
        e0.checkNotNullParameter(connection, "connection");
        if (getTotalChangedRows(connection) == 0) {
            return -1L;
        }
        x5.d dVarPrepare = connection.prepare("SELECT last_insert_rowid()");
        try {
            dVarPrepare.step();
            long j10 = dVarPrepare.getLong(0);
            iv.a.closeFinally(dVarPrepare, null);
            return j10;
        } finally {
        }
    }

    public static final int getTotalChangedRows(x5.b connection) throws Exception {
        e0.checkNotNullParameter(connection, "connection");
        x5.d dVarPrepare = connection.prepare("SELECT changes()");
        try {
            dVarPrepare.step();
            int i10 = (int) dVarPrepare.getLong(0);
            iv.a.closeFinally(dVarPrepare, null);
            return i10;
        } finally {
        }
    }
}
