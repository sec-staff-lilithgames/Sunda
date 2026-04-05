package j$.time.format;

/* loaded from: classes3.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final char f68541a;

    public d(char c10) {
        this.f68541a = c10;
    }

    @Override // j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        sb2.append(this.f68541a);
        return true;
    }

    public final String toString() {
        char c10 = this.f68541a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}
