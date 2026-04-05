package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final long f56886a = s2.z.f85366b.m6983getUnspecifiedXSAIIZE();

    public static final x lerp(x start, x stop, float f10) {
        c0 c0VarLerp;
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        r2.m mVar = (r2.m) t1.lerpDiscrete(start.m4038getTextAlignbuA522U(), stop.m4038getTextAlignbuA522U(), f10);
        r2.p pVar = (r2.p) t1.lerpDiscrete(start.m4039getTextDirectionmmuk1to(), stop.m4039getTextDirectionmmuk1to(), f10);
        long jM4023lerpTextUnitInheritableC3pnCVY = t1.m4023lerpTextUnitInheritableC3pnCVY(start.m4037getLineHeightXSAIIZE(), stop.m4037getLineHeightXSAIIZE(), f10);
        r2.x textIndent = start.getTextIndent();
        if (textIndent == null) {
            textIndent = r2.x.f83728c.getNone();
        }
        r2.x textIndent2 = stop.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = r2.x.f83728c.getNone();
        }
        r2.x xVarLerp = r2.y.lerp(textIndent, textIndent2, f10);
        c0 platformStyle = start.getPlatformStyle();
        c0 platformStyle2 = stop.getPlatformStyle();
        if (platformStyle == null && platformStyle2 == null) {
            c0VarLerp = null;
        } else {
            if (platformStyle == null) {
                platformStyle = c0.f56737b.getDefault();
            }
            if (platformStyle2 == null) {
                platformStyle2 = c0.f56737b.getDefault();
            }
            c0VarLerp = a.lerp(platformStyle, platformStyle2, f10);
        }
        return new x(mVar, pVar, jM4023lerpTextUnitInheritableC3pnCVY, xVarLerp, c0VarLerp, (r2.h) t1.lerpDiscrete(start.getLineHeightStyle(), stop.getLineHeightStyle(), f10), null);
    }

    public static final x resolveParagraphStyleDefaults(x style, s2.x direction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        r2.m mVarM4038getTextAlignbuA522U = style.m4038getTextAlignbuA522U();
        r2.m mVarM6072boximpl = r2.m.m6072boximpl(mVarM4038getTextAlignbuA522U != null ? mVarM4038getTextAlignbuA522U.m6078unboximpl() : r2.m.f83701b.m6071getStarte0LSkKk());
        r2.p pVarM6084boximpl = r2.p.m6084boximpl(e2.m3991resolveTextDirectionYj3eThk(direction, style.m4039getTextDirectionmmuk1to()));
        long jM4037getLineHeightXSAIIZE = s2.a0.m6730isUnspecifiedR2X_6o(style.m4037getLineHeightXSAIIZE()) ? f56886a : style.m4037getLineHeightXSAIIZE();
        r2.x textIndent = style.getTextIndent();
        if (textIndent == null) {
            textIndent = r2.x.f83728c.getNone();
        }
        return new x(mVarM6072boximpl, pVarM6084boximpl, jM4037getLineHeightXSAIIZE, textIndent, style.getPlatformStyle(), style.getLineHeightStyle(), null);
    }
}
