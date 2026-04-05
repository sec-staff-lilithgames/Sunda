package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes3.dex */
public final class t implements j$.time.temporal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f68584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.time.temporal.m f68585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.m f68586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoneId f68587d;

    public t(j$.time.chrono.b bVar, j$.time.temporal.m mVar, j$.time.chrono.m mVar2, ZoneId zoneId) {
        this.f68584a = bVar;
        this.f68585b = mVar;
        this.f68586c = mVar2;
        this.f68587d = zoneId;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.f68584a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.e(pVar);
        }
        return this.f68585b.e(pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.f68584a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.i(pVar);
        }
        return this.f68585b.i(pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.f68584a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.f(pVar);
        }
        return this.f68585b.f(pVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(a aVar) {
        if (aVar == j$.time.temporal.q.f68657b) {
            return this.f68586c;
        }
        if (aVar == j$.time.temporal.q.f68656a) {
            return this.f68587d;
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return this.f68585b.b(aVar);
        }
        return aVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f68586c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f68587d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f68585b + str + str2;
    }
}
