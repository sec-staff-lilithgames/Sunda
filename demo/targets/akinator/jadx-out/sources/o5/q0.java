package o5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o5.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final y.b f77694a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f77695b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f77696c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f77697d;

    public q0(y.b observer, int[] tableIds, String[] tableNames) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableIds, "tableIds");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        this.f77694a = observer;
        this.f77695b = tableIds;
        this.f77696c = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f77697d = !(tableNames.length == 0) ? uu.b2.setOf(tableNames[0]) : uu.c2.emptySet();
    }

    public final y.b getObserver$room_runtime_release() {
        return this.f77694a;
    }

    public final int[] getTableIds$room_runtime_release() {
        return this.f77695b;
    }

    public final void notifyByTableIds$room_runtime_release(Set<Integer> invalidatedTablesIds) {
        Set<String> setEmptySet;
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f77695b;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set setCreateSetBuilder = uu.b2.createSetBuilder();
                int length2 = iArr.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i10]))) {
                        setCreateSetBuilder.add(this.f77696c[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                setEmptySet = uu.b2.build(setCreateSetBuilder);
            } else {
                setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f77697d : uu.c2.emptySet();
            }
        } else {
            setEmptySet = uu.c2.emptySet();
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.f77694a.onInvalidated(setEmptySet);
    }

    public final void notifyByTableNames$room_runtime_release(Set<String> invalidatedTablesNames) {
        Set<String> setEmptySet;
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidatedTablesNames, "invalidatedTablesNames");
        String[] strArr = this.f77696c;
        int length = strArr.length;
        if (length == 0) {
            setEmptySet = uu.c2.emptySet();
        } else if (length != 1) {
            Set setCreateSetBuilder = uu.b2.createSetBuilder();
            for (String str : invalidatedTablesNames) {
                int length2 = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        String str2 = strArr[i10];
                        if (sv.k0.equals(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                            break;
                        }
                        i10++;
                    }
                }
            }
            setEmptySet = uu.b2.build(setCreateSetBuilder);
        } else {
            Set<String> set = invalidatedTablesNames;
            if ((set instanceof Collection) && set.isEmpty()) {
                setEmptySet = uu.c2.emptySet();
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (sv.k0.equals((String) it.next(), strArr[0], true)) {
                        setEmptySet = this.f77697d;
                        break;
                    }
                }
                setEmptySet = uu.c2.emptySet();
            }
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.f77694a.onInvalidated(setEmptySet);
    }
}
