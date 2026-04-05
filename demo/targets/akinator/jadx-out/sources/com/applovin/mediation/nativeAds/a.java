package com.applovin.mediation.nativeAds;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import bj.v0;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.ConfirmationMailActivity;
import com.digidust.elokence.akinator.activities.CreditsActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.PostHomeSliderActivity;
import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.ui.l0;
import com.google.android.exoplayer2.ui.q;
import com.google.android.exoplayer2.ui.u;
import com.google.android.exoplayer2.ui.w;
import com.google.android.exoplayer2.util.n1;
import com.google.android.material.datepicker.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.HeaderAdapter;
import com.sfbx.appconsentv3.ui.ui.finish.FinishActivity;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailAdapter;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter;
import com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment;
import com.sfbx.appconsentv3.ui.view.GeolocationBannerView;
import com.sfbx.appconsentv3.ui.view.NoticeBannerView;
import da.j;
import da.r;
import dh.d;
import dh.l;
import dh.y;
import gn.i1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.ui.a0;
import io.bidmachine.media3.ui.h;
import io.bidmachine.media3.ui.k;
import io.bidmachine.media3.ui.m;
import kotlin.jvm.internal.e0;
import mt.b0;
import o9.x;
import ot.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16476c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16475b = i10;
        this.f16476c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f16475b;
        boolean z10 = false;
        int i11 = 1;
        Object obj = this.f16476c;
        switch (i10) {
            case 0:
                ((MaxNativeAd) obj).performClick();
                return;
            case 1:
                u.a((u) obj);
                return;
            case 2:
                u uVar = ((q) obj).f28324k;
                r2 r2Var = uVar.f28347j0;
                if (r2Var == null) {
                    return;
                }
                ((r2) n1.castNonNull(uVar.f28347j0)).setTrackSelectionParameters(r2Var.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
                uVar.f28342h.setSubTextAtPosition(1, uVar.getResources().getString(R.string.exo_track_selection_auto));
                uVar.f28352m.dismiss();
                return;
            case 3:
                u.b bVar = (u.b) obj;
                u uVar2 = u.this;
                int adapterPosition = bVar.getAdapterPosition();
                View view2 = uVar2.B;
                if (adapterPosition == 0) {
                    uVar2.c(uVar2.f28344i, (View) com.google.android.exoplayer2.util.a.checkNotNull(view2));
                    return;
                } else if (adapterPosition == 1) {
                    uVar2.c(uVar2.f28348k, (View) com.google.android.exoplayer2.util.a.checkNotNull(view2));
                    return;
                } else {
                    uVar2.f28352m.dismiss();
                    return;
                }
            case 4:
                u uVar3 = ((w) obj).f28398k;
                r2 r2Var2 = uVar3.f28347j0;
                if (r2Var2 != null) {
                    uVar3.f28347j0.setTrackSelectionParameters(r2Var2.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).build());
                    uVar3.f28352m.dismiss();
                    return;
                }
                return;
            case 5:
                l0 l0Var = (l0) obj;
                l0Var.resetHideCallbacks();
                if (view.getId() == R.id.exo_overflow_show) {
                    l0Var.f28250q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        l0Var.f28251r.start();
                        return;
                    }
                    return;
                }
            case 6:
                ((v) obj).b();
                throw null;
            case 7:
                g.a((g) obj, view);
                return;
            case 8:
                HeaderAdapter.VendorLITHeaderViewHolder.bind$lambda$0((HeaderAdapter) obj, view);
                return;
            case 9:
                GeolocationDetailAdapter.VendorLITHeaderViewHolder.bind$lambda$0((GeolocationDetailAdapter) obj, view);
                return;
            case 10:
                NoticeAdapter.DescriptionHeaderViewHolder.bind$lambda$1((NoticeAdapter.DescriptionListener) obj, view);
                return;
            case 11:
                NoticeAdapter.DisplayVendorsViewHolder.bind$lambda$2$lambda$1((NoticeAdapter.VendorsListener) obj, view);
                return;
            case 12:
                VendorDetailAdapter.ConsentableLITHeaderViewHolder.bind$lambda$0((VendorDetailAdapter) obj, view);
                return;
            case 13:
                VendorListFragment.onViewCreated$lambda$4$lambda$3((VendorListFragment) obj, view);
                return;
            case 14:
                GeolocationBannerView.updateBannerUI$lambda$1$lambda$0((GeolocationBannerView) obj, view);
                return;
            case 15:
                NoticeBannerView.updateBannerUI$lambda$1$lambda$0((NoticeBannerView) obj, view);
                return;
            case 16:
                r rVar = (r) obj;
                Typeface typeface = r.f51971e;
                rVar.dismiss();
                j jVar = rVar.f51974c;
                if (jVar != null) {
                    e0.checkNotNull(jVar);
                    jVar.onOk();
                    return;
                }
                return;
            case 17:
                d dVar = (d) obj;
                EditText editText = dVar.f52222i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.k();
                return;
            case 18:
                ((l) obj).o();
                return;
            case 19:
                y yVar = (y) obj;
                EditText editText2 = yVar.f52325f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f52325f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f52325f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f52325f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f52325f.setSelection(selectionEnd);
                }
                yVar.k();
                return;
            case 20:
                FinishActivity.initUI$lambda$2$lambda$1((FinishActivity) obj, view);
                return;
            case 21:
                ((k) obj).updateIsFullscreen(!r10.f61795n0);
                return;
            case 22:
                k kVar = ((h) obj).f61758k;
                i1 i1Var = kVar.f61791l0;
                if (i1Var == null || !i1Var.isCommandAvailable(29)) {
                    return;
                }
                ((i1) a1.castNonNull(kVar.f61791l0)).setTrackSelectionParameters(kVar.f61791l0.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
                kVar.f61782h.setSubTextAtPosition(1, kVar.getResources().getString(R.string.exo_track_selection_auto));
                kVar.f61792m.dismiss();
                return;
            case 23:
                k.b bVar2 = (k.b) obj;
                k kVar2 = k.this;
                int bindingAdapterPosition = bVar2.getBindingAdapterPosition();
                View view3 = kVar2.B;
                if (bindingAdapterPosition == 0) {
                    kVar2.c(kVar2.f61784i, (View) io.bidmachine.media3.common.util.a.checkNotNull(view3));
                    return;
                } else if (bindingAdapterPosition == 1) {
                    kVar2.c(kVar2.f61788k, (View) io.bidmachine.media3.common.util.a.checkNotNull(view3));
                    return;
                } else {
                    kVar2.f61792m.dismiss();
                    return;
                }
            case 24:
                k kVar3 = ((m) obj).f61864k;
                i1 i1Var2 = kVar3.f61791l0;
                if (i1Var2 == null || !i1Var2.isCommandAvailable(29)) {
                    return;
                }
                kVar3.f61791l0.setTrackSelectionParameters(kVar3.f61791l0.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).setPreferredTextLanguage(null).setPreferredTextRoleFlags(0).build());
                kVar3.f61792m.dismiss();
                return;
            case 25:
                a0 a0Var = (a0) obj;
                a0Var.resetHideCallbacks();
                if (view.getId() == R.id.exo_overflow_show) {
                    a0Var.f61676q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        a0Var.f61677r.start();
                        return;
                    }
                    return;
                }
            case 26:
                io.odeeo.sdk.l.a((io.odeeo.sdk.l) obj, view);
                return;
            case 27:
                AkActivity akActivity = (AkActivity) obj;
                if (akActivity.f21698u) {
                    if (!(akActivity instanceof PostHomeSliderActivity) && !(akActivity instanceof GameOverSliderActivity) && !(akActivity instanceof SelectLanguageActivity)) {
                        z10 = true;
                    }
                    akActivity.goToHome(z10);
                    return;
                }
                return;
            case 28:
                int i12 = ConfirmationMailActivity.G;
                b0.fromCallable(new x(i11)).subscribeOn(ou.j.io()).observeOn(c.mainThread()).subscribe(new v0((ConfirmationMailActivity) obj, 12));
                return;
            default:
                int i13 = CreditsActivity.E;
                ((CreditsActivity) obj).onBackPressed();
                return;
        }
    }
}
