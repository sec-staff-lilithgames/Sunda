package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.t;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final int f23921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23923c;

    public g(int i10, int i11, int i12) {
        this.f23921a = i10;
        this.f23922b = i11;
        this.f23923c = i12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 2;
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        if (!TextUtils.equals("VPAID", rVar2.f24140f)) {
            if (!TextUtils.equals("VPAID", rVar.f24140f)) {
                Integer num2 = rVar.f24139e;
                int iIntValue = num2 == null ? 0 : num2.intValue();
                Integer num3 = rVar2.f24139e;
                int iIntValue2 = num3 == null ? 0 : num3.intValue();
                int i10 = this.f23921a;
                if (iIntValue2 <= i10 || iIntValue > i10) {
                    if (iIntValue <= i10 || iIntValue2 > i10) {
                        t tVarA = t.a(rVar2.f24138d);
                        t tVar = t.MEDIA_TYPE_MP4;
                        Integer num4 = tVarA == tVar ? 3 : tVarA == t.MEDIA_TYPE_3GPP ? num : tVarA == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        t tVarA2 = t.a(rVar.f24138d);
                        if (tVarA2 == tVar) {
                            num = 3;
                        } else if (tVarA2 != t.MEDIA_TYPE_3GPP) {
                            num = tVarA2 == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        }
                        int iCompareTo = num4.compareTo(num);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                        if (iIntValue >= iIntValue2) {
                            if (iIntValue <= iIntValue2) {
                                Integer num5 = rVar.f24136b;
                                int iIntValue3 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = rVar.f24137c;
                                int iIntValue4 = num6 == null ? 0 : num6.intValue();
                                Integer num7 = rVar2.f24136b;
                                int iIntValue5 = num7 == null ? 0 : num7.intValue();
                                Integer num8 = rVar2.f24137c;
                                int i11 = iIntValue3 * iIntValue4;
                                int iIntValue6 = iIntValue5 * (num8 == null ? 0 : num8.intValue());
                                int i12 = this.f23922b * this.f23923c;
                                int iAbs = Math.abs(i11 - i12);
                                int iAbs2 = Math.abs(iIntValue6 - i12);
                                if (iAbs >= iAbs2) {
                                    if (iAbs <= iAbs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
