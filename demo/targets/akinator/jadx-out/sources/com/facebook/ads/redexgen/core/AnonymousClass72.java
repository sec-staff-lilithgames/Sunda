package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.72, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass72 extends AbstractC2183hQ {
    public static byte[] A03;
    public long A00;
    public View A01;
    public C6M A02;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public AnonymousClass72(C6M c6m, NT nt2) {
        super(c6m, nt2);
        this.A00 = 10000L;
        this.A02 = c6m;
    }

    private C2186hT A01(Runnable runnable) {
        return new C2186hT(this, runnable);
    }

    private List<JSONObject> A04(NU nu2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = nu2.A03();
        if (jSONObjectA03.has(A03(22, 12, 71))) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(r1).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i10 = 0; i10 < adsArray.length(); i10++) {
                        arrayList.add((JSONObject) adsArray.get(i10));
                    }
                }
            } catch (JSONException unused) {
                String strA03 = A03(36, 38, 101);
                this.A02.A0F().A5Y(V1.A01(AdErrorType.UNKNOWN_ERROR, strA03).A03().getErrorCode(), strA03);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(InterfaceC2249id interfaceC2249id, JSONObject jSONObject, TF tf2) {
        this.A0C = false;
        C2185hS c2185hS = new C2185hS(this, interfaceC2249id, AbstractC1646Wr.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c2185hS, tf2.A05());
        interfaceC2249id.AAk(this.A02, this.A09, this.A08.A08, A01(c2185hS), jSONObject, tf2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2183hQ
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4W();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4X();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2183hQ
    public final void A0R(MP mp2, TE te2, TC tc2, final NU nu2) throws JSONException {
        this.A02.A0F().A4Q();
        final InterfaceC2249id interfaceC2249id = (InterfaceC2249id) mp2;
        if (interfaceC2249id.AJa()) {
            final List<JSONObject> listA04 = A04(nu2);
            A06(interfaceC2249id, listA04.get(0), nu2.A01());
            if (listA04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.NV
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0a(interfaceC2249id, listA04, nu2);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2249id, nu2.A03(), nu2.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2183hQ
    public final void A0U(String str) {
        this.A02.A0F().A4V(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2183hQ
    public final void A0Y(boolean z10) {
        super.A0Y(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2249id interfaceC2249id, List list, NU nu2) {
        A06(interfaceC2249id, (JSONObject) list.get(1), nu2.A01());
    }
}
