package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.P7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3398pd implements P7, P7.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38172a = "CappingManager.IS_DELIVERY_ENABLED";

    /* renamed from: b, reason: collision with root package name */
    private static final String f38173b = "CappingManager.IS_CAPPING_ENABLED";

    /* renamed from: c, reason: collision with root package name */
    private static final String f38174c = "CappingManager.IS_PACING_ENABLED";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38175d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38176e = "CappingManager.CAPPING_TYPE";

    /* renamed from: f, reason: collision with root package name */
    private static final String f38177f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* renamed from: g, reason: collision with root package name */
    private static final String f38178g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* renamed from: h, reason: collision with root package name */
    private static final String f38179h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* renamed from: i, reason: collision with root package name */
    private static final String f38180i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.pd$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38181a;

        static {
            int[] iArr = new int[EnumC3415qd.values().length];
            f38181a = iArr;
            try {
                iArr[EnumC3415qd.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38181a[EnumC3415qd.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.pd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.P7
    public synchronized b a(Context context, AbstractC3506w3 abstractC3506w3, IronSource.a aVar) {
        if (context == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC3506w3 == null) {
            return b.NOT_CAPPED;
        }
        String strA = a(aVar);
        if (abstractC3506w3.c() == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC3506w3.a() == null) {
            return b.NOT_CAPPED;
        }
        return b(context, strA, abstractC3506w3.c());
    }

    @Override // com.ironsource.P7.a
    public synchronized void b(Context context, AbstractC3506w3 abstractC3506w3, IronSource.a aVar) {
        if (context == null || abstractC3506w3 == null) {
            return;
        }
        C3343md c3343mdA = abstractC3506w3.a();
        if (c3343mdA == null) {
            return;
        }
        a(context, a(aVar), abstractC3506w3.c(), c3343mdA);
    }

    @Override // com.ironsource.P7
    public synchronized boolean c(Context context, AbstractC3506w3 abstractC3506w3, IronSource.a aVar) {
        return a(context, abstractC3506w3, aVar) != b.NOT_CAPPED;
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, f38172a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, f38174c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, f38180i, str2), 0L) < IronSourceUtils.a(context, a(str, f38177f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, f38173b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, f38175d, str2), 0);
            String strA = a(str, f38178g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, f38179h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.P7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(Context context, String str, String str2) {
        EnumC3415qd enumC3415qd;
        int i10 = 0;
        if (IronSourceUtils.a(context, a(str, f38174c, str2), false)) {
            IronSourceUtils.b(context, a(str, f38180i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, f38173b, str2), false)) {
            String strA = a(str, f38178g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, f38176e, str2), EnumC3415qd.PER_DAY.toString());
                EnumC3415qd[] enumC3415qdArrValues = EnumC3415qd.values();
                int length = enumC3415qdArrValues.length;
                while (true) {
                    if (i10 >= length) {
                        enumC3415qd = null;
                        break;
                    }
                    enumC3415qd = enumC3415qdArrValues[i10];
                    if (enumC3415qd.f38227a.equals(strC)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                IronSourceUtils.b(context, a(str, f38179h, str2), a(enumC3415qd));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private long a(EnumC3415qd enumC3415qd) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = a.f38181a[enumC3415qd.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(Context context, String str, String str2, C3343md c3343md) {
        boolean zE = c3343md.e();
        IronSourceUtils.b(context, a(str, f38172a, str2), zE);
        if (zE) {
            boolean zD = c3343md.d();
            IronSourceUtils.b(context, a(str, f38173b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, f38175d, str2), c3343md.b());
                IronSourceUtils.f(context, a(str, f38176e, str2), c3343md.a().toString());
            }
            boolean zF = c3343md.f();
            IronSourceUtils.b(context, a(str, f38174c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f38177f, str2), c3343md.c());
            }
        }
    }

    private String a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == IronSource.a.f37252c) {
            return "Interstitial";
        }
        if (aVar == IronSource.a.BANNER) {
            return "Banner";
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceConstants.NATIVE_AD_UNIT;
        }
        return aVar.toString();
    }
}
