package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m1 extends f2.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f71350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71352c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f71353d;

    public m1(String str, int i10, int i11, boolean z10) {
        this.f71350a = str;
        this.f71351b = i10;
        this.f71352c = i11;
        this.f71353d = z10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a.c) {
            f2.e.d.a.c cVar = (f2.e.d.a.c) obj;
            if (this.f71350a.equals(cVar.getProcessName()) && this.f71351b == cVar.getPid() && this.f71352c == cVar.getImportance() && this.f71353d == cVar.isDefaultProcess()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a.c
    public int getImportance() {
        return this.f71352c;
    }

    @Override // ki.f2.e.d.a.c
    public int getPid() {
        return this.f71351b;
    }

    @Override // ki.f2.e.d.a.c
    public String getProcessName() {
        return this.f71350a;
    }

    public int hashCode() {
        return ((((((this.f71350a.hashCode() ^ 1000003) * 1000003) ^ this.f71351b) * 1000003) ^ this.f71352c) * 1000003) ^ (this.f71353d ? 1231 : 1237);
    }

    @Override // ki.f2.e.d.a.c
    public boolean isDefaultProcess() {
        return this.f71353d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f71350a);
        sb2.append(", pid=");
        sb2.append(this.f71351b);
        sb2.append(", importance=");
        sb2.append(this.f71352c);
        sb2.append(", defaultProcess=");
        return a.b.q(sb2, this.f71353d, "}");
    }
}
