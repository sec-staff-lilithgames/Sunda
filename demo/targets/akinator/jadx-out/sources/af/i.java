package af;

import af.h;
import com.applovin.impl.y7;
import com.applovin.impl.z7;
import com.google.android.exoplayer2.util.n1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import em.r0;
import ff.b;
import fo.e;
import go.d0;
import io.bidmachine.media3.ui.i0;
import io.bidmachine.protobuf.Waterfall;
import io.odeeo.internal.p0.z;
import io.odeeo.internal.u0.y;
import io.odeeo.internal.y.c;
import ip.b;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import ki.f2;
import nh.n2;
import nh.we;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4364b;

    public /* synthetic */ i(int i10) {
        this.f4364b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4364b) {
            case 0:
                int i10 = h.b.f4350n;
                return n1.compareLong(((c) obj).f4320c, ((c) obj2).f4320c);
            case 1:
                return z.a((z.b) obj, (z.b) obj2);
            case 2:
                return Float.compare(((z.b) obj).f65784c, ((z.b) obj2).f65784c);
            case 3:
                return y7.a((z7) obj, (z7) obj2);
            case 4:
                com.google.android.exoplayer2.ui.m mVar = (com.google.android.exoplayer2.ui.m) obj;
                com.google.android.exoplayer2.ui.m mVar2 = (com.google.android.exoplayer2.ui.m) obj2;
                int iCompare = Integer.compare(mVar2.f28263b, mVar.f28263b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = mVar.f28264c.compareTo(mVar2.f28264c);
                return iCompareTo != 0 ? iCompareTo : mVar.f28265d.compareTo(mVar2.f28265d);
            case 5:
                com.google.android.exoplayer2.ui.m mVar3 = (com.google.android.exoplayer2.ui.m) obj;
                com.google.android.exoplayer2.ui.m mVar4 = (com.google.android.exoplayer2.ui.m) obj2;
                int iCompare2 = Integer.compare(mVar4.f28262a, mVar3.f28262a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = mVar4.f28264c.compareTo(mVar3.f28264c);
                return iCompareTo2 != 0 ? iCompareTo2 : mVar4.f28265d.compareTo(mVar3.f28265d);
            case 6:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a((a0) obj, (a0) obj2);
            case 7:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj2);
            case 8:
                return -Double.compare(((em.u) obj).getPrice(), ((em.u) obj2).getPrice());
            case 9:
                return ((fm.b) obj).getVersionForWhichCompiled().compareTo(((fm.b) obj2).getVersionForWhichCompiled());
            case 10:
                nr.c cVar = r0.f54730w;
                return -Double.compare(((Waterfall.Configuration.AdUnit) obj).getPrice(), ((Waterfall.Configuration.AdUnit) obj2).getPrice());
            case 11:
                return Integer.compare(((b.a) obj2).f55666b, ((b.a) obj).f55666b);
            case 12:
                return ((io.bidmachine.media3.common.b) obj2).f60660j - ((io.bidmachine.media3.common.b) obj).f60660j;
            case 13:
                return e.g.compareSelections((List) obj, (List) obj2);
            case 14:
                return e.i.compareSelections((List) obj, (List) obj2);
            case 15:
                return e.a.compareSelections((List) obj, (List) obj2);
            case 16:
                return e.b.compareSelections((List) obj, (List) obj2);
            case 17:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                we weVar = fo.e.f55823j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 18:
                e.i iVar = (e.i) obj;
                e.i iVar2 = (e.i) obj2;
                n2 n2VarCompare = n2.start().compareFalseFirst(iVar.f55880j, iVar2.f55880j).compare(Integer.valueOf(iVar.f55885o), Integer.valueOf(iVar2.f55885o), we.natural().reverse()).compare(iVar.f55886p, iVar2.f55886p).compare(iVar.f55887q, iVar2.f55887q).compareFalseFirst(iVar.f55888r, iVar2.f55888r).compare(iVar.f55889s, iVar2.f55889s).compareFalseFirst(iVar.f55881k, iVar2.f55881k).compareFalseFirst(iVar.f55877g, iVar2.f55877g).compareFalseFirst(iVar.f55879i, iVar2.f55879i).compare(Integer.valueOf(iVar.f55884n), Integer.valueOf(iVar2.f55884n), we.natural().reverse());
                boolean z10 = iVar.f55892v;
                n2 n2VarCompareFalseFirst = n2VarCompare.compareFalseFirst(z10, iVar2.f55892v);
                boolean z11 = iVar.f55893w;
                n2 n2VarCompareFalseFirst2 = n2VarCompareFalseFirst.compareFalseFirst(z11, iVar2.f55893w);
                if (z10 && z11) {
                    n2VarCompareFalseFirst2 = n2VarCompareFalseFirst2.compare(iVar.f55894x, iVar2.f55894x);
                }
                return n2VarCompareFalseFirst2.result();
            case 19:
                e.i iVar3 = (e.i) obj;
                e.i iVar4 = (e.i) obj2;
                boolean z12 = iVar3.f55877g;
                int i11 = iVar3.f55882l;
                we weVarReverse = (z12 && iVar3.f55880j) ? fo.e.f55823j : fo.e.f55823j.reverse();
                n2 n2VarStart = n2.start();
                if (iVar3.f55878h.B) {
                    n2VarStart = n2VarStart.compare(Integer.valueOf(i11), Integer.valueOf(iVar4.f55882l), fo.e.f55823j.reverse());
                }
                return n2VarStart.compare(Integer.valueOf(iVar3.f55883m), Integer.valueOf(iVar4.f55883m), weVarReverse).compare(Integer.valueOf(i11), Integer.valueOf(iVar4.f55882l), weVarReverse).result();
            case 20:
                return ((d0) obj).f58305a - ((d0) obj2).f58305a;
            case 21:
                return Float.compare(((d0) obj).f58307c, ((d0) obj2).f58307c);
            case 22:
                tu.v vVar = (tu.v) obj;
                tu.v vVar2 = (tu.v) obj2;
                return (((Number) vVar.getSecond()).intValue() - ((Number) vVar.getFirst()).intValue()) - (((Number) vVar2.getSecond()).intValue() - ((Number) vVar2.getFirst()).intValue());
            case 23:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 24:
                return ((f2.c) obj).getKey().compareTo(((f2.c) obj2).getKey());
            case 25:
                i0 i0Var = (i0) obj;
                i0 i0Var2 = (i0) obj2;
                int iCompare3 = Integer.compare(i0Var2.f61765b, i0Var.f61765b);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo3 = i0Var.f61766c.compareTo(i0Var2.f61766c);
                return iCompareTo3 != 0 ? iCompareTo3 : i0Var.f61767d.compareTo(i0Var2.f61767d);
            case 26:
                i0 i0Var3 = (i0) obj;
                i0 i0Var4 = (i0) obj2;
                int iCompare4 = Integer.compare(i0Var4.f61764a, i0Var3.f61764a);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompareTo4 = i0Var4.f61766c.compareTo(i0Var3.f61766c);
                return iCompareTo4 != 0 ? iCompareTo4 : i0Var4.f61767d.compareTo(i0Var3.f61767d);
            case 27:
                return Integer.compare(((b.a) obj2).f68311b, ((b.a) obj).f68311b);
            case 28:
                c.b bVar = (c.b) obj;
                c.b bVar2 = (c.b) obj2;
                return y.start().compare(bVar.f67537a, bVar2.f67537a).compare(bVar.f67538b, bVar2.f67538b).compare(bVar.f67539c, bVar2.f67539c).result();
            default:
                Charset charset = ni.b.f76837e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
