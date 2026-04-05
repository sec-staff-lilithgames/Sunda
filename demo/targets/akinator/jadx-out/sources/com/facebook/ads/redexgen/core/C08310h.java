package com.facebook.ads.redexgen.core;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.0h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C08310h extends C09846g {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C08310h(C1937dL c1937dL) {
        super(c1937dL);
        setCarouselLayoutManager(c1937dL);
    }

    public FG getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C09846g
    public C2117gI getLayoutManager() {
        return (C2117gI) super.getLayoutManager();
    }

    public QT getOnScrollListener() {
        return new OC(this);
    }

    private void setCarouselLayoutManager(C1937dL c1937dL) {
        C2117gI c2117gI = new C2117gI(c1937dL, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c2117gI.A1T(true);
        }
        super.setLayoutManager(c2117gI);
    }

    @Override // com.facebook.ads.redexgen.core.C09846g
    public void setLayoutManager(QO qo2) {
    }
}
