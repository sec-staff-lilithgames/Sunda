package in;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f59801a = a1.intToStringMaxRadix(0);

    /* renamed from: b, reason: collision with root package name */
    public static final String f59802b = a1.intToStringMaxRadix(1);

    /* renamed from: c, reason: collision with root package name */
    public static final String f59803c = a1.intToStringMaxRadix(2);

    /* renamed from: d, reason: collision with root package name */
    public static final String f59804d = a1.intToStringMaxRadix(3);

    /* renamed from: e, reason: collision with root package name */
    public static final String f59805e = a1.intToStringMaxRadix(4);

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f59801a, spanned.getSpanStart(obj));
        bundle2.putInt(f59802b, spanned.getSpanEnd(obj));
        bundle2.putInt(f59803c, spanned.getSpanFlags(obj));
        bundle2.putInt(f59804d, i10);
        if (bundle != null) {
            bundle2.putBundle(f59805e, bundle);
        }
        return bundle2;
    }

    public static ArrayList<Bundle> bundleCustomSpans(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(a(spanned, hVar, 1, hVar.toBundle()));
        }
        for (j jVar : (j[]) spanned.getSpans(0, spanned.length(), j.class)) {
            arrayList.add(a(spanned, jVar, 2, jVar.toBundle()));
        }
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(a(spanned, fVar, 3, null));
        }
        for (k kVar : (k[]) spanned.getSpans(0, spanned.length(), k.class)) {
            arrayList.add(a(spanned, kVar, 4, kVar.toBundle()));
        }
        return arrayList;
    }

    public static void unbundleAndApplyCustomSpan(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f59801a);
        int i11 = bundle.getInt(f59802b);
        int i12 = bundle.getInt(f59803c);
        int i13 = bundle.getInt(f59804d, -1);
        Bundle bundle2 = bundle.getBundle(f59805e);
        if (i13 == 1) {
            spannable.setSpan(h.fromBundle((Bundle) io.bidmachine.media3.common.util.a.checkNotNull(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(j.fromBundle((Bundle) io.bidmachine.media3.common.util.a.checkNotNull(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new f(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(k.fromBundle((Bundle) io.bidmachine.media3.common.util.a.checkNotNull(bundle2)), i10, i11, i12);
        }
    }
}
