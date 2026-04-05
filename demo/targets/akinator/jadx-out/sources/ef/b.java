package ef;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.n1;
import e6.h0;
import mh.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements com.google.android.exoplayer2.i {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f54291b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f54292c;

    /* renamed from: e, reason: collision with root package name */
    public final Layout.Alignment f54293e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f54294f;

    /* renamed from: g, reason: collision with root package name */
    public final float f54295g;

    /* renamed from: h, reason: collision with root package name */
    public final int f54296h;

    /* renamed from: i, reason: collision with root package name */
    public final int f54297i;

    /* renamed from: j, reason: collision with root package name */
    public final float f54298j;

    /* renamed from: k, reason: collision with root package name */
    public final int f54299k;

    /* renamed from: l, reason: collision with root package name */
    public final float f54300l;

    /* renamed from: m, reason: collision with root package name */
    public final float f54301m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f54302n;

    /* renamed from: o, reason: collision with root package name */
    public final int f54303o;

    /* renamed from: p, reason: collision with root package name */
    public final int f54304p;

    /* renamed from: q, reason: collision with root package name */
    public final float f54305q;

    /* renamed from: r, reason: collision with root package name */
    public final int f54306r;

    /* renamed from: s, reason: collision with root package name */
    public final float f54307s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f54284t = new a().setText("").build();

    /* renamed from: u, reason: collision with root package name */
    public static final String f54285u = n1.intToStringMaxRadix(0);

    /* renamed from: v, reason: collision with root package name */
    public static final String f54286v = n1.intToStringMaxRadix(1);

    /* renamed from: w, reason: collision with root package name */
    public static final String f54287w = n1.intToStringMaxRadix(2);

    /* renamed from: x, reason: collision with root package name */
    public static final String f54288x = n1.intToStringMaxRadix(3);

    /* renamed from: y, reason: collision with root package name */
    public static final String f54289y = n1.intToStringMaxRadix(4);

    /* renamed from: z, reason: collision with root package name */
    public static final String f54290z = n1.intToStringMaxRadix(5);
    public static final String A = n1.intToStringMaxRadix(6);
    public static final String B = n1.intToStringMaxRadix(7);
    public static final String C = n1.intToStringMaxRadix(8);
    public static final String D = n1.intToStringMaxRadix(9);
    public static final String E = n1.intToStringMaxRadix(10);
    public static final String F = n1.intToStringMaxRadix(11);
    public static final String G = n1.intToStringMaxRadix(12);
    public static final String H = n1.intToStringMaxRadix(13);
    public static final String I = n1.intToStringMaxRadix(14);
    public static final String J = n1.intToStringMaxRadix(15);
    public static final String K = n1.intToStringMaxRadix(16);
    public static final h0 L = new h0(3);

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            com.google.android.exoplayer2.util.a.checkNotNull(bitmap);
        } else {
            com.google.android.exoplayer2.util.a.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f54291b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f54291b = charSequence.toString();
        } else {
            this.f54291b = null;
        }
        this.f54292c = alignment;
        this.f54293e = alignment2;
        this.f54294f = bitmap;
        this.f54295g = f10;
        this.f54296h = i10;
        this.f54297i = i11;
        this.f54298j = f11;
        this.f54299k = i12;
        this.f54300l = f13;
        this.f54301m = f14;
        this.f54302n = z10;
        this.f54303o = i14;
        this.f54304p = i13;
        this.f54305q = f12;
        this.f54306r = i15;
        this.f54307s = f15;
    }

    public a buildUpon() {
        a aVar = new a();
        aVar.f54267a = this.f54291b;
        aVar.f54268b = this.f54294f;
        aVar.f54269c = this.f54292c;
        aVar.f54270d = this.f54293e;
        aVar.f54271e = this.f54295g;
        aVar.f54272f = this.f54296h;
        aVar.f54273g = this.f54297i;
        aVar.f54274h = this.f54298j;
        aVar.f54275i = this.f54299k;
        aVar.f54276j = this.f54304p;
        aVar.f54277k = this.f54305q;
        aVar.f54278l = this.f54300l;
        aVar.f54279m = this.f54301m;
        aVar.f54280n = this.f54302n;
        aVar.f54281o = this.f54303o;
        aVar.f54282p = this.f54306r;
        aVar.f54283q = this.f54307s;
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
        Bitmap bitmap = bVar.f54294f;
        if (!TextUtils.equals(this.f54291b, bVar.f54291b) || this.f54292c != bVar.f54292c || this.f54293e != bVar.f54293e) {
            return false;
        }
        Bitmap bitmap2 = this.f54294f;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f54295g == bVar.f54295g && this.f54296h == bVar.f54296h && this.f54297i == bVar.f54297i && this.f54298j == bVar.f54298j && this.f54299k == bVar.f54299k && this.f54300l == bVar.f54300l && this.f54301m == bVar.f54301m && this.f54302n == bVar.f54302n && this.f54303o == bVar.f54303o && this.f54304p == bVar.f54304p && this.f54305q == bVar.f54305q && this.f54306r == bVar.f54306r && this.f54307s == bVar.f54307s;
    }

    public int hashCode() {
        return h1.hashCode(this.f54291b, this.f54292c, this.f54293e, this.f54294f, Float.valueOf(this.f54295g), Integer.valueOf(this.f54296h), Integer.valueOf(this.f54297i), Float.valueOf(this.f54298j), Integer.valueOf(this.f54299k), Float.valueOf(this.f54300l), Float.valueOf(this.f54301m), Boolean.valueOf(this.f54302n), Integer.valueOf(this.f54303o), Integer.valueOf(this.f54304p), Float.valueOf(this.f54305q), Integer.valueOf(this.f54306r), Float.valueOf(this.f54307s));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f54285u, this.f54291b);
        bundle.putSerializable(f54286v, this.f54292c);
        bundle.putSerializable(f54287w, this.f54293e);
        bundle.putParcelable(f54288x, this.f54294f);
        bundle.putFloat(f54289y, this.f54295g);
        bundle.putInt(f54290z, this.f54296h);
        bundle.putInt(A, this.f54297i);
        bundle.putFloat(B, this.f54298j);
        bundle.putInt(C, this.f54299k);
        bundle.putInt(D, this.f54304p);
        bundle.putFloat(E, this.f54305q);
        bundle.putFloat(F, this.f54300l);
        bundle.putFloat(G, this.f54301m);
        bundle.putBoolean(I, this.f54302n);
        bundle.putInt(H, this.f54303o);
        bundle.putInt(J, this.f54306r);
        bundle.putFloat(K, this.f54307s);
        return bundle;
    }
}
