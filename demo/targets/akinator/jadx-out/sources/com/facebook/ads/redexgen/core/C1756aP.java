package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1756aP extends AbstractRunnableC1624Vt {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ SQ A01;
    public final /* synthetic */ InterfaceC1543So A02;
    public final /* synthetic */ C1551Sw A03;
    public final /* synthetic */ String A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -97, -64, -67, -48, -62, 123, -66, -51, -68, -50, -61, 123, -67, -64, -66, -68, -48, -50, -64, 123, -50, -96, -55, -47, -60, -51, -54, -55, -56, -64, -55, -49, -97, -68, -49, -68, -85, -51, -54, -47, -60, -65, -64, -51, 123, -55, -54, -49, 123, -60, -55, -59, -64, -66, -49, -64, -65, 113, -121, -116, -119, 62, -121, -111, 62, -116, -109, -118, -118, Utf8.REPLACEMENT_BYTE, -109, -106, -106, -101, -90, -101, -95, -96, -109, -98, -111, -101, -96, -104, -95, 116, -119, 116, 124, AbstractJsonLexerKt.TC_INVALID, 116, 117, AbstractJsonLexerKt.TC_INVALID, 120, 114, 119, 124, -122, 126, 114, -122, -125, 116, 118, 120, -26, -28, -26, -21, -24, -106, -119, -121, -109, -106, -120, -125, -120, -123, -104, -123, -122, -123, -105, -119, -59, -72, -60, -56, -72, -58, -57, -78, -68, -73, -115, -113, 124, -114, -109, -118, AbstractJsonLexerKt.TC_INVALID, -104, -102, -121, -103, -98, -107, -118, -124, -120, -108, -119, -118};
    }

    public C1756aP(SQ sq2, String str, int i10, C1551Sw c1551Sw, InterfaceC1543So interfaceC1543So) {
        this.A01 = sq2;
        this.A04 = str;
        this.A00 = i10;
        this.A03 = c1551Sw;
        this.A02 = interfaceC1543So;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        String strA03;
        Map<String, String> mapA5S;
        String strA8D;
        try {
            if (C1544Sp.A0K(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C1583Ud.A08(this.A01, UV.A0A.toString() + A00(0, 1, 50) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                strA03 = X7.A03(this.A01, cause);
            } else if (U9.A0R(this.A01)) {
                SQ sq2 = this.A01;
                Throwable deLogExceptionCause = this.A03;
                strA03 = X7.A03(sq2, deLogExceptionCause);
            } else {
                strA03 = A00(0, 0, 81) + this.A03.getMessage();
            }
            if (U9.A0V(this.A01)) {
                mapA5S = this.A01.A04().A5S();
            } else if (this.A02 != null) {
                mapA5S = this.A02.A7r();
            } else if (C1544Sp.A02) {
                C1544Sp.A0F(new RuntimeException(A00(1, 57, 84), this.A03));
                mapA5S = new HashMap<>();
            } else {
                mapA5S = this.A01.A04().A5S();
            }
            mapA5S.put(A00(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 7, 19), this.A04);
            mapA5S.put(A00(143, 12, 30), String.valueOf(this.A00));
            JSONObject jSONObjectA03 = this.A03.A03();
            if (jSONObjectA03 != null) {
                mapA5S.put(A00(71, 15, 43), jSONObjectA03.toString());
            }
            if ((A00(106, 5, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).equals(this.A04) || A00(111, 15, 29).equals(this.A04)) && (strA8D = this.A01.A04().A8D()) != null) {
                mapA5S.put(A00(86, 20, 12), strA8D);
            }
            String strA0C = this.A01.A0C();
            if (strA0C != null && !TextUtils.isEmpty(strA0C)) {
                mapA5S.put(A00(126, 10, 76), strA0C);
            }
            InterfaceC1542Sn interfaceC1542Sn = (InterfaceC1542Sn) C1544Sp.A0A.get();
            if (interfaceC1542Sn == null) {
                C1544Sp.A0F(new RuntimeException(A00(58, 13, 23)));
            } else {
                interfaceC1542Sn.AKK(strA03, mapA5S, this.A01);
            }
        } catch (Throwable t10) {
            C1544Sp.A0F(t10);
        }
    }
}
