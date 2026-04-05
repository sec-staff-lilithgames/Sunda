package com.explorestack.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ya extends gb {
    @Override // com.explorestack.protobuf.gb
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i10 = 0; i10 < getNumArrayEntries(); i10++) {
                Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i10);
                if (((a6) arrayEntryAt.getKey()).isRepeated()) {
                    arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                if (((a6) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // com.explorestack.protobuf.gb, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable<Object>) obj, obj2);
    }
}
