package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2267ix implements InterfaceC09484w {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC09454t A02;
    public InterfaceC09484w A04;
    public InterfaceC1364Ln A05;
    public boolean A07;
    public InterfaceC09484w A03 = new C2545nh();
    public InterfaceC1373Lw A06 = InterfaceC1373Lw.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC09484w
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C7S A5A() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00, this.A01);
    }

    private C7S A01(InterfaceC2549nl interfaceC2549nl, int i10, int i11) {
        C2268iy c2268iyA59;
        InterfaceC1364Ln interfaceC1364Ln = (InterfaceC1364Ln) C3M.A01(this.A05);
        if (this.A07 || interfaceC2549nl == null) {
            c2268iyA59 = null;
        } else if (this.A02 != null) {
            InterfaceC09454t interfaceC09454t = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c2268iyA59 = interfaceC09454t.A59();
        } else {
            c2268iyA59 = new C2269iz().A00(interfaceC1364Ln).A59();
        }
        return new C7S(interfaceC1364Ln, interfaceC2549nl, this.A03.A5A(), c2268iyA59, this.A06, i10, null, i11, null);
    }

    public final AnonymousClass31 A02() {
        return null;
    }

    public final C2267ix A03(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C2267ix A04(InterfaceC09484w interfaceC09484w) {
        this.A03 = interfaceC09484w;
        return this;
    }

    public final C2267ix A05(InterfaceC09484w interfaceC09484w) {
        this.A04 = interfaceC09484w;
        return this;
    }

    public final C2267ix A06(InterfaceC1364Ln interfaceC1364Ln) {
        this.A05 = interfaceC1364Ln;
        return this;
    }

    public final C7S A07() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00 | 1, -1000);
    }
}
