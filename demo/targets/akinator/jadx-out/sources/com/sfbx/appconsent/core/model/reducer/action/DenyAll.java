package com.sfbx.appconsent.core.model.reducer.action;

import ac.Models;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DenyAll implements Action {
    private final Models.Consent.EnumConsentType consentType;
    private final List<Integer> excludedConsentables;

    /* JADX WARN: Multi-variable type inference failed */
    public DenyAll() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DenyAll copy$default(DenyAll denyAll, List list, Models.Consent.EnumConsentType enumConsentType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = denyAll.excludedConsentables;
        }
        if ((i10 & 2) != 0) {
            enumConsentType = denyAll.consentType;
        }
        return denyAll.copy(list, enumConsentType);
    }

    public final List<Integer> component1() {
        return this.excludedConsentables;
    }

    public final Models.Consent.EnumConsentType component2() {
        return this.consentType;
    }

    public final DenyAll copy(List<Integer> excludedConsentables, Models.Consent.EnumConsentType enumConsentType) {
        e0.checkNotNullParameter(excludedConsentables, "excludedConsentables");
        return new DenyAll(excludedConsentables, enumConsentType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DenyAll)) {
            return false;
        }
        DenyAll denyAll = (DenyAll) obj;
        return e0.areEqual(this.excludedConsentables, denyAll.excludedConsentables) && this.consentType == denyAll.consentType;
    }

    public final Models.Consent.EnumConsentType getConsentType() {
        return this.consentType;
    }

    public final List<Integer> getExcludedConsentables() {
        return this.excludedConsentables;
    }

    public int hashCode() {
        int iHashCode = this.excludedConsentables.hashCode() * 31;
        Models.Consent.EnumConsentType enumConsentType = this.consentType;
        return iHashCode + (enumConsentType == null ? 0 : enumConsentType.hashCode());
    }

    public String toString() {
        return "DenyAll(excludedConsentables=" + this.excludedConsentables + ", consentType=" + this.consentType + ')';
    }

    public DenyAll(List<Integer> excludedConsentables, Models.Consent.EnumConsentType enumConsentType) {
        e0.checkNotNullParameter(excludedConsentables, "excludedConsentables");
        this.excludedConsentables = excludedConsentables;
        this.consentType = enumConsentType;
    }

    public /* synthetic */ DenyAll(List list, Models.Consent.EnumConsentType enumConsentType, int i10, u uVar) {
        this((i10 & 1) != 0 ? p0.emptyList() : list, (i10 & 2) != 0 ? null : enumConsentType);
    }
}
