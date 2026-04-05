package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3213f8 extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    private final IronSourceError f36692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3213f8(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f36692a = error;
    }

    public final IronSourceError a() {
        return this.f36692a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.e0.areEqual(C3213f8.class, obj.getClass())) {
            return false;
        }
        C3213f8 c3213f8 = (C3213f8) obj;
        if (this.f36692a.getErrorCode() != c3213f8.f36692a.getErrorCode()) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f36692a.getErrorMessage(), c3213f8.f36692a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36692a.getErrorCode()), this.f36692a.getErrorMessage());
    }
}
