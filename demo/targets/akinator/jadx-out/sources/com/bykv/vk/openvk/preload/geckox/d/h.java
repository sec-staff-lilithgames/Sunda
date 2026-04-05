package com.bykv.vk.openvk.preload.geckox.d;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: d, reason: collision with root package name */
    private int f17145d = 0;

    @Override // com.bykv.vk.openvk.preload.b.k
    public final boolean a(Throwable th2) {
        GeckoLogger.w("gecko-debug-tag", "patch update failed", th2);
        if (this.f17145d >= g().getPatch().getUrlList().size()) {
            return false;
        }
        return (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    @Override // com.bykv.vk.openvk.preload.b.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackageG = g();
        List<String> urlList = updatePackageG.getPatch().getUrlList();
        int i10 = this.f17145d;
        this.f17145d = i10 + 1;
        return new Pair<>(Uri.parse(urlList.get(i10)), updatePackageG);
    }
}
