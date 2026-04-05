package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File parent, String child) {
        e0.checkNotNullParameter(parent, "parent");
        e0.checkNotNullParameter(child, "child");
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String pathname) {
        e0.checkNotNullParameter(pathname, "pathname");
        return new File(pathname);
    }
}
