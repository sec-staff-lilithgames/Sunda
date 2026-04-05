package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z1 extends PagerAdapter {

    /* renamed from: h, reason: collision with root package name */
    public final FragmentManager f6502h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6503i;

    /* renamed from: j, reason: collision with root package name */
    public h2 f6504j;

    /* renamed from: k, reason: collision with root package name */
    public Fragment f6505k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6506l;

    @Deprecated
    public z1(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f6504j == null) {
            this.f6504j = this.f6502h.beginTransaction();
        }
        this.f6504j.detach(fragment);
        if (fragment.equals(this.f6505k)) {
            this.f6505k = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        h2 h2Var = this.f6504j;
        if (h2Var != null) {
            if (!this.f6506l) {
                try {
                    this.f6506l = true;
                    h2Var.commitNowAllowingStateLoss();
                } finally {
                    this.f6506l = false;
                }
            }
            this.f6504j = null;
        }
    }

    public abstract Fragment getItem(int i10);

    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        h2 h2Var = this.f6504j;
        FragmentManager fragmentManager = this.f6502h;
        if (h2Var == null) {
            this.f6504j = fragmentManager.beginTransaction();
        }
        long itemId = getItemId(i10);
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("android:switcher:" + viewGroup.getId() + ":" + itemId);
        if (fragmentFindFragmentByTag != null) {
            this.f6504j.attach(fragmentFindFragmentByTag);
        } else {
            fragmentFindFragmentByTag = getItem(i10);
            this.f6504j.add(viewGroup.getId(), fragmentFindFragmentByTag, "android:switcher:" + viewGroup.getId() + ":" + itemId);
        }
        if (fragmentFindFragmentByTag != this.f6505k) {
            fragmentFindFragmentByTag.setMenuVisibility(false);
            if (this.f6503i == 1) {
                this.f6504j.setMaxLifecycle(fragmentFindFragmentByTag, androidx.lifecycle.j0.f6617f);
                return fragmentFindFragmentByTag;
            }
            fragmentFindFragmentByTag.setUserVisibleHint(false);
        }
        return fragmentFindFragmentByTag;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f6505k;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.f6502h;
            int i11 = this.f6503i;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i11 == 1) {
                    if (this.f6504j == null) {
                        this.f6504j = fragmentManager.beginTransaction();
                    }
                    this.f6504j.setMaxLifecycle(this.f6505k, androidx.lifecycle.j0.f6617f);
                } else {
                    this.f6505k.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i11 == 1) {
                if (this.f6504j == null) {
                    this.f6504j = fragmentManager.beginTransaction();
                }
                this.f6504j.setMaxLifecycle(fragment, androidx.lifecycle.j0.f6618g);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f6505k = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public z1(FragmentManager fragmentManager, int i10) {
        this.f6504j = null;
        this.f6505k = null;
        this.f6502h = fragmentManager;
        this.f6503i = i10;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }
}
