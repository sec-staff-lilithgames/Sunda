package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class K8 implements Comparable<K8> {
    public final int A00;
    public final C1324Jz A01;

    public K8(int i10, C1324Jz c1324Jz) {
        this.A00 = i10;
        this.A01 = c1324Jz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(K8 k82) {
        return Integer.compare(this.A00, k82.A00);
    }
}
