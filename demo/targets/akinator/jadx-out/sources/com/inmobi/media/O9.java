package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class O9 {
    public static String a(String valueTypeString) {
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTypeString, "valueTypeString");
        int length = valueTypeString.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) valueTypeString.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, valueTypeString, i10);
        int iHashCode = strA.hashCode();
        return iHashCode != -1900324833 ? iHashCode != -835221992 ? iHashCode != 116079 ? (iHashCode == 3213227 && strA.equals("html")) ? "HTML" : "UNKNOWN" : !strA.equals("url") ? "UNKNOWN" : "URL" : !strA.equals("reference_iframe") ? "UNKNOWN" : "REF_IFRAME" : !strA.equals("reference_html") ? "UNKNOWN" : "REF_HTML";
    }
}
