package in;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import io.bidmachine.media3.common.util.a1;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;

    /* renamed from: r, reason: collision with root package name */
    public static final String f59769r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f59770s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f59771t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f59772u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f59773v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f59774w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f59775x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f59776y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f59777z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f59778a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f59779b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f59780c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f59781d;

    /* renamed from: e, reason: collision with root package name */
    public final float f59782e;

    /* renamed from: f, reason: collision with root package name */
    public final int f59783f;

    /* renamed from: g, reason: collision with root package name */
    public final int f59784g;

    /* renamed from: h, reason: collision with root package name */
    public final float f59785h;

    /* renamed from: i, reason: collision with root package name */
    public final int f59786i;

    /* renamed from: j, reason: collision with root package name */
    public final float f59787j;

    /* renamed from: k, reason: collision with root package name */
    public final float f59788k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f59789l;

    /* renamed from: m, reason: collision with root package name */
    public final int f59790m;

    /* renamed from: n, reason: collision with root package name */
    public final int f59791n;

    /* renamed from: o, reason: collision with root package name */
    public final float f59792o;

    /* renamed from: p, reason: collision with root package name */
    public final int f59793p;

    /* renamed from: q, reason: collision with root package name */
    public final float f59794q;

    static {
        new a().setText("").build();
        f59769r = a1.intToStringMaxRadix(0);
        f59770s = a1.intToStringMaxRadix(17);
        f59771t = a1.intToStringMaxRadix(1);
        f59772u = a1.intToStringMaxRadix(2);
        f59773v = a1.intToStringMaxRadix(3);
        f59774w = a1.intToStringMaxRadix(18);
        f59775x = a1.intToStringMaxRadix(4);
        f59776y = a1.intToStringMaxRadix(5);
        f59777z = a1.intToStringMaxRadix(6);
        A = a1.intToStringMaxRadix(7);
        B = a1.intToStringMaxRadix(8);
        C = a1.intToStringMaxRadix(9);
        D = a1.intToStringMaxRadix(10);
        E = a1.intToStringMaxRadix(11);
        F = a1.intToStringMaxRadix(12);
        G = a1.intToStringMaxRadix(13);
        H = a1.intToStringMaxRadix(14);
        I = a1.intToStringMaxRadix(15);
        J = a1.intToStringMaxRadix(16);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            io.bidmachine.media3.common.util.a.checkNotNull(bitmap);
        } else {
            io.bidmachine.media3.common.util.a.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f59778a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f59778a = charSequence.toString();
        } else {
            this.f59778a = null;
        }
        this.f59779b = alignment;
        this.f59780c = alignment2;
        this.f59781d = bitmap;
        this.f59782e = f10;
        this.f59783f = i10;
        this.f59784g = i11;
        this.f59785h = f11;
        this.f59786i = i12;
        this.f59787j = f13;
        this.f59788k = f14;
        this.f59789l = z10;
        this.f59790m = i14;
        this.f59791n = i13;
        this.f59792o = f12;
        this.f59793p = i15;
        this.f59794q = f15;
    }

    public static b fromBundle(Bundle bundle) {
        a aVar = new a();
        CharSequence charSequence = bundle.getCharSequence(f59769r);
        if (charSequence != null) {
            aVar.setText(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f59770s);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    e.unbundleAndApplyCustomSpan((Bundle) it.next(), spannableStringValueOf);
                }
                aVar.setText(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f59771t);
        if (alignment != null) {
            aVar.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f59772u);
        if (alignment2 != null) {
            aVar.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f59773v);
        if (bitmap != null) {
            aVar.setBitmap(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f59774w);
            if (byteArray != null) {
                aVar.setBitmap(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f59775x;
        if (bundle.containsKey(str)) {
            String str2 = f59776y;
            if (bundle.containsKey(str2)) {
                aVar.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f59777z;
        if (bundle.containsKey(str3)) {
            aVar.setLineAnchor(bundle.getInt(str3));
        }
        String str4 = A;
        if (bundle.containsKey(str4)) {
            aVar.setPosition(bundle.getFloat(str4));
        }
        String str5 = B;
        if (bundle.containsKey(str5)) {
            aVar.setPositionAnchor(bundle.getInt(str5));
        }
        String str6 = D;
        if (bundle.containsKey(str6)) {
            String str7 = C;
            if (bundle.containsKey(str7)) {
                aVar.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = E;
        if (bundle.containsKey(str8)) {
            aVar.setSize(bundle.getFloat(str8));
        }
        String str9 = F;
        if (bundle.containsKey(str9)) {
            aVar.setBitmapHeight(bundle.getFloat(str9));
        }
        String str10 = G;
        if (bundle.containsKey(str10)) {
            aVar.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(H, false)) {
            aVar.clearWindowColor();
        }
        String str11 = I;
        if (bundle.containsKey(str11)) {
            aVar.setVerticalType(bundle.getInt(str11));
        }
        String str12 = J;
        if (bundle.containsKey(str12)) {
            aVar.setShearDegrees(bundle.getFloat(str12));
        }
        return aVar.build();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f59778a;
        if (charSequence != null) {
            bundle.putCharSequence(f59769r, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<Bundle> arrayListBundleCustomSpans = e.bundleCustomSpans((Spanned) charSequence);
                if (!arrayListBundleCustomSpans.isEmpty()) {
                    bundle.putParcelableArrayList(f59770s, arrayListBundleCustomSpans);
                }
            }
        }
        bundle.putSerializable(f59771t, this.f59779b);
        bundle.putSerializable(f59772u, this.f59780c);
        bundle.putFloat(f59775x, this.f59782e);
        bundle.putInt(f59776y, this.f59783f);
        bundle.putInt(f59777z, this.f59784g);
        bundle.putFloat(A, this.f59785h);
        bundle.putInt(B, this.f59786i);
        bundle.putInt(C, this.f59791n);
        bundle.putFloat(D, this.f59792o);
        bundle.putFloat(E, this.f59787j);
        bundle.putFloat(F, this.f59788k);
        bundle.putBoolean(H, this.f59789l);
        bundle.putInt(G, this.f59790m);
        bundle.putInt(I, this.f59793p);
        bundle.putFloat(J, this.f59794q);
        return bundle;
    }

    public a buildUpon() {
        a aVar = new a();
        aVar.f59752a = this.f59778a;
        aVar.f59753b = this.f59781d;
        aVar.f59754c = this.f59779b;
        aVar.f59755d = this.f59780c;
        aVar.f59756e = this.f59782e;
        aVar.f59757f = this.f59783f;
        aVar.f59758g = this.f59784g;
        aVar.f59759h = this.f59785h;
        aVar.f59760i = this.f59786i;
        aVar.f59761j = this.f59791n;
        aVar.f59762k = this.f59792o;
        aVar.f59763l = this.f59787j;
        aVar.f59764m = this.f59788k;
        aVar.f59765n = this.f59789l;
        aVar.f59766o = this.f59790m;
        aVar.f59767p = this.f59793p;
        aVar.f59768q = this.f59794q;
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Bitmap bitmap = bVar.f59781d;
        if (!TextUtils.equals(this.f59778a, bVar.f59778a) || this.f59779b != bVar.f59779b || this.f59780c != bVar.f59780c) {
            return false;
        }
        Bitmap bitmap2 = this.f59781d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f59782e == bVar.f59782e && this.f59783f == bVar.f59783f && this.f59784g == bVar.f59784g && this.f59785h == bVar.f59785h && this.f59786i == bVar.f59786i && this.f59787j == bVar.f59787j && this.f59788k == bVar.f59788k && this.f59789l == bVar.f59789l && this.f59790m == bVar.f59790m && this.f59791n == bVar.f59791n && this.f59792o == bVar.f59792o && this.f59793p == bVar.f59793p && this.f59794q == bVar.f59794q;
    }

    public int hashCode() {
        return Objects.hash(this.f59778a, this.f59779b, this.f59780c, this.f59781d, Float.valueOf(this.f59782e), Integer.valueOf(this.f59783f), Integer.valueOf(this.f59784g), Float.valueOf(this.f59785h), Integer.valueOf(this.f59786i), Float.valueOf(this.f59787j), Float.valueOf(this.f59788k), Boolean.valueOf(this.f59789l), Integer.valueOf(this.f59790m), Integer.valueOf(this.f59791n), Float.valueOf(this.f59792o), Integer.valueOf(this.f59793p), Float.valueOf(this.f59794q));
    }

    public Bundle toBinderBasedBundle() {
        Bundle bundleA = a();
        Bitmap bitmap = this.f59781d;
        if (bitmap != null) {
            bundleA.putParcelable(f59773v, bitmap);
        }
        return bundleA;
    }

    @Deprecated
    public Bundle toBundle() {
        return toBinderBasedBundle();
    }

    public Bundle toSerializableBundle() {
        Bundle bundleA = a();
        Bitmap bitmap = this.f59781d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            io.bidmachine.media3.common.util.a.checkState(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleA.putByteArray(f59774w, byteArrayOutputStream.toByteArray());
        }
        return bundleA;
    }
}
