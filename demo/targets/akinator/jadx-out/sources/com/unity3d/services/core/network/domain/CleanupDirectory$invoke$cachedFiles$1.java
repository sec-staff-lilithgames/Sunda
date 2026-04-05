package com.unity3d.services.core.network.domain;

import java.io.File;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends a0 implements l {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // kv.l
    public final Boolean invoke(File p02) {
        e0.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(p02.isFile());
    }
}
