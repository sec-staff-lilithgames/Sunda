package com.applovin.shadow.okio.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ResourceFileSystem$toJarRoot$zip$1 extends f0 implements l {
    public static final ResourceFileSystem$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$toJarRoot$zip$1();

    public ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    @Override // kv.l
    public final Boolean invoke(ZipEntry entry) {
        e0.checkNotNullParameter(entry, "entry");
        return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(entry.getCanonicalPath()));
    }
}
