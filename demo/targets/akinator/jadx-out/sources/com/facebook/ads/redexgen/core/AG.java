package com.facebook.ads.redexgen.core;

import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: assets/audience_network.dex */
public class AG<E> extends C2427lm<E> implements Set<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AG != com.google.common.collect.Sets$FilteredSet<E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jB != com.google.common.base.Predicate<? super E> */
    public AG(Set<E> unfiltered, InterfaceC2280jB<? super E> predicate) {
        super(unfiltered, predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AG != com.google.common.collect.Sets$FilteredSet<E> */
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object object) {
        return AbstractC2617ou.A09(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AG != com.google.common.collect.Sets$FilteredSet<E> */
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2617ou.A00(this);
    }
}
