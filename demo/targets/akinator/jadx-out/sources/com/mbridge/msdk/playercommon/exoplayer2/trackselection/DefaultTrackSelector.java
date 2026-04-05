package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    private static final int[] NO_TRACKS = new int[0];
    private static final int WITHIN_RENDERER_CAPABILITIES_BONUS = 1000;
    private final TrackSelection.Factory adaptiveTrackSelectionFactory;
    private final AtomicReference<Parameters> parametersReference;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AudioConfigurationTuple {
        public final int channelCount;
        public final String mimeType;
        public final int sampleRate;

        public AudioConfigurationTuple(int i10, int i11, String str) {
            this.channelCount = i10;
            this.sampleRate = i11;
            this.mimeType = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AudioConfigurationTuple.class == obj.getClass()) {
                AudioConfigurationTuple audioConfigurationTuple = (AudioConfigurationTuple) obj;
                if (this.channelCount == audioConfigurationTuple.channelCount && this.sampleRate == audioConfigurationTuple.sampleRate && TextUtils.equals(this.mimeType, audioConfigurationTuple.mimeType)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.channelCount * 31) + this.sampleRate) * 31;
            String str = this.mimeType;
            return i10 + (str != null ? str.hashCode() : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AudioTrackScore implements Comparable<AudioTrackScore> {
        private final int bitrate;
        private final int channelCount;
        private final int defaultSelectionFlagScore;
        private final int matchLanguageScore;
        private final Parameters parameters;
        private final int sampleRate;
        private final int withinRendererCapabilitiesScore;

        public AudioTrackScore(Format format, Parameters parameters, int i10) {
            this.parameters = parameters;
            this.withinRendererCapabilitiesScore = DefaultTrackSelector.isSupported(i10, false) ? 1 : 0;
            this.matchLanguageScore = DefaultTrackSelector.formatHasLanguage(format, parameters.preferredAudioLanguage) ? 1 : 0;
            this.defaultSelectionFlagScore = (format.selectionFlags & 1) != 0 ? 1 : 0;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.bitrate = format.bitrate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AudioTrackScore.class == obj.getClass()) {
                AudioTrackScore audioTrackScore = (AudioTrackScore) obj;
                if (this.withinRendererCapabilitiesScore == audioTrackScore.withinRendererCapabilitiesScore && this.matchLanguageScore == audioTrackScore.matchLanguageScore && this.defaultSelectionFlagScore == audioTrackScore.defaultSelectionFlagScore && this.channelCount == audioTrackScore.channelCount && this.sampleRate == audioTrackScore.sampleRate && this.bitrate == audioTrackScore.bitrate) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.withinRendererCapabilitiesScore * 31) + this.matchLanguageScore) * 31) + this.defaultSelectionFlagScore) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.bitrate;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackScore audioTrackScore) {
            int i10 = this.withinRendererCapabilitiesScore;
            int i11 = audioTrackScore.withinRendererCapabilitiesScore;
            if (i10 != i11) {
                return DefaultTrackSelector.compareInts(i10, i11);
            }
            int i12 = this.matchLanguageScore;
            int i13 = audioTrackScore.matchLanguageScore;
            if (i12 != i13) {
                return DefaultTrackSelector.compareInts(i12, i13);
            }
            int i14 = this.defaultSelectionFlagScore;
            int i15 = audioTrackScore.defaultSelectionFlagScore;
            if (i14 != i15) {
                return DefaultTrackSelector.compareInts(i14, i15);
            }
            if (this.parameters.forceLowestBitrate) {
                return DefaultTrackSelector.compareInts(audioTrackScore.bitrate, this.bitrate);
            }
            int i16 = i10 != 1 ? -1 : 1;
            int i17 = this.channelCount;
            int i18 = audioTrackScore.channelCount;
            if (i17 != i18) {
                return DefaultTrackSelector.compareInts(i17, i18) * i16;
            }
            int i19 = this.sampleRate;
            int i20 = audioTrackScore.sampleRate;
            return i19 != i20 ? DefaultTrackSelector.compareInts(i19, i20) * i16 : DefaultTrackSelector.compareInts(this.bitrate, audioTrackScore.bitrate) * i16;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Parameters implements Parcelable {
        public final boolean allowMixedMimeAdaptiveness;
        public final boolean allowNonSeamlessAdaptiveness;
        public final int disabledTextTrackSelectionFlags;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final boolean forceLowestBitrate;
        public final int maxVideoBitrate;
        public final int maxVideoHeight;
        public final int maxVideoWidth;
        public final String preferredAudioLanguage;
        public final String preferredTextLanguage;
        private final SparseBooleanArray rendererDisabledFlags;
        public final boolean selectUndeterminedTextLanguage;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final int tunnelingAudioSessionId;
        public final int viewportHeight;
        public final boolean viewportOrientationMayChange;
        public final int viewportWidth;
        public static final Parameters DEFAULT = new Parameters();
        public static final Parcelable.Creator<Parameters> CREATOR = new Parcelable.Creator<Parameters>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.Parameters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters[] newArray(int i10) {
                return new Parameters[i10];
            }
        };

        private Parameters() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> readSelectionOverrides(Parcel parcel) {
            int i10 = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                HashMap map = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    map.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i12, map);
            }
            return sparseArray;
        }

        private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                Map<TrackGroupArray, SelectionOverride> mapValueAt = sparseArray.valueAt(i10);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        public ParametersBuilder buildUpon() {
            return new ParametersBuilder(this);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (this.selectUndeterminedTextLanguage == parameters.selectUndeterminedTextLanguage && this.disabledTextTrackSelectionFlags == parameters.disabledTextTrackSelectionFlags && this.forceLowestBitrate == parameters.forceLowestBitrate && this.allowMixedMimeAdaptiveness == parameters.allowMixedMimeAdaptiveness && this.allowNonSeamlessAdaptiveness == parameters.allowNonSeamlessAdaptiveness && this.maxVideoWidth == parameters.maxVideoWidth && this.maxVideoHeight == parameters.maxVideoHeight && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.viewportOrientationMayChange == parameters.viewportOrientationMayChange && this.viewportWidth == parameters.viewportWidth && this.viewportHeight == parameters.viewportHeight && this.maxVideoBitrate == parameters.maxVideoBitrate && this.tunnelingAudioSessionId == parameters.tunnelingAudioSessionId && TextUtils.equals(this.preferredAudioLanguage, parameters.preferredAudioLanguage) && TextUtils.equals(this.preferredTextLanguage, parameters.preferredTextLanguage) && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean getRendererDisabled(int i10) {
            return this.rendererDisabledFlags.get(i10);
        }

        public final SelectionOverride getSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean hasSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            return map != null && map.containsKey(trackGroupArray);
        }

        public int hashCode() {
            int i10 = (((((((((((((((((((((((((((this.selectUndeterminedTextLanguage ? 1 : 0) * 31) + this.disabledTextTrackSelectionFlags) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.allowMixedMimeAdaptiveness ? 1 : 0)) * 31) + (this.allowNonSeamlessAdaptiveness ? 1 : 0)) * 31) + this.maxVideoWidth) * 31) + this.maxVideoHeight) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.maxVideoBitrate) * 31) + this.tunnelingAudioSessionId) * 31;
            String str = this.preferredAudioLanguage;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.preferredTextLanguage;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            writeSelectionOverridesToParcel(parcel, this.selectionOverrides);
            parcel.writeSparseBooleanArray(this.rendererDisabledFlags);
            parcel.writeString(this.preferredAudioLanguage);
            parcel.writeString(this.preferredTextLanguage);
            Util.writeBoolean(parcel, this.selectUndeterminedTextLanguage);
            parcel.writeInt(this.disabledTextTrackSelectionFlags);
            Util.writeBoolean(parcel, this.forceLowestBitrate);
            Util.writeBoolean(parcel, this.allowMixedMimeAdaptiveness);
            Util.writeBoolean(parcel, this.allowNonSeamlessAdaptiveness);
            parcel.writeInt(this.maxVideoWidth);
            parcel.writeInt(this.maxVideoHeight);
            parcel.writeInt(this.maxVideoBitrate);
            Util.writeBoolean(parcel, this.exceedVideoConstraintsIfNecessary);
            Util.writeBoolean(parcel, this.exceedRendererCapabilitiesIfNecessary);
            parcel.writeInt(this.viewportWidth);
            parcel.writeInt(this.viewportHeight);
            Util.writeBoolean(parcel, this.viewportOrientationMayChange);
            parcel.writeInt(this.tunnelingAudioSessionId);
        }

        public Parameters(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, int i13, boolean z14, boolean z15, int i14, int i15, boolean z16, int i16) {
            this.selectionOverrides = sparseArray;
            this.rendererDisabledFlags = sparseBooleanArray;
            this.preferredAudioLanguage = Util.normalizeLanguageCode(str);
            this.preferredTextLanguage = Util.normalizeLanguageCode(str2);
            this.selectUndeterminedTextLanguage = z10;
            this.disabledTextTrackSelectionFlags = i10;
            this.forceLowestBitrate = z11;
            this.allowMixedMimeAdaptiveness = z12;
            this.allowNonSeamlessAdaptiveness = z13;
            this.maxVideoWidth = i11;
            this.maxVideoHeight = i12;
            this.maxVideoBitrate = i13;
            this.exceedVideoConstraintsIfNecessary = z14;
            this.exceedRendererCapabilitiesIfNecessary = z15;
            this.viewportWidth = i14;
            this.viewportHeight = i15;
            this.viewportOrientationMayChange = z16;
            this.tunnelingAudioSessionId = i16;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public Parameters(Parcel parcel) {
            this.selectionOverrides = readSelectionOverrides(parcel);
            this.rendererDisabledFlags = parcel.readSparseBooleanArray();
            this.preferredAudioLanguage = parcel.readString();
            this.preferredTextLanguage = parcel.readString();
            this.selectUndeterminedTextLanguage = Util.readBoolean(parcel);
            this.disabledTextTrackSelectionFlags = parcel.readInt();
            this.forceLowestBitrate = Util.readBoolean(parcel);
            this.allowMixedMimeAdaptiveness = Util.readBoolean(parcel);
            this.allowNonSeamlessAdaptiveness = Util.readBoolean(parcel);
            this.maxVideoWidth = parcel.readInt();
            this.maxVideoHeight = parcel.readInt();
            this.maxVideoBitrate = parcel.readInt();
            this.exceedVideoConstraintsIfNecessary = Util.readBoolean(parcel);
            this.exceedRendererCapabilitiesIfNecessary = Util.readBoolean(parcel);
            this.viewportWidth = parcel.readInt();
            this.viewportHeight = parcel.readInt();
            this.viewportOrientationMayChange = Util.readBoolean(parcel);
            this.tunnelingAudioSessionId = parcel.readInt();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ParametersBuilder {
        private boolean allowMixedMimeAdaptiveness;
        private boolean allowNonSeamlessAdaptiveness;
        private int disabledTextTrackSelectionFlags;
        private boolean exceedRendererCapabilitiesIfNecessary;
        private boolean exceedVideoConstraintsIfNecessary;
        private boolean forceLowestBitrate;
        private int maxVideoBitrate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private String preferredAudioLanguage;
        private String preferredTextLanguage;
        private final SparseBooleanArray rendererDisabledFlags;
        private boolean selectUndeterminedTextLanguage;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        private int tunnelingAudioSessionId;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        public Parameters build() {
            return new Parameters(this.selectionOverrides, this.rendererDisabledFlags, this.preferredAudioLanguage, this.preferredTextLanguage, this.selectUndeterminedTextLanguage, this.disabledTextTrackSelectionFlags, this.forceLowestBitrate, this.allowMixedMimeAdaptiveness, this.allowNonSeamlessAdaptiveness, this.maxVideoWidth, this.maxVideoHeight, this.maxVideoBitrate, this.exceedVideoConstraintsIfNecessary, this.exceedRendererCapabilitiesIfNecessary, this.viewportWidth, this.viewportHeight, this.viewportOrientationMayChange, this.tunnelingAudioSessionId);
        }

        public final ParametersBuilder clearSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null && map.containsKey(trackGroupArray)) {
                map.remove(trackGroupArray);
                if (map.isEmpty()) {
                    this.selectionOverrides.remove(i10);
                }
            }
            return this;
        }

        public final ParametersBuilder clearSelectionOverrides(int i10) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null && !map.isEmpty()) {
                this.selectionOverrides.remove(i10);
            }
            return this;
        }

        public ParametersBuilder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public ParametersBuilder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public ParametersBuilder setAllowMixedMimeAdaptiveness(boolean z10) {
            this.allowMixedMimeAdaptiveness = z10;
            return this;
        }

        public ParametersBuilder setAllowNonSeamlessAdaptiveness(boolean z10) {
            this.allowNonSeamlessAdaptiveness = z10;
            return this;
        }

        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i10) {
            this.disabledTextTrackSelectionFlags = i10;
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z10) {
            this.exceedRendererCapabilitiesIfNecessary = z10;
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z10) {
            this.exceedVideoConstraintsIfNecessary = z10;
            return this;
        }

        public ParametersBuilder setForceLowestBitrate(boolean z10) {
            this.forceLowestBitrate = z10;
            return this;
        }

        public ParametersBuilder setMaxVideoBitrate(int i10) {
            this.maxVideoBitrate = i10;
            return this;
        }

        public ParametersBuilder setMaxVideoSize(int i10, int i11) {
            this.maxVideoWidth = i10;
            this.maxVideoHeight = i11;
            return this;
        }

        public ParametersBuilder setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public ParametersBuilder setPreferredAudioLanguage(String str) {
            this.preferredAudioLanguage = str;
            return this;
        }

        public ParametersBuilder setPreferredTextLanguage(String str) {
            this.preferredTextLanguage = str;
            return this;
        }

        public final ParametersBuilder setRendererDisabled(int i10, boolean z10) {
            if (this.rendererDisabledFlags.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.rendererDisabledFlags.put(i10, true);
                return this;
            }
            this.rendererDisabledFlags.delete(i10);
            return this;
        }

        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z10) {
            this.selectUndeterminedTextLanguage = z10;
            return this;
        }

        public final ParametersBuilder setSelectionOverride(int i10, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.selectionOverrides.put(i10, map);
            }
            if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        public ParametersBuilder setTunnelingAudioSessionId(int i10) {
            if (this.tunnelingAudioSessionId != i10) {
                this.tunnelingAudioSessionId = i10;
            }
            return this;
        }

        public ParametersBuilder setViewportSize(int i10, int i11, boolean z10) {
            this.viewportWidth = i10;
            this.viewportHeight = i11;
            this.viewportOrientationMayChange = z10;
            return this;
        }

        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            Point physicalDisplaySize = Util.getPhysicalDisplaySize(context);
            return setViewportSize(physicalDisplaySize.x, physicalDisplaySize.y, z10);
        }

        public ParametersBuilder() {
            this(Parameters.DEFAULT);
        }

        private ParametersBuilder(Parameters parameters) {
            this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
            this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            this.preferredAudioLanguage = parameters.preferredAudioLanguage;
            this.preferredTextLanguage = parameters.preferredTextLanguage;
            this.selectUndeterminedTextLanguage = parameters.selectUndeterminedTextLanguage;
            this.disabledTextTrackSelectionFlags = parameters.disabledTextTrackSelectionFlags;
            this.forceLowestBitrate = parameters.forceLowestBitrate;
            this.allowMixedMimeAdaptiveness = parameters.allowMixedMimeAdaptiveness;
            this.allowNonSeamlessAdaptiveness = parameters.allowNonSeamlessAdaptiveness;
            this.maxVideoWidth = parameters.maxVideoWidth;
            this.maxVideoHeight = parameters.maxVideoHeight;
            this.maxVideoBitrate = parameters.maxVideoBitrate;
            this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
            this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
            this.viewportWidth = parameters.viewportWidth;
            this.viewportHeight = parameters.viewportHeight;
            this.viewportOrientationMayChange = parameters.viewportOrientationMayChange;
            this.tunnelingAudioSessionId = parameters.tunnelingAudioSessionId;
        }

        public final ParametersBuilder clearSelectionOverrides() {
            if (this.selectionOverrides.size() == 0) {
                return this;
            }
            this.selectionOverrides.clear();
            return this;
        }
    }

    public DefaultTrackSelector() {
        this((TrackSelection.Factory) null);
    }

    private static int compareFormatValues(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareInts(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!isSupportedAdaptiveVideoTrack(trackGroup.getFormat(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13)) {
                list.remove(size);
            }
        }
    }

    public static boolean formatHasLanguage(Format format, String str) {
        return str != null && TextUtils.equals(str, Util.normalizeLanguageCode(format.language));
    }

    public static boolean formatHasNoLanguage(Format format) {
        return TextUtils.isEmpty(format.language) || formatHasLanguage(format, C.LANGUAGE_UNDETERMINED);
    }

    private static int getAdaptiveAudioTrackCount(TrackGroup trackGroup, int[] iArr, AudioConfigurationTuple audioConfigurationTuple) {
        int i10 = 0;
        for (int i11 = 0; i11 < trackGroup.length; i11++) {
            if (isSupportedAdaptiveAudioTrack(trackGroup.getFormat(i11), iArr[i11], audioConfigurationTuple)) {
                i10++;
            }
        }
        return i10;
    }

    private static int[] getAdaptiveAudioTracks(TrackGroup trackGroup, int[] iArr, boolean z10) {
        int adaptiveAudioTrackCount;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        AudioConfigurationTuple audioConfigurationTuple = null;
        for (int i11 = 0; i11 < trackGroup.length; i11++) {
            Format format = trackGroup.getFormat(i11);
            AudioConfigurationTuple audioConfigurationTuple2 = new AudioConfigurationTuple(format.channelCount, format.sampleRate, z10 ? null : format.sampleMimeType);
            if (hashSet.add(audioConfigurationTuple2) && (adaptiveAudioTrackCount = getAdaptiveAudioTrackCount(trackGroup, iArr, audioConfigurationTuple2)) > i10) {
                i10 = adaptiveAudioTrackCount;
                audioConfigurationTuple = audioConfigurationTuple2;
            }
        }
        if (i10 <= 1) {
            return NO_TRACKS;
        }
        int[] iArr2 = new int[i10];
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroup.length; i13++) {
            if (isSupportedAdaptiveAudioTrack(trackGroup.getFormat(i13), iArr[i13], (AudioConfigurationTuple) Assertions.checkNotNull(audioConfigurationTuple))) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return iArr2;
    }

    private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int iIntValue = list.get(i15).intValue();
            if (isSupportedAdaptiveVideoTrack(trackGroup.getFormat(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    private static int[] getAdaptiveVideoTracksForGroup(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        int i16;
        int i17;
        int i18;
        String str;
        int i19;
        int i20;
        int i21;
        int[] iArr2;
        TrackGroup trackGroup2;
        if (trackGroup.length < 2) {
            return NO_TRACKS;
        }
        List<Integer> viewportFilteredTrackIndices = getViewportFilteredTrackIndices(trackGroup, i14, i15, z11);
        if (viewportFilteredTrackIndices.size() < 2) {
            return NO_TRACKS;
        }
        if (z10) {
            i16 = i12;
            i17 = i11;
            i18 = i13;
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            int i22 = 0;
            int i23 = 0;
            String str2 = null;
            while (i22 < viewportFilteredTrackIndices.size()) {
                String str3 = trackGroup.getFormat(viewportFilteredTrackIndices.get(i22).intValue()).sampleMimeType;
                if (hashSet.add(str3)) {
                    int i24 = i13;
                    i21 = i12;
                    i19 = i11;
                    iArr2 = iArr;
                    trackGroup2 = trackGroup;
                    int adaptiveVideoTrackCountForMimeType = getAdaptiveVideoTrackCountForMimeType(trackGroup2, iArr2, i10, str3, i19, i21, i24, viewportFilteredTrackIndices);
                    i20 = i24;
                    if (adaptiveVideoTrackCountForMimeType > i23) {
                        i23 = adaptiveVideoTrackCountForMimeType;
                        str2 = str3;
                    }
                } else {
                    int i25 = i12;
                    i19 = i11;
                    i20 = i13;
                    i21 = i25;
                    iArr2 = iArr;
                    trackGroup2 = trackGroup;
                }
                i22++;
                int i26 = i21;
                i13 = i20;
                i11 = i19;
                i12 = i26;
                trackGroup = trackGroup2;
                iArr = iArr2;
            }
            i16 = i12;
            i17 = i11;
            i18 = i13;
            str = str2;
        }
        filterAdaptiveVideoTrackCountForMimeType(trackGroup, iArr, i10, str, i17, i16, i18, viewportFilteredTrackIndices);
        return viewportFilteredTrackIndices.size() < 2 ? NO_TRACKS : Util.toArray(viewportFilteredTrackIndices);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
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
            int r4 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> getViewportFilteredTrackIndices(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(trackGroup.length);
        for (int i13 = 0; i13 < trackGroup.length; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < trackGroup.length; i15++) {
                Format format = trackGroup.getFormat(i15);
                int i16 = format.width;
                if (i16 > 0 && (i12 = format.height) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z10, i10, i11, i16, i12);
                    int i17 = format.width;
                    int i18 = format.height;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i18 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int pixelCount = trackGroup.getFormat(((Integer) arrayList.get(size)).intValue()).getPixelCount();
                    if (pixelCount == -1 || pixelCount > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isSupported(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    private static boolean isSupportedAdaptiveAudioTrack(Format format, int i10, AudioConfigurationTuple audioConfigurationTuple) {
        String str;
        return isSupported(i10, false) && format.channelCount == audioConfigurationTuple.channelCount && format.sampleRate == audioConfigurationTuple.sampleRate && ((str = audioConfigurationTuple.mimeType) == null || TextUtils.equals(str, format.sampleMimeType));
    }

    private static boolean isSupportedAdaptiveVideoTrack(Format format, String str, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        return isSupported(i10, false) && (i10 & i11) != 0 && (str == null || Util.areEqual(format.sampleMimeType, str)) && (((i15 = format.width) == -1 || i15 <= i12) && (((i16 = format.height) == -1 || i16 <= i13) && ((i17 = format.bitrate) == -1 || i17 <= i14)));
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, TrackSelection[] trackSelectionArr, int i10) {
        boolean z10;
        if (i10 == 0) {
            return;
        }
        boolean z11 = false;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < mappedTrackInfo.getRendererCount(); i13++) {
            int rendererType = mappedTrackInfo.getRendererType(i13);
            TrackSelection trackSelection = trackSelectionArr[i13];
            if ((rendererType == 1 || rendererType == 2) && trackSelection != null && rendererSupportsTunneling(iArr[i13], mappedTrackInfo.getTrackGroups(i13), trackSelection)) {
                if (rendererType == 1) {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i13;
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i13;
                }
            }
        }
        z10 = true;
        if (i12 != -1 && i11 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(i10);
            rendererConfigurationArr[i12] = rendererConfiguration;
            rendererConfigurationArr[i11] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, TrackSelection trackSelection) {
        if (trackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(trackSelection.getTrackGroup());
        for (int i10 = 0; i10 < trackSelection.length(); i10++) {
            if ((iArr[iIndexOf][trackSelection.getIndexInTrackGroup(i10)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    private static TrackSelection selectAdaptiveVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        int i11 = parameters.allowNonSeamlessAdaptiveness ? 24 : 16;
        boolean z10 = parameters.allowMixedMimeAdaptiveness && (i10 & i11) != 0;
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup = trackGroupArray.get(i12);
            int[] adaptiveVideoTracksForGroup = getAdaptiveVideoTracksForGroup(trackGroup, iArr[i12], z10, i11, parameters.maxVideoWidth, parameters.maxVideoHeight, parameters.maxVideoBitrate, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            if (adaptiveVideoTracksForGroup.length > 0) {
                return ((TrackSelection.Factory) Assertions.checkNotNull(factory)).createTrackSelection(trackGroup, adaptiveVideoTracksForGroup);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection selectFixedVideoTrack(com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray r19, int[][] r20, com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.Parameters r21) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.selectFixedVideoTrack(com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray, int[][], com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection");
    }

    public ParametersBuilder buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Deprecated
    public final void clearSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
        setParameters(buildUponParameters().clearSelectionOverride(i10, trackGroupArray));
    }

    @Deprecated
    public final void clearSelectionOverrides(int i10) {
        setParameters(buildUponParameters().clearSelectionOverrides(i10));
    }

    public Parameters getParameters() {
        return this.parametersReference.get();
    }

    @Deprecated
    public final boolean getRendererDisabled(int i10) {
        return getParameters().getRendererDisabled(i10);
    }

    @Deprecated
    public final SelectionOverride getSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
        return getParameters().getSelectionOverride(i10, trackGroupArray);
    }

    @Deprecated
    public final boolean hasSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
        return getParameters().hasSelectionOverride(i10, trackGroupArray);
    }

    public TrackSelection[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        int rendererCount = mappedTrackInfo.getRendererCount();
        TrackSelection[] trackSelectionArr = new TrackSelection[rendererCount];
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            if (i10 >= rendererCount) {
                break;
            }
            if (2 == mappedTrackInfo.getRendererType(i10)) {
                if (!z10) {
                    TrackSelection trackSelectionSelectVideoTrack = selectVideoTrack(mappedTrackInfo.getTrackGroups(i10), iArr[i10], iArr2[i10], parameters, this.adaptiveTrackSelectionFactory);
                    trackSelectionArr[i10] = trackSelectionSelectVideoTrack;
                    z10 = trackSelectionSelectVideoTrack != null;
                }
                z11 |= mappedTrackInfo.getTrackGroups(i10).length > 0;
            }
            i10++;
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i11 = 0; i11 < rendererCount; i11++) {
            int rendererType = mappedTrackInfo.getRendererType(i11);
            if (rendererType != 1) {
                if (rendererType != 2) {
                    if (rendererType != 3) {
                        trackSelectionArr[i11] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i11), iArr[i11], parameters);
                    } else if (!z13) {
                        TrackSelection trackSelectionSelectTextTrack = selectTextTrack(mappedTrackInfo.getTrackGroups(i11), iArr[i11], parameters);
                        trackSelectionArr[i11] = trackSelectionSelectTextTrack;
                        z13 = trackSelectionSelectTextTrack != null;
                    }
                }
            } else if (!z12) {
                TrackSelection trackSelectionSelectAudioTrack = selectAudioTrack(mappedTrackInfo.getTrackGroups(i11), iArr[i11], iArr2[i11], parameters, z11 ? null : this.adaptiveTrackSelectionFactory);
                trackSelectionArr[i11] = trackSelectionSelectAudioTrack;
                z12 = trackSelectionSelectAudioTrack != null;
            }
        }
        return trackSelectionArr;
    }

    public TrackSelection selectAudioTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        int i11 = -1;
        int i12 = -1;
        AudioTrackScore audioTrackScore = null;
        for (int i13 = 0; i13 < trackGroupArray.length; i13++) {
            TrackGroup trackGroup = trackGroupArray.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroup.length; i14++) {
                if (isSupported(iArr2[i14], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    AudioTrackScore audioTrackScore2 = new AudioTrackScore(trackGroup.getFormat(i14), parameters, iArr2[i14]);
                    if (audioTrackScore == null || audioTrackScore2.compareTo(audioTrackScore) > 0) {
                        i11 = i13;
                        i12 = i14;
                        audioTrackScore = audioTrackScore2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup trackGroup2 = trackGroupArray.get(i11);
        if (!parameters.forceLowestBitrate && factory != null) {
            int[] adaptiveAudioTracks = getAdaptiveAudioTracks(trackGroup2, iArr[i11], parameters.allowMixedMimeAdaptiveness);
            if (adaptiveAudioTracks.length > 0) {
                return factory.createTrackSelection(trackGroup2, adaptiveAudioTracks);
            }
        }
        return new FixedTrackSelection(trackGroup2, i12);
    }

    public TrackSelection selectOtherTrack(int i10, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroupArray.length; i13++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroup2.length; i14++) {
                if (isSupported(iArr2[i14], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    int i15 = (trackGroup2.getFormat(i14).selectionFlags & 1) != 0 ? 2 : 1;
                    if (isSupported(iArr2[i14], false)) {
                        i15 += 1000;
                    }
                    if (i15 > i12) {
                        trackGroup = trackGroup2;
                        i11 = i14;
                        i12 = i15;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new FixedTrackSelection(trackGroup, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackSelection selectTextTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        int i10 = 0;
        int i11 = 0;
        TrackGroup trackGroup = null;
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < trackGroup2.length; i13++) {
                if (isSupported(iArr2[i13], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    Format format = trackGroup2.getFormat(i13);
                    int i14 = format.selectionFlags & (~parameters.disabledTextTrackSelectionFlags);
                    int i15 = 1;
                    Object[] objArr = (i14 & 1) != 0;
                    Object[] objArr2 = (i14 & 2) != 0;
                    boolean hasLanguage = formatHasLanguage(format, parameters.preferredTextLanguage);
                    if (hasLanguage || (parameters.selectUndeterminedTextLanguage && formatHasNoLanguage(format))) {
                        i15 = (objArr != false ? 8 : objArr2 == false ? 6 : 4) + (hasLanguage ? 1 : 0);
                    } else if (objArr == true) {
                        i15 = 3;
                    } else if (objArr2 != false) {
                        if (formatHasLanguage(format, parameters.preferredAudioLanguage)) {
                            i15 = 2;
                        }
                    }
                    if (isSupported(iArr2[i13], false)) {
                        i15 += 1000;
                    }
                    if (i15 > i11) {
                        trackGroup = trackGroup2;
                        i10 = i13;
                        i11 = i15;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new FixedTrackSelection(trackGroup, i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2) throws ExoPlaybackException {
        Parameters parameters = this.parametersReference.get();
        int rendererCount = mappedTrackInfo.getRendererCount();
        TrackSelection[] trackSelectionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        for (int i10 = 0; i10 < rendererCount; i10++) {
            if (parameters.getRendererDisabled(i10)) {
                trackSelectionArrSelectAllTracks[i10] = null;
            } else {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i10);
                if (parameters.hasSelectionOverride(i10, trackGroups)) {
                    SelectionOverride selectionOverride = parameters.getSelectionOverride(i10, trackGroups);
                    if (selectionOverride == null) {
                        trackSelectionArrSelectAllTracks[i10] = null;
                    } else if (selectionOverride.length == 1) {
                        trackSelectionArrSelectAllTracks[i10] = new FixedTrackSelection(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks[0]);
                    } else {
                        trackSelectionArrSelectAllTracks[i10] = ((TrackSelection.Factory) Assertions.checkNotNull(this.adaptiveTrackSelectionFactory)).createTrackSelection(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks);
                    }
                }
            }
        }
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i11 = 0; i11 < rendererCount; i11++) {
            rendererConfigurationArr[i11] = (parameters.getRendererDisabled(i11) || (mappedTrackInfo.getRendererType(i11) != 5 && trackSelectionArrSelectAllTracks[i11] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, trackSelectionArrSelectAllTracks, parameters.tunnelingAudioSessionId);
        return Pair.create(rendererConfigurationArr, trackSelectionArrSelectAllTracks);
    }

    public TrackSelection selectVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        TrackSelection trackSelectionSelectAdaptiveVideoTrack = (parameters.forceLowestBitrate || factory == null) ? null : selectAdaptiveVideoTrack(trackGroupArray, iArr, i10, parameters, factory);
        return trackSelectionSelectAdaptiveVideoTrack == null ? selectFixedVideoTrack(trackGroupArray, iArr, parameters) : trackSelectionSelectAdaptiveVideoTrack;
    }

    public void setParameters(Parameters parameters) {
        Assertions.checkNotNull(parameters);
        if (this.parametersReference.getAndSet(parameters).equals(parameters)) {
            return;
        }
        invalidate();
    }

    @Deprecated
    public final void setRendererDisabled(int i10, boolean z10) {
        setParameters(buildUponParameters().setRendererDisabled(i10, z10));
    }

    @Deprecated
    public final void setSelectionOverride(int i10, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
        setParameters(buildUponParameters().setSelectionOverride(i10, trackGroupArray, selectionOverride));
    }

    @Deprecated
    public void setTunnelingAudioSessionId(int i10) {
        setParameters(buildUponParameters().setTunnelingAudioSessionId(i10));
    }

    public DefaultTrackSelector(BandwidthMeter bandwidthMeter) {
        this(new AdaptiveTrackSelection.Factory(bandwidthMeter));
    }

    @Deprecated
    public final void clearSelectionOverrides() {
        setParameters(buildUponParameters().clearSelectionOverrides());
    }

    public DefaultTrackSelector(TrackSelection.Factory factory) {
        this.adaptiveTrackSelectionFactory = factory;
        this.parametersReference = new AtomicReference<>(Parameters.DEFAULT);
    }

    public void setParameters(ParametersBuilder parametersBuilder) {
        setParameters(parametersBuilder.build());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new Parcelable.Creator<SelectionOverride>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride[] newArray(int i10) {
                return new SelectionOverride[i10];
            }
        };
        public final int groupIndex;
        public final int length;
        public final int[] tracks;

        public SelectionOverride(int i10, int... iArr) {
            this.groupIndex = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            Arrays.sort(iArrCopyOf);
        }

        public boolean containsTrack(int i10) {
            for (int i11 : this.tracks) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.tracks) + (this.groupIndex * 31);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.groupIndex);
            parcel.writeInt(this.tracks.length);
            parcel.writeIntArray(this.tracks);
        }

        public SelectionOverride(Parcel parcel) {
            this.groupIndex = parcel.readInt();
            int i10 = parcel.readByte();
            this.length = i10;
            int[] iArr = new int[i10];
            this.tracks = iArr;
            parcel.readIntArray(iArr);
        }
    }
}
