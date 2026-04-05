package com.bykv.vk.openvk.jpo.jpo.jpo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.ju;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private static boolean f16743cm = false;

    /* renamed from: jd, reason: collision with root package name */
    private static Context f16744jd = null;

    /* renamed from: jj, reason: collision with root package name */
    private static int f16745jj = 1;
    public static boolean jpo = false;
    private static ju my;
    private static String wqx;

    public static ju cm() {
        if (my == null) {
            ju.jpo jpoVar = new ju.jpo("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            my = jpoVar.jpo(10000L, timeUnit).jd(10000L, timeUnit).wqx(10000L, timeUnit).jpo();
        }
        return my;
    }

    public static String jd() {
        if (TextUtils.isEmpty(wqx)) {
            try {
                File file = new File(jpo().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                wqx = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return wqx;
    }

    public static int jj() {
        return f16745jj;
    }

    public static Context jpo() {
        return f16744jd;
    }

    public static boolean my() {
        return jpo;
    }

    public static boolean wqx() {
        return f16743cm;
    }

    public static void jpo(Context context, String str) {
        f16744jd = context;
        wqx = str;
    }

    public static void jpo(boolean z10) {
        f16743cm = z10;
    }

    public static void jpo(ju juVar) {
        my = juVar;
    }

    public static void jpo(int i10) {
        f16745jj = i10;
    }
}
