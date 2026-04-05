package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.jpo;
import com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd;
import com.bytedance.sdk.component.utils.qk;
import com.bytedance.sdk.openadsdk.core.sq;
import j1.o2;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CacheDirFactory {
    public static volatile jd MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String jpo;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir());
        return o2.o(sb2, File.separator, str);
    }

    public static jd getICacheDir(int i10) {
        return jpo();
    }

    public static String getImageCacheDir(String str) {
        if (jpo == null) {
            jpo = getDiskCacheDirPath(str);
        }
        return jpo;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileJpo = qk.jpo(sq.jpo(), com.bytedance.sdk.openadsdk.multipro.jd.wqx(), "tt_ad");
        if (fileJpo.isFile()) {
            fileJpo.delete();
        }
        if (!fileJpo.exists()) {
            fileJpo.mkdirs();
        }
        String absolutePath = fileJpo.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static jd jpo() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        jpo jpoVar = new jpo();
                        MEDIA_CACHE_DIR = jpoVar;
                        jpoVar.jpo(getRootDir());
                        MEDIA_CACHE_DIR.cm();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
