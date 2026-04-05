package com.moloco.sdk.internal.mediators;

import kotlin.jvm.internal.e0;
import tv.h;
import tv.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {
    public static final long a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return h.toDuration(8, i.f87442g);
                    }
                } else if (str.equals("AdMob")) {
                    return h.toDuration(8, i.f87442g);
                }
            } else if (str.equals("MAX")) {
                return h.toDuration(8, i.f87442g);
            }
        }
        return h.toDuration(60, i.f87442g);
    }

    public static final long b(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return h.toDuration(26, i.f87442g);
                    }
                } else if (str.equals("AdMob")) {
                    return h.toDuration(26, i.f87442g);
                }
            } else if (str.equals("MAX")) {
                return h.toDuration(26, i.f87442g);
            }
        }
        return h.toDuration(60, i.f87442g);
    }

    public static final long c(String str) {
        return e0.areEqual(str, "MAX") ? h.toDuration(8, i.f87442g) : e0.areEqual(str, "AdMob") ? h.toDuration(58, i.f87442g) : h.toDuration(60, i.f87442g);
    }
}
