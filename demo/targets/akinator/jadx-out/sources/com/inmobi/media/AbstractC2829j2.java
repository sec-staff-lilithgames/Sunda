package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2829j2 {
    public static HashMap a() throws NumberFormatException {
        String strP;
        int i10;
        int i11;
        int i12;
        int i13;
        String string;
        HashMap map = new HashMap();
        Context contextD = C2925od.d();
        if (contextD == null) {
            return map;
        }
        String strB = C2925od.b();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        String string2 = null;
        Config configA = O2.a("signals", strB, null);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
        int cellOperatorFlag = ((SignalsConfig) configA).getIceConfig().getCellOperatorFlag();
        boolean z10 = (cellOperatorFlag & 2) == 2;
        boolean z11 = (cellOperatorFlag & 1) == 1;
        Object systemService = contextD.getSystemService("phone");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (z10) {
            strP = null;
            i10 = -1;
            i11 = -1;
        } else {
            int[] iArrA = a(telephonyManager.getNetworkOperator());
            i11 = iArrA[0];
            i10 = iArrA[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale locale = Locale.ENGLISH;
                strP = b0.e2.p(locale, "ENGLISH", networkCountryIso, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                strP = null;
            }
        }
        if (z11) {
            i12 = -1;
            i13 = -1;
        } else {
            int[] iArrA2 = a(telephonyManager.getSimOperator());
            i13 = iArrA2[0];
            i12 = iArrA2[1];
        }
        if (i13 == -1 && i12 == -1) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i13);
            sb2.append('_');
            sb2.append(i12);
            string = sb2.toString();
        }
        if (string != null) {
            map.put("s-ho", string);
        }
        if (i11 != -1 || i10 != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i11);
            sb3.append('_');
            sb3.append(i10);
            string2 = sb3.toString();
        }
        if (string2 != null) {
            map.put("s-co", string2);
        }
        if (strP != null) {
            map.put("s-iso", strP);
        }
        map.put("s-cn", R3.f32183a.a(contextD));
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap b() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2829j2.b():java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap c() throws java.lang.NumberFormatException {
        /*
            boolean r0 = com.inmobi.media.C2925od.q()
            r1 = 1
            if (r0 == 0) goto L9e
            boolean r0 = d()
            if (r0 == 0) goto L9e
            boolean r0 = e()
            if (r0 == 0) goto L9e
            com.inmobi.media.od r0 = com.inmobi.media.C2925od.f33208a
            java.lang.String r0 = r0.h()
            if (r0 == 0) goto L35
            java.util.LinkedHashMap r2 = com.inmobi.media.Q2.f32149a
            java.lang.String r2 = "signals"
            r3 = 0
            com.inmobi.commons.core.configs.Config r0 = com.inmobi.media.O2.a(r2, r0, r3)
            java.lang.String r2 = "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig"
            kotlin.jvm.internal.e0.checkNotNull(r0, r2)
            com.inmobi.commons.core.configs.SignalsConfig r0 = (com.inmobi.commons.core.configs.SignalsConfig) r0
            com.inmobi.commons.core.configs.SignalsConfig$IceConfig r0 = r0.getIceConfig()
            boolean r0 = r0.isVisibleCellTowerEnabled()
            if (r0 == 0) goto L9e
        L35:
            android.content.Context r0 = com.inmobi.media.C2925od.d()
            if (r0 != 0) goto L41
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto La3
        L41:
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            kotlin.jvm.internal.e0.checkNotNull(r0, r2)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r0.getNetworkOperator()
            int[] r3 = a(r3)
            r4 = 0
            r4 = r3[r4]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3 = r3[r1]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.util.List r5 = r0.getAllCellInfo()
            if (r5 == 0) goto L9c
            java.util.Iterator r5 = r5.iterator()
        L72:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9c
            java.lang.Object r6 = r5.next()
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6
            boolean r7 = r6.isRegistered()
            if (r7 != 0) goto L72
            com.inmobi.media.i2 r7 = new com.inmobi.media.i2
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 < r9) goto L91
            int r8 = r0.getDataNetworkType()
            goto L95
        L91:
            int r8 = r0.getNetworkType()
        L95:
            r7.<init>(r6, r4, r3, r8)
            r2.add(r7)
            goto L72
        L9c:
            r0 = r2
            goto La3
        L9e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La3:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Ld3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            int r4 = r0.size()
            int r4 = r4 - r1
            java.lang.Object r0 = r0.get(r4)
            com.inmobi.media.i2 r0 = (com.inmobi.media.C2813i2) r0
            org.json.JSONObject r0 = r0.a()
            r3.put(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "v-sc"
            r2.put(r1, r0)
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2829j2.c():java.util.HashMap");
    }

    public static boolean d() {
        if (!C2925od.q()) {
            return false;
        }
        boolean zA = Ga.a(C2925od.d(), "android.permission.READ_PHONE_STATE");
        boolean zA2 = Ga.a(C2925od.d(), "android.permission.ACCESS_FINE_LOCATION");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            if (!zA2) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("j2", "TAG");
            }
            return zA2;
        }
        if (i10 >= 30) {
            if (!zA2 || !zA) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("j2", "TAG");
            }
            return zA2 && zA;
        }
        boolean zA3 = Ga.a(C2925od.d(), "android.permission.ACCESS_COARSE_LOCATION");
        if (!zA3 && !zA2) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("j2", "TAG");
        }
        return zA3 || zA2;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context contextD = C2925od.d();
        Object systemService = contextD != null ? contextD.getSystemService(DtbConstants.PRIVACY_LOCATION_KEY) : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static int[] a(String str) throws NumberFormatException {
        int[] iArr = {-1, -1};
        if (str != null && !kotlin.jvm.internal.e0.areEqual("", str)) {
            try {
                String strSubstring = str.substring(0, 3);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int i10 = Integer.parseInt(strSubstring);
                String strSubstring2 = str.substring(3);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                int i11 = Integer.parseInt(strSubstring2);
                iArr[0] = i10;
                iArr[1] = i11;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
