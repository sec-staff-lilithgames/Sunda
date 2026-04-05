package cr;

import java.io.File;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Date f50895a;

    public d() {
        this(3);
    }

    @Override // cr.b
    public final boolean a(File file) {
        return e.isFileOlderThanDate(file, this.f50895a);
    }

    public d(int i10) {
        this.f50895a = t.getDate(i10);
    }
}
