package com.inmobi.unifiedId;

import com.inmobi.media.AbstractC2962r0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiUserDataTypes {
    private final String md5;
    private final String sha1;
    private final String sha256;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f33740a;

        /* renamed from: b, reason: collision with root package name */
        public String f33741b;

        /* renamed from: c, reason: collision with root package name */
        public String f33742c;

        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f33740a, this.f33741b, this.f33742c);
        }

        public final Builder md5(String str) {
            this.f33740a = str;
            return this;
        }

        public final Builder sha1(String str) {
            this.f33741b = str;
            return this;
        }

        public final Builder sha256(String str) {
            this.f33742c = str;
            return this;
        }
    }

    public InMobiUserDataTypes(String str, String str2, String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inMobiUserDataTypes.md5;
        }
        if ((i10 & 2) != 0) {
            str2 = inMobiUserDataTypes.sha1;
        }
        if ((i10 & 4) != 0) {
            str3 = inMobiUserDataTypes.sha256;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    public final String component1() {
        return this.md5;
    }

    public final String component2() {
        return this.sha1;
    }

    public final String component3() {
        return this.sha256;
    }

    public final InMobiUserDataTypes copy(String str, String str2, String str3) {
        return new InMobiUserDataTypes(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) obj;
        return e0.areEqual(this.md5, inMobiUserDataTypes.md5) && e0.areEqual(this.sha1, inMobiUserDataTypes.sha1) && e0.areEqual(this.sha256, inMobiUserDataTypes.sha256);
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        String str = this.md5;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sha256;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InMobiUserDataTypes(md5=");
        sb2.append(this.md5);
        sb2.append(", sha1=");
        sb2.append(this.sha1);
        sb2.append(", sha256=");
        return AbstractC2962r0.a(sb2, this.sha256, ')');
    }
}
