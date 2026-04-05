package fo;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import ao.b2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import e6.h0;
import fo.a;
import gn.a2;
import gn.v1;
import gn.w1;
import gn.y1;
import gn.z1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.exoplayer.s1;
import io.bidmachine.media3.exoplayer.t1;
import io.bidmachine.media3.exoplayer.u1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import mh.q1;
import nh.b5;
import nh.n2;
import nh.we;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e extends o implements t1 {

    /* renamed from: j, reason: collision with root package name */
    public static final we f55823j = we.from(new af.i(17));

    /* renamed from: d, reason: collision with root package name */
    public final Object f55824d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f55825e;

    /* renamed from: f, reason: collision with root package name */
    public final k f55826f;

    /* renamed from: g, reason: collision with root package name */
    public fo.g f55827g;

    /* renamed from: h, reason: collision with root package name */
    public f f55828h;

    /* renamed from: i, reason: collision with root package name */
    public gn.h f55829i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends h implements Comparable {

        /* renamed from: g, reason: collision with root package name */
        public final int f55830g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f55831h;

        /* renamed from: i, reason: collision with root package name */
        public final String f55832i;

        /* renamed from: j, reason: collision with root package name */
        public final fo.g f55833j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f55834k;

        /* renamed from: l, reason: collision with root package name */
        public final int f55835l;

        /* renamed from: m, reason: collision with root package name */
        public final int f55836m;

        /* renamed from: n, reason: collision with root package name */
        public final int f55837n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f55838o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f55839p;

        /* renamed from: q, reason: collision with root package name */
        public final int f55840q;

        /* renamed from: r, reason: collision with root package name */
        public final int f55841r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f55842s;

        /* renamed from: t, reason: collision with root package name */
        public final int f55843t;

        /* renamed from: u, reason: collision with root package name */
        public final int f55844u;

        /* renamed from: v, reason: collision with root package name */
        public final int f55845v;

        /* renamed from: w, reason: collision with root package name */
        public final int f55846w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f55847x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f55848y;

        /* renamed from: z, reason: collision with root package name */
        public final boolean f55849z;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r8, gn.v1 r9, int r10, fo.g r11, int r12, boolean r13, mh.q1 r14, int r15) {
            /*
                Method dump skipped, instructions count: 398
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.e.a.<init>(int, gn.v1, int, fo.g, int, boolean, mh.q1, int):void");
        }

        public static int compareSelections(List<a> list, List<a> list2) {
            return ((a) Collections.max(list)).compareTo((a) Collections.max(list2));
        }

        public static b5 createForTrackGroup(int i10, v1 v1Var, fo.g gVar, int[] iArr, boolean z10, q1 q1Var, int i11) {
            x4 x4VarBuilder = b5.builder();
            for (int i12 = 0; i12 < v1Var.f58205a; i12++) {
                x4VarBuilder.add((Object) new a(i10, v1Var, i12, gVar, iArr[i12], z10, q1Var, i11));
            }
            return x4VarBuilder.build();
        }

        @Override // fo.e.h
        public int getSelectionEligibility() {
            return this.f55830g;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            boolean z10 = this.f55834k;
            boolean z11 = this.f55831h;
            we weVarReverse = (z11 && z10) ? e.f55823j : e.f55823j.reverse();
            n2 n2VarStart = n2.start();
            boolean z12 = aVar.f55834k;
            int i10 = aVar.f55845v;
            n2 n2VarCompare = n2VarStart.compareFalseFirst(z10, z12).compare(Integer.valueOf(this.f55836m), Integer.valueOf(aVar.f55836m), we.natural().reverse()).compare(this.f55835l, aVar.f55835l).compare(this.f55837n, aVar.f55837n).compareFalseFirst(this.f55842s, aVar.f55842s).compareFalseFirst(this.f55839p, aVar.f55839p).compare(Integer.valueOf(this.f55840q), Integer.valueOf(aVar.f55840q), we.natural().reverse()).compare(this.f55841r, aVar.f55841r).compareFalseFirst(z11, aVar.f55831h).compare(Integer.valueOf(this.f55846w), Integer.valueOf(aVar.f55846w), we.natural().reverse());
            boolean z13 = this.f55833j.B;
            int i11 = this.f55845v;
            if (z13) {
                n2VarCompare = n2VarCompare.compare(Integer.valueOf(i11), Integer.valueOf(i10), e.f55823j.reverse());
            }
            n2 n2VarCompare2 = n2VarCompare.compareFalseFirst(this.f55847x, aVar.f55847x).compareFalseFirst(this.f55848y, aVar.f55848y).compareFalseFirst(this.f55849z, aVar.f55849z).compare(Integer.valueOf(this.f55843t), Integer.valueOf(aVar.f55843t), weVarReverse).compare(Integer.valueOf(this.f55844u), Integer.valueOf(aVar.f55844u), weVarReverse);
            if (Objects.equals(this.f55832i, aVar.f55832i)) {
                n2VarCompare2 = n2VarCompare2.compare(Integer.valueOf(i11), Integer.valueOf(i10), weVarReverse);
            }
            return n2VarCompare2.result();
        }

        @Override // fo.e.h
        public boolean isCompatibleForAdaptationWith(a aVar) {
            int i10;
            String str;
            int i11;
            fo.g gVar = this.f55833j;
            boolean z10 = gVar.f55902v0;
            io.bidmachine.media3.common.b bVar = this.f55876f;
            if (!z10 && ((i11 = bVar.E) == -1 || i11 != aVar.f55876f.E)) {
                return false;
            }
            if (!this.f55838o && ((str = bVar.f60665o) == null || !TextUtils.equals(str, aVar.f55876f.f60665o))) {
                return false;
            }
            if (!gVar.f55901u0 && ((i10 = bVar.F) == -1 || i10 != aVar.f55876f.F)) {
                return false;
            }
            if (gVar.f55903w0) {
                return true;
            }
            return this.f55847x == aVar.f55847x && this.f55848y == aVar.f55848y;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends h implements Comparable {

        /* renamed from: g, reason: collision with root package name */
        public final int f55850g;

        /* renamed from: h, reason: collision with root package name */
        public final int f55851h;

        public b(int i10, v1 v1Var, int i11, fo.g gVar, int i12) {
            super(i10, v1Var, i11);
            this.f55850g = u1.isFormatSupported(i12, gVar.f55906z0) ? 1 : 0;
            this.f55851h = this.f55876f.getPixelCount();
        }

        public static int compareSelections(List<b> list, List<b> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static b5 createForTrackGroup(int i10, v1 v1Var, fo.g gVar, int[] iArr) {
            x4 x4VarBuilder = b5.builder();
            for (int i11 = 0; i11 < v1Var.f58205a; i11++) {
                x4VarBuilder.add((Object) new b(i10, v1Var, i11, gVar, iArr[i11]));
            }
            return x4VarBuilder.build();
        }

        @Override // fo.e.h
        public int getSelectionEligibility() {
            return this.f55850g;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            return Integer.compare(this.f55851h, bVar.f55851h);
        }

        @Override // fo.e.h
        public boolean isCompatibleForAdaptationWith(b bVar) {
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f55852b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f55853c;

        public c(io.bidmachine.media3.common.b bVar, int i10) {
            this.f55852b = (bVar.f60655e & 1) != 0;
            this.f55853c = u1.isFormatSupported(i10, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            return n2.start().compareFalseFirst(this.f55853c, cVar.f55853c).compareFalseFirst(this.f55852b, cVar.f55852b).result();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends z1 {
        public final fo.f F;

        public d() {
            this.F = new fo.f();
        }

        @Deprecated
        public d clearSelectionOverride(int i10, b2 b2Var) {
            this.F.clearSelectionOverride(i10, b2Var);
            return this;
        }

        @Deprecated
        public d clearSelectionOverrides(int i10) {
            this.F.clearSelectionOverrides(i10);
            return this;
        }

        public d setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
            this.F.setAllowAudioMixedChannelCountAdaptiveness(z10);
            return this;
        }

        public d setAllowAudioMixedDecoderSupportAdaptiveness(boolean z10) {
            this.F.setAllowAudioMixedDecoderSupportAdaptiveness(z10);
            return this;
        }

        public d setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
            this.F.setAllowAudioMixedMimeTypeAdaptiveness(z10);
            return this;
        }

        public d setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
            this.F.setAllowAudioMixedSampleRateAdaptiveness(z10);
            return this;
        }

        public d setAllowMultipleAdaptiveSelections(boolean z10) {
            this.F.setAllowMultipleAdaptiveSelections(z10);
            return this;
        }

        public d setAllowVideoMixedDecoderSupportAdaptiveness(boolean z10) {
            this.F.setAllowVideoMixedDecoderSupportAdaptiveness(z10);
            return this;
        }

        public d setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
            this.F.setAllowVideoMixedMimeTypeAdaptiveness(z10);
            return this;
        }

        public d setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
            this.F.setAllowVideoNonSeamlessAdaptiveness(z10);
            return this;
        }

        @Deprecated
        public d setDisabledTextTrackSelectionFlags(int i10) {
            this.F.setDisabledTextTrackSelectionFlags(i10);
            return this;
        }

        @Override // gn.z1
        @Deprecated
        public /* bridge */ /* synthetic */ z1 setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        public d setExceedAudioConstraintsIfNecessary(boolean z10) {
            this.F.setExceedAudioConstraintsIfNecessary(z10);
            return this;
        }

        public d setExceedRendererCapabilitiesIfNecessary(boolean z10) {
            this.F.setExceedRendererCapabilitiesIfNecessary(z10);
            return this;
        }

        public d setExceedVideoConstraintsIfNecessary(boolean z10) {
            this.F.setExceedVideoConstraintsIfNecessary(z10);
            return this;
        }

        public d setRendererDisabled(int i10, boolean z10) {
            this.F.setRendererDisabled(i10, z10);
            return this;
        }

        @Deprecated
        public d setSelectionOverride(int i10, b2 b2Var, C0566e c0566e) {
            this.F.setSelectionOverride(i10, b2Var, c0566e);
            return this;
        }

        public d setTunnelingEnabled(boolean z10) {
            this.F.setTunnelingEnabled(z10);
            return this;
        }

        @Override // gn.z1
        public d addOverride(w1 w1Var) {
            this.F.addOverride(w1Var);
            return this;
        }

        @Override // gn.z1
        public fo.g build() {
            return this.F.build();
        }

        @Override // gn.z1
        public d clearOverride(v1 v1Var) {
            this.F.clearOverride(v1Var);
            return this;
        }

        @Override // gn.z1
        public d clearOverrides() {
            this.F.clearOverrides();
            return this;
        }

        @Override // gn.z1
        public d clearOverridesOfType(int i10) {
            this.F.clearOverridesOfType(i10);
            return this;
        }

        @Deprecated
        public d clearSelectionOverrides() {
            this.F.clearSelectionOverrides();
            return this;
        }

        @Override // gn.z1
        public d clearVideoSizeConstraints() {
            this.F.clearVideoSizeConstraints();
            return this;
        }

        @Override // gn.z1
        public d clearViewportSizeConstraints() {
            this.F.clearViewportSizeConstraints();
            return this;
        }

        @Override // gn.z1
        public d setAudioOffloadPreferences(y1 y1Var) {
            this.F.setAudioOffloadPreferences(y1Var);
            return this;
        }

        @Override // gn.z1
        @Deprecated
        public d setDisabledTrackTypes(Set<Integer> set) {
            this.F.setDisabledTrackTypes(set);
            return this;
        }

        @Override // gn.z1
        public d setForceHighestSupportedBitrate(boolean z10) {
            this.F.setForceHighestSupportedBitrate(z10);
            return this;
        }

        @Override // gn.z1
        public d setForceLowestBitrate(boolean z10) {
            this.F.setForceLowestBitrate(z10);
            return this;
        }

        @Override // gn.z1
        public d setIgnoredTextSelectionFlags(int i10) {
            this.F.setIgnoredTextSelectionFlags(i10);
            return this;
        }

        @Override // gn.z1
        public d setMaxAudioBitrate(int i10) {
            this.F.setMaxAudioBitrate(i10);
            return this;
        }

        @Override // gn.z1
        public d setMaxAudioChannelCount(int i10) {
            this.F.setMaxAudioChannelCount(i10);
            return this;
        }

        @Override // gn.z1
        public d setMaxVideoBitrate(int i10) {
            this.F.setMaxVideoBitrate(i10);
            return this;
        }

        @Override // gn.z1
        public d setMaxVideoFrameRate(int i10) {
            this.F.setMaxVideoFrameRate(i10);
            return this;
        }

        @Override // gn.z1
        public d setMaxVideoSize(int i10, int i11) {
            this.F.setMaxVideoSize(i10, i11);
            return this;
        }

        @Override // gn.z1
        public d setMaxVideoSizeSd() {
            this.F.setMaxVideoSizeSd();
            return this;
        }

        @Override // gn.z1
        public d setMinVideoBitrate(int i10) {
            this.F.setMinVideoBitrate(i10);
            return this;
        }

        @Override // gn.z1
        public d setMinVideoFrameRate(int i10) {
            this.F.setMinVideoFrameRate(i10);
            return this;
        }

        @Override // gn.z1
        public d setMinVideoSize(int i10, int i11) {
            this.F.setMinVideoSize(i10, i11);
            return this;
        }

        @Override // gn.z1
        public d setOverrideForType(w1 w1Var) {
            this.F.setOverrideForType(w1Var);
            return this;
        }

        @Override // gn.z1
        public d setPreferredAudioLanguage(String str) {
            this.F.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // gn.z1
        public d setPreferredAudioLanguages(String... strArr) {
            this.F.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // gn.z1
        public d setPreferredAudioMimeType(String str) {
            this.F.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // gn.z1
        public d setPreferredAudioMimeTypes(String... strArr) {
            this.F.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // gn.z1
        public d setPreferredAudioRoleFlags(int i10) {
            this.F.setPreferredAudioRoleFlags(i10);
            return this;
        }

        @Override // gn.z1
        public d setPreferredTextLanguage(String str) {
            this.F.setPreferredTextLanguage(str);
            return this;
        }

        @Override // gn.z1
        public d setPreferredTextLanguages(String... strArr) {
            this.F.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // gn.z1
        public d setPreferredTextRoleFlags(int i10) {
            this.F.setPreferredTextRoleFlags(i10);
            return this;
        }

        @Override // gn.z1
        public d setPreferredVideoLanguage(String str) {
            super.setPreferredVideoLanguage(str);
            return this;
        }

        @Override // gn.z1
        public d setPreferredVideoLanguages(String... strArr) {
            super.setPreferredVideoLanguages(strArr);
            return this;
        }

        @Override // gn.z1
        public d setPreferredVideoMimeType(String str) {
            this.F.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // gn.z1
        public d setPreferredVideoMimeTypes(String... strArr) {
            this.F.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // gn.z1
        public d setPreferredVideoRoleFlags(int i10) {
            this.F.setPreferredVideoRoleFlags(i10);
            return this;
        }

        @Override // gn.z1
        public d setPrioritizeImageOverVideoEnabled(boolean z10) {
            this.F.setPrioritizeImageOverVideoEnabled(z10);
            return this;
        }

        @Override // gn.z1
        public d setSelectUndeterminedTextLanguage(boolean z10) {
            this.F.setSelectUndeterminedTextLanguage(z10);
            return this;
        }

        @Override // gn.z1
        public d setTrackTypeDisabled(int i10, boolean z10) {
            this.F.setTrackTypeDisabled(i10, z10);
            return this;
        }

        @Override // gn.z1
        public d setViewportSize(int i10, int i11, boolean z10) {
            this.F.setViewportSize(i10, i11, z10);
            return this;
        }

        public d(Context context) {
            this.F = new fo.f(context);
        }

        @Override // gn.z1
        public d setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
            this.F.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
            return this;
        }

        @Override // gn.z1
        public d setViewportSizeToPhysicalDisplaySize(boolean z10) {
            this.F.setViewportSizeToPhysicalDisplaySize(z10);
            return this;
        }

        @Override // gn.z1
        public d setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.F.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // gn.z1
        public d setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            this.F.setViewportSizeToPhysicalDisplaySize(context, z10);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: fo.e$e, reason: collision with other inner class name */
    public static final class C0566e {

        /* renamed from: d, reason: collision with root package name */
        public static final String f55854d = a1.intToStringMaxRadix(0);

        /* renamed from: e, reason: collision with root package name */
        public static final String f55855e = a1.intToStringMaxRadix(1);

        /* renamed from: f, reason: collision with root package name */
        public static final String f55856f = a1.intToStringMaxRadix(2);

        /* renamed from: a, reason: collision with root package name */
        public final int f55857a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f55858b;

        /* renamed from: c, reason: collision with root package name */
        public final int f55859c;

        public C0566e(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public static C0566e fromBundle(Bundle bundle) {
            int i10 = bundle.getInt(f55854d, -1);
            int[] intArray = bundle.getIntArray(f55855e);
            int i11 = bundle.getInt(f55856f, -1);
            io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0 && i11 >= 0);
            io.bidmachine.media3.common.util.a.checkNotNull(intArray);
            return new C0566e(i10, intArray, i11);
        }

        public boolean containsTrack(int i10) {
            for (int i11 : this.f55858b) {
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
            if (obj != null && C0566e.class == obj.getClass()) {
                C0566e c0566e = (C0566e) obj;
                if (this.f55857a == c0566e.f55857a && Arrays.equals(this.f55858b, c0566e.f55858b) && this.f55859c == c0566e.f55859c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f55858b) + (this.f55857a * 31)) * 31) + this.f55859c;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f55854d, this.f55857a);
            bundle.putIntArray(f55855e, this.f55858b);
            bundle.putInt(f55856f, this.f55859c);
            return bundle;
        }

        public C0566e(int i10, int[] iArr, int i11) {
            this.f55857a = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f55858b = iArrCopyOf;
            this.f55859c = i11;
            Arrays.sort(iArrCopyOf);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f55860a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f55861b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f55862c;

        /* renamed from: d, reason: collision with root package name */
        public final fo.h f55863d;

        public f(Context context, e eVar) {
            AudioManager audioManager = context == null ? null : hn.d.getAudioManager(context);
            if (audioManager == null || a1.isTv((Context) io.bidmachine.media3.common.util.a.checkNotNull(context))) {
                this.f55860a = null;
                this.f55861b = false;
                this.f55862c = null;
                this.f55863d = null;
                return;
            }
            Spatializer spatializer = audioManager.getSpatializer();
            this.f55860a = spatializer;
            this.f55861b = spatializer.getImmersiveAudioLevel() != 0;
            fo.h hVar = new fo.h(eVar);
            this.f55863d = hVar;
            Handler handler = new Handler((Looper) io.bidmachine.media3.common.util.a.checkStateNotNull(Looper.myLooper()));
            this.f55862c = handler;
            spatializer.addOnSpatializerStateChangedListener(new androidx.browser.customtabs.i(handler, 0), hVar);
        }

        public boolean canBeSpatialized(gn.h hVar, io.bidmachine.media3.common.b bVar) throws IllegalArgumentException {
            String str = bVar.f60665o;
            String str2 = bVar.f60665o;
            int i10 = bVar.E;
            if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(str2, "audio/iamf")) {
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(str2, "audio/ac4") && (i10 == 18 || i10 == 21)) {
                i10 = 24;
            }
            int audioTrackChannelConfig = a1.getAudioTrackChannelConfig(i10);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(audioTrackChannelConfig);
            int i11 = bVar.F;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return h0.a(io.bidmachine.media3.common.util.a.checkNotNull(this.f55860a)).canBeSpatialized(hVar.getAudioAttributesV21().f57876a, channelMask.build());
        }

        public boolean isAvailable() {
            return h0.a(io.bidmachine.media3.common.util.a.checkNotNull(this.f55860a)).isAvailable();
        }

        public boolean isEnabled() {
            return h0.a(io.bidmachine.media3.common.util.a.checkNotNull(this.f55860a)).isEnabled();
        }

        public boolean isSpatializationSupported() {
            return this.f55861b;
        }

        public void release() {
            fo.h hVar;
            Handler handler;
            Spatializer spatializer = this.f55860a;
            if (spatializer == null || (hVar = this.f55863d) == null || (handler = this.f55862c) == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(hVar);
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends h implements Comparable {

        /* renamed from: g, reason: collision with root package name */
        public final int f55864g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f55865h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f55866i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f55867j;

        /* renamed from: k, reason: collision with root package name */
        public final int f55868k;

        /* renamed from: l, reason: collision with root package name */
        public final int f55869l;

        /* renamed from: m, reason: collision with root package name */
        public final int f55870m;

        /* renamed from: n, reason: collision with root package name */
        public final int f55871n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f55872o;

        public g(int i10, v1 v1Var, int i11, fo.g gVar, int i12, String str, String str2) {
            int iC;
            super(i10, v1Var, i11);
            int i13 = 0;
            this.f55865h = u1.isFormatSupported(i12, false);
            int i14 = this.f55876f.f60655e;
            int i15 = gVar.f57770y;
            b5 b5Var = gVar.f57767v;
            int i16 = i14 & (~i15);
            this.f55866i = (i16 & 1) != 0;
            this.f55867j = (i16 & 2) != 0;
            b5 b5VarOf = str2 != null ? b5.of(str2) : b5Var.isEmpty() ? b5.of("") : b5Var;
            int i17 = 0;
            while (true) {
                if (i17 >= b5VarOf.size()) {
                    iC = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iC = e.c(this.f55876f, (String) b5VarOf.get(i17), gVar.f57771z);
                    if (iC > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f55868k = i17;
            this.f55869l = iC;
            int i18 = str2 != null ? 1088 : gVar.f57768w;
            int i19 = this.f55876f.f60656f;
            we weVar = e.f55823j;
            int iBitCount = (i19 == 0 || i19 != i18) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
            this.f55870m = iBitCount;
            this.f55872o = (1088 & this.f55876f.f60656f) != 0;
            int iC2 = e.c(this.f55876f, str, e.e(str) == null);
            this.f55871n = iC2;
            boolean z10 = iC > 0 || (b5Var.isEmpty() && iBitCount > 0) || this.f55866i || (this.f55867j && iC2 > 0);
            if (u1.isFormatSupported(i12, gVar.f55906z0) && z10) {
                i13 = 1;
            }
            this.f55864g = i13;
        }

        public static int compareSelections(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static b5 createForTrackGroup(int i10, v1 v1Var, fo.g gVar, int[] iArr, String str, String str2) {
            x4 x4VarBuilder = b5.builder();
            for (int i11 = 0; i11 < v1Var.f58205a; i11++) {
                x4VarBuilder.add((Object) new g(i10, v1Var, i11, gVar, iArr[i11], str, str2));
            }
            return x4VarBuilder.build();
        }

        @Override // fo.e.h
        public int getSelectionEligibility() {
            return this.f55864g;
        }

        @Override // java.lang.Comparable
        public int compareTo(g gVar) {
            n2 n2VarCompare = n2.start().compareFalseFirst(this.f55865h, gVar.f55865h).compare(Integer.valueOf(this.f55868k), Integer.valueOf(gVar.f55868k), we.natural().reverse());
            int i10 = gVar.f55869l;
            int i11 = this.f55869l;
            n2 n2VarCompare2 = n2VarCompare.compare(i11, i10);
            int i12 = gVar.f55870m;
            int i13 = this.f55870m;
            n2 n2VarCompare3 = n2VarCompare2.compare(i13, i12).compareFalseFirst(this.f55866i, gVar.f55866i).compare(Boolean.valueOf(this.f55867j), Boolean.valueOf(gVar.f55867j), i11 == 0 ? we.natural() : we.natural().reverse()).compare(this.f55871n, gVar.f55871n);
            if (i13 == 0) {
                n2VarCompare3 = n2VarCompare3.compareTrueFirst(this.f55872o, gVar.f55872o);
            }
            return n2VarCompare3.result();
        }

        @Override // fo.e.h
        public boolean isCompatibleForAdaptationWith(g gVar) {
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class h {

        /* renamed from: b, reason: collision with root package name */
        public final int f55873b;

        /* renamed from: c, reason: collision with root package name */
        public final v1 f55874c;

        /* renamed from: e, reason: collision with root package name */
        public final int f55875e;

        /* renamed from: f, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f55876f;

        public h(int i10, v1 v1Var, int i11) {
            this.f55873b = i10;
            this.f55874c = v1Var;
            this.f55875e = i11;
            this.f55876f = v1Var.getFormat(i11);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(h hVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends h {

        /* renamed from: g, reason: collision with root package name */
        public final boolean f55877g;

        /* renamed from: h, reason: collision with root package name */
        public final fo.g f55878h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f55879i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f55880j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f55881k;

        /* renamed from: l, reason: collision with root package name */
        public final int f55882l;

        /* renamed from: m, reason: collision with root package name */
        public final int f55883m;

        /* renamed from: n, reason: collision with root package name */
        public final int f55884n;

        /* renamed from: o, reason: collision with root package name */
        public final int f55885o;

        /* renamed from: p, reason: collision with root package name */
        public final int f55886p;

        /* renamed from: q, reason: collision with root package name */
        public final int f55887q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f55888r;

        /* renamed from: s, reason: collision with root package name */
        public final int f55889s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f55890t;

        /* renamed from: u, reason: collision with root package name */
        public final int f55891u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f55892v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f55893w;

        /* renamed from: x, reason: collision with root package name */
        public final int f55894x;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public i(int r7, gn.v1 r8, int r9, fo.g r10, int r11, java.lang.String r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 488
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.e.i.<init>(int, gn.v1, int, fo.g, int, java.lang.String, int, boolean):void");
        }

        public static int compareSelections(List<i> list, List<i> list2) {
            return n2.start().compare((i) Collections.max(list, new af.i(18)), (i) Collections.max(list2, new af.i(18)), new af.i(18)).compare(list.size(), list2.size()).compare((i) Collections.max(list, new af.i(19)), (i) Collections.max(list2, new af.i(19)), new af.i(19)).result();
        }

        public static b5 createForTrackGroup(int i10, v1 v1Var, fo.g gVar, int[] iArr, String str, int i11, Point point) {
            int i12;
            v1 v1Var2 = v1Var;
            fo.g gVar2 = gVar;
            int i13 = point != null ? point.x : gVar2.f57754i;
            int i14 = point != null ? point.y : gVar2.f57755j;
            boolean z10 = gVar2.f57757l;
            we weVar = e.f55823j;
            if (i13 == Integer.MAX_VALUE || i14 == Integer.MAX_VALUE) {
                i12 = Integer.MAX_VALUE;
            } else {
                int i15 = Integer.MAX_VALUE;
                for (int i16 = 0; i16 < v1Var2.f58205a; i16++) {
                    io.bidmachine.media3.common.b format = v1Var2.getFormat(i16);
                    int i17 = format.f60672v;
                    int i18 = format.f60673w;
                    if (i17 > 0 && i18 > 0) {
                        Point maxVideoSizeInViewport = s.getMaxVideoSizeInViewport(z10, i13, i14, i17, i18);
                        int i19 = format.f60672v;
                        int i20 = i19 * i18;
                        if (i19 >= ((int) (maxVideoSizeInViewport.x * 0.98f)) && i18 >= ((int) (maxVideoSizeInViewport.y * 0.98f)) && i20 < i15) {
                            i15 = i20;
                        }
                    }
                }
                i12 = i15;
            }
            x4 x4VarBuilder = b5.builder();
            int i21 = 0;
            while (i21 < v1Var2.f58205a) {
                int pixelCount = v1Var2.getFormat(i21).getPixelCount();
                x4VarBuilder.add((Object) new i(i10, v1Var2, i21, gVar2, iArr[i21], str, i11, i12 == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= i12)));
                i21++;
                v1Var2 = v1Var;
                gVar2 = gVar;
            }
            return x4VarBuilder.build();
        }

        @Override // fo.e.h
        public int getSelectionEligibility() {
            return this.f55891u;
        }

        @Override // fo.e.h
        public boolean isCompatibleForAdaptationWith(i iVar) {
            if (!this.f55890t && !Objects.equals(this.f55876f.f60665o, iVar.f55876f.f60665o)) {
                return false;
            }
            if (this.f55878h.f55898r0) {
                return true;
            }
            return this.f55892v == iVar.f55892v && this.f55893w == iVar.f55893w;
        }
    }

    public e(Context context) {
        this(context, new a.b());
    }

    public static void b(b2 b2Var, a2 a2Var, HashMap map) {
        w1 w1Var;
        for (int i10 = 0; i10 < b2Var.f7552a; i10++) {
            w1 w1Var2 = (w1) a2Var.D.get(b2Var.get(i10));
            if (w1Var2 != null && ((w1Var = (w1) map.get(Integer.valueOf(w1Var2.getType()))) == null || (w1Var.f58241b.isEmpty() && !w1Var2.f58241b.isEmpty()))) {
                map.put(Integer.valueOf(w1Var2.getType()), w1Var2);
            }
        }
    }

    public static int c(io.bidmachine.media3.common.b bVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(bVar.f60654d)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(bVar.f60654d);
        if (strE2 == null || strE == null) {
            return (z10 && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        return a1.splitAtFirst(strE2, "-")[0].equals(a1.splitAtFirst(strE, "-")[0]) ? 2 : 0;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static boolean f(fo.g gVar, int i10, io.bidmachine.media3.common.b bVar) {
        if (u1.getAudioOffloadSupport(i10) == 0) {
            return false;
        }
        if (gVar.f57766u.f58260c && (u1.getAudioOffloadSupport(i10) & 2048) == 0) {
            return false;
        }
        if (gVar.f57766u.f58259b) {
            boolean z10 = (bVar.H == 0 && bVar.I == 0) ? false : true;
            boolean z11 = (u1.getAudioOffloadSupport(i10) & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static Pair g(int i10, n nVar, int[][][] iArr, fo.i iVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccessOf;
        n nVar2 = nVar;
        ArrayList arrayList = new ArrayList();
        int rendererCount = nVar2.getRendererCount();
        int i12 = 0;
        while (i12 < rendererCount) {
            if (i10 == nVar2.getRendererType(i12)) {
                b2 trackGroups = nVar2.getTrackGroups(i12);
                for (int i13 = 0; i13 < trackGroups.f7552a; i13++) {
                    v1 v1Var = trackGroups.get(i13);
                    List<h> listCreate = iVar.create(i12, v1Var, iArr[i12][i13]);
                    int i14 = v1Var.f58205a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        h hVar = listCreate.get(i15);
                        int selectionEligibility = hVar.getSelectionEligibility();
                        if (zArr[i15] || selectionEligibility == 0) {
                            i11 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessOf = b5.of(hVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    h hVar2 = listCreate.get(i16);
                                    int i17 = rendererCount;
                                    if (hVar2.getSelectionEligibility() == 2 && hVar.isCompatibleForAdaptationWith(hVar2)) {
                                        arrayList2.add(hVar2);
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
            nVar2 = nVar;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((h) list.get(i18)).f55875e;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new j(hVar3.f55874c, iArr2), Integer.valueOf(hVar3.f55873b));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d3  */
    @Override // fo.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(fo.n r23, int[][][] r24, int[] r25, ao.k0 r26, gn.u1 r27) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.e.a(fo.n, int[][][], int[], ao.k0, gn.u1):android.util.Pair");
    }

    public fo.f buildUponParameters() {
        return getParameters().buildUpon();
    }

    public final void d() {
        boolean z10;
        t tVar;
        f fVar;
        synchronized (this.f55824d) {
            try {
                z10 = this.f55827g.f55905y0 && a1.f60679a >= 32 && (fVar = this.f55828h) != null && fVar.isSpatializationSupported();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (tVar = this.f55923a) == null) {
            return;
        }
        tVar.onTrackSelectionsInvalidated();
    }

    public final void h(fo.g gVar) {
        boolean zEquals;
        io.bidmachine.media3.common.util.a.checkNotNull(gVar);
        synchronized (this.f55824d) {
            zEquals = this.f55827g.equals(gVar);
            this.f55827g = gVar;
        }
        if (zEquals) {
            return;
        }
        if (gVar.f55905y0 && this.f55825e == null) {
            b0.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        t tVar = this.f55923a;
        if (tVar != null) {
            tVar.onTrackSelectionsInvalidated();
        }
    }

    @Override // fo.u
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.t1
    public void onRendererCapabilitiesChanged(s1 s1Var) {
        boolean z10;
        t tVar;
        synchronized (this.f55824d) {
            z10 = this.f55827g.C0;
        }
        if (!z10 || (tVar = this.f55923a) == null) {
            return;
        }
        tVar.onRendererCapabilitiesChanged(s1Var);
    }

    @Override // fo.u
    public void release() {
        f fVar;
        if (a1.f60679a >= 32 && (fVar = this.f55828h) != null) {
            fVar.release();
        }
        super.release();
    }

    @Override // fo.u
    public void setAudioAttributes(gn.h hVar) {
        if (this.f55829i.equals(hVar)) {
            return;
        }
        this.f55829i = hVar;
        d();
    }

    @Override // fo.u
    public void setParameters(a2 a2Var) {
        if (a2Var instanceof fo.g) {
            h((fo.g) a2Var);
        }
        fo.f fVar = new fo.f(getParameters());
        fVar.a(a2Var);
        h(fVar.build());
    }

    public e(Context context, k kVar) {
        this(context, fo.g.F0, kVar);
    }

    @Override // fo.u
    public fo.g getParameters() {
        fo.g gVar;
        synchronized (this.f55824d) {
            gVar = this.f55827g;
        }
        return gVar;
    }

    public e(Context context, a2 a2Var) {
        this(context, a2Var, new a.b());
    }

    @Deprecated
    public e(a2 a2Var, k kVar) {
        this(a2Var, kVar, (Context) null);
    }

    public e(Context context, a2 a2Var, k kVar) {
        this(a2Var, kVar, context);
    }

    public e(a2 a2Var, k kVar, Context context) {
        this.f55824d = new Object();
        this.f55825e = context != null ? context.getApplicationContext() : null;
        this.f55826f = kVar;
        if (a2Var instanceof fo.g) {
            this.f55827g = (fo.g) a2Var;
        } else {
            fo.f fVarBuildUpon = fo.g.F0.buildUpon();
            fVarBuildUpon.a(a2Var);
            this.f55827g = fVarBuildUpon.build();
        }
        this.f55829i = gn.h.f57892g;
        if (this.f55827g.f55905y0 && context == null) {
            b0.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Deprecated
    public void setParameters(d dVar) {
        h(dVar.build());
    }

    public void setParameters(fo.f fVar) {
        h(fVar.build());
    }

    @Override // fo.u
    public t1 getRendererCapabilitiesListener() {
        return this;
    }
}
