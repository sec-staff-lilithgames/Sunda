package com.bytedance.sdk.openadsdk.multipro.aidl.jpo;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.jj.jpo.jj;
import com.bytedance.sdk.openadsdk.core.settings.zz;
import com.bytedance.sdk.openadsdk.core.sq;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends jj.jpo {
    private static volatile jj jpo;

    public static jj jd() {
        if (jpo == null) {
            synchronized (jj.class) {
                try {
                    if (jpo == null) {
                        jpo = new jj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj
    public Map jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!zz.jpo()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.multipro.my.jpo(sq.jpo()).jpo(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj
    public String jpo(Uri uri) {
        if (zz.jpo()) {
            return com.bytedance.sdk.openadsdk.multipro.my.jpo(sq.jpo()).jpo(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj
    public String jpo(Uri uri, ContentValues contentValues) {
        Uri uriJpo;
        if (zz.jpo() && (uriJpo = com.bytedance.sdk.openadsdk.multipro.my.jpo(sq.jpo()).jpo(uri, contentValues)) != null) {
            return uriJpo.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj
    public int jpo(Uri uri, String str, String[] strArr) {
        if (zz.jpo()) {
            return com.bytedance.sdk.openadsdk.multipro.my.jpo(sq.jpo()).jpo(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj
    public int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (zz.jpo()) {
            return com.bytedance.sdk.openadsdk.multipro.my.jpo(sq.jpo()).jpo(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
