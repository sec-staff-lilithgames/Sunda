package com.sfbx.appconsentv3.ui.model;

import be.nVUQ.UupKET;
import com.sfbx.appconsent.core.model.ExportConsentable;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACExportConsentable {
    private final String extraId;
    private final Integer iabId;
    private ACConsentStatus status;
    private final ACConsentableType type;

    public ACExportConsentable() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ACExportConsentable copy$default(ACExportConsentable aCExportConsentable, Integer num, String str, ACConsentableType aCConsentableType, ACConsentStatus aCConsentStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = aCExportConsentable.iabId;
        }
        if ((i10 & 2) != 0) {
            str = aCExportConsentable.extraId;
        }
        if ((i10 & 4) != 0) {
            aCConsentableType = aCExportConsentable.type;
        }
        if ((i10 & 8) != 0) {
            aCConsentStatus = aCExportConsentable.status;
        }
        return aCExportConsentable.copy(num, str, aCConsentableType, aCConsentStatus);
    }

    public final Integer component1() {
        return this.iabId;
    }

    public final String component2() {
        return this.extraId;
    }

    public final ACConsentableType component3() {
        return this.type;
    }

    public final ACConsentStatus component4() {
        return this.status;
    }

    public final ExportConsentable convertTo$appconsent_ui_v3_prodXchangeRelease() {
        return new ExportConsentable(this.iabId, this.extraId, this.type.convertTo$appconsent_ui_v3_prodXchangeRelease(), this.status.convertTo$appconsent_ui_v3_prodXchangeRelease());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACExportConsentable)) {
            return false;
        }
        ACExportConsentable aCExportConsentable = (ACExportConsentable) obj;
        return e0.areEqual(this.iabId, aCExportConsentable.iabId) && e0.areEqual(this.extraId, aCExportConsentable.extraId) && this.type == aCExportConsentable.type && this.status == aCExportConsentable.status;
    }

    public final String getExtraId() {
        return this.extraId;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final ACConsentStatus getStatus() {
        return this.status;
    }

    public final ACConsentableType getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.iabId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.extraId;
        return this.status.hashCode() + ((this.type.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final void setStatus(ACConsentStatus aCConsentStatus) {
        e0.checkNotNullParameter(aCConsentStatus, "<set-?>");
        this.status = aCConsentStatus;
    }

    public String toString() {
        return "ACExportConsentable(iabId=" + this.iabId + ", extraId=" + this.extraId + ", type=" + this.type + ", status=" + this.status + ')';
    }

    public ACExportConsentable(Integer num, String str, ACConsentableType type, ACConsentStatus status) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(status, "status");
        this.iabId = num;
        this.extraId = str;
        this.type = type;
        this.status = status;
    }

    public final ACExportConsentable copy(Integer num, String str, ACConsentableType type, ACConsentStatus aCConsentStatus) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(aCConsentStatus, UupKET.YGHfLjPbGx);
        return new ACExportConsentable(num, str, type, aCConsentStatus);
    }

    public /* synthetic */ ACExportConsentable(Integer num, String str, ACConsentableType aCConsentableType, ACConsentStatus aCConsentStatus, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? ACConsentableType.UNKNOWN : aCConsentableType, (i10 & 8) != 0 ? ACConsentStatus.PENDING : aCConsentStatus);
    }
}
