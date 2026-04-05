package com.sfbx.appconsent.core.model.reducer.action;

import j1.o2;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AllowAll implements Action {
    private final List<Integer> excludedConsentables;

    /* JADX WARN: Multi-variable type inference failed */
    public AllowAll() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllowAll copy$default(AllowAll allowAll, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = allowAll.excludedConsentables;
        }
        return allowAll.copy(list);
    }

    public final List<Integer> component1() {
        return this.excludedConsentables;
    }

    public final AllowAll copy(List<Integer> excludedConsentables) {
        e0.checkNotNullParameter(excludedConsentables, "excludedConsentables");
        return new AllowAll(excludedConsentables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowAll) && e0.areEqual(this.excludedConsentables, ((AllowAll) obj).excludedConsentables);
    }

    public final List<Integer> getExcludedConsentables() {
        return this.excludedConsentables;
    }

    public int hashCode() {
        return this.excludedConsentables.hashCode();
    }

    public String toString() {
        return o2.p(new StringBuilder("AllowAll(excludedConsentables="), this.excludedConsentables, ')');
    }

    public AllowAll(List<Integer> excludedConsentables) {
        e0.checkNotNullParameter(excludedConsentables, "excludedConsentables");
        this.excludedConsentables = excludedConsentables;
    }

    public /* synthetic */ AllowAll(List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? p0.emptyList() : list);
    }
}
