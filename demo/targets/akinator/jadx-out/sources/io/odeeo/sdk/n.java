package io.odeeo.sdk;

import b0.e2;
import io.odeeo.sdk.AdUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final AdUnit.RewardType f68168a;

    /* renamed from: b, reason: collision with root package name */
    public final AdUnit.PopUpType f68169b;

    /* renamed from: c, reason: collision with root package name */
    public final float f68170c;

    /* renamed from: d, reason: collision with root package name */
    public AdPosition f68171d;

    /* renamed from: e, reason: collision with root package name */
    public int f68172e;

    /* renamed from: f, reason: collision with root package name */
    public int f68173f;

    public n() {
        this(null, null, 0.0f, null, 0, 0, 63, null);
    }

    public static /* synthetic */ n copy$default(n nVar, AdUnit.RewardType rewardType, AdUnit.PopUpType popUpType, float f10, AdPosition adPosition, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            rewardType = nVar.f68168a;
        }
        if ((i12 & 2) != 0) {
            popUpType = nVar.f68169b;
        }
        if ((i12 & 4) != 0) {
            f10 = nVar.f68170c;
        }
        if ((i12 & 8) != 0) {
            adPosition = nVar.f68171d;
        }
        if ((i12 & 16) != 0) {
            i10 = nVar.f68172e;
        }
        if ((i12 & 32) != 0) {
            i11 = nVar.f68173f;
        }
        int i13 = i10;
        int i14 = i11;
        return nVar.copy(rewardType, popUpType, f10, adPosition, i13, i14);
    }

    public final AdUnit.RewardType component1() {
        return this.f68168a;
    }

    public final AdUnit.PopUpType component2() {
        return this.f68169b;
    }

    public final float component3() {
        return this.f68170c;
    }

    public final AdPosition component4() {
        return this.f68171d;
    }

    public final int component5() {
        return this.f68172e;
    }

    public final int component6() {
        return this.f68173f;
    }

    public final n copy(AdUnit.RewardType type, AdUnit.PopUpType popUpType, float f10, AdPosition adPosition, int i10, int i11) {
        e0.checkNotNullParameter(type, "type");
        return new n(type, popUpType, f10, adPosition, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f68168a == nVar.f68168a && this.f68169b == nVar.f68169b && e0.areEqual((Object) Float.valueOf(this.f68170c), (Object) Float.valueOf(nVar.f68170c)) && e0.areEqual(this.f68171d, nVar.f68171d) && this.f68172e == nVar.f68172e && this.f68173f == nVar.f68173f;
    }

    public final float getAmount() {
        return this.f68170c;
    }

    public final AdUnit.PopUpType getPopupType() {
        return this.f68169b;
    }

    public final AdPosition getPosition() {
        return this.f68171d;
    }

    public final AdUnit.RewardType getType() {
        return this.f68168a;
    }

    public final int getXOffset() {
        return this.f68172e;
    }

    public final int getYOffset() {
        return this.f68173f;
    }

    public int hashCode() {
        int iHashCode = this.f68168a.hashCode() * 31;
        AdUnit.PopUpType popUpType = this.f68169b;
        int iB = e2.b(this.f68170c, (iHashCode + (popUpType == null ? 0 : popUpType.hashCode())) * 31, 31);
        AdPosition adPosition = this.f68171d;
        return Integer.hashCode(this.f68173f) + e3.g.d(this.f68172e, (iB + (adPosition != null ? adPosition.hashCode() : 0)) * 31, 31);
    }

    public final boolean isPositionSet() {
        return this.f68171d != null;
    }

    public final void setPosition(AdPosition adPosition) {
        this.f68171d = adPosition;
    }

    public final void setXOffset(int i10) {
        this.f68172e = i10;
    }

    public final void setYOffset(int i10) {
        this.f68173f = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardedAdData(type=");
        sb2.append(this.f68168a);
        sb2.append(", popupType=");
        sb2.append(this.f68169b);
        sb2.append(", amount=");
        sb2.append(this.f68170c);
        sb2.append(", position=");
        sb2.append(this.f68171d);
        sb2.append(", xOffset=");
        sb2.append(this.f68172e);
        sb2.append(", yOffset=");
        return e3.g.m(sb2, this.f68173f, ')');
    }

    public n(AdUnit.RewardType type, AdUnit.PopUpType popUpType, float f10, AdPosition adPosition, int i10, int i11) {
        e0.checkNotNullParameter(type, "type");
        this.f68168a = type;
        this.f68169b = popUpType;
        this.f68170c = f10;
        this.f68171d = adPosition;
        this.f68172e = i10;
        this.f68173f = i11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ n(io.odeeo.sdk.AdUnit.RewardType r2, io.odeeo.sdk.AdUnit.PopUpType r3, float r4, io.odeeo.sdk.AdPosition r5, int r6, int r7, int r8, kotlin.jvm.internal.u r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            io.odeeo.sdk.AdUnit$RewardType r2 = io.odeeo.sdk.AdUnit.RewardType.Undefined
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = 0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1c
            r6 = r0
        L1c:
            r8 = r8 & 32
            if (r8 == 0) goto L28
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2f
        L28:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2f:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.n.<init>(io.odeeo.sdk.AdUnit$RewardType, io.odeeo.sdk.AdUnit$PopUpType, float, io.odeeo.sdk.AdPosition, int, int, int, kotlin.jvm.internal.u):void");
    }
}
