package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2813i2 {

    /* renamed from: a, reason: collision with root package name */
    public String f32916a;

    /* renamed from: b, reason: collision with root package name */
    public int f32917b;

    /* renamed from: c, reason: collision with root package name */
    public int f32918c;

    public C2813i2() {
    }

    public static String a(String mcc, String mnc, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mcc, "mcc");
        kotlin.jvm.internal.e0.checkNotNullParameter(mnc, "mnc");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mcc);
        sb2.append('#');
        sb2.append(mnc);
        sb2.append('#');
        sb2.append(i10);
        sb2.append('#');
        sb2.append(i11);
        sb2.append('#');
        sb2.append(i12 == -1 ? "" : Integer.valueOf(i12));
        sb2.append('#');
        sb2.append(i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
        return sb2.toString();
    }

    public C2813i2(CellInfo cellInfo, String mcc, String mnc, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mcc, "mcc");
        kotlin.jvm.internal.e0.checkNotNullParameter(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f32918c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f32917b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cellIdentity, "getCellIdentity(...)");
            this.f32916a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (!(cellInfo instanceof CellInfoCdma)) {
            if (cellInfo instanceof CellInfoWcdma) {
                this.f32918c = i10;
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                this.f32917b = cellInfoWcdma.getCellSignalStrength().getDbm();
                CellIdentityWcdma cellIdentity2 = cellInfoWcdma.getCellIdentity();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(cellIdentity2, "getCellIdentity(...)");
                this.f32916a = a(mcc, mnc, cellIdentity2.getLac(), cellIdentity2.getCid(), cellIdentity2.getPsc(), Integer.MAX_VALUE);
                return;
            }
            return;
        }
        this.f32918c = i10;
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
        this.f32917b = cellInfoCdma.getCellSignalStrength().getDbm();
        CellIdentityCdma cellIdentity3 = cellInfoCdma.getCellIdentity();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(cellIdentity3, "getCellIdentity(...)");
        int systemId = cellIdentity3.getSystemId();
        int networkId = cellIdentity3.getNetworkId();
        int basestationId = cellIdentity3.getBasestationId();
        kotlin.jvm.internal.e0.checkNotNullParameter(mcc, "mcc");
        this.f32916a = mcc + '#' + systemId + '#' + networkId + '#' + basestationId;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f32916a);
            int i10 = this.f32917b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.f32918c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
