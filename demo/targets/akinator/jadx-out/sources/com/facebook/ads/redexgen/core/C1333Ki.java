package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Ki, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1333Ki extends AbstractC1711Ze {
    public static byte[] A0F;
    public static String[] A0G = {"X5ywJXgSTO8PHmyyLHkjy", "LJCQW", "068uN", "say", "rTIjgGKqeW39zjdqZS0Aqu4tLxC", "Qrp", "m8T4zYbfVU3hLt0iEDnj", "pXMACVxBUOAUm1D"};
    public static final String A0H;
    public float A00;
    public XH A01;
    public AbstractC2009eW A02;
    public C2010eX A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Path A07;
    public final RectF A08;
    public final C1937dL A09;
    public final WeakReference<InterfaceC1714Zh> A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final AtomicInteger A0D;
    public final AtomicReference<String> A0E;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0F = new byte[]{91, 126, 89, 117, 116, 110, 104, 117, 118};
    }

    static {
        A04();
        A0H = C1333Ki.class.getSimpleName();
    }

    public C1333Ki(C1937dL c1937dL, WeakReference<InterfaceC1714Zh> weakReference, int i10, String str) {
        this(c1937dL, weakReference, i10, false);
        if (U7.A1u(c1937dL)) {
            c1937dL.A02().A0B().AK3(this, str == null ? A02(0, 0, 91) : str, false, true);
            this.A06 = true;
        }
    }

    public C1333Ki(C1937dL c1937dL, WeakReference<InterfaceC1714Zh> weakReference, int i10, boolean z10) {
        super(c1937dL);
        this.A0B = new AtomicBoolean();
        this.A0C = new AtomicBoolean(true);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A0D = new AtomicInteger(5000);
        this.A0E = new AtomicReference<>();
        this.A01 = new XH();
        this.A05 = true;
        this.A06 = false;
        this.A09 = c1937dL;
        this.A04 = z10;
        this.A0A = weakReference;
        this.A02 = new C1345Ku(this);
        this.A03 = new C2010eX(this, i10, new WeakReference(this.A02), this.A09);
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new C1713Zg(this, weakReference.get(), this.A03, this.A0B, this.A0C, this.A09), A02(0, 9, 46));
    }

    private final boolean A05() {
        return this.A0B.get();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1711Ze
    public final WebChromeClient A0G() {
        return new C1715Zi();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1711Ze
    public final WebViewClient A0H() {
        return new C1716Zj(this.A09, this.A0A, new WeakReference(this.A03), new WeakReference(this.A01), new WeakReference(this.A0C), new WeakReference(this), this.A0D, this.A0E, this.A04);
    }

    public final void A0K() {
        this.A09.A0F().AK5();
        this.A0B.set(true);
        new Handler(Looper.getMainLooper()).post(new C1339Ko(this.A03));
    }

    public final void A0L(int i10, int i11) {
        if (this.A03 != null) {
            this.A03.A0W(i10);
            this.A03.A0X(i11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1711Ze, android.webkit.WebView
    public final void destroy() {
        if (this.A06) {
            this.A09.A02().A0B().AJj(this);
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        XP.A0H(this);
        this.A02 = null;
        this.A01 = null;
        AbstractC1717Zk.A03(this);
        super.destroy();
    }

    public XH getTouchDataRecorder() {
        return this.A01;
    }

    public C2010eX getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A08.set(0.0f, 0.0f, getWidth(), getHeight());
            String[] strArr = A0G;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[1] = "xZYpx";
            strArr2[2] = "aqsn9";
            this.A07.reset();
            this.A07.addRoundRect(this.A08, this.A00, this.A00, Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A01.A06(this.A09, motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.A0A.get() != null) {
            this.A0A.get();
        }
        if (this.A03 == null) {
            return;
        }
        C1937dL c1937dL = this.A09;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "5ON080OOKwQwIFP5OG7h";
        strArr2[0] = "JBDgk0gsadULglMDLs8S8";
        c1937dL.A0F().AKJ(i10);
        if (i10 == 0 && A05()) {
            this.A03.A0U();
        } else {
            if (i10 != 8) {
                return;
            }
            this.A03.A0V();
        }
    }

    public void setBlockLocalFileAccessOutsideCache(boolean z10) {
        this.A04 = z10;
    }

    public void setCheckAssetsByJavascriptBridge(boolean z10) {
        this.A0C.set(z10);
    }

    public void setCornerRadius(float f10) {
        this.A00 = f10;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z10) {
        this.A05 = z10;
    }

    public void setRequestId(String str) {
        this.A0E.set(str);
    }

    public void setWebViewTimeoutInMillis(int i10) {
        if (i10 >= 0) {
            this.A0D.set(i10);
        }
    }
}
