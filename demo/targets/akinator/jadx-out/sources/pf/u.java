package pf;

import android.os.SystemClock;
import bf.m1;
import bf.n1;
import com.google.android.exoplayer2.n3;
import java.util.Arrays;
import java.util.List;
import nh.b5;
import nh.x4;
import pf.c;
import qf.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u {
    public static n3 buildTracks(m mVar, o[] oVarArr) {
        List[] listArr = new List[oVarArr.length];
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            o oVar = oVarArr[i10];
            listArr[i10] = oVar != null ? b5.of(oVar) : b5.of();
        }
        return buildTracks(mVar, (List<? extends o>[]) listArr);
    }

    public static l0 createFallbackOptions(k kVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = kVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (kVar.isTrackExcluded(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new l0(1, 0, length, i10);
    }

    public static k[] createTrackSelectionsForDefinitions(i[] iVarArr, t tVar) {
        k[] kVarArr = new k[iVarArr.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < iVarArr.length; i10++) {
            i iVar = iVarArr[i10];
            if (iVar != null) {
                int[] iArr = iVar.f81120b;
                if (iArr.length <= 1 || z10) {
                    kVarArr[i10] = new l(iVar.f81119a, iArr[0], iVar.f81121c);
                } else {
                    kVarArr[i10] = tVar.a();
                    z10 = true;
                }
            }
        }
        return kVarArr;
    }

    public static e updateParametersWithOverride(e eVar, int i10, n1 n1Var, boolean z10, c.d dVar) {
        d rendererDisabled = eVar.buildUpon().clearSelectionOverrides(i10).setRendererDisabled(i10, z10);
        if (dVar != null) {
            rendererDisabled.setSelectionOverride(i10, n1Var, dVar);
        }
        return rendererDisabled.build();
    }

    public static n3 buildTracks(m mVar, List<? extends o>[] listArr) {
        boolean z10;
        x4 x4Var = new x4();
        for (int i10 = 0; i10 < mVar.getRendererCount(); i10++) {
            n1 trackGroups = mVar.getTrackGroups(i10);
            List<? extends o> list = listArr[i10];
            for (int i11 = 0; i11 < trackGroups.f9356b; i11++) {
                m1 m1Var = trackGroups.get(i11);
                boolean z11 = mVar.getAdaptiveSupport(i10, i11, false) != 0;
                int i12 = m1Var.f9332b;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < m1Var.f9332b; i13++) {
                    iArr[i13] = mVar.getTrackSupport(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        o oVar = list.get(i14);
                        if (oVar.getTrackGroup().equals(m1Var) && oVar.indexOf(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                x4Var.add((Object) new n3.a(m1Var, z11, iArr, zArr));
            }
        }
        n1 unmappedTrackGroups = mVar.getUnmappedTrackGroups();
        for (int i15 = 0; i15 < unmappedTrackGroups.f9356b; i15++) {
            m1 m1Var2 = unmappedTrackGroups.get(i15);
            int[] iArr2 = new int[m1Var2.f9332b];
            Arrays.fill(iArr2, 0);
            x4Var.add((Object) new n3.a(m1Var2, false, iArr2, new boolean[m1Var2.f9332b]));
        }
        return new n3(x4Var.build());
    }
}
