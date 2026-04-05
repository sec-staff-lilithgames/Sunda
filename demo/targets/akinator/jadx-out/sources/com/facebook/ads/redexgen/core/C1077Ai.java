package com.facebook.ads.redexgen.core;

import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1077Ai<T> extends AbstractC2648pg<T> {
    public static String[] A01 = {"Fzf9bGtlgYLIOrAPw9kTEZaT3NBj", "nNz32xSm8VfJXUnPFvOMlwsl", "3M1fcCd7TlcDEm", "k56f22msP7PYqb6b5y873zlegrO4Fy04", "AWl95DwkGptNZ3xbY", "ykYqQOs6JuEGf9dZOwLcZB0OUqMBre0v", "7kom9xCVKDNVBTXZjYyNTlOlPeBN", "7wkC9IZFUiSnbQO"};
    public boolean A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ai != com.google.common.collect.Iterators$SingletonNullIterator<T> */
    public C1077Ai() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ai != com.google.common.collect.Iterators$SingletonNullIterator<T> */
    public /* synthetic */ C1077Ai(C1079Ak c1079Ak) {
        this();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ai != com.google.common.collect.Iterators$SingletonNullIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ai != com.google.common.collect.Iterators$SingletonNullIterator<T> */
    @Override // java.util.Iterator
    public final T next() {
        if (!this.A00) {
            this.A00 = true;
            String[] strArr = A01;
            if (strArr[5].charAt(30) != strArr[3].charAt(30)) {
                throw new RuntimeException();
            }
            A01[7] = "or3VpPW3iSzksP2";
            return null;
        }
        throw new NoSuchElementException();
    }
}
