package io.odeeo.sdk.config.data;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ExtendedUserId {

    /* renamed from: id, reason: collision with root package name */
    private final String f68071id;
    private final String partner;

    public ExtendedUserId(String partner, String id2) {
        e0.checkNotNullParameter(partner, "partner");
        e0.checkNotNullParameter(id2, "id");
        this.partner = partner;
        this.f68071id = id2;
    }

    public static /* synthetic */ ExtendedUserId copy$default(ExtendedUserId extendedUserId, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = extendedUserId.partner;
        }
        if ((i10 & 2) != 0) {
            str2 = extendedUserId.f68071id;
        }
        return extendedUserId.copy(str, str2);
    }

    public final String component1() {
        return this.partner;
    }

    public final String component2() {
        return this.f68071id;
    }

    public final ExtendedUserId copy(String partner, String id2) {
        e0.checkNotNullParameter(partner, "partner");
        e0.checkNotNullParameter(id2, "id");
        return new ExtendedUserId(partner, id2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedUserId)) {
            return false;
        }
        ExtendedUserId extendedUserId = (ExtendedUserId) obj;
        return e0.areEqual(this.partner, extendedUserId.partner) && e0.areEqual(this.f68071id, extendedUserId.f68071id);
    }

    public final String getId() {
        return this.f68071id;
    }

    public final String getPartner() {
        return this.partner;
    }

    public int hashCode() {
        return this.f68071id.hashCode() + (this.partner.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedUserId(partner=");
        sb2.append(this.partner);
        sb2.append(", id=");
        return o2.q(sb2, this.f68071id, ')');
    }
}
