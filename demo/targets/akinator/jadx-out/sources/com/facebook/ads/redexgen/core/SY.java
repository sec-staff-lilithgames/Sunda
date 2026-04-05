package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SY<T> extends AsyncTask<Void, Void, T> {
    public static byte[] A04;
    public EnumC1530Sb A00;
    public final C1911cu A01;
    public final AbstractC1531Sc<T> A02;
    public final AbstractC1561Tg<T> A03;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{5, 2, 21, 2, 3, 2, 20, 6};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sc != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public SY(C1911cu c1911cu, AbstractC1531Sc<T> abstractC1531Sc, AbstractC1561Tg<T> abstractC1561Tg) {
        this.A02 = abstractC1531Sc;
        this.A03 = abstractC1561Tg;
        this.A01 = c1911cu;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    private final T A00(Void... voidArr) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        T tA03 = null;
        try {
            try {
                tA03 = this.A02.A03();
                this.A00 = this.A02.A00();
                return tA03;
            } catch (Exception e10) {
                this.A01.A08().AAy(A01(0, 8, 89), AbstractC1550Sv.A0w, new C1551Sw(e10));
                this.A00 = EnumC1530Sb.A08;
                return tA03;
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        try {
            return A00(voidArr);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final void onPostExecute(T result) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A03.A02(result);
            } else {
                this.A03.A01(this.A00.A03(), this.A00.A04());
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
