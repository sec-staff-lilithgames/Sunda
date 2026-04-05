package g1;

import kotlin.jvm.internal.e0;
import s2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements s2.e {

    /* renamed from: b, reason: collision with root package name */
    public b f56667b = n.f56678a;

    /* renamed from: c, reason: collision with root package name */
    public l f56668c;

    public final b getCacheParams$ui_release() {
        return this.f56667b;
    }

    @Override // s2.e
    public float getDensity() {
        return this.f56667b.getDensity().getDensity();
    }

    public final l getDrawResult$ui_release() {
        return this.f56668c;
    }

    @Override // s2.e
    public float getFontScale() {
        return this.f56667b.getDensity().getFontScale();
    }

    public final x getLayoutDirection() {
        return this.f56667b.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m3936getSizeNHjbRc() {
        return this.f56667b.mo3935getSizeNHjbRc();
    }

    public final l onDrawBehind(kv.l block) {
        e0.checkNotNullParameter(block, "block");
        return onDrawWithContent(new c(block));
    }

    public final l onDrawWithContent(kv.l block) {
        e0.checkNotNullParameter(block, "block");
        l lVar = new l(block);
        this.f56668c = lVar;
        return lVar;
    }

    @Override // s2.e
    /* renamed from: roundToPx--R2X_6o */
    public /* bridge */ /* synthetic */ int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: roundToPx-0680j_4 */
    public /* bridge */ /* synthetic */ int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    public final void setCacheParams$ui_release(b bVar) {
        e0.checkNotNullParameter(bVar, "<set-?>");
        this.f56667b = bVar;
    }

    public final void setDrawResult$ui_release(l lVar) {
        this.f56668c = lVar;
    }

    @Override // s2.e
    /* renamed from: toDp-GaN1DYA */
    public /* bridge */ /* synthetic */ float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public /* bridge */ /* synthetic */ long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // s2.e
    /* renamed from: toPx--R2X_6o */
    public /* bridge */ /* synthetic */ float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: toPx-0680j_4 */
    public /* bridge */ /* synthetic */ float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // s2.e
    public /* bridge */ /* synthetic */ i1.j toRect(s2.m mVar) {
        return super.toRect(mVar);
    }

    @Override // s2.e
    /* renamed from: toSize-XkaWNTQ */
    public /* bridge */ /* synthetic */ long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // s2.e
    /* renamed from: toSp-0xMU5do */
    public /* bridge */ /* synthetic */ long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }
}
