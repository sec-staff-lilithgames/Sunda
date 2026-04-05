package com.unity3d.ads.core.data.datasource;

import a.b;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class VolumeSettingsChange {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z10) {
            super(null);
            this.isMuted = z10;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = muteChange.isMuted;
            }
            return muteChange.copy(z10);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        public final MuteChange copy(boolean z10) {
            return new MuteChange(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted;
        }

        public int hashCode() {
            boolean z10 = this.isMuted;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        public String toString() {
            return b.p(new StringBuilder("MuteChange(isMuted="), this.isMuted, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d10) {
            super(null);
            this.volume = d10;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = volumeChange.volume;
            }
            return volumeChange.copy(d10);
        }

        public final double component1() {
            return this.volume;
        }

        public final VolumeChange copy(double d10) {
            return new VolumeChange(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0;
        }

        public final double getVolume() {
            return this.volume;
        }

        public int hashCode() {
            return Double.hashCode(this.volume);
        }

        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    public /* synthetic */ VolumeSettingsChange(u uVar) {
        this();
    }

    private VolumeSettingsChange() {
    }
}
