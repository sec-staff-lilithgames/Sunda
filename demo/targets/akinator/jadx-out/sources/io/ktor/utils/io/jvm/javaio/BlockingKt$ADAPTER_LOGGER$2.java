package io.ktor.utils.io.jvm.javaio;

import bx.b;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BlockingKt$ADAPTER_LOGGER$2 extends f0 implements a {
    public static final BlockingKt$ADAPTER_LOGGER$2 INSTANCE = new BlockingKt$ADAPTER_LOGGER$2();

    public BlockingKt$ADAPTER_LOGGER$2() {
        super(0);
    }

    @Override // kv.a
    public final bx.a invoke() {
        return b.getLogger((Class<?>) BlockingAdapter.class);
    }
}
