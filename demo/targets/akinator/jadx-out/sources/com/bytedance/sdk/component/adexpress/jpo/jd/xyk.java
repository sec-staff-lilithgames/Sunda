package com.bytedance.sdk.component.adexpress.jpo.jd;

import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {
    private static com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpo;

    public static void cm() {
        wqx.jd(my.xyk(), jd(), "temp_pkg_info.json");
        jpo = null;
    }

    public static synchronized com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jd() {
        return jpo;
    }

    public static void jpo() throws IOException {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(my.xyk(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarJpo = com.bytedance.sdk.component.adexpress.jpo.wqx.jpo.jpo(new JSONObject(new String(bArr, G5.N)));
                        if (jpoVarJpo != null) {
                            jpo = jpoVarJpo;
                            jpoVarJpo.wqx();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
        }
    }

    public static void wqx() throws IOException {
        wqx.jpo(my.xyk(), jd(), "temp_pkg_info.json");
    }

    public static boolean jd(com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar) {
        return wqx.wqx(jd(), jpoVar);
    }

    public static synchronized void jpo(com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar) {
        if (jpoVar != null) {
            if (jpoVar.xyk()) {
                jpo = jpoVar;
            }
        }
    }

    public static boolean jpo(String str) {
        return wqx.jpo(jd(), str);
    }
}
