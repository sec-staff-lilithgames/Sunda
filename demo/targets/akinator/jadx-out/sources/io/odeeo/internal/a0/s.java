package io.odeeo.internal.a0;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f62447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62449c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62450d;

    /* renamed from: e, reason: collision with root package name */
    public final int f62451e;

    public s(Object obj) {
        this(obj, -1L);
    }

    public s copyWithPeriodUid(Object obj) {
        return this.f62447a.equals(obj) ? this : new s(obj, this.f62448b, this.f62449c, this.f62450d, this.f62451e);
    }

    public s copyWithWindowSequenceNumber(long j10) {
        return this.f62450d == j10 ? this : new s(this.f62447a, this.f62448b, this.f62449c, j10, this.f62451e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f62447a.equals(sVar.f62447a) && this.f62448b == sVar.f62448b && this.f62449c == sVar.f62449c && this.f62450d == sVar.f62450d && this.f62451e == sVar.f62451e;
    }

    public int hashCode() {
        return ((((((((this.f62447a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f62448b) * 31) + this.f62449c) * 31) + ((int) this.f62450d)) * 31) + this.f62451e;
    }

    public boolean isAd() {
        return this.f62448b != -1;
    }

    public s(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public s(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public s(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public s(s sVar) {
        this.f62447a = sVar.f62447a;
        this.f62448b = sVar.f62448b;
        this.f62449c = sVar.f62449c;
        this.f62450d = sVar.f62450d;
        this.f62451e = sVar.f62451e;
    }

    public s(Object obj, int i10, int i11, long j10, int i12) {
        this.f62447a = obj;
        this.f62448b = i10;
        this.f62449c = i11;
        this.f62450d = j10;
        this.f62451e = i12;
    }
}
