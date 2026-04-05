package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class KE extends AbstractC1742aB implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", "E", "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1937dL A05;
    public C1634Wd A06;
    public KG A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final a5 A0B;
    public final Map<String, String> A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, 24, 37, 22, 31, 28, 22, 30};
    }

    static {
        A04();
        A0F = (int) (AbstractC1640Wl.A02 * 24.0f);
    }

    public KE(C1937dL c1937dL, AbstractC2212hy abstractC2212hy, C1400My c1400My, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, InterfaceC1650Wv interfaceC1650Wv) {
        this(c1937dL, abstractC2212hy.A0r(), c1400My, abstractC2212hy.A20().A0J().A06(), us, interfaceC1668Xn, c2010eX, xh2, abstractC2212hy.A21(), interfaceC1650Wv);
        this.A0B.A08(abstractC2212hy);
    }

    public KE(C1937dL c1937dL, String str, C1400My c1400My, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, N3 n32) {
        this(c1937dL, str, c1400My, false, us, interfaceC1668Xn, c2010eX, xh2, n32);
    }

    public KE(C1937dL c1937dL, String str, C1400My c1400My, boolean z10, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, N3 n32) {
        super(c1937dL, c1400My);
        this.A0C = new HashMap();
        this.A05 = c1937dL;
        this.A0A = z10;
        this.A0B = new a5(c1937dL, str, c2010eX, xh2, us, n32, interfaceC1668Xn);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public KE(C1937dL c1937dL, String str, C1400My c1400My, boolean z10, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, N3 n32, InterfaceC1650Wv interfaceC1650Wv) {
        super(c1937dL, c1400My);
        this.A0C = new HashMap();
        this.A05 = c1937dL;
        this.A0A = z10;
        this.A0B = new a5(c1937dL, str, c2010eX, xh2, us, n32, interfaceC1668Xn, interfaceC1650Wv);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(XY.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? XX.MESSENGER : XX.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            C1634Wd c1634Wd = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            c1634Wd.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC2212hy abstractC2212hy) {
        return ((long) abstractC2212hy.A1w()) > 0 && abstractC2212hy.A1u() >= 0;
    }

    public final ME A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return ME.A09;
        }
        A03();
        this.A0C.put(A01(0, 12, 6), str);
        return this.A0B.A05(this.A08, this.A09, this.A0C);
    }

    public final boolean A0F(AbstractC2212hy abstractC2212hy, AbstractC1667Xm abstractC1667Xm) {
        if (this.A06 != null || !A05(abstractC2212hy) || abstractC2212hy.A24().A01() == null || abstractC2212hy.A24().A00() == null) {
            return false;
        }
        this.A07 = new KG(abstractC2212hy.A1u(), abstractC2212hy.A1w(), abstractC2212hy.A1v(), abstractC2212hy.A24().A01(), abstractC2212hy.A24().A00(), abstractC1667Xm, this);
        this.A06 = new C1634Wd(abstractC2212hy.A1w(), this.A07);
        this.A06.A07();
        return true;
    }

    public a5 getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A0E(A01(24, 9, 58));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f10 = width - textWidth;
            float textWidth2 = this.A00;
            int i10 = (int) (f10 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i10, top, left + i10, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(C1636Wh c1636Wh) {
        this.A0B.A09(c1636Wh);
    }

    public void setCta(C1401Mz c1401Mz, String str, Map<String, String> extraData) {
        setCta(c1401Mz, str, extraData, null);
    }

    public void setCta(C1401Mz c1401Mz, String str, Map<String, String> extraData, InterfaceC1650Wv interfaceC1650Wv, InterfaceC1737a4 interfaceC1737a4) {
        setCta(c1401Mz, str, extraData, interfaceC1737a4);
        this.A0B.A0A(interfaceC1650Wv);
    }

    public void setCta(C1401Mz c1401Mz, String str, Map<String, String> extraData, InterfaceC1737a4 interfaceC1737a4) {
        this.A08 = str;
        this.A09 = c1401Mz.A05();
        this.A0C.putAll(extraData);
        this.A0B.A0B(interfaceC1737a4);
        String strA04 = c1401Mz.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z10) {
        this.A0B.A0C(z10);
    }
}
