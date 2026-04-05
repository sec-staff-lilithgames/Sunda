package ki;

import java.util.Arrays;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m0 extends f2.d.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f71348a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f71349b;

    public m0(String str, byte[] bArr) {
        this.f71348a = str;
        this.f71349b = bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.d.b) {
            f2.d.b bVar = (f2.d.b) obj;
            if (this.f71348a.equals(bVar.getFilename())) {
                if (Arrays.equals(this.f71349b, bVar instanceof m0 ? ((m0) bVar).f71349b : bVar.getContents())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ki.f2.d.b
    public byte[] getContents() {
        return this.f71349b;
    }

    @Override // ki.f2.d.b
    public String getFilename() {
        return this.f71348a;
    }

    public int hashCode() {
        return ((this.f71348a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f71349b);
    }

    public String toString() {
        return "File{filename=" + this.f71348a + ", contents=" + Arrays.toString(this.f71349b) + "}";
    }
}
