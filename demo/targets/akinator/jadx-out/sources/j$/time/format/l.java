package j$.time.format;

/* loaded from: classes3.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f68558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68559b;

    /* renamed from: c, reason: collision with root package name */
    public final char f68560c;

    public l(f fVar, int i10, char c10) {
        this.f68558a = fVar;
        this.f68559b = i10;
        this.f68560c = c10;
    }

    @Override // j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f68558a.r(uVar, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i10 = this.f68559b;
        if (length2 <= i10) {
            for (int i11 = 0; i11 < i10 - length2; i11++) {
                sb2.insert(length, this.f68560c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i10);
    }

    public final String toString() {
        String str;
        char c10 = this.f68560c;
        if (c10 == ' ') {
            str = ")";
        } else {
            str = ",'" + c10 + "')";
        }
        return "Pad(" + this.f68558a + "," + this.f68559b + str;
    }
}
