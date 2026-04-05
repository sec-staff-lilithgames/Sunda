package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    private static d f45295h;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f45296a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f45297b;

    /* renamed from: c, reason: collision with root package name */
    private i f45298c;

    /* renamed from: d, reason: collision with root package name */
    private f f45299d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45300e;

    /* renamed from: f, reason: collision with root package name */
    private final String f45301f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: g, reason: collision with root package name */
    private final String f45302g = "down_type";

    private d() {
        this.f45300e = false;
        try {
            this.f45298c = i.a();
            this.f45299d = f.a();
            this.f45296a = new CopyOnWriteArrayList<>();
            this.f45297b = new ConcurrentHashMap();
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD != null) {
                this.f45300e = gVarD.b(1);
            }
        } catch (Throwable th2) {
            p0.b("H5DownLoadManager", th2.getMessage(), th2);
        }
    }

    public static synchronized d a() {
        try {
            if (f45295h == null) {
                f45295h = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f45295h;
    }

    private String b(String str) {
        f fVar = this.f45299d;
        return fVar != null ? fVar.b(str) : str;
    }

    public String c(String str) {
        i iVar = this.f45298c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    public String a(String str) {
        try {
            if (!Patterns.WEB_URL.matcher(str).matches() && !URLUtil.isValidUrl(str)) {
                return str;
            }
            Uri uri = Uri.parse(str);
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                if (path.toLowerCase().endsWith(".zip")) {
                    return c(str);
                }
                return b(str);
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }
}
