package com.applovin.impl.mediation.ads;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.inmobi.media.AbstractC2694b2;
import com.inmobi.media.C3100z2;
import com.inmobi.media.F5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qg.t0;
import qg.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14607c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14610g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14611h;

    public /* synthetic */ f(com.google.android.material.search.c cVar, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z10) {
        this.f14606b = 1;
        this.f14608e = cVar;
        this.f14609f = searchBar;
        this.f14610g = view;
        this.f14611h = appBarLayout;
        this.f14607c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14606b;
        Object obj = this.f14611h;
        Object obj2 = this.f14610g;
        boolean z10 = this.f14607c;
        Object obj3 = this.f14609f;
        Object obj4 = this.f14608e;
        switch (i10) {
            case 0:
                ((MaxFullscreenAdImpl.b) obj4).a((MaxAd) obj3, z10, (z2) obj2, (MaxError) obj);
                break;
            case 1:
                com.google.android.material.search.c cVar = (com.google.android.material.search.c) obj4;
                SearchBar searchBar = (SearchBar) obj3;
                View view = (View) obj2;
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                cVar.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                List<View> children = t0.getChildren(searchBar);
                if (searchBar.getCenterView() != null) {
                    children.remove(searchBar.getCenterView());
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(x.alphaListener(children));
                valueAnimatorOfFloat.addUpdateListener(new com.google.android.exoplayer2.ui.g(view, 8));
                valueAnimatorOfFloat.setDuration(75L);
                valueAnimatorOfFloat.setInterpolator(vf.a.f89240a);
                animatorSet.playSequentially(valueAnimatorOfFloat, com.google.android.material.search.c.a(searchBar, view, appBarLayout).setDuration(300L).addListener(new wg.d(cVar, searchBar)).getExpandAnimator());
                animatorSet.addListener(new wg.c(cVar));
                Iterator it = cVar.f29356b.iterator();
                while (it.hasNext()) {
                    animatorSet.addListener((AnimatorListenerAdapter) it.next());
                }
                if (z10) {
                    animatorSet.setDuration(0L);
                }
                animatorSet.start();
                cVar.f29363i = animatorSet;
                break;
            default:
                C3100z2.a((String) obj4, (Map) obj3, z10, (F5) obj2, (AbstractC2694b2) obj);
                break;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f14606b = i10;
        this.f14608e = obj;
        this.f14609f = obj2;
        this.f14607c = z10;
        this.f14610g = obj3;
        this.f14611h = obj4;
    }
}
