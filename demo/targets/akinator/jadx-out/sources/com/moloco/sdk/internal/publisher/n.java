package com.moloco.sdk.internal.publisher;

import java.util.LinkedHashMap;
import java.util.Map;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Map f46425a;

    /* renamed from: b, reason: collision with root package name */
    public final long f46426b;

    public /* synthetic */ n(Map map, long j10, kotlin.jvm.internal.u uVar) {
        this(map, j10);
    }

    public final Map<f0, tv.f> a() {
        return this.f46425a;
    }

    public final long b() {
        return this.f46426b;
    }

    public final Map<f0, tv.f> c() {
        return this.f46425a;
    }

    public final long d() {
        return this.f46426b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f46425a, nVar.f46425a) && tv.f.m7189equalsimpl0(this.f46426b, nVar.f46426b);
    }

    public int hashCode() {
        return tv.f.m7202hashCodeimpl(this.f46426b) + (this.f46425a.hashCode() * 31);
    }

    public String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.f46425a + ", defaultTimeoutDuration=" + ((Object) tv.f.m7219toStringimpl(this.f46426b)) + ')';
    }

    public n(Map<f0, tv.f> adTimeouts, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTimeouts, "adTimeouts");
        this.f46425a = adTimeouts;
        this.f46426b = j10;
    }

    public final n a(Map<f0, tv.f> adTimeouts, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTimeouts, "adTimeouts");
        return new n(adTimeouts, j10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n a(n nVar, Map map, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = nVar.f46425a;
        }
        if ((i10 & 2) != 0) {
            j10 = nVar.f46426b;
        }
        return nVar.a(map, j10);
    }

    public /* synthetic */ n(Map map, long j10, int i10, kotlin.jvm.internal.u uVar) {
        long duration;
        if ((i10 & 1) != 0) {
            f0[] f0VarArrValues = f0.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(f0VarArrValues.length), 16));
            for (f0 f0Var : f0VarArrValues) {
                switch (m.f46424a[f0Var.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        duration = tv.h.toDuration(5, tv.i.f87442g);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        duration = tv.h.toDuration(15, tv.i.f87442g);
                        break;
                    default:
                        throw new tu.t();
                }
                linkedHashMap.put(f0Var, tv.f.m7182boximpl(duration));
            }
            map = linkedHashMap;
        }
        this(map, (i10 & 2) != 0 ? tv.h.toDuration(5, tv.i.f87442g) : j10, null);
    }
}
