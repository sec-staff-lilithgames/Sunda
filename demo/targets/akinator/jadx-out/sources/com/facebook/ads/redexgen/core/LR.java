package com.facebook.ads.redexgen.core;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class LR implements ZZ {
    public static String[] A01 = {"YJvayVN4kVOLxlDJWGwOCabHg1Fqt8we", "dXRRKrs9Ij7YmQRV4DOVJ1oKXH0uRxvN", "n5YXMgelgzgI9ER8zULhKnxSUvKWD7FQ", "MjcTDZ9vVz9cB8bZ6OPiFlfIoErQXBVk", "8uXe0M8gsMoVnVy8oufardLoqnsq8OG9", "SOq47sVgQRT9DF7sN8qUq9bi0IFpLSH7", "zaXV1JxsQyTBZsc16bKnJvrmUTnQXACV", "RKyyTAGKUR4fF8w9wvyslT4CD7IDkjm1"};
    public final /* synthetic */ ZH A00;

    public LR(ZH zh2) {
        this.A00 = zh2;
    }

    @Override // com.facebook.ads.redexgen.core.ZZ
    public final void ACa(boolean z10) {
        this.A00.A0D(z10);
        if (!this.A00.A0B || this.A00.A00 == null) {
            return;
        }
        ImageView imageView = this.A00.A00;
        if (A01[1].charAt(7) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "1z8fFmuPWvqo0Almmab7pMFz1UcwKmNW";
        strArr[3] = "wk5V7hrE3V1AjvcaWXTFKexyEZN6L03E";
        imageView.setEnabled(z10);
        this.A00.A00.setAlpha(z10 ? 1.0f : 0.3f);
    }

    @Override // com.facebook.ads.redexgen.core.ZZ
    public final void ADJ(boolean z10) {
        this.A00.A0D(z10);
        if (!this.A00.A0B || this.A00.A02 == null) {
            return;
        }
        this.A00.A02.setEnabled(z10);
        this.A00.A02.setAlpha(z10 ? 1.0f : 0.3f);
    }
}
