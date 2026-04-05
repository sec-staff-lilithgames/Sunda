package u5;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import o5.y0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static final boolean contains(y0.d dVar, int i10, int i11) {
        e0.checkNotNullParameter(dVar, "<this>");
        Map<Integer, Map<Integer, s5.b>> migrations = dVar.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        Map<Integer, s5.b> mapEmptyMap = migrations.get(Integer.valueOf(i10));
        if (mapEmptyMap == null) {
            mapEmptyMap = p1.emptyMap();
        }
        return mapEmptyMap.containsKey(Integer.valueOf(i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<s5.b> findMigrationPath(o5.y0.d r8, int r9, int r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r0)
            if (r9 != r10) goto Lc
            java.util.List r8 = uu.p0.emptyList()
            return r8
        Lc:
            r0 = 0
            r1 = 1
            if (r10 <= r9) goto L12
            r2 = r1
            goto L13
        L12:
            r2 = r0
        L13:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L18:
            if (r2 == 0) goto L1d
            if (r9 >= r10) goto L70
            goto L1f
        L1d:
            if (r9 <= r10) goto L70
        L1f:
            if (r2 == 0) goto L26
            tu.v r4 = r8.getSortedDescendingNodes$room_runtime_release(r9)
            goto L2a
        L26:
            tu.v r4 = r8.getSortedNodes$room_runtime_release(r9)
        L2a:
            if (r4 != 0) goto L2d
            goto L6e
        L2d:
            java.lang.Object r5 = r4.component1()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r4 = r4.component2()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r2 == 0) goto L56
            int r7 = r9 + 1
            if (r7 > r6) goto L3d
            if (r6 > r10) goto L3d
            goto L5a
        L56:
            if (r10 > r6) goto L3d
            if (r6 >= r9) goto L3d
        L5a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.Object r9 = r5.get(r9)
            kotlin.jvm.internal.e0.checkNotNull(r9)
            r3.add(r9)
            r4 = r1
            r9 = r6
            goto L6c
        L6b:
            r4 = r0
        L6c:
            if (r4 != 0) goto L18
        L6e:
            r8 = 0
            return r8
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.n.findMigrationPath(o5.y0$d, int, int):java.util.List");
    }

    public static final boolean isMigrationRequired(o5.l lVar, int i10, int i11) {
        e0.checkNotNullParameter(lVar, "<this>");
        if (i10 > i11 && lVar.f77632l) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = lVar.getMigrationNotRequiredFrom$room_runtime_release();
        return lVar.f77631k && (migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i10)));
    }
}
