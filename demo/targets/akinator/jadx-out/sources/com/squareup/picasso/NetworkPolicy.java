package com.squareup.picasso;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    NetworkPolicy(int i10) {
        this.index = i10;
    }

    public static boolean isOfflineOnly(int i10) {
        return (i10 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
