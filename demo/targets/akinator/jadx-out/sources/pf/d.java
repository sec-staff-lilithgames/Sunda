package pf;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import bf.m1;
import bf.n1;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import pf.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends r {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final SparseArray O;
    public final SparseBooleanArray P;

    public d(e eVar) {
        a(eVar);
        this.A = eVar.f81098d0;
        this.B = eVar.f81099e0;
        this.C = eVar.f81100f0;
        this.D = eVar.f81101g0;
        this.E = eVar.f81102h0;
        this.F = eVar.f81103i0;
        this.G = eVar.f81104j0;
        this.H = eVar.f81105k0;
        this.I = eVar.f81106l0;
        this.J = eVar.f81107m0;
        this.K = eVar.f81108n0;
        this.L = eVar.f81109o0;
        this.M = eVar.f81110p0;
        this.N = eVar.f81111q0;
        SparseArray sparseArray = eVar.f81112r0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.O = sparseArray2;
        this.P = eVar.f81113s0.clone();
    }

    public final void c() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
    }

    @Deprecated
    public d clearSelectionOverride(int i10, n1 n1Var) {
        SparseArray sparseArray = this.O;
        Map map = (Map) sparseArray.get(i10);
        if (map != null && map.containsKey(n1Var)) {
            map.remove(n1Var);
            if (map.isEmpty()) {
                sparseArray.remove(i10);
            }
        }
        return this;
    }

    @Deprecated
    public d clearSelectionOverrides(int i10) {
        SparseArray sparseArray = this.O;
        Map map = (Map) sparseArray.get(i10);
        if (map != null && !map.isEmpty()) {
            sparseArray.remove(i10);
        }
        return this;
    }

    public d setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
        this.H = z10;
        return this;
    }

    public d setAllowAudioMixedDecoderSupportAdaptiveness(boolean z10) {
        this.I = z10;
        return this;
    }

    public d setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
        this.F = z10;
        return this;
    }

    public d setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
        this.G = z10;
        return this;
    }

    public d setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z10) {
        this.N = z10;
        return this;
    }

    public d setAllowMultipleAdaptiveSelections(boolean z10) {
        this.M = z10;
        return this;
    }

    public d setAllowVideoMixedDecoderSupportAdaptiveness(boolean z10) {
        this.D = z10;
        return this;
    }

    public d setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
        this.B = z10;
        return this;
    }

    public d setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
        this.C = z10;
        return this;
    }

    public d setConstrainAudioChannelCountToDeviceCapabilities(boolean z10) {
        this.J = z10;
        return this;
    }

    @Deprecated
    public d setDisabledTextTrackSelectionFlags(int i10) {
        return setIgnoredTextSelectionFlags(i10);
    }

    @Override // pf.r
    @Deprecated
    public /* bridge */ /* synthetic */ r setDisabledTrackTypes(Set set) {
        return setDisabledTrackTypes((Set<Integer>) set);
    }

    public d setExceedAudioConstraintsIfNecessary(boolean z10) {
        this.E = z10;
        return this;
    }

    public d setExceedRendererCapabilitiesIfNecessary(boolean z10) {
        this.K = z10;
        return this;
    }

    public d setExceedVideoConstraintsIfNecessary(boolean z10) {
        this.A = z10;
        return this;
    }

    public d setRendererDisabled(int i10, boolean z10) {
        SparseBooleanArray sparseBooleanArray = this.P;
        if (sparseBooleanArray.get(i10) == z10) {
            return this;
        }
        if (z10) {
            sparseBooleanArray.put(i10, true);
            return this;
        }
        sparseBooleanArray.delete(i10);
        return this;
    }

    @Deprecated
    public d setSelectionOverride(int i10, n1 n1Var, c.d dVar) {
        SparseArray sparseArray = this.O;
        Map map = (Map) sparseArray.get(i10);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i10, map);
        }
        if (map.containsKey(n1Var) && com.google.android.exoplayer2.util.n1.areEqual(map.get(n1Var), dVar)) {
            return this;
        }
        map.put(n1Var, dVar);
        return this;
    }

    public d setTunnelingEnabled(boolean z10) {
        this.L = z10;
        return this;
    }

    @Override // pf.r
    public d addOverride(q qVar) {
        super.addOverride(qVar);
        return this;
    }

    @Override // pf.r
    public e build() {
        return new e(this);
    }

    @Override // pf.r
    public d clearOverride(m1 m1Var) {
        super.clearOverride(m1Var);
        return this;
    }

    @Override // pf.r
    public d clearOverrides() {
        super.clearOverrides();
        return this;
    }

    @Override // pf.r
    public d clearOverridesOfType(int i10) {
        super.clearOverridesOfType(i10);
        return this;
    }

    @Override // pf.r
    public d clearVideoSizeConstraints() {
        super.clearVideoSizeConstraints();
        return this;
    }

    @Override // pf.r
    public d clearViewportSizeConstraints() {
        super.clearViewportSizeConstraints();
        return this;
    }

    @Override // pf.r
    @Deprecated
    public d setDisabledTrackTypes(Set<Integer> set) {
        super.setDisabledTrackTypes(set);
        return this;
    }

    @Override // pf.r
    public d setForceHighestSupportedBitrate(boolean z10) {
        super.setForceHighestSupportedBitrate(z10);
        return this;
    }

    @Override // pf.r
    public d setForceLowestBitrate(boolean z10) {
        super.setForceLowestBitrate(z10);
        return this;
    }

    @Override // pf.r
    public d setIgnoredTextSelectionFlags(int i10) {
        super.setIgnoredTextSelectionFlags(i10);
        return this;
    }

    @Override // pf.r
    public d setMaxAudioBitrate(int i10) {
        super.setMaxAudioBitrate(i10);
        return this;
    }

    @Override // pf.r
    public d setMaxAudioChannelCount(int i10) {
        super.setMaxAudioChannelCount(i10);
        return this;
    }

    @Override // pf.r
    public d setMaxVideoBitrate(int i10) {
        super.setMaxVideoBitrate(i10);
        return this;
    }

    @Override // pf.r
    public d setMaxVideoFrameRate(int i10) {
        super.setMaxVideoFrameRate(i10);
        return this;
    }

    @Override // pf.r
    public d setMaxVideoSize(int i10, int i11) {
        super.setMaxVideoSize(i10, i11);
        return this;
    }

    @Override // pf.r
    public d setMaxVideoSizeSd() {
        super.setMaxVideoSizeSd();
        return this;
    }

    @Override // pf.r
    public d setMinVideoBitrate(int i10) {
        super.setMinVideoBitrate(i10);
        return this;
    }

    @Override // pf.r
    public d setMinVideoFrameRate(int i10) {
        super.setMinVideoFrameRate(i10);
        return this;
    }

    @Override // pf.r
    public d setMinVideoSize(int i10, int i11) {
        super.setMinVideoSize(i10, i11);
        return this;
    }

    @Override // pf.r
    public d setOverrideForType(q qVar) {
        super.setOverrideForType(qVar);
        return this;
    }

    @Override // pf.r
    public d setPreferredAudioLanguage(String str) {
        super.setPreferredAudioLanguage(str);
        return this;
    }

    @Override // pf.r
    public d setPreferredAudioLanguages(String... strArr) {
        super.setPreferredAudioLanguages(strArr);
        return this;
    }

    @Override // pf.r
    public d setPreferredAudioMimeType(String str) {
        super.setPreferredAudioMimeType(str);
        return this;
    }

    @Override // pf.r
    public d setPreferredAudioMimeTypes(String... strArr) {
        super.setPreferredAudioMimeTypes(strArr);
        return this;
    }

    @Override // pf.r
    public d setPreferredAudioRoleFlags(int i10) {
        super.setPreferredAudioRoleFlags(i10);
        return this;
    }

    @Override // pf.r
    public d setPreferredTextLanguage(String str) {
        super.setPreferredTextLanguage(str);
        return this;
    }

    @Override // pf.r
    public d setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
        return this;
    }

    @Override // pf.r
    public d setPreferredTextLanguages(String... strArr) {
        super.setPreferredTextLanguages(strArr);
        return this;
    }

    @Override // pf.r
    public d setPreferredTextRoleFlags(int i10) {
        super.setPreferredTextRoleFlags(i10);
        return this;
    }

    @Override // pf.r
    public d setPreferredVideoMimeType(String str) {
        super.setPreferredVideoMimeType(str);
        return this;
    }

    @Override // pf.r
    public d setPreferredVideoMimeTypes(String... strArr) {
        super.setPreferredVideoMimeTypes(strArr);
        return this;
    }

    @Override // pf.r
    public d setPreferredVideoRoleFlags(int i10) {
        super.setPreferredVideoRoleFlags(i10);
        return this;
    }

    @Override // pf.r
    public d setSelectUndeterminedTextLanguage(boolean z10) {
        super.setSelectUndeterminedTextLanguage(z10);
        return this;
    }

    @Override // pf.r
    public d setTrackTypeDisabled(int i10, boolean z10) {
        super.setTrackTypeDisabled(i10, z10);
        return this;
    }

    @Override // pf.r
    public d setViewportSize(int i10, int i11, boolean z10) {
        super.setViewportSize(i10, i11, z10);
        return this;
    }

    @Override // pf.r
    public d setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
        super.setViewportSizeToPhysicalDisplaySize(context, z10);
        return this;
    }

    @Deprecated
    public d clearSelectionOverrides() {
        SparseArray sparseArray = this.O;
        if (sparseArray.size() == 0) {
            return this;
        }
        sparseArray.clear();
        return this;
    }

    @Deprecated
    public d() {
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        c();
    }

    public d(Context context) {
        super(context);
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        c();
    }
}
