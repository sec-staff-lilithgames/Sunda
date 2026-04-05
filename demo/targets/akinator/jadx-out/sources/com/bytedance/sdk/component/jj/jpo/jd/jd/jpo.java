package com.bytedance.sdk.component.jj.jpo.jd.jd;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.jpo.jpo.jj;
import com.bytedance.sdk.component.jj.jpo.jpo.jpo.qk;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.moloco.sdk.BKC.JzVV;
import j1.o2;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo {
    private static String cm() {
        return o2.o(new StringBuilder(), qk.f18726jd, "/ad_log_event/");
    }

    public static void jd() {
        if (xyk.qk().jj() == null) {
            return;
        }
        try {
            ContentResolver contentResolverWqx = wqx();
            if (contentResolverWqx != null) {
                contentResolverWqx.getType(Uri.parse(cm() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo() {
        if (xyk.qk().jj() == null) {
            return;
        }
        try {
            ContentResolver contentResolverWqx = wqx();
            if (contentResolverWqx != null) {
                contentResolverWqx.getType(Uri.parse(cm() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static ContentResolver wqx() {
        try {
            if (xyk.qk().jj() != null) {
                return xyk.qk().jj().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        try {
            ContentResolver contentResolverWqx = wqx();
            if (contentResolverWqx != null) {
                contentResolverWqx.getType(Uri.parse(cm() + "adLogDispatch?event=" + jj.jpo(jpoVar.jj())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void jpo(String str, List<String> list, boolean z10) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(jj.jpo(it.next()));
                sb2.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(jj.jpo(sb2.toString())) + "&replace=" + String.valueOf(z10);
            ContentResolver contentResolverWqx = wqx();
            if (contentResolverWqx != null) {
                contentResolverWqx.getType(Uri.parse(cm() + JzVV.gdwltqQCRp + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverWqx = wqx();
            if (contentResolverWqx != null) {
                contentResolverWqx.getType(Uri.parse(cm() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
