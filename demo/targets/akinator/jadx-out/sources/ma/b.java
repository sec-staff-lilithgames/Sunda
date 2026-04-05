package ma;

import android.text.InputFilter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {
    public static InputFilter[] getFilter() {
        return new InputFilter[]{new a(2)};
    }

    public static InputFilter[] getFilterAndLength() {
        return new InputFilter[]{new a(0), new InputFilter.LengthFilter(6), new a(1)};
    }
}
