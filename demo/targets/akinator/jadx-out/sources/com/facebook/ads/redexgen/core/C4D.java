package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.4D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4D {
    public static C4D A04;
    public static byte[] A05;
    public static String[] A06 = {"7spJOR808jvRvy0GNSJxo7ZJ6", "86KvIandX8vj142355r0drGuD0jhaT0W", "mZfZ3s6", "1QsEKJVAx", "twpDIoiDpzCAIzfG", "B", "RSZaC18qSGa0csTWoF4Keu66v9ytRHBi", "eBKWjsIIuU1hX4JwQhfiQu0nhoXTyGkQ"};
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<C4B>> A03 = new CopyOnWriteArrayList<>();
    public final Object A02 = new Object();
    public int A00 = 0;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{89, 86, 92, 74, 87, 81, 92, 22, 86, 93, 76, 22, 91, 87, 86, 86, 22, 123, 119, 118, 118, 125, 123, 108, 113, 110, 113, 108, 97, 103, 123, 112, 121, 118, AbstractJsonLexerKt.TC_INVALID, 125, 99, 111, 110, 110, 101, 99, 116, 105, 118, 105, 116, 121};
    }

    static {
        A06();
    }

    public C4D(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A04(0, 36, 40));
        context.registerReceiver(new C4C(this), intentFilter);
    }

    public static int A00(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(A04(36, 12, 16));
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 1;
            }
            switch (networkInfo.getType()) {
                case 0:
                case 4:
                case 5:
                    return A02(networkInfo);
                case 1:
                    return 2;
                case 2:
                case 3:
                case 7:
                case 8:
                default:
                    return 8;
                case 6:
                    return 5;
                case 9:
                    return 7;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static int A02(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                if (A06[0].length() != 25) {
                    throw new RuntimeException();
                }
                A06[5] = "Xq0rs7E";
                return 2;
            case 20:
                return AbstractC09264a.A02 >= 29 ? 9 : 0;
        }
    }

    public static synchronized C4D A03(Context context) {
        if (A04 == null) {
            A04 = new C4D(context);
        }
        return A04;
    }

    private void A05() {
        Iterator<WeakReference<C4B>> it = this.A03.iterator();
        while (it.hasNext()) {
            WeakReference<C4B> next = it.next();
            if (next.get() == null) {
                this.A03.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10) {
        synchronized (this.A02) {
            if (this.A00 == i10) {
                return;
            }
            this.A00 = i10;
            Iterator<WeakReference<C4B>> it = this.A03.iterator();
            while (it.hasNext()) {
                WeakReference<C4B> next = it.next();
                C4B c4b = next.get();
                if (c4b != null) {
                    c4b.AEM(i10);
                } else {
                    this.A03.remove(next);
                }
            }
        }
    }

    public final int A09() {
        int i10;
        synchronized (this.A02) {
            i10 = this.A00;
        }
        return i10;
    }

    public final void A0A(final C4B c4b) {
        A05();
        this.A03.add(new WeakReference<>(c4b));
        this.A01.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.47
            @Override // java.lang.Runnable
            public final void run() {
                this.A01.A0B(c4b);
            }
        });
    }

    public final /* synthetic */ void A0B(C4B c4b) {
        c4b.AEM(A09());
    }
}
