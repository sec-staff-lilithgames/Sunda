package com.bytedance.sdk.component.my.jpo;

import com.bytedance.sdk.component.my.Cif;
import com.bytedance.sdk.component.my.zz;
import com.bytedance.sdk.component.utils.hna;
import java.security.NoSuchAlgorithmException;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static Cif jpo() {
        return new Cif() { // from class: com.bytedance.sdk.component.my.jpo.jd.1
            private WeakHashMap<String, String> jpo = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.my.Cif
            public String jd(zz zzVar) {
                return jpo(zzVar.jpo());
            }

            @Override // com.bytedance.sdk.component.my.Cif
            public String jpo(zz zzVar) {
                return jpo(zzVar.jpo() + "#width=" + zzVar.jd() + "#height=" + zzVar.wqx() + "#scaletype=" + zzVar.cm() + "#bitmapConfig=" + zzVar.my());
            }

            private String jpo(String str) throws NoSuchAlgorithmException {
                String str2 = this.jpo.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strJpo = hna.jpo(str);
                this.jpo.put(str, strJpo);
                return strJpo;
            }
        };
    }
}
