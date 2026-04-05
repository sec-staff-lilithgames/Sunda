package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3188e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36328b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f36329c = -1;

    /* renamed from: a, reason: collision with root package name */
    private final C3294k0 f36330a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.e1$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.e1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return xu.d.compareValues(Integer.valueOf(((LevelPlayAdSize) t11).getWidth()), Integer.valueOf(((LevelPlayAdSize) t10).getWidth()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.e1$c */
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f36331a;

        public c(Comparator comparator) {
            this.f36331a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f36331a.compare(t10, t11);
            return iCompare != 0 ? iCompare : xu.d.compareValues(Integer.valueOf(((LevelPlayAdSize) t11).getHeight()), Integer.valueOf(((LevelPlayAdSize) t10).getHeight()));
        }
    }

    public C3188e1(C3294k0 adSizeTools) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.f36330a = adSizeTools;
    }

    public final LevelPlayAdSize a(Context context, Integer num) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (!this.f36330a.d()) {
            IronLog.API.error(C3294k0.a(this.f36330a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer numB = this.f36330a.b(context);
        if (numB == null) {
            IronLog.API.error(C3294k0.a(this.f36330a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int iIntValue = numB.intValue();
        int iA = a(num, context);
        int iA2 = this.f36330a.a(iA);
        List<LevelPlayAdSize> listA = a();
        for (LevelPlayAdSize levelPlayAdSizeCreateCustomSize : a(listA, iIntValue, iA)) {
            if (levelPlayAdSizeCreateCustomSize.getWidth() <= iA && (levelPlayAdSizeCreateCustomSize.getHeight() <= iA2 || iA2 == -1)) {
                iA2 = Math.max(iA2, levelPlayAdSizeCreateCustomSize.getHeight());
                break;
            }
        }
        levelPlayAdSizeCreateCustomSize = null;
        if (levelPlayAdSizeCreateCustomSize == null) {
            iA2 = ((LevelPlayAdSize) uu.y0.last((List) listA)).getHeight();
            levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.Companion.createCustomSize(iA, iA2);
        }
        int i10 = iA2;
        LevelPlayAdSize levelPlayAdSize = levelPlayAdSizeCreateCustomSize;
        IronLog ironLog = IronLog.INTERNAL;
        C3294k0 c3294k0 = this.f36330a;
        StringBuilder sbF = w0.i.f(iA, i10, "Adaptive: ", "x", " Fallback: ");
        sbF.append(levelPlayAdSize);
        ironLog.info(C3294k0.a(c3294k0, sbF.toString(), (String) null, 2, (Object) null));
        return new LevelPlayAdSize(iA, i10, com.ironsource.mediationsdk.l.f37559f, true, levelPlayAdSize);
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C3294k0.a(this.f36330a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return C3192e5.f36568a.b(context);
        }
        if (num == null) {
            return C3192e5.f36568a.b(context);
        }
        return num.intValue();
    }

    private final List<LevelPlayAdSize> a() {
        return uu.y0.sortedWith(this.f36330a.b(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i10 && levelPlayAdSize.getWidth() <= i11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
