package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes3.dex */
public class q implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a f68570a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68571b;

    public q(a aVar, String str) {
        this.f68570a = aVar;
        this.f68571b = str;
    }

    @Override // j$.time.format.f
    public boolean r(u uVar, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) uVar.b(this.f68570a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.k());
        return true;
    }

    public final String toString() {
        return this.f68571b;
    }
}
