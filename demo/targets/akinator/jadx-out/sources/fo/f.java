package fo;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import ao.b2;
import fo.e;
import gn.v1;
import gn.w1;
import gn.y1;
import gn.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends z1 {
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final SparseArray U;
    public final SparseBooleanArray V;

    public f(g gVar) {
        a(gVar);
        this.F = gVar.f55895o0;
        this.G = gVar.f55896p0;
        this.H = gVar.f55897q0;
        this.I = gVar.f55898r0;
        this.J = gVar.f55899s0;
        this.K = gVar.f55900t0;
        this.L = gVar.f55901u0;
        this.M = gVar.f55902v0;
        this.N = gVar.f55903w0;
        this.O = gVar.f55904x0;
        this.P = gVar.f55905y0;
        this.Q = gVar.f55906z0;
        this.R = gVar.A0;
        this.S = gVar.B0;
        this.T = gVar.C0;
        SparseArray sparseArray = gVar.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.U = sparseArray2;
        this.V = gVar.E0.clone();
    }

    public final void c() {
        this.F = true;
        this.G = false;
        this.H = true;
        this.I = false;
        this.J = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = false;
        this.S = true;
        this.T = false;
    }

    @Deprecated
    public f clearSelectionOverride(int i10, b2 b2Var) {
        SparseArray sparseArray = this.U;
        Map map = (Map) sparseArray.get(i10);
        if (map != null && map.containsKey(b2Var)) {
            map.remove(b2Var);
            if (map.isEmpty()) {
                sparseArray.remove(i10);
            }
        }
        return this;
    }

    @Deprecated
    public f clearSelectionOverrides(int i10) {
        SparseArray sparseArray = this.U;
        Map map = (Map) sparseArray.get(i10);
        if (map != null && !map.isEmpty()) {
            sparseArray.remove(i10);
        }
        return this;
    }

    public f setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
        this.M = z10;
        return this;
    }

    public f setAllowAudioMixedDecoderSupportAdaptiveness(boolean z10) {
        this.N = z10;
        return this;
    }

    public f setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
        this.K = z10;
        return this;
    }

    public f setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
        this.L = z10;
        return this;
    }

    public f setAllowAudioNonSeamlessAdaptiveness(boolean z10) {
        this.O = z10;
        return this;
    }

    public f setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z10) {
        this.T = z10;
        return this;
    }

    public f setAllowMultipleAdaptiveSelections(boolean z10) {
        this.S = z10;
        return this;
    }

    public f setAllowVideoMixedDecoderSupportAdaptiveness(boolean z10) {
        this.I = z10;
        return this;
    }

    public f setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
        this.G = z10;
        return this;
    }

    public f setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
        this.H = z10;
        return this;
    }

    public f setConstrainAudioChannelCountToDeviceCapabilities(boolean z10) {
        this.P = z10;
        return this;
    }

    @Deprecated
    public f setDisabledTextTrackSelectionFlags(int i10) {
        return setIgnoredTextSelectionFlags(i10);
    }

    @Override // gn.z1
    @Deprecated
    public /* bridge */ /* synthetic */ z1 setDisabledTrackTypes(Set set) {
        return setDisabledTrackTypes((Set<Integer>) set);
    }

    public f setExceedAudioConstraintsIfNecessary(boolean z10) {
        this.J = z10;
        return this;
    }

    public f setExceedRendererCapabilitiesIfNecessary(boolean z10) {
        this.Q = z10;
        return this;
    }

    public f setExceedVideoConstraintsIfNecessary(boolean z10) {
        this.F = z10;
        return this;
    }

    public f setRendererDisabled(int i10, boolean z10) {
        SparseBooleanArray sparseBooleanArray = this.V;
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
    public f setSelectionOverride(int i10, b2 b2Var, e.C0566e c0566e) {
        SparseArray sparseArray = this.U;
        Map map = (Map) sparseArray.get(i10);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i10, map);
        }
        if (map.containsKey(b2Var) && Objects.equals(map.get(b2Var), c0566e)) {
            return this;
        }
        map.put(b2Var, c0566e);
        return this;
    }

    public f setTunnelingEnabled(boolean z10) {
        this.R = z10;
        return this;
    }

    @Override // gn.z1
    public f addOverride(w1 w1Var) {
        super.addOverride(w1Var);
        return this;
    }

    @Override // gn.z1
    public g build() {
        return new g(this);
    }

    @Override // gn.z1
    public f clearOverride(v1 v1Var) {
        super.clearOverride(v1Var);
        return this;
    }

    @Override // gn.z1
    public f clearOverrides() {
        super.clearOverrides();
        return this;
    }

    @Override // gn.z1
    public f clearOverridesOfType(int i10) {
        super.clearOverridesOfType(i10);
        return this;
    }

    @Override // gn.z1
    public f clearVideoSizeConstraints() {
        super.clearVideoSizeConstraints();
        return this;
    }

    @Override // gn.z1
    public f clearViewportSizeConstraints() {
        super.clearViewportSizeConstraints();
        return this;
    }

    @Override // gn.z1
    public f setAudioOffloadPreferences(y1 y1Var) {
        super.setAudioOffloadPreferences(y1Var);
        return this;
    }

    @Override // gn.z1
    @Deprecated
    public f setDisabledTrackTypes(Set<Integer> set) {
        super.setDisabledTrackTypes(set);
        return this;
    }

    @Override // gn.z1
    public f setForceHighestSupportedBitrate(boolean z10) {
        super.setForceHighestSupportedBitrate(z10);
        return this;
    }

    @Override // gn.z1
    public f setForceLowestBitrate(boolean z10) {
        super.setForceLowestBitrate(z10);
        return this;
    }

    @Override // gn.z1
    public f setIgnoredTextSelectionFlags(int i10) {
        super.setIgnoredTextSelectionFlags(i10);
        return this;
    }

    @Override // gn.z1
    public f setMaxAudioBitrate(int i10) {
        super.setMaxAudioBitrate(i10);
        return this;
    }

    @Override // gn.z1
    public f setMaxAudioChannelCount(int i10) {
        super.setMaxAudioChannelCount(i10);
        return this;
    }

    @Override // gn.z1
    public f setMaxVideoBitrate(int i10) {
        super.setMaxVideoBitrate(i10);
        return this;
    }

    @Override // gn.z1
    public f setMaxVideoFrameRate(int i10) {
        super.setMaxVideoFrameRate(i10);
        return this;
    }

    @Override // gn.z1
    public f setMaxVideoSize(int i10, int i11) {
        super.setMaxVideoSize(i10, i11);
        return this;
    }

    @Override // gn.z1
    public f setMaxVideoSizeSd() {
        super.setMaxVideoSizeSd();
        return this;
    }

    @Override // gn.z1
    public f setMinVideoBitrate(int i10) {
        super.setMinVideoBitrate(i10);
        return this;
    }

    @Override // gn.z1
    public f setMinVideoFrameRate(int i10) {
        super.setMinVideoFrameRate(i10);
        return this;
    }

    @Override // gn.z1
    public f setMinVideoSize(int i10, int i11) {
        super.setMinVideoSize(i10, i11);
        return this;
    }

    @Override // gn.z1
    public f setOverrideForType(w1 w1Var) {
        super.setOverrideForType(w1Var);
        return this;
    }

    @Override // gn.z1
    public f setPreferredAudioLanguage(String str) {
        super.setPreferredAudioLanguage(str);
        return this;
    }

    @Override // gn.z1
    public f setPreferredAudioLanguages(String... strArr) {
        super.setPreferredAudioLanguages(strArr);
        return this;
    }

    @Override // gn.z1
    public f setPreferredAudioMimeType(String str) {
        super.setPreferredAudioMimeType(str);
        return this;
    }

    @Override // gn.z1
    public f setPreferredAudioMimeTypes(String... strArr) {
        super.setPreferredAudioMimeTypes(strArr);
        return this;
    }

    @Override // gn.z1
    public f setPreferredAudioRoleFlags(int i10) {
        super.setPreferredAudioRoleFlags(i10);
        return this;
    }

    @Override // gn.z1
    public f setPreferredTextLanguage(String str) {
        super.setPreferredTextLanguage(str);
        return this;
    }

    @Override // gn.z1
    public f setPreferredTextLanguages(String... strArr) {
        super.setPreferredTextLanguages(strArr);
        return this;
    }

    @Override // gn.z1
    public f setPreferredTextRoleFlags(int i10) {
        super.setPreferredTextRoleFlags(i10);
        return this;
    }

    @Override // gn.z1
    public f setPreferredVideoLanguage(String str) {
        super.setPreferredVideoLanguage(str);
        return this;
    }

    @Override // gn.z1
    public f setPreferredVideoLanguages(String... strArr) {
        super.setPreferredVideoLanguages(strArr);
        return this;
    }

    @Override // gn.z1
    public f setPreferredVideoMimeType(String str) {
        super.setPreferredVideoMimeType(str);
        return this;
    }

    @Override // gn.z1
    public f setPreferredVideoMimeTypes(String... strArr) {
        super.setPreferredVideoMimeTypes(strArr);
        return this;
    }

    @Override // gn.z1
    public f setPreferredVideoRoleFlags(int i10) {
        super.setPreferredVideoRoleFlags(i10);
        return this;
    }

    @Override // gn.z1
    public f setPrioritizeImageOverVideoEnabled(boolean z10) {
        super.setPrioritizeImageOverVideoEnabled(z10);
        return this;
    }

    @Override // gn.z1
    public f setSelectUndeterminedTextLanguage(boolean z10) {
        super.setSelectUndeterminedTextLanguage(z10);
        return this;
    }

    @Override // gn.z1
    public f setTrackTypeDisabled(int i10, boolean z10) {
        super.setTrackTypeDisabled(i10, z10);
        return this;
    }

    @Override // gn.z1
    public f setViewportSize(int i10, int i11, boolean z10) {
        super.setViewportSize(i10, i11, z10);
        return this;
    }

    @Override // gn.z1
    public f setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
        super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
        return this;
    }

    @Override // gn.z1
    public f setViewportSizeToPhysicalDisplaySize(boolean z10) {
        super.setViewportSizeToPhysicalDisplaySize(z10);
        return this;
    }

    @Deprecated
    public f clearSelectionOverrides() {
        SparseArray sparseArray = this.U;
        if (sparseArray.size() == 0) {
            return this;
        }
        sparseArray.clear();
        return this;
    }

    @Override // gn.z1
    @Deprecated
    public f setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
        return this;
    }

    @Override // gn.z1
    @Deprecated
    public f setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
        super.setViewportSizeToPhysicalDisplaySize(context, z10);
        return this;
    }

    public f() {
        this.U = new SparseArray();
        this.V = new SparseBooleanArray();
        c();
    }

    @Deprecated
    public f(Context context) {
        this();
    }

    public f(Bundle bundle) {
        b5 b5VarFromBundleList;
        SparseArray sparseArrayFromBundleSparseArray;
        SparseBooleanArray sparseBooleanArray;
        super(bundle);
        c();
        g gVar = g.F0;
        setExceedVideoConstraintsIfNecessary(bundle.getBoolean(g.G0, gVar.f55895o0));
        setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(g.H0, gVar.f55896p0));
        setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(g.I0, gVar.f55897q0));
        setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(g.U0, gVar.f55898r0));
        setExceedAudioConstraintsIfNecessary(bundle.getBoolean(g.J0, gVar.f55899s0));
        setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(g.K0, gVar.f55900t0));
        setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(g.L0, gVar.f55901u0));
        setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(g.M0, gVar.f55902v0));
        setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(g.V0, gVar.f55903w0));
        setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(g.Y0, gVar.f55904x0));
        setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(g.W0, gVar.f55905y0));
        setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(g.N0, gVar.f55906z0));
        setTunnelingEnabled(bundle.getBoolean(g.O0, gVar.A0));
        setAllowMultipleAdaptiveSelections(bundle.getBoolean(g.P0, gVar.B0));
        setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(g.X0, gVar.C0));
        this.U = new SparseArray();
        int[] intArray = bundle.getIntArray(g.Q0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g.R0);
        if (parcelableArrayList == null) {
            b5VarFromBundleList = b5.of();
        } else {
            b5VarFromBundleList = io.bidmachine.media3.common.util.f.fromBundleList(new ao.c(12), parcelableArrayList);
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(g.S0);
        if (sparseParcelableArray == null) {
            sparseArrayFromBundleSparseArray = new SparseArray();
        } else {
            sparseArrayFromBundleSparseArray = io.bidmachine.media3.common.util.f.fromBundleSparseArray(new ao.c(13), sparseParcelableArray);
        }
        if (intArray != null && intArray.length == b5VarFromBundleList.size()) {
            for (int i10 = 0; i10 < intArray.length; i10++) {
                setSelectionOverride(intArray[i10], (b2) b5VarFromBundleList.get(i10), (e.C0566e) sparseArrayFromBundleSparseArray.get(i10));
            }
        }
        int[] intArray2 = bundle.getIntArray(g.T0);
        if (intArray2 == null) {
            sparseBooleanArray = new SparseBooleanArray();
        } else {
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray2.length);
            for (int i11 : intArray2) {
                sparseBooleanArray2.append(i11, true);
            }
            sparseBooleanArray = sparseBooleanArray2;
        }
        this.V = sparseBooleanArray;
    }
}
