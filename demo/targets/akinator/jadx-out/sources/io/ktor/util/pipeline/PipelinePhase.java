package io.ktor.util.pipeline;

import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PipelinePhase {
    private final String name;

    public PipelinePhase(String name) {
        e0.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return o2.o(new StringBuilder("Phase('"), this.name, "')");
    }
}
