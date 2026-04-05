package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1743aC implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"fjtAB", "bsaRMRqbX1J53zhFSd", "3x", "d1GXs2u7l6dphEhs75uHz8nXS", "xBLq5iNxiropzdSod3RzWHu9Svz5m1J", "bqiGUlPWwNgoqXE8vIE4LDwWoR3rV8W6", "Cst7knLO4cVZP", "zRpbMV9q"};
    public final /* synthetic */ C09595h A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{115, 119, 123, 125, AbstractJsonLexerKt.TC_INVALID};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1743aC(C09595h c09595h) {
        this.A00 = c09595h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 73));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            if (A02[2].length() == 17) {
                throw new RuntimeException();
            }
            A02[0] = "IkNABMfZpUuzelGW3VlRw";
        }
    }
}
