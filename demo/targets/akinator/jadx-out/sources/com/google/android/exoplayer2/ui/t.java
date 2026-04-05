package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.view.View;
import com.google.android.exoplayer2.ui.u;
import io.bidmachine.media3.ui.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28327c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28328e;

    public /* synthetic */ t(Object obj, int i10, int i11) {
        this.f28326b = i11;
        this.f28328e = obj;
        this.f28327c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        switch (this.f28326b) {
            case 0:
                u.a aVar = (u.a) this.f28328e;
                u uVar = u.this;
                int i10 = aVar.f28381k;
                int i11 = this.f28327c;
                if (i11 != i10) {
                    uVar.setPlaybackSpeed(aVar.f28380j[i11]);
                }
                uVar.f28352m.dismiss();
                break;
            case 1:
                k.a aVar2 = (k.a) this.f28328e;
                io.bidmachine.media3.ui.k kVar = io.bidmachine.media3.ui.k.this;
                int i12 = aVar2.f61822k;
                int i13 = this.f28327c;
                if (i13 != i12) {
                    kVar.setPlaybackSpeed(aVar2.f61821j[i13]);
                }
                kVar.f61792m.dismiss();
                break;
            default:
                o9.a1 a1Var = (o9.a1) this.f28328e;
                a1Var.killThreadRefreshSlider();
                int i14 = 0;
                while (true) {
                    int count = a1Var.f78018c.getCount();
                    int i15 = this.f28327c;
                    boolean z10 = true;
                    if (i14 >= count) {
                        a1Var.f78017b.setCurrentItem(i15, true);
                        ca.m.sharedInstance().setSliderDefault((String) a1Var.f78022h.get(i15));
                        break;
                    } else {
                        if (i14 != i15) {
                            z10 = false;
                        }
                        a1Var.a(i14, z10);
                        i14++;
                    }
                }
        }
    }
}
