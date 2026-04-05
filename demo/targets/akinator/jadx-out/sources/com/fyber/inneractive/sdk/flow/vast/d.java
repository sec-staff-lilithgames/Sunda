package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final int f23917a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23918b;

    public d(int i10, int i11) {
        int i12 = i10 * i11;
        this.f23917a = i12;
        float f10 = i10 / i11;
        this.f23918b = f10;
        IAlog.a("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(f10));
        IAlog.d("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(f10));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) obj;
        com.fyber.inneractive.sdk.model.vast.c cVar2 = (com.fyber.inneractive.sdk.model.vast.c) obj2;
        int iA = v.a(cVar.f24093h, cVar2.f24093h);
        if (iA != 0) {
            return iA;
        }
        com.fyber.inneractive.sdk.model.vast.i iVar = cVar.f24086a;
        com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Html;
        int i10 = Integer.MAX_VALUE;
        int i11 = iVar == iVar2 ? 1 : iVar == com.fyber.inneractive.sdk.model.vast.i.Iframe ? 2 : iVar == com.fyber.inneractive.sdk.model.vast.i.Static ? 3 : Integer.MAX_VALUE;
        com.fyber.inneractive.sdk.model.vast.i iVar3 = cVar2.f24086a;
        if (iVar3 == iVar2) {
            i10 = 1;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Iframe) {
            i10 = 2;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Static) {
            i10 = 3;
        }
        int iA2 = v.a(i11, i10);
        if (iA2 != 0) {
            return iA2;
        }
        int iCompare = Float.compare(Math.abs((cVar.f24088c / cVar.f24089d) - this.f23918b), Math.abs((cVar2.f24088c / cVar2.f24089d) - this.f23918b));
        if (iCompare != 0) {
            return iCompare;
        }
        return v.a(Math.abs((cVar.f24088c * cVar.f24089d) - this.f23917a), Math.abs((cVar2.f24088c * cVar2.f24089d) - this.f23917a));
    }
}
