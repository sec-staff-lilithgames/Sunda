package com.bykv.vk.openvk.preload.geckox.d.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import e3.g;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: d, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f17123d;

    /* renamed from: e, reason: collision with root package name */
    private File f17124e;

    public static String a(UpdatePackage updatePackage, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            throw new RuntimeException("url path illegal, url:".concat(str));
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            throw new RuntimeException("url path illegal, url:".concat(str));
        }
        return strSubstring;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f17123d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f17124e = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String string = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f17124e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb2.append(str);
        sb2.append(updatePackage.getChannel());
        sb2.append(str);
        sb2.append(updatePackage.getVersion());
        sb2.append("--updating");
        File file2 = new File(file, sb2.toString());
        file2.mkdirs();
        File file3 = new File(file2, "res" + str + a(updatePackage, string));
        this.f17123d.a();
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, length);
        try {
            this.f17123d.i().downloadFile(string, length, new BufferOutputStream(aVarA));
            try {
                try {
                    Object objA = bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(aVarA, updatePackage));
                    try {
                        return objA;
                    } catch (Exception e10) {
                        return objA;
                    }
                } finally {
                    try {
                        aVarA.e();
                    } catch (Exception e102) {
                        GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e102);
                    }
                }
            } catch (Exception e11) {
                throw e11;
            }
        } catch (Throwable th2) {
            aVarA.e();
            StringBuilder sbO = g.o("download full single file failed! url:", string, ", channel:");
            sbO.append(updatePackage.getChannel());
            sbO.append(", pkg id:");
            sbO.append(updatePackage.getFullPackage().getId());
            sbO.append(", caused by:");
            sbO.append(th2.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(sbO.toString(), th2);
        }
    }
}
