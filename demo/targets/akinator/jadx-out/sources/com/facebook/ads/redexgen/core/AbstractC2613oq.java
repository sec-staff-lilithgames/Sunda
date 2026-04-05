package com.facebook.ads.redexgen.core;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.facebook.ads.redexgen.X.oq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2613oq<E> extends AbstractSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oq != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c10) {
        return AbstractC2617ou.A0A(this, c10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oq != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c10) {
        return super.retainAll((Collection) AbstractC2279jA.A04(c10));
    }
}
