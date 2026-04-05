package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6198b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6199c;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f6200e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f6201f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6202g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6203h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6204i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6205j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f6206k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6207l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f6208m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6209n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f6210o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6211p;

    public BackStackRecordState(a aVar) {
        int size = aVar.f6362c.size();
        this.f6198b = new int[size * 6];
        if (!aVar.f6368i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f6199c = new ArrayList(size);
        this.f6200e = new int[size];
        this.f6201f = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            g2 g2Var = (g2) aVar.f6362c.get(i11);
            int i12 = i10 + 1;
            this.f6198b[i10] = g2Var.f6325a;
            ArrayList arrayList = this.f6199c;
            Fragment fragment = g2Var.f6326b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f6198b;
            iArr[i12] = g2Var.f6327c ? 1 : 0;
            iArr[i10 + 2] = g2Var.f6328d;
            iArr[i10 + 3] = g2Var.f6329e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = g2Var.f6330f;
            i10 += 6;
            iArr[i13] = g2Var.f6331g;
            this.f6200e[i11] = g2Var.f6332h.ordinal();
            this.f6201f[i11] = g2Var.f6333i.ordinal();
        }
        this.f6202g = aVar.f6367h;
        this.f6203h = aVar.f6370k;
        this.f6204i = aVar.f6271v;
        this.f6205j = aVar.f6371l;
        this.f6206k = aVar.f6372m;
        this.f6207l = aVar.f6373n;
        this.f6208m = aVar.f6374o;
        this.f6209n = aVar.f6375p;
        this.f6210o = aVar.f6376q;
        this.f6211p = aVar.f6377r;
    }

    public final void a(a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f6198b;
            boolean z10 = true;
            if (i10 >= iArr.length) {
                aVar.f6367h = this.f6202g;
                aVar.f6370k = this.f6203h;
                aVar.f6368i = true;
                aVar.f6371l = this.f6205j;
                aVar.f6372m = this.f6206k;
                aVar.f6373n = this.f6207l;
                aVar.f6374o = this.f6208m;
                aVar.f6375p = this.f6209n;
                aVar.f6376q = this.f6210o;
                aVar.f6377r = this.f6211p;
                return;
            }
            g2 g2Var = new g2();
            int i12 = i10 + 1;
            g2Var.f6325a = iArr[i10];
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + iArr[i12]);
            }
            g2Var.f6332h = androidx.lifecycle.j0.values()[this.f6200e[i11]];
            g2Var.f6333i = androidx.lifecycle.j0.values()[this.f6201f[i11]];
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            g2Var.f6327c = z10;
            int i14 = iArr[i13];
            g2Var.f6328d = i14;
            int i15 = iArr[i10 + 3];
            g2Var.f6329e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            g2Var.f6330f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            g2Var.f6331g = i18;
            aVar.f6363d = i14;
            aVar.f6364e = i15;
            aVar.f6365f = i17;
            aVar.f6366g = i18;
            aVar.a(g2Var);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a instantiate(FragmentManager fragmentManager) {
        a aVar = new a(fragmentManager);
        a(aVar);
        aVar.f6271v = this.f6204i;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6199c;
            if (i10 >= arrayList.size()) {
                aVar.d(1);
                return aVar;
            }
            String str = (String) arrayList.get(i10);
            if (str != null) {
                ((g2) aVar.f6362c.get(i10)).f6326b = fragmentManager.f6222c.b(str);
            }
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f6198b);
        parcel.writeStringList(this.f6199c);
        parcel.writeIntArray(this.f6200e);
        parcel.writeIntArray(this.f6201f);
        parcel.writeInt(this.f6202g);
        parcel.writeString(this.f6203h);
        parcel.writeInt(this.f6204i);
        parcel.writeInt(this.f6205j);
        TextUtils.writeToParcel(this.f6206k, parcel, 0);
        parcel.writeInt(this.f6207l);
        TextUtils.writeToParcel(this.f6208m, parcel, 0);
        parcel.writeStringList(this.f6209n);
        parcel.writeStringList(this.f6210o);
        parcel.writeInt(this.f6211p ? 1 : 0);
    }

    public a instantiate(FragmentManager fragmentManager, Map<String, Fragment> map) {
        a aVar = new a(fragmentManager);
        a(aVar);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6199c;
            if (i10 >= arrayList.size()) {
                return aVar;
            }
            String str = (String) arrayList.get(i10);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    ((g2) aVar.f6362c.get(i10)).f6326b = fragment;
                } else {
                    throw new IllegalStateException(p0.o2.r(new StringBuilder("Restoring FragmentTransaction "), this.f6203h, " failed due to missing saved state for Fragment (", str, ")"));
                }
            }
            i10++;
        }
    }

    public BackStackRecordState(Parcel parcel) {
        this.f6198b = parcel.createIntArray();
        this.f6199c = parcel.createStringArrayList();
        this.f6200e = parcel.createIntArray();
        this.f6201f = parcel.createIntArray();
        this.f6202g = parcel.readInt();
        this.f6203h = parcel.readString();
        this.f6204i = parcel.readInt();
        this.f6205j = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f6206k = (CharSequence) creator.createFromParcel(parcel);
        this.f6207l = parcel.readInt();
        this.f6208m = (CharSequence) creator.createFromParcel(parcel);
        this.f6209n = parcel.createStringArrayList();
        this.f6210o = parcel.createStringArrayList();
        this.f6211p = parcel.readInt() != 0;
    }
}
