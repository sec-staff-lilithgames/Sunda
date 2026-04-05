package com.vungle.ads.internal.util;

import java.util.HashSet;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CollectionsConcurrencyUtil {
    public static final CollectionsConcurrencyUtil INSTANCE = new CollectionsConcurrencyUtil();

    private CollectionsConcurrencyUtil() {
    }

    public static final synchronized void addToSet(HashSet<String> hashset, String set) {
        e0.checkNotNullParameter(hashset, "hashset");
        e0.checkNotNullParameter(set, "set");
        hashset.add(set);
    }

    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
