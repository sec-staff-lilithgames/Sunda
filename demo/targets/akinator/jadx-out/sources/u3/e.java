package u3;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f87786a;

    /* renamed from: b, reason: collision with root package name */
    public String f87787b;

    /* renamed from: c, reason: collision with root package name */
    public List f87788c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f87786a, eVar.f87786a) && Objects.equals(this.f87787b, eVar.f87787b) && Objects.equals(this.f87788c, eVar.f87788c);
    }

    public int hashCode() {
        return Objects.hash(this.f87786a, this.f87787b, this.f87788c);
    }
}
