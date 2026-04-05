package com.inmobi.unification.sdk.model.Initialization;

import com.inmobi.media.Le;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TimeoutConfigurations$RenderTimeoutByType {
    public static final Le Companion = new Le();
    private int audio;
    private int banner;

    /* renamed from: int, reason: not valid java name */
    private int f179int;

    /* renamed from: native, reason: not valid java name */
    private int f180native;

    public /* synthetic */ TimeoutConfigurations$RenderTimeoutByType(u uVar) {
        this();
    }

    public final int getAudio$media_release() {
        return this.audio;
    }

    public final int getBanner$media_release() {
        return this.banner;
    }

    public final int getInt$media_release() {
        return this.f179int;
    }

    public final int getNative$media_release() {
        return this.f180native;
    }

    public final int getTimeoutByType$media_release(String adType, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        e0.checkNotNullParameter(adType, "adType");
        int iHashCode = adType.hashCode();
        if (iHashCode != -1396342996) {
            if (iHashCode != -1052618729) {
                if (iHashCode != 104431) {
                    if (iHashCode == 93166550 && adType.equals("audio") && (i14 = this.audio) > 0) {
                        return i14;
                    }
                } else if (adType.equals("int") && (i13 = this.f179int) > 0) {
                    return i13;
                }
            } else if (adType.equals("native") && (i12 = this.f180native) > 0) {
                return i12;
            }
        } else if (adType.equals("banner") && (i11 = this.banner) > 0) {
            return i11;
        }
        return i10;
    }

    public final void setAudio$media_release(int i10) {
        this.audio = i10;
    }

    public final void setBanner$media_release(int i10) {
        this.banner = i10;
    }

    public final void setInt$media_release(int i10) {
        this.f179int = i10;
    }

    public final void setNative$media_release(int i10) {
        this.f180native = i10;
    }

    public final void setTimeoutByType(String adType, int i10) {
        e0.checkNotNullParameter(adType, "adType");
        int iHashCode = adType.hashCode();
        if (iHashCode == -1396342996) {
            if (adType.equals("banner")) {
                this.banner = i10;
            }
        } else if (iHashCode == -1052618729) {
            if (adType.equals("native")) {
                this.f180native = i10;
            }
        } else if (iHashCode == 104431) {
            if (adType.equals("int")) {
                this.f179int = i10;
            }
        } else if (iHashCode == 93166550 && adType.equals("audio")) {
            this.audio = i10;
        }
    }

    private TimeoutConfigurations$RenderTimeoutByType() {
    }
}
