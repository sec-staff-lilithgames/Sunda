package com.sfbx.appconsent.core.model;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum ConsentStatus {
    PENDING(0),
    ALLOWED(1),
    MIXED(2),
    DISALLOWED(-1),
    UNDEFINED(-2);

    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ConsentStatus getConsentStatus(int i10) {
            ConsentStatus consentStatus = ConsentStatus.PENDING;
            if (i10 == consentStatus.getValue$appconsent_core_prodXchangeRelease()) {
                return consentStatus;
            }
            ConsentStatus consentStatus2 = ConsentStatus.ALLOWED;
            if (i10 == consentStatus2.getValue$appconsent_core_prodXchangeRelease()) {
                return consentStatus2;
            }
            ConsentStatus consentStatus3 = ConsentStatus.DISALLOWED;
            if (i10 == consentStatus3.getValue$appconsent_core_prodXchangeRelease()) {
                return consentStatus3;
            }
            ConsentStatus consentStatus4 = ConsentStatus.MIXED;
            return i10 == consentStatus4.getValue$appconsent_core_prodXchangeRelease() ? consentStatus4 : ConsentStatus.UNDEFINED;
        }

        private Companion() {
        }
    }

    ConsentStatus(int i10) {
        this.value = i10;
    }

    public final int getValue$appconsent_core_prodXchangeRelease() {
        return this.value;
    }
}
