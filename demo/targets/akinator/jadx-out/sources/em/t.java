package em;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class t implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f54758c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Waterfall.Result.EstimatedPrice f54759e;

    public /* synthetic */ t(u uVar, Waterfall.Result.EstimatedPrice estimatedPrice, int i10) {
        this.f54757b = i10;
        this.f54758c = uVar;
        this.f54759e = estimatedPrice;
    }

    @Override // rr.b
    public final Object get() {
        String string;
        String string2;
        String str;
        String str2;
        String str3;
        switch (this.f54757b) {
            case 0:
                string = s.toString(this.f54758c.f54764d);
                string2 = s.toString(this.f54759e);
                str = ", ";
                str2 = gjnZrsdA.cBnDOTPqMqsmj;
                str3 = "onPaidEvent (";
                break;
            default:
                string = s.toString(this.f54758c.f54764d);
                string2 = s.toString(this.f54759e);
                str = ", ";
                str2 = ")";
                str3 = "onAdLoaded (";
                break;
        }
        return e3.g.l(str3, string, str, string2, str2);
    }
}
