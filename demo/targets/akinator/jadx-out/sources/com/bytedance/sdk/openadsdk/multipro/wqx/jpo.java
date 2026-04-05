package com.bytedance.sdk.openadsdk.multipro.wqx;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.jj.jpo.jj;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.cm;
import j1.o2;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements com.bytedance.sdk.openadsdk.multipro.jpo {
    private static jj cm() {
        try {
            if (sq.jpo() != null) {
                return com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean jd() {
        if (sq.jpo() == null) {
            return false;
        }
        try {
            jj jjVarCm = cm();
            if (jjVarCm != null) {
                return "true".equals(jjVarCm.jpo(Uri.parse(my() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static String my() {
        return o2.o(new StringBuilder(), cm.f21284jd, "/t_frequent/");
    }

    public static String wqx() {
        if (sq.jpo() == null) {
            return null;
        }
        try {
            jj jjVarCm = cm();
            if (jjVarCm != null) {
                return jjVarCm.jpo(Uri.parse(my() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Cursor jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Uri jpo(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static boolean jpo(String str) {
        if (sq.jpo() == null) {
            return false;
        }
        try {
            jj jjVarCm = cm();
            if (jjVarCm != null) {
                return "true".equals(jjVarCm.jpo(Uri.parse(my() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo(Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.xyk.jpo.jpo().jpo(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.xyk.jpo.jpo().jd() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.xyk.jpo.jpo().wqx();
        }
        return null;
    }
}
