package xu;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparator f93549c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Comparator f93550e;

    public /* synthetic */ a(Comparator comparator, Comparator comparator2, int i10) {
        this.f93548b = i10;
        this.f93549c = comparator;
        this.f93550e = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f93548b) {
            case 0:
                int iCompare = this.f93549c.compare(obj, obj2);
                return iCompare != 0 ? iCompare : this.f93550e.compare(obj2, obj);
            default:
                int iCompare2 = this.f93549c.compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : this.f93550e.compare(obj, obj2);
        }
    }
}
