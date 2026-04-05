package io.ktor.http;

import java.util.List;
import kotlin.jvm.internal.f0;
import kv.a;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MimesKt$mimes$2 extends f0 implements a {
    public static final MimesKt$mimes$2 INSTANCE = new MimesKt$mimes$2();

    public MimesKt$mimes$2() {
        super(0);
    }

    @Override // kv.a
    public final List<v> invoke() {
        return MimesKt.loadMimes();
    }
}
