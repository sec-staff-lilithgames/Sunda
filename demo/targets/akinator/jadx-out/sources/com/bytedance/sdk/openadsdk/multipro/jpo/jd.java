package com.bytedance.sdk.openadsdk.multipro.jpo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.my;
import com.bytedance.sdk.openadsdk.core.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements com.bytedance.sdk.openadsdk.multipro.jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static final Object f21289jd = new Object();
    private Context jpo;

    private boolean jd(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo() {
        return "t_db";
    }

    private Context jd() {
        Context context = this.jpo;
        return context == null ? sq.jpo() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Cursor jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (f21289jd) {
            try {
                if (jd(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str3 = strArrSplit[2];
                    String str4 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return my.jpo(jd()).jpo().jpo(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo(Uri uri) {
        synchronized (f21289jd) {
            try {
                if (jd(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 5) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[4];
                    if ("ttopensdk.db".equals(str)) {
                        if ("execSQL".equals(str2)) {
                            String queryParameter = uri.getQueryParameter("sql");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                my.jpo(jd()).jpo().jpo(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            my.jpo(jd()).jpo().jd();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            my.jpo(jd()).jpo().wqx();
                        } else if ("transactionEnd".equals(str2)) {
                            my.jpo(jd()).jpo().cm();
                        }
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Uri jpo(Uri uri, ContentValues contentValues) {
        synchronized (f21289jd) {
            try {
                if (jd(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[3];
                    if ("ttopensdk.db".equals(str)) {
                        my.jpo(jd()).jpo().jpo(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, String str, String[] strArr) {
        synchronized (f21289jd) {
            try {
                if (jd(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return my.jpo(jd()).jpo().jpo(str3, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (f21289jd) {
            try {
                if (jd(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return my.jpo(jd()).jpo().jpo(str3, contentValues, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }
}
