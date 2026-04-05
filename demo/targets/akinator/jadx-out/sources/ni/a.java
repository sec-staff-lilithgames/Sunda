package ni;

import com.google.android.exoplayer2.z0;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import io.bidmachine.media3.common.util.a1;
import io.odeeo.internal.b.t;
import io.odeeo.internal.e0.b;
import io.odeeo.internal.m0.f;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.e0;
import nh.n2;
import nh.we;
import of.e;
import of.f;
import p0.s1;
import pf.c;
import qf.y0;
import z1.b0;
import zl.f0;
import zl.s;
import zn.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76836b;

    public /* synthetic */ a(int i10) {
        this.f76836b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f76836b) {
            case 0:
                Charset charset = b.f76837e;
                String name = ((File) obj).getName();
                int i10 = b.f76838f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            case 1:
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                CampaignProto$ThickContent campaignProto$ThickContent2 = (CampaignProto$ThickContent) obj2;
                if (campaignProto$ThickContent.getIsTestCampaign() && !campaignProto$ThickContent2.getIsTestCampaign()) {
                    return -1;
                }
                if (!campaignProto$ThickContent2.getIsTestCampaign() || campaignProto$ThickContent.getIsTestCampaign()) {
                    return Integer.compare(campaignProto$ThickContent.getPriority().getValue(), campaignProto$ThickContent2.getPriority().getValue());
                }
                return 1;
            case 2:
                return Integer.compare(((b.a) obj2).f63787b, ((b.a) obj).f63787b);
            case 3:
                return Integer.compare(((f) obj).f79352a.f79355b, ((f) obj2).f79352a.f79355b);
            case 4:
                return Long.compare(((e) obj).f79349b, ((e) obj2).f79349b);
            case 5:
                return e0.compare(((s1) obj).getLocation(), ((s1) obj2).getLocation());
            case 6:
                return ((z0) obj2).f28798j - ((z0) obj).f28798j;
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                we weVar = pf.c.f81029k;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                we weVar2 = pf.c.f81029k;
                return 0;
            case 9:
                return c.g.compareSelections((List) obj, (List) obj2);
            case 10:
                return c.a.compareSelections((List) obj, (List) obj2);
            case 11:
                return c.e.compareSelections((List) obj, (List) obj2);
            case 12:
                c.g gVar = (c.g) obj;
                c.g gVar2 = (c.g) obj2;
                n2 n2VarCompare = n2.start().compareFalseFirst(gVar.f81080j, gVar2.f81080j).compare(gVar.f81084n, gVar2.f81084n).compareFalseFirst(gVar.f81085o, gVar2.f81085o).compareFalseFirst(gVar.f81077g, gVar2.f81077g).compareFalseFirst(gVar.f81079i, gVar2.f81079i).compare(Integer.valueOf(gVar.f81083m), Integer.valueOf(gVar2.f81083m), we.natural().reverse());
                boolean z10 = gVar.f81088r;
                n2 n2VarCompareFalseFirst = n2VarCompare.compareFalseFirst(z10, gVar2.f81088r);
                boolean z11 = gVar.f81089s;
                n2 n2VarCompareFalseFirst2 = n2VarCompareFalseFirst.compareFalseFirst(z11, gVar2.f81089s);
                if (z10 && z11) {
                    n2VarCompareFalseFirst2 = n2VarCompareFalseFirst2.compare(gVar.f81090t, gVar2.f81090t);
                }
                return n2VarCompareFalseFirst2.result();
            case 13:
                c.g gVar3 = (c.g) obj;
                c.g gVar4 = (c.g) obj2;
                boolean z12 = gVar3.f81077g;
                int i11 = gVar3.f81081k;
                we weVarReverse = (z12 && gVar3.f81080j) ? pf.c.f81029k : pf.c.f81029k.reverse();
                return n2.start().compare(Integer.valueOf(i11), Integer.valueOf(gVar4.f81081k), gVar3.f81078h.f81190y ? pf.c.f81029k.reverse() : pf.c.f81030l).compare(Integer.valueOf(gVar3.f81082l), Integer.valueOf(gVar4.f81082l), weVarReverse).compare(Integer.valueOf(i11), Integer.valueOf(gVar4.f81081k), weVarReverse).result();
            case 14:
                qn.b bVar = (qn.b) obj;
                qn.b bVar2 = (qn.b) obj2;
                int iCompare = Integer.compare(bVar.f83303c, bVar2.f83303c);
                return iCompare != 0 ? iCompare : bVar.f83302b.compareTo(bVar2.f83302b);
            case 15:
                return ((y0) obj).f83072a - ((y0) obj2).f83072a;
            case 16:
                return Float.compare(((y0) obj).f83074c, ((y0) obj2).f83074c);
            case 17:
                return Integer.compare(((qp.e) obj).f83448a.f83451b, ((qp.e) obj2).f83448a.f83451b);
            case 18:
                return Long.compare(((qp.d) obj).f83445b, ((qp.d) obj2).f83445b);
            case 19:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    byte b10 = bArr[i12];
                    byte b11 = bArr2[i12];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 20:
                return Integer.compare(((f.b) obj).f64664a.f64667b, ((f.b) obj2).f64664a.f64667b);
            case 21:
                return Long.compare(((io.odeeo.internal.m0.e) obj).f64657b, ((io.odeeo.internal.m0.e) obj2).f64657b);
            case 22:
                return io.odeeo.internal.n0.b.a((t) obj, (t) obj2);
            case 23:
                return io.odeeo.internal.n0.c.a((Integer) obj, (Integer) obj2);
            case 24:
                return io.odeeo.internal.n0.c.b((Integer) obj, (Integer) obj2);
            case 25:
                b0 b0Var = (b0) obj;
                b0 b0Var2 = (b0) obj2;
                float f10 = b0Var.G;
                float f11 = b0Var2.G;
                return f10 == f11 ? e0.compare(b0Var.f97276x, b0Var2.f97276x) : Float.compare(f10, f11);
            case 26:
                return -Float.compare(((zl.t) obj).getScope(), ((zl.t) obj2).getScope());
            case 27:
                return -Float.compare(((s) obj).getScore(), ((s) obj2).getScore());
            case 28:
                ArrayList arrayList = f0.f98230a;
                return ((am.b) obj).getVersionForWhichCompiled().compareTo(((am.b) obj2).getVersionForWhichCompiled());
            default:
                int i13 = g.b.f98347n;
                return a1.compareLong(((zn.c) obj).f98321c, ((zn.c) obj2).f98321c);
        }
    }
}
