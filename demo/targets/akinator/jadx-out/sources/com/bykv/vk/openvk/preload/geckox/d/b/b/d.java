package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import j1.o2;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: d, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f17132d;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f17132d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start merge patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        File fileF = aVar.f();
        aVar.a();
        aVar.e();
        File parentFile = fileF.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(updatePackage.getLocalVersion());
        File file = new File(parentFile, o2.o(sb2, File.separator, "res.zip"));
        File file2 = new File(fileF.getParentFile(), "res.zip");
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file2);
        try {
            try {
                BsPatch.a(file, fileF, file2.getParentFile(), file2.getName());
                com.bykv.vk.openvk.preload.geckox.utils.b.a(fileF);
                this.f17132d.a();
                com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file2, file2.length());
                try {
                    return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(aVarA, updatePackage));
                } finally {
                    aVarA.e();
                }
            } catch (Exception e10) {
                throw new RuntimeException("merged patch zip file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            com.bykv.vk.openvk.preload.geckox.utils.b.a(fileF);
            throw th2;
        }
    }
}
