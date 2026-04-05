package pf;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import bf.m1;
import com.google.android.exoplayer2.a3;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.google.android.exoplayer2.z2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import mh.q1;
import nh.b5;
import nh.n2;
import nh.we;
import nh.x4;
import pf.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c extends n implements a3 {

    /* renamed from: k, reason: collision with root package name */
    public static final we f81029k = we.from(new ni.a(7));

    /* renamed from: l, reason: collision with root package name */
    public static final we f81030l = we.from(new ni.a(8));

    /* renamed from: d, reason: collision with root package name */
    public final Object f81031d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f81032e;

    /* renamed from: f, reason: collision with root package name */
    public final j f81033f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f81034g;

    /* renamed from: h, reason: collision with root package name */
    public pf.e f81035h;

    /* renamed from: i, reason: collision with root package name */
    public final pf.g f81036i;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.k f81037j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f implements Comparable {

        /* renamed from: g, reason: collision with root package name */
        public final int f81038g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f81039h;

        /* renamed from: i, reason: collision with root package name */
        public final String f81040i;

        /* renamed from: j, reason: collision with root package name */
        public final pf.e f81041j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f81042k;

        /* renamed from: l, reason: collision with root package name */
        public final int f81043l;

        /* renamed from: m, reason: collision with root package name */
        public final int f81044m;

        /* renamed from: n, reason: collision with root package name */
        public final int f81045n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f81046o;

        /* renamed from: p, reason: collision with root package name */
        public final int f81047p;

        /* renamed from: q, reason: collision with root package name */
        public final int f81048q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f81049r;

        /* renamed from: s, reason: collision with root package name */
        public final int f81050s;

        /* renamed from: t, reason: collision with root package name */
        public final int f81051t;

        /* renamed from: u, reason: collision with root package name */
        public final int f81052u;

        /* renamed from: v, reason: collision with root package name */
        public final int f81053v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f81054w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f81055x;

        public a(int i10, m1 m1Var, int i11, pf.e eVar, int i12, boolean z10, q1 q1Var) {
            b5 b5Var;
            int i13;
            int iC;
            int iC2;
            super(i10, m1Var, i11);
            this.f81041j = eVar;
            this.f81040i = c.f(this.f81076f.f28793e);
            int i14 = 0;
            this.f81042k = c.d(i12, false);
            int i15 = 0;
            while (true) {
                b5 b5Var2 = eVar.f81181p;
                b5Var = eVar.f81185t;
                i13 = Integer.MAX_VALUE;
                if (i15 >= b5Var2.size()) {
                    iC = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    iC = c.c(this.f81076f, (String) eVar.f81181p.get(i15), false);
                    if (iC > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f81044m = i15;
            this.f81043l = iC;
            int i16 = this.f81076f.f28795g;
            int i17 = eVar.f81182q;
            this.f81045n = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
            z0 z0Var = this.f81076f;
            int i18 = z0Var.f28795g;
            this.f81046o = i18 == 0 || (i18 & 1) != 0;
            this.f81049r = (z0Var.f28794f & 1) != 0;
            int i19 = z0Var.A;
            this.f81050s = i19;
            this.f81051t = z0Var.B;
            int i20 = z0Var.f28798j;
            this.f81052u = i20;
            this.f81039h = (i20 == -1 || i20 <= eVar.f81184s) && (i19 == -1 || i19 <= eVar.f81183r) && q1Var.apply(z0Var);
            String[] systemLanguageCodes = n1.getSystemLanguageCodes();
            int i21 = 0;
            while (true) {
                if (i21 >= systemLanguageCodes.length) {
                    iC2 = 0;
                    i21 = Integer.MAX_VALUE;
                    break;
                } else {
                    iC2 = c.c(this.f81076f, systemLanguageCodes[i21], false);
                    if (iC2 > 0) {
                        break;
                    } else {
                        i21++;
                    }
                }
            }
            this.f81047p = i21;
            this.f81048q = iC2;
            int i22 = 0;
            while (true) {
                if (i22 < b5Var.size()) {
                    String str = this.f81076f.f28802n;
                    if (str != null && str.equals(b5Var.get(i22))) {
                        i13 = i22;
                        break;
                    }
                    i22++;
                } else {
                    break;
                }
            }
            this.f81053v = i13;
            this.f81054w = b3.getDecoderSupport(i12) == 128;
            this.f81055x = b3.getHardwareAccelerationSupport(i12) == 64;
            boolean z11 = this.f81039h;
            pf.e eVar2 = this.f81041j;
            if (c.d(i12, eVar2.f81108n0) && (z11 || eVar2.f81102h0)) {
                i14 = (!c.d(i12, false) || !z11 || this.f81076f.f28798j == -1 || eVar2.f81191z || eVar2.f81190y || (!eVar2.f81110p0 && z10)) ? 1 : 2;
            }
            this.f81038g = i14;
        }

        public static int compareSelections(List<a> list, List<a> list2) {
            return ((a) Collections.max(list)).compareTo((a) Collections.max(list2));
        }

        public static b5 createForTrackGroup(int i10, m1 m1Var, pf.e eVar, int[] iArr, boolean z10, q1 q1Var) {
            x4 x4VarBuilder = b5.builder();
            for (int i11 = 0; i11 < m1Var.f9332b; i11++) {
                x4VarBuilder.add((Object) new a(i10, m1Var, i11, eVar, iArr[i11], z10, q1Var));
            }
            return x4VarBuilder.build();
        }

        @Override // pf.c.f
        public int getSelectionEligibility() {
            return this.f81038g;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            boolean z10 = this.f81042k;
            boolean z11 = this.f81039h;
            we weVarReverse = (z11 && z10) ? c.f81029k : c.f81029k.reverse();
            n2 n2VarStart = n2.start();
            boolean z12 = aVar.f81042k;
            int i10 = aVar.f81052u;
            n2 n2VarCompare = n2VarStart.compareFalseFirst(z10, z12).compare(Integer.valueOf(this.f81044m), Integer.valueOf(aVar.f81044m), we.natural().reverse()).compare(this.f81043l, aVar.f81043l).compare(this.f81045n, aVar.f81045n).compareFalseFirst(this.f81049r, aVar.f81049r).compareFalseFirst(this.f81046o, aVar.f81046o).compare(Integer.valueOf(this.f81047p), Integer.valueOf(aVar.f81047p), we.natural().reverse()).compare(this.f81048q, aVar.f81048q).compareFalseFirst(z11, aVar.f81039h).compare(Integer.valueOf(this.f81053v), Integer.valueOf(aVar.f81053v), we.natural().reverse());
            int i11 = this.f81052u;
            n2 n2VarCompare2 = n2VarCompare.compare(Integer.valueOf(i11), Integer.valueOf(i10), this.f81041j.f81190y ? c.f81029k.reverse() : c.f81030l).compareFalseFirst(this.f81054w, aVar.f81054w).compareFalseFirst(this.f81055x, aVar.f81055x).compare(Integer.valueOf(this.f81050s), Integer.valueOf(aVar.f81050s), weVarReverse).compare(Integer.valueOf(this.f81051t), Integer.valueOf(aVar.f81051t), weVarReverse);
            Integer numValueOf = Integer.valueOf(i11);
            Integer numValueOf2 = Integer.valueOf(i10);
            if (!n1.areEqual(this.f81040i, aVar.f81040i)) {
                weVarReverse = c.f81030l;
            }
            return n2VarCompare2.compare(numValueOf, numValueOf2, weVarReverse).result();
        }

        @Override // pf.c.f
        public boolean isCompatibleForAdaptationWith(a aVar) {
            int i10;
            String str;
            int i11;
            pf.e eVar = this.f81041j;
            boolean z10 = eVar.f81105k0;
            z0 z0Var = this.f81076f;
            if (!z10 && ((i11 = z0Var.A) == -1 || i11 != aVar.f81076f.A)) {
                return false;
            }
            if (!eVar.f81103i0 && ((str = z0Var.f28802n) == null || !TextUtils.equals(str, aVar.f81076f.f28802n))) {
                return false;
            }
            if (!eVar.f81104j0 && ((i10 = z0Var.B) == -1 || i10 != aVar.f81076f.B)) {
                return false;
            }
            if (eVar.f81106l0) {
                return true;
            }
            return this.f81054w == aVar.f81054w && this.f81055x == aVar.f81055x;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f81056b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f81057c;

        public b(z0 z0Var, int i10) {
            this.f81056b = (z0Var.f28794f & 1) != 0;
            this.f81057c = c.d(i10, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            return n2.start().compareFalseFirst(this.f81057c, bVar.f81057c).compareFalseFirst(this.f81056b, bVar.f81056b).result();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: pf.c$c, reason: collision with other inner class name */
    public static final class C0763c extends r {
        public final pf.d A;

        @Deprecated
        public C0763c() {
            this.A = new pf.d();
        }

        @Deprecated
        public C0763c clearSelectionOverride(int i10, bf.n1 n1Var) {
            this.A.clearSelectionOverride(i10, n1Var);
            return this;
        }

        @Deprecated
        public C0763c clearSelectionOverrides(int i10) {
            this.A.clearSelectionOverrides(i10);
            return this;
        }

        public C0763c setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
            this.A.setAllowAudioMixedChannelCountAdaptiveness(z10);
            return this;
        }

        public C0763c setAllowAudioMixedDecoderSupportAdaptiveness(boolean z10) {
            this.A.setAllowAudioMixedDecoderSupportAdaptiveness(z10);
            return this;
        }

        public C0763c setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
            this.A.setAllowAudioMixedMimeTypeAdaptiveness(z10);
            return this;
        }

        public C0763c setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
            this.A.setAllowAudioMixedSampleRateAdaptiveness(z10);
            return this;
        }

        public C0763c setAllowMultipleAdaptiveSelections(boolean z10) {
            this.A.setAllowMultipleAdaptiveSelections(z10);
            return this;
        }

        public C0763c setAllowVideoMixedDecoderSupportAdaptiveness(boolean z10) {
            this.A.setAllowVideoMixedDecoderSupportAdaptiveness(z10);
            return this;
        }

        public C0763c setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
            this.A.setAllowVideoMixedMimeTypeAdaptiveness(z10);
            return this;
        }

        public C0763c setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
            this.A.setAllowVideoNonSeamlessAdaptiveness(z10);
            return this;
        }

        @Deprecated
        public C0763c setDisabledTextTrackSelectionFlags(int i10) {
            this.A.setDisabledTextTrackSelectionFlags(i10);
            return this;
        }

        @Override // pf.r
        @Deprecated
        public /* bridge */ /* synthetic */ r setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        public C0763c setExceedAudioConstraintsIfNecessary(boolean z10) {
            this.A.setExceedAudioConstraintsIfNecessary(z10);
            return this;
        }

        public C0763c setExceedRendererCapabilitiesIfNecessary(boolean z10) {
            this.A.setExceedRendererCapabilitiesIfNecessary(z10);
            return this;
        }

        public C0763c setExceedVideoConstraintsIfNecessary(boolean z10) {
            this.A.setExceedVideoConstraintsIfNecessary(z10);
            return this;
        }

        public C0763c setRendererDisabled(int i10, boolean z10) {
            this.A.setRendererDisabled(i10, z10);
            return this;
        }

        @Deprecated
        public C0763c setSelectionOverride(int i10, bf.n1 n1Var, d dVar) {
            this.A.setSelectionOverride(i10, n1Var, dVar);
            return this;
        }

        public C0763c setTunnelingEnabled(boolean z10) {
            this.A.setTunnelingEnabled(z10);
            return this;
        }

        @Override // pf.r
        public C0763c addOverride(q qVar) {
            this.A.addOverride(qVar);
            return this;
        }

        @Override // pf.r
        public pf.e build() {
            return this.A.build();
        }

        @Override // pf.r
        public C0763c clearOverride(m1 m1Var) {
            this.A.clearOverride(m1Var);
            return this;
        }

        @Override // pf.r
        public C0763c clearOverrides() {
            this.A.clearOverrides();
            return this;
        }

        @Override // pf.r
        public C0763c clearOverridesOfType(int i10) {
            this.A.clearOverridesOfType(i10);
            return this;
        }

        @Deprecated
        public C0763c clearSelectionOverrides() {
            this.A.clearSelectionOverrides();
            return this;
        }

        @Override // pf.r
        public C0763c clearVideoSizeConstraints() {
            this.A.clearVideoSizeConstraints();
            return this;
        }

        @Override // pf.r
        public C0763c clearViewportSizeConstraints() {
            this.A.clearViewportSizeConstraints();
            return this;
        }

        @Override // pf.r
        @Deprecated
        public C0763c setDisabledTrackTypes(Set<Integer> set) {
            this.A.setDisabledTrackTypes(set);
            return this;
        }

        @Override // pf.r
        public C0763c setForceHighestSupportedBitrate(boolean z10) {
            this.A.setForceHighestSupportedBitrate(z10);
            return this;
        }

        @Override // pf.r
        public C0763c setForceLowestBitrate(boolean z10) {
            this.A.setForceLowestBitrate(z10);
            return this;
        }

        @Override // pf.r
        public C0763c setIgnoredTextSelectionFlags(int i10) {
            this.A.setIgnoredTextSelectionFlags(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setMaxAudioBitrate(int i10) {
            this.A.setMaxAudioBitrate(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setMaxAudioChannelCount(int i10) {
            this.A.setMaxAudioChannelCount(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setMaxVideoBitrate(int i10) {
            this.A.setMaxVideoBitrate(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setMaxVideoFrameRate(int i10) {
            this.A.setMaxVideoFrameRate(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setMaxVideoSize(int i10, int i11) {
            this.A.setMaxVideoSize(i10, i11);
            return this;
        }

        @Override // pf.r
        public C0763c setMaxVideoSizeSd() {
            this.A.setMaxVideoSizeSd();
            return this;
        }

        @Override // pf.r
        public C0763c setMinVideoBitrate(int i10) {
            this.A.setMinVideoBitrate(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setMinVideoFrameRate(int i10) {
            this.A.setMinVideoFrameRate(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setMinVideoSize(int i10, int i11) {
            this.A.setMinVideoSize(i10, i11);
            return this;
        }

        @Override // pf.r
        public C0763c setOverrideForType(q qVar) {
            this.A.setOverrideForType(qVar);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredAudioLanguage(String str) {
            this.A.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredAudioLanguages(String... strArr) {
            this.A.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredAudioMimeType(String str) {
            this.A.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredAudioMimeTypes(String... strArr) {
            this.A.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredAudioRoleFlags(int i10) {
            this.A.setPreferredAudioRoleFlags(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredTextLanguage(String str) {
            this.A.setPreferredTextLanguage(str);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.A.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredTextLanguages(String... strArr) {
            this.A.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredTextRoleFlags(int i10) {
            this.A.setPreferredTextRoleFlags(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredVideoMimeType(String str) {
            this.A.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredVideoMimeTypes(String... strArr) {
            this.A.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // pf.r
        public C0763c setPreferredVideoRoleFlags(int i10) {
            this.A.setPreferredVideoRoleFlags(i10);
            return this;
        }

        @Override // pf.r
        public C0763c setSelectUndeterminedTextLanguage(boolean z10) {
            this.A.setSelectUndeterminedTextLanguage(z10);
            return this;
        }

        @Override // pf.r
        public C0763c setTrackTypeDisabled(int i10, boolean z10) {
            this.A.setTrackTypeDisabled(i10, z10);
            return this;
        }

        @Override // pf.r
        public C0763c setViewportSize(int i10, int i11, boolean z10) {
            this.A.setViewportSize(i10, i11, z10);
            return this;
        }

        @Override // pf.r
        public C0763c setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            this.A.setViewportSizeToPhysicalDisplaySize(context, z10);
            return this;
        }

        public C0763c(Context context) {
            this.A = new pf.d(context);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements com.google.android.exoplayer2.i {

        /* renamed from: f, reason: collision with root package name */
        public static final String f81058f = n1.intToStringMaxRadix(0);

        /* renamed from: g, reason: collision with root package name */
        public static final String f81059g = n1.intToStringMaxRadix(1);

        /* renamed from: h, reason: collision with root package name */
        public static final String f81060h = n1.intToStringMaxRadix(2);

        /* renamed from: b, reason: collision with root package name */
        public final int f81061b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f81062c;

        /* renamed from: e, reason: collision with root package name */
        public final int f81063e;

        public d(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public boolean containsTrack(int i10) {
            for (int i11 : this.f81062c) {
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
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f81061b == dVar.f81061b && Arrays.equals(this.f81062c, dVar.f81062c) && this.f81063e == dVar.f81063e) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f81062c) + (this.f81061b * 31)) * 31) + this.f81063e;
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f81058f, this.f81061b);
            bundle.putIntArray(f81059g, this.f81062c);
            bundle.putInt(f81060h, this.f81063e);
            return bundle;
        }

        public d(int i10, int[] iArr, int i11) {
            this.f81061b = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f81062c = iArrCopyOf;
            this.f81063e = i11;
            Arrays.sort(iArrCopyOf);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends f implements Comparable {

        /* renamed from: g, reason: collision with root package name */
        public final int f81064g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f81065h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f81066i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f81067j;

        /* renamed from: k, reason: collision with root package name */
        public final int f81068k;

        /* renamed from: l, reason: collision with root package name */
        public final int f81069l;

        /* renamed from: m, reason: collision with root package name */
        public final int f81070m;

        /* renamed from: n, reason: collision with root package name */
        public final int f81071n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f81072o;

        public e(int i10, m1 m1Var, int i11, pf.e eVar, int i12, String str) {
            int iC;
            super(i10, m1Var, i11);
            int i13 = 0;
            this.f81065h = c.d(i12, false);
            int i14 = this.f81076f.f28794f;
            int i15 = eVar.f81188w;
            b5 b5Var = eVar.f81186u;
            int i16 = i14 & (~i15);
            this.f81066i = (i16 & 1) != 0;
            this.f81067j = (i16 & 2) != 0;
            b5 b5VarOf = b5Var.isEmpty() ? b5.of("") : b5Var;
            int i17 = 0;
            while (true) {
                if (i17 >= b5VarOf.size()) {
                    iC = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iC = c.c(this.f81076f, (String) b5VarOf.get(i17), eVar.f81189x);
                    if (iC > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f81068k = i17;
            this.f81069l = iC;
            int i18 = this.f81076f.f28795g;
            int i19 = eVar.f81187v;
            int iBitCount = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
            this.f81070m = iBitCount;
            this.f81072o = (this.f81076f.f28795g & 1088) != 0;
            int iC2 = c.c(this.f81076f, str, c.f(str) == null);
            this.f81071n = iC2;
            boolean z10 = iC > 0 || (b5Var.isEmpty() && iBitCount > 0) || this.f81066i || (this.f81067j && iC2 > 0);
            if (c.d(i12, eVar.f81108n0) && z10) {
                i13 = 1;
            }
            this.f81064g = i13;
        }

        public static int compareSelections(List<e> list, List<e> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static b5 createForTrackGroup(int i10, m1 m1Var, pf.e eVar, int[] iArr, String str) {
            x4 x4VarBuilder = b5.builder();
            for (int i11 = 0; i11 < m1Var.f9332b; i11++) {
                x4VarBuilder.add((Object) new e(i10, m1Var, i11, eVar, iArr[i11], str));
            }
            return x4VarBuilder.build();
        }

        @Override // pf.c.f
        public int getSelectionEligibility() {
            return this.f81064g;
        }

        @Override // java.lang.Comparable
        public int compareTo(e eVar) {
            n2 n2VarCompare = n2.start().compareFalseFirst(this.f81065h, eVar.f81065h).compare(Integer.valueOf(this.f81068k), Integer.valueOf(eVar.f81068k), we.natural().reverse());
            int i10 = eVar.f81069l;
            int i11 = this.f81069l;
            n2 n2VarCompare2 = n2VarCompare.compare(i11, i10);
            int i12 = eVar.f81070m;
            int i13 = this.f81070m;
            n2 n2VarCompare3 = n2VarCompare2.compare(i13, i12).compareFalseFirst(this.f81066i, eVar.f81066i).compare(Boolean.valueOf(this.f81067j), Boolean.valueOf(eVar.f81067j), i11 == 0 ? we.natural() : we.natural().reverse()).compare(this.f81071n, eVar.f81071n);
            if (i13 == 0) {
                n2VarCompare3 = n2VarCompare3.compareTrueFirst(this.f81072o, eVar.f81072o);
            }
            return n2VarCompare3.result();
        }

        @Override // pf.c.f
        public boolean isCompatibleForAdaptationWith(e eVar) {
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public final int f81073b;

        /* renamed from: c, reason: collision with root package name */
        public final m1 f81074c;

        /* renamed from: e, reason: collision with root package name */
        public final int f81075e;

        /* renamed from: f, reason: collision with root package name */
        public final z0 f81076f;

        public f(int i10, m1 m1Var, int i11) {
            this.f81073b = i10;
            this.f81074c = m1Var;
            this.f81075e = i11;
            this.f81076f = m1Var.getFormat(i11);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(f fVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends f {

        /* renamed from: g, reason: collision with root package name */
        public final boolean f81077g;

        /* renamed from: h, reason: collision with root package name */
        public final pf.e f81078h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f81079i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f81080j;

        /* renamed from: k, reason: collision with root package name */
        public final int f81081k;

        /* renamed from: l, reason: collision with root package name */
        public final int f81082l;

        /* renamed from: m, reason: collision with root package name */
        public final int f81083m;

        /* renamed from: n, reason: collision with root package name */
        public final int f81084n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f81085o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f81086p;

        /* renamed from: q, reason: collision with root package name */
        public final int f81087q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f81088r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f81089s;

        /* renamed from: t, reason: collision with root package name */
        public final int f81090t;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public g(int r6, bf.m1 r7, int r8, pf.e r9, int r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.c.g.<init>(int, bf.m1, int, pf.e, int, int, boolean):void");
        }

        public static int compareSelections(List<g> list, List<g> list2) {
            int i10 = 13;
            return n2.start().compare((g) Collections.max(list, new ni.a(12)), (g) Collections.max(list2, new ni.a(12)), new ni.a(12)).compare(list.size(), list2.size()).compare((g) Collections.max(list, new ni.a(i10)), (g) Collections.max(list2, new ni.a(i10)), new ni.a(i10)).result();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static nh.b5 createForTrackGroup(int r16, bf.m1 r17, pf.e r18, int[] r19, int r20) {
            /*
                r2 = r17
                r4 = r18
                int r0 = r4.f81176k
                int r1 = r4.f81177l
                boolean r3 = r4.f81178m
                nh.we r5 = pf.c.f81029k
                r9 = 0
                r10 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r10) goto L72
                if (r1 != r10) goto L16
                goto L72
            L16:
                r5 = r9
                r6 = r10
            L18:
                int r7 = r2.f9332b
                if (r5 >= r7) goto L70
                com.google.android.exoplayer2.z0 r7 = r2.getFormat(r5)
                int r11 = r7.f28807s
                int r12 = r7.f28808t
                if (r11 <= 0) goto L6d
                if (r12 <= 0) goto L6d
                if (r3 == 0) goto L39
                if (r11 <= r12) goto L2e
                r13 = 1
                goto L2f
            L2e:
                r13 = r9
            L2f:
                if (r0 <= r1) goto L33
                r14 = 1
                goto L34
            L33:
                r14 = r9
            L34:
                if (r13 == r14) goto L39
                r13 = r0
                r14 = r1
                goto L3b
            L39:
                r14 = r0
                r13 = r1
            L3b:
                int r15 = r11 * r13
                int r8 = r12 * r14
                if (r15 < r8) goto L4b
                android.graphics.Point r13 = new android.graphics.Point
                int r8 = com.google.android.exoplayer2.util.n1.ceilDivide(r8, r11)
                r13.<init>(r14, r8)
                goto L55
            L4b:
                android.graphics.Point r8 = new android.graphics.Point
                int r11 = com.google.android.exoplayer2.util.n1.ceilDivide(r15, r12)
                r8.<init>(r11, r13)
                r13 = r8
            L55:
                int r7 = r7.f28807s
                int r8 = r7 * r12
                int r11 = r13.x
                float r11 = (float) r11
                r14 = 1065017672(0x3f7ae148, float:0.98)
                float r11 = r11 * r14
                int r11 = (int) r11
                if (r7 < r11) goto L6d
                int r7 = r13.y
                float r7 = (float) r7
                float r7 = r7 * r14
                int r7 = (int) r7
                if (r12 < r7) goto L6d
                if (r8 >= r6) goto L6d
                r6 = r8
            L6d:
                int r5 = r5 + 1
                goto L18
            L70:
                r8 = r6
                goto L73
            L72:
                r8 = r10
            L73:
                nh.x4 r11 = nh.b5.builder()
                r3 = r9
            L78:
                int r0 = r2.f9332b
                if (r3 >= r0) goto La4
                com.google.android.exoplayer2.z0 r0 = r2.getFormat(r3)
                int r0 = r0.getPixelCount()
                if (r8 == r10) goto L8e
                r1 = -1
                if (r0 == r1) goto L8c
                if (r0 > r8) goto L8c
                goto L8e
            L8c:
                r7 = r9
                goto L8f
            L8e:
                r7 = 1
            L8f:
                pf.c$g r0 = new pf.c$g
                r5 = r19[r3]
                r1 = r16
                r6 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r11.add(r0)
                int r3 = r3 + 1
                r2 = r17
                r4 = r18
                goto L78
            La4:
                nh.b5 r0 = r11.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.c.g.createForTrackGroup(int, bf.m1, pf.e, int[], int):nh.b5");
        }

        @Override // pf.c.f
        public int getSelectionEligibility() {
            return this.f81087q;
        }

        @Override // pf.c.f
        public boolean isCompatibleForAdaptationWith(g gVar) {
            if (!this.f81086p && !n1.areEqual(this.f81076f.f28802n, gVar.f81076f.f28802n)) {
                return false;
            }
            if (this.f81078h.f81101g0) {
                return true;
            }
            return this.f81088r == gVar.f81088r && this.f81089s == gVar.f81089s;
        }
    }

    public c(Context context) {
        this(context, new a.b());
    }

    public static void b(bf.n1 n1Var, s sVar, HashMap map) {
        q qVar;
        for (int i10 = 0; i10 < n1Var.f9356b; i10++) {
            q qVar2 = (q) sVar.A.get(n1Var.get(i10));
            if (qVar2 != null && ((qVar = (q) map.get(Integer.valueOf(qVar2.getType()))) == null || (qVar.f81138c.isEmpty() && !qVar2.f81138c.isEmpty()))) {
                map.put(Integer.valueOf(qVar2.getType()), qVar2);
            }
        }
    }

    public static int c(z0 z0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(z0Var.f28793e)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(z0Var.f28793e);
        if (strF2 == null || strF == null) {
            return (z10 && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        return n1.splitAtFirst(strF2, "-")[0].equals(n1.splitAtFirst(strF, "-")[0]) ? 2 : 0;
    }

    public static boolean d(int i10, boolean z10) {
        int formatSupport = b3.getFormatSupport(i10);
        if (formatSupport != 4) {
            return z10 && formatSupport == 3;
        }
        return true;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static Pair g(int i10, m mVar, int[][][] iArr, h hVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccessOf;
        m mVar2 = mVar;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mVar2.getRendererCount();
        int i12 = 0;
        while (i12 < rendererCount) {
            if (i10 == mVar2.getRendererType(i12)) {
                bf.n1 trackGroups = mVar2.getTrackGroups(i12);
                for (int i13 = 0; i13 < trackGroups.f9356b; i13++) {
                    m1 m1Var = trackGroups.get(i13);
                    List<f> listCreate = hVar.create(i12, m1Var, iArr[i12][i13]);
                    int i14 = m1Var.f9332b;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        f fVar = listCreate.get(i15);
                        int selectionEligibility = fVar.getSelectionEligibility();
                        if (zArr[i15] || selectionEligibility == 0) {
                            i11 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessOf = b5.of(fVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(fVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    f fVar2 = listCreate.get(i16);
                                    int i17 = rendererCount;
                                    if (fVar2.getSelectionEligibility() == 2 && fVar.isCompatibleForAdaptationWith(fVar2)) {
                                        arrayList2.add(fVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    rendererCount = i17;
                                }
                                randomAccessOf = arrayList2;
                            }
                            i11 = rendererCount;
                            arrayList.add(randomAccessOf);
                        }
                        i15++;
                        rendererCount = i11;
                    }
                }
            }
            i12++;
            mVar2 = mVar;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((f) list.get(i18)).f81075e;
        }
        f fVar3 = (f) list.get(0);
        return Pair.create(new i(fVar3.f81074c, iArr2), Integer.valueOf(fVar3.f81073b));
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc  */
    @Override // pf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(pf.m r22, int[][][] r23, int[] r24, bf.d0 r25, com.google.android.exoplayer2.m3 r26) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.c.a(pf.m, int[][][], int[], bf.d0, com.google.android.exoplayer2.m3):android.util.Pair");
    }

    public pf.d buildUponParameters() {
        return getParameters().buildUpon();
    }

    public final void e() {
        boolean z10;
        v vVar;
        pf.g gVar;
        synchronized (this.f81031d) {
            try {
                z10 = this.f81035h.f81107m0 && !this.f81034g && n1.f28506a >= 32 && (gVar = this.f81036i) != null && gVar.isSpatializationSupported();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (vVar = this.f81192a) == null) {
            return;
        }
        vVar.onTrackSelectionsInvalidated();
    }

    public final void h(pf.e eVar) {
        boolean zEquals;
        com.google.android.exoplayer2.util.a.checkNotNull(eVar);
        synchronized (this.f81031d) {
            zEquals = this.f81035h.equals(eVar);
            this.f81035h = eVar;
        }
        if (zEquals) {
            return;
        }
        if (eVar.f81107m0 && this.f81032e == null) {
            f0.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        v vVar = this.f81192a;
        if (vVar != null) {
            vVar.onTrackSelectionsInvalidated();
        }
    }

    @Override // pf.w
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // com.google.android.exoplayer2.a3
    public void onRendererCapabilitiesChanged(z2 z2Var) {
        boolean z10;
        v vVar;
        synchronized (this.f81031d) {
            z10 = this.f81035h.f81111q0;
        }
        if (!z10 || (vVar = this.f81192a) == null) {
            return;
        }
        vVar.onRendererCapabilitiesChanged(z2Var);
    }

    @Override // pf.w
    public void release() {
        pf.g gVar;
        synchronized (this.f81031d) {
            try {
                if (n1.f28506a >= 32 && (gVar = this.f81036i) != null) {
                    gVar.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.release();
    }

    @Override // pf.w
    public void setAudioAttributes(com.google.android.exoplayer2.audio.k kVar) {
        boolean zEquals;
        synchronized (this.f81031d) {
            zEquals = this.f81037j.equals(kVar);
            this.f81037j = kVar;
        }
        if (zEquals) {
            return;
        }
        e();
    }

    @Override // pf.w
    public void setParameters(s sVar) {
        if (sVar instanceof pf.e) {
            h((pf.e) sVar);
        }
        pf.d dVar = new pf.d(getParameters());
        dVar.a(sVar);
        h(dVar.build());
    }

    public c(Context context, j jVar) {
        this(context, pf.e.getDefaults(context), jVar);
    }

    @Override // pf.w
    public pf.e getParameters() {
        pf.e eVar;
        synchronized (this.f81031d) {
            eVar = this.f81035h;
        }
        return eVar;
    }

    public c(Context context, s sVar) {
        this(context, sVar, new a.b());
    }

    @Deprecated
    public c(s sVar, j jVar) {
        this(sVar, jVar, (Context) null);
    }

    public c(Context context, s sVar, j jVar) {
        this(sVar, jVar, context);
    }

    public c(s sVar, j jVar, Context context) {
        this.f81031d = new Object();
        this.f81032e = context != null ? context.getApplicationContext() : null;
        this.f81033f = jVar;
        if (sVar instanceof pf.e) {
            this.f81035h = (pf.e) sVar;
        } else {
            pf.d dVarBuildUpon = (context == null ? pf.e.f81091t0 : pf.e.getDefaults(context)).buildUpon();
            dVarBuildUpon.a(sVar);
            this.f81035h = dVarBuildUpon.build();
        }
        this.f81037j = com.google.android.exoplayer2.audio.k.f27152i;
        boolean z10 = context != null && n1.isTv(context);
        this.f81034g = z10;
        if (!z10 && context != null && n1.f28506a >= 32) {
            this.f81036i = pf.g.tryCreateInstance(context);
        }
        if (this.f81035h.f81107m0 && context == null) {
            f0.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Deprecated
    public void setParameters(C0763c c0763c) {
        h(c0763c.build());
    }

    public void setParameters(pf.d dVar) {
        h(dVar.build());
    }

    @Override // pf.w
    public a3 getRendererCapabilitiesListener() {
        return this;
    }
}
