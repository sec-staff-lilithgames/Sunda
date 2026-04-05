package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.RewardData;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1390Mo implements Serializable {
    public static String A0y = null;
    public static byte[] A0z = null;
    public static final long serialVersionUID = -8352540727250859603L;
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public RewardData A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public final int A0x;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0z, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0z = new byte[]{92, 115, 126, 118, 114, Utf8.REPLACEMENT_BYTE, 102, 112, 106, 109, Utf8.REPLACEMENT_BYTE, 121, 109, 122, 122, Utf8.REPLACEMENT_BYTE, 109, 122, 104, 126, 109, 123, 62, Utf8.REPLACEMENT_BYTE, 85, 106, 108, 107, Utf8.REPLACEMENT_BYTE, 118, 113, 108, 107, 126, 115, 115, Utf8.REPLACEMENT_BYTE, 58, 108, Utf8.REPLACEMENT_BYTE, 107, 112, Utf8.REPLACEMENT_BYTE, 108, 116, 118, 111, Utf8.REPLACEMENT_BYTE, 107, 119, 122, Utf8.REPLACEMENT_BYTE, 126, 123, 36, 6, 23, 67, 26, 12, 22, 17, 67, 17, 6, 20, 2, 17, 7, 102, 65, 92, 91, 78, 67, 67, 15, 78, 95, 95, 15, 78, 65, 75, 15, 92, 68, 70, 95, 15, 91, 71, 74, 15, 78, 75, 1, 10, 45, 48, 55, 34, 47, 47, 99, 55, 43, 38, 99, 34, 51, 51, 5, 34, Utf8.REPLACEMENT_BYTE, 56, 45, 32, 32, 108, 56, 35, 108, Utf8.REPLACEMENT_BYTE, 39, 37, 60, 108, 56, 36, 41, 108, 45, 40, 105, 84, 6, 81, 71, 82, 69, 78, 6, 64, 83, 74, 74, 6, 3, 85, 11, 85, 67, 69, 73, 72, 66, 6, 71, 66, 4, 57, 107, 60, 42, Utf8.REPLACEMENT_BYTE, 40, 35, 107, Utf8.REPLACEMENT_BYTE, 35, 46, 107, 45, 62, 39, 39, 107, 42, 47, 81, 102, 116, 98, 113, 103, 35, 100, 113, 98, 109, 119, 102, 103, 34, 91, 99, 97, 120, 40, 124, 96, 109, 40, 105, 108, 40, 106, 113, 40, 108, 103, AbstractJsonLexerKt.TC_INVALID, 102, 100, 103, 105, 108, 97, 102, 111, 40, 124, 96, 109, 40, 105, 120, 120, 40, 105, 102, 108, 40, 97, 102, 123, 124, 105, 102, 124, 100, 113, 40, 111, 109, 124, 40, 113, 103, 125, 122, 40, 122, 109, AbstractJsonLexerKt.TC_INVALID, 105, 122, 108, 41, 120, 68, 77, 66, 71, 12, 85, 67, 89, 12, 74, 67, 94, 12, 69, 66, 95, 88, 77, 64, 64, 69, 66, 75, 12, 9, 95, 51, 5, 10, 16, 68, 16, 11, 68, 23, 15, 13, 20, 68, 16, 12, 1, 68, 5, 0, 68, 66, 68, 7, 8, 5, 13, 9, 68, 29, 11, 17, 22, 68, 2, 22, 1, 1, 68, 22, 1, 19, 5, 22, 0, 91, 68, 46, 17, 23, 16, 68, 13, 10, 23, 16, 5, 8, 8, 68, 65, 23, 68, 10, 11, 19, 59, 13, 23, 16, 66, 16, 7, 21, 3, 16, 6, 66, 11, 17, 66, 16, 7, 3, 6, 27, 66, 22, 13, 66, 0, 7, 66, 23, 17, 7, 6, 67, 40, 45, 39, 62, 22, 42, 33, 40, 32, 39, 44, 45, 22, 40, 45, 58, 22, Utf8.REPLACEMENT_BYTE, 123, 22, 45, 44, 58, 32, 46, 39, 108, 105, 99, 122, 82, 120, 126, 104, 82, 100, 96, 108, 106, 104, 82, 123, Utf8.REPLACEMENT_BYTE, 82, AbstractJsonLexerKt.TC_INVALID, 104, 105, 104, 126, 100, 106, 99, 49, 52, 62, 39, 15, 37, 35, 53, 15, 38, 57, 52, 53, Utf8.REPLACEMENT_BYTE, 15, 38, 57, 53, 39, 15, 38, 98, 15, 34, 53, 52, 53, 35, 57, 55, 62, 41, 44, 38, Utf8.REPLACEMENT_BYTE, 23, Utf8.REPLACEMENT_BYTE, 41, 60, 43, 32, 23, 41, 38, 44, 23, 42, 58, 39, Utf8.REPLACEMENT_BYTE, 59, 45, 23, 62, 122, 23, 44, 45, 59, 33, 47, 38, 114, 112, 114, 78, 119, 120, 125, 101, 116, 99, 78, 114, 125, 120, 114, 122, 98, 78, 126, AbstractJsonLexerKt.TC_INVALID, 78, 114, 101, 112, 78, 116, AbstractJsonLexerKt.TC_INVALID, 112, 115, 125, 116, 117, 21, 23, 27, 6, 23, 31, 17, 24, 31, 18, 75, 1, 19, 20, 41, 23, 3, 2, 25, 41, 4, 19, 18, 31, 4, 19, 21, 2, 86, 23, 21, 2, 31, 25, 24, 75, 23, 24, 18, 4, 25, 31, 18, 88, 31, 24, 2, 19, 24, 2, 88, 23, 21, 2, 31, 25, 24, 88, 32, Utf8.REPLACEMENT_BYTE, 51, 33, 86, 6, 23, 21, 29, 23, 17, 19, 75, 21, 25, 27, 88, 23, 24, 18, 4, 25, 31, 18, 88, 0, 19, 24, 18, 31, 24, 17, 86, 31, 24, 2, 19, 24, 2, 76, 89, 89, 6, 26, 23, 15, 88, 17, 25, 25, 17, 26, 19, 88, 21, 25, 27, 89, 5, 2, 25, 4, 19, 105, 107, 120, 101, AbstractJsonLexerKt.TC_INVALID, 121, 111, 102, 88, 83, 90, 82, 85, 100, 75, 90, 73, 90, 86, 72, 106, 101, 96, 106, 98, 86, 109, 108, 101, 104, 112, 86, 101, 102, 110, 110, 96, 103, 110, 86, 100, 122, 104, 103, 98, 104, 96, 84, 98, 106, 105, 84, 109, 98, 103, AbstractJsonLexerKt.TC_INVALID, 110, 121, 98, 101, 108, 84, 110, 101, 106, 105, 103, 110, 111, 102, 106, 104, 43, 99, 100, 102, 96, 103, 106, 106, 110, 43, 100, 97, 118, 43, 108, 107, 113, 96, 119, 118, 113, 108, 113, 108, 100, 105, 43, 102, 105, 108, 102, 110, 96, 97, 0, 17, 6, 2, 23, 10, 21, 6, 60, 2, 16, 60, 0, 23, 2, 60, 6, 13, 2, 1, 15, 6, 7, 15, 30, 9, 13, 24, 5, 26, 9, 51, 13, 31, 51, 15, 24, 13, 51, 9, 2, 13, 14, 0, 9, 8, 51, 2, 13, 24, 5, 26, 9, 51, 14, 13, 2, 2, 9, 30, 24, 15, 26, 36, 24, 23, 18, 24, 16, 36, 31, 30, 23, 26, 2, 36, 23, 20, 28, 28, 18, 21, 28, 36, 22, 8, 108, 123, 100, 87, 96, 97, 108, 109, 87, 102, 105, 126, 97, 111, 105, 124, 97, 103, 102, 87, 109, 102, 105, 106, 100, 109, 108, 48, 39, 56, 11, 60, 39, 11, 49, 58, 53, 54, 56, 49, 48, 5, 18, 13, 62, 9, 24, 3, 19, 8, 5, 62, 4, 15, 0, 3, 13, 4, 5, 53, 40, Utf8.REPLACEMENT_BYTE, 48, 60, 56, 50, 14, 34, 53, 58, 14, 61, 48, 40, 52, 35, 14, 57, 37, 60, 61, 14, 36, 35, 61, 58, 49, 60, 45, 38, 47, 43, 58, 59, 0, 60, 47, 50, 72, 64, 64, 72, 67, 74, 112, 95, 67, 78, 86, 112, 71, 64, 92, 91, 112, 92, 91, 93, 70, 65, 72, 57, 56, 53, 52, 14, 50, 62, 36, Utf8.REPLACEMENT_BYTE, 37, 53, 62, 38, Utf8.REPLACEMENT_BYTE, 14, 52, Utf8.REPLACEMENT_BYTE, 48, 51, 61, 52, 53, 100, 101, 104, 105, 83, 124, 126, 99, 107, 126, 105, AbstractJsonLexerKt.TC_INVALID, AbstractJsonLexerKt.TC_INVALID, 83, 
        110, 109, 126, 83, 105, 98, 109, 110, 96, 105, 104, 50, 53, 40, 47, 58, 55, 55, 4, 58, 53, Utf8.REPLACEMENT_BYTE, 4, 60, 62, 47, 4, 41, 62, 44, 58, 41, Utf8.REPLACEMENT_BYTE, 4, Utf8.REPLACEMENT_BYTE, 62, 40, 56, 41, 50, 43, 47, 50, 52, 53, 114, 117, 104, 111, 122, 119, 119, 68, 122, 117, AbstractJsonLexerKt.TC_INVALID, 68, 124, 126, 111, 68, 105, 126, 108, 122, 105, AbstractJsonLexerKt.TC_INVALID, 68, 126, 117, 122, 121, 119, 126, AbstractJsonLexerKt.TC_INVALID, 95, 88, 66, 83, 68, 85, 83, 70, 66, 105, 65, 83, 84, 105, 95, 88, 69, 66, 87, 90, 90, 105, 84, 67, 66, 66, 89, 88, 39, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, 1, 24, 52, 28, 14, 9, 52, 2, 5, 24, 31, 10, 7, 7, 52, 9, 30, 31, 31, 4, 5, AbstractJsonLexerKt.TC_INVALID, 124, 112, 120, 76, 100, 114, 103, 112, 123, 76, 114, 125, 119, 76, 113, 97, 124, 100, 96, 118, 76, 118, 125, 114, 113, AbstractJsonLexerKt.TC_INVALID, 118, 119, 75, 67, 66, 79, 71, 121, 71, 85, 86, 67, 69, 82, 121, 84, 71, 82, 79, 73, 104, 103, 114, 111, 112, 99, 84, 72, 69, 93, 10, 67, 75, 75, 67, 72, 65, 10, 71, 75, 73, 28, 30, 9, 51, 30, 9, 27, 13, 30, 8, 51, 15, 24, 13, 51, 14, 25, 24, 24, 3, 2, 51, 24, 9, 20, 24, 113, 115, 100, 94, 115, 100, 118, 96, 115, 101, 94, 101, 100, 114, 98, 115, 104, 113, 117, 104, 110, 111, 61, Utf8.REPLACEMENT_BYTE, 40, 18, Utf8.REPLACEMENT_BYTE, 40, 58, 44, Utf8.REPLACEMENT_BYTE, 41, 18, 40, 35, 44, 47, 33, 40, 41, 24, 26, 13, 55, 26, 13, 31, 9, 26, 12, 55, 28, 1, 28, 4, 13, 68, 70, 81, 107, 70, 81, 67, 85, 70, 80, 107, 67, 85, 64, 87, 92, 107, 85, 80, 107, 86, 65, 64, 64, 91, 90, 107, 64, 81, 76, 64, 9, 24, 36, 13, 73, 36, 30, 3, 11, 30, 9, 18, 30, 21, 24, 30, 36, 26, 36, 30, 21, 26, 25, 23, 30, 31, 81, 64, 124, 85, 17, 124, 70, 91, 83, 70, 81, 74, 70, 77, 64, 70, 124, 65, 124, 70, 77, 66, 65, 79, 70, 71, 13, 28, 32, 9, 77, 32, 22, 17, 12, 11, 30, 19, 19, 32, 11, 16, 32, 12, 20, 22, 15, 95, 78, 114, 91, 31, 114, 95, 72, 90, 76, 95, 73, 114, 78, 65, 76, 68, 64, 114, 73, 72, 94, 78, 95, 68, 93, 89, 68, 66, 67, 84, 69, 121, 80, 20, 121, 81, 71, 82, 69, 78, 121, 64, 83, 74, 74, 121, 71, 66, 66, 85, 64, 92, 81, 73, 111, 71, 88, 85, 94, 111, 67, 91, 89, 64, 111, 68, 89, 93, 85, 111, 85, 72, 83, 85, 85, 84, 67, 111, 70, 89, 84, 85, 95, 111, 84, 69, 66, 81, 68, 89, 95, 94, 111, 85, 94, 81, 82, 92, 85, 84, 59, 44, 56, 60, 44, 58, 61, 22, 32, 45, 110, 121, 107, 125, 110, 120, 67, 123, 110, 125, 114, 104, 121, 120, 67, 104, 121, 100, 104, 115, 100, 118, 96, 115, 101, 94, 102, 115, 96, 111, 117, 100, 101, 94, 119, 51, 94, 117, 100, 121, 117, Utf8.REPLACEMENT_BYTE, 40, 58, 44, Utf8.REPLACEMENT_BYTE, 41, 18, 36, 35, 43, 34, 18, 57, 40, 53, 57, 74, 93, 79, 89, 74, 92, 93, 92, 103, 78, 81, 92, 93, 87, 114, 117, 115, 104, 111, 102, 94, 117, 110, 94, 98, 105, 100, 98, 106, 94, 102, 110, 110, 102, 109, 100, 94, 113, 109, 96, 120, 94, 96, 116, 117, 110, 94, 115, 100, 101, 104, 115, 100, 98, 117, 89, 70, 75, 74, 64, 112, 76, 67, 70, 76, 68, 78, 77, 67, 74, 11, 20, 24, 10, 28, 31, 20, 17, 20, 9, 4, 34, 30, 21, 24, 30, 22, 34, 20, 19, 20, 9, 20, 28, 17, 34, 25, 24, 17, 28, 4, 4, 27, 23, 5, 19, 16, 27, 30, 27, 6, 11, 45, 17, 26, 23, 17, 25, 45, 27, 28, 6, 23, 0, 4, 19, 30, 58, 44, 57, 46, 37, 18, 44, 35, 41, 18, 47, Utf8.REPLACEMENT_BYTE, 34, 58, 62, 40, 18, 44, 35, 41, Utf8.REPLACEMENT_BYTE, 34, 36, 41, 18, 59, AbstractJsonLexerKt.TC_INVALID, 18, 56, 36, 41, Utf8.REPLACEMENT_BYTE, 42, 61, 54, 1, Utf8.REPLACEMENT_BYTE, 48, 58, 1, 60, 44, 49, 41, 45, 59, 1, 61, 49, 43, 48, 42, 58, 49, 41, 48, 1, 41, 54, 59, 48, 1, 55, Utf8.REPLACEMENT_BYTE, 60, 1, 49, 46, 59, 48, 4, 18, 7, 16, 27, 44, 18, 29, 23, 44, 26, 29, 0, 7, 18, 31, 31, 44, 16, 7, 18, 44, 17, 6, 7, 7, 28, 29, 44, 22, 29, 18, 17, 31, 22, 23, 107, 125, 104, AbstractJsonLexerKt.TC_INVALID, 116, 67, 125, 114, 120, 67, 117, 114, 111, 104, 125, 112, 112, 67, 121, 114, 125, 126, 112, 121, 120, 64, 86, 67, 84, 95, 104, 86, 89, 83, 104, 94, 89, 68, 67, 86, 91, 91, 104, 81, 69, 88, 90, 104, 68, 67, 86, 69, 67, 104, 83, 82, 91, 86, 78, 11, 29, 8, 31, 20, 35, 29, 18, 24, 35, 21, 18, 15, 8, 29, 16, 16, 35, 19, 18, 35, 21, 18, 15, 8, 29, 18, 8, 35, 27, 29, 17, 25, 15, 35, 25, 18, 29, 30, 16, 25, 24};
    }

    public abstract int A0l();

    public abstract int A0m();

    public AbstractC1390Mo() {
        String strA04 = A04(0, 0, 51);
        this.A0F = strA04;
        this.A02 = 200;
        this.A0D = strA04;
        this.A0M = strA04;
        this.A0L = strA04;
        this.A0N = strA04;
        this.A0J = strA04;
        this.A0I = strA04;
        this.A0H = strA04;
        this.A0K = strA04;
        this.A0G = strA04;
        this.A0P = strA04;
        this.A0Q = strA04;
        this.A0k = false;
        this.A0T = false;
        this.A0m = false;
        this.A0g = false;
        this.A0o = false;
        this.A0c = false;
        this.A0E = strA04;
        this.A0C = A04(1189, 15, 12);
        this.A0S = strA04;
    }

    public static AbstractC1390Mo A03(JSONObject jSONObject, C1937dL c1937dL) {
        boolean zHas = jSONObject.has(A04(659, 12, 19));
        boolean z10 = false;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A04(651, 8, 34));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            z10 = true;
        }
        AbstractC1390Mo abstractC1390MoA00 = null;
        if (zHas) {
            try {
                abstractC1390MoA00 = C2210hw.A00(jSONObject, c1937dL);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (abstractC1390MoA00 == null) {
            zHas = false;
            abstractC1390MoA00 = AnonymousClass73.A00(jSONObject, c1937dL);
        }
        abstractC1390MoA00.A1L(zHas);
        abstractC1390MoA00.A0Z(z10);
        return abstractC1390MoA00;
    }

    private void A06(double d10) {
        this.A00 = d10;
    }

    private void A07(int i10) {
        this.A03 = i10;
    }

    private final void A08(long j10) {
        this.A04 = j10;
    }

    private final void A09(long j10) {
        this.A05 = j10;
    }

    private void A0A(String str) {
        this.A08 = str;
    }

    private void A0B(String str) {
        this.A09 = str;
    }

    private void A0C(String str) {
        this.A0O = str;
    }

    private final void A0D(String str) {
        this.A0D = str;
    }

    private final void A0E(String str) {
        this.A0G = str;
    }

    private final void A0F(String str) {
        this.A0H = str;
    }

    private final void A0G(String str) {
        this.A0I = str;
    }

    private final void A0H(String str) {
        this.A0J = str;
    }

    private final void A0I(String str) {
        this.A0K = str;
    }

    private final void A0J(String str) {
        this.A0L = str;
    }

    private final void A0K(String str) {
        this.A0M = str;
    }

    private final void A0L(String str) {
        this.A0N = str;
    }

    private final void A0M(String str) {
        this.A0P = str;
    }

    private final void A0N(String str) {
        this.A0Q = str;
    }

    private void A0O(JSONObject jSONObject) {
        this.A0F = jSONObject.toString();
    }

    private void A0P(JSONObject jSONObject) {
        if (!A1i()) {
            return;
        }
        boolean zA1g = A1g();
        String strA04 = A04(1390, 30, 5);
        if (zA1g) {
            A0K(jSONObject.optString(strA04, A04(MBSupportMuteAdType.INTERSTITIAL_VIDEO, 65, 76)));
        } else {
            A0K(jSONObject.optString(strA04, A04(0, 54, 55)));
        }
        A0J(jSONObject.optString(A04(1369, 21, 87), A04(112, 22, 100)));
        A0L(jSONObject.optString(A04(1420, 19, 14), A04(134, 26, 14)));
    }

    private final void A0Q(boolean z10) {
        this.A0Z = z10;
    }

    private final void A0R(boolean z10) {
        this.A0c = z10;
    }

    private final void A0S(boolean z10) {
        this.A0d = z10;
    }

    private final void A0T(boolean z10) {
        this.A0e = z10;
    }

    private final void A0U(boolean z10) {
        this.A0f = z10;
    }

    private final void A0V(boolean z10) {
        this.A0X = z10;
    }

    private final void A0W(boolean z10) {
        this.A0Y = z10;
    }

    private final void A0X(boolean z10) {
        this.A0g = z10;
    }

    private final void A0Y(boolean z10) {
        this.A0h = z10;
    }

    private final void A0Z(boolean z10) {
        this.A0a = z10;
    }

    private final void A0a(boolean z10) {
        this.A0t = z10;
    }

    private final void A0b(boolean z10) {
        this.A0u = z10;
    }

    private final void A0c(boolean z10) {
        this.A0v = z10;
    }

    private final void A0d(boolean z10) {
        this.A0w = z10;
    }

    private final void A0e(boolean z10) {
        this.A0l = z10;
    }

    private final void A0f(boolean z10) {
        this.A0m = z10;
    }

    private final void A0g(boolean z10) {
        this.A0o = z10;
    }

    public final double A0h() {
        return this.A00;
    }

    public final int A0i() {
        return this.A03;
    }

    public final int A0j() {
        return this.A0x;
    }

    public final int A0k() {
        return this.A01;
    }

    public final long A0n() {
        return this.A05;
    }

    public final long A0o() {
        return this.A06;
    }

    public final RewardData A0p() {
        return this.A07;
    }

    public final String A0q() {
        return A0y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0r() {
        /*
            r4 = this;
            java.lang.String r3 = r4.A0B
            int r0 = r3.hashCode()
            switch(r0) {
                case -1364000502: goto L39;
                case -1052618729: goto L28;
                case 604727084: goto L16;
                default: goto L9;
            }
        L9:
            r0 = -1
        La:
            switch(r0) {
                case 0: goto L59;
                case 1: goto L52;
                case 2: goto L4b;
                default: goto Ld;
            }
        Ld:
            r2 = 0
            r1 = 0
            r0 = 51
            java.lang.String r0 = A04(r2, r1, r0)
            return r0
        L16:
            r2 = 1103(0x44f, float:1.546E-42)
            r1 = 12
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            goto La
        L28:
            r2 = 1183(0x49f, float:1.658E-42)
            r1 = 6
            r0 = 46
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2
            goto La
        L39:
            r2 = 1558(0x616, float:2.183E-42)
            r1 = 14
            r0 = 16
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L4b:
            com.facebook.ads.redexgen.X.dg r0 = com.facebook.ads.redexgen.core.EnumC1958dg.A03
            java.lang.String r0 = r0.A03()
            return r0
        L52:
            com.facebook.ads.redexgen.X.dh r0 = com.facebook.ads.redexgen.core.EnumC1959dh.A04
            java.lang.String r0 = r0.A03()
            return r0
        L59:
            r2 = 720(0x2d0, float:1.009E-42)
            r1 = 37
            r0 = 45
            java.lang.String r0 = A04(r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1390Mo.A0r():java.lang.String");
    }

    public final String A0s() {
        return this.A08;
    }

    public final String A0t() {
        return this.A09;
    }

    public final String A0u() {
        return this.A0A;
    }

    public final String A0v() {
        return this.A0B;
    }

    public final String A0w() {
        return this.A0C;
    }

    public final String A0x() {
        return this.A0D;
    }

    public final String A0y() {
        return this.A0E;
    }

    public final String A0z() {
        return this.A0G;
    }

    public final String A10() {
        return this.A0H;
    }

    public final String A11() {
        return this.A0I;
    }

    public final String A12() {
        return this.A0J;
    }

    public final String A13() {
        return this.A0K;
    }

    public final String A14() {
        return this.A0L;
    }

    public final String A15() {
        return this.A0M;
    }

    public final String A16() {
        return this.A0N;
    }

    public final String A17() {
        return this.A0O;
    }

    public final String A18() {
        return this.A0P;
    }

    public final String A19() {
        return this.A0Q;
    }

    public final String A1A() {
        return this.A0R;
    }

    public final String A1B() {
        return this.A0S;
    }

    public final JSONObject A1C() {
        try {
            return new JSONObject(this.A0F);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A1D(int i10) {
        this.A02 = i10;
    }

    public final void A1E(long j10) {
        this.A06 = j10;
    }

    public final void A1F(RewardData rewardData) {
        this.A07 = rewardData;
    }

    public final void A1G(String str) {
        A0y = str;
    }

    public final void A1H(String str) {
        this.A0A = str;
    }

    public final void A1I(String str) {
        this.A0B = str;
    }

    public final void A1J(String str) {
        this.A0R = str;
    }

    public final void A1K(JSONObject jSONObject) {
        String strA04 = A04(1491, 10, 97);
        String strA042 = A04(0, 0, 51);
        A0C(jSONObject.optString(strA04, strA042));
        A0B(jSONObject.optString(A04(928, 13, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)));
        A0O(jSONObject);
        A07(jSONObject.optInt(A04(1628, 31, 85), 0));
        A1D(jSONObject.optInt(A04(1659, 26, 90), 1000));
        A0A(jSONObject.optString(A04(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE, 26, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), strA042));
        A0T(jSONObject.optBoolean(A04(757, 23, 75), false));
        A0U(jSONObject.optBoolean(A04(780, 37, 68), false));
        A0Q(jSONObject.optBoolean(A04(498, 32, 57), false));
        A0S(jSONObject.optBoolean(A04(693, 27, 35), false));
        A0d(jSONObject.optBoolean(A04(1439, 52, 24), false));
        A0Y(jSONObject.optBoolean(A04(IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES, 30, 51), false));
        A0D(jSONObject.optString(A04(1011, 34, 115), A04(195, 65, 32)));
        A0a(jSONObject.optBoolean(A04(1252, 18, 101), false));
        A0b(jSONObject.optBoolean(A04(1317, 26, 83), false));
        A0c(jSONObject.optBoolean(A04(1343, 26, 11), false));
        A0P(jSONObject);
        A0W(jSONObject.optBoolean(A04(986, 25, 36), false));
        A0V(jSONObject.optBoolean(A04(964, 22, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), false));
        A0H(jSONObject.optString(A04(1270, 16, 64), A04(54, 15, 75)));
        A0f(jSONObject.optBoolean(A04(436, 31, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL), false));
        A0X(jSONObject.optBoolean(A04(410, 26, 37), false));
        A0g(jSONObject.optBoolean(A04(467, 31, 96), false));
        A0R(jSONObject.optBoolean(A04(384, 26, 97), false));
        A0e(jSONObject.optBoolean(A04(1613, 15, 7), false));
        A0F(jSONObject.optString(A04(1204, 26, 68), A04(97, 15, 107)));
        A0I(jSONObject.optString(A04(1286, 31, 28), A04(160, 20, 99)));
        A0G(jSONObject.optString(A04(1230, 22, 41), A04(69, 28, 7)));
        A0E(jSONObject.optString(A04(1501, 19, 52), A04(352, 32, 74)));
        A0M(jSONObject.optString(A04(1520, 22, 41), A04(180, 15, 43)));
        A0N(jSONObject.optString(A04(1542, 16, 101), A04(260, 27, 4)));
        this.A0V = jSONObject.optBoolean(A04(870, 14, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        this.A0W = jSONObject.optBoolean(A04(884, 18, 73));
        this.A0U = jSONObject.optBoolean(A04(843, 27, 32), true);
        this.A0r = jSONObject.optBoolean(A04(1791, 25, 52), false);
        this.A01 = jSONObject.optInt(A04(1816, 34, 31), -1);
        this.A0s = jSONObject.optBoolean(A04(1850, 42, 84), false);
        this.A0q = jSONObject.optBoolean(A04(1755, 36, 91), false);
        this.A0i = jSONObject.optBoolean(A04(1075, 28, 30), false);
        this.A0E = jSONObject.optString(A04(1115, 21, 67), strA042);
        A09(jSONObject.optLong(A04(671, 22, 33), -1L));
        A08(jSONObject.optLong(A04(817, 26, 83), -1L));
        A06(jSONObject.optDouble(A04(1165, 18, 14), 1.0d));
        if (TextUtils.isEmpty(this.A0E)) {
            this.A0E = C1760aT.A00();
        }
        this.A0S = jSONObject.optString(A04(1572, 41, 41), A04(IronSourceError.ERROR_AD_UNIT_CAPPED, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 94));
        this.A0C = jSONObject.optString(A04(941, 23, 7), A04(1189, 15, 12));
        this.A0j = jSONObject.optBoolean(A04(1136, 29, 59), false);
        this.A0p = jSONObject.optBoolean(A04(1685, 30, 101), false);
        this.A0n = jSONObject.optBoolean(A04(1715, 40, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), false);
    }

    public final void A1L(boolean z10) {
        this.A0b = z10;
    }

    public final void A1M(boolean z10) {
        this.A0k = z10;
    }

    public final void A1N(boolean z10) {
        this.A0T = z10;
    }

    public final boolean A1O() {
        return this.A0V;
    }

    public final boolean A1P() {
        return this.A0W;
    }

    public final boolean A1Q() {
        return this.A0U;
    }

    public final boolean A1R() {
        return this.A0Z;
    }

    public final boolean A1S() {
        return this.A0a;
    }

    public final boolean A1T() {
        return this.A0b;
    }

    public final boolean A1U() {
        return this.A0c;
    }

    public final boolean A1V() {
        return this.A0d;
    }

    public final boolean A1W() {
        return this.A0e;
    }

    public final boolean A1X() {
        return this.A0f;
    }

    public final boolean A1Y() {
        return !TextUtils.isEmpty(A0s());
    }

    public final boolean A1Z() {
        return this.A0X;
    }

    public final boolean A1a() {
        return this.A0Y;
    }

    public final boolean A1b() {
        return this.A0g;
    }

    public final boolean A1c() {
        return this.A0h;
    }

    public final boolean A1d() {
        return this.A0i;
    }

    public final boolean A1e() {
        return this.A0j;
    }

    public final boolean A1f() {
        return this.A0t;
    }

    public final boolean A1g() {
        return this.A0u;
    }

    public final boolean A1h() {
        return this.A0v;
    }

    public final boolean A1i() {
        return A1f() && (A1g() || A1h());
    }

    public final boolean A1j() {
        return this.A0k;
    }

    public final boolean A1k() {
        return this.A0w;
    }

    public final boolean A1l() {
        return this.A0T;
    }

    public final boolean A1m() {
        return this.A0m;
    }

    public final boolean A1n() {
        return this.A0n;
    }

    public final boolean A1o() {
        return this.A0o;
    }

    public final boolean A1p() {
        return this.A0p;
    }

    public final boolean A1q() {
        return this.A0q;
    }

    public final boolean A1r() {
        return this.A0r;
    }

    public final boolean A1s() {
        return this.A0s;
    }
}
