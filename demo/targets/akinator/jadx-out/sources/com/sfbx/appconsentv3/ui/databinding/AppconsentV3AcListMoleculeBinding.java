package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.ui.components.atom.ACBulletAtom;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3AcListMoleculeBinding implements a {
    public final ACBulletAtom acListMoleculeBullet;
    public final AppCompatTextView acListMoleculeText;
    private final ConstraintLayout rootView;

    private AppconsentV3AcListMoleculeBinding(ConstraintLayout constraintLayout, ACBulletAtom aCBulletAtom, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.acListMoleculeBullet = aCBulletAtom;
        this.acListMoleculeText = appCompatTextView;
    }

    public static AppconsentV3AcListMoleculeBinding bind(View view) {
        int i10 = R.id.ac_list_molecule_bullet;
        ACBulletAtom aCBulletAtom = (ACBulletAtom) b.findChildViewById(view, i10);
        if (aCBulletAtom != null) {
            i10 = R.id.ac_list_molecule_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                return new AppconsentV3AcListMoleculeBinding((ConstraintLayout) view, aCBulletAtom, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3AcListMoleculeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3AcListMoleculeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_ac_list_molecule, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
