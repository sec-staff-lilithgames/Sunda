package o5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {
    public abstract String a();

    public abstract void bind(x5.d dVar, Object obj);

    public final void insert(x5.b connection, Object obj) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (obj == null) {
            return;
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            bind(dVarPrepare, obj);
            dVarPrepare.step();
            iv.a.closeFinally(dVarPrepare, null);
        } finally {
        }
    }

    public final long insertAndReturnId(x5.b connection, Object obj) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (obj == null) {
            return -1L;
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            bind(dVarPrepare, obj);
            dVarPrepare.step();
            iv.a.closeFinally(dVarPrepare, null);
            return u5.r.getLastInsertedRowId(connection);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(x5.b connection, Collection<Object> collection) throws Exception {
        long lastInsertedRowId;
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objElementAt = uu.y0.elementAt(collection, i10);
                if (objElementAt != null) {
                    bind(dVarPrepare, objElementAt);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    lastInsertedRowId = u5.r.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i10] = lastInsertedRowId;
            }
            iv.a.closeFinally(dVarPrepare, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(x5.b connection, Collection<Object> collection) throws Exception {
        long lastInsertedRowId;
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objElementAt = uu.y0.elementAt(collection, i10);
                if (objElementAt != null) {
                    bind(dVarPrepare, objElementAt);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    lastInsertedRowId = u5.r.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i10] = Long.valueOf(lastInsertedRowId);
            }
            iv.a.closeFinally(dVarPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(x5.b connection, Object[] objArr) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (objArr == null) {
            return uu.p0.emptyList();
        }
        List listCreateListBuilder = uu.o0.createListBuilder();
        x5.d dVarPrepare = connection.prepare(a());
        try {
            for (Object obj : objArr) {
                if (obj != null) {
                    bind(dVarPrepare, obj);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    listCreateListBuilder.add(Long.valueOf(u5.r.getLastInsertedRowId(connection)));
                } else {
                    listCreateListBuilder.add(-1L);
                }
            }
            iv.a.closeFinally(dVarPrepare, null);
            return uu.o0.build(listCreateListBuilder);
        } finally {
        }
    }

    public final void insert(x5.b connection, Object[] objArr) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (objArr == null) {
            return;
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
                }
            }
            iv.a.closeFinally(dVarPrepare, null);
        } finally {
        }
    }

    public final void insert(x5.b connection, Iterable<Object> iterable) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (iterable == null) {
            return;
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(dVarPrepare, obj);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                }
            }
            iv.a.closeFinally(dVarPrepare, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(x5.b connection, Object[] objArr) throws Exception {
        long lastInsertedRowId;
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (objArr == null) {
            return new long[0];
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            int length = objArr.length;
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = objArr[i10];
                if (obj != null) {
                    bind(dVarPrepare, obj);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    lastInsertedRowId = u5.r.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i10] = lastInsertedRowId;
            }
            iv.a.closeFinally(dVarPrepare, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(x5.b connection, Object[] objArr) throws Exception {
        long lastInsertedRowId;
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (objArr == null) {
            return new Long[0];
        }
        x5.d dVarPrepare = connection.prepare(a());
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = objArr[i10];
                if (obj != null) {
                    bind(dVarPrepare, obj);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    lastInsertedRowId = u5.r.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i10] = Long.valueOf(lastInsertedRowId);
            }
            iv.a.closeFinally(dVarPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(x5.b connection, Collection<Object> collection) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        if (collection == null) {
            return uu.p0.emptyList();
        }
        List listCreateListBuilder = uu.o0.createListBuilder();
        x5.d dVarPrepare = connection.prepare(a());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    bind(dVarPrepare, obj);
                    dVarPrepare.step();
                    dVarPrepare.reset();
                    listCreateListBuilder.add(Long.valueOf(u5.r.getLastInsertedRowId(connection)));
                } else {
                    listCreateListBuilder.add(-1L);
                }
            }
            iv.a.closeFinally(dVarPrepare, null);
            return uu.o0.build(listCreateListBuilder);
        } finally {
        }
    }
}
