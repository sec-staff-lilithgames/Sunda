package com.unity3d.ads.core.extensions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class JSONObjectExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> toBuiltInMap(org.json.JSONObject r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r0)
            java.util.Iterator r0 = r7.keys()
            java.lang.String r1 = "keys()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            rv.t r0 = rv.y.asSequence(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r7.opt(r3)
            r4 = 0
            if (r3 == 0) goto L4d
            java.lang.String r5 = "opt(value)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r5)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "undefined"
            boolean r5 = kotlin.jvm.internal.e0.areEqual(r5, r6)
            if (r5 != 0) goto L4d
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "null"
            boolean r5 = kotlin.jvm.internal.e0.areEqual(r5, r6)
            if (r5 != 0) goto L4d
            goto L4e
        L4d:
            r3 = r4
        L4e:
            r1.put(r2, r3)
            goto L1b
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(org.json.JSONObject):java.util.Map");
    }
}
