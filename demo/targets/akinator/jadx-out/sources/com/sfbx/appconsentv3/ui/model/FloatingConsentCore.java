package com.sfbx.appconsentv3.ui.model;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FloatingConsentCore {
    private final Map<String, String> externalIds;
    private final String givenAt;

    /* renamed from: id, reason: collision with root package name */
    private final String f50542id;
    private final ACConsentStatus status;
    private final String uuid;
    private final Integer version;

    public FloatingConsentCore() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ FloatingConsentCore copy$default(FloatingConsentCore floatingConsentCore, String str, Map map, Integer num, String str2, String str3, ACConsentStatus aCConsentStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = floatingConsentCore.f50542id;
        }
        if ((i10 & 2) != 0) {
            map = floatingConsentCore.externalIds;
        }
        if ((i10 & 4) != 0) {
            num = floatingConsentCore.version;
        }
        if ((i10 & 8) != 0) {
            str2 = floatingConsentCore.uuid;
        }
        if ((i10 & 16) != 0) {
            str3 = floatingConsentCore.givenAt;
        }
        if ((i10 & 32) != 0) {
            aCConsentStatus = floatingConsentCore.status;
        }
        String str4 = str3;
        ACConsentStatus aCConsentStatus2 = aCConsentStatus;
        return floatingConsentCore.copy(str, map, num, str2, str4, aCConsentStatus2);
    }

    public final String component1() {
        return this.f50542id;
    }

    public final Map<String, String> component2() {
        return this.externalIds;
    }

    public final Integer component3() {
        return this.version;
    }

    public final String component4() {
        return this.uuid;
    }

    public final String component5() {
        return this.givenAt;
    }

    public final ACConsentStatus component6() {
        return this.status;
    }

    public final FloatingConsentCore copy(String str, Map<String, String> map, Integer num, String str2, String str3, ACConsentStatus aCConsentStatus) {
        return new FloatingConsentCore(str, map, num, str2, str3, aCConsentStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatingConsentCore)) {
            return false;
        }
        FloatingConsentCore floatingConsentCore = (FloatingConsentCore) obj;
        return e0.areEqual(this.f50542id, floatingConsentCore.f50542id) && e0.areEqual(this.externalIds, floatingConsentCore.externalIds) && e0.areEqual(this.version, floatingConsentCore.version) && e0.areEqual(this.uuid, floatingConsentCore.uuid) && e0.areEqual(this.givenAt, floatingConsentCore.givenAt) && this.status == floatingConsentCore.status;
    }

    public final Map<String, String> getExternalIds() {
        return this.externalIds;
    }

    public final String getGivenAt() {
        return this.givenAt;
    }

    public final String getId() {
        return this.f50542id;
    }

    public final ACConsentStatus getStatus() {
        return this.status;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.f50542id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.externalIds;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.version;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.uuid;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.givenAt;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ACConsentStatus aCConsentStatus = this.status;
        return iHashCode5 + (aCConsentStatus != null ? aCConsentStatus.hashCode() : 0);
    }

    public String toString() {
        return "FloatingConsentCore(id=" + this.f50542id + ", externalIds=" + this.externalIds + ", version=" + this.version + ", uuid=" + this.uuid + ", givenAt=" + this.givenAt + ", status=" + this.status + ')';
    }

    public FloatingConsentCore(String str, Map<String, String> map, Integer num, String str2, String str3, ACConsentStatus aCConsentStatus) {
        this.f50542id = str;
        this.externalIds = map;
        this.version = num;
        this.uuid = str2;
        this.givenAt = str3;
        this.status = aCConsentStatus;
    }

    public /* synthetic */ FloatingConsentCore(String str, Map map, Integer num, String str2, String str3, ACConsentStatus aCConsentStatus, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : aCConsentStatus);
    }
}
