package cp;

import ep.s;
import ep.w;
import hp.q;
import ko.e0;
import ko.z;
import rp.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f50798c;

    public /* synthetic */ e(q qVar, int i10) {
        this.f50797b = i10;
        this.f50798c = qVar;
    }

    @Override // ko.e0
    /* renamed from: createExtractors */
    public final z[] mo3833createExtractors() {
        int i10 = this.f50797b;
        q qVar = this.f50798c;
        switch (i10) {
            case 0:
                return new z[]{new h(qVar)};
            case 1:
                return new z[]{new s(qVar)};
            case 2:
                return new z[]{new w(qVar)};
            default:
                return new z[]{new i0(qVar)};
        }
    }
}
