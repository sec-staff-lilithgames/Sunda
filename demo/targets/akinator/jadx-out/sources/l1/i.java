package l1;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import i1.o;
import i1.p;
import j1.b0;
import j1.l1;
import j1.l2;
import j1.m1;
import j1.n0;
import j1.y0;
import java.util.List;
import kotlin.jvm.internal.e0;
import s2.q;
import s2.w;
import s2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public interface i extends s2.e {
    public static final g O8 = g.f72231a;

    static long a(long j10, long j11) {
        return p.Size(o.m4252getWidthimpl(j10) - i1.h.m4185getXimpl(j11), o.m4249getHeightimpl(j10) - i1.h.m4186getYimpl(j11));
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m5396drawArcyD3GUKo$default(i iVar, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM4173getZeroF1C5BW0 = (i11 & 16) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j11;
        iVar.mo5295drawArcyD3GUKo(j10, f10, f11, z10, jM4173getZeroF1C5BW0, (i11 & 32) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j12, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? m.f72234a : jVar, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : n0Var, (i11 & 512) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m5397drawCircleV9BoPsw$default(i iVar, b0 b0Var, float f10, long j10, float f11, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        iVar.mo5296drawCircleV9BoPsw(b0Var, (i11 & 2) != 0 ? o.m4251getMinDimensionimpl(iVar.mo5314getSizeNHjbRc()) / 2.0f : f10, (i11 & 4) != 0 ? iVar.mo5313getCenterF1C5BW0() : j10, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? m.f72234a : jVar, (i11 & 32) != 0 ? null : n0Var, (i11 & 64) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m5398drawCircleVaOC9Bg$default(i iVar, long j10, float f10, long j11, float f11, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i11 & 2) != 0) {
            f10 = o.m4251getMinDimensionimpl(iVar.mo5314getSizeNHjbRc()) / 2.0f;
        }
        iVar.mo5297drawCircleVaOC9Bg(j10, f10, (i11 & 4) != 0 ? iVar.mo5313getCenterF1C5BW0() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? m.f72234a : jVar, (i11 & 32) != 0 ? null : n0Var, (i11 & 64) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m5399drawImage9jGpkUE$default(i iVar, y0 y0Var, long j10, long j11, long j12, long j13, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM6920getZeronOccac = (i11 & 2) != 0 ? q.f85352b.m6920getZeronOccac() : j10;
        long jIntSize = (i11 & 4) != 0 ? w.IntSize(y0Var.getWidth(), y0Var.getHeight()) : j11;
        iVar.mo5298drawImage9jGpkUE(y0Var, jM6920getZeronOccac, jIntSize, (i11 & 8) != 0 ? q.f85352b.m6920getZeronOccac() : j12, (i11 & 16) != 0 ? jIntSize : j13, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? m.f72234a : jVar, (i11 & 128) != 0 ? null : n0Var, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m5400drawImageAZ2fEMs$default(i iVar, y0 y0Var, long j10, long j11, long j12, long j13, float f10, j jVar, n0 n0Var, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM6920getZeronOccac = (i12 & 2) != 0 ? q.f85352b.m6920getZeronOccac() : j10;
        long jIntSize = (i12 & 4) != 0 ? w.IntSize(y0Var.getWidth(), y0Var.getHeight()) : j11;
        long jM6920getZeronOccac2 = (i12 & 8) != 0 ? q.f85352b.m6920getZeronOccac() : j12;
        long j14 = (i12 & 16) != 0 ? jIntSize : j13;
        float f11 = (i12 & 32) != 0 ? 1.0f : f10;
        j jVar2 = (i12 & 64) != 0 ? m.f72234a : jVar;
        n0 n0Var2 = (i12 & 128) != 0 ? null : n0Var;
        int i13 = i12 & NotificationCompat.FLAG_LOCAL_ONLY;
        g gVar = O8;
        iVar.mo5299drawImageAZ2fEMs(y0Var, jM6920getZeronOccac, jIntSize, jM6920getZeronOccac2, j14, f11, jVar2, n0Var2, i13 != 0 ? gVar.m5344getDefaultBlendMode0nO6VwU() : i10, (i12 & 512) != 0 ? gVar.m5345getDefaultFilterQualityfv9h1I() : i11);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m5401drawImagegbVJVH8$default(i iVar, y0 y0Var, long j10, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        iVar.mo5300drawImagegbVJVH8(y0Var, (i11 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? m.f72234a : jVar, (i11 & 16) != 0 ? null : n0Var, (i11 & 32) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m5402drawLine1RTmtNc$default(i iVar, b0 b0Var, long j10, long j11, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        iVar.mo5301drawLine1RTmtNc(b0Var, j10, j11, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? n.f72235f.m5421getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : m1Var, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : n0Var, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m5403drawLineNGM6Ib0$default(i iVar, long j10, long j11, long j12, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        iVar.mo5302drawLineNGM6Ib0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? n.f72235f.m5421getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : m1Var, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : n0Var, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m5404drawOvalAsUm42w$default(i iVar, b0 b0Var, long j10, long j11, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM4173getZeroF1C5BW0 = (i11 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j10;
        iVar.mo5303drawOvalAsUm42w(b0Var, jM4173getZeroF1C5BW0, (i11 & 4) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? m.f72234a : jVar, (i11 & 32) != 0 ? null : n0Var, (i11 & 64) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m5405drawOvalnJ9OG0$default(i iVar, long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM4173getZeroF1C5BW0 = (i11 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j11;
        iVar.mo5304drawOvalnJ9OG0(j10, jM4173getZeroF1C5BW0, (i11 & 4) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? m.f72234a : jVar, (i11 & 32) != 0 ? null : n0Var, (i11 & 64) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m5406drawPathGBMwjPU$default(i iVar, l1 l1Var, b0 b0Var, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            jVar = m.f72234a;
        }
        j jVar2 = jVar;
        if ((i11 & 16) != 0) {
            n0Var = null;
        }
        n0 n0Var2 = n0Var;
        if ((i11 & 32) != 0) {
            i10 = O8.m5344getDefaultBlendMode0nO6VwU();
        }
        iVar.mo5305drawPathGBMwjPU(l1Var, b0Var, f11, jVar2, n0Var2, i10);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m5407drawPathLG529CI$default(i iVar, l1 l1Var, long j10, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            jVar = m.f72234a;
        }
        j jVar2 = jVar;
        if ((i11 & 16) != 0) {
            n0Var = null;
        }
        iVar.mo5306drawPathLG529CI(l1Var, j10, f11, jVar2, n0Var, (i11 & 32) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m5408drawPointsF8ZwMP8$default(i iVar, List list, int i10, long j10, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        iVar.mo5307drawPointsF8ZwMP8(list, i10, j10, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? l2.f68912b.m4802getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : m1Var, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : n0Var, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m5409drawPointsGsft0Ws$default(i iVar, List list, int i10, b0 b0Var, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        iVar.mo5308drawPointsGsft0Ws(list, i10, b0Var, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? l2.f68912b.m4802getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : m1Var, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : n0Var, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m5410drawRectAsUm42w$default(i iVar, b0 b0Var, long j10, long j11, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM4173getZeroF1C5BW0 = (i11 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j10;
        iVar.mo5309drawRectAsUm42w(b0Var, jM4173getZeroF1C5BW0, (i11 & 4) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? m.f72234a : jVar, (i11 & 32) != 0 ? null : n0Var, (i11 & 64) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m5411drawRectnJ9OG0$default(i iVar, long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM4173getZeroF1C5BW0 = (i11 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j11;
        iVar.mo5310drawRectnJ9OG0(j10, jM4173getZeroF1C5BW0, (i11 & 4) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? m.f72234a : jVar, (i11 & 32) != 0 ? null : n0Var, (i11 & 64) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m5412drawRoundRectZuiqVtQ$default(i iVar, b0 b0Var, long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM4173getZeroF1C5BW0 = (i11 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j10;
        iVar.mo5311drawRoundRectZuiqVtQ(b0Var, jM4173getZeroF1C5BW0, (i11 & 4) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? i1.b.f59337b.m4146getZerokKHJgLs() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? m.f72234a : jVar, (i11 & 64) != 0 ? null : n0Var, (i11 & 128) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m5413drawRoundRectuAw5IA$default(i iVar, long j10, long j11, long j12, long j13, j jVar, float f10, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM4173getZeroF1C5BW0 = (i11 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j11;
        iVar.mo5312drawRoundRectuAw5IA(j10, jM4173getZeroF1C5BW0, (i11 & 4) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? i1.b.f59337b.m4146getZerokKHJgLs() : j13, (i11 & 16) != 0 ? m.f72234a : jVar, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? null : n0Var, (i11 & 128) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawArc-illE91I */
    void mo5294drawArcillE91I(b0 b0Var, float f10, float f11, boolean z10, long j10, long j11, float f12, j jVar, n0 n0Var, int i10);

    /* renamed from: drawArc-yD3GUKo */
    void mo5295drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, j jVar, n0 n0Var, int i10);

    /* renamed from: drawCircle-V9BoPsw */
    void mo5296drawCircleV9BoPsw(b0 b0Var, float f10, long j10, float f11, j jVar, n0 n0Var, int i10);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo5297drawCircleVaOC9Bg(long j10, float f10, long j11, float f11, j jVar, n0 n0Var, int i10);

    @tu.f
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo5298drawImage9jGpkUE(y0 y0Var, long j10, long j11, long j12, long j13, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo5299drawImageAZ2fEMs(y0 image, long j10, long j11, long j12, long j13, float f10, j style, n0 n0Var, int i10, int i11) {
        e0.checkNotNullParameter(image, "image");
        e0.checkNotNullParameter(style, "style");
        m5400drawImageAZ2fEMs$default(this, image, j10, j11, j12, j13, f10, style, n0Var, i10, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo5300drawImagegbVJVH8(y0 y0Var, long j10, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawLine-1RTmtNc */
    void mo5301drawLine1RTmtNc(b0 b0Var, long j10, long j11, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo5302drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11);

    /* renamed from: drawOval-AsUm42w */
    void mo5303drawOvalAsUm42w(b0 b0Var, long j10, long j11, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawOval-n-J9OG0 */
    void mo5304drawOvalnJ9OG0(long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawPath-GBMwjPU */
    void mo5305drawPathGBMwjPU(l1 l1Var, b0 b0Var, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawPath-LG529CI */
    void mo5306drawPathLG529CI(l1 l1Var, long j10, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo5307drawPointsF8ZwMP8(List<i1.h> list, int i10, long j10, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo5308drawPointsGsft0Ws(List<i1.h> list, int i10, b0 b0Var, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12);

    /* renamed from: drawRect-AsUm42w */
    void mo5309drawRectAsUm42w(b0 b0Var, long j10, long j11, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawRect-n-J9OG0 */
    void mo5310drawRectnJ9OG0(long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo5311drawRoundRectZuiqVtQ(b0 b0Var, long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo5312drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, j jVar, float f10, n0 n0Var, int i10);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo5313getCenterF1C5BW0() {
        return p.m4258getCenteruvyYCjk(((b) getDrawContext()).mo5320getSizeNHjbRc());
    }

    @Override // s2.e
    /* synthetic */ float getDensity();

    f getDrawContext();

    @Override // s2.e
    /* synthetic */ float getFontScale();

    x getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    default long mo5314getSizeNHjbRc() {
        return ((b) getDrawContext()).mo5320getSizeNHjbRc();
    }

    @Override // s2.e
    /* renamed from: roundToPx--R2X_6o */
    /* bridge */ /* synthetic */ default int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: roundToPx-0680j_4 */
    /* bridge */ /* synthetic */ default int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    @Override // s2.e
    /* renamed from: toDp-GaN1DYA */
    /* bridge */ /* synthetic */ default float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // s2.e
    /* renamed from: toDpSize-k-rfVVM */
    /* bridge */ /* synthetic */ default long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // s2.e
    /* renamed from: toPx--R2X_6o */
    /* bridge */ /* synthetic */ default float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: toPx-0680j_4 */
    /* bridge */ /* synthetic */ default float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // s2.e
    /* bridge */ /* synthetic */ default i1.j toRect(s2.m mVar) {
        return super.toRect(mVar);
    }

    @Override // s2.e
    /* renamed from: toSize-XkaWNTQ */
    /* bridge */ /* synthetic */ default long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // s2.e
    /* renamed from: toSp-0xMU5do */
    /* bridge */ /* synthetic */ default long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m5395drawArcillE91I$default(i iVar, b0 b0Var, float f10, float f11, boolean z10, long j10, long j11, float f12, j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(NyKZx.NRGVrCXQ);
        }
        long jM4173getZeroF1C5BW0 = (i11 & 16) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j10;
        iVar.mo5294drawArcillE91I(b0Var, f10, f11, z10, jM4173getZeroF1C5BW0, (i11 & 32) != 0 ? a(iVar.mo5314getSizeNHjbRc(), jM4173getZeroF1C5BW0) : j11, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? m.f72234a : jVar, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : n0Var, (i11 & 512) != 0 ? O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }
}
