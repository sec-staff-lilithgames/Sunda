package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileNotFoundException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class BsPatch {
    static {
        System.loadLibrary("geckox_bspatch");
    }

    public static void a(File file, File file2, File file3, String str) throws Exception {
        if (!file.exists()) {
            throw new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
        }
        file3.mkdirs();
        File file4 = new File(file3, str);
        file4.delete();
        int iPatch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
        if (iPatch == 0) {
            return;
        }
        StringBuilder sbT = o2.t(iPatch, "patch merged failed, code：", " full:");
        sbT.append(file.getAbsolutePath());
        sbT.append(" patch:");
        sbT.append(file2.getAbsolutePath());
        sbT.append(" dest:");
        sbT.append(file4.getAbsolutePath());
        throw new RuntimeException(sbT.toString());
    }

    private static native int patch(String str, String str2, String str3) throws Exception;
}
