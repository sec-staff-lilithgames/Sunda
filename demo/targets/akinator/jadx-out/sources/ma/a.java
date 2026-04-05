package ma;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74123a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f74123a) {
            case 0:
                while (i10 < i11) {
                    int type = Character.getType(charSequence.charAt(i10));
                    if (type == 19 || type == 6 || type == 28 || type == 12) {
                        return "";
                    }
                    i10++;
                }
                return null;
            case 1:
                if (charSequence != null) {
                    if ("|".contains("" + ((Object) charSequence))) {
                        return "";
                    }
                }
                return null;
            default:
                while (i10 < i11) {
                    int type2 = Character.getType(charSequence.charAt(i10));
                    if (type2 == 19 || type2 == 28) {
                        return "";
                    }
                    i10++;
                }
                return null;
        }
    }
}
