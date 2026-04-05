package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2903n8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33137b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33138c;

    /* renamed from: d, reason: collision with root package name */
    public final C2920o8 f33139d;

    /* renamed from: e, reason: collision with root package name */
    public Object f33140e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33141f;

    /* renamed from: g, reason: collision with root package name */
    public String f33142g;

    /* renamed from: h, reason: collision with root package name */
    public String f33143h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33144i;

    /* renamed from: j, reason: collision with root package name */
    public byte f33145j;

    /* renamed from: k, reason: collision with root package name */
    public byte f33146k;

    /* renamed from: l, reason: collision with root package name */
    public byte f33147l;

    /* renamed from: m, reason: collision with root package name */
    public byte f33148m;

    /* renamed from: n, reason: collision with root package name */
    public int f33149n;

    /* renamed from: o, reason: collision with root package name */
    public int f33150o;

    /* renamed from: p, reason: collision with root package name */
    public String f33151p;

    /* renamed from: q, reason: collision with root package name */
    public String f33152q;

    /* renamed from: r, reason: collision with root package name */
    public C2970r8 f33153r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f33154s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f33155t;

    /* renamed from: u, reason: collision with root package name */
    public Object f33156u;

    /* renamed from: v, reason: collision with root package name */
    public int f33157v;

    /* renamed from: w, reason: collision with root package name */
    public C2903n8 f33158w;

    public C2903n8(String assetId, String assetName, String assetType, C2920o8 assetStyle, List trackers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetType, "assetType");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        this.f33136a = assetId;
        this.f33137b = assetName;
        this.f33138c = assetType;
        this.f33139d = assetStyle;
        this.f33142g = "NO_ACTION";
        this.f33143h = "";
        this.f33148m = (byte) 2;
        this.f33149n = -1;
        this.f33151p = "";
        this.f33152q = "";
        ArrayList arrayList = new ArrayList();
        this.f33154s = arrayList;
        this.f33155t = new HashMap();
        arrayList.addAll(trackers);
    }

    public static void a(C2752e9 tracker, HashMap map, V7 v72, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tracker, "tracker");
        C3100z2.f33672a.a(C2736da.a(tracker.f32817d, map), tracker.f32816c, true, v72, EnumC2737db.f32782b, f52);
    }

    public static void d(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
    }

    public final void b(byte b10) {
        this.f33148m = b10;
    }

    public final void c(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
    }

    public final void b(int i10) {
        this.f33149n = i10;
    }

    public final void b(String str) {
        String string;
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            string = str.subSequence(i10, length + 1).toString();
        } else {
            string = null;
        }
        this.f33151p = string;
    }

    public final void a(byte b10) {
        this.f33145j = b10;
    }

    public final void a(int i10) {
        this.f33150o = i10;
    }

    public final void a(C2970r8 c2970r8) {
        this.f33153r = c2970r8;
    }

    public final HashMap a() {
        return this.f33155t;
    }

    public final void a(String eventType, HashMap map, V7 v72, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        Iterator it = this.f33154s.iterator();
        while (it.hasNext()) {
            C2752e9 c2752e9 = (C2752e9) it.next();
            if (kotlin.jvm.internal.e0.areEqual(eventType, c2752e9.f32815b)) {
                a(c2752e9, map, v72, f52);
            }
        }
    }

    public /* synthetic */ C2903n8(String str, String str2, String str3, C2920o8 c2920o8, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "root" : str2, (i10 & 4) != 0 ? "CONTAINER" : str3, (i10 & 8) != 0 ? new C2920o8() : c2920o8, new LinkedList());
    }

    public final void a(String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        int length = value.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) value.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        this.f33152q = value.subSequence(i10, length + 1).toString();
    }
}
