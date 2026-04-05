package com.bytedance.sdk.openadsdk.wqx;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends ScrollView {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.jj.my f21635jd;
    private final yd jpo;

    public jj(Context context, yd ydVar) {
        super(context);
        this.jpo = ydVar;
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        this.f21635jd = myVar;
        myVar.setOrientation(1);
        addView(myVar, new FrameLayout.LayoutParams(-1, -2));
        if (ydVar.xyk() == 0) {
            jpo();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void jd(List<FilterWord> list) {
        this.f21635jd.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                this.f21635jd.addView(new qk(getContext(), filterWord, this.jpo));
            }
            if (i10 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iJd = va.jd(getContext(), this.jpo.zz() ? 16.0f : 8.0f);
                layoutParams.topMargin = iJd;
                layoutParams.bottomMargin = iJd;
                this.f21635jd.addView(new ju(getContext()), layoutParams);
            }
        }
    }

    private void jpo() {
        if (this.jpo.xyk() != 0) {
            return;
        }
        this.jpo.jpo(va.wqx(getContext()), va.my(getContext()));
    }

    private static List<FilterWord> wqx(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).hasSecondOptions()) {
                i11 = i12;
            }
        }
        if (i11 != -1 && i11 <= list.size()) {
            i10 = i11;
        }
        FilterWord filterWord = list.get(i10);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    public void jpo(List<FilterWord> list) {
        List<FilterWord> listWqx = wqx(list);
        if (listWqx == null) {
            return;
        }
        jd(listWqx);
    }
}
