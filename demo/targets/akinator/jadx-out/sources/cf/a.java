package cf;

import android.net.Uri;
import android.os.Bundle;
import cf.b;
import com.applovin.impl.f5;
import com.applovin.impl.h3;
import com.applovin.impl.p3;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.v2;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h, t.a, p3.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12270b;

    public /* synthetic */ a(int i10) {
        this.f12270b = i10;
    }

    public static /* bridge */ /* synthetic */ Class b() {
        return BasicFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ Path d(Object obj) {
        return (Path) obj;
    }

    @Override // com.applovin.impl.p3.b
    public Object a(Object obj) {
        return r3.a((Long) obj);
    }

    @Override // t.a, jd.j
    public Object apply(Object obj) {
        f5 f5Var = (f5) obj;
        switch (this.f12270b) {
            case 4:
                return h3.a(f5Var);
            case 5:
            case 13:
            default:
                return v2.d(f5Var);
            case 6:
                return com.applovin.impl.sdk.ad.b.h(f5Var);
            case 7:
                return com.applovin.impl.sdk.ad.b.s(f5Var);
            case 8:
                return com.applovin.impl.sdk.ad.b.r(f5Var);
            case 9:
                return com.applovin.impl.sdk.ad.b.m(f5Var);
            case 10:
                return com.applovin.impl.sdk.ad.b.k(f5Var);
            case 11:
                return com.applovin.impl.sdk.ad.b.n(f5Var);
            case 12:
                return com.applovin.impl.sdk.ad.b.o(f5Var);
            case 14:
                return AppLovinNativeAdImpl.lambda$getDirectDownloadParameters$4(f5Var);
            case 15:
                return v2.f(f5Var);
            case 16:
                return v2.e(f5Var);
            case 17:
                return v2.b(f5Var);
            case 18:
                return v2.g(f5Var);
        }
    }

    @Override // com.google.android.exoplayer2.h
    public i fromBundle(Bundle bundle) {
        b.a[] aVarArr;
        switch (this.f12270b) {
            case 0:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(b.f12273k);
                if (parcelableArrayList == null) {
                    aVarArr = new b.a[0];
                } else {
                    b.a[] aVarArr2 = new b.a[parcelableArrayList.size()];
                    for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                        aVarArr2[i10] = (b.a) b.a.f12292s.fromBundle((Bundle) parcelableArrayList.get(i10));
                    }
                    aVarArr = aVarArr2;
                }
                return new b(null, aVarArr, bundle.getLong(b.f12274l, 0L), bundle.getLong(b.f12275m, C.TIME_UNSET), bundle.getInt(b.f12276n, 0));
            default:
                long j10 = bundle.getLong(b.a.f12284k);
                int i11 = bundle.getInt(b.a.f12285l);
                int i12 = bundle.getInt(b.a.f12291r);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(b.a.f12286m);
                int[] intArray = bundle.getIntArray(b.a.f12287n);
                long[] longArray = bundle.getLongArray(b.a.f12288o);
                long j11 = bundle.getLong(b.a.f12289p);
                boolean z10 = bundle.getBoolean(b.a.f12290q);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new b.a(j10, i11, i12, iArr, uriArr, longArray, j11, z10);
        }
    }
}
