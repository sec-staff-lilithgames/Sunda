package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: assets/audience_network.dex */
public final class XC implements View.OnSystemUiVisibilityChangeListener {
    public static String[] A05 = {"dzM0rIEz66", "2I5EpQxo3JaAydz5j2evjw", "riIr", "aw8X8aEsXK", "46V10M2ortldVuyFN9G4Mh", "Zv9bhia2uUXHxfPHNrQGPj2Fgj", "UQeU", "fL70pxGMq2jlNC9xIpTd7nvL"};
    public int A00;
    public Window A01;
    public final View A03;
    public XB A02 = XB.A02;
    public final Runnable A04 = new C1445Ot(this);

    public XC(View view) {
        this.A03 = view;
        this.A03.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i10, boolean z10) {
        if (this.A01 == null) {
            return;
        }
        WindowManager.LayoutParams attributes = this.A01.getAttributes();
        if (z10) {
            attributes.flags |= i10;
        } else {
            int i11 = attributes.flags;
            String[] strArr = A05;
            if (strArr[0].length() != strArr[3].length()) {
                A05[5] = "Y2LIVjWWRefqfkQFwWbZLdxa4m";
                attributes.flags = i11 & (~i10);
            } else {
                String[] strArr2 = A05;
                strArr2[0] = "3EQzEkO0gc";
                strArr2[3] = "SinRvB2gIw";
                attributes.flags = i11 & (~i10);
            }
        }
        Window window = this.A01;
        String[] strArr3 = A05;
        if (strArr3[1].length() != strArr3[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A05;
        strArr4[1] = "fe0FngUkI8h9c1BO2CK76I";
        strArr4[4] = "nmFu9vDS7iLUjXhy5dSdRg";
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z10) {
        if (XB.A02.equals(this.A02)) {
            return;
        }
        int i10 = 3840;
        if (!z10) {
            i10 = 3840 | 7;
        }
        Handler handler = this.A03.getHandler();
        if (handler != null && z10) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, 2000L);
        }
        this.A03.setSystemUiVisibility(i10);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(XB xb2) {
        this.A02 = xb2;
        switch (this.A02) {
            case A03:
                A00(67108864, true);
                A00(134217728, true);
                A02(false);
                break;
            default:
                A00(67108864, false);
                A00(134217728, false);
                this.A03.setSystemUiVisibility(0);
                break;
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        int diff = this.A00 ^ i10;
        this.A00 = i10;
        if ((diff & 2) != 0) {
            int i11 = i10 & 2;
            if (A05[5].length() != 26) {
                throw new RuntimeException();
            }
            A05[5] = "1GVM4GUQqWgiX1iklRLLb2m9Tx";
            if (i11 == 0) {
                if (A05[5].length() != 26) {
                    A02(true);
                    return;
                }
                String[] strArr = A05;
                strArr[0] = "67GBv9MjXI";
                strArr[3] = "0u8xrudpsw";
                A02(true);
            }
        }
    }
}
