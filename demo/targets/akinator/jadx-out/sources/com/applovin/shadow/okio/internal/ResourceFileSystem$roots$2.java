package com.applovin.shadow.okio.internal;

import java.util.List;
import kotlin.jvm.internal.f0;
import kv.a;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ResourceFileSystem$roots$2 extends f0 implements a {
    final /* synthetic */ ResourceFileSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceFileSystem$roots$2(ResourceFileSystem resourceFileSystem) {
        super(0);
        this.this$0 = resourceFileSystem;
    }

    @Override // kv.a
    public final List<v> invoke() {
        ResourceFileSystem resourceFileSystem = this.this$0;
        return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
    }
}
