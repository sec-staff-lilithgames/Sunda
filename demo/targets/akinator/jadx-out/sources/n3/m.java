package n3;

import android.content.res.Resources;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f75591a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f75592b;

    public m(Resources resources, Resources.Theme theme) {
        this.f75591a = resources;
        this.f75592b = theme;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f75591a.equals(mVar.f75591a) && w3.d.equals(this.f75592b, mVar.f75592b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w3.d.hash(this.f75591a, this.f75592b);
    }
}
