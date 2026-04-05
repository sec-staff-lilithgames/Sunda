package gn;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class z1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;

    /* renamed from: a, reason: collision with root package name */
    public int f58267a;

    /* renamed from: b, reason: collision with root package name */
    public int f58268b;

    /* renamed from: c, reason: collision with root package name */
    public int f58269c;

    /* renamed from: d, reason: collision with root package name */
    public int f58270d;

    /* renamed from: e, reason: collision with root package name */
    public int f58271e;

    /* renamed from: f, reason: collision with root package name */
    public int f58272f;

    /* renamed from: g, reason: collision with root package name */
    public int f58273g;

    /* renamed from: h, reason: collision with root package name */
    public int f58274h;

    /* renamed from: i, reason: collision with root package name */
    public int f58275i;

    /* renamed from: j, reason: collision with root package name */
    public int f58276j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f58277k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f58278l;

    /* renamed from: m, reason: collision with root package name */
    public b5 f58279m;

    /* renamed from: n, reason: collision with root package name */
    public b5 f58280n;

    /* renamed from: o, reason: collision with root package name */
    public int f58281o;

    /* renamed from: p, reason: collision with root package name */
    public b5 f58282p;

    /* renamed from: q, reason: collision with root package name */
    public int f58283q;

    /* renamed from: r, reason: collision with root package name */
    public int f58284r;

    /* renamed from: s, reason: collision with root package name */
    public int f58285s;

    /* renamed from: t, reason: collision with root package name */
    public b5 f58286t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f58287u;

    /* renamed from: v, reason: collision with root package name */
    public b5 f58288v;

    /* renamed from: w, reason: collision with root package name */
    public int f58289w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f58290x;

    /* renamed from: y, reason: collision with root package name */
    public int f58291y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f58292z;

    public z1() {
        this.f58267a = Integer.MAX_VALUE;
        this.f58268b = Integer.MAX_VALUE;
        this.f58269c = Integer.MAX_VALUE;
        this.f58270d = Integer.MAX_VALUE;
        this.f58275i = Integer.MAX_VALUE;
        this.f58276j = Integer.MAX_VALUE;
        this.f58277k = true;
        this.f58278l = true;
        this.f58279m = b5.of();
        this.f58280n = b5.of();
        this.f58281o = 0;
        this.f58282p = b5.of();
        this.f58283q = 0;
        this.f58284r = Integer.MAX_VALUE;
        this.f58285s = Integer.MAX_VALUE;
        this.f58286t = b5.of();
        this.f58287u = y1.f58254d;
        this.f58288v = b5.of();
        this.f58289w = 0;
        this.f58290x = true;
        this.f58291y = 0;
        this.f58292z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    public static b5 b(String[] strArr) {
        x4 x4VarBuilder = b5.builder();
        for (String str : (String[]) io.bidmachine.media3.common.util.a.checkNotNull(strArr)) {
            x4VarBuilder.add((Object) io.bidmachine.media3.common.util.a1.normalizeLanguageCode((String) io.bidmachine.media3.common.util.a.checkNotNull(str)));
        }
        return x4VarBuilder.build();
    }

    public final void a(a2 a2Var) {
        this.f58267a = a2Var.f57746a;
        this.f58268b = a2Var.f57747b;
        this.f58269c = a2Var.f57748c;
        this.f58270d = a2Var.f57749d;
        this.f58271e = a2Var.f57750e;
        this.f58272f = a2Var.f57751f;
        this.f58273g = a2Var.f57752g;
        this.f58274h = a2Var.f57753h;
        this.f58275i = a2Var.f57754i;
        this.f58276j = a2Var.f57755j;
        this.f58277k = a2Var.f57756k;
        this.f58278l = a2Var.f57757l;
        this.f58279m = a2Var.f57758m;
        this.f58280n = a2Var.f57759n;
        this.f58281o = a2Var.f57760o;
        this.f58282p = a2Var.f57761p;
        this.f58283q = a2Var.f57762q;
        this.f58284r = a2Var.f57763r;
        this.f58285s = a2Var.f57764s;
        this.f58286t = a2Var.f57765t;
        this.f58287u = a2Var.f57766u;
        this.f58288v = a2Var.f57767v;
        this.f58289w = a2Var.f57768w;
        this.f58290x = a2Var.f57769x;
        this.f58291y = a2Var.f57770y;
        this.f58292z = a2Var.f57771z;
        this.A = a2Var.A;
        this.B = a2Var.B;
        this.C = a2Var.C;
        this.E = new HashSet(a2Var.E);
        this.D = new HashMap(a2Var.D);
    }

    public z1 addOverride(w1 w1Var) {
        this.D.put(w1Var.f58240a, w1Var);
        return this;
    }

    public a2 build() {
        return new a2(this);
    }

    public z1 clearOverride(v1 v1Var) {
        this.D.remove(v1Var);
        return this;
    }

    public z1 clearOverrides() {
        this.D.clear();
        return this;
    }

    public z1 clearOverridesOfType(int i10) {
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            if (((w1) it.next()).getType() == i10) {
                it.remove();
            }
        }
        return this;
    }

    public z1 clearVideoSizeConstraints() {
        return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public z1 clearViewportSizeConstraints() {
        return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    public z1 setAudioOffloadPreferences(y1 y1Var) {
        this.f58287u = y1Var;
        return this;
    }

    @Deprecated
    public z1 setDisabledTrackTypes(Set<Integer> set) {
        this.E.clear();
        this.E.addAll(set);
        return this;
    }

    public z1 setForceHighestSupportedBitrate(boolean z10) {
        this.C = z10;
        return this;
    }

    public z1 setForceLowestBitrate(boolean z10) {
        this.B = z10;
        return this;
    }

    public z1 setIgnoredTextSelectionFlags(int i10) {
        this.f58291y = i10;
        return this;
    }

    public z1 setMaxAudioBitrate(int i10) {
        this.f58285s = i10;
        return this;
    }

    public z1 setMaxAudioChannelCount(int i10) {
        this.f58284r = i10;
        return this;
    }

    public z1 setMaxVideoBitrate(int i10) {
        this.f58270d = i10;
        return this;
    }

    public z1 setMaxVideoFrameRate(int i10) {
        this.f58269c = i10;
        return this;
    }

    public z1 setMaxVideoSize(int i10, int i11) {
        this.f58267a = i10;
        this.f58268b = i11;
        return this;
    }

    public z1 setMaxVideoSizeSd() {
        return setMaxVideoSize(1279, 719);
    }

    public z1 setMinVideoBitrate(int i10) {
        this.f58274h = i10;
        return this;
    }

    public z1 setMinVideoFrameRate(int i10) {
        this.f58273g = i10;
        return this;
    }

    public z1 setMinVideoSize(int i10, int i11) {
        this.f58271e = i10;
        this.f58272f = i11;
        return this;
    }

    public z1 setOverrideForType(w1 w1Var) {
        clearOverridesOfType(w1Var.getType());
        this.D.put(w1Var.f58240a, w1Var);
        return this;
    }

    public z1 setPreferredAudioLanguage(String str) {
        return str == null ? setPreferredAudioLanguages(new String[0]) : setPreferredAudioLanguages(str);
    }

    public z1 setPreferredAudioLanguages(String... strArr) {
        this.f58282p = b(strArr);
        return this;
    }

    public z1 setPreferredAudioMimeType(String str) {
        return str == null ? setPreferredAudioMimeTypes(new String[0]) : setPreferredAudioMimeTypes(str);
    }

    public z1 setPreferredAudioMimeTypes(String... strArr) {
        this.f58286t = b5.copyOf(strArr);
        return this;
    }

    public z1 setPreferredAudioRoleFlags(int i10) {
        this.f58283q = i10;
        return this;
    }

    public z1 setPreferredTextLanguage(String str) {
        return str == null ? setPreferredTextLanguages(new String[0]) : setPreferredTextLanguages(str);
    }

    public z1 setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
        this.f58290x = true;
        this.f58288v = b5.of();
        this.f58289w = 0;
        return this;
    }

    public z1 setPreferredTextLanguages(String... strArr) {
        this.f58288v = b(strArr);
        this.f58290x = false;
        return this;
    }

    public z1 setPreferredTextRoleFlags(int i10) {
        this.f58289w = i10;
        this.f58290x = false;
        return this;
    }

    public z1 setPreferredVideoLanguage(String str) {
        return str == null ? setPreferredVideoLanguages(new String[0]) : setPreferredVideoLanguages(str);
    }

    public z1 setPreferredVideoLanguages(String... strArr) {
        this.f58280n = b(strArr);
        return this;
    }

    public z1 setPreferredVideoMimeType(String str) {
        return str == null ? setPreferredVideoMimeTypes(new String[0]) : setPreferredVideoMimeTypes(str);
    }

    public z1 setPreferredVideoMimeTypes(String... strArr) {
        this.f58279m = b5.copyOf(strArr);
        return this;
    }

    public z1 setPreferredVideoRoleFlags(int i10) {
        this.f58281o = i10;
        return this;
    }

    public z1 setPrioritizeImageOverVideoEnabled(boolean z10) {
        this.A = z10;
        return this;
    }

    public z1 setSelectUndeterminedTextLanguage(boolean z10) {
        this.f58292z = z10;
        return this;
    }

    public z1 setTrackTypeDisabled(int i10, boolean z10) {
        if (z10) {
            this.E.add(Integer.valueOf(i10));
            return this;
        }
        this.E.remove(Integer.valueOf(i10));
        return this;
    }

    public z1 setViewportSize(int i10, int i11, boolean z10) {
        this.f58275i = i10;
        this.f58276j = i11;
        this.f58278l = z10;
        this.f58277k = false;
        return this;
    }

    public z1 setViewportSizeToPhysicalDisplaySize(boolean z10) {
        this.f58277k = true;
        this.f58278l = z10;
        this.f58276j = Integer.MAX_VALUE;
        this.f58275i = Integer.MAX_VALUE;
        return this;
    }

    @Deprecated
    public z1 setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        return setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
    }

    @Deprecated
    public z1 setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
        return setViewportSizeToPhysicalDisplaySize(z10);
    }

    @Deprecated
    public z1(Context context) {
        this();
    }

    public z1(Bundle bundle) {
        y1 y1VarBuild;
        b5 b5VarFromBundleList;
        String str = a2.L;
        a2 a2Var = a2.F;
        this.f58267a = bundle.getInt(str, a2Var.f57746a);
        this.f58268b = bundle.getInt(a2.M, a2Var.f57747b);
        this.f58269c = bundle.getInt(a2.N, a2Var.f57748c);
        this.f58270d = bundle.getInt(a2.O, a2Var.f57749d);
        this.f58271e = bundle.getInt(a2.P, a2Var.f57750e);
        this.f58272f = bundle.getInt(a2.Q, a2Var.f57751f);
        this.f58273g = bundle.getInt(a2.R, a2Var.f57752g);
        this.f58274h = bundle.getInt(a2.S, a2Var.f57753h);
        this.f58275i = bundle.getInt(a2.T, a2Var.f57754i);
        int i10 = bundle.getInt(a2.U, a2Var.f57755j);
        this.f58276j = i10;
        this.f58277k = this.f58275i == Integer.MAX_VALUE && i10 == Integer.MAX_VALUE && bundle.getBoolean(a2.f57744m0, a2Var.f57756k);
        this.f58278l = bundle.getBoolean(a2.V, a2Var.f57757l);
        this.f58279m = b5.copyOf((String[]) mh.g1.firstNonNull(bundle.getStringArray(a2.W), new String[0]));
        this.f58280n = b5.copyOf((String[]) mh.g1.firstNonNull(bundle.getStringArray(a2.f57743l0), new String[0]));
        this.f58281o = bundle.getInt(a2.f57736e0, a2Var.f57760o);
        this.f58282p = b((String[]) mh.g1.firstNonNull(bundle.getStringArray(a2.G), new String[0]));
        this.f58283q = bundle.getInt(a2.H, a2Var.f57762q);
        this.f58284r = bundle.getInt(a2.X, a2Var.f57763r);
        this.f58285s = bundle.getInt(a2.Y, a2Var.f57764s);
        this.f58286t = b5.copyOf((String[]) mh.g1.firstNonNull(bundle.getStringArray(a2.Z), new String[0]));
        Bundle bundle2 = bundle.getBundle(a2.f57741j0);
        if (bundle2 != null) {
            y1VarBuild = y1.fromBundle(bundle2);
        } else {
            x1 x1Var = new x1();
            String str2 = a2.f57738g0;
            y1 y1Var = y1.f58254d;
            y1VarBuild = x1Var.setAudioOffloadMode(bundle.getInt(str2, y1Var.f58258a)).setIsGaplessSupportRequired(bundle.getBoolean(a2.f57739h0, y1Var.f58259b)).setIsSpeedChangeSupportRequired(bundle.getBoolean(a2.f57740i0, y1Var.f58260c)).build();
        }
        this.f58287u = y1VarBuild;
        this.f58288v = b((String[]) mh.g1.firstNonNull(bundle.getStringArray(a2.I), new String[0]));
        this.f58289w = bundle.getInt(a2.J, a2Var.f57768w);
        this.f58290x = this.f58288v.isEmpty() && this.f58289w == 0 && bundle.getBoolean(a2.f57745n0, a2Var.f57769x);
        this.f58291y = bundle.getInt(a2.f57737f0, a2Var.f57770y);
        this.f58292z = bundle.getBoolean(a2.K, a2Var.f57771z);
        this.A = bundle.getBoolean(a2.f57742k0, a2Var.A);
        this.B = bundle.getBoolean(a2.f57732a0, a2Var.B);
        this.C = bundle.getBoolean(a2.f57733b0, a2Var.C);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(a2.f57734c0);
        if (parcelableArrayList == null) {
            b5VarFromBundleList = b5.of();
        } else {
            b5VarFromBundleList = io.bidmachine.media3.common.util.f.fromBundleList(new ao.c(25), parcelableArrayList);
        }
        this.D = new HashMap();
        for (int i11 = 0; i11 < b5VarFromBundleList.size(); i11++) {
            w1 w1Var = (w1) b5VarFromBundleList.get(i11);
            this.D.put(w1Var.f58240a, w1Var);
        }
        int[] iArr = (int[]) mh.g1.firstNonNull(bundle.getIntArray(a2.f57735d0), new int[0]);
        this.E = new HashSet();
        for (int i12 : iArr) {
            this.E.add(Integer.valueOf(i12));
        }
    }
}
