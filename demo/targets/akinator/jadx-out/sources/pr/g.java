package pr;

import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g {
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static pr.a mapError(qm.b r3) {
        /*
            int r0 = r3.getCode()
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L19
            r1 = 6
            if (r0 == r1) goto L16
            r1 = 7
            if (r0 == r1) goto L1c
            pr.a r1 = pr.a.f81799q
            goto L21
        L16:
            pr.a r1 = pr.a.f81795m
            goto L21
        L19:
            pr.a r1 = pr.a.f81797o
            goto L21
        L1c:
            pr.a r1 = pr.a.f81798p
            goto L21
        L1f:
            pr.a r1 = pr.a.f81787e
        L21:
            pr.a r2 = new pr.a
            java.lang.String r3 = r3.getMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pr.g.mapError(qm.b):pr.a");
    }

    public static qm.a toCacheControl(Object obj) {
        CreativeLoadingMethod creativeLoadingMethodValueOf;
        qm.a aVar = qm.a.f83288b;
        if (obj == null) {
            return aVar;
        }
        if (obj instanceof qm.a) {
            return (qm.a) obj;
        }
        if (obj instanceof CreativeLoadingMethod) {
            creativeLoadingMethodValueOf = (CreativeLoadingMethod) obj;
        } else if (obj instanceof String) {
            try {
                creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf((String) obj);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            creativeLoadingMethodValueOf = null;
        }
        if (creativeLoadingMethodValueOf == null) {
            return aVar;
        }
        int i10 = f.f81815a[creativeLoadingMethodValueOf.ordinal()];
        return i10 != 1 ? i10 != 2 ? aVar : qm.a.f83290e : qm.a.f83289c;
    }

    public static um.p transform(AdExtension.ControlAsset controlAsset) {
        if (controlAsset == null) {
            return null;
        }
        try {
            um.p pVar = new um.p();
            pVar.setMargin(controlAsset.getMargin());
            pVar.setPadding(controlAsset.getPadding());
            pVar.setContent(controlAsset.getContent());
            pVar.setFillColor(nm.j.safeParseColor(controlAsset.getFill()));
            pVar.setFontStyle(Integer.valueOf(controlAsset.getFontStyle()));
            pVar.setWidth(Integer.valueOf(controlAsset.getWidth()));
            pVar.setHeight(Integer.valueOf(controlAsset.getHeight()));
            pVar.setHideAfter(Float.valueOf(controlAsset.getHideafter()));
            pVar.setHorizontalPosition(nm.j.parseHorizontalPosition(controlAsset.getX()));
            pVar.setVerticalPosition(nm.j.parseVerticalPosition(controlAsset.getY()));
            pVar.setOpacity(Float.valueOf(controlAsset.getOpacity()));
            pVar.setOutlined(Boolean.valueOf(controlAsset.getOutlined()));
            pVar.setStrokeColor(nm.j.safeParseColor(controlAsset.getStroke()));
            pVar.setStrokeWidth(Float.valueOf(controlAsset.getStrokeWidth()));
            pVar.setStyle(controlAsset.getStyle());
            pVar.setVisible(Boolean.valueOf(controlAsset.getVisible()));
            return pVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
