package io.odeeo.internal.n0;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.k0;
import io.odeeo.internal.a0.l0;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.g;
import io.odeeo.internal.b.n;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.r0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.n0.a;
import io.odeeo.internal.n0.d;
import io.odeeo.internal.n0.f;
import io.odeeo.internal.n0.i;
import io.odeeo.internal.n0.j;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.p2;
import io.odeeo.internal.u0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c extends io.odeeo.internal.n0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f64936f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final p2<Integer> f64937g = p2.from(new ni.a(23));

    /* renamed from: h, reason: collision with root package name */
    public static final p2<Integer> f64938h = p2.from(new ni.a(24));

    /* renamed from: d, reason: collision with root package name */
    public final d.b f64939d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<d> f64940e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f64941a;

        /* renamed from: b, reason: collision with root package name */
        public final String f64942b;

        /* renamed from: c, reason: collision with root package name */
        public final d f64943c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f64944d;

        /* renamed from: e, reason: collision with root package name */
        public final int f64945e;

        /* renamed from: f, reason: collision with root package name */
        public final int f64946f;

        /* renamed from: g, reason: collision with root package name */
        public final int f64947g;

        /* renamed from: h, reason: collision with root package name */
        public final int f64948h;

        /* renamed from: i, reason: collision with root package name */
        public final int f64949i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f64950j;

        /* renamed from: k, reason: collision with root package name */
        public final int f64951k;

        /* renamed from: l, reason: collision with root package name */
        public final int f64952l;

        /* renamed from: m, reason: collision with root package name */
        public final int f64953m;

        /* renamed from: n, reason: collision with root package name */
        public final int f64954n;

        public b(t tVar, d dVar, int i10) {
            int i11;
            int iA;
            int iA2;
            this.f64943c = dVar;
            this.f64942b = c.a(tVar.f62962c);
            int i12 = 0;
            this.f64944d = c.a(i10, false);
            int i13 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i13 >= dVar.f65017m.size()) {
                    iA = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA = c.a(tVar, dVar.f65017m.get(i13), false);
                    if (iA > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f64946f = i13;
            this.f64945e = iA;
            this.f64947g = Integer.bitCount(tVar.f62964e & dVar.f65018n);
            boolean z10 = true;
            this.f64950j = (tVar.f62963d & 1) != 0;
            int i14 = tVar.f62984y;
            this.f64951k = i14;
            this.f64952l = tVar.f62985z;
            int i15 = tVar.f62967h;
            this.f64953m = i15;
            if ((i15 != -1 && i15 > dVar.f65020p) || (i14 != -1 && i14 > dVar.f65019o)) {
                z10 = false;
            }
            this.f64941a = z10;
            String[] systemLanguageCodes = g0.getSystemLanguageCodes();
            int i16 = 0;
            while (true) {
                if (i16 >= systemLanguageCodes.length) {
                    iA2 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA2 = c.a(tVar, systemLanguageCodes[i16], false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f64948h = i16;
            this.f64949i = iA2;
            while (true) {
                if (i12 < dVar.f65021q.size()) {
                    String str = tVar.f62971l;
                    if (str != null && str.equals(dVar.f65021q.get(i12))) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            this.f64954n = i11;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            p2 p2VarReverse = (this.f64941a && this.f64944d) ? c.f64937g : c.f64937g.reverse();
            y yVarCompare = y.start().compareFalseFirst(this.f64944d, bVar.f64944d).compare(Integer.valueOf(this.f64946f), Integer.valueOf(bVar.f64946f), p2.natural().reverse()).compare(this.f64945e, bVar.f64945e).compare(this.f64947g, bVar.f64947g).compareFalseFirst(this.f64941a, bVar.f64941a).compare(Integer.valueOf(this.f64954n), Integer.valueOf(bVar.f64954n), p2.natural().reverse()).compare(Integer.valueOf(this.f64953m), Integer.valueOf(bVar.f64953m), this.f64943c.f65025u ? c.f64937g.reverse() : c.f64938h).compareFalseFirst(this.f64950j, bVar.f64950j).compare(Integer.valueOf(this.f64948h), Integer.valueOf(bVar.f64948h), p2.natural().reverse()).compare(this.f64949i, bVar.f64949i).compare(Integer.valueOf(this.f64951k), Integer.valueOf(bVar.f64951k), p2VarReverse).compare(Integer.valueOf(this.f64952l), Integer.valueOf(bVar.f64952l), p2VarReverse);
            Integer numValueOf = Integer.valueOf(this.f64953m);
            Integer numValueOf2 = Integer.valueOf(bVar.f64953m);
            if (!g0.areEqual(this.f64942b, bVar.f64942b)) {
                p2VarReverse = c.f64938h;
            }
            return yVarCompare.compare(numValueOf, numValueOf2, p2VarReverse).result();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.n0.c$c, reason: collision with other inner class name */
    public static final class C0625c implements Comparable<C0625c> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f64955a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f64956b;

        public C0625c(t tVar, int i10) {
            this.f64955a = (tVar.f62963d & 1) != 0;
            this.f64956b = c.a(i10, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(C0625c c0625c) {
            return y.start().compareFalseFirst(this.f64956b, c0625c.f64956b).compareFalseFirst(this.f64955a, c0625c.f64955a).result();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends j {
        public static final d O;

        @Deprecated
        public static final d P;
        public static final g.a<d> Q;
        public final int B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final SparseArray<Map<l0, f>> M;
        public final SparseBooleanArray N;

        static {
            d dVarBuild = new e().build();
            O = dVarBuild;
            P = dVarBuild;
            Q = new xl.g(11);
        }

        public static d getDefaults(Context context) {
            return new e(context).build();
        }

        @Override // io.odeeo.internal.n0.j
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.B == dVar.B && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && a(this.N, dVar.N) && a(this.M, dVar.M)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean getRendererDisabled(int i10) {
            return this.N.get(i10);
        }

        @Deprecated
        public final f getSelectionOverride(int i10, l0 l0Var) {
            Map<l0, f> map = this.M.get(i10);
            if (map != null) {
                return map.get(l0Var);
            }
            return null;
        }

        @Deprecated
        public final boolean hasSelectionOverride(int i10, l0 l0Var) {
            Map<l0, f> map = this.M.get(i10);
            return map != null && map.containsKey(l0Var);
        }

        @Override // io.odeeo.internal.n0.j
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.B) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
        }

        @Override // io.odeeo.internal.n0.j, io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(b(1000), this.C);
            bundle.putBoolean(b(1001), this.D);
            bundle.putBoolean(b(1002), this.E);
            bundle.putBoolean(b(IronSourceError.AUCTION_ERROR_DECRYPTION), this.F);
            bundle.putBoolean(b(1004), this.G);
            bundle.putBoolean(b(1005), this.H);
            bundle.putBoolean(b(1006), this.I);
            bundle.putInt(b(1007), this.B);
            bundle.putBoolean(b(1008), this.J);
            bundle.putBoolean(b(1009), this.K);
            bundle.putBoolean(b(1010), this.L);
            a(bundle, this.M);
            bundle.putIntArray(b(C3227g4.f36756j), a(this.N));
            return bundle;
        }

        public d(e eVar) {
            super(eVar);
            this.C = eVar.f64957y;
            this.D = eVar.f64958z;
            this.E = eVar.A;
            this.F = eVar.B;
            this.G = eVar.C;
            this.H = eVar.D;
            this.I = eVar.E;
            this.B = eVar.F;
            this.J = eVar.G;
            this.K = eVar.H;
            this.L = eVar.I;
            this.M = eVar.J;
            this.N = eVar.K;
        }

        public static void a(Bundle bundle, SparseArray<Map<l0, f>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                for (Map.Entry<l0, f> entry : sparseArray.valueAt(i10).entrySet()) {
                    f value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(b(1011), io.odeeo.internal.w0.d.toArray(arrayList));
                bundle.putParcelableArrayList(b(TTAdConstant.IMAGE_MODE_1012), io.odeeo.internal.q0.c.toBundleArrayList(arrayList2));
                bundle.putSparseParcelableArray(b(C3227g4.f36755i), io.odeeo.internal.q0.c.toBundleSparseArray(sparseArray2));
            }
        }

        @Override // io.odeeo.internal.n0.j
        public e buildUpon() {
            return new e(this);
        }

        public static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public static int[] a(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        public static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean a(SparseArray<Map<l0, f>> sparseArray, SparseArray<Map<l0, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !a(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean a(Map<l0, f> map, Map<l0, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<l0, f> entry : map.entrySet()) {
                l0 key = entry.getKey();
                if (!map2.containsKey(key) || !g0.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends j.a {
        public boolean A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public int F;
        public boolean G;
        public boolean H;
        public boolean I;
        public final SparseArray<Map<l0, f>> J;
        public final SparseBooleanArray K;

        /* renamed from: y, reason: collision with root package name */
        public boolean f64957y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f64958z;

        @Deprecated
        public final e clearSelectionOverride(int i10, l0 l0Var) {
            Map<l0, f> map = this.J.get(i10);
            if (map != null && map.containsKey(l0Var)) {
                map.remove(l0Var);
                if (map.isEmpty()) {
                    this.J.remove(i10);
                }
            }
            return this;
        }

        @Deprecated
        public final e clearSelectionOverrides(int i10) {
            Map<l0, f> map = this.J.get(i10);
            if (map != null && !map.isEmpty()) {
                this.J.remove(i10);
            }
            return this;
        }

        public e setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
            this.E = z10;
            return this;
        }

        public e setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
            this.C = z10;
            return this;
        }

        public e setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
            this.D = z10;
            return this;
        }

        public e setAllowMultipleAdaptiveSelections(boolean z10) {
            this.I = z10;
            return this;
        }

        public e setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
            this.f64958z = z10;
            return this;
        }

        public e setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
            this.A = z10;
            return this;
        }

        public e setDisabledTextTrackSelectionFlags(int i10) {
            this.F = i10;
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public /* bridge */ /* synthetic */ j.a setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        public e setExceedAudioConstraintsIfNecessary(boolean z10) {
            this.B = z10;
            return this;
        }

        public e setExceedRendererCapabilitiesIfNecessary(boolean z10) {
            this.G = z10;
            return this;
        }

        public e setExceedVideoConstraintsIfNecessary(boolean z10) {
            this.f64957y = z10;
            return this;
        }

        public final e setRendererDisabled(int i10, boolean z10) {
            if (this.K.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.K.put(i10, true);
                return this;
            }
            this.K.delete(i10);
            return this;
        }

        @Deprecated
        public final e setSelectionOverride(int i10, l0 l0Var, f fVar) {
            Map<l0, f> map = this.J.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.J.put(i10, map);
            }
            if (map.containsKey(l0Var) && g0.areEqual(map.get(l0Var), fVar)) {
                return this;
            }
            map.put(l0Var, fVar);
            return this;
        }

        public e setTunnelingEnabled(boolean z10) {
            this.H = z10;
            return this;
        }

        public final void a() {
            this.f64957y = true;
            this.f64958z = false;
            this.A = true;
            this.B = true;
            this.C = false;
            this.D = false;
            this.E = false;
            this.F = 0;
            this.G = true;
            this.H = false;
            this.I = true;
        }

        @Override // io.odeeo.internal.n0.j.a
        public d build() {
            return new d(this);
        }

        public e c(j jVar) {
            super.b(jVar);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e clearVideoSizeConstraints() {
            super.clearVideoSizeConstraints();
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e clearViewportSizeConstraints() {
            super.clearViewportSizeConstraints();
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setDisabledTrackTypes(Set<Integer> set) {
            super.setDisabledTrackTypes(set);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setForceHighestSupportedBitrate(boolean z10) {
            super.setForceHighestSupportedBitrate(z10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setForceLowestBitrate(boolean z10) {
            super.setForceLowestBitrate(z10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMaxAudioBitrate(int i10) {
            super.setMaxAudioBitrate(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMaxAudioChannelCount(int i10) {
            super.setMaxAudioChannelCount(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMaxVideoBitrate(int i10) {
            super.setMaxVideoBitrate(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMaxVideoFrameRate(int i10) {
            super.setMaxVideoFrameRate(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMaxVideoSize(int i10, int i11) {
            super.setMaxVideoSize(i10, i11);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMaxVideoSizeSd() {
            super.setMaxVideoSizeSd();
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMinVideoBitrate(int i10) {
            super.setMinVideoBitrate(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMinVideoFrameRate(int i10) {
            super.setMinVideoFrameRate(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setMinVideoSize(int i10, int i11) {
            super.setMinVideoSize(i10, i11);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredAudioLanguage(String str) {
            super.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredAudioLanguages(String... strArr) {
            super.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredAudioMimeType(String str) {
            super.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredAudioMimeTypes(String... strArr) {
            super.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredAudioRoleFlags(int i10) {
            super.setPreferredAudioRoleFlags(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredTextLanguage(String str) {
            super.setPreferredTextLanguage(str);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredTextLanguages(String... strArr) {
            super.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredTextRoleFlags(int i10) {
            super.setPreferredTextRoleFlags(i10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredVideoMimeType(String str) {
            super.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setPreferredVideoMimeTypes(String... strArr) {
            super.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setSelectUndeterminedTextLanguage(boolean z10) {
            super.setSelectUndeterminedTextLanguage(z10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setTrackSelectionOverrides(i iVar) {
            super.setTrackSelectionOverrides(iVar);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setViewportSize(int i10, int i11, boolean z10) {
            super.setViewportSize(i10, i11, z10);
            return this;
        }

        @Override // io.odeeo.internal.n0.j.a
        public e setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            super.setViewportSizeToPhysicalDisplaySize(context, z10);
            return this;
        }

        @Deprecated
        public e() {
            this.J = new SparseArray<>();
            this.K = new SparseBooleanArray();
            a();
        }

        @Deprecated
        public final e clearSelectionOverrides() {
            if (this.J.size() == 0) {
                return this;
            }
            this.J.clear();
            return this;
        }

        public e(Context context) {
            super(context);
            this.J = new SparseArray<>();
            this.K = new SparseBooleanArray();
            a();
        }

        public e(d dVar) {
            super(dVar);
            this.F = dVar.B;
            this.f64957y = dVar.C;
            this.f64958z = dVar.D;
            this.A = dVar.E;
            this.B = dVar.F;
            this.C = dVar.G;
            this.D = dVar.H;
            this.E = dVar.I;
            this.G = dVar.J;
            this.H = dVar.K;
            this.I = dVar.L;
            this.J = a((SparseArray<Map<l0, f>>) dVar.M);
            this.K = dVar.N.clone();
        }

        public static SparseArray<Map<l0, f>> a(SparseArray<Map<l0, f>> sparseArray) {
            SparseArray<Map<l0, f>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        public final void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(d.b(1011));
            List listFromBundleNullableList = io.odeeo.internal.q0.c.fromBundleNullableList(l0.f62400e, bundle.getParcelableArrayList(d.b(TTAdConstant.IMAGE_MODE_1012)), h1.of());
            SparseArray sparseArrayFromBundleNullableSparseArray = io.odeeo.internal.q0.c.fromBundleNullableSparseArray(f.f64959e, bundle.getSparseParcelableArray(d.b(C3227g4.f36755i)), new SparseArray());
            if (intArray == null || intArray.length != listFromBundleNullableList.size()) {
                return;
            }
            for (int i10 = 0; i10 < intArray.length; i10++) {
                setSelectionOverride(intArray[i10], (l0) listFromBundleNullableList.get(i10), (f) sparseArrayFromBundleNullableSparseArray.get(i10));
            }
        }

        public e(Bundle bundle) {
            super(bundle);
            d dVar = d.O;
            setExceedVideoConstraintsIfNecessary(bundle.getBoolean(d.b(1000), dVar.C));
            setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(d.b(1001), dVar.D));
            setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(d.b(1002), dVar.E));
            setExceedAudioConstraintsIfNecessary(bundle.getBoolean(d.b(IronSourceError.AUCTION_ERROR_DECRYPTION), dVar.F));
            setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(d.b(1004), dVar.G));
            setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(d.b(1005), dVar.H));
            setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(d.b(1006), dVar.I));
            setDisabledTextTrackSelectionFlags(bundle.getInt(d.b(1007), dVar.B));
            setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(d.b(1008), dVar.J));
            setTunnelingEnabled(bundle.getBoolean(d.b(1009), dVar.K));
            setAllowMultipleAdaptiveSelections(bundle.getBoolean(d.b(1010), dVar.L));
            this.J = new SparseArray<>();
            a(bundle);
            this.K = a(bundle.getIntArray(d.b(C3227g4.f36756j)));
        }

        public final SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i10 : iArr) {
                sparseBooleanArray.append(i10, true);
            }
            return sparseBooleanArray;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements io.odeeo.internal.b.g {

        /* renamed from: e, reason: collision with root package name */
        public static final g.a<f> f64959e = new xl.g(12);

        /* renamed from: a, reason: collision with root package name */
        public final int f64960a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f64961b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64962c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64963d;

        public f(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public static /* synthetic */ f a(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i11 = bundle.getInt(a(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            io.odeeo.internal.q0.a.checkArgument(z10);
            io.odeeo.internal.q0.a.checkNotNull(intArray);
            return new f(i10, intArray, i11);
        }

        public boolean containsTrack(int i10) {
            for (int i11 : this.f64961b) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f64960a == fVar.f64960a && Arrays.equals(this.f64961b, fVar.f64961b) && this.f64963d == fVar.f64963d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f64961b) + (this.f64960a * 31)) * 31) + this.f64963d;
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(a(0), this.f64960a);
            bundle.putIntArray(a(1), this.f64961b);
            bundle.putInt(a(2), this.f64963d);
            return bundle;
        }

        public f(int i10, int[] iArr, int i11) {
            this.f64960a = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f64961b = iArrCopyOf;
            this.f64962c = iArr.length;
            this.f64963d = i11;
            Arrays.sort(iArrCopyOf);
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements Comparable<g> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f64964a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f64965b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f64966c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f64967d;

        /* renamed from: e, reason: collision with root package name */
        public final int f64968e;

        /* renamed from: f, reason: collision with root package name */
        public final int f64969f;

        /* renamed from: g, reason: collision with root package name */
        public final int f64970g;

        /* renamed from: h, reason: collision with root package name */
        public final int f64971h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f64972i;

        public g(t tVar, d dVar, int i10, String str) {
            int iA;
            boolean z10 = false;
            this.f64965b = c.a(i10, false);
            int i11 = tVar.f62963d & (~dVar.B);
            this.f64966c = (i11 & 1) != 0;
            this.f64967d = (i11 & 2) != 0;
            h1<String> h1VarOf = dVar.f65022r.isEmpty() ? h1.of("") : dVar.f65022r;
            int i12 = 0;
            while (true) {
                if (i12 >= h1VarOf.size()) {
                    i12 = Integer.MAX_VALUE;
                    iA = 0;
                    break;
                } else {
                    iA = c.a(tVar, h1VarOf.get(i12), dVar.f65024t);
                    if (iA > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f64968e = i12;
            this.f64969f = iA;
            int iBitCount = Integer.bitCount(tVar.f62964e & dVar.f65023s);
            this.f64970g = iBitCount;
            this.f64972i = (tVar.f62964e & 1088) != 0;
            int iA2 = c.a(tVar, str, c.a(str) == null);
            this.f64971h = iA2;
            if (iA > 0 || ((dVar.f65022r.isEmpty() && iBitCount > 0) || this.f64966c || (this.f64967d && iA2 > 0))) {
                z10 = true;
            }
            this.f64964a = z10;
        }

        @Override // java.lang.Comparable
        public int compareTo(g gVar) {
            y yVarCompare = y.start().compareFalseFirst(this.f64965b, gVar.f64965b).compare(Integer.valueOf(this.f64968e), Integer.valueOf(gVar.f64968e), p2.natural().reverse()).compare(this.f64969f, gVar.f64969f).compare(this.f64970g, gVar.f64970g).compareFalseFirst(this.f64966c, gVar.f64966c).compare(Boolean.valueOf(this.f64967d), Boolean.valueOf(gVar.f64967d), this.f64969f == 0 ? p2.natural() : p2.natural().reverse()).compare(this.f64971h, gVar.f64971h);
            if (this.f64970g == 0) {
                yVarCompare = yVarCompare.compareTrueFirst(this.f64972i, gVar.f64972i);
            }
            return yVarCompare.result();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h implements Comparable<h> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f64973a;

        /* renamed from: b, reason: collision with root package name */
        public final d f64974b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f64975c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f64976d;

        /* renamed from: e, reason: collision with root package name */
        public final int f64977e;

        /* renamed from: f, reason: collision with root package name */
        public final int f64978f;

        /* renamed from: g, reason: collision with root package name */
        public final int f64979g;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(io.odeeo.internal.b.t r7, io.odeeo.internal.n0.c.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f64974b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f62976q
                if (r4 == r3) goto L14
                int r5 = r8.f65005a
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f62977r
                if (r4 == r3) goto L1c
                int r5 = r8.f65006b
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f62978s
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f65007c
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f62967h
                if (r4 == r3) goto L31
                int r5 = r8.f65008d
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f64973a = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f62976q
                if (r10 == r3) goto L40
                int r4 = r8.f65009e
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f62977r
                if (r10 == r3) goto L48
                int r4 = r8.f65010f
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f62978s
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f65011g
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f62967h
                if (r10 == r3) goto L5f
                int r0 = r8.f65012h
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f64975c = r1
                boolean r9 = io.odeeo.internal.n0.c.a(r9, r2)
                r6.f64976d = r9
                int r9 = r7.f62967h
                r6.f64977e = r9
                int r9 = r7.getPixelCount()
                r6.f64978f = r9
            L71:
                io.odeeo.internal.u0.h1<java.lang.String> r9 = r8.f65016l
                int r9 = r9.size()
                if (r2 >= r9) goto L8d
                java.lang.String r9 = r7.f62971l
                if (r9 == 0) goto L8a
                io.odeeo.internal.u0.h1<java.lang.String> r10 = r8.f65016l
                java.lang.Object r10 = r10.get(r2)
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L8a
                goto L90
            L8a:
                int r2 = r2 + 1
                goto L71
            L8d:
                r2 = 2147483647(0x7fffffff, float:NaN)
            L90:
                r6.f64979g = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.n0.c.h.<init>(io.odeeo.internal.b.t, io.odeeo.internal.n0.c$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        public int compareTo(h hVar) {
            p2 p2VarReverse = (this.f64973a && this.f64976d) ? c.f64937g : c.f64937g.reverse();
            return y.start().compareFalseFirst(this.f64976d, hVar.f64976d).compareFalseFirst(this.f64973a, hVar.f64973a).compareFalseFirst(this.f64975c, hVar.f64975c).compare(Integer.valueOf(this.f64979g), Integer.valueOf(hVar.f64979g), p2.natural().reverse()).compare(Integer.valueOf(this.f64977e), Integer.valueOf(hVar.f64977e), this.f64974b.f65025u ? c.f64937g.reverse() : c.f64938h).compare(Integer.valueOf(this.f64978f), Integer.valueOf(hVar.f64978f), p2VarReverse).compare(Integer.valueOf(this.f64977e), Integer.valueOf(hVar.f64977e), p2VarReverse).result();
        }
    }

    @Deprecated
    public c() {
        this(d.O, new a.b());
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public e buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // io.odeeo.internal.n0.k
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // io.odeeo.internal.n0.k
    public void setParameters(j jVar) {
        if (jVar instanceof d) {
            a((d) jVar);
        }
        a(new e(this.f64940e.get()).c(jVar).build());
    }

    @Deprecated
    public c(d.b bVar) {
        this(d.O, bVar);
    }

    public final boolean b(f.a aVar, d dVar, int i10) {
        return dVar.hasSelectionOverride(i10, aVar.getTrackGroups(i10));
    }

    public final boolean c(f.a aVar, d dVar, int i10) {
        return dVar.getRendererDisabled(i10) || dVar.f65028x.contains(Integer.valueOf(aVar.getRendererType(i10)));
    }

    @Override // io.odeeo.internal.n0.k
    public d getParameters() {
        return this.f64940e.get();
    }

    public c(Context context) {
        this(context, new a.b());
    }

    public c(Context context, d.b bVar) {
        this(d.getDefaults(context), bVar);
    }

    public final void a(d dVar) {
        io.odeeo.internal.q0.a.checkNotNull(dVar);
        if (this.f64940e.getAndSet(dVar).equals(dVar)) {
            return;
        }
        b();
    }

    public d.a b(l0 l0Var, int[][] iArr, int i10, d dVar, boolean z10) throws n {
        d.a aVarA = (dVar.f65026v || dVar.f65025u || !z10) ? null : a(l0Var, iArr, i10, dVar);
        return aVarA == null ? a(l0Var, iArr, dVar) : aVarA;
    }

    public c(d dVar, d.b bVar) {
        this.f64939d = bVar;
        this.f64940e = new AtomicReference<>(dVar);
    }

    public void setParameters(e eVar) {
        a(eVar.build());
    }

    public static int b(k0 k0Var, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int iIntValue = list.get(i20).intValue();
            if (a(k0Var.getFormat(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    @Override // io.odeeo.internal.n0.f
    public final Pair<r0[], io.odeeo.internal.n0.d[]> a(f.a aVar, int[][][] iArr, int[] iArr2, t.a aVar2, y0 y0Var) throws n {
        d dVar = this.f64940e.get();
        int rendererCount = aVar.getRendererCount();
        d.a[] aVarArrA = a(aVar, iArr, iArr2, dVar);
        SparseArray<Pair<i.c, Integer>> sparseArrayA = a(aVar, dVar);
        for (int i10 = 0; i10 < sparseArrayA.size(); i10++) {
            Pair<i.c, Integer> pairValueAt = sparseArrayA.valueAt(i10);
            a(aVar, aVarArrA, sparseArrayA.keyAt(i10), (i.c) pairValueAt.first, ((Integer) pairValueAt.second).intValue());
        }
        for (int i11 = 0; i11 < rendererCount; i11++) {
            if (b(aVar, dVar, i11)) {
                aVarArrA[i11] = a(aVar, dVar, i11);
            }
        }
        for (int i12 = 0; i12 < rendererCount; i12++) {
            if (c(aVar, dVar, i12)) {
                aVarArrA[i12] = null;
            }
        }
        io.odeeo.internal.n0.d[] dVarArrCreateTrackSelections = this.f64939d.createTrackSelections(aVarArrA, a(), aVar2, y0Var);
        r0[] r0VarArr = new r0[rendererCount];
        for (int i13 = 0; i13 < rendererCount; i13++) {
            r0VarArr[i13] = (dVar.getRendererDisabled(i13) || dVar.f65028x.contains(Integer.valueOf(aVar.getRendererType(i13))) || (aVar.getRendererType(i13) != -2 && dVarArrCreateTrackSelections[i13] == null)) ? null : r0.f62957b;
        }
        if (dVar.K) {
            a(aVar, iArr, r0VarArr, dVarArrCreateTrackSelections);
        }
        return Pair.create(r0VarArr, dVarArrCreateTrackSelections);
    }

    public final d.a a(f.a aVar, d dVar, int i10) {
        l0 trackGroups = aVar.getTrackGroups(i10);
        f selectionOverride = dVar.getSelectionOverride(i10, trackGroups);
        if (selectionOverride == null) {
            return null;
        }
        return new d.a(trackGroups.get(selectionOverride.f64960a), selectionOverride.f64961b, selectionOverride.f64963d);
    }

    public final SparseArray<Pair<i.c, Integer>> a(f.a aVar, d dVar) {
        SparseArray<Pair<i.c, Integer>> sparseArray = new SparseArray<>();
        int rendererCount = aVar.getRendererCount();
        for (int i10 = 0; i10 < rendererCount; i10++) {
            l0 trackGroups = aVar.getTrackGroups(i10);
            for (int i11 = 0; i11 < trackGroups.f62401a; i11++) {
                a(sparseArray, dVar.f65027w.getOverride(trackGroups.get(i11)), i10);
            }
        }
        l0 unmappedTrackGroups = aVar.getUnmappedTrackGroups();
        for (int i12 = 0; i12 < unmappedTrackGroups.f62401a; i12++) {
            a(sparseArray, dVar.f65027w.getOverride(unmappedTrackGroups.get(i12)), -1);
        }
        return sparseArray;
    }

    public final void a(SparseArray<Pair<i.c, Integer>> sparseArray, i.c cVar, int i10) {
        if (cVar == null) {
            return;
        }
        int trackType = cVar.getTrackType();
        Pair<i.c, Integer> pair = sparseArray.get(trackType);
        if (pair == null || ((i.c) pair.first).f65002b.isEmpty()) {
            sparseArray.put(trackType, Pair.create(cVar, Integer.valueOf(i10)));
        }
    }

    public final void a(f.a aVar, d.a[] aVarArr, int i10, i.c cVar, int i11) {
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            if (i11 == i12) {
                aVarArr[i12] = new d.a(cVar.f65001a, io.odeeo.internal.w0.d.toArray(cVar.f65002b));
            } else if (aVar.getRendererType(i12) == i10) {
                aVarArr[i12] = null;
            }
        }
    }

    public d.a[] a(f.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws n {
        b bVar;
        String str;
        int i10;
        b bVar2;
        int rendererCount = aVar.getRendererCount();
        d.a[] aVarArr = new d.a[rendererCount];
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= rendererCount) {
                break;
            }
            if (2 == aVar.getRendererType(i11)) {
                if (!z10) {
                    d.a aVarB = b(aVar.getTrackGroups(i11), iArr[i11], iArr2[i11], dVar, true);
                    aVarArr[i11] = aVarB;
                    z10 = aVarB != null;
                }
                z11 |= aVar.getTrackGroups(i11).f62401a > 0;
            }
            i11++;
        }
        int i12 = -1;
        b bVar3 = null;
        String str2 = null;
        int i13 = 0;
        while (i13 < rendererCount) {
            if (1 == aVar.getRendererType(i13)) {
                bVar = bVar3;
                i10 = i12;
                str = str2;
                Pair<d.a, b> pairA = a(aVar.getTrackGroups(i13), iArr[i13], iArr2[i13], dVar, dVar.L || !z11);
                if (pairA != null && (bVar == null || ((b) pairA.second).compareTo(bVar) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    d.a aVar2 = (d.a) pairA.first;
                    aVarArr[i13] = aVar2;
                    String str3 = aVar2.f64980a.getFormat(aVar2.f64981b[0]).f62962c;
                    bVar2 = (b) pairA.second;
                    str = str3;
                    i12 = i13;
                }
                i13++;
                bVar3 = bVar2;
                str2 = str;
            } else {
                bVar = bVar3;
                str = str2;
                i10 = i12;
            }
            bVar2 = bVar;
            i12 = i10;
            i13++;
            bVar3 = bVar2;
            str2 = str;
        }
        String str4 = str2;
        int i14 = -1;
        g gVar = null;
        for (int i15 = 0; i15 < rendererCount; i15++) {
            int rendererType = aVar.getRendererType(i15);
            if (rendererType != 1 && rendererType != 2) {
                if (rendererType != 3) {
                    aVarArr[i15] = a(rendererType, aVar.getTrackGroups(i15), iArr[i15], dVar);
                } else {
                    Pair<d.a, g> pairA2 = a(aVar.getTrackGroups(i15), iArr[i15], dVar, str4);
                    if (pairA2 != null && (gVar == null || ((g) pairA2.second).compareTo(gVar) > 0)) {
                        if (i14 != -1) {
                            aVarArr[i14] = null;
                        }
                        aVarArr[i15] = (d.a) pairA2.first;
                        gVar = (g) pairA2.second;
                        i14 = i15;
                    }
                }
            }
        }
        return aVarArr;
    }

    public static d.a a(l0 l0Var, int[][] iArr, int i10, d dVar) {
        l0 l0Var2 = l0Var;
        int i11 = dVar.E ? 24 : 16;
        boolean z10 = dVar.D && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < l0Var2.f62401a) {
            k0 k0Var = l0Var2.get(i12);
            int[] iArrA = a(k0Var, iArr[i12], z10, i11, dVar.f65005a, dVar.f65006b, dVar.f65007c, dVar.f65008d, dVar.f65009e, dVar.f65010f, dVar.f65011g, dVar.f65012h, dVar.f65013i, dVar.f65014j, dVar.f65015k);
            if (iArrA.length > 0) {
                return new d.a(k0Var, iArrA);
            }
            i12++;
            l0Var2 = l0Var;
        }
        return null;
    }

    public static int[] a(k0 k0Var, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        k0 k0Var2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int[] iArr2;
        int i30;
        int i31;
        HashSet hashSet;
        k0 k0Var3 = k0Var;
        if (k0Var3.f62395a < 2) {
            return f64936f;
        }
        List<Integer> listA = a(k0Var3, i19, i20, z11);
        if (listA.size() < 2) {
            return f64936f;
        }
        if (z10) {
            str = null;
            k0Var2 = k0Var;
            i21 = i10;
            i22 = i11;
            i23 = i12;
            i24 = i13;
            i25 = i14;
            i26 = i15;
            i27 = i16;
            i28 = i17;
            i29 = i18;
            iArr2 = iArr;
        } else {
            HashSet hashSet2 = new HashSet();
            int i32 = 0;
            String str2 = null;
            int i33 = 0;
            while (i33 < listA.size()) {
                String str3 = k0Var3.getFormat(listA.get(i33).intValue()).f62971l;
                if (hashSet2.add(str3)) {
                    i30 = i33;
                    i31 = i32;
                    hashSet = hashSet2;
                    int iB = b(k0Var3, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, listA);
                    if (iB > i31) {
                        str2 = str3;
                        i32 = iB;
                    }
                    i33 = i30 + 1;
                    k0Var3 = k0Var;
                    hashSet2 = hashSet;
                } else {
                    i30 = i33;
                    i31 = i32;
                    hashSet = hashSet2;
                }
                i32 = i31;
                i33 = i30 + 1;
                k0Var3 = k0Var;
                hashSet2 = hashSet;
            }
            str = str2;
            k0Var2 = k0Var;
            iArr2 = iArr;
            i21 = i10;
            i22 = i11;
            i23 = i12;
            i24 = i13;
            i25 = i14;
            i26 = i15;
            i27 = i16;
            i28 = i17;
            i29 = i18;
        }
        a(k0Var2, iArr2, i21, str, i22, i23, i24, i25, i26, i27, i28, i29, listA);
        return listA.size() < 2 ? f64936f : io.odeeo.internal.w0.d.toArray(listA);
    }

    public static void a(k0 k0Var, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!a(k0Var.getFormat(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    public static boolean a(io.odeeo.internal.b.t tVar, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        int i21;
        int i22;
        if ((tVar.f62964e & 16384) == 0 && a(i10, false) && (i10 & i11) != 0 && ((str == null || g0.areEqual(tVar.f62971l, str)) && (((i20 = tVar.f62976q) == -1 || (i16 <= i20 && i20 <= i12)) && ((i21 = tVar.f62977r) == -1 || (i17 <= i21 && i21 <= i13))))) {
            float f10 = tVar.f62978s;
            if ((f10 == -1.0f || (i18 <= f10 && f10 <= i14)) && (i22 = tVar.f62967h) != -1 && i19 <= i22 && i22 <= i15) {
                return true;
            }
        }
        return false;
    }

    public static d.a a(l0 l0Var, int[][] iArr, d dVar) {
        int i10 = -1;
        k0 k0Var = null;
        h hVar = null;
        for (int i11 = 0; i11 < l0Var.f62401a; i11++) {
            k0 k0Var2 = l0Var.get(i11);
            List<Integer> listA = a(k0Var2, dVar.f65013i, dVar.f65014j, dVar.f65015k);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < k0Var2.f62395a; i12++) {
                io.odeeo.internal.b.t format = k0Var2.getFormat(i12);
                if ((format.f62964e & 16384) == 0 && a(iArr2[i12], dVar.J)) {
                    h hVar2 = new h(format, dVar, iArr2[i12], listA.contains(Integer.valueOf(i12)));
                    if ((hVar2.f64973a || dVar.C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        k0Var = k0Var2;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (k0Var == null) {
            return null;
        }
        return new d.a(k0Var, i10);
    }

    public Pair<d.a, b> a(l0 l0Var, int[][] iArr, int i10, d dVar, boolean z10) throws n {
        d.a aVar = null;
        int i11 = -1;
        int i12 = -1;
        b bVar = null;
        for (int i13 = 0; i13 < l0Var.f62401a; i13++) {
            k0 k0Var = l0Var.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < k0Var.f62395a; i14++) {
                if (a(iArr2[i14], dVar.J)) {
                    b bVar2 = new b(k0Var.getFormat(i14), dVar, iArr2[i14]);
                    if ((bVar2.f64941a || dVar.F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        k0 k0Var2 = l0Var.get(i11);
        if (!dVar.f65026v && !dVar.f65025u && z10) {
            int[] iArrA = a(k0Var2, iArr[i11], i12, dVar.f65020p, dVar.G, dVar.H, dVar.I);
            if (iArrA.length > 1) {
                aVar = new d.a(k0Var2, iArrA);
            }
        }
        if (aVar == null) {
            aVar = new d.a(k0Var2, i12);
        }
        return Pair.create(aVar, (b) io.odeeo.internal.q0.a.checkNotNull(bVar));
    }

    public static int[] a(k0 k0Var, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        io.odeeo.internal.b.t format = k0Var.getFormat(i10);
        int[] iArr2 = new int[k0Var.f62395a];
        int i12 = 0;
        for (int i13 = 0; i13 < k0Var.f62395a; i13++) {
            if (i13 == i10 || a(k0Var.getFormat(i13), iArr[i13], format, i11, z10, z11, z12)) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return Arrays.copyOf(iArr2, i12);
    }

    public static boolean a(io.odeeo.internal.b.t tVar, int i10, io.odeeo.internal.b.t tVar2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        String str;
        int i13;
        if (a(i10, false) && (i12 = tVar.f62967h) != -1 && i12 <= i11 && ((z12 || ((i13 = tVar.f62984y) != -1 && i13 == tVar2.f62984y)) && (z10 || ((str = tVar.f62971l) != null && TextUtils.equals(str, tVar2.f62971l))))) {
            if (z11) {
                return true;
            }
            int i14 = tVar.f62985z;
            if (i14 != -1 && i14 == tVar2.f62985z) {
                return true;
            }
        }
        return false;
    }

    public Pair<d.a, g> a(l0 l0Var, int[][] iArr, d dVar, String str) throws n {
        int i10 = -1;
        k0 k0Var = null;
        g gVar = null;
        for (int i11 = 0; i11 < l0Var.f62401a; i11++) {
            k0 k0Var2 = l0Var.get(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < k0Var2.f62395a; i12++) {
                if (a(iArr2[i12], dVar.J)) {
                    g gVar2 = new g(k0Var2.getFormat(i12), dVar, iArr2[i12], str);
                    if (gVar2.f64964a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        k0Var = k0Var2;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (k0Var == null) {
            return null;
        }
        return Pair.create(new d.a(k0Var, i10), (g) io.odeeo.internal.q0.a.checkNotNull(gVar));
    }

    public d.a a(int i10, l0 l0Var, int[][] iArr, d dVar) throws n {
        k0 k0Var = null;
        C0625c c0625c = null;
        int i11 = 0;
        for (int i12 = 0; i12 < l0Var.f62401a; i12++) {
            k0 k0Var2 = l0Var.get(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < k0Var2.f62395a; i13++) {
                if (a(iArr2[i13], dVar.J)) {
                    C0625c c0625c2 = new C0625c(k0Var2.getFormat(i13), iArr2[i13]);
                    if (c0625c == null || c0625c2.compareTo(c0625c) > 0) {
                        k0Var = k0Var2;
                        i11 = i13;
                        c0625c = c0625c2;
                    }
                }
            }
        }
        if (k0Var == null) {
            return null;
        }
        return new d.a(k0Var, i11);
    }

    public static void a(f.a aVar, int[][][] iArr, r0[] r0VarArr, io.odeeo.internal.n0.d[] dVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.getRendererCount(); i12++) {
            int rendererType = aVar.getRendererType(i12);
            io.odeeo.internal.n0.d dVar = dVarArr[i12];
            if ((rendererType == 1 || rendererType == 2) && dVar != null && a(iArr[i12], aVar.getTrackGroups(i12), dVar)) {
                if (rendererType == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            r0 r0Var = new r0(true);
            r0VarArr[i11] = r0Var;
            r0VarArr[i10] = r0Var;
        }
    }

    public static boolean a(int[][] iArr, l0 l0Var, io.odeeo.internal.n0.d dVar) {
        if (dVar == null) {
            return false;
        }
        int iIndexOf = l0Var.indexOf(dVar.getTrackGroup());
        for (int i10 = 0; i10 < dVar.length(); i10++) {
            if (q0.getTunnelingSupport(iArr[iIndexOf][dVar.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(int i10, boolean z10) {
        int formatSupport = q0.getFormatSupport(i10);
        if (formatSupport != 4) {
            return z10 && formatSupport == 3;
        }
        return true;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static int a(io.odeeo.internal.b.t tVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(tVar.f62962c)) {
            return 4;
        }
        String strA = a(str);
        String strA2 = a(tVar.f62962c);
        if (strA2 == null || strA == null) {
            return (z10 && strA2 == null) ? 1 : 0;
        }
        if (strA2.startsWith(strA) || strA.startsWith(strA2)) {
            return 3;
        }
        return g0.splitAtFirst(strA2, "-")[0].equals(g0.splitAtFirst(strA, "-")[0]) ? 2 : 0;
    }

    public static List<Integer> a(k0 k0Var, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(k0Var.f62395a);
        for (int i13 = 0; i13 < k0Var.f62395a; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < k0Var.f62395a; i15++) {
                io.odeeo.internal.b.t format = k0Var.getFormat(i15);
                int i16 = format.f62976q;
                if (i16 > 0 && (i12 = format.f62977r) > 0) {
                    Point pointA = a(z10, i10, i11, i16, i12);
                    int i17 = format.f62976q;
                    int i18 = format.f62977r;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (pointA.x * 0.98f)) && i18 >= ((int) (pointA.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int pixelCount = k0Var.getFormat(((Integer) arrayList.get(size)).intValue()).getPixelCount();
                    if (pixelCount == -1 || pixelCount > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
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
            int r4 = io.odeeo.internal.q0.g0.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = io.odeeo.internal.q0.g0.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.n0.c.a(boolean, int, int, int, int):android.graphics.Point");
    }
}
