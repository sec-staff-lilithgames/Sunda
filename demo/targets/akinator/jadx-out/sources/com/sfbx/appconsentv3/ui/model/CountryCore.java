package com.sfbx.appconsentv3.ui.model;

import a.b;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CountryCore {
    private final String code;
    private final boolean gdpr;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryCore() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CountryCore copy$default(CountryCore countryCore, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = countryCore.code;
        }
        if ((i10 & 2) != 0) {
            z10 = countryCore.gdpr;
        }
        return countryCore.copy(str, z10);
    }

    public final String component1() {
        return this.code;
    }

    public final boolean component2() {
        return this.gdpr;
    }

    public final CountryCore copy(String code, boolean z10) {
        e0.checkNotNullParameter(code, "code");
        return new CountryCore(code, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryCore)) {
            return false;
        }
        CountryCore countryCore = (CountryCore) obj;
        return e0.areEqual(this.code, countryCore.code) && this.gdpr == countryCore.gdpr;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getGdpr() {
        return this.gdpr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        boolean z10 = this.gdpr;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CountryCore(code=");
        sb2.append(this.code);
        sb2.append(", gdpr=");
        return b.p(sb2, this.gdpr, ')');
    }

    public CountryCore(String code, boolean z10) {
        e0.checkNotNullParameter(code, "code");
        this.code = code;
        this.gdpr = z10;
    }

    public /* synthetic */ CountryCore(String str, boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
