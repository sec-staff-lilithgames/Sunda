package com.bytedance.sdk.component.jj.jpo.jd.jd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.jj;
import com.bytedance.sdk.component.jj.jpo.jpo.jpo.qk;
import com.bytedance.sdk.component.jj.jpo.xyk;
import j1.o2;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static jj jpo;

    private static String cm() {
        return o2.o(new StringBuilder(), qk.f18726jd, "/ad_log_event/");
    }

    public static void jd() {
        if (xyk.qk().jj() == null) {
            return;
        }
        try {
            jj jjVarJpo = jpo(xyk.qk().jj());
            if (jjVarJpo != null) {
                jjVarJpo.jpo(Uri.parse(cm() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String wqx() {
        return "ad_log_event";
    }

    public int jpo(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri jpo(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static jj jpo(Context context) {
        try {
            if (jpo == null) {
                jpo = xyk.qk().hna().ju();
            }
        } catch (Exception unused) {
        }
        return jpo;
    }

    public static void jpo() {
        if (xyk.qk().jj() == null) {
            return;
        }
        try {
            jj jjVarJpo = jpo(xyk.qk().jj());
            if (jjVarJpo != null) {
                jjVarJpo.jpo(Uri.parse(cm() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        try {
            jj jjVarJpo = jpo(xyk.qk().jj());
            if (jjVarJpo != null) {
                jjVarJpo.jpo(Uri.parse(cm() + "adLogDispatch?event=" + com.bytedance.sdk.component.jj.jpo.jpo.jpo.jj.jpo(jpoVar.jj())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void jpo(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(com.bytedance.sdk.component.jj.jpo.jpo.jpo.jj.jpo(it.next()));
                sb2.append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.jj.jpo.jpo.jpo.jj.jpo(sb2.toString())) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
            jj jjVarJpo = jpo(xyk.qk().jj());
            if (jjVarJpo != null) {
                jjVarJpo.jpo(Uri.parse(cm() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo(String str, boolean z10) {
        if (xyk.qk().hna().jj() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jj jjVarJpo = jpo(xyk.qk().jj());
            if (jjVarJpo != null) {
                jjVarJpo.jpo(Uri.parse(cm() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String jpo(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.jj.jpo.jd.jd.jd.jpo(android.net.Uri):java.lang.String");
    }
}
