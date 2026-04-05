package j1;

import android.graphics.ColorFilter;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f68934b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f68935a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ n0 m4872tintxETnrds$default(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = x.f69020b.m5060getSrcIn0nO6VwU();
            }
            return aVar.m4875tintxETnrds(j10, i10);
        }

        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final n0 m4873colorMatrixjHGOpc(float[] colorMatrix) {
            kotlin.jvm.internal.e0.checkNotNullParameter(colorMatrix, "colorMatrix");
            return e.m4722actualColorMatrixColorFilterjHGOpc(colorMatrix);
        }

        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final n0 m4874lightingOWjLjI(long j10, long j11) {
            return e.m4723actualLightingColorFilterOWjLjI(j10, j11);
        }

        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final n0 m4875tintxETnrds(long j10, int i10) {
            return e.m4724actualTintColorFilterxETnrds(j10, i10);
        }
    }

    public final ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.f68935a;
    }

    public n0(ColorFilter colorFilter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorFilter, OIPXcgrVyyxoLF.CSCqwGuaEL);
        this.f68935a = colorFilter;
    }
}
