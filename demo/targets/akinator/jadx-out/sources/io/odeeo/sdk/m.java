package io.odeeo.sdk;

import androidx.core.app.NotificationCompat;
import b0.e2;
import io.odeeo.sdk.AdUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final AdPosition f68158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68160c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68161d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68162e;

    /* renamed from: f, reason: collision with root package name */
    public AdUnit.ActionButtonType f68163f;

    /* renamed from: g, reason: collision with root package name */
    public final float f68164g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68165h;

    /* renamed from: i, reason: collision with root package name */
    public final AdUnit.ActionButtonPosition f68166i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f68167j;

    public m(AdPosition pos, int i10, int i11, int i12, int i13, AdUnit.ActionButtonType actionType, float f10, int i14, AdUnit.ActionButtonPosition actionButtonPosition, boolean z10) {
        e0.checkNotNullParameter(pos, "pos");
        e0.checkNotNullParameter(actionType, "actionType");
        this.f68158a = pos;
        this.f68159b = i10;
        this.f68160c = i11;
        this.f68161d = i12;
        this.f68162e = i13;
        this.f68163f = actionType;
        this.f68164g = f10;
        this.f68165h = i14;
        this.f68166i = actionButtonPosition;
        this.f68167j = z10;
    }

    public static /* synthetic */ m copy$default(m mVar, AdPosition adPosition, int i10, int i11, int i12, int i13, AdUnit.ActionButtonType actionButtonType, float f10, int i14, AdUnit.ActionButtonPosition actionButtonPosition, boolean z10, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            adPosition = mVar.f68158a;
        }
        if ((i15 & 2) != 0) {
            i10 = mVar.f68159b;
        }
        if ((i15 & 4) != 0) {
            i11 = mVar.f68160c;
        }
        if ((i15 & 8) != 0) {
            i12 = mVar.f68161d;
        }
        if ((i15 & 16) != 0) {
            i13 = mVar.f68162e;
        }
        if ((i15 & 32) != 0) {
            actionButtonType = mVar.f68163f;
        }
        if ((i15 & 64) != 0) {
            f10 = mVar.f68164g;
        }
        if ((i15 & 128) != 0) {
            i14 = mVar.f68165h;
        }
        if ((i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            actionButtonPosition = mVar.f68166i;
        }
        if ((i15 & 512) != 0) {
            z10 = mVar.f68167j;
        }
        AdUnit.ActionButtonPosition actionButtonPosition2 = actionButtonPosition;
        boolean z11 = z10;
        float f11 = f10;
        int i16 = i14;
        int i17 = i13;
        AdUnit.ActionButtonType actionButtonType2 = actionButtonType;
        return mVar.copy(adPosition, i10, i11, i12, i17, actionButtonType2, f11, i16, actionButtonPosition2, z11);
    }

    public final AdPosition component1() {
        return this.f68158a;
    }

    public final boolean component10() {
        return this.f68167j;
    }

    public final int component2() {
        return this.f68159b;
    }

    public final int component3() {
        return this.f68160c;
    }

    public final int component4() {
        return this.f68161d;
    }

    public final int component5() {
        return this.f68162e;
    }

    public final AdUnit.ActionButtonType component6() {
        return this.f68163f;
    }

    public final float component7() {
        return this.f68164g;
    }

    public final int component8() {
        return this.f68165h;
    }

    public final AdUnit.ActionButtonPosition component9() {
        return this.f68166i;
    }

    public final m copy(AdPosition pos, int i10, int i11, int i12, int i13, AdUnit.ActionButtonType actionType, float f10, int i14, AdUnit.ActionButtonPosition actionButtonPosition, boolean z10) {
        e0.checkNotNullParameter(pos, "pos");
        e0.checkNotNullParameter(actionType, "actionType");
        return new m(pos, i10, i11, i12, i13, actionType, f10, i14, actionButtonPosition, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return e0.areEqual(this.f68158a, mVar.f68158a) && this.f68159b == mVar.f68159b && this.f68160c == mVar.f68160c && this.f68161d == mVar.f68161d && this.f68162e == mVar.f68162e && this.f68163f == mVar.f68163f && e0.areEqual((Object) Float.valueOf(this.f68164g), (Object) Float.valueOf(mVar.f68164g)) && this.f68165h == mVar.f68165h && this.f68166i == mVar.f68166i && this.f68167j == mVar.f68167j;
    }

    public final float getActionButtonDelayMillis() {
        return this.f68164g;
    }

    public final AdUnit.ActionButtonPosition getActionButtonPosition() {
        return this.f68166i;
    }

    public final AdUnit.ActionButtonType getActionType() {
        return this.f68163f;
    }

    public final int getColor() {
        return this.f68162e;
    }

    public final AdPosition getPos() {
        return this.f68158a;
    }

    public final boolean getShouldUsePopup() {
        return this.f68167j;
    }

    public final int getSize() {
        return this.f68161d;
    }

    public final int getWindowFlags() {
        return this.f68165h;
    }

    public final int getX() {
        return this.f68159b;
    }

    public final int getY() {
        return this.f68160c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iD = e3.g.d(this.f68165h, e2.b(this.f68164g, (this.f68163f.hashCode() + e3.g.d(this.f68162e, e3.g.d(this.f68161d, e3.g.d(this.f68160c, e3.g.d(this.f68159b, this.f68158a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31);
        AdUnit.ActionButtonPosition actionButtonPosition = this.f68166i;
        int iHashCode = (iD + (actionButtonPosition == null ? 0 : actionButtonPosition.hashCode())) * 31;
        boolean z10 = this.f68167j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final void setActionType(AdUnit.ActionButtonType actionButtonType) {
        e0.checkNotNullParameter(actionButtonType, "<set-?>");
        this.f68163f = actionButtonType;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlacementData(pos=");
        sb2.append(this.f68158a);
        sb2.append(", x=");
        sb2.append(this.f68159b);
        sb2.append(", y=");
        sb2.append(this.f68160c);
        sb2.append(", size=");
        sb2.append(this.f68161d);
        sb2.append(", color=");
        sb2.append(this.f68162e);
        sb2.append(", actionType=");
        sb2.append(this.f68163f);
        sb2.append(", actionButtonDelayMillis=");
        sb2.append(this.f68164g);
        sb2.append(", windowFlags=");
        sb2.append(this.f68165h);
        sb2.append(", actionButtonPosition=");
        sb2.append(this.f68166i);
        sb2.append(", shouldUsePopup=");
        return a.b.p(sb2, this.f68167j, ')');
    }
}
