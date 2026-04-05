package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p3 extends v3 {
    public p3() {
        this.f6062b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f6063c = map;
        this.f6066g = map;
    }

    @Override // androidx.datastore.preferences.protobuf.v3
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i10 = 0; i10 < getNumArrayEntries(); i10++) {
                Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i10);
                if (((h1) ((z0) arrayEntryAt.getKey())).isRepeated()) {
                    arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                if (((h1) ((z0) entry.getKey())).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.v3, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable<Object>) obj, obj2);
    }
}
