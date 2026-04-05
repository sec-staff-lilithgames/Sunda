package com.moloco.sdk.publisher.privacy;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoPrivacy {
    public static final MolocoPrivacy INSTANCE = new MolocoPrivacy();
    private static PrivacySettings privacySettings = new PrivacySettings((Boolean) null, (Boolean) null, (Boolean) null, 7, (u) null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PrivacySettings {
        public static final int $stable = 8;
        private String TCFConsent;
        private String _usPrivacy;
        private final Boolean isAgeRestrictedUser;
        private final Boolean isDoNotSell;
        private final Boolean isUserConsent;

        public PrivacySettings() {
            this((Boolean) null, (Boolean) null, (Boolean) null, 7, (u) null);
        }

        private final String getUSPrivacy(Boolean bool) {
            return bool == null ? "1---" : e0.areEqual(bool, Boolean.TRUE) ? "1-Y-" : "1-N-";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrivacySettings)) {
                return false;
            }
            PrivacySettings privacySettings = (PrivacySettings) obj;
            return e0.areEqual(this.isUserConsent, privacySettings.isUserConsent) && e0.areEqual(this.isAgeRestrictedUser, privacySettings.isAgeRestrictedUser) && e0.areEqual(this.isDoNotSell, privacySettings.isDoNotSell) && e0.areEqual(this.TCFConsent, privacySettings.TCFConsent);
        }

        public final String getTCFConsent() {
            return this.TCFConsent;
        }

        public final String getUsPrivacy() {
            return this._usPrivacy;
        }

        public int hashCode() {
            Boolean bool = this.isUserConsent;
            int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
            Boolean bool2 = this.isAgeRestrictedUser;
            int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.isDoNotSell;
            int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            String str = this.TCFConsent;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isAgeRestrictedUser() {
            return this.isAgeRestrictedUser;
        }

        public final Boolean isDoNotSell() {
            return this.isDoNotSell;
        }

        public final Boolean isUserConsent() {
            return this.isUserConsent;
        }

        public PrivacySettings(Boolean bool, Boolean bool2, Boolean bool3) {
            this.isUserConsent = bool;
            this.isAgeRestrictedUser = bool2;
            this.isDoNotSell = bool3;
            this._usPrivacy = getUSPrivacy(bool3);
        }

        public /* synthetic */ PrivacySettings(Boolean bool, Boolean bool2, Boolean bool3, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3);
        }

        public PrivacySettings(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
            this(bool, bool2, bool3);
            this.TCFConsent = str;
            if (str2 != null) {
                this._usPrivacy = str2;
            }
        }
    }

    private MolocoPrivacy() {
    }

    public static final void setPrivacy(PrivacySettings privacySettings2) {
        e0.checkNotNullParameter(privacySettings2, "privacySettings");
        privacySettings = privacySettings2;
    }

    public final PrivacySettings getPrivacySettings() {
        return privacySettings;
    }

    public final void setPrivacySettings(PrivacySettings privacySettings2) {
        e0.checkNotNullParameter(privacySettings2, "<set-?>");
        privacySettings = privacySettings2;
    }
}
