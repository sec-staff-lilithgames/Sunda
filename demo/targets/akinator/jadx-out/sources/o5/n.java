package o5;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public abstract String a();

    public abstract void bind(x5.d dVar, Object obj);

    public final int handle(x5.b connection, Object obj) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (obj == null) {
            return 0;
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            bind(dVarPrepare, obj);
            dVarPrepare.step();
            iv.a.closeFinally(dVarPrepare, null);
            return u5.r.getTotalChangedRows(connection);
        } finally {
        }
    }

    public final int handleMultiple(x5.b connection, Iterable<Object> iterable) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        int totalChangedRows = 0;
        if (iterable == null) {
            return 0;
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(dVarPrepare, obj);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    totalChangedRows += u5.r.getTotalChangedRows(connection);
                }
            }
            iv.a.closeFinally(dVarPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }

    public final int handleMultiple(x5.b connection, Object[] objArr) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        int totalChangedRows = 0;
        if (objArr == null) {
            return 0;
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            Iterator it = kotlin.jvm.internal.i.iterator(objArr);
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    bind(dVarPrepare, next);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    totalChangedRows += u5.r.getTotalChangedRows(connection);
                }
            }
            iv.a.closeFinally(dVarPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }
}
