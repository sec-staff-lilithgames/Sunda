package ad;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends t {

    /* renamed from: b, reason: collision with root package name */
    public final s[] f4290b;

    public p(t tVar, s[] sVarArr) {
        super(tVar);
        this.f4290b = sVarArr;
    }

    @Override // ad.t
    public t newWith(Class<?> cls, jc.w wVar) {
        s[] sVarArr = this.f4290b;
        int length = sVarArr.length;
        if (length == 8) {
            return this.f4297a ? new r(this, cls, wVar) : this;
        }
        s[] sVarArr2 = (s[]) Arrays.copyOf(sVarArr, length + 1);
        sVarArr2[length] = new s(cls, wVar);
        return new p(this, sVarArr2);
    }

    @Override // ad.t
    public jc.w serializerFor(Class<?> cls) {
        s[] sVarArr = this.f4290b;
        s sVar = sVarArr[0];
        if (sVar.f4295a == cls) {
            return sVar.f4296b;
        }
        s sVar2 = sVarArr[1];
        if (sVar2.f4295a == cls) {
            return sVar2.f4296b;
        }
        s sVar3 = sVarArr[2];
        if (sVar3.f4295a == cls) {
            return sVar3.f4296b;
        }
        switch (sVarArr.length) {
            case 8:
                s sVar4 = sVarArr[7];
                if (sVar4.f4295a == cls) {
                    return sVar4.f4296b;
                }
            case 7:
                s sVar5 = sVarArr[6];
                if (sVar5.f4295a == cls) {
                    return sVar5.f4296b;
                }
            case 6:
                s sVar6 = sVarArr[5];
                if (sVar6.f4295a == cls) {
                    return sVar6.f4296b;
                }
            case 5:
                s sVar7 = sVarArr[4];
                if (sVar7.f4295a == cls) {
                    return sVar7.f4296b;
                }
            case 4:
                s sVar8 = sVarArr[3];
                if (sVar8.f4295a == cls) {
                    return sVar8.f4296b;
                }
                return null;
            default:
                return null;
        }
    }
}
