package com.moloco.sdk.publisher;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoInitStatus {
    public static final int $stable = 0;
    private final String description;
    private final Initialization initialization;

    public MolocoInitStatus(Initialization initialization, String description) {
        e0.checkNotNullParameter(initialization, "initialization");
        e0.checkNotNullParameter(description, "description");
        this.initialization = initialization;
        this.description = description;
    }

    public static /* synthetic */ MolocoInitStatus copy$default(MolocoInitStatus molocoInitStatus, Initialization initialization, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            initialization = molocoInitStatus.initialization;
        }
        if ((i10 & 2) != 0) {
            str = molocoInitStatus.description;
        }
        return molocoInitStatus.copy(initialization, str);
    }

    public final Initialization component1() {
        return this.initialization;
    }

    public final String component2() {
        return this.description;
    }

    public final MolocoInitStatus copy(Initialization initialization, String description) {
        e0.checkNotNullParameter(initialization, "initialization");
        e0.checkNotNullParameter(description, "description");
        return new MolocoInitStatus(initialization, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoInitStatus)) {
            return false;
        }
        MolocoInitStatus molocoInitStatus = (MolocoInitStatus) obj;
        return this.initialization == molocoInitStatus.initialization && e0.areEqual(this.description, molocoInitStatus.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Initialization getInitialization() {
        return this.initialization;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.initialization.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MolocoInitStatus(initialization=");
        sb2.append(this.initialization);
        sb2.append(", description=");
        return o2.q(sb2, this.description, ')');
    }
}
