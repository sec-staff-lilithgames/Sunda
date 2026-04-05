package com.applovin.impl;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationAdapter;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class oa implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15002c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f15003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15004f;

    public /* synthetic */ oa(Object obj, KeyEvent.Callback callback, Object obj2, int i10) {
        this.f15001b = i10;
        this.f15002c = obj;
        this.f15003e = callback;
        this.f15004f = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15001b) {
            case 0:
                ((y1) this.f15002c).a((Activity) this.f15003e, (com.applovin.impl.sdk.k) this.f15004f, view);
                break;
            case 1:
                GeolocationAdapter.GeolocationHeaderViewHolder.bind$lambda$2$lambda$1$lambda$0((GeolocationAdapter.GeolocationHeaderViewHolder) this.f15002c, (AppCompatTextView) this.f15003e, (GeolocationAdapter) this.f15004f, view);
                break;
            default:
                GeolocationDetailAdapter.DescriptionHeaderViewHolder.bind$lambda$2$lambda$1((GeolocationDetailAdapter.DescriptionHeaderViewHolder) this.f15002c, (AppCompatTextView) this.f15003e, (GeolocationDetailAdapter) this.f15004f, view);
                break;
        }
    }
}
