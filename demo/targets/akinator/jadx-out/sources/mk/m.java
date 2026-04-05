package mk;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f74775b;

    public m(r rVar) {
        this.f74775b = rVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f74775b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[RETURN] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L29
            mk.r r0 = r4.f74775b
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L15
            mk.q r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L15
            goto L16
        L15:
            r0 = r3
        L16:
            if (r0 == 0) goto L25
            java.lang.Object r2 = r0.f74788j
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L25
            r3 = r0
        L25:
            if (r3 == 0) goto L29
            r5 = 1
            return r5
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.m.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new l(this.f74775b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L6
            goto L28
        L6:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            mk.r r2 = r5.f74775b
            r3 = 0
            if (r0 == 0) goto L16
            mk.q r0 = r2.a(r0, r1)     // Catch: java.lang.ClassCastException -> L16
            goto L17
        L16:
            r0 = r3
        L17:
            if (r0 == 0) goto L26
            java.lang.Object r4 = r0.f74788j
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L26
            r3 = r0
        L26:
            if (r3 != 0) goto L29
        L28:
            return r1
        L29:
            r6 = 1
            r2.c(r3, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.m.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f74775b.f74794f;
    }
}
