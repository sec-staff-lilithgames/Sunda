package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.digidust.elokence.akinator.freemium.R;
import g5.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: a0, reason: collision with root package name */
    public final Context f6887a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ArrayAdapter f6888b0;

    /* renamed from: c0, reason: collision with root package name */
    public Spinner f6889c0;

    /* renamed from: d0, reason: collision with root package name */
    public final g5.b f6890d0;

    public DropDownPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final void d() {
        ArrayAdapter arrayAdapter = this.f6888b0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void f() {
        this.f6889c0.performClick();
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(s sVar) {
        int length;
        Spinner spinner = (Spinner) sVar.itemView.findViewById(R.id.spinner);
        this.f6889c0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f6888b0);
        this.f6889c0.setOnItemSelectedListener(this.f6890d0);
        Spinner spinner2 = this.f6889c0;
        String value = getValue();
        CharSequence[] entryValues = getEntryValues();
        if (value == null || entryValues == null) {
            length = -1;
        } else {
            length = entryValues.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(entryValues[length].toString(), value)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.onBindViewHolder(sVar);
    }

    public final void q() {
        ArrayAdapter arrayAdapter = this.f6888b0;
        arrayAdapter.clear();
        if (getEntries() != null) {
            for (CharSequence charSequence : getEntries()) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public void setEntries(CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        q();
    }

    @Override // androidx.preference.ListPreference
    public void setValueIndex(int i10) {
        setValue(getEntryValues()[i10].toString());
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6890d0 = new g5.b(this);
        this.f6887a0 = context;
        this.f6888b0 = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        q();
    }
}
