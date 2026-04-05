package com.bytedance.adsdk.jpo;

import android.text.TextUtils;
import hr.kNq.ikJMrW;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ju {
    public static Object jpo(com.bytedance.adsdk.jpo.jd.jpo.jpo jpoVar) {
        xyk xykVarJpo;
        if (jpoVar == null || (xykVarJpo = jpo(jpoVar.jpo())) == null) {
            return null;
        }
        return xykVarJpo.jpo(null, jpoVar.jd());
    }

    public static xyk jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -652088201:
                if (str.equals("modArray")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3143097:
                if (str.equals(ikJMrW.kPdIWIMhWQAPZyN)) {
                    c10 = 1;
                    break;
                }
                break;
            case 94642797:
                if (str.equals("chunk")) {
                    c10 = 2;
                    break;
                }
                break;
            case 96955127:
                if (str.equals("exist")) {
                    c10 = 3;
                    break;
                }
                break;
            case 515198113:
                if (str.equals("decodeUrl")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1508134777:
                if (str.equals("encodeUrl")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2056988195:
                if (str.equals("isDigit")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
        }
        return null;
    }
}
