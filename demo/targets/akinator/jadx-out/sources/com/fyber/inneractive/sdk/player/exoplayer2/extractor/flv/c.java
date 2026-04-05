package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f24694b;

    public c() {
        super(null);
        this.f24694b = C.TIME_UNSET;
    }

    public final void a(n nVar, long j10) throws r {
        if (nVar.j() != 2) {
            throw new r();
        }
        int iO = nVar.o();
        int i10 = nVar.f26043b;
        nVar.e(i10 + iO);
        if ("onMetaData".equals(new String(nVar.f26042a, i10, iO)) && nVar.j() == 8) {
            HashMap mapA = a(nVar);
            if (mapA.containsKey(IronSourceConstants.EVENTS_DURATION)) {
                double dDoubleValue = ((Double) mapA.get(IronSourceConstants.EVENTS_DURATION)).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f24694b = (long) (dDoubleValue * 1000000.0d);
                }
            }
        }
    }

    public static Serializable a(int i10, n nVar) {
        if (i10 == 8) {
            return a(nVar);
        }
        if (i10 == 10) {
            int iM = nVar.m();
            ArrayList arrayList = new ArrayList(iM);
            for (int i11 = 0; i11 < iM; i11++) {
                arrayList.add(a(nVar.j(), nVar));
            }
            return arrayList;
        }
        if (i10 == 11) {
            Date date = new Date((long) Double.longBitsToDouble(nVar.g()));
            nVar.e(nVar.f26043b + 2);
            return date;
        }
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(nVar.g()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(nVar.j() == 1);
        }
        if (i10 == 2) {
            int iO = nVar.o();
            int i12 = nVar.f26043b;
            nVar.e(i12 + iO);
            return new String(nVar.f26042a, i12, iO);
        }
        if (i10 != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            int iO2 = nVar.o();
            int i13 = nVar.f26043b;
            nVar.e(i13 + iO2);
            String str = new String(nVar.f26042a, i13, iO2);
            int iJ = nVar.j();
            if (iJ == 9) {
                return map;
            }
            map.put(str, a(iJ, nVar));
        }
    }

    public static HashMap a(n nVar) {
        int iM = nVar.m();
        HashMap map = new HashMap(iM);
        for (int i10 = 0; i10 < iM; i10++) {
            int iO = nVar.o();
            int i11 = nVar.f26043b;
            nVar.e(i11 + iO);
            map.put(new String(nVar.f26042a, i11, iO), a(nVar.j(), nVar));
        }
        return map;
    }
}
