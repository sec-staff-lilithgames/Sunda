package com.inmobi.unifiedId;

import java.util.HashMap;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiUserDataModel {

    /* renamed from: a, reason: collision with root package name */
    public final InMobiUserDataTypes f33734a;

    /* renamed from: b, reason: collision with root package name */
    public final InMobiUserDataTypes f33735b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f33736c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public InMobiUserDataTypes f33737a;

        /* renamed from: b, reason: collision with root package name */
        public InMobiUserDataTypes f33738b;

        /* renamed from: c, reason: collision with root package name */
        public HashMap f33739c;

        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f33737a, this.f33738b, this.f33739c);
        }

        public final Builder emailId(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f33738b = inMobiUserDataTypes;
            return this;
        }

        public final Builder extras(HashMap<String, String> map) {
            this.f33739c = map;
            return this;
        }

        public final Builder phoneNumber(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f33737a = inMobiUserDataTypes;
            return this;
        }
    }

    public InMobiUserDataModel(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> map) {
        this.f33734a = inMobiUserDataTypes;
        this.f33735b = inMobiUserDataTypes2;
        this.f33736c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.f33734a;
        }
        if ((i10 & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.f33735b;
        }
        if ((i10 & 4) != 0) {
            map = inMobiUserDataModel.f33736c;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    public final InMobiUserDataTypes component1() {
        return this.f33734a;
    }

    public final InMobiUserDataTypes component2() {
        return this.f33735b;
    }

    public final HashMap<String, String> component3() {
        return this.f33736c;
    }

    public final InMobiUserDataModel copy(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> map) {
        return new InMobiUserDataModel(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
        return e0.areEqual(this.f33734a, inMobiUserDataModel.f33734a) && e0.areEqual(this.f33735b, inMobiUserDataModel.f33735b) && e0.areEqual(this.f33736c, inMobiUserDataModel.f33736c);
    }

    public final InMobiUserDataTypes getEmailId() {
        return this.f33735b;
    }

    public final HashMap<String, String> getExtras() {
        return this.f33736c;
    }

    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f33734a;
    }

    public int hashCode() {
        InMobiUserDataTypes inMobiUserDataTypes = this.f33734a;
        int iHashCode = (inMobiUserDataTypes == null ? 0 : inMobiUserDataTypes.hashCode()) * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.f33735b;
        int iHashCode2 = (iHashCode + (inMobiUserDataTypes2 == null ? 0 : inMobiUserDataTypes2.hashCode())) * 31;
        HashMap map = this.f33736c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.f33734a + ", emailId=" + this.f33735b + ", extras=" + this.f33736c + ')';
    }
}
