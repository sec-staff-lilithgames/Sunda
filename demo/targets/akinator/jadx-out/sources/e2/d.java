package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f53515a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f53516b;

    public d(String label, kv.a action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        this.f53515a = label;
        this.f53516b = action;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f53515a, dVar.f53515a) && kotlin.jvm.internal.e0.areEqual(this.f53516b, dVar.f53516b);
    }

    public final kv.a getAction() {
        return this.f53516b;
    }

    public final String getLabel() {
        return this.f53515a;
    }

    public int hashCode() {
        return this.f53516b.hashCode() + (this.f53515a.hashCode() * 31);
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f53515a + ", action=" + this.f53516b + ')';
    }
}
