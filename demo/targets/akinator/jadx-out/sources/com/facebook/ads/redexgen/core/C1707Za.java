package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1707Za extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"UcT", "7pCxO", "d1eUuJRsSQrbyeV", "NvcYkIOLS6u3Z", "4rhEUJepg5yzUmxbs6HYJp18fCLzs", "c8rjrCABAqtuVN2R", "gqC4klM2hvrTEGu", "cDVUBFjHiz5XJka2"};
    public final WeakReference<C1937dL> A00;
    public final WeakReference<ZY> A01;
    public final WeakReference<ZT> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "xQ2";
            strArr2[1] = "BwhB4";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 36);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{81, 86, 81, -66, -31, -28, -35, -104, -69, -32, -25, -25, -21, -35, -22, -117, -104, -114, -100, -103, -109, -114, 88, -109, -104, -98, -113, -104, -98, 88, -117, -115, -98, -109, -103, -104, 88, 113, 111, 126, -119, 109, 121, 120, 126, 111, 120, 126, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -30, -32, -13, -28, -26, -18, -15, -8, -83, -50, -49, -60, -51, -64, -63, -53, -60, -68, -86, -89, -92, -69, -82, -86, -68};
    }

    static {
        A01();
    }

    public C1707Za(WeakReference<C1937dL> weakReference, WeakReference<ZY> weakReference2, WeakReference<ZT> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    private boolean A02(ValueCallback valueCallback) {
        C1937dL c1937dL = this.A00.get();
        if (c1937dL != null && c1937dL.A0E() != null && LJ.A09) {
            if (LJ.A08 != null) {
                LJ.A08.onReceiveValue(null);
                String[] strArr = A04;
                if (strArr[4].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "8y9TMu8YjdwMhcx8OyIx8Raox9jk1";
                strArr2[3] = "8D57YjnpkPWjk";
                ValueCallback unused = LJ.A08 = null;
            }
            ValueCallback unused2 = LJ.A08 = valueCallback;
            try {
                Intent intent = new Intent(A00(15, 33, 6));
                intent.addCategory(A00(48, 32, 91));
                intent.setType(A00(0, 3, 3));
                c1937dL.A0E().startActivityForResult(Intent.createChooser(intent, A00(3, 12, 84)), 1001);
                return true;
            } catch (Exception e10) {
                c1937dL.A08().AAz(A00(80, 8, 33), AbstractC1550Sv.A2d, new C1551Sw(e10));
                ValueCallback unused3 = LJ.A08 = null;
                return false;
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        ZT zt2 = this.A02.get();
        if (!TextUtils.isEmpty(strMessage) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && zt2 != null) {
            zt2.A04(strMessage);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        ZT timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        ZY zy = this.A01.get();
        if (zy != null) {
            zy.AEq(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        ZY listener = this.A01.get();
        if (listener != null) {
            listener.AEt(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
