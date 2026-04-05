package com.digidust.elokence.akinator.activities;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import aw.f;
import bj.v0;
import ca.m;
import ca.t;
import com.digidust.elokence.akinator.activities.HistoriquePodiumActivity;
import com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner;
import com.digidust.elokence.akinator.paid.databinding.ActivityHistoriquePodiumsBinding;
import j1.o2;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import kotlin.jvm.internal.e0;
import lb.b1;
import mt.n0;
import mt.r0;
import o9.j0;
import o9.o1;
import o9.p1;
import o9.q1;
import ou.j;
import pt.c;
import ta.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HistoriquePodiumActivity extends AkActivity {
    public static final /* synthetic */ int E = 0;
    public c C;
    public ActivityHistoriquePodiumsBinding D;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBindingInflate = ActivityHistoriquePodiumsBinding.inflate(getLayoutInflater());
        this.D = activityHistoriquePodiumsBindingInflate;
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding = null;
        if (activityHistoriquePodiumsBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBindingInflate = null;
        }
        setContentView(activityHistoriquePodiumsBindingInflate.getRoot());
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding2 = this.D;
        if (activityHistoriquePodiumsBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding2 = null;
        }
        ImageView imageView = activityHistoriquePodiumsBinding2.imageBackground;
        t tVarSharedInstance = t.sharedInstance();
        lb.c currentInstance = m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        Bitmap subjectBackgroundEndgame = tVarSharedInstance.getSubjectBackgroundEndgame(currentInstance.getSubjectId());
        e0.checkNotNullExpressionValue(subjectBackgroundEndgame, "getSubjectBackgroundEndgame(...)");
        Resources resources = getResources();
        e0.checkNotNullExpressionValue(resources, "getResources(...)");
        imageView.setImageDrawable(new BitmapDrawable(resources, subjectBackgroundEndgame));
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding3 = this.D;
        if (activityHistoriquePodiumsBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding3 = null;
        }
        ImageView imageView2 = activityHistoriquePodiumsBinding3.layoutSubjectIconTop.imageSubjectIconTop;
        t tVarSharedInstance2 = t.sharedInstance();
        lb.c currentInstance2 = m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance2);
        Bitmap subjectIcon = tVarSharedInstance2.getSubjectIcon(currentInstance2.getSubjectId());
        e0.checkNotNullExpressionValue(subjectIcon, "getSubjectIcon(...)");
        Resources resources2 = getResources();
        e0.checkNotNullExpressionValue(resources2, "getResources(...)");
        imageView2.setImageDrawable(new BitmapDrawable(resources2, subjectIcon));
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding4 = this.D;
        if (activityHistoriquePodiumsBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding4 = null;
        }
        activityHistoriquePodiumsBinding4.layoutReturn.retourButton.setOnClickListener(new j0(this, 2));
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding5 = this.D;
        if (activityHistoriquePodiumsBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding5 = null;
        }
        TextView textView = activityHistoriquePodiumsBinding5.messageErrorHistorique;
        Typeface typeface = this.f21686i;
        textView.setTypeface(typeface);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding6 = this.D;
        if (activityHistoriquePodiumsBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding6 = null;
        }
        activityHistoriquePodiumsBinding6.messageErrorLegendes.setTypeface(typeface);
        LinkedList linkedList = new LinkedList();
        linkedList.add(b1.f72741d.sharedInstance().getTraductionFromToken("30_DERNIERS_JOURS"));
        String[] months = new DateFormatSymbols().getMonths();
        Collections.addAll(linkedList, Arrays.copyOf(months, months.length));
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding7 = this.D;
        if (activityHistoriquePodiumsBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding7 = null;
        }
        AkinatorSpinner akinatorSpinner = activityHistoriquePodiumsBinding7.spinnerMonths;
        e0.checkNotNull(akinatorSpinner);
        akinatorSpinner.attachDataSource(linkedList);
        Calendar calendar = Calendar.getInstance();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add("-");
        int i10 = calendar.get(1);
        if (i10 > 2016) {
            while (2016 < i10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10);
                linkedList2.add(sb2.toString());
                i10--;
            }
        }
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding8 = this.D;
        if (activityHistoriquePodiumsBinding8 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding8 = null;
        }
        AkinatorSpinner akinatorSpinner2 = activityHistoriquePodiumsBinding8.spinnerYear;
        e0.checkNotNull(akinatorSpinner2);
        akinatorSpinner2.attachDataSource(linkedList2);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding9 = this.D;
        if (activityHistoriquePodiumsBinding9 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding9 = null;
        }
        AkinatorSpinner akinatorSpinner3 = activityHistoriquePodiumsBinding9.spinnerMonths;
        e0.checkNotNull(akinatorSpinner3);
        akinatorSpinner3.setOnItemSelectedListener(new p1(this));
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding10 = this.D;
        if (activityHistoriquePodiumsBinding10 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding10 = null;
        }
        AkinatorSpinner akinatorSpinner4 = activityHistoriquePodiumsBinding10.spinnerYear;
        e0.checkNotNull(akinatorSpinner4);
        akinatorSpinner4.setOnItemSelectedListener(new q1(this));
        t();
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding11 = this.D;
        if (activityHistoriquePodiumsBinding11 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding11 = null;
        }
        activityHistoriquePodiumsBinding11.messageErrorLegendes.setVisibility(8);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding12 = this.D;
        if (activityHistoriquePodiumsBinding12 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding12 = null;
        }
        activityHistoriquePodiumsBinding12.loadingBarLegendes.setVisibility(0);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding13 = this.D;
        if (activityHistoriquePodiumsBinding13 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding13 = null;
        }
        activityHistoriquePodiumsBinding13.legendesPodium.setAdapter((ListAdapter) null);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding14 = this.D;
        if (activityHistoriquePodiumsBinding14 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding14 = null;
        }
        activityHistoriquePodiumsBinding14.legendesPodium.setVisibility(8);
        lb.c currentInstance3 = m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance3);
        if (currentInstance3.getBaseLogiqueId() != 0) {
            k.a aVarCreateLegendsApiWithRxAndroid = k.f86666a.createLegendsApiWithRxAndroid();
            lb.c currentInstance4 = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance4);
            c cVarSubscribe = aVarCreateLegendsApiWithRxAndroid.getLegendsRx(currentInstance4.getBaseLogiqueId(), jb.c.f69226m.sharedInstance().getDeviceId()).observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new o1(this, 1), new o1(this, 2));
            e0.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
            disposeAtDestruction(cVarSubscribe);
            return;
        }
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding15 = this.D;
        if (activityHistoriquePodiumsBinding15 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding15 = null;
        }
        activityHistoriquePodiumsBinding15.loadingBarLegendes.setVisibility(8);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding16 = this.D;
        if (activityHistoriquePodiumsBinding16 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding16 = null;
        }
        activityHistoriquePodiumsBinding16.messageErrorLegendes.setVisibility(0);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding17 = this.D;
        if (activityHistoriquePodiumsBinding17 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHistoriquePodiumsBinding = activityHistoriquePodiumsBinding17;
        }
        o2.A(b1.f72741d, "CLASSEMENT_NON_DISPONIBLE", activityHistoriquePodiumsBinding.messageErrorLegendes);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        c cVar = this.C;
        if (cVar != null) {
            e0.checkNotNull(cVar);
            if (!cVar.isDisposed()) {
                c cVar2 = this.C;
                e0.checkNotNull(cVar2);
                cVar2.dispose();
            }
        }
        super.onDestroy();
    }

    public final void t() {
        c cVar = this.C;
        if (cVar != null) {
            e0.checkNotNull(cVar);
            if (!cVar.isDisposed()) {
                c cVar2 = this.C;
                e0.checkNotNull(cVar2);
                cVar2.dispose();
            }
        }
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding = this.D;
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding2 = null;
        if (activityHistoriquePodiumsBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding = null;
        }
        ListView listView = activityHistoriquePodiumsBinding.historiquePodiums;
        e0.checkNotNull(listView);
        listView.setAdapter((ListAdapter) null);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding3 = this.D;
        if (activityHistoriquePodiumsBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding3 = null;
        }
        ListView listView2 = activityHistoriquePodiumsBinding3.historiquePodiums;
        e0.checkNotNull(listView2);
        listView2.setVisibility(8);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding4 = this.D;
        if (activityHistoriquePodiumsBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding4 = null;
        }
        TextView textView = activityHistoriquePodiumsBinding4.messageErrorHistorique;
        e0.checkNotNull(textView);
        textView.setVisibility(8);
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding5 = this.D;
        if (activityHistoriquePodiumsBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding5 = null;
        }
        AkinatorSpinner akinatorSpinner = activityHistoriquePodiumsBinding5.spinnerMonths;
        e0.checkNotNull(akinatorSpinner);
        final int selectedIndex = akinatorSpinner.getSelectedIndex();
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding6 = this.D;
        if (activityHistoriquePodiumsBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding6 = null;
        }
        AkinatorSpinner akinatorSpinner2 = activityHistoriquePodiumsBinding6.spinnerYear;
        e0.checkNotNull(akinatorSpinner2);
        final int selectedIndex2 = akinatorSpinner2.getSelectedIndex();
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding7 = this.D;
        if (activityHistoriquePodiumsBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityHistoriquePodiumsBinding7 = null;
        }
        AkinatorSpinner akinatorSpinner3 = activityHistoriquePodiumsBinding7.spinnerYear;
        e0.checkNotNull(akinatorSpinner3);
        final String string = akinatorSpinner3.getText().toString();
        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding8 = this.D;
        if (activityHistoriquePodiumsBinding8 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHistoriquePodiumsBinding2 = activityHistoriquePodiumsBinding8;
        }
        ProgressBar progressBar = activityHistoriquePodiumsBinding2.loadingBarHistoriquePodiums;
        e0.checkNotNull(progressBar);
        progressBar.setVisibility(0);
        n0 n0VarCreate = n0.create(new r0() { // from class: o9.n1
            @Override // mt.r0
            public final void subscribe(mt.p0 e10) throws NumberFormatException {
                ArrayList<Pair<String, ArrayList<ta.f>>> arrayListCall;
                int i10 = HistoriquePodiumActivity.E;
                kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                int i12 = calendar.get(2);
                int i13 = selectedIndex;
                int i14 = selectedIndex2;
                ta.h hVar = ta.h.f86658a;
                if (i13 == 0 && i14 == 0) {
                    arrayListCall = hVar.call(i12 + 1, i11, 0);
                } else {
                    if (i14 != 0) {
                        i11 = Integer.parseInt(string);
                    }
                    arrayListCall = hVar.call(i13, i11, 1);
                }
                pt.c cVar3 = this.C;
                kotlin.jvm.internal.e0.checkNotNull(cVar3);
                if (cVar3.isDisposed()) {
                    return;
                }
                if (arrayListCall != null) {
                    ((du.g) e10).onSuccess(arrayListCall);
                } else {
                    ((du.g) e10).onError(new Exception(lb.b1.f72741d.sharedInstance().getTraductionFromToken("CLASSEMENT_NON_DISPONIBLE")));
                }
            }
        });
        e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
        this.C = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new v0(new f(this, 27), 15), new o1(this, 0));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
