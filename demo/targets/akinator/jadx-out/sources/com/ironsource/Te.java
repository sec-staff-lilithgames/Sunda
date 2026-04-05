package com.ironsource;

import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class Te implements P8, P8.a {

    /* renamed from: c, reason: collision with root package name */
    private static final int f35508c = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, Integer> f35509a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C3179da f35510b = new C3179da();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35511a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f35511a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35511a[IronSource.a.f37252c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35511a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35511a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Te() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(IronSource.a aVar, int i10) {
        this.f35509a.put(aVar, Integer.valueOf(i10));
        int i11 = a.f35511a[aVar.ordinal()];
        if (i11 == 1) {
            this.f35510b.d(i10);
            return;
        }
        if (i11 == 2) {
            this.f35510b.b(i10);
        } else if (i11 == 3) {
            this.f35510b.a(i10);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f35510b.c(i10);
        }
    }

    @Override // com.ironsource.P8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.f35509a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.P8
    public synchronized int a(IronSource.a aVar) {
        int iIntValue = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.f35509a.get(aVar);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.P8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
