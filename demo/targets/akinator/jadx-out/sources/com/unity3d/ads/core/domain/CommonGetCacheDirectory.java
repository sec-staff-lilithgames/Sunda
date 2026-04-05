package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    public File invoke(File cacheDirectoryBase, String cacheDirectoryPath) {
        e0.checkNotNullParameter(cacheDirectoryBase, "cacheDirectoryBase");
        e0.checkNotNullParameter(cacheDirectoryPath, "cacheDirectoryPath");
        return new File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
