package com.sfbx.appconsentv3.ui.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorUrlCore {
    private final String legintClaim;
    private final String privacy;

    /* JADX WARN: Multi-variable type inference failed */
    public VendorUrlCore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VendorUrlCore copy$default(VendorUrlCore vendorUrlCore, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vendorUrlCore.privacy;
        }
        if ((i10 & 2) != 0) {
            str2 = vendorUrlCore.legintClaim;
        }
        return vendorUrlCore.copy(str, str2);
    }

    public final String component1() {
        return this.privacy;
    }

    public final String component2() {
        return this.legintClaim;
    }

    public final VendorUrlCore copy(String str, String str2) {
        return new VendorUrlCore(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorUrlCore)) {
            return false;
        }
        VendorUrlCore vendorUrlCore = (VendorUrlCore) obj;
        return e0.areEqual(this.privacy, vendorUrlCore.privacy) && e0.areEqual(this.legintClaim, vendorUrlCore.legintClaim);
    }

    public final String getLegintClaim() {
        return this.legintClaim;
    }

    public final String getPrivacy() {
        return this.privacy;
    }

    public int hashCode() {
        String str = this.privacy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.legintClaim;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VendorUrlCore(privacy=");
        sb2.append(this.privacy);
        sb2.append(", legintClaim=");
        return o2.q(sb2, this.legintClaim, ')');
    }

    public VendorUrlCore(String str, String str2) {
        this.privacy = str;
        this.legintClaim = str2;
    }

    public /* synthetic */ VendorUrlCore(String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
