package androidx.viewpager.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager f7360a;

    public k(ViewPager viewPager) {
        this.f7360a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() throws Resources.NotFoundException {
        this.f7360a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() throws Resources.NotFoundException {
        this.f7360a.dataSetChanged();
    }
}
