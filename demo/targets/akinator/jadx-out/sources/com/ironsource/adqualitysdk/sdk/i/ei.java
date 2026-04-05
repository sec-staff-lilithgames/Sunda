package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ei extends ej {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2156 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2157;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2158 = {'R', 187, 210, 208, 208, 169, 162, 205, 203, 198, 208, 203, 202, 206, 203, 202, 163, 169, 212, 203, 202, 203, 202, 205, 204, 210, 170, 168, 210, 212, 170, 162, 206, 212, 209, 203, 204, 211, 206, 204, 206, 167, 'D', 141, 142, 139, 146, 'q', 'T', 'T', 'q', 154, 156, 152, 146, 145, 'j', 'q', 152, 'n', 'q', 155, 147, 'i', GMTDateParser.DAY_OF_MONTH, 131, 'e', 'n', 149, 'n', 'q', 152, 151, 155, 153, 151, 150, 151, 154, 147, 139, 'i', 'n', '^', 202, 202};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f2159;

    public ei(ee eeVar, ee eeVar2, ee eeVar3, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
        this.f2159 = eeVar3;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private ee m2482() {
        int i10 = f2156 + 109;
        int i11 = i10 % 128;
        f2157 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        ee eeVar = this.f2159;
        f2156 = (i11 + 95) % 128;
        return eeVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2483(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2158, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ej
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i10 = f2157 + 51;
            f2156 = i10 % 128;
            if (i10 % 2 == 0) {
                obj.getClass();
                throw null;
            }
            if (ei.class == obj.getClass()) {
                if (!super.equals(obj)) {
                    f2156 = (f2157 + 95) % 128;
                    return false;
                }
                ee eeVar = this.f2159;
                ee eeVar2 = ((ei) obj).f2159;
                return eeVar != null ? eeVar.equals(eeVar2) : eeVar2 == null;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ej
    public final int hashCode() {
        int iHashCode;
        f2156 = (f2157 + 99) % 128;
        int iHashCode2 = super.hashCode() * 31;
        ee eeVar = this.f2159;
        if (eeVar != null) {
            f2157 = (f2156 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            iHashCode = eeVar.hashCode();
            f2157 = (f2156 + 67) % 128;
        } else {
            iHashCode = 0;
        }
        return iHashCode2 + iHashCode;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ej
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(m2483("\u0000\u0001\u0001", false, new int[]{83, 3, 156, 0}).intern());
        sb2.append(m2482().toString());
        String string = sb2.toString();
        f2156 = (f2157 + 17) % 128;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) throws JSONException {
        int i10 = f2157 + 45;
        f2156 = i10 % 128;
        try {
        } catch (Exception e10) {
            String strM2007 = cpVar.m2007();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2483("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000", false, new int[]{0, 42, 96, 0}).intern());
            sb2.append(this);
            sb2.append(m2474());
            co.m1955(strM2007, sb2.toString(), e10);
        }
        if (i10 % 2 == 0) {
            m2486().m2473(dsVar, cpVar);
            m2482().m2473(dsVar, cpVar);
            m2485().m2473(dsVar, cpVar).m2437();
            throw null;
        }
        du duVarM2473 = m2486().m2473(dsVar, cpVar);
        du duVarM24732 = m2482().m2473(dsVar, cpVar);
        Object objM2437 = m2485().m2473(dsVar, cpVar).m2437();
        if (objM2437 instanceof JSONObject) {
            ((JSONObject) objM2437).put((String) duVarM2473.m2437(), duVarM24732.m2437());
        } else if (objM2437 instanceof JSONArray) {
            ((JSONArray) objM2437).put(duVarM2473.m2436().intValue(), duVarM24732.m2437());
        } else if (objM2437 instanceof Map) {
            ((Map) objM2437).put(duVarM2473.m2437(), duVarM24732.m2437());
        } else if (objM2437 instanceof List) {
            f2157 = (f2156 + 25) % 128;
            ((List) objM2437).set(duVarM2473.m2436().intValue(), duVarM24732.m2437());
        } else if (objM2437.getClass().isArray()) {
            ((Object[]) objM2437)[duVarM2473.m2436().intValue()] = duVarM24732.m2437();
        } else {
            String strM20072 = cpVar.m2007();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2483("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000", false, new int[]{0, 42, 96, 0}).intern());
            sb3.append(this);
            sb3.append(m2474());
            sb3.append(m2483("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", false, new int[]{42, 41, 39, 6}).intern());
            sb3.append(objM2437);
            co.m1955(strM20072, sb3.toString(), null);
        }
        int i11 = f2157 + 113;
        f2156 = i11 % 128;
        if (i11 % 2 != 0) {
            return duVarM24732;
        }
        throw null;
    }
}
