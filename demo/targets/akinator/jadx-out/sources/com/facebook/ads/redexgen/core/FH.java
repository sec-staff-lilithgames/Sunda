package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class FH extends QT {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC1825bW A02;
    public C2010eX A04;
    public List<C1904cn> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C2117gI A0C;
    public final AbstractC1479Qb A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC1829ba A0F = new FK(this);
    public InterfaceC1827bY A03 = new FJ(this);
    public final InterfaceC1828bZ A0E = new FI(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public FH(C08310h c08310h, int i10, List<C1904cn> list, C2010eX c2010eX, Bundle bundle) {
        this.A0C = c08310h.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = c2010eX;
        this.A0D = new C2116gH(c08310h.getContext());
        this.A0B = c08310h.getContext();
        c08310h.A1h(this);
        A0D(bundle);
    }

    private AbstractC1290Ir A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    private AbstractC1290Ir A04(int i10, int i11, boolean z10) {
        AbstractC1290Ir abstractC1290Ir = null;
        while (i10 <= i11) {
            AbstractC1290Ir abstractC1290Ir2 = (AbstractC1290Ir) this.A0C.A1o(i10);
            if (abstractC1290Ir2 == null || abstractC1290Ir2.A1S()) {
                return null;
            }
            boolean zA0a = A0a(abstractC1290Ir2);
            if (abstractC1290Ir == null && abstractC1290Ir2.A1T() && zA0a && !this.A0G.contains(Integer.valueOf(i10)) && (!z10 || A0I(abstractC1290Ir2, this.A0A))) {
                abstractC1290Ir = abstractC1290Ir2;
            }
            if (abstractC1290Ir2.A1T() && !zA0a) {
                A0C(i10, false);
            }
            i10++;
        }
        return abstractC1290Ir;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        AbstractC1290Ir abstractC1290IrA03 = A03(lastVisibleItem, firstVisibleItem);
        if (abstractC1290IrA03 != null) {
            abstractC1290IrA03.A1Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA25 = this.A0C.A25();
        if (iA25 != -1) {
            int curPos = this.A05.size();
            if (iA25 < curPos - 1) {
                int curPos2 = iA25 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        AbstractC1290Ir abstractC1290IrA04 = A04(i10 + 1, this.A0C.A27(), false);
        if (abstractC1290IrA04 != null) {
            abstractC1290IrA04.A1Q();
            A0U(((Integer) abstractC1290IrA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC1771ae abstractC1771ae, int i10) {
        int allowedAreaMaxX;
        int furthestX;
        if (i10 == 2) {
            allowedAreaMaxX = AbstractC1640Wl.A04.widthPixels - 1;
        } else {
            int width = abstractC1771ae.getWidth();
            int allowedAreaMinX = AbstractC1640Wl.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i10 == 2) {
            furthestX = 1;
        } else {
            int i11 = AbstractC1640Wl.A04.widthPixels;
            int allowedAreaMinX2 = abstractC1771ae.getWidth();
            furthestX = (int) (((i11 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x10 = abstractC1771ae.getX();
        int allowedAreaMinX3 = abstractC1771ae.getWidth();
        return ((int) (x10 + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC1771ae.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC1290Ir abstractC1290Ir) {
        if (!this.A08 || !abstractC1290Ir.A1T()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public void A0L(C09846g c09846g, int i10) {
        super.A0L(c09846g, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public void A0M(C09846g c09846g, int i10, int i11) {
        super.A0M(c09846g, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i10);
    }

    public final InterfaceC1827bY A0N() {
        return this.A03;
    }

    public final InterfaceC1828bZ A0O() {
        return this.A0E;
    }

    public final InterfaceC1829ba A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int iA27 = this.A0C.A27();
        for (int iA26 = this.A0C.A26(); iA26 <= iA27 && iA26 >= 0; iA26++) {
            AbstractC1290Ir card = (AbstractC1290Ir) this.A0C.A1o(iA26);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1S()) {
                this.A01 = iA26;
                card.A1P();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC1290Ir abstractC1290Ir = (AbstractC1290Ir) this.A0C.A1o(this.A01);
        if (abstractC1290Ir != null && this.A01 >= 0) {
            abstractC1290Ir.A1Q();
        }
    }

    public final void A0S(int i10) {
        AbstractC1290Ir abstractC1290Ir = (AbstractC1290Ir) this.A0C.A1o(i10);
        if (abstractC1290Ir != null && !A0a(abstractC1290Ir)) {
            A0Z(abstractC1290Ir, false);
        }
    }

    public final void A0T(int i10) {
        AbstractC1290Ir abstractC1290Ir = (AbstractC1290Ir) this.A0C.A1o(i10);
        if (abstractC1290Ir == null) {
            return;
        }
        if (A0a(abstractC1290Ir)) {
            A0Z(abstractC1290Ir, true);
        }
        if (A0J(abstractC1290Ir) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((Integer) abstractC1290Ir.getTag(-1593835536)).intValue()).A03().A0H().A0A() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1N(this.A0D);
    }

    public final void A0V(int i10, int i11, int i12) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A25();
        if (recomputeFrom == -1) {
            recomputeFrom = i12 < 0 ? i10 : i11;
        }
        this.A02.AJp(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC1825bW interfaceC1825bW) {
        this.A02 = interfaceC1825bW;
    }

    public void A0Z(AbstractC1290Ir abstractC1290Ir, boolean z10) {
        if (A0H()) {
            A0X(abstractC1290Ir, z10);
        }
        if (!z10 && abstractC1290Ir.A1S()) {
            abstractC1290Ir.A1P();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
