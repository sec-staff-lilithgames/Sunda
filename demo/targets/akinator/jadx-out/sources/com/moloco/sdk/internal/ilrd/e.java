package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.IlrdRequest$LevelPlayImpression;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final IlrdRequest$LevelPlayImpression f46006a;

    public e(IlrdRequest$LevelPlayImpression impression) {
        e0.checkNotNullParameter(impression, "impression");
        this.f46006a = impression;
    }

    public final IlrdRequest$LevelPlayImpression a() {
        return this.f46006a;
    }

    public final IlrdRequest$LevelPlayImpression b() {
        return this.f46006a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && e0.areEqual(this.f46006a, ((e) obj).f46006a);
    }

    public int hashCode() {
        return this.f46006a.hashCode();
    }

    public String toString() {
        return "LevelPlay(impression=" + this.f46006a + ')';
    }

    public final e a(IlrdRequest$LevelPlayImpression impression) {
        e0.checkNotNullParameter(impression, "impression");
        return new e(impression);
    }

    public static /* synthetic */ e a(e eVar, IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ilrdRequest$LevelPlayImpression = eVar.f46006a;
        }
        return eVar.a(ilrdRequest$LevelPlayImpression);
    }
}
