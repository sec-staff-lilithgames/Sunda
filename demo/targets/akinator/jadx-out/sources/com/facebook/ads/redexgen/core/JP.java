package com.facebook.ads.redexgen.core;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class JP {
    public JJ A00;
    public JL A01;
    public final int A02;
    public final int A03;
    public final SparseArray<JN> A08 = new SparseArray<>();
    public final SparseArray<JI> A06 = new SparseArray<>();
    public final SparseArray<JK> A07 = new SparseArray<>();
    public final SparseArray<JI> A04 = new SparseArray<>();
    public final SparseArray<JK> A05 = new SparseArray<>();

    public JP(int i10, int i11) {
        this.A03 = i10;
        this.A02 = i11;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
