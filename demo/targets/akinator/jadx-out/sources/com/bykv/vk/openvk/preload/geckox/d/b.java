package com.bykv.vk.openvk.preload.geckox.d;

import b0.e2;
import com.bykv.vk.openvk.preload.b.j;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import h2.rl.UeklptUrP;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class b extends j<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.vk.openvk.preload.b.j
    public final /* synthetic */ String a(UpdatePackage updatePackage) {
        UpdatePackage updatePackage2 = updatePackage;
        UpdatePackage.Package patch = updatePackage2.getPatch();
        if (patch == null) {
            GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        List<String> urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
        return "patch";
    }

    @Override // com.bykv.vk.openvk.preload.b.j
    public final /* synthetic */ String a(UpdatePackage updatePackage, Throwable th2, String str) {
        UpdatePackage updatePackage2 = updatePackage;
        if (UeklptUrP.wxYgbURkd.equals(str)) {
            GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        throw new RuntimeException(e2.o(th2, new StringBuilder("full update failed, caused by:")), th2);
    }
}
