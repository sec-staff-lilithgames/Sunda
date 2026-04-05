package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.5K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5K extends FrameLayout implements InterfaceC1669Xo, I3 {
    public static byte[] A0I;
    public static String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public R0 A00;
    public R6 A01;
    public InterfaceC1855c0 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC2212hy A06;
    public final C1937dL A07;
    public final US A08;
    public final C1580Ua A09;
    public final XC A0A;
    public final XH A0B;
    public final InterfaceC1668Xn A0C;
    public final YY A0D;
    public final C1840bl A0E;
    public final C1848bt A0F;
    public final AbstractC2009eW A0G;
    public final C2010eX A0H;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{24, 47, 47, 50, 47, 125, 62, 47, 56, 60, 41, 52, 51, 58, 125, 62, 50, 51, 59, 52, 58, 125, 23, 14, 18, 19, 78, 69, 76, 68, 67, 72, 73, 114, 76, 73, 36, 47, 38, 46, 41, 34, 35, 24, 38, 35, 24, 46, 41, 35, 34, Utf8.REPLACEMENT_BYTE, 46, 37, 44, 36, 35, 40, 41, 18, 44, 41, 18, 57, 34, 57, 44, 33, 91, 80, 89, 81, 86, 93, 92, 103, 76, 81, 85, 93, 103, 75, 72, 93, 86, 76, 35, 44, 41, 35, 43, 31, 51, 47, 53, 50, 35, 37, 74, 76, 90, 77, 92, 83, 86, 92, 84};
    }

    static {
        A0D();
    }

    public C5K(C1937dL c1937dL, US us, InterfaceC1668Xn interfaceC1668Xn, AbstractC2212hy abstractC2212hy, YY yy, int i10) throws JSONException {
        super(c1937dL);
        this.A01 = new C1281Ii(this);
        this.A0G = new C1280Ih(this);
        this.A03 = true;
        this.A07 = c1937dL;
        this.A08 = us;
        this.A0C = interfaceC1668Xn;
        this.A06 = abstractC2212hy;
        this.A0D = yy;
        C1848bt c1848btA02 = AbstractC1849bu.A02(abstractC2212hy.A17());
        if (c1848btA02 == null) {
            this.A0F = new C1848bt(this.A07, abstractC2212hy, us, i10);
            this.A04 = false;
        } else {
            this.A0F = c1848btA02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new C1276Id(this));
        XP.A0E(IronSourceError.AUCTION_ERROR_DECRYPTION, this.A0F.A0O());
        if (this.A06.A1P()) {
            this.A0E = new C1840bl(this.A07, this.A08, this.A06, new SF(this.A07), this.A09, this.A0C, this.A0D, new C1274Ib(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC1836bh(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C2010eX(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0i());
        this.A0H.A0X(this.A06.A0j());
        this.A0F.A0e(this.A0H);
        this.A0A = new XC(this);
        this.A0A.A05(XB.A02);
        setBackgroundColor(0);
        if (U7.A1u(c1937dL)) {
            c1937dL.A0B().AK4(mediaView, abstractC2212hy.A25(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean zA2C = abstractC2212hy.A2C();
            String strA0B = A0B(68, 18, 20);
            String strA0B2 = A0B(36, 16, 107);
            String strA0B3 = A0B(52, 16, 97);
            String strA0B4 = A0B(26, 10, 1);
            if (zA2C) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 0);
                jSONObject.put(strA0B, this.A06.A0o());
            } else if (WR.A05(abstractC2212hy.A0u())) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 1);
                jSONObject.put(strA0B, this.A06.A0o());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(AbstractC1550Sv.A15, A0B(0, 26, 113));
        }
    }

    private void A0C() {
        C1888cX c1888cXA0F = new C1886cV(this.A07, this.A06.A20().A0I(), this.A06.A23()).A0A(this.A06.A1z().A01()).A0F();
        addView(c1888cXA0F, new FrameLayout.LayoutParams(-1, -1));
        c1888cXA0F.A04(new IW(this));
    }

    private final void A0E() throws JSONException {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0F().A5y();
            this.A0F.A0X();
        } else {
            this.A07.A0F().A5z();
            if (this.A0F.A0k()) {
                AJS();
                if (U7.A1u(this.A07)) {
                    this.A07.A0B().ACx();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            C1848bt c1848bt = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            ViewGroup parent = c1848bt.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3x(this, new RelativeLayout.LayoutParams(-1, -1));
        if (this.A06.A1Q()) {
            this.A0A.A05(XB.A03);
        }
    }

    private void A0F(String str) throws PackageManager.NameNotFoundException, RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a5 a5Var = new a5(this.A07, this.A0D.A7E(), this.A0H, this.A0B, this.A08, this.A06.A21(), this.A0C);
        HashMap map = new HashMap();
        map.put(A0B(86, 12, 108), A0B(98, 9, 19));
        a5Var.A05(this.A06.A25(), str, map);
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void A9X() throws PackageManager.NameNotFoundException, RemoteException {
        A0F(this.A06.A20().A0J().A05());
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void A9Y(String str) throws PackageManager.NameNotFoundException, RemoteException {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void A9c() {
        this.A0C.A4b(this.A0D.A6d());
        C1934dI serverSideRewardHandler = new C1934dI(this.A07, this.A0D, this.A06.A1A(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AAd() {
        new Handler(Looper.getMainLooper()).post(new C1273Ia(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) throws JSONException {
        C1848bt.A0B().incrementAndGet();
        r02.A0A(this.A01);
        this.A00 = r02;
        A0E();
        if (this.A06.A20().A0W()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void ADM() {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void ADQ() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AEF(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0R(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AEV(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0S(z10);
        }
        if (z10) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AF0(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0T(z10);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z10) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AFG() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AFn(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0U(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AFp(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0V(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AG4(String str) {
        String urlString = this.A06.A26(str);
        if (urlString == null) {
            return;
        }
        WN.A0O(new WN(), this.A07, WQ.A00(urlString), this.A06.A25());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AJS() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A00.finish(4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public String getCurrentClientToken() {
        return this.A06.A25();
    }

    private ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void onDestroy() {
        if (U7.A1u(this.A07)) {
            this.A07.A0B().AJj(getMediaView());
        }
        C1840bl c1840bl = this.A0E;
        String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (c1840bl != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.AAt(this.A06.A25(), new C1722Zp().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        AbstractC1849bu.A04(this.A06.A17());
        C1848bt.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1668Xn interfaceC1668Xn) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC1855c0 interfaceC1855c0) {
        this.A02 = interfaceC1855c0;
    }
}
