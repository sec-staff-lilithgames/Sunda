package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.IlrdRequest$MaxImpression;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final IlrdRequest$MaxImpression f46007a;

    public f(IlrdRequest$MaxImpression impression) {
        e0.checkNotNullParameter(impression, "impression");
        this.f46007a = impression;
    }

    public final IlrdRequest$MaxImpression a() {
        return this.f46007a;
    }

    public final IlrdRequest$MaxImpression b() {
        return this.f46007a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && e0.areEqual(this.f46007a, ((f) obj).f46007a);
    }

    public int hashCode() {
        return this.f46007a.hashCode();
    }

    public String toString() {
        return "Max(impression=" + this.f46007a + ')';
    }

    public final f a(IlrdRequest$MaxImpression impression) {
        e0.checkNotNullParameter(impression, "impression");
        return new f(impression);
    }

    public static /* synthetic */ f a(f fVar, IlrdRequest$MaxImpression ilrdRequest$MaxImpression, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ilrdRequest$MaxImpression = fVar.f46007a;
        }
        return fVar.a(ilrdRequest$MaxImpression);
    }
}
