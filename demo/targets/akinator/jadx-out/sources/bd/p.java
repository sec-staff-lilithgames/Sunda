package bd;

import java.io.IOException;
import java.net.InetAddress;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p extends y0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9104e;

    public p() {
        this(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // zc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createContextual(jc.u0 r2, jc.g r3) throws jc.r {
        /*
            r1 = this;
            java.lang.Class r0 = r1.handledType()
            tb.t r2 = bd.z0.c(r0, r2, r3)
            if (r2 == 0) goto L1a
            tb.s r2 = r2.getShape()
            boolean r3 = r2.isNumeric()
            if (r3 != 0) goto L18
            tb.s r3 = tb.s.f86773i
            if (r2 != r3) goto L1a
        L18:
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            boolean r3 = r1.f9104e
            if (r2 == r3) goto L25
            bd.p r3 = new bd.p
            r3.<init>(r2)
            return r3
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.p.createContextual(jc.u0, jc.g):jc.w");
    }

    public p(boolean z10) {
        super(InetAddress.class);
        this.f9104e = z10;
    }

    @Override // bd.z0, jc.w
    public void serialize(InetAddress inetAddress, ub.o oVar, jc.u0 u0Var) throws IOException {
        String strTrim;
        if (this.f9104e) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        oVar.writeString(strTrim);
    }

    @Override // bd.y0, jc.w
    public void serializeWithType(InetAddress inetAddress, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(inetAddress, InetAddress.class, ub.z.VALUE_STRING));
        serialize(inetAddress, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
