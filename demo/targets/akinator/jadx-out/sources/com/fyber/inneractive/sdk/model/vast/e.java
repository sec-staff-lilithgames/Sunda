package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f24095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24096b;

    /* renamed from: c, reason: collision with root package name */
    public int f24097c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24098d;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f24095a = r7
            r6.f24096b = r8
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            r0 = 3
            r1 = -1
            r2 = 2
            r3 = 1
            r4 = 0
            if (r7 != 0) goto L9a
            java.lang.String r7 = "-"
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L1c
            goto L9a
        L1c:
            java.lang.String r7 = "%"
            boolean r5 = r8.endsWith(r7)
            if (r5 == 0) goto L56
            boolean r7 = r8.endsWith(r7)
            if (r7 != 0) goto L2b
            goto L56
        L2b:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.NumberFormatException -> L48
            if (r7 == 0) goto L33
            r7 = r1
            goto L40
        L33:
            int r7 = r8.length()     // Catch: java.lang.NumberFormatException -> L48
            int r7 = r7 - r3
            java.lang.String r7 = r8.substring(r4, r7)     // Catch: java.lang.NumberFormatException -> L48
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L48
        L40:
            if (r7 < 0) goto L56
            r5 = 100
            if (r7 > r5) goto L56
            r7 = r3
            goto L9b
        L48:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r5 = "ProgressTrackingEvent: failed isPercentageOffsetValid with %s"
            com.fyber.inneractive.sdk.util.IAlog.f(r5, r7)
        L56:
            java.lang.String r7 = ":"
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L9a
            java.util.ArrayList r7 = a(r8)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L9a
            java.lang.Object r8 = r7.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L9a
            java.lang.Object r8 = r7.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L9a
            java.lang.Object r8 = r7.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L9a
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 < 0) goto L9a
            r7 = r2
            goto L9b
        L9a:
            r7 = r4
        L9b:
            r6.f24098d = r7
            if (r7 != r2) goto Ld9
            java.lang.String r7 = r6.f24096b
            if (r7 == 0) goto Ld9
            java.util.ArrayList r7 = a(r7)
            java.lang.Object r8 = r7.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 * 3600
            java.lang.Object r1 = r7.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 * 60
            int r1 = r1 + r8
            java.lang.Object r8 = r7.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 + r1
            int r8 = r8 * 1000
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r1 = r7 + r8
        Ld9:
            r6.f24097c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.model.vast.e.<init>(java.lang.String, java.lang.String):void");
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 3) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String[] strArrSplit2 = strArrSplit[2].split("\\.");
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2.length > 1 ? strArrSplit2[1] : "000";
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str4)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str5)));
                    return arrayList;
                } catch (NumberFormatException e10) {
                    IAlog.f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e10.getMessage());
                    return new ArrayList();
                }
            }
        }
        return arrayList;
    }
}
