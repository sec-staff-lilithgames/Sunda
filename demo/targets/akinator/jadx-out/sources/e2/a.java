package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f53498a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.i f53499b;

    public a(String str, tu.i iVar) {
        this.f53498a = str;
        this.f53499b = iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f53498a, aVar.f53498a) && kotlin.jvm.internal.e0.areEqual(this.f53499b, aVar.f53499b);
    }

    public final tu.i getAction() {
        return this.f53499b;
    }

    public final String getLabel() {
        return this.f53498a;
    }

    public int hashCode() {
        String str = this.f53498a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        tu.i iVar = this.f53499b;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f53498a + ", action=" + this.f53499b + ')';
    }
}
