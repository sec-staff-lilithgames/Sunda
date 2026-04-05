package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class KG implements InterfaceC1633Wc {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public int A02;
    public AbstractC1667Xm A03;
    public String A04;
    public String A05;
    public KE A06;
    public boolean A0A = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public Integer A07 = null;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{78, 102, 112, 118, 102, 72, 117, 97, 96, 123, 119, 120, 125, 119, AbstractJsonLexerKt.TC_INVALID};
    }

    public KG(int i10, int i11, int i12, String str, String str2, AbstractC1667Xm abstractC1667Xm, KE ke2) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = i12;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = abstractC1667Xm;
        this.A06 = ke2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (this.A08) {
            A04();
        }
    }

    public final synchronized void A04() {
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (this.A01 == 1 && this.A03 != null) {
            this.A03.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 66));
            this.A03.A07();
            if (this.A07 != null) {
                this.A03.setToolbarActionMode(this.A07.intValue());
            }
            if (this.A06.getColorInfo() != null) {
                this.A03.A0A(this.A06.getColorInfo(), false);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final synchronized void ACp() {
        if (!this.A09) {
            this.A06.A0E(A00(6, 9, 101));
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final synchronized void AEn(float f10) {
        if (!this.A09 && this.A03 != null) {
            if (this.A01 == 1) {
                if (!this.A0A) {
                    this.A07 = Integer.valueOf(this.A03.getToolbarActionMode());
                    this.A03.setProgressClickListener(new ViewOnClickListenerC1736a3(this));
                    this.A03.A08();
                    this.A03.setToolbarListener(new KH(this));
                    this.A0A = true;
                    if (this.A07 == null || this.A07.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f10 <= this.A02) {
                    if (!this.A08) {
                        this.A08 = true;
                        if (this.A07 == null || this.A07.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(XX.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 100), String.valueOf((int) Math.ceil(f10))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
