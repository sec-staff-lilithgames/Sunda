package fo;

import android.os.SystemClock;
import fo.e;
import gn.b2;
import gn.v1;
import java.util.Arrays;
import java.util.List;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s {
    public static b2 buildTracks(n nVar, p[] pVarArr) {
        List[] listArr = new List[pVarArr.length];
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            p pVar = pVarArr[i10];
            listArr[i10] = pVar != null ? b5.of(pVar) : b5.of();
        }
        return buildTracks(nVar, (List<? extends p>[]) listArr);
    }

    public static go.q createFallbackOptions(l lVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = lVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (lVar.isTrackExcluded(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new go.q(1, 0, length, i10);
    }

    public static l[] createTrackSelectionsForDefinitions(j[] jVarArr, r rVar) {
        l[] lVarArr = new l[jVarArr.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            j jVar = jVarArr[i10];
            if (jVar != null) {
                int[] iArr = jVar.f55909b;
                if (iArr.length <= 1 || z10) {
                    lVarArr[i10] = new m(jVar.f55908a, iArr[0], jVar.f55910c);
                } else {
                    lVarArr[i10] = rVar.a();
                    z10 = true;
                }
            }
        }
        return lVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = io.bidmachine.media3.common.util.a1.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = io.bidmachine.media3.common.util.a1.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.s.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    @Deprecated
    public static g updateParametersWithOverride(g gVar, int i10, ao.b2 b2Var, boolean z10, e.C0566e c0566e) {
        f rendererDisabled = gVar.buildUpon().clearSelectionOverrides(i10).setRendererDisabled(i10, z10);
        if (c0566e != null) {
            rendererDisabled.setSelectionOverride(i10, b2Var, c0566e);
        }
        return rendererDisabled.build();
    }

    public static b2 buildTracks(n nVar, List<? extends p>[] listArr) {
        boolean z10;
        x4 x4Var = new x4();
        for (int i10 = 0; i10 < nVar.getRendererCount(); i10++) {
            ao.b2 trackGroups = nVar.getTrackGroups(i10);
            List<? extends p> list = listArr[i10];
            for (int i11 = 0; i11 < trackGroups.f7552a; i11++) {
                v1 v1Var = trackGroups.get(i11);
                boolean z11 = nVar.getAdaptiveSupport(i10, i11, false) != 0;
                int i12 = v1Var.f58205a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < v1Var.f58205a; i13++) {
                    iArr[i13] = nVar.getTrackSupport(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        p pVar = list.get(i14);
                        if (pVar.getTrackGroup().equals(v1Var) && pVar.indexOf(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                x4Var.add((Object) new b2.a(v1Var, z11, iArr, zArr));
            }
        }
        ao.b2 unmappedTrackGroups = nVar.getUnmappedTrackGroups();
        for (int i15 = 0; i15 < unmappedTrackGroups.f7552a; i15++) {
            v1 v1Var2 = unmappedTrackGroups.get(i15);
            int[] iArr2 = new int[v1Var2.f58205a];
            Arrays.fill(iArr2, 0);
            x4Var.add((Object) new b2.a(v1Var2, false, iArr2, new boolean[v1Var2.f58205a]));
        }
        return new b2(x4Var.build());
    }
}
