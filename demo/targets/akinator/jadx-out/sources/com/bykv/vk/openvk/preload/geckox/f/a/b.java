package com.bykv.vk.openvk.preload.geckox.f.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends a {
    public b(File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.f.a.a
    public final InputStream a(File file, String str) throws IOException {
        GeckoLogger.d("gecko-debug-tag", "MyArchiveFileLoader, file:", new File(str).getCanonicalPath());
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.f.a.a
    public final boolean b(File file, String str) throws IOException {
        new File(str).getCanonicalPath();
        return false;
    }
}
