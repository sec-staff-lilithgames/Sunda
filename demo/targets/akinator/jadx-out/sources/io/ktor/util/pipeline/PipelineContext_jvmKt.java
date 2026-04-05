package io.ktor.util.pipeline;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PipelineContext_jvmKt {
    private static final boolean DISABLE_SFG = e0.areEqual(System.getProperty("io.ktor.internal.disable.sfg"), "true");

    public static final boolean getDISABLE_SFG() {
        return DISABLE_SFG;
    }
}
