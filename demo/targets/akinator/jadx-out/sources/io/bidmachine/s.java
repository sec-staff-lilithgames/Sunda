package io.bidmachine;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements Comparator {
    @Override // java.util.Comparator
    public int compare(n nVar, n nVar2) {
        return -Double.compare(nVar.getPrice(), nVar2.getPrice());
    }
}
