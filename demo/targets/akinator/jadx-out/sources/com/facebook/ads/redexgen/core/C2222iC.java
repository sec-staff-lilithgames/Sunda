package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.iC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2222iC extends MR {
    public static byte[] A0G;
    public static String[] A0H = {"naGFqnPrPSZVlF1tbzSnGlWDlhg8Bx7N", "RM0IQcINTb6QF6bWU7ymbn4JjJrL5iWr", "XJIeYwVEWh3ByQbCoBQqWdEefl5R9e76", "6T6YAwPN0KvqZkFL7aTQgfqW9EwPqPWp", "VPS1QaAIDZymsBiqXIOVWbiLhGEbna9V", "CymBNsc0cxG6yTnU49Ac6tOVI4DKwjx7", "uBQQQ5YEdlglu1zaQURE0tehHklX5mTJ", "q6iumcfL9EATxxGEWvppmeo1ZOnHOvxd"};
    public View A00;
    public View A01;
    public NativeAdLayout A02;
    public EnumC1379Mc A03;
    public EnumC1380Md A04;
    public EnumC1598Us A05;
    public String A06;
    public WeakReference<C2097fx> A07;
    public List<View> A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C2233iN A0F;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0G = new byte[]{AbstractJsonLexerKt.TC_INVALID, -88, -92, -93, 85, -102, -83, -104, -102, -91, -87, -98, -92, -93, -52, -38, -31, -44, -50, -54, -40, -33, -46, -36, -126, -112, -105, -108, -118, 126, -111, -112, -112, -117, -118, -98, -89, -100, -82, -82, -33, -24, -27, -33, -25, -35, -34, -24, -31, -104, -85, -89, -91, -108, -110, -101, -100, -95, -89, -90, -103, -108, -125, -121, 123, -127, AbstractJsonLexerKt.TC_INVALID, -119, -122, -112, -111, -82, -90, -91, -86, -94, -73, -86, -90, -72, -79, -92, -81, -80, -92, -69, -70, -17, -30, -19, -18, -22, -17, -8, -1, -14, -2, -7, -45, -58, -46, -36, -71, -84, -67, -84, -67, 2, -10, 11, -3, 10, -38, -44, -33, -38, -43, -30, -26, -27, -18, -42, -43, -34, -55, -40, -56, -50, -61, -10, -7, -16, -18, -16, -11, -63, -61, -74, -76, -78, -76, -71, -74, -80, -66, -74, -75, -70, -78, -115, -125, -108, AbstractJsonLexerKt.TC_INVALID, -90, -95, -108, -93, -90, -101, -94, -89, -28, -43, -24, -28, -18, -13, -22, -33, -85, -103, -84, -88, -35, -42, -45, -42, -41, -33, -42, -99, -112, -116, -98, -13, -26, -30, -12, -28, -17, -20, -14, -19, -78, -97, 113, 92, -101, 99, 87, -82, 113, 92, -101, -76, -51, -54, -116, 119, -74, 126, 114, -53, -116, 119, -74, -49};
    }

    static {
        A05();
    }

    public C2222iC(C1937dL c1937dL, MS ms, C2010eX c2010eX, C2233iN c2233iN) {
        super(c1937dL, ms, c2010eX);
        this.A03 = EnumC1379Mc.A03;
        this.A04 = null;
        this.A0F = c2233iN;
    }

    private String A02(View view) {
        try {
            JSONObject json = A04(view);
            return json.toString();
        } catch (JSONException unused) {
            return A01(0, 14, 32);
        }
    }

    private String A03(View view) {
        int width = view.getWidth();
        String strA01 = A01(0, 0, 95);
        if (width <= 0 || view.getHeight() <= 0) {
            return strA01;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, this.A0F.A0A(), byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Exception unused) {
            return strA01;
        }
    }

    private JSONObject A04(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(A01(60, 2, 27), Integer.valueOf(view.getId()));
        jSONObject.putOpt(A01(35, 5, 38), view.getClass());
        boolean z10 = false;
        jSONObject.putOpt(A01(129, 6, 114), String.format(Locale.US, A01(205, 12, 61), Integer.valueOf(view.getTop()), Integer.valueOf(view.getLeft())));
        jSONObject.putOpt(A01(149, 4, 5), String.format(Locale.US, A01(193, 12, 34), Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())));
        if (this.A08 != null && this.A08.contains(view)) {
            z10 = true;
        }
        jSONObject.putOpt(A01(40, 9, 103), Boolean.valueOf(z10));
        String strA01 = A01(173, 7, 83);
        if (view instanceof Button) {
            strA01 = A01(29, 6, 7);
        } else if (view instanceof TextView) {
            strA01 = A01(161, 4, 91);
        } else if (view instanceof ImageView) {
            strA01 = A01(62, 5, 5);
        } else {
            boolean z11 = view instanceof MediaView;
            if (A0H[5].charAt(12) != 'y') {
                throw new RuntimeException();
            }
            A0H[4] = "bylXNVHmRehwPu5eFX29358jXG6bP6wL";
            if (z11) {
                strA01 = A01(71, 9, 44);
            } else if (view instanceof ViewGroup) {
                strA01 = A01(184, 9, 104);
            }
        }
        jSONObject.putOpt(A01(165, 4, 101), strA01);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            JSONArray list = new JSONArray();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                JSONObject data = A04(viewGroup.getChildAt(i10));
                list.put(data);
            }
            jSONObject.putOpt(A01(67, 4, 8), list);
        }
        return jSONObject;
    }

    private void A06(Map<String, String> map) {
        if (this.A07 != null && this.A07.get() != null) {
            C2097fx c2097fx = this.A07.get();
            if (c2097fx.A04()) {
                map.put(A01(14, 5, 86), Boolean.TRUE.toString());
            }
            if (c2097fx.A05()) {
                String string = Boolean.TRUE.toString();
                if (A0H[2].charAt(5) == '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[3] = "GeaOzgSwE0B4RbQuyOnyR54BUk9OPQWk";
                strArr[7] = "6p8n9jXNaDOiZOly6vqLiSGdWpkNyQr0";
                map.put(A01(19, 5, 84), string);
            }
            if (c2097fx.A06()) {
                map.put(A01(24, 5, 12), Boolean.TRUE.toString());
            }
        }
    }

    private void A07(Map<String, String> map) {
        if (this.A02 != null && (this.A02.getNativeAdLayoutApi() instanceof C2080fg)) {
            C2080fg c2080fg = (C2080fg) this.A02.getNativeAdLayoutApi();
            if (c2080fg.A05()) {
                map.put(A01(87, 7, 108), Boolean.TRUE.toString());
            }
            boolean zA04 = c2080fg.A04();
            if (A0H[2].charAt(5) == '8') {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[6] = "xEcLApnGSHOQdN2Hz4ZghwgYHUh65NKO";
            strArr[1] = "p79k2dIgP5w5SbVKwTjPD6VDhwKg5iET";
            if (zA04) {
                map.put(A01(80, 7, 46), Boolean.TRUE.toString());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A08(Map<String, String> map) {
        if (this.A0F == null) {
            return;
        }
        if (this.A05 != null) {
            map.put(A01(126, 3, 69), String.valueOf(this.A05.A05()));
        }
        if (this.A09) {
            map.put(A01(112, 3, 87), Boolean.TRUE.toString());
        }
        if (this.A0D) {
            map.put(A01(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 3, 99), Boolean.TRUE.toString());
        }
        if (this.A0A) {
            map.put(A01(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 5, 83), Boolean.TRUE.toString());
        }
        if (this.A00 != null && this.A0F.A0T()) {
            String strA02 = A02(this.A00);
            String strA01 = A01(180, 4, 18);
            if (A0H[5].charAt(12) != 'y') {
                throw new RuntimeException();
            }
            A0H[0] = "0nsTrvyBVFn5JiHcx4XaPHfYKfpd5PBN";
            map.put(strA01, strA02);
        }
        if (this.A00 != null && this.A0F.A0U()) {
            map.put(A01(153, 8, 30), A03(this.A00));
        }
        if (this.A0C) {
            map.put(A01(115, 3, 87), Boolean.TRUE.toString());
        }
        if (this.A03 != null) {
            map.put(A01(135, 14, 60), this.A03.toString());
        }
        if (this.A0B) {
            map.put(A01(169, 4, 33), Boolean.TRUE.toString());
        }
        if (this.A01 != null) {
            map.put(A01(98, 4, 80), String.valueOf((int) (this.A01.getWidth() / AbstractC1640Wl.A02)));
            map.put(A01(94, 4, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), String.valueOf((int) (this.A01.getHeight() / AbstractC1640Wl.A02)));
        }
        if (this.A04 != null) {
            map.put(A01(102, 5, 54), this.A04.toString());
        }
        if (this.A06 != null) {
            map.put(A01(49, 11, 30), this.A06);
        }
        if (this.A0E) {
            map.put(A01(107, 5, 127), Boolean.TRUE.toString());
        }
        A07(map);
        A06(map);
        this.A0F.A0O(map);
    }

    public final void A09(View view) {
        this.A01 = view;
    }

    public final void A0A(View view) {
        this.A00 = view;
    }

    public final void A0B(NativeAdLayout nativeAdLayout) {
        this.A02 = nativeAdLayout;
    }

    public final void A0C(EnumC1379Mc enumC1379Mc) {
        this.A03 = enumC1379Mc;
    }

    public final void A0D(EnumC1380Md enumC1380Md) {
        this.A04 = enumC1380Md;
    }

    public final void A0E(EnumC1598Us enumC1598Us) {
        this.A05 = enumC1598Us;
    }

    public final void A0F(String str) {
        this.A06 = str;
    }

    public final void A0G(WeakReference<C2097fx> weakReference) {
        this.A07 = weakReference;
    }

    public final void A0H(List<View> clickableViews) {
        this.A08 = clickableViews;
    }

    public final void A0I(boolean z10) {
        this.A09 = z10;
    }

    public final void A0J(boolean z10) {
        this.A0A = z10;
    }

    public final void A0K(boolean z10) {
        this.A0B = z10;
    }

    public final void A0L(boolean z10) {
        this.A0C = z10;
    }

    public final void A0M(boolean z10) {
        this.A0D = z10;
    }

    public final void A0N(boolean z10) {
        this.A0E = z10;
    }
}
