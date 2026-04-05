package com.sfbx.appconsentv3.ui.model;

import androidx.core.app.NotificationCompat;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableCore {
    private final I18NStringCore description;
    private final I18NStringCore descriptionLegal;
    private final String extraId;
    private final Integer iabId;

    /* renamed from: id, reason: collision with root package name */
    private final int f50540id;
    private final I18NStringCore illustrations;
    private final ACConsentStatus legintStatus;
    private final I18NStringCore name;
    private final ACConsentStatus status;
    private final int type;

    public ConsentableCore(int i10, Integer num, String str, I18NStringCore name, I18NStringCore description, I18NStringCore descriptionLegal, I18NStringCore i18NStringCore, int i11, ACConsentStatus status, ACConsentStatus legintStatus) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        this.f50540id = i10;
        this.iabId = num;
        this.extraId = str;
        this.name = name;
        this.description = description;
        this.descriptionLegal = descriptionLegal;
        this.illustrations = i18NStringCore;
        this.type = i11;
        this.status = status;
        this.legintStatus = legintStatus;
    }

    public static /* synthetic */ ConsentableCore copy$default(ConsentableCore consentableCore, int i10, Integer num, String str, I18NStringCore i18NStringCore, I18NStringCore i18NStringCore2, I18NStringCore i18NStringCore3, I18NStringCore i18NStringCore4, int i11, ACConsentStatus aCConsentStatus, ACConsentStatus aCConsentStatus2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = consentableCore.f50540id;
        }
        if ((i12 & 2) != 0) {
            num = consentableCore.iabId;
        }
        if ((i12 & 4) != 0) {
            str = consentableCore.extraId;
        }
        if ((i12 & 8) != 0) {
            i18NStringCore = consentableCore.name;
        }
        if ((i12 & 16) != 0) {
            i18NStringCore2 = consentableCore.description;
        }
        if ((i12 & 32) != 0) {
            i18NStringCore3 = consentableCore.descriptionLegal;
        }
        if ((i12 & 64) != 0) {
            i18NStringCore4 = consentableCore.illustrations;
        }
        if ((i12 & 128) != 0) {
            i11 = consentableCore.type;
        }
        if ((i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            aCConsentStatus = consentableCore.status;
        }
        if ((i12 & 512) != 0) {
            aCConsentStatus2 = consentableCore.legintStatus;
        }
        ACConsentStatus aCConsentStatus3 = aCConsentStatus;
        ACConsentStatus aCConsentStatus4 = aCConsentStatus2;
        I18NStringCore i18NStringCore5 = i18NStringCore4;
        int i13 = i11;
        I18NStringCore i18NStringCore6 = i18NStringCore2;
        I18NStringCore i18NStringCore7 = i18NStringCore3;
        return consentableCore.copy(i10, num, str, i18NStringCore, i18NStringCore6, i18NStringCore7, i18NStringCore5, i13, aCConsentStatus3, aCConsentStatus4);
    }

    public final int component1() {
        return this.f50540id;
    }

    public final ACConsentStatus component10() {
        return this.legintStatus;
    }

    public final Integer component2() {
        return this.iabId;
    }

    public final String component3() {
        return this.extraId;
    }

    public final I18NStringCore component4() {
        return this.name;
    }

    public final I18NStringCore component5() {
        return this.description;
    }

    public final I18NStringCore component6() {
        return this.descriptionLegal;
    }

    public final I18NStringCore component7() {
        return this.illustrations;
    }

    public final int component8() {
        return this.type;
    }

    public final ACConsentStatus component9() {
        return this.status;
    }

    public final ConsentableCore copy(int i10, Integer num, String str, I18NStringCore name, I18NStringCore description, I18NStringCore descriptionLegal, I18NStringCore i18NStringCore, int i11, ACConsentStatus status, ACConsentStatus legintStatus) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(descriptionLegal, "descriptionLegal");
        e0.checkNotNullParameter(status, "status");
        e0.checkNotNullParameter(legintStatus, "legintStatus");
        return new ConsentableCore(i10, num, str, name, description, descriptionLegal, i18NStringCore, i11, status, legintStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentableCore)) {
            return false;
        }
        ConsentableCore consentableCore = (ConsentableCore) obj;
        return this.f50540id == consentableCore.f50540id && e0.areEqual(this.iabId, consentableCore.iabId) && e0.areEqual(this.extraId, consentableCore.extraId) && e0.areEqual(this.name, consentableCore.name) && e0.areEqual(this.description, consentableCore.description) && e0.areEqual(this.descriptionLegal, consentableCore.descriptionLegal) && e0.areEqual(this.illustrations, consentableCore.illustrations) && this.type == consentableCore.type && this.status == consentableCore.status && this.legintStatus == consentableCore.legintStatus;
    }

    public final I18NStringCore getDescription() {
        return this.description;
    }

    public final I18NStringCore getDescriptionLegal() {
        return this.descriptionLegal;
    }

    public final String getExtraId() {
        return this.extraId;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final int getId() {
        return this.f50540id;
    }

    public final I18NStringCore getIllustrations() {
        return this.illustrations;
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

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50540id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extraId;
        int iHashCode3 = (this.descriptionLegal.hashCode() + ((this.description.hashCode() + ((this.name.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        I18NStringCore i18NStringCore = this.illustrations;
        return this.legintStatus.hashCode() + ((this.status.hashCode() + g.d(this.type, (iHashCode3 + (i18NStringCore != null ? i18NStringCore.hashCode() : 0)) * 31, 31)) * 31);
    }

    public String toString() {
        return "ConsentableCore(id=" + this.f50540id + ", iabId=" + this.iabId + ", extraId=" + this.extraId + ", name=" + this.name + ", description=" + this.description + ", descriptionLegal=" + this.descriptionLegal + ", illustrations=" + this.illustrations + ", type=" + this.type + ", status=" + this.status + ", legintStatus=" + this.legintStatus + ')';
    }

    public /* synthetic */ ConsentableCore(int i10, Integer num, String str, I18NStringCore i18NStringCore, I18NStringCore i18NStringCore2, I18NStringCore i18NStringCore3, I18NStringCore i18NStringCore4, int i11, ACConsentStatus aCConsentStatus, ACConsentStatus aCConsentStatus2, int i12, u uVar) {
        this(i10, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str, i18NStringCore, i18NStringCore2, i18NStringCore3, (i12 & 64) != 0 ? null : i18NStringCore4, (i12 & 128) != 0 ? 0 : i11, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? ACConsentStatus.PENDING : aCConsentStatus, (i12 & 512) != 0 ? ACConsentStatus.PENDING : aCConsentStatus2);
    }
}
