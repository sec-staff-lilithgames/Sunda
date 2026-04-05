package a2;

import androidx.core.app.NotificationCompat;
import ao.kwoC.zAQQWzBxnS;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3494b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3495c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3497e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3498f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3499g;

    /* renamed from: h, reason: collision with root package name */
    public float f3500h;

    /* renamed from: i, reason: collision with root package name */
    public float f3501i;

    /* renamed from: j, reason: collision with root package name */
    public float f3502j;

    /* renamed from: k, reason: collision with root package name */
    public float f3503k;

    /* renamed from: l, reason: collision with root package name */
    public float f3504l;

    /* renamed from: m, reason: collision with root package name */
    public int f3505m;

    /* renamed from: n, reason: collision with root package name */
    public int f3506n;

    /* renamed from: o, reason: collision with root package name */
    public float f3507o;

    /* renamed from: p, reason: collision with root package name */
    public float f3508p;

    /* renamed from: q, reason: collision with root package name */
    public float f3509q;

    /* renamed from: r, reason: collision with root package name */
    public float f3510r;

    /* renamed from: s, reason: collision with root package name */
    public float f3511s;

    /* renamed from: t, reason: collision with root package name */
    public float f3512t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3513u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3514v;

    /* renamed from: w, reason: collision with root package name */
    public float f3515w;

    /* renamed from: x, reason: collision with root package name */
    public j1.z1 f3516x;

    public d3(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, j1.z1 z1Var) {
        this.f3493a = j10;
        this.f3494b = i10;
        this.f3495c = i11;
        this.f3496d = i12;
        this.f3497e = i13;
        this.f3498f = i14;
        this.f3499g = i15;
        this.f3500h = f10;
        this.f3501i = f11;
        this.f3502j = f12;
        this.f3503k = f13;
        this.f3504l = f14;
        this.f3505m = i16;
        this.f3506n = i17;
        this.f3507o = f15;
        this.f3508p = f16;
        this.f3509q = f17;
        this.f3510r = f18;
        this.f3511s = f19;
        this.f3512t = f20;
        this.f3513u = z10;
        this.f3514v = z11;
        this.f3515w = f21;
        this.f3516x = z1Var;
    }

    public static /* synthetic */ d3 copy$default(d3 d3Var, long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, j1.z1 z1Var, int i18, Object obj) {
        j1.z1 z1Var2;
        float f22;
        long j11 = (i18 & 1) != 0 ? d3Var.f3493a : j10;
        int i19 = (i18 & 2) != 0 ? d3Var.f3494b : i10;
        int i20 = (i18 & 4) != 0 ? d3Var.f3495c : i11;
        int i21 = (i18 & 8) != 0 ? d3Var.f3496d : i12;
        int i22 = (i18 & 16) != 0 ? d3Var.f3497e : i13;
        int i23 = (i18 & 32) != 0 ? d3Var.f3498f : i14;
        int i24 = (i18 & 64) != 0 ? d3Var.f3499g : i15;
        float f23 = (i18 & 128) != 0 ? d3Var.f3500h : f10;
        float f24 = (i18 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? d3Var.f3501i : f11;
        float f25 = (i18 & 512) != 0 ? d3Var.f3502j : f12;
        float f26 = (i18 & 1024) != 0 ? d3Var.f3503k : f13;
        float f27 = (i18 & 2048) != 0 ? d3Var.f3504l : f14;
        int i25 = (i18 & 4096) != 0 ? d3Var.f3505m : i16;
        long j12 = j11;
        int i26 = (i18 & Segment.SIZE) != 0 ? d3Var.f3506n : i17;
        float f28 = (i18 & 16384) != 0 ? d3Var.f3507o : f15;
        float f29 = (i18 & 32768) != 0 ? d3Var.f3508p : f16;
        float f30 = (i18 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? d3Var.f3509q : f17;
        float f31 = (i18 & 131072) != 0 ? d3Var.f3510r : f18;
        float f32 = (i18 & 262144) != 0 ? d3Var.f3511s : f19;
        float f33 = (i18 & 524288) != 0 ? d3Var.f3512t : f20;
        boolean z12 = (i18 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? d3Var.f3513u : z10;
        boolean z13 = (i18 & 2097152) != 0 ? d3Var.f3514v : z11;
        float f34 = (i18 & 4194304) != 0 ? d3Var.f3515w : f21;
        if ((i18 & 8388608) != 0) {
            f22 = f34;
            z1Var2 = d3Var.f3516x;
        } else {
            z1Var2 = z1Var;
            f22 = f34;
        }
        return d3Var.copy(j12, i19, i20, i21, i22, i23, i24, f23, f24, f25, f26, f27, i25, i26, f28, f29, f30, f31, f32, f33, z12, z13, f22, z1Var2);
    }

    public final long component1() {
        return this.f3493a;
    }

    public final float component10() {
        return this.f3502j;
    }

    public final float component11() {
        return this.f3503k;
    }

    public final float component12() {
        return this.f3504l;
    }

    public final int component13() {
        return this.f3505m;
    }

    public final int component14() {
        return this.f3506n;
    }

    public final float component15() {
        return this.f3507o;
    }

    public final float component16() {
        return this.f3508p;
    }

    public final float component17() {
        return this.f3509q;
    }

    public final float component18() {
        return this.f3510r;
    }

    public final float component19() {
        return this.f3511s;
    }

    public final int component2() {
        return this.f3494b;
    }

    public final float component20() {
        return this.f3512t;
    }

    public final boolean component21() {
        return this.f3513u;
    }

    public final boolean component22() {
        return this.f3514v;
    }

    public final float component23() {
        return this.f3515w;
    }

    public final j1.z1 component24() {
        return this.f3516x;
    }

    public final int component3() {
        return this.f3495c;
    }

    public final int component4() {
        return this.f3496d;
    }

    public final int component5() {
        return this.f3497e;
    }

    public final int component6() {
        return this.f3498f;
    }

    public final int component7() {
        return this.f3499g;
    }

    public final float component8() {
        return this.f3500h;
    }

    public final float component9() {
        return this.f3501i;
    }

    public final d3 copy(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, j1.z1 z1Var) {
        return new d3(j10, i10, i11, i12, i13, i14, i15, f10, f11, f12, f13, f14, i16, i17, f15, f16, f17, f18, f19, f20, z10, z11, f21, z1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.f3493a == d3Var.f3493a && this.f3494b == d3Var.f3494b && this.f3495c == d3Var.f3495c && this.f3496d == d3Var.f3496d && this.f3497e == d3Var.f3497e && this.f3498f == d3Var.f3498f && this.f3499g == d3Var.f3499g && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3500h), (Object) Float.valueOf(d3Var.f3500h)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3501i), (Object) Float.valueOf(d3Var.f3501i)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3502j), (Object) Float.valueOf(d3Var.f3502j)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3503k), (Object) Float.valueOf(d3Var.f3503k)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3504l), (Object) Float.valueOf(d3Var.f3504l)) && this.f3505m == d3Var.f3505m && this.f3506n == d3Var.f3506n && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3507o), (Object) Float.valueOf(d3Var.f3507o)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3508p), (Object) Float.valueOf(d3Var.f3508p)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3509q), (Object) Float.valueOf(d3Var.f3509q)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3510r), (Object) Float.valueOf(d3Var.f3510r)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3511s), (Object) Float.valueOf(d3Var.f3511s)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3512t), (Object) Float.valueOf(d3Var.f3512t)) && this.f3513u == d3Var.f3513u && this.f3514v == d3Var.f3514v && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f3515w), (Object) Float.valueOf(d3Var.f3515w)) && kotlin.jvm.internal.e0.areEqual(this.f3516x, d3Var.f3516x);
    }

    public final float getAlpha() {
        return this.f3515w;
    }

    public final int getAmbientShadowColor() {
        return this.f3505m;
    }

    public final int getBottom() {
        return this.f3497e;
    }

    public final float getCameraDistance() {
        return this.f3510r;
    }

    public final boolean getClipToBounds() {
        return this.f3514v;
    }

    public final boolean getClipToOutline() {
        return this.f3513u;
    }

    public final float getElevation() {
        return this.f3504l;
    }

    public final int getHeight() {
        return this.f3499g;
    }

    public final int getLeft() {
        return this.f3494b;
    }

    public final float getPivotX() {
        return this.f3511s;
    }

    public final float getPivotY() {
        return this.f3512t;
    }

    public final j1.z1 getRenderEffect() {
        return this.f3516x;
    }

    public final int getRight() {
        return this.f3496d;
    }

    public final float getRotationX() {
        return this.f3508p;
    }

    public final float getRotationY() {
        return this.f3509q;
    }

    public final float getRotationZ() {
        return this.f3507o;
    }

    public final float getScaleX() {
        return this.f3500h;
    }

    public final float getScaleY() {
        return this.f3501i;
    }

    public final int getSpotShadowColor() {
        return this.f3506n;
    }

    public final int getTop() {
        return this.f3495c;
    }

    public final float getTranslationX() {
        return this.f3502j;
    }

    public final float getTranslationY() {
        return this.f3503k;
    }

    public final long getUniqueId() {
        return this.f3493a;
    }

    public final int getWidth() {
        return this.f3498f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iB = b0.e2.b(this.f3512t, b0.e2.b(this.f3511s, b0.e2.b(this.f3510r, b0.e2.b(this.f3509q, b0.e2.b(this.f3508p, b0.e2.b(this.f3507o, e3.g.d(this.f3506n, e3.g.d(this.f3505m, b0.e2.b(this.f3504l, b0.e2.b(this.f3503k, b0.e2.b(this.f3502j, b0.e2.b(this.f3501i, b0.e2.b(this.f3500h, e3.g.d(this.f3499g, e3.g.d(this.f3498f, e3.g.d(this.f3497e, e3.g.d(this.f3496d, e3.g.d(this.f3495c, e3.g.d(this.f3494b, Long.hashCode(this.f3493a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        boolean z10 = this.f3513u;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iB + i10) * 31;
        boolean z11 = this.f3514v;
        int iB2 = b0.e2.b(this.f3515w, (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31);
        j1.z1 z1Var = this.f3516x;
        return iB2 + (z1Var == null ? 0 : z1Var.hashCode());
    }

    public final void setAlpha(float f10) {
        this.f3515w = f10;
    }

    public final void setAmbientShadowColor(int i10) {
        this.f3505m = i10;
    }

    public final void setCameraDistance(float f10) {
        this.f3510r = f10;
    }

    public final void setClipToBounds(boolean z10) {
        this.f3514v = z10;
    }

    public final void setClipToOutline(boolean z10) {
        this.f3513u = z10;
    }

    public final void setElevation(float f10) {
        this.f3504l = f10;
    }

    public final void setPivotX(float f10) {
        this.f3511s = f10;
    }

    public final void setPivotY(float f10) {
        this.f3512t = f10;
    }

    public final void setRenderEffect(j1.z1 z1Var) {
        this.f3516x = z1Var;
    }

    public final void setRotationX(float f10) {
        this.f3508p = f10;
    }

    public final void setRotationY(float f10) {
        this.f3509q = f10;
    }

    public final void setRotationZ(float f10) {
        this.f3507o = f10;
    }

    public final void setScaleX(float f10) {
        this.f3500h = f10;
    }

    public final void setScaleY(float f10) {
        this.f3501i = f10;
    }

    public final void setSpotShadowColor(int i10) {
        this.f3506n = i10;
    }

    public final void setTranslationX(float f10) {
        this.f3502j = f10;
    }

    public final void setTranslationY(float f10) {
        this.f3503k = f10;
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.f3493a + ", left=" + this.f3494b + ", top=" + this.f3495c + ", right=" + this.f3496d + ", bottom=" + this.f3497e + ", width=" + this.f3498f + ", height=" + this.f3499g + ", scaleX=" + this.f3500h + ", scaleY=" + this.f3501i + ", translationX=" + this.f3502j + ", translationY=" + this.f3503k + ", elevation=" + this.f3504l + ", ambientShadowColor=" + this.f3505m + ", spotShadowColor=" + this.f3506n + ", rotationZ=" + this.f3507o + zAQQWzBxnS.pjwbPWwEOowVsob + this.f3508p + ", rotationY=" + this.f3509q + ", cameraDistance=" + this.f3510r + ", pivotX=" + this.f3511s + ", pivotY=" + this.f3512t + ", clipToOutline=" + this.f3513u + ", clipToBounds=" + this.f3514v + ", alpha=" + this.f3515w + ", renderEffect=" + this.f3516x + ')';
    }
}
