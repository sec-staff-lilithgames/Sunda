package cr;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f50921a;

    public n(String str) {
        this.f50921a = str;
    }

    @Override // cr.b
    public final boolean a(File file) {
        return e.startWith(file, this.f50921a);
    }
}
