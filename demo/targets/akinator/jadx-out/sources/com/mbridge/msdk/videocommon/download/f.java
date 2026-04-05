package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.n0;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private String f45303a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static f f45304a = new f(null);
    }

    public /* synthetic */ f(e eVar) {
        this();
    }

    public static f a() {
        return a.f45304a;
    }

    public void b() {
        this.f45303a = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
    }

    private f() {
        b();
    }

    public String a(String str) {
        try {
            File file = new File(this.f45303a + "/" + SameMD5.getMD5(b1.b(str)) + ".html");
            if (file.exists()) {
                return n0.e(file);
            }
            return null;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public String b(String str) {
        try {
            String str2 = this.f45303a + "/" + SameMD5.getMD5(b1.b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD != null && !TextUtils.isEmpty(gVarD.T())) {
                com.mbridge.msdk.foundation.same.d.a(str, file);
            }
            return "file:////" + str2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
