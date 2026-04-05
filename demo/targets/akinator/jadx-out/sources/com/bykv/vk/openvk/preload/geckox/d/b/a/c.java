package com.bykv.vk.openvk.preload.geckox.d.b.a;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Pair<File, UpdatePackage>, Pair<String, Long>> {
    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Pair<String, Long>> bVar, Pair<File, UpdatePackage> pair) throws Throwable {
        Pair<File, UpdatePackage> pair2 = pair;
        GeckoLogger.d("gecko-debug-tag", "start active full zip file, channel:", ((UpdatePackage) pair2.second).getChannel());
        File parentFile = ((File) pair2.first).getParentFile();
        long version = ((UpdatePackage) pair2.second).getVersion();
        File file = new File(parentFile.getParentFile(), String.valueOf(version));
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
        if (parentFile.renameTo(file)) {
            return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<String, Long>>) new Pair<>(((UpdatePackage) pair2.second).getChannel(), Long.valueOf(version)));
        }
        throw new RuntimeException("active full zip file failed:" + parentFile.getAbsolutePath());
    }
}
