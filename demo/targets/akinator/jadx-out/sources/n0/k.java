package n0;

import androidx.core.app.NotificationCompat;
import p0.g3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f75098a = p0.o0.staticCompositionLocalOf(j.f75094e);

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m5694contentColorFor4WTKRHQ(i contentColorFor, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        return j1.m0.m4859equalsimpl0(j10, contentColorFor.m5677getPrimary0d7_KjU()) ? contentColorFor.m5674getOnPrimary0d7_KjU() : j1.m0.m4859equalsimpl0(j10, contentColorFor.m5678getPrimaryVariant0d7_KjU()) ? contentColorFor.m5674getOnPrimary0d7_KjU() : j1.m0.m4859equalsimpl0(j10, contentColorFor.m5679getSecondary0d7_KjU()) ? contentColorFor.m5675getOnSecondary0d7_KjU() : j1.m0.m4859equalsimpl0(j10, contentColorFor.m5680getSecondaryVariant0d7_KjU()) ? contentColorFor.m5675getOnSecondary0d7_KjU() : j1.m0.m4859equalsimpl0(j10, contentColorFor.m5670getBackground0d7_KjU()) ? contentColorFor.m5672getOnBackground0d7_KjU() : j1.m0.m4859equalsimpl0(j10, contentColorFor.m5681getSurface0d7_KjU()) ? contentColorFor.m5676getOnSurface0d7_KjU() : j1.m0.m4859equalsimpl0(j10, contentColorFor.m5671getError0d7_KjU()) ? contentColorFor.m5673getOnError0d7_KjU() : j1.m0.f68918b.m4835getUnspecified0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m5695contentColorForek8zF_U(long j10, p0.w wVar, int i10) {
        long jM5694contentColorFor4WTKRHQ = m5694contentColorFor4WTKRHQ(i0.f75090a.getColors(wVar, 6), j10);
        return jM5694contentColorFor4WTKRHQ != j1.m0.f68918b.m4835getUnspecified0d7_KjU() ? jM5694contentColorFor4WTKRHQ : ((j1.m0) wVar.consume(p.getLocalContentColor())).m4868unboximpl();
    }

    /* renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final i m5696darkColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new i(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ i m5697darkColors2qZNXz8$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jColor = (i10 & 1) != 0 ? j1.o0.Color(4290479868L) : j10;
        long jColor2 = (i10 & 2) != 0 ? j1.o0.Color(4281794739L) : j11;
        long jColor3 = (i10 & 4) != 0 ? j1.o0.Color(4278442694L) : j12;
        long j22 = (i10 & 8) != 0 ? jColor3 : j13;
        long jColor4 = (i10 & 16) != 0 ? j1.o0.Color(4279374354L) : j14;
        long jColor5 = (i10 & 32) != 0 ? j1.o0.Color(4279374354L) : j15;
        long jColor6 = (i10 & 64) != 0 ? j1.o0.Color(4291782265L) : j16;
        long jM4825getBlack0d7_KjU = (i10 & 128) != 0 ? j1.m0.f68918b.m4825getBlack0d7_KjU() : j17;
        long jM4825getBlack0d7_KjU2 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? j1.m0.f68918b.m4825getBlack0d7_KjU() : j18;
        long jM4836getWhite0d7_KjU = (i10 & 512) != 0 ? j1.m0.f68918b.m4836getWhite0d7_KjU() : j19;
        long jM4836getWhite0d7_KjU2 = (i10 & 1024) != 0 ? j1.m0.f68918b.m4836getWhite0d7_KjU() : j20;
        if ((i10 & 2048) != 0) {
            j21 = j1.m0.f68918b.m4825getBlack0d7_KjU();
        }
        return m5696darkColors2qZNXz8(jColor, jColor2, jColor3, j22, jColor4, jColor5, jColor6, jM4825getBlack0d7_KjU, jM4825getBlack0d7_KjU2, jM4836getWhite0d7_KjU, jM4836getWhite0d7_KjU2, j21);
    }

    public static final g3 getLocalColors() {
        return f75098a;
    }

    public static final long getPrimarySurface(i iVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        return iVar.isLight() ? iVar.m5677getPrimary0d7_KjU() : iVar.m5681getSurface0d7_KjU();
    }

    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final i m5698lightColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new i(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ i m5699lightColors2qZNXz8$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jColor = (i10 & 1) != 0 ? j1.o0.Color(4284612846L) : j10;
        long jColor2 = (i10 & 2) != 0 ? j1.o0.Color(4281794739L) : j11;
        long jColor3 = (i10 & 4) != 0 ? j1.o0.Color(4278442694L) : j12;
        long jColor4 = (i10 & 8) != 0 ? j1.o0.Color(4278290310L) : j13;
        long jM4836getWhite0d7_KjU = (i10 & 16) != 0 ? j1.m0.f68918b.m4836getWhite0d7_KjU() : j14;
        long jM4836getWhite0d7_KjU2 = (i10 & 32) != 0 ? j1.m0.f68918b.m4836getWhite0d7_KjU() : j15;
        long jColor5 = (i10 & 64) != 0 ? j1.o0.Color(4289724448L) : j16;
        long jM4836getWhite0d7_KjU3 = (i10 & 128) != 0 ? j1.m0.f68918b.m4836getWhite0d7_KjU() : j17;
        long j22 = jColor;
        long jM4825getBlack0d7_KjU = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? j1.m0.f68918b.m4825getBlack0d7_KjU() : j18;
        long jM4825getBlack0d7_KjU2 = (i10 & 512) != 0 ? j1.m0.f68918b.m4825getBlack0d7_KjU() : j19;
        long jM4825getBlack0d7_KjU3 = (i10 & 1024) != 0 ? j1.m0.f68918b.m4825getBlack0d7_KjU() : j20;
        if ((i10 & 2048) != 0) {
            j21 = j1.m0.f68918b.m4836getWhite0d7_KjU();
        }
        return m5698lightColors2qZNXz8(j22, jColor2, jColor3, jColor4, jM4836getWhite0d7_KjU, jM4836getWhite0d7_KjU2, jColor5, jM4836getWhite0d7_KjU3, jM4825getBlack0d7_KjU, jM4825getBlack0d7_KjU2, jM4825getBlack0d7_KjU3, j21);
    }

    public static final void updateColorsFrom(i iVar, i other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        iVar.m5689setPrimary8_81llA$material_release(other.m5677getPrimary0d7_KjU());
        iVar.m5690setPrimaryVariant8_81llA$material_release(other.m5678getPrimaryVariant0d7_KjU());
        iVar.m5691setSecondary8_81llA$material_release(other.m5679getSecondary0d7_KjU());
        iVar.m5692setSecondaryVariant8_81llA$material_release(other.m5680getSecondaryVariant0d7_KjU());
        iVar.m5682setBackground8_81llA$material_release(other.m5670getBackground0d7_KjU());
        iVar.m5693setSurface8_81llA$material_release(other.m5681getSurface0d7_KjU());
        iVar.m5683setError8_81llA$material_release(other.m5671getError0d7_KjU());
        iVar.m5686setOnPrimary8_81llA$material_release(other.m5674getOnPrimary0d7_KjU());
        iVar.m5687setOnSecondary8_81llA$material_release(other.m5675getOnSecondary0d7_KjU());
        iVar.m5684setOnBackground8_81llA$material_release(other.m5672getOnBackground0d7_KjU());
        iVar.m5688setOnSurface8_81llA$material_release(other.m5676getOnSurface0d7_KjU());
        iVar.m5685setOnError8_81llA$material_release(other.m5673getOnError0d7_KjU());
        iVar.setLight$material_release(other.isLight());
    }
}
