package com.sfbx.appconsent.core.model.reducer.action;

import com.sfbx.appconsent.core.model.ConsentStatus;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SetConsentable implements Action {

    /* renamed from: id, reason: collision with root package name */
    private final int f50529id;
    private final boolean legint;
    private final ConsentStatus status;

    public SetConsentable(boolean z10, ConsentStatus status, int i10) {
        e0.checkNotNullParameter(status, "status");
        this.legint = z10;
        this.status = status;
        this.f50529id = i10;
    }

    public static /* synthetic */ SetConsentable copy$default(SetConsentable setConsentable, boolean z10, ConsentStatus consentStatus, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = setConsentable.legint;
        }
        if ((i11 & 2) != 0) {
            consentStatus = setConsentable.status;
        }
        if ((i11 & 4) != 0) {
            i10 = setConsentable.f50529id;
        }
        return setConsentable.copy(z10, consentStatus, i10);
    }

    public final boolean component1() {
        return this.legint;
    }

    public final ConsentStatus component2() {
        return this.status;
    }

    public final int component3() {
        return this.f50529id;
    }

    public final SetConsentable copy(boolean z10, ConsentStatus status, int i10) {
        e0.checkNotNullParameter(status, "status");
        return new SetConsentable(z10, status, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetConsentable)) {
            return false;
        }
        SetConsentable setConsentable = (SetConsentable) obj;
        return this.legint == setConsentable.legint && this.status == setConsentable.status && this.f50529id == setConsentable.f50529id;
    }

    public final int getId() {
        return this.f50529id;
    }

    public final boolean getLegint() {
        return this.legint;
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.legint;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return Integer.hashCode(this.f50529id) + ((this.status.hashCode() + (r02 * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetConsentable(legint=");
        sb2.append(this.legint);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", id=");
        return g.m(sb2, this.f50529id, ')');
    }

    public /* synthetic */ SetConsentable(boolean z10, ConsentStatus consentStatus, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? false : z10, consentStatus, i10);
    }
}
