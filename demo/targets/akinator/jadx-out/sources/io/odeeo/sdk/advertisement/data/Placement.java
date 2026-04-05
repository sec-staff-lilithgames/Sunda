package io.odeeo.sdk.advertisement.data;

import kotlin.jvm.internal.e0;
import lk.c;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Placement {

    @c("custom_tag")
    private final String customTag;

    /* renamed from: id, reason: collision with root package name */
    private final int f68023id;

    public Placement(int i10, String customTag) {
        e0.checkNotNullParameter(customTag, "customTag");
        this.f68023id = i10;
        this.customTag = customTag;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = placement.f68023id;
        }
        if ((i11 & 2) != 0) {
            str = placement.customTag;
        }
        return placement.copy(i10, str);
    }

    public final int component1() {
        return this.f68023id;
    }

    public final String component2() {
        return this.customTag;
    }

    public final Placement copy(int i10, String customTag) {
        e0.checkNotNullParameter(customTag, "customTag");
        return new Placement(i10, customTag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) obj;
        return this.f68023id == placement.f68023id && e0.areEqual(this.customTag, placement.customTag);
    }

    public final String getCustomTag() {
        return this.customTag;
    }

    public final int getId() {
        return this.f68023id;
    }

    public int hashCode() {
        return this.customTag.hashCode() + (Integer.hashCode(this.f68023id) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Placement(id=");
        sb2.append(this.f68023id);
        sb2.append(", customTag=");
        return o2.q(sb2, this.customTag, ')');
    }
}
