package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.text.Layout;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Bitmap A0C;
    public Layout.Alignment A0D;
    public Layout.Alignment A0E;
    public CharSequence A0F;
    public boolean A0G;

    public C3C() {
        this.A0F = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A01 = -3.4028235E38f;
        this.A07 = Integer.MIN_VALUE;
        this.A06 = Integer.MIN_VALUE;
        this.A02 = -3.4028235E38f;
        this.A08 = Integer.MIN_VALUE;
        this.A09 = Integer.MIN_VALUE;
        this.A05 = -3.4028235E38f;
        this.A04 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A0G = false;
        this.A0B = -16777216;
        this.A0A = Integer.MIN_VALUE;
    }

    public C3C(C2565o2 c2565o2) {
        this.A0F = c2565o2.A0F;
        this.A0C = c2565o2.A0C;
        this.A0E = c2565o2.A0E;
        this.A0D = c2565o2.A0D;
        this.A01 = c2565o2.A01;
        this.A07 = c2565o2.A07;
        this.A06 = c2565o2.A06;
        this.A02 = c2565o2.A02;
        this.A08 = c2565o2.A08;
        this.A09 = c2565o2.A09;
        this.A05 = c2565o2.A05;
        this.A04 = c2565o2.A04;
        this.A00 = c2565o2.A00;
        this.A0G = c2565o2.A0G;
        this.A0B = c2565o2.A0B;
        this.A0A = c2565o2.A0A;
        this.A03 = c2565o2.A03;
    }

    @Pure
    public final int A00() {
        return this.A06;
    }

    @Pure
    public final int A01() {
        return this.A08;
    }

    public final C3C A02() {
        this.A0G = false;
        return this;
    }

    public final C3C A03(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C3C A04(float f10) {
        this.A02 = f10;
        return this;
    }

    public final C3C A05(float f10) {
        this.A03 = f10;
        return this;
    }

    public final C3C A06(float f10) {
        this.A04 = f10;
        return this;
    }

    public final C3C A07(float f10, int i10) {
        this.A01 = f10;
        this.A07 = i10;
        return this;
    }

    public final C3C A08(float f10, int i10) {
        this.A05 = f10;
        this.A09 = i10;
        return this;
    }

    public final C3C A09(int i10) {
        this.A06 = i10;
        return this;
    }

    public final C3C A0A(int i10) {
        this.A08 = i10;
        return this;
    }

    public final C3C A0B(int i10) {
        this.A0A = i10;
        return this;
    }

    public final C3C A0C(int i10) {
        this.A0B = i10;
        this.A0G = true;
        return this;
    }

    public final C3C A0D(Bitmap bitmap) {
        this.A0C = bitmap;
        return this;
    }

    public final C3C A0E(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C3C A0F(Layout.Alignment alignment) {
        this.A0E = alignment;
        return this;
    }

    public final C3C A0G(CharSequence charSequence) {
        this.A0F = charSequence;
        return this;
    }

    public final C2565o2 A0H() {
        return new C2565o2(this.A0F, this.A0E, this.A0D, this.A0C, this.A01, this.A07, this.A06, this.A02, this.A08, this.A09, this.A05, this.A04, this.A00, this.A0G, this.A0B, this.A0A, this.A03);
    }

    @Pure
    public final CharSequence A0I() {
        return this.A0F;
    }
}
