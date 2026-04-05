package pf;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import bf.m1;
import com.google.android.exoplayer2.util.n1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public int f81139a;

    /* renamed from: b, reason: collision with root package name */
    public int f81140b;

    /* renamed from: c, reason: collision with root package name */
    public int f81141c;

    /* renamed from: d, reason: collision with root package name */
    public int f81142d;

    /* renamed from: e, reason: collision with root package name */
    public int f81143e;

    /* renamed from: f, reason: collision with root package name */
    public int f81144f;

    /* renamed from: g, reason: collision with root package name */
    public int f81145g;

    /* renamed from: h, reason: collision with root package name */
    public int f81146h;

    /* renamed from: i, reason: collision with root package name */
    public int f81147i;

    /* renamed from: j, reason: collision with root package name */
    public int f81148j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f81149k;

    /* renamed from: l, reason: collision with root package name */
    public b5 f81150l;

    /* renamed from: m, reason: collision with root package name */
    public int f81151m;

    /* renamed from: n, reason: collision with root package name */
    public b5 f81152n;

    /* renamed from: o, reason: collision with root package name */
    public int f81153o;

    /* renamed from: p, reason: collision with root package name */
    public int f81154p;

    /* renamed from: q, reason: collision with root package name */
    public int f81155q;

    /* renamed from: r, reason: collision with root package name */
    public b5 f81156r;

    /* renamed from: s, reason: collision with root package name */
    public b5 f81157s;

    /* renamed from: t, reason: collision with root package name */
    public int f81158t;

    /* renamed from: u, reason: collision with root package name */
    public int f81159u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f81160v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f81161w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f81162x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f81163y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f81164z;

    @Deprecated
    public r() {
        this.f81139a = Integer.MAX_VALUE;
        this.f81140b = Integer.MAX_VALUE;
        this.f81141c = Integer.MAX_VALUE;
        this.f81142d = Integer.MAX_VALUE;
        this.f81147i = Integer.MAX_VALUE;
        this.f81148j = Integer.MAX_VALUE;
        this.f81149k = true;
        this.f81150l = b5.of();
        this.f81151m = 0;
        this.f81152n = b5.of();
        this.f81153o = 0;
        this.f81154p = Integer.MAX_VALUE;
        this.f81155q = Integer.MAX_VALUE;
        this.f81156r = b5.of();
        this.f81157s = b5.of();
        this.f81158t = 0;
        this.f81159u = 0;
        this.f81160v = false;
        this.f81161w = false;
        this.f81162x = false;
        this.f81163y = new HashMap();
        this.f81164z = new HashSet();
    }

    public static b5 b(String[] strArr) {
        x4 x4VarBuilder = b5.builder();
        for (String str : (String[]) com.google.android.exoplayer2.util.a.checkNotNull(strArr)) {
            x4VarBuilder.add((Object) n1.normalizeLanguageCode((String) com.google.android.exoplayer2.util.a.checkNotNull(str)));
        }
        return x4VarBuilder.build();
    }

    public final void a(s sVar) {
        this.f81139a = sVar.f81168b;
        this.f81140b = sVar.f81169c;
        this.f81141c = sVar.f81170e;
        this.f81142d = sVar.f81171f;
        this.f81143e = sVar.f81172g;
        this.f81144f = sVar.f81173h;
        this.f81145g = sVar.f81174i;
        this.f81146h = sVar.f81175j;
        this.f81147i = sVar.f81176k;
        this.f81148j = sVar.f81177l;
        this.f81149k = sVar.f81178m;
        this.f81150l = sVar.f81179n;
        this.f81151m = sVar.f81180o;
        this.f81152n = sVar.f81181p;
        this.f81153o = sVar.f81182q;
        this.f81154p = sVar.f81183r;
        this.f81155q = sVar.f81184s;
        this.f81156r = sVar.f81185t;
        this.f81157s = sVar.f81186u;
        this.f81158t = sVar.f81187v;
        this.f81159u = sVar.f81188w;
        this.f81160v = sVar.f81189x;
        this.f81161w = sVar.f81190y;
        this.f81162x = sVar.f81191z;
        this.f81164z = new HashSet(sVar.B);
        this.f81163y = new HashMap(sVar.A);
    }

    public r addOverride(q qVar) {
        this.f81163y.put(qVar.f81137b, qVar);
        return this;
    }

    public s build() {
        return new s(this);
    }

    public r clearOverride(m1 m1Var) {
        this.f81163y.remove(m1Var);
        return this;
    }

    public r clearOverrides() {
        this.f81163y.clear();
        return this;
    }

    public r clearOverridesOfType(int i10) {
        Iterator it = this.f81163y.values().iterator();
        while (it.hasNext()) {
            if (((q) it.next()).getType() == i10) {
                it.remove();
            }
        }
        return this;
    }

    public r clearVideoSizeConstraints() {
        return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public r clearViewportSizeConstraints() {
        return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    @Deprecated
    public r setDisabledTrackTypes(Set<Integer> set) {
        this.f81164z.clear();
        this.f81164z.addAll(set);
        return this;
    }

    public r setForceHighestSupportedBitrate(boolean z10) {
        this.f81162x = z10;
        return this;
    }

    public r setForceLowestBitrate(boolean z10) {
        this.f81161w = z10;
        return this;
    }

    public r setIgnoredTextSelectionFlags(int i10) {
        this.f81159u = i10;
        return this;
    }

    public r setMaxAudioBitrate(int i10) {
        this.f81155q = i10;
        return this;
    }

    public r setMaxAudioChannelCount(int i10) {
        this.f81154p = i10;
        return this;
    }

    public r setMaxVideoBitrate(int i10) {
        this.f81142d = i10;
        return this;
    }

    public r setMaxVideoFrameRate(int i10) {
        this.f81141c = i10;
        return this;
    }

    public r setMaxVideoSize(int i10, int i11) {
        this.f81139a = i10;
        this.f81140b = i11;
        return this;
    }

    public r setMaxVideoSizeSd() {
        return setMaxVideoSize(1279, 719);
    }

    public r setMinVideoBitrate(int i10) {
        this.f81146h = i10;
        return this;
    }

    public r setMinVideoFrameRate(int i10) {
        this.f81145g = i10;
        return this;
    }

    public r setMinVideoSize(int i10, int i11) {
        this.f81143e = i10;
        this.f81144f = i11;
        return this;
    }

    public r setOverrideForType(q qVar) {
        clearOverridesOfType(qVar.getType());
        this.f81163y.put(qVar.f81137b, qVar);
        return this;
    }

    public r setPreferredAudioLanguage(String str) {
        return str == null ? setPreferredAudioLanguages(new String[0]) : setPreferredAudioLanguages(str);
    }

    public r setPreferredAudioLanguages(String... strArr) {
        this.f81152n = b(strArr);
        return this;
    }

    public r setPreferredAudioMimeType(String str) {
        return str == null ? setPreferredAudioMimeTypes(new String[0]) : setPreferredAudioMimeTypes(str);
    }

    public r setPreferredAudioMimeTypes(String... strArr) {
        this.f81156r = b5.copyOf(strArr);
        return this;
    }

    public r setPreferredAudioRoleFlags(int i10) {
        this.f81153o = i10;
        return this;
    }

    public r setPreferredTextLanguage(String str) {
        return str == null ? setPreferredTextLanguages(new String[0]) : setPreferredTextLanguages(str);
    }

    public r setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        CaptioningManager captioningManager;
        int i10 = n1.f28506a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f81158t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f81157s = b5.of(n1.getLocaleLanguageTag(locale));
            }
        }
        return this;
    }

    public r setPreferredTextLanguages(String... strArr) {
        this.f81157s = b(strArr);
        return this;
    }

    public r setPreferredTextRoleFlags(int i10) {
        this.f81158t = i10;
        return this;
    }

    public r setPreferredVideoMimeType(String str) {
        return str == null ? setPreferredVideoMimeTypes(new String[0]) : setPreferredVideoMimeTypes(str);
    }

    public r setPreferredVideoMimeTypes(String... strArr) {
        this.f81150l = b5.copyOf(strArr);
        return this;
    }

    public r setPreferredVideoRoleFlags(int i10) {
        this.f81151m = i10;
        return this;
    }

    public r setSelectUndeterminedTextLanguage(boolean z10) {
        this.f81160v = z10;
        return this;
    }

    public r setTrackTypeDisabled(int i10, boolean z10) {
        if (z10) {
            this.f81164z.add(Integer.valueOf(i10));
            return this;
        }
        this.f81164z.remove(Integer.valueOf(i10));
        return this;
    }

    public r setViewportSize(int i10, int i11, boolean z10) {
        this.f81147i = i10;
        this.f81148j = i11;
        this.f81149k = z10;
        return this;
    }

    public r setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
        Point currentDisplayModeSize = n1.getCurrentDisplayModeSize(context);
        return setViewportSize(currentDisplayModeSize.x, currentDisplayModeSize.y, z10);
    }

    public r(Context context) {
        this();
        setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
        setViewportSizeToPhysicalDisplaySize(context, true);
    }
}
