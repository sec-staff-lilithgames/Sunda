package io.odeeo.internal.e1;

import e3.g;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    @lk.c("ad_availability_data_callback_enabled")
    private boolean adAvailabilityDataCallbackEnabled;

    @lk.c("ad_frequency")
    private final int adFrequency;

    @lk.c("moat_enabled")
    private final boolean moatEnabled;

    public a() {
        this(false, 0, false, 7, null);
    }

    public static /* synthetic */ a copy$default(a aVar, boolean z10, int i10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = aVar.moatEnabled;
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.adFrequency;
        }
        if ((i11 & 4) != 0) {
            z11 = aVar.adAvailabilityDataCallbackEnabled;
        }
        return aVar.copy(z10, i10, z11);
    }

    public final boolean component1() {
        return this.moatEnabled;
    }

    public final int component2() {
        return this.adFrequency;
    }

    public final boolean component3() {
        return this.adAvailabilityDataCallbackEnabled;
    }

    public final a copy(boolean z10, int i10, boolean z11) {
        return new a(z10, i10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.moatEnabled == aVar.moatEnabled && this.adFrequency == aVar.adFrequency && this.adAvailabilityDataCallbackEnabled == aVar.adAvailabilityDataCallbackEnabled;
    }

    public final boolean getAdAvailabilityDataCallbackEnabled() {
        return this.adAvailabilityDataCallbackEnabled;
    }

    public final int getAdFrequency() {
        return this.adFrequency;
    }

    public final boolean getMoatEnabled() {
        return this.moatEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z10 = this.moatEnabled;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iD = g.d(this.adFrequency, r02 * 31, 31);
        boolean z11 = this.adAvailabilityDataCallbackEnabled;
        return iD + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final void setAdAvailabilityDataCallbackEnabled(boolean z10) {
        this.adAvailabilityDataCallbackEnabled = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppConfig(moatEnabled=");
        sb2.append(this.moatEnabled);
        sb2.append(", adFrequency=");
        sb2.append(this.adFrequency);
        sb2.append(", adAvailabilityDataCallbackEnabled=");
        return a.b.p(sb2, this.adAvailabilityDataCallbackEnabled, ')');
    }

    public a(boolean z10, int i10, boolean z11) {
        this.moatEnabled = z10;
        this.adFrequency = i10;
        this.adAvailabilityDataCallbackEnabled = z11;
    }

    public /* synthetic */ a(boolean z10, int i10, boolean z11, int i11, u uVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z11);
    }
}
