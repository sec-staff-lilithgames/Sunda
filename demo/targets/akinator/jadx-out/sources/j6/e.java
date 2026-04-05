package j6;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f69139b;

    public e(ViewPager2 viewPager2) {
        this.f69139b = viewPager2;
    }

    @Override // j6.h, androidx.recyclerview.widget.RecyclerView.b
    public void onChanged() {
        ViewPager2 viewPager2 = this.f69139b;
        viewPager2.f7385g = true;
        viewPager2.f7392n.f7416l = true;
    }
}
