package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class O6 implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public O6 A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<O6> A04;

    public O6(int i10, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i10;
        this.A03 = str;
        this.A02 = str2;
    }

    public O6(String str) {
        this(0, null, str);
    }

    private void A00(O6 o62) {
        this.A00 = o62;
    }

    public final int A01() {
        return this.A01;
    }

    public final O6 A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<O6> A05() {
        return this.A04;
    }

    public final void A06(O6 o62) {
        o62.A00(this);
        this.A04.add(o62);
    }
}
