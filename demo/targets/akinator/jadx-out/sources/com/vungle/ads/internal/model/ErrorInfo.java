package com.vungle.ads.internal.model;

import a.b;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ErrorInfo {
    private final String description;
    private final boolean errorIsTerminal;
    private final boolean isRetryCode;

    public ErrorInfo(String description, boolean z10, boolean z11) {
        e0.checkNotNullParameter(description, "description");
        this.description = description;
        this.errorIsTerminal = z10;
        this.isRetryCode = z11;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = errorInfo.description;
        }
        if ((i10 & 2) != 0) {
            z10 = errorInfo.errorIsTerminal;
        }
        if ((i10 & 4) != 0) {
            z11 = errorInfo.isRetryCode;
        }
        return errorInfo.copy(str, z10, z11);
    }

    public final String component1() {
        return this.description;
    }

    public final boolean component2() {
        return this.errorIsTerminal;
    }

    public final boolean component3() {
        return this.isRetryCode;
    }

    public final ErrorInfo copy(String description, boolean z10, boolean z11) {
        e0.checkNotNullParameter(description, "description");
        return new ErrorInfo(description, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        return e0.areEqual(this.description, errorInfo.description) && this.errorIsTerminal == errorInfo.errorIsTerminal && this.isRetryCode == errorInfo.isRetryCode;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getErrorIsTerminal() {
        return this.errorIsTerminal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        boolean z10 = this.errorIsTerminal;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.isRetryCode;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isRetryCode() {
        return this.isRetryCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorInfo(description=");
        sb2.append(this.description);
        sb2.append(", errorIsTerminal=");
        sb2.append(this.errorIsTerminal);
        sb2.append(", isRetryCode=");
        return b.p(sb2, this.isRetryCode, ')');
    }

    public /* synthetic */ ErrorInfo(String str, boolean z10, boolean z11, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
