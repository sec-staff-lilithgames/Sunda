package sv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends uu.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f86199b;

    public u(w wVar) {
        this.f86199b = wVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return contains((String) obj);
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f86199b.f86201a.groupCount() + 1;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return indexOf((String) obj);
        }
        return -1;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return lastIndexOf((String) obj);
        }
        return -1;
    }

    public /* bridge */ boolean contains(String str) {
        return super.contains((Object) str);
    }

    @Override // uu.g, java.util.List
    public String get(int i10) {
        String strGroup = this.f86199b.f86201a.group(i10);
        return strGroup == null ? "" : strGroup;
    }

    public /* bridge */ int indexOf(String str) {
        return super.indexOf((Object) str);
    }

    public /* bridge */ int lastIndexOf(String str) {
        return super.lastIndexOf((Object) str);
    }
}
