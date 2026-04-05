package o5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p extends c2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y0 database) {
        super(database);
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
    }

    public abstract void bind(y5.j jVar, Object obj);

    public final void insert(Object obj) {
        y5.j jVarAcquire = acquire();
        try {
            bind(jVarAcquire, obj);
            jVarAcquire.executeInsert();
        } finally {
            release(jVarAcquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        y5.j jVarAcquire = acquire();
        try {
            bind(jVarAcquire, obj);
            return jVarAcquire.executeInsert();
        } finally {
            release(jVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i10 = 0;
            for (Object obj : entities) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    uu.p0.throwIndexOverflow();
                }
                bind(jVarAcquire, obj);
                jArr[i10] = jVarAcquire.executeInsert();
                i10 = i11;
            }
            release(jVarAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(jVarAcquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        Iterator<Object> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                bind(jVarAcquire, it.next());
                lArr[i10] = Long.valueOf(jVarAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(jVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        try {
            List listCreateListBuilder = uu.o0.createListBuilder();
            for (Object obj : entities) {
                bind(jVarAcquire, obj);
                listCreateListBuilder.add(Long.valueOf(jVarAcquire.executeInsert()));
            }
            List<Long> listBuild = uu.o0.build(listCreateListBuilder);
            release(jVarAcquire);
            return listBuild;
        } catch (Throwable th2) {
            release(jVarAcquire);
            throw th2;
        }
    }

    public final void insert(Object[] entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        try {
            for (Object obj : entities) {
                bind(jVarAcquire, obj);
                jVarAcquire.executeInsert();
            }
        } finally {
            release(jVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                bind(jVarAcquire, entities[i10]);
                jArr[i11] = jVarAcquire.executeInsert();
                i10++;
                i11 = i12;
            }
            return jArr;
        } finally {
            release(jVarAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        Iterator it = kotlin.jvm.internal.i.iterator(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bind(jVarAcquire, it.next());
                lArr[i10] = Long.valueOf(jVarAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(jVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        try {
            List listCreateListBuilder = uu.o0.createListBuilder();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(jVarAcquire, it.next());
                listCreateListBuilder.add(Long.valueOf(jVarAcquire.executeInsert()));
            }
            List<Long> listBuild = uu.o0.build(listCreateListBuilder);
            release(jVarAcquire);
            return listBuild;
        } catch (Throwable th2) {
            release(jVarAcquire);
            throw th2;
        }
    }

    public final void insert(Iterable<Object> entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        y5.j jVarAcquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            while (it.hasNext()) {
                bind(jVarAcquire, it.next());
                jVarAcquire.executeInsert();
            }
        } finally {
            release(jVarAcquire);
        }
    }
}
