package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import qg.k;
import qg.n;
import qg.t0;
import yg.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f29358d;

    /* renamed from: e, reason: collision with root package name */
    public AnimatorSet f29359e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29360f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29361g;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f29355a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f29356b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f29357c = new LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    public boolean f29362h = true;

    /* renamed from: i, reason: collision with root package name */
    public AnimatorSet f29363i = null;

    public static n a(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        n nVar = new n(searchBar, view);
        j jVarCreateWithElevationOverlay = j.createWithElevationOverlay(view.getContext());
        jVarCreateWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        jVarCreateWithElevationOverlay.setElevation(searchBar.getElevation());
        n additionalUpdateListener = nVar.setAdditionalUpdateListener(new k(2, jVarCreateWithElevationOverlay, view));
        n collapsedViewOffsetY = additionalUpdateListener.setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0);
        boolean zIsLayoutRtl = t0.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((!zIsLayoutRtl && (childAt instanceof ActionMenuView)) || (zIsLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return collapsedViewOffsetY.addEndAnchoredViews(arrayList);
    }
}
