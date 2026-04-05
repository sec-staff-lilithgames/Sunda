package hi;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58787a;

    /* renamed from: b, reason: collision with root package name */
    public final ni.d f58788b;

    public a0(String str, ni.d dVar) {
        this.f58787a = str;
        this.f58788b = dVar;
    }

    public boolean create() {
        String str = this.f58787a;
        try {
            return this.f58788b.getCommonFile(str).createNewFile();
        } catch (IOException e10) {
            ei.f.getLogger().e("Error creating marker: " + str, e10);
            return false;
        }
    }

    public boolean isPresent() {
        return this.f58788b.getCommonFile(this.f58787a).exists();
    }

    public boolean remove() {
        return this.f58788b.getCommonFile(this.f58787a).delete();
    }
}
