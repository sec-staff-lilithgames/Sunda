package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static WeakReference<Context> f21291jd;
    private static volatile my jpo;
    private static final List<jpo> wqx;

    static {
        List<jpo> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        wqx = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.cm.wqx());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.jpo.jd());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.wqx.jpo());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.cm.jpo.my(new com.bytedance.sdk.component.jj.jpo.jd.jd.jd()));
        Iterator<jpo> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private my() {
    }

    private jpo jd(Uri uri) {
        if (uri == null || !wqx(uri)) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (jpo jpoVar : wqx) {
            if (str.equals(jpoVar.jpo())) {
                return jpoVar;
            }
        }
        return null;
    }

    public static my jpo(Context context) {
        if (context != null) {
            f21291jd = new WeakReference<>(context.getApplicationContext());
        }
        if (jpo == null) {
            synchronized (my.class) {
                try {
                    if (jpo == null) {
                        jpo = new my();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    private boolean wqx(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Cursor jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            jpo jpoVarJd = jd(uri);
            if (jpoVarJd != null) {
                return jpoVarJd.jpo(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo(Uri uri) {
        try {
            jpo jpoVarJd = jd(uri);
            if (jpoVarJd != null) {
                return jpoVarJd.jpo(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Uri jpo(Uri uri, ContentValues contentValues) {
        try {
            jpo jpoVarJd = jd(uri);
            if (jpoVarJd != null) {
                return jpoVarJd.jpo(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, String str, String[] strArr) {
        try {
            jpo jpoVarJd = jd(uri);
            if (jpoVarJd != null) {
                return jpoVarJd.jpo(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            jpo jpoVarJd = jd(uri);
            if (jpoVarJd != null) {
                return jpoVarJd.jpo(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
