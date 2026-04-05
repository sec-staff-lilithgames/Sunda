package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.j0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f46884a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f46885b;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final j0 a() {
        return this.f46884a;
    }

    public final Integer b() {
        return this.f46885b;
    }

    public final Integer c() {
        return this.f46885b;
    }

    public final j0 d() {
        return this.f46884a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f46884a == fVar.f46884a && e0.areEqual(this.f46885b, fVar.f46885b);
    }

    public int hashCode() {
        j0 j0Var = this.f46884a;
        int iHashCode = (j0Var == null ? 0 : j0Var.hashCode()) * 31;
        Integer num = this.f46885b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSignal(muteSwitchState=");
        sb2.append(this.f46884a);
        sb2.append(", mediaVolume=");
        return com.google.android.gms.internal.play_billing.a.j(sb2, this.f46885b, ')');
    }

    public f(j0 j0Var, Integer num) {
        this.f46884a = j0Var;
        this.f46885b = num;
    }

    public final f a(j0 j0Var, Integer num) {
        return new f(j0Var, num);
    }

    public static /* synthetic */ f a(f fVar, j0 j0Var, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = fVar.f46884a;
        }
        if ((i10 & 2) != 0) {
            num = fVar.f46885b;
        }
        return fVar.a(j0Var, num);
    }

    public /* synthetic */ f(j0 j0Var, Integer num, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : j0Var, (i10 & 2) != 0 ? null : num);
    }
}
