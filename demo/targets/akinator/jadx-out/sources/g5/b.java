package g5;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DropDownPreference f57289b;

    public b(DropDownPreference dropDownPreference) {
        this.f57289b = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        if (i10 >= 0) {
            DropDownPreference dropDownPreference = this.f57289b;
            String string = dropDownPreference.getEntryValues()[i10].toString();
            if (string.equals(dropDownPreference.getValue()) || !dropDownPreference.callChangeListener(string)) {
                return;
            }
            dropDownPreference.setValue(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
