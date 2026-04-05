package io.odeeo.internal.n0;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import io.odeeo.internal.b.g;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.t0.o;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.q1;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j implements io.odeeo.internal.b.g {
    public static final g.a<j> A;

    /* renamed from: y, reason: collision with root package name */
    public static final j f65003y;

    /* renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final j f65004z;

    /* renamed from: a, reason: collision with root package name */
    public final int f65005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65007c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65008d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65009e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65010f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65011g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65012h;

    /* renamed from: i, reason: collision with root package name */
    public final int f65013i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65014j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f65015k;

    /* renamed from: l, reason: collision with root package name */
    public final h1<String> f65016l;

    /* renamed from: m, reason: collision with root package name */
    public final h1<String> f65017m;

    /* renamed from: n, reason: collision with root package name */
    public final int f65018n;

    /* renamed from: o, reason: collision with root package name */
    public final int f65019o;

    /* renamed from: p, reason: collision with root package name */
    public final int f65020p;

    /* renamed from: q, reason: collision with root package name */
    public final h1<String> f65021q;

    /* renamed from: r, reason: collision with root package name */
    public final h1<String> f65022r;

    /* renamed from: s, reason: collision with root package name */
    public final int f65023s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f65024t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f65025u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f65026v;

    /* renamed from: w, reason: collision with root package name */
    public final i f65027w;

    /* renamed from: x, reason: collision with root package name */
    public final q1<Integer> f65028x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f65029a;

        /* renamed from: b, reason: collision with root package name */
        public int f65030b;

        /* renamed from: c, reason: collision with root package name */
        public int f65031c;

        /* renamed from: d, reason: collision with root package name */
        public int f65032d;

        /* renamed from: e, reason: collision with root package name */
        public int f65033e;

        /* renamed from: f, reason: collision with root package name */
        public int f65034f;

        /* renamed from: g, reason: collision with root package name */
        public int f65035g;

        /* renamed from: h, reason: collision with root package name */
        public int f65036h;

        /* renamed from: i, reason: collision with root package name */
        public int f65037i;

        /* renamed from: j, reason: collision with root package name */
        public int f65038j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f65039k;

        /* renamed from: l, reason: collision with root package name */
        public h1<String> f65040l;

        /* renamed from: m, reason: collision with root package name */
        public h1<String> f65041m;

        /* renamed from: n, reason: collision with root package name */
        public int f65042n;

        /* renamed from: o, reason: collision with root package name */
        public int f65043o;

        /* renamed from: p, reason: collision with root package name */
        public int f65044p;

        /* renamed from: q, reason: collision with root package name */
        public h1<String> f65045q;

        /* renamed from: r, reason: collision with root package name */
        public h1<String> f65046r;

        /* renamed from: s, reason: collision with root package name */
        public int f65047s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f65048t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f65049u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f65050v;

        /* renamed from: w, reason: collision with root package name */
        public i f65051w;

        /* renamed from: x, reason: collision with root package name */
        public q1<Integer> f65052x;

        @Deprecated
        public a() {
            this.f65029a = Integer.MAX_VALUE;
            this.f65030b = Integer.MAX_VALUE;
            this.f65031c = Integer.MAX_VALUE;
            this.f65032d = Integer.MAX_VALUE;
            this.f65037i = Integer.MAX_VALUE;
            this.f65038j = Integer.MAX_VALUE;
            this.f65039k = true;
            this.f65040l = h1.of();
            this.f65041m = h1.of();
            this.f65042n = 0;
            this.f65043o = Integer.MAX_VALUE;
            this.f65044p = Integer.MAX_VALUE;
            this.f65045q = h1.of();
            this.f65046r = h1.of();
            this.f65047s = 0;
            this.f65048t = false;
            this.f65049u = false;
            this.f65050v = false;
            this.f65051w = i.f64996b;
            this.f65052x = q1.of();
        }

        public j build() {
            return new j(this);
        }

        public a clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public a clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public a setDisabledTrackTypes(Set<Integer> set) {
            this.f65052x = q1.copyOf((Collection) set);
            return this;
        }

        public a setForceHighestSupportedBitrate(boolean z10) {
            this.f65050v = z10;
            return this;
        }

        public a setForceLowestBitrate(boolean z10) {
            this.f65049u = z10;
            return this;
        }

        public a setMaxAudioBitrate(int i10) {
            this.f65044p = i10;
            return this;
        }

        public a setMaxAudioChannelCount(int i10) {
            this.f65043o = i10;
            return this;
        }

        public a setMaxVideoBitrate(int i10) {
            this.f65032d = i10;
            return this;
        }

        public a setMaxVideoFrameRate(int i10) {
            this.f65031c = i10;
            return this;
        }

        public a setMaxVideoSize(int i10, int i11) {
            this.f65029a = i10;
            this.f65030b = i11;
            return this;
        }

        public a setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public a setMinVideoBitrate(int i10) {
            this.f65036h = i10;
            return this;
        }

        public a setMinVideoFrameRate(int i10) {
            this.f65035g = i10;
            return this;
        }

        public a setMinVideoSize(int i10, int i11) {
            this.f65033e = i10;
            this.f65034f = i11;
            return this;
        }

        public a setPreferredAudioLanguage(String str) {
            return str == null ? setPreferredAudioLanguages(new String[0]) : setPreferredAudioLanguages(str);
        }

        public a setPreferredAudioLanguages(String... strArr) {
            this.f65041m = a(strArr);
            return this;
        }

        public a setPreferredAudioMimeType(String str) {
            return str == null ? setPreferredAudioMimeTypes(new String[0]) : setPreferredAudioMimeTypes(str);
        }

        public a setPreferredAudioMimeTypes(String... strArr) {
            this.f65045q = h1.copyOf(strArr);
            return this;
        }

        public a setPreferredAudioRoleFlags(int i10) {
            this.f65042n = i10;
            return this;
        }

        public a setPreferredTextLanguage(String str) {
            return str == null ? setPreferredTextLanguages(new String[0]) : setPreferredTextLanguages(str);
        }

        public a setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            if (g0.f65861a >= 19) {
                a(context);
            }
            return this;
        }

        public a setPreferredTextLanguages(String... strArr) {
            this.f65046r = a(strArr);
            return this;
        }

        public a setPreferredTextRoleFlags(int i10) {
            this.f65047s = i10;
            return this;
        }

        public a setPreferredVideoMimeType(String str) {
            return str == null ? setPreferredVideoMimeTypes(new String[0]) : setPreferredVideoMimeTypes(str);
        }

        public a setPreferredVideoMimeTypes(String... strArr) {
            this.f65040l = h1.copyOf(strArr);
            return this;
        }

        public a setSelectUndeterminedTextLanguage(boolean z10) {
            this.f65048t = z10;
            return this;
        }

        public a setTrackSelectionOverrides(i iVar) {
            this.f65051w = iVar;
            return this;
        }

        public a setViewportSize(int i10, int i11, boolean z10) {
            this.f65037i = i10;
            this.f65038j = i11;
            this.f65039k = z10;
            return this;
        }

        public a setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            Point currentDisplayModeSize = g0.getCurrentDisplayModeSize(context);
            return setViewportSize(currentDisplayModeSize.x, currentDisplayModeSize.y, z10);
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "trackSelectionOverrides", "disabledTrackTypes"})
        public final void a(j jVar) {
            this.f65029a = jVar.f65005a;
            this.f65030b = jVar.f65006b;
            this.f65031c = jVar.f65007c;
            this.f65032d = jVar.f65008d;
            this.f65033e = jVar.f65009e;
            this.f65034f = jVar.f65010f;
            this.f65035g = jVar.f65011g;
            this.f65036h = jVar.f65012h;
            this.f65037i = jVar.f65013i;
            this.f65038j = jVar.f65014j;
            this.f65039k = jVar.f65015k;
            this.f65040l = jVar.f65016l;
            this.f65041m = jVar.f65017m;
            this.f65042n = jVar.f65018n;
            this.f65043o = jVar.f65019o;
            this.f65044p = jVar.f65020p;
            this.f65045q = jVar.f65021q;
            this.f65046r = jVar.f65022r;
            this.f65047s = jVar.f65023s;
            this.f65048t = jVar.f65024t;
            this.f65049u = jVar.f65025u;
            this.f65050v = jVar.f65026v;
            this.f65051w = jVar.f65027w;
            this.f65052x = jVar.f65028x;
        }

        public a b(j jVar) {
            a(jVar);
            return this;
        }

        public a(Context context) {
            this();
            setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            setViewportSizeToPhysicalDisplaySize(context, true);
        }

        public a(j jVar) {
            a(jVar);
        }

        public final void a(Context context) {
            CaptioningManager captioningManager;
            if ((g0.f65861a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f65047s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f65046r = h1.of(g0.getLocaleLanguageTag(locale));
                }
            }
        }

        public a(Bundle bundle) {
            String strB = j.b(6);
            j jVar = j.f65003y;
            this.f65029a = bundle.getInt(strB, jVar.f65005a);
            this.f65030b = bundle.getInt(j.b(7), jVar.f65006b);
            this.f65031c = bundle.getInt(j.b(8), jVar.f65007c);
            this.f65032d = bundle.getInt(j.b(9), jVar.f65008d);
            this.f65033e = bundle.getInt(j.b(10), jVar.f65009e);
            this.f65034f = bundle.getInt(j.b(11), jVar.f65010f);
            this.f65035g = bundle.getInt(j.b(12), jVar.f65011g);
            this.f65036h = bundle.getInt(j.b(13), jVar.f65012h);
            this.f65037i = bundle.getInt(j.b(14), jVar.f65013i);
            this.f65038j = bundle.getInt(j.b(15), jVar.f65014j);
            this.f65039k = bundle.getBoolean(j.b(16), jVar.f65015k);
            this.f65040l = h1.copyOf((String[]) o.firstNonNull(bundle.getStringArray(j.b(17)), new String[0]));
            this.f65041m = a((String[]) o.firstNonNull(bundle.getStringArray(j.b(1)), new String[0]));
            this.f65042n = bundle.getInt(j.b(2), jVar.f65018n);
            this.f65043o = bundle.getInt(j.b(18), jVar.f65019o);
            this.f65044p = bundle.getInt(j.b(19), jVar.f65020p);
            this.f65045q = h1.copyOf((String[]) o.firstNonNull(bundle.getStringArray(j.b(20)), new String[0]));
            this.f65046r = a((String[]) o.firstNonNull(bundle.getStringArray(j.b(3)), new String[0]));
            this.f65047s = bundle.getInt(j.b(4), jVar.f65023s);
            this.f65048t = bundle.getBoolean(j.b(5), jVar.f65024t);
            this.f65049u = bundle.getBoolean(j.b(21), jVar.f65025u);
            this.f65050v = bundle.getBoolean(j.b(22), jVar.f65026v);
            this.f65051w = (i) io.odeeo.internal.q0.c.fromNullableBundle(i.f64997c, bundle.getBundle(j.b(23)), i.f64996b);
            this.f65052x = q1.copyOf((Collection) io.odeeo.internal.w0.d.asList((int[]) o.firstNonNull(bundle.getIntArray(j.b(25)), new int[0])));
        }

        public static h1<String> a(String[] strArr) {
            h1.a aVarBuilder = h1.builder();
            for (String str : (String[]) io.odeeo.internal.q0.a.checkNotNull(strArr)) {
                aVarBuilder.add((h1.a) g0.normalizeLanguageCode((String) io.odeeo.internal.q0.a.checkNotNull(str)));
            }
            return aVarBuilder.build();
        }
    }

    static {
        j jVarBuild = new a().build();
        f65003y = jVarBuild;
        f65004z = jVarBuild;
        A = new xl.g(15);
    }

    public j(a aVar) {
        this.f65005a = aVar.f65029a;
        this.f65006b = aVar.f65030b;
        this.f65007c = aVar.f65031c;
        this.f65008d = aVar.f65032d;
        this.f65009e = aVar.f65033e;
        this.f65010f = aVar.f65034f;
        this.f65011g = aVar.f65035g;
        this.f65012h = aVar.f65036h;
        this.f65013i = aVar.f65037i;
        this.f65014j = aVar.f65038j;
        this.f65015k = aVar.f65039k;
        this.f65016l = aVar.f65040l;
        this.f65017m = aVar.f65041m;
        this.f65018n = aVar.f65042n;
        this.f65019o = aVar.f65043o;
        this.f65020p = aVar.f65044p;
        this.f65021q = aVar.f65045q;
        this.f65022r = aVar.f65046r;
        this.f65023s = aVar.f65047s;
        this.f65024t = aVar.f65048t;
        this.f65025u = aVar.f65049u;
        this.f65026v = aVar.f65050v;
        this.f65027w = aVar.f65051w;
        this.f65028x = aVar.f65052x;
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static j getDefaults(Context context) {
        return new a(context).build();
    }

    public a buildUpon() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f65005a == jVar.f65005a && this.f65006b == jVar.f65006b && this.f65007c == jVar.f65007c && this.f65008d == jVar.f65008d && this.f65009e == jVar.f65009e && this.f65010f == jVar.f65010f && this.f65011g == jVar.f65011g && this.f65012h == jVar.f65012h && this.f65015k == jVar.f65015k && this.f65013i == jVar.f65013i && this.f65014j == jVar.f65014j && this.f65016l.equals(jVar.f65016l) && this.f65017m.equals(jVar.f65017m) && this.f65018n == jVar.f65018n && this.f65019o == jVar.f65019o && this.f65020p == jVar.f65020p && this.f65021q.equals(jVar.f65021q) && this.f65022r.equals(jVar.f65022r) && this.f65023s == jVar.f65023s && this.f65024t == jVar.f65024t && this.f65025u == jVar.f65025u && this.f65026v == jVar.f65026v && this.f65027w.equals(jVar.f65027w) && this.f65028x.equals(jVar.f65028x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f65028x.hashCode() + ((this.f65027w.hashCode() + ((((((((((this.f65022r.hashCode() + ((this.f65021q.hashCode() + ((((((((this.f65017m.hashCode() + ((this.f65016l.hashCode() + ((((((((((((((((((((((this.f65005a + 31) * 31) + this.f65006b) * 31) + this.f65007c) * 31) + this.f65008d) * 31) + this.f65009e) * 31) + this.f65010f) * 31) + this.f65011g) * 31) + this.f65012h) * 31) + (this.f65015k ? 1 : 0)) * 31) + this.f65013i) * 31) + this.f65014j) * 31)) * 31)) * 31) + this.f65018n) * 31) + this.f65019o) * 31) + this.f65020p) * 31)) * 31)) * 31) + this.f65023s) * 31) + (this.f65024t ? 1 : 0)) * 31) + (this.f65025u ? 1 : 0)) * 31) + (this.f65026v ? 1 : 0)) * 31)) * 31);
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(6), this.f65005a);
        bundle.putInt(b(7), this.f65006b);
        bundle.putInt(b(8), this.f65007c);
        bundle.putInt(b(9), this.f65008d);
        bundle.putInt(b(10), this.f65009e);
        bundle.putInt(b(11), this.f65010f);
        bundle.putInt(b(12), this.f65011g);
        bundle.putInt(b(13), this.f65012h);
        bundle.putInt(b(14), this.f65013i);
        bundle.putInt(b(15), this.f65014j);
        bundle.putBoolean(b(16), this.f65015k);
        bundle.putStringArray(b(17), (String[]) this.f65016l.toArray(new String[0]));
        bundle.putStringArray(b(1), (String[]) this.f65017m.toArray(new String[0]));
        bundle.putInt(b(2), this.f65018n);
        bundle.putInt(b(18), this.f65019o);
        bundle.putInt(b(19), this.f65020p);
        bundle.putStringArray(b(20), (String[]) this.f65021q.toArray(new String[0]));
        bundle.putStringArray(b(3), (String[]) this.f65022r.toArray(new String[0]));
        bundle.putInt(b(4), this.f65023s);
        bundle.putBoolean(b(5), this.f65024t);
        bundle.putBoolean(b(21), this.f65025u);
        bundle.putBoolean(b(22), this.f65026v);
        bundle.putBundle(b(23), this.f65027w.toBundle());
        bundle.putIntArray(b(25), io.odeeo.internal.w0.d.toArray(this.f65028x));
        return bundle;
    }
}
