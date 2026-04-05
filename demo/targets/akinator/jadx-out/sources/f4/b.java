package f4;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f55341a;

    public b(c cVar) {
        this.f55341a = cVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        c cVar = this.f55341a;
        cVar.f55342b = true;
        cVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        c cVar = this.f55341a;
        cVar.f55342b = false;
        cVar.notifyDataSetInvalidated();
    }
}
