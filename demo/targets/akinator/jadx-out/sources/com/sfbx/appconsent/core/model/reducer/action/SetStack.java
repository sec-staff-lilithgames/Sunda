package com.sfbx.appconsent.core.model.reducer.action;

import com.sfbx.appconsent.core.model.ConsentStatus;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SetStack implements Action {

    /* renamed from: id, reason: collision with root package name */
    private final int f50530id;
    private final boolean legint;
    private final ConsentStatus status;

    public SetStack(boolean z10, ConsentStatus status, int i10) {
        e0.checkNotNullParameter(status, "status");
        this.legint = z10;
        this.status = status;
        this.f50530id = i10;
    }

    public static /* synthetic */ SetStack copy$default(SetStack setStack, boolean z10, ConsentStatus consentStatus, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = setStack.legint;
        }
        if ((i11 & 2) != 0) {
            consentStatus = setStack.status;
        }
        if ((i11 & 4) != 0) {
            i10 = setStack.f50530id;
        }
        return setStack.copy(z10, consentStatus, i10);
    }

    public final boolean component1() {
        return this.legint;
    }

    public final ConsentStatus component2() {
        return this.status;
    }

    public final int component3() {
        return this.f50530id;
    }

    public final SetStack copy(boolean z10, ConsentStatus status, int i10) {
        e0.checkNotNullParameter(status, "status");
        return new SetStack(z10, status, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetStack)) {
            return false;
        }
        SetStack setStack = (SetStack) obj;
        return this.legint == setStack.legint && this.status == setStack.status && this.f50530id == setStack.f50530id;
    }

    public final int getId() {
        return this.f50530id;
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
        return Integer.hashCode(this.f50530id) + ((this.status.hashCode() + (r02 * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetStack(legint=");
        sb2.append(this.legint);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", id=");
        return g.m(sb2, this.f50530id, ')');
    }

    public /* synthetic */ SetStack(boolean z10, ConsentStatus consentStatus, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? false : z10, consentStatus, i10);
    }
}
