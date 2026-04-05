package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o0 extends f2.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f71384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71385b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71386c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71387d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f71388e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f71389f;

    /* renamed from: g, reason: collision with root package name */
    public final f2.e.a f71390g;

    /* renamed from: h, reason: collision with root package name */
    public final f2.e.f f71391h;

    /* renamed from: i, reason: collision with root package name */
    public final f2.e.AbstractC0732e f71392i;

    /* renamed from: j, reason: collision with root package name */
    public final f2.e.c f71393j;

    /* renamed from: k, reason: collision with root package name */
    public final List f71394k;

    /* renamed from: l, reason: collision with root package name */
    public final int f71395l;

    public o0(String str, String str2, String str3, long j10, Long l9, boolean z10, f2.e.a aVar, f2.e.f fVar, f2.e.AbstractC0732e abstractC0732e, f2.e.c cVar, List list, int i10) {
        this.f71384a = str;
        this.f71385b = str2;
        this.f71386c = str3;
        this.f71387d = j10;
        this.f71388e = l9;
        this.f71389f = z10;
        this.f71390g = aVar;
        this.f71391h = fVar;
        this.f71392i = abstractC0732e;
        this.f71393j = cVar;
        this.f71394k = list;
        this.f71395l = i10;
    }

    public boolean equals(Object obj) {
        String str;
        Long l9;
        f2.e.f fVar;
        f2.e.AbstractC0732e abstractC0732e;
        f2.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e) {
            f2.e eVar = (f2.e) obj;
            if (this.f71384a.equals(eVar.getGenerator()) && this.f71385b.equals(eVar.getIdentifier()) && ((str = this.f71386c) != null ? str.equals(eVar.getAppQualitySessionId()) : eVar.getAppQualitySessionId() == null) && this.f71387d == eVar.getStartedAt() && ((l9 = this.f71388e) != null ? l9.equals(eVar.getEndedAt()) : eVar.getEndedAt() == null) && this.f71389f == eVar.isCrashed() && this.f71390g.equals(eVar.getApp()) && ((fVar = this.f71391h) != null ? fVar.equals(eVar.getUser()) : eVar.getUser() == null) && ((abstractC0732e = this.f71392i) != null ? abstractC0732e.equals(eVar.getOs()) : eVar.getOs() == null) && ((cVar = this.f71393j) != null ? cVar.equals(eVar.getDevice()) : eVar.getDevice() == null) && ((list = this.f71394k) != null ? list.equals(eVar.getEvents()) : eVar.getEvents() == null) && this.f71395l == eVar.getGeneratorType()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e
    public f2.e.a getApp() {
        return this.f71390g;
    }

    @Override // ki.f2.e
    public String getAppQualitySessionId() {
        return this.f71386c;
    }

    @Override // ki.f2.e
    public f2.e.c getDevice() {
        return this.f71393j;
    }

    @Override // ki.f2.e
    public Long getEndedAt() {
        return this.f71388e;
    }

    @Override // ki.f2.e
    public List<f2.e.d> getEvents() {
        return this.f71394k;
    }

    @Override // ki.f2.e
    public String getGenerator() {
        return this.f71384a;
    }

    @Override // ki.f2.e
    public int getGeneratorType() {
        return this.f71395l;
    }

    @Override // ki.f2.e
    public String getIdentifier() {
        return this.f71385b;
    }

    @Override // ki.f2.e
    public f2.e.AbstractC0732e getOs() {
        return this.f71392i;
    }

    @Override // ki.f2.e
    public long getStartedAt() {
        return this.f71387d;
    }

    @Override // ki.f2.e
    public f2.e.f getUser() {
        return this.f71391h;
    }

    public int hashCode() {
        int iHashCode = (((this.f71384a.hashCode() ^ 1000003) * 1000003) ^ this.f71385b.hashCode()) * 1000003;
        String str = this.f71386c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f71387d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        Long l9 = this.f71388e;
        int iHashCode3 = (((((i10 ^ (l9 == null ? 0 : l9.hashCode())) * 1000003) ^ (this.f71389f ? 1231 : 1237)) * 1000003) ^ this.f71390g.hashCode()) * 1000003;
        f2.e.f fVar = this.f71391h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f2.e.AbstractC0732e abstractC0732e = this.f71392i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0732e == null ? 0 : abstractC0732e.hashCode())) * 1000003;
        f2.e.c cVar = this.f71393j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f71394k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f71395l;
    }

    @Override // ki.f2.e
    public boolean isCrashed() {
        return this.f71389f;
    }

    @Override // ki.f2.e
    public f2.e.b toBuilder() {
        n0 n0Var = new n0();
        n0Var.f71360a = getGenerator();
        n0Var.f71361b = getIdentifier();
        n0Var.f71362c = getAppQualitySessionId();
        n0Var.f71363d = getStartedAt();
        n0Var.f71364e = getEndedAt();
        n0Var.f71365f = isCrashed();
        n0Var.f71366g = getApp();
        n0Var.f71367h = getUser();
        n0Var.f71368i = getOs();
        n0Var.f71369j = getDevice();
        n0Var.f71370k = getEvents();
        n0Var.f71371l = getGeneratorType();
        n0Var.f71372m = (byte) 7;
        return n0Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f71384a);
        sb2.append(", identifier=");
        sb2.append(this.f71385b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f71386c);
        sb2.append(", startedAt=");
        sb2.append(this.f71387d);
        sb2.append(", endedAt=");
        sb2.append(this.f71388e);
        sb2.append(", crashed=");
        sb2.append(this.f71389f);
        sb2.append(", app=");
        sb2.append(this.f71390g);
        sb2.append(", user=");
        sb2.append(this.f71391h);
        sb2.append(", os=");
        sb2.append(this.f71392i);
        sb2.append(", device=");
        sb2.append(this.f71393j);
        sb2.append(", events=");
        sb2.append(this.f71394k);
        sb2.append(", generatorType=");
        return a.b.f(this.f71395l, "}", sb2);
    }
}
