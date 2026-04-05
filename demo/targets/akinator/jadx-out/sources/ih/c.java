package ih;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final File f59580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59581b;

    public c(File file, String str) {
        this.f59580a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f59581b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f59580a.equals(cVar.f59580a) && this.f59581b.equals(cVar.f59581b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f59580a.hashCode() ^ 1000003) * 1000003) ^ this.f59581b.hashCode();
    }

    public final String toString() {
        return e3.g.l("SplitFileInfo{splitFile=", this.f59580a.toString(), ", splitId=", this.f59581b, "}");
    }
}
