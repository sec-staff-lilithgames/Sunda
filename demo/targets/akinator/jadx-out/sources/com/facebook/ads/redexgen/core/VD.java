package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class VD extends AbstractRunnableC1624Vt {
    public static byte[] A01;
    public static String[] A02 = {"Cp4y0jGzgjmlhNOtolFVOVefspLcmrKL", "5GK8sLOcHtszB", "AOLPTOXU9sJ8f7mkW5imzLW9uvMXwnIa", "cYEf6saXY9z3veQOBiLayO", "AetyrNGNYAsiijDpUFLgJdlj31dZpeYf", "GwgqZOf2k60xdBESFLM8urtE7U9bH", "vGNTznilo2MQ1OpS5sYGGd", "eyCkGrJdBkkJqznMzmMtN6FzCpyOGqXF"};
    public final /* synthetic */ SQ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[4].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A02[5] = "yU9Q3i2imseGifaShK33hUjg5wmSv";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 2, 5, 20, -49, -19, -16, -28, -30, -19, 0, -28, -16, -10, -17, -11, -26, -13, -12, -2, 1, -11, -13, -2, -15, -11, 1, 7, 0, 6, -9, 4, 5, -13, -21, -25, -7, -5, -8, -21, -22, -27, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, 67, 59, 55, 73, 75, 72, 59, 58, 53, 73, 59, 73, 73, Utf8.REPLACEMENT_BYTE, 69, 68, 53, 74, Utf8.REPLACEMENT_BYTE, 67, 59};
    }

    static {
        A01();
    }

    public VD(SQ sq2) {
        this.A00 = sq2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 61), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                C1583Ud.A06(this.A00, C2034ev.A00(this.A00), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 34), this.A00.A09().A02()).putString(A00(64, 21, 114), XG.A03(this.A00.A09().A01())).apply();
        } catch (JSONException e10) {
            this.A00.A08().AAy(A00(31, 14, 46), 3502, new C1551Sw(e10));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (C1583Ud.class) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry entry : C1583Ud.A02.entrySet()) {
                editorEdit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            editorEdit.apply();
            C1583Ud.A03.set(2);
        }
    }
}
