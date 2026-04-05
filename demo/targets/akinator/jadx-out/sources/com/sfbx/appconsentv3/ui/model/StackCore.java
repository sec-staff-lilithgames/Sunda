package com.sfbx.appconsentv3.ui.model;

import j1.o2;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackCore {
    private final List<Integer> consentables;
    private final I18NStringCore description;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50543id;
    private final ACConsentStatus legintStatus;
    private final I18NStringCore name;
    private final ACConsentStatus status;

    public StackCore(int i10, Integer num, I18NStringCore name, I18NStringCore description, List<Integer> consentables, ACConsentStatus status, ACConsentStatus legintStatus) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        this.f50543id = i10;
        this.iabId = num;
        this.name = name;
        this.description = description;
        this.consentables = consentables;
        this.status = status;
        this.legintStatus = legintStatus;
    }

    public static /* synthetic */ StackCore copy$default(StackCore stackCore, int i10, Integer num, I18NStringCore i18NStringCore, I18NStringCore i18NStringCore2, List list, ACConsentStatus aCConsentStatus, ACConsentStatus aCConsentStatus2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = stackCore.f50543id;
        }
        if ((i11 & 2) != 0) {
            num = stackCore.iabId;
        }
        if ((i11 & 4) != 0) {
            i18NStringCore = stackCore.name;
        }
        if ((i11 & 8) != 0) {
            i18NStringCore2 = stackCore.description;
        }
        if ((i11 & 16) != 0) {
            list = stackCore.consentables;
        }
        if ((i11 & 32) != 0) {
            aCConsentStatus = stackCore.status;
        }
        if ((i11 & 64) != 0) {
            aCConsentStatus2 = stackCore.legintStatus;
        }
        ACConsentStatus aCConsentStatus3 = aCConsentStatus;
        ACConsentStatus aCConsentStatus4 = aCConsentStatus2;
        List list2 = list;
        I18NStringCore i18NStringCore3 = i18NStringCore;
        return stackCore.copy(i10, num, i18NStringCore3, i18NStringCore2, list2, aCConsentStatus3, aCConsentStatus4);
    }

    public final int component1() {
        return this.f50543id;
    }

    public final Integer component2() {
        return this.iabId;
    }

    public final I18NStringCore component3() {
        return this.name;
    }

    public final I18NStringCore component4() {
        return this.description;
    }

    public final List<Integer> component5() {
        return this.consentables;
    }

    public final ACConsentStatus component6() {
        return this.status;
    }

    public final ACConsentStatus component7() {
        return this.legintStatus;
    }

    public final StackCore copy(int i10, Integer num, I18NStringCore name, I18NStringCore description, List<Integer> consentables, ACConsentStatus status, ACConsentStatus legintStatus) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        return new StackCore(i10, num, name, description, consentables, status, legintStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackCore)) {
            return false;
        }
        StackCore stackCore = (StackCore) obj;
        return this.f50543id == stackCore.f50543id && e0.areEqual(this.iabId, stackCore.iabId) && e0.areEqual(this.name, stackCore.name) && e0.areEqual(this.description, stackCore.description) && e0.areEqual(this.consentables, stackCore.consentables) && this.status == stackCore.status && this.legintStatus == stackCore.legintStatus;
    }

    public final List<Integer> getConsentables() {
        return this.consentables;
    }

    public final I18NStringCore getDescription() {
        return this.description;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final int getId() {
        return this.f50543id;
    }

    public final ACConsentStatus getLegintStatus() {
        return this.legintStatus;
    }

    public final I18NStringCore getName() {
        return this.name;
    }

    public final ACConsentStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50543id) * 31;
        Integer num = this.iabId;
        return this.legintStatus.hashCode() + ((this.status.hashCode() + o2.c((this.description.hashCode() + ((this.name.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31, this.consentables)) * 31);
    }

    public String toString() {
        return "StackCore(id=" + this.f50543id + ", iabId=" + this.iabId + ", name=" + this.name + ", description=" + this.description + ", consentables=" + this.consentables + ", status=" + this.status + ", legintStatus=" + this.legintStatus + ')';
    }

    public /* synthetic */ StackCore(int i10, Integer num, I18NStringCore i18NStringCore, I18NStringCore i18NStringCore2, List list, ACConsentStatus aCConsentStatus, ACConsentStatus aCConsentStatus2, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : num, i18NStringCore, i18NStringCore2, (i11 & 16) != 0 ? p0.emptyList() : list, (i11 & 32) != 0 ? ACConsentStatus.PENDING : aCConsentStatus, (i11 & 64) != 0 ? ACConsentStatus.PENDING : aCConsentStatus2);
    }
}
