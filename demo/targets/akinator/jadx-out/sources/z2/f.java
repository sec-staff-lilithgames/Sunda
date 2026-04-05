package z2;

import a3.h;
import a3.x;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f extends a {
    public f() {
        new h();
        new h();
        this.f97455b = 5;
        this.f97456c = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    @Override // z2.a, a3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getId(java.lang.String r3) {
        /*
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1594793529: goto L82;
                case -966421266: goto L77;
                case -786670827: goto L6c;
                case -648752941: goto L61;
                case -638126837: goto L56;
                case -76025313: goto L4b;
                case -9754574: goto L40;
                case 364489912: goto L35;
                case 1301930599: goto L28;
                case 1401391082: goto L1b;
                case 1535404999: goto Le;
                default: goto Lb;
            }
        Lb:
            r3 = r1
            goto L8c
        Le:
            java.lang.String r0 = "triggerReceiver"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Lb
        L17:
            r3 = 10
            goto L8c
        L1b:
            java.lang.String r0 = "postLayout"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L24
            goto Lb
        L24:
            r3 = 9
            goto L8c
        L28:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L31
            goto Lb
        L31:
            r3 = 8
            goto L8c
        L35:
            java.lang.String r0 = "triggerSlack"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3e
            goto Lb
        L3e:
            r3 = 7
            goto L8c
        L40:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L49
            goto Lb
        L49:
            r3 = 6
            goto L8c
        L4b:
            java.lang.String r0 = "triggerCollisionView"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L54
            goto Lb
        L54:
            r3 = 5
            goto L8c
        L56:
            java.lang.String r0 = "negativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5f
            goto Lb
        L5f:
            r3 = 4
            goto L8c
        L61:
            java.lang.String r0 = "triggerID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6a
            goto Lb
        L6a:
            r3 = 3
            goto L8c
        L6c:
            java.lang.String r0 = "triggerCollisionId"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L75
            goto Lb
        L75:
            r3 = 2
            goto L8c
        L77:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L80
            goto Lb
        L80:
            r3 = 1
            goto L8c
        L82:
            java.lang.String r0 = "positiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
            goto Lb
        L8b:
            r3 = 0
        L8c:
            switch(r3) {
                case 0: goto Lae;
                case 1: goto Lab;
                case 2: goto La8;
                case 3: goto La5;
                case 4: goto La2;
                case 5: goto L9f;
                case 6: goto L9c;
                case 7: goto L99;
                case 8: goto L96;
                case 9: goto L93;
                case 10: goto L90;
                default: goto L8f;
            }
        L8f:
            return r1
        L90:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L93:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L96:
            r3 = 301(0x12d, float:4.22E-43)
            return r3
        L99:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L9c:
            r3 = 303(0x12f, float:4.25E-43)
            return r3
        L9f:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        La2:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        La5:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        La8:
            r3 = 307(0x133, float:4.3E-43)
            return r3
        Lab:
            r3 = 302(0x12e, float:4.23E-43)
            return r3
        Lae:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.f.getId(java.lang.String):int");
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, int i11) {
        if (i10 == 307 || i10 == 308 || i10 == 311) {
            return true;
        }
        switch (i10) {
            case MRAID_ERROR_VALUE:
            case INVALID_IFA_STATUS_VALUE:
            case 303:
                return true;
            default:
                return super.setValue(i10, i11);
        }
    }

    @Override // z2.a
    public a clone() {
        return new f().copy((a) this);
    }

    @Override // z2.a
    public f copy(a aVar) {
        super.copy(aVar);
        ((f) aVar).getClass();
        return this;
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, float f10) {
        if (i10 != 305) {
            return super.setValue(i10, f10);
        }
        return true;
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, String str) {
        if (i10 == 309 || i10 == 310 || i10 == 312) {
            return true;
        }
        return super.setValue(i10, str);
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, boolean z10) {
        if (i10 != 304) {
            return super.setValue(i10, z10);
        }
        return true;
    }

    @Override // z2.a
    public void addValues(HashMap<String, x> map) {
    }

    @Override // z2.a
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public void conditionallyFire(float f10, y2.h hVar) {
    }
}
