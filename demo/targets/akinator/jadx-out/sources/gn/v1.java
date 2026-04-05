package gn;

import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import nh.b5;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v1 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f58203f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f58204g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f58205a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58207c;

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.b[] f58208d;

    /* renamed from: e, reason: collision with root package name */
    public int f58209e;

    public v1(io.bidmachine.media3.common.b... bVarArr) {
        this("", bVarArr);
    }

    public static void a(int i10, String str, String str2, String str3) {
        StringBuilder sbB = b3.h.b("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbB.append(str3);
        sbB.append("' (track ");
        sbB.append(i10);
        sbB.append(")");
        io.bidmachine.media3.common.util.b0.e("TrackGroup", "", new IllegalStateException(sbB.toString()));
    }

    public static v1 fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f58203f);
        return new v1(bundle.getString(f58204g, ""), (io.bidmachine.media3.common.b[]) (parcelableArrayList == null ? b5.of() : io.bidmachine.media3.common.util.f.fromBundleList(new ao.c(23), parcelableArrayList)).toArray(new io.bidmachine.media3.common.b[0]));
    }

    public v1 copyWithId(String str) {
        return new v1(str, this.f58208d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f58206b.equals(v1Var.f58206b) && Arrays.equals(this.f58208d, v1Var.f58208d)) {
                return true;
            }
        }
        return false;
    }

    public io.bidmachine.media3.common.b getFormat(int i10) {
        return this.f58208d[i10];
    }

    public int hashCode() {
        if (this.f58209e == 0) {
            this.f58209e = Arrays.hashCode(this.f58208d) + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f58206b);
        }
        return this.f58209e;
    }

    public int indexOf(io.bidmachine.media3.common.b bVar) {
        int i10 = 0;
        while (true) {
            io.bidmachine.media3.common.b[] bVarArr = this.f58208d;
            if (i10 >= bVarArr.length) {
                return -1;
            }
            if (bVar == bVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        io.bidmachine.media3.common.b[] bVarArr = this.f58208d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bVarArr.length);
        for (io.bidmachine.media3.common.b bVar : bVarArr) {
            arrayList.add(bVar.toBundle());
        }
        bundle.putParcelableArrayList(f58203f, arrayList);
        bundle.putString(f58204g, this.f58206b);
        return bundle;
    }

    public String toString() {
        return this.f58206b + ": " + Arrays.toString(this.f58208d);
    }

    public v1(String str, io.bidmachine.media3.common.b... bVarArr) {
        io.bidmachine.media3.common.util.a.checkArgument(bVarArr.length > 0);
        this.f58206b = str;
        this.f58208d = bVarArr;
        this.f58205a = bVarArr.length;
        int trackType = x0.getTrackType(bVarArr[0].f60665o);
        this.f58207c = trackType == -1 ? x0.getTrackType(bVarArr[0].f60664n) : trackType;
        String str2 = bVarArr[0].f60654d;
        str2 = (str2 == null || str2.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str2;
        int i10 = bVarArr[0].f60656f | 16384;
        for (int i11 = 1; i11 < bVarArr.length; i11++) {
            String str3 = bVarArr[i11].f60654d;
            if (!str2.equals((str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3)) {
                a(i11, "languages", bVarArr[0].f60654d, bVarArr[i11].f60654d);
                return;
            } else {
                if (i10 != (bVarArr[i11].f60656f | 16384)) {
                    a(i11, "role flags", Integer.toBinaryString(bVarArr[0].f60656f), Integer.toBinaryString(bVarArr[i11].f60656f));
                    return;
                }
            }
        }
    }
}
