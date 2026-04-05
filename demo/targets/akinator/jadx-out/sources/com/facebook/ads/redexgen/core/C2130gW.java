package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.gW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2130gW implements InterfaceC1439On {
    public static String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final Rect A00 = new Rect();
    public final /* synthetic */ PH A01;

    public C2130gW(PH ph2) {
        this.A01 = ph2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1439On
    public final PK ACL(View view, PK pk2) {
        PK pkA06 = P3.A06(view, pk2);
        if (pkA06.A07()) {
            return pkA06;
        }
        Rect rect = this.A00;
        rect.left = pkA06.A03();
        rect.top = pkA06.A05();
        rect.right = pkA06.A04();
        rect.bottom = pkA06.A02();
        int count = this.A01.getChildCount();
        for (int i10 = 0; i10 < count; i10++) {
            PK pkA05 = P3.A05(this.A01.getChildAt(i10), pkA06);
            rect.left = Math.min(pkA05.A03(), rect.left);
            rect.top = Math.min(pkA05.A05(), rect.top);
            rect.right = Math.min(pkA05.A04(), rect.right);
            rect.bottom = Math.min(pkA05.A02(), rect.bottom);
        }
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        PK applied = pkA06.A06(i11, i12, i13, i14);
        return applied;
    }
}
