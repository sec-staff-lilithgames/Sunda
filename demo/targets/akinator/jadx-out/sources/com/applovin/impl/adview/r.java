package com.applovin.impl.adview;

import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.z1;
import com.google.android.material.search.SearchView;
import com.inmobi.media.C2974rc;
import com.inmobi.media.L7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13563b;

    public /* synthetic */ r(int i10) {
        this.f13563b = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13563b) {
            case 0:
                return b.a(view, motionEvent);
            case 1:
                return z1.a(view, motionEvent);
            case 2:
                int i10 = SearchView.G;
                return true;
            case 3:
                return L7.a(view, motionEvent);
            default:
                return C2974rc.a(view, motionEvent);
        }
    }
}
