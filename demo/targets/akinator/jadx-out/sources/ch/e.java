package ch;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabLayout f12308a;

    public e(TabLayout tabLayout) {
        this.f12308a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f12308a.g();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f12308a.g();
    }
}
