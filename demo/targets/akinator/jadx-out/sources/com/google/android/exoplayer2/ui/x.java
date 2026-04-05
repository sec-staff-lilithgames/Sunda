package com.google.android.exoplayer2.ui;

import android.view.View;
import bf.m1;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.ui.u;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.VendorAdapter;
import gn.i1;
import gn.v1;
import gn.w1;
import io.bidmachine.media3.ui.k;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28401c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28404g;

    public /* synthetic */ x(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f28400b = i10;
        this.f28401c = obj;
        this.f28402e = obj2;
        this.f28403f = obj3;
        this.f28404g = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28400b) {
            case 0:
                y yVar = (y) this.f28401c;
                r2 r2Var = (r2) this.f28402e;
                m1 m1Var = (m1) this.f28403f;
                u.e eVar = (u.e) this.f28404g;
                yVar.getClass();
                r2Var.setTrackSelectionParameters(r2Var.getTrackSelectionParameters().buildUpon().setOverrideForType(new pf.q(m1Var, b5.of(Integer.valueOf(eVar.f28394b)))).setTrackTypeDisabled(eVar.f28393a.getType(), false).build());
                yVar.onTrackSelection(eVar.f28395c);
                yVar.f28406j.f28352m.dismiss();
                break;
            case 1:
                VendorAdapter.VendorViewHolder.bind$lambda$1$lambda$0((VendorAdapter.VendorListener) this.f28401c, (String) this.f28402e, (Vendor) this.f28403f, (VendorAdapter) this.f28404g, view);
                break;
            default:
                io.bidmachine.media3.ui.n nVar = (io.bidmachine.media3.ui.n) this.f28401c;
                i1 i1Var = (i1) this.f28402e;
                v1 v1Var = (v1) this.f28403f;
                k.e eVar2 = (k.e) this.f28404g;
                nVar.getClass();
                if (i1Var.isCommandAvailable(29)) {
                    i1Var.setTrackSelectionParameters(i1Var.getTrackSelectionParameters().buildUpon().setOverrideForType(new w1(v1Var, b5.of(Integer.valueOf(eVar2.f61835b)))).setTrackTypeDisabled(eVar2.f61834a.getType(), false).build());
                    nVar.onTrackSelection(eVar2.f61836c);
                    nVar.f61866j.f61792m.dismiss();
                    break;
                }
                break;
        }
    }
}
