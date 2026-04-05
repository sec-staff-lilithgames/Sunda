package io.odeeo.internal.l1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    @lk.c("javascript_resource")
    private final b javascriptResource;

    @lk.c("vendor")
    private final String vendor;

    @lk.c("verification_parameters")
    private final String verificationParameters;

    public a() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ a copy$default(a aVar, b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = aVar.javascriptResource;
        }
        if ((i10 & 2) != 0) {
            str = aVar.vendor;
        }
        if ((i10 & 4) != 0) {
            str2 = aVar.verificationParameters;
        }
        return aVar.copy(bVar, str, str2);
    }

    public final b component1() {
        return this.javascriptResource;
    }

    public final String component2() {
        return this.vendor;
    }

    public final String component3() {
        return this.verificationParameters;
    }

    public final a copy(b javascriptResource, String vendor, String verificationParameters) {
        e0.checkNotNullParameter(javascriptResource, "javascriptResource");
        e0.checkNotNullParameter(vendor, "vendor");
        e0.checkNotNullParameter(verificationParameters, "verificationParameters");
        return new a(javascriptResource, vendor, verificationParameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.areEqual(this.javascriptResource, aVar.javascriptResource) && e0.areEqual(this.vendor, aVar.vendor) && e0.areEqual(this.verificationParameters, aVar.verificationParameters);
    }

    public final b getJavascriptResource() {
        return this.javascriptResource;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final String getVerificationParameters() {
        return this.verificationParameters;
    }

    public int hashCode() {
        return this.verificationParameters.hashCode() + o2.e(this.javascriptResource.hashCode() * 31, 31, this.vendor);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdVerification(javascriptResource=");
        sb2.append(this.javascriptResource);
        sb2.append(", vendor=");
        sb2.append(this.vendor);
        sb2.append(", verificationParameters=");
        return o2.q(sb2, this.verificationParameters, ')');
    }

    public a(b javascriptResource, String vendor, String verificationParameters) {
        e0.checkNotNullParameter(javascriptResource, "javascriptResource");
        e0.checkNotNullParameter(vendor, "vendor");
        e0.checkNotNullParameter(verificationParameters, "verificationParameters");
        this.javascriptResource = javascriptResource;
        this.vendor = vendor;
        this.verificationParameters = verificationParameters;
    }

    public /* synthetic */ a(b bVar, String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? new b(null, null, 3, null) : bVar, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
