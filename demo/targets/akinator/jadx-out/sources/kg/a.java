package kg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class a {
    public static int cam16Ucs(int i10, int i11, double d10) {
        b bVarFromInt = b.fromInt(i10);
        b bVarFromInt2 = b.fromInt(i11);
        double jstar = bVarFromInt.getJstar();
        double astar = bVarFromInt.getAstar();
        double bstar = bVarFromInt.getBstar();
        return b.fromUcs(((bVarFromInt2.getJstar() - jstar) * d10) + jstar, ((bVarFromInt2.getAstar() - astar) * d10) + astar, ((bVarFromInt2.getBstar() - bstar) * d10) + bstar).toInt();
    }

    public static int harmonize(int i10, int i11) {
        d dVarFromInt = d.fromInt(i10);
        d dVarFromInt2 = d.fromInt(i11);
        double dMin = Math.min(f.differenceDegrees(dVarFromInt.getHue(), dVarFromInt2.getHue()) * 0.5d, 15.0d);
        return d.from(f.sanitizeDegreesDouble((f.rotationDirection(dVarFromInt.getHue(), dVarFromInt2.getHue()) * dMin) + dVarFromInt.getHue()), dVarFromInt.getChroma(), dVarFromInt.getTone()).toInt();
    }

    public static int hctHue(int i10, int i11, double d10) {
        return d.from(b.fromInt(cam16Ucs(i10, i11, d10)).getHue(), b.fromInt(i10).getChroma(), c.lstarFromArgb(i10)).toInt();
    }
}
