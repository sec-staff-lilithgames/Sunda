package com.sfbx.appconsent.core.model.reducer.action;

import e3.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SetCmpVersion implements Action {
    private final int version;

    public SetCmpVersion(int i10) {
        this.version = i10;
    }

    public static /* synthetic */ SetCmpVersion copy$default(SetCmpVersion setCmpVersion, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = setCmpVersion.version;
        }
        return setCmpVersion.copy(i10);
    }

    public final int component1() {
        return this.version;
    }

    public final SetCmpVersion copy(int i10) {
        return new SetCmpVersion(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetCmpVersion) && this.version == ((SetCmpVersion) obj).version;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version);
    }

    public String toString() {
        return g.m(new StringBuilder("SetCmpVersion(version="), this.version, ')');
    }
}
