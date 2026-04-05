package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l0 extends RecyclerView.a {

    /* renamed from: i, reason: collision with root package name */
    public final s f29184i;

    public l0(s sVar) {
        this.f29184i = sVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f29184i.f29193e.f29135h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(k0 k0Var, int i10) {
        s sVar = this.f29184i;
        int i11 = sVar.f29193e.f29130b.f29148e + i10;
        k0Var.f29183c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = k0Var.f29183c;
        Context context = textView.getContext();
        textView.setContentDescription(j0.b().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        androidx.localbroadcastmanager.content.b bVar = sVar.f29197i;
        if (j0.b().get(1) == i11) {
            Object obj = bVar.f6757b;
        } else {
            Object obj2 = bVar.f6756a;
        }
        sVar.getDateSelector();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public k0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new k0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
