package io.odeeo.sdk.advertisement.data;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lk.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Volume {
    private final double level;

    @c("silent_mode")
    private final Boolean silentMode;

    @c("silent_mode_enforced")
    private final Boolean silentModeEnforced;

    public Volume(Boolean bool, Boolean bool2, double d10) {
        this.silentMode = bool;
        this.silentModeEnforced = bool2;
        this.level = d10;
    }

    public static /* synthetic */ Volume copy$default(Volume volume, Boolean bool, Boolean bool2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = volume.silentMode;
        }
        if ((i10 & 2) != 0) {
            bool2 = volume.silentModeEnforced;
        }
        if ((i10 & 4) != 0) {
            d10 = volume.level;
        }
        return volume.copy(bool, bool2, d10);
    }

    public final Boolean component1() {
        return this.silentMode;
    }

    public final Boolean component2() {
        return this.silentModeEnforced;
    }

    public final double component3() {
        return this.level;
    }

    public final Volume copy(Boolean bool, Boolean bool2, double d10) {
        return new Volume(bool, bool2, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Volume)) {
            return false;
        }
        Volume volume = (Volume) obj;
        return e0.areEqual(this.silentMode, volume.silentMode) && e0.areEqual(this.silentModeEnforced, volume.silentModeEnforced) && e0.areEqual((Object) Double.valueOf(this.level), (Object) Double.valueOf(volume.level));
    }

    public final double getLevel() {
        return this.level;
    }

    public final Boolean getSilentMode() {
        return this.silentMode;
    }

    public final Boolean getSilentModeEnforced() {
        return this.silentModeEnforced;
    }

    public int hashCode() {
        Boolean bool = this.silentMode;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.silentModeEnforced;
        return Double.hashCode(this.level) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "Volume(silentMode=" + this.silentMode + ", silentModeEnforced=" + this.silentModeEnforced + ", level=" + this.level + ')';
    }

    public /* synthetic */ Volume(Boolean bool, Boolean bool2, double d10, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, d10);
    }
}
