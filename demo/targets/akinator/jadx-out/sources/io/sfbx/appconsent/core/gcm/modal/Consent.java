package io.sfbx.appconsent.core.gcm.modal;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Consent {
    private final boolean isGoogleVendorAllowed;
    private final boolean isPurpose1Allowed;
    private final boolean isPurpose3Allowed;
    private final boolean isPurpose4Allowed;
    private final boolean isPurpose7Allowed;
    private final boolean isPurpose9Allowed;

    public Consent() {
        this(false, false, false, false, false, false, 63, null);
    }

    public final boolean isGoogleVendorAllowed() {
        return this.isGoogleVendorAllowed;
    }

    public final boolean isPurpose1Allowed() {
        return this.isPurpose1Allowed;
    }

    public final boolean isPurpose3Allowed() {
        return this.isPurpose3Allowed;
    }

    public final boolean isPurpose4Allowed() {
        return this.isPurpose4Allowed;
    }

    public final boolean isPurpose7Allowed() {
        return this.isPurpose7Allowed;
    }

    public final boolean isPurpose9Allowed() {
        return this.isPurpose9Allowed;
    }

    public Consent(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.isGoogleVendorAllowed = z10;
        this.isPurpose1Allowed = z11;
        this.isPurpose3Allowed = z12;
        this.isPurpose4Allowed = z13;
        this.isPurpose7Allowed = z14;
        this.isPurpose9Allowed = z15;
    }

    public /* synthetic */ Consent(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15);
    }
}
